<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加书籍</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style>
        form{
            border: 1px solid red;
            align-content: center;
        }
    </style>
    <script>

        window.onload=function () {
            if (${add}){
                alert(${add})
            }
            document.getElementById("bookForm").onsubmit=function () {
                var name = document.getElementById("name");
                if (name.value == null) {
                    alert("书籍名称不能为空")
                    return false;
                }
                var author = document.getElementById("author");
                if (author.value == null) {
                    alert("作者名称不能为空")
                    return false;
                }
                var time = document.getElementById("time");
                if (time.value == null) {
                    alert("出版时间不能为空")
                    return false;
                }
                var type = document.getElementById("type");
                if (type.value == null) {
                    alert("书籍类型不能为空")
                    return false;
                }
            }
        }
    </script>
</head>
<body>
<div class="container" style="max-width: 400px">
    <h2>添加书籍</h2>
    <form action="/Test/addBookServlet" method="post" id="bookForm">
        <div class="form-group">
            <label for="name">图书名称</label>
            <input type="text" name="name" id="name" class="form-control" placeholder="请输入书籍名称"/>
        </div>
        <div class="form-group">
            <label for="name">图书作者</label>
            <input type="text" name="author" id="author" class="form-control" placeholder="请输入作者"/>
        </div>
        <div class="form-group">
            <label for="name">购买日期</label>
            <input type="date" name="time" id="time"  class="form-control" placeholder="请输入购买日期"/>
        </div>
        <div class="form-group">
            <label for="name">图书类别</label>
            <select name="type" id="type" class="form-control">
                <option value="0">--请选择--</option>
                <option value="1">计算机</option>
                <option value="2">小说</option>
                <option value="3">杂项</option>
            </select>
        </div>
        <div style="text-align: center;">
            <input type="submit" id="sub" value="增加图书" class="btn btn-success"/>
        </div>
    </form>
</div>
</body>
</html>

