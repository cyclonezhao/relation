<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>节点列表</title>
    <style>
        /* 添加一些基本的样式来美化表格 */
        table {
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 3px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<div>添加节点：</div>
<form action="/relation/addNode" method="post">
    <label for="number">标识:</label><br>
    <input type="text" id="number" name="number" required><br>
    <label for="description">描述:</label><br>
    <input type="text" id="description" name="description" required><br>
    <input value="${nodeListVO.categoryId}" style="display: none" id="nodeCategoryId" type="text" id="categoryId" name="categoryId" required>

    <input type="submit" value="Submit">
</form>
<div class="toolbar">
    <!-- 横向工具栏项目 -->
    <a href="javascript:void(0);" onclick="deleteNodes()">删除</a>
</div>
<table id="nodeList">
    <thead>
    <tr>
        <th></th>
        <th style="display: none;">ID</th>
        <th>序号</th>
        <th>标识</th>
        <th>描述</th>
    </tr>
    </thead>
    <tbody>
    <#list nodeListVO.nodeList as node>
        <tr>
            <td><input type="checkbox" name="select"></td>
            <td style="display: none;">${node.id}</td>
            <td>${node_index + 1}</td>
            <td>${node.number}</td>
            <td>${node.description}</td>
        </tr>
    </#list>
    </tbody>
</table>
<script type="text/javascript">
    function getSelectedIds() {
        var table = document.getElementById("nodeList");
        var tbody = table.getElementsByTagName("tbody")[0];
        var rows = tbody.getElementsByTagName("tr");
        var selectedIds = [];

        for (var i = 0; i < rows.length; i++) {
            var checkBox = rows[i].getElementsByTagName("input")[0]; // 获取每行的复选框
            var idCell = rows[i].getElementsByTagName("td")[1]; // 获取每行的隐藏列

            // 检查复选框是否被选中
            if (checkBox.checked) {
                selectedIds.push(idCell.textContent);
            }
        }

        return selectedIds;
    }

    function deleteNodes(){
        let ids = getSelectedIds();

        var searchParams = new URLSearchParams( window.location.search);
        var categoryId = searchParams.get("categoryId");

        let url = "deleteNodes?categoryId=" + categoryId + "&ids=" + ids.join(",");
        window.location.href = url;
    }
</script>
</body>
</html>