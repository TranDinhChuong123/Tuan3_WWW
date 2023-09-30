<%@ page import="tuan2.edu.models.Customer" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 29/09/2023
  Time: 3:09 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    /* CSS để tạo giao diện form */
    body {
        font-family: Arial, sans-serif;
    }

    .container {
        max-width: 400px;
        margin: 0 auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }

    .form-group {
        margin-bottom: 15px;
    }

    label {
        display: block;
        font-weight: bold;
    }

    input[type="text"],
    input[type="email"],
    input[type="tel"] {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
    }

    .btn-submit {
        background-color: #007BFF;
        color: #fff;
        border: none;
        padding: 10px 20px;
        cursor: pointer;
    }
</style>
</head>
<body>
<div class="container">
    <h2>Customer Information</h2>
    <%Customer customer = (Customer) session.getAttribute("customer");
        String update ="ControllerServlet?action=update1&id="+customer.getCust_id();
    %>

    <form action =<%=update%> method="post">
        <div class="form-group">
            <label for="cust_name">Customer Name:</label>
            <input type="text" id="cust_name" name="cust_name" value="<%=customer.getCust_name()%>" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" value="<%=customer.getEmail()%>" name="email" required>
        </div>
        <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="tel" id="phone" value="<%=customer.getPhone()%>"  name="phone" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" id="address" value="<%=customer.getAddress()%>"  name="address" required>
        </div>
        <button type="submit"  class="btn-submit">Update</button>
    </form>
</div>
</body>
</html>
