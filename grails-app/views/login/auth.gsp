<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 08/12/2023
  Time: 10:00
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Connection</title>
</head>

<body>
<h1> CONNECTION</h1>
<form class="form-signin" action="/login/authenticate" method="POST" id="loginForm" >
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input name="username" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input name="password"  type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

</form>
<h1> CREATION D'UN UTILISATEUR</h1>
<form class="form-signin" action="/CreateUser/create" method="POST" id="loginFormo">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address : </label>
        <input name="username" type="text" class="form-control" id="exampleInputEmail2" aria-describedby="emailHelp" placeholder="user name">
        <small id="emailHelp1" class="form-text text-muted">We'll never share your email with anyone else.</small>
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password : </label>
        <input name="password"  type="password" class="form-control" id="exampleInputPassword2" placeholder="password">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Email :</label>
        <input name="email"  type="email" class="form-control" id="exampleInputPassword3" placeholder="email">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>

</form>
</body>
</html>