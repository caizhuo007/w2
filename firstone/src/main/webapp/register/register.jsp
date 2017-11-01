<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<!doctype html>

<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title></title>

    
    <script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
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
            <dt>注册一个账户</dt>
            <dd>注意填写真实的手机号码以接收信息以及忘记密码功能。
            </dd>
        </dl>
    </section>

    <section>

        <form action="#" id="newUserForm">
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" type="text" id="phone_number" name='phone_number'
                   value="<%= request.getParameter("phone_number") == null ? "": request.getParameter("phone_number")%>">
            <label class="mdl-textfield__label" for="phone_number">Phone number...</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" id="password" name='password' type="password"
                   value="<%= request.getParameter("password") == null ? "": request.getParameter("password")%>">
            <label class="mdl-textfield__label" for="password">Password...</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" id="password2" type="password"
                   value="<%= request.getParameter("password") == null ? "": request.getParameter("password")%>">
            <label class="mdl-textfield__label" for="password2">Repeat your password...</label>
          </div>
            <span class="errormessage">
                <%= request.getAttribute("message") == null ? "": request.getAttribute("message")%>
            </span>
        </form>

    </section>


    <section id='login-button-container'>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" onclick='submitNewUser()'>OK
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
function submitNewUser (argument) {
    var form = document.getElementById("newUserForm");
    form.action = "/createuser";
    form.method = "POST";
    form.submit();
}
</script>