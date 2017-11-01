<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<!doctype html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title></title>

    
    <script src="/statics/js/material.min.js"></script>
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
    <!-- Page styles -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="/statics/css/material.min.css">
    <link rel="stylesheet" href="/statics/css/common.css">
    <link rel="stylesheet" href="/statics/css/login.css">
</head>

<body>
<header>
    <img src="/statics/image/logo.png"></img>
</header>

<div class='content'>
    <section>
        <dl class='auto-title-content'>
            <dt>登录您的账户</dt>
            <dd>输入您手机号和密码</dd>
        </dl>
    </section>

    <section>

        <form action="#" id="loginForm">
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" type="text" id="sample1" name="userName"
                   value="<%= request.getParameter("userName") == null ? "": request.getParameter("userName")%>">
            <label class="mdl-textfield__label" for="sample1">Phone number...</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" type="password" id="sample2" name="password"
                   value="<%= request.getParameter("password") == null ? "": request.getParameter("password")%>">
            <label class="mdl-textfield__label" for="sample2">Password...</label>
          </div>
            <span class="errormessage">
                <%= request.getAttribute("message") == null ? "": request.getAttribute("message")%>
            </span>
        </form>

    </section>


    <section id='login-button-container'>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" onclick='submitlogin()'>OK
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
    function submitlogin (argument) {
        var form = document.getElementById("loginForm");
        form.action = "/dologin";
        form.method = "POST";
        form.submit();
    }

</script>