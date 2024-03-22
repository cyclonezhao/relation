<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relation</title>
    <style>
        /* 横向工具栏样式 */
        .toolbar {
            background-color: #f0f0f0;
        }

        /* 超链接样式 */
        .toolbar a {
            text-decoration: none; /* 去除下划线 */
        }
    </style>
</head>
<body>
    <span>分类：</span>
    <select id="category">
        <#list indexVO.categoryList as category>
            <option value="${category.id}">${category.name}</option>
        </#list>
    </select>

    <div class="toolbar">
        <!-- 横向工具栏项目 -->
        <a id="toNodeList" href="#">新增</a>
        <a href="#">修改</a>
        <a href="#">删除</a>
    </div>

    <script>
        // 获取下拉列表元素和输入元素
        var categorySelectElement = document.getElementById("category");
        var toNodeList = document.getElementById("toNodeList");

        // 类型下拉框发生变化，填充添加节点的分类输入
        categorySelectElement.addEventListener("change", function() {
            // 获取当前选中的值
            var selectedValue = categorySelectElement.value;
            // 将值设置为输入元素的值
            toNodeList.href = "nodeList?categoryId=" + selectedValue;
        });
    </script>
</body>
</html>