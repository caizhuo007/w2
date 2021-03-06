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
    <link rel="stylesheet" href="/statics/css/index.css">
</head>

<body>
<header>
    <img src="/statics/image/logo.png"></img>
</header>

<div class='content'>
    <section>
        <dl class='auto-title-content'>
            <dt>中华人民共和国国歌</dt>
            <dd>国歌，是表现一个国家民族精神的歌曲，是被政府和人民认为能代表该国家政府和人民意志的乐曲，是用来歌颂与鼓励一个民族的信心与凝聚力的。一般来说它们都会带有...
                其他含义
            </dd>
        </dl>
    </section>

    <img src='/statics/image/connection3.jpg'></img>

    <section id='login-button-container'>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" onclick="gotoLoginPage()"> Signin
        </button>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" onclick='gotoRegisterPage()'>Signup
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
function gotoRegisterPage (argument) {
    window.location.href="/register/register.jsp";
}

function gotoLoginPage (argument) {
    window.location.href="/login/login.jsp";
}

</script>