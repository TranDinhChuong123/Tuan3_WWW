<%@ page import="tuan2.edu.models.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="tuan2.edu.Services.CustomerService" %>
<%@ page import="tuan2.edu.Services.ipml.CustomerServiceIPML" %>
<%@ page import="tuan2.edu.models.Employee" %>
<%@ page import="tuan2.edu.Services.EmployeeService" %>
<%@ page import="tuan2.edu.Services.ipml.EmployeeServiceIPML" %><%--
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
        <th>emp_id</th>
        <th>full_name</th>
        <th>dob</th>
        <th>email</th>
        <th>phone</th>
        <th>address</th>
        <th>status</th>
        <th colspan="2"><a href="InsertEmployee.jsp">Insert</a></th>


    </tr>
    </thead>
    <tbody>
    <%EmployeeService service = new EmployeeServiceIPML();%>
    <%List<Employee> employeeList= service.getAllObject();%>
    <% for (Employee employee : employeeList) {
        String delete ="ControllerServlet?action=delete_empl&id="+employee.getEmp_id();
        String update ="ControllerServlet?action=update_empl&id="+employee.getEmp_id();
    %>
    <tr>
        <td><%= employee.getEmp_id() %></td>
        <td><%= employee.getFull_name() %></td>
        <td><%= employee.getDob() %></td>
        <td><%= employee.getEmail() %></td>
        <td><%= employee.getPhone() %></td>
        <td><%= employee.getAddress() %></td>
        <td><%= employee.getStatus().getDescription()%></td>



        <td><a href=<%=delete%>>Delete</a></td>
        <td><a href=<%=update%>>Update</a></td>



    </tr>
    <% } %>

    </tbody>

</table>
</body>
</html>
