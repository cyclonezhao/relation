<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Border Table</title>
    <style>
        /* 添加一些基本的样式来美化表格 */
        table {
            border-collapse: collapse;
            width: 100%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <table>
        <#list nodeList as node>
            <tr>
                <td>${node.number}</td>
            </tr>
        </#list>
    </table>
</body>
</html>