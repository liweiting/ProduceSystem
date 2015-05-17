<%--
  Created by IntelliJ IDEA.
  User: liweiting
  Date: 15-5-14
  Time: 下午11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>添加书籍</title>
    <script type="text/javascript">
      function reg()
      {
        var name= $("#name").val();
        var price= document.getElementById("price");
        var productor= document.getElementById("productor");
        var type= document.getElementById("type");
        if(name.equls("")){
          alert("请输入书名！");
        }
        if(price==""){
          alert("请输入价格！");
        }
        if(productor==""){
          alert("请选择出版社！");
        }
        if(type==""){
          alert("请选择书籍类型！");
        }
        var reg=/^[0-9]+$/;
        var result= reg.test(price.value);
        if(!result)
        {alert("请输入数字！");
          price.value="";
        }
      }
    </script>
  </head>
  <body>
        <h1>添加书籍</h1>
        <form action="/addBook.do?flag=addBook"  method="post">
          <table>
            <tr>
              <td>书名:</td><td><input id="name" type="text" name="name" onchange="reg()"/> </td>
            </tr>
            <tr>
              <td>价格:</td><td><input id="price" type="text" name="price" onchange="reg()"/> </td>
            </tr>
            <tr>
              <td>出版社:</td><td><input id="productor" type="text" name="productor" onchange="reg()"/> </td>
            </tr>
            <tr>
              <td>类型:</td><td><input id="type" type="text" name="type" onchange="reg()"/> </td>
            </tr>
            <tr>
              <td><input type="submit" vlue="添加"/> </td>
              <td><input type="reset" value="重置"/> </td>
            </tr>
          </table>
        </form>
  </body>
</html>
