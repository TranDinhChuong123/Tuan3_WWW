<%--
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
<%--    long emp_id, String full_name, String dob, String email, String phone, String address, EmployeeStatus status--%>
    <h2>Customer Information</h2>
    <form action ="ControllerServlet?action=insert_empl" method="post">

        <div class="form-group">
            <label for="full_name">Full_Name:</label>
            <input type="text" id="full_name" name="full_name" required>
        </div>
        <div class="form-group">
            <label for="dob">Dob:</label>
            <input type="text" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="phone">Phone:</label>
            <input type="tel" id="phone" name="phone" required>
        </div>
        <div class="form-group">
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>
        </div>
        <div class="form-group">
            <label for="dropdown">Status:</label>
            <select id="dropdown" name="status">
                <option value="1"> WORKING</option>
                <option value="0">ON_LEAVE</option>
                <option value="-1">RESIGNED</option>
            </select>
        </div>

        <button type="submit"  class="btn-submit">Submit</button>
    </form>
</div>
</body>
</html>
