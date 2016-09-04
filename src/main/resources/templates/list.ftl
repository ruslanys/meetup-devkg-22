<html>

<head>
    <title>Meetup :: Dev.KG</title>
</head>
<body>

<table>
    <tr>
        <th>ID</th>
        <th>EMAIL</th>
    </tr>
    <#list users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.email}</td>
    </tr>
    </#list>
</table>

</body>
</html>