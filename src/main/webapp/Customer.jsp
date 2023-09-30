<%@ page import="tuan2.edu.models.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="tuan2.edu.Services.CustomerService" %>
<%@ page import="tuan2.edu.Services.ipml.CustomerServiceIPML" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 29/09/2023
  Time: 3:04 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Customer</title>
</head>
<body>
<style>
    table, th, td {
        border:1px solid black;

    }
    table tr:hover {
        background-color: #f2f2f2; /* Màu nền khi hover */
        font-weight: bold; /* Đặt font in đậm khi hover */
        cursor: pointer; /* Thay đổi con trỏ chuột thành bàn tay khi hover */
    }
    table tr.selected {
        background-color: #007bff; /* Màu nền khi được chọn */
        color: #fff; /* Màu văn bản khi được chọn */
    }
    /* CSS để thiết lập các nút cân bằng */
    .balance-button {
        width: 100px;
        height: 40px;
        margin: 10px;
        font-size: 16px;
    }
</style>
<h1> Bang du lieu admin dieu khien </h1>
<table style="width:100% ">
    <thead>
    <tr>
        <th>Customer_id</th>
        <th>Customer_name</th>
        <th>Email</th>
        <th>Phone</th>
        <th>Address</th>
        <th colspan="2">Address</th>


    </tr>
    </thead>
    <tbody>
    <%CustomerService service = new CustomerServiceIPML();%>
    <%List<Customer> customerList= service.getAllObject();%>
    <% for (Customer customer : customerList) {
        String delete ="ControllerServlet?action=delete&id="+customer.getCust_id();
        String update ="ControllerServlet?action=update&id="+customer.getCust_id();
    %>
    <tr>
        <td><%= customer.getCust_id() %></td>
        <td><%= customer.getCust_name() %></td>
        <td><%= customer.getEmail() %></td>
        <td><%= customer.getPhone() %></td>
        <td><%= customer.getAddress() %></td>


        <td><a href=<%=delete%>>Delete</a></td>
        <td><a href=<%=update%>>Update</a></td>



    </tr>
    <% } %>

    </tbody>
    <tfoot>
    <!-- Nút cân bằng 1 -->
    <button class="balance-button " ><a href="InsertCustomer.jsp">Insert</a> </button>

    <!-- Nút cân bằng 2 -->
    <button class="balance-button" id="balance-button-2">Xóa </button>

    <!-- Nút cân bằng 3 -->
    <button class="balance-button" id="balance-button-3">Sửa</button>

    <!-- Nút cân bằng 4 -->
    <button class="balance-button" id="balance-button-4">Tiềm kiếm </button>
    </tfoot>
</table>
</body>
</html>
