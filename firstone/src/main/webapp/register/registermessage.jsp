<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<!doctype html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title></title>

    
    <!-- Page styles -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="/statics/css/material.min.css">
    <link rel="stylesheet" href="/statics/css/common.css">
    <link rel="stylesheet" href="/statics/css/register.css">
</head>

<body>
<header>
    <img src="/statics/image/logo.png"></img>
</header>

<div class='content'>
    <section>
        <dl class='auto-title-content'>
            <dt>注册信息</dt>
            <dd>以下是您的注册信息，请妥善保存.
            </dd>
        </dl>
    </section>

    <section>
        
          <dl>
            <dt>Account name</dt>
            <dd><%=request.getAttribute("userName")%></dd>
          </dl>
          <dl>
            <dt>Password</dt>
            <dd><%=request.getAttribute("userPassword")%></dd>
          </dl>

    </section>


    <section id='login-button-container'>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" onclick="gotoMypage()">OK
        </button>
    </section>

</div>

<footer>
    <div>
        <i class="material-icons">face</i>
        <i class="material-icons">build</i>
        <i class="material-icons">autorenew</i>
        <i class="material-icons">theaters</i>
    </div>

    <div>Copyright@Cybertech</div>
</footer>

</body>

</html>
<script type="text/javascript">
    function gotoMypage(argument) {
        window.location.href="/user/info";
    }
</script>