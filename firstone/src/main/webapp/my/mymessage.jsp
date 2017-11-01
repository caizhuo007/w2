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
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.min.css">
    <link rel="stylesheet" href="../common.css">
    <link rel="stylesheet" href="../statics/css/my.css">
</head>

<body>
<header>
    <section>
        <img src="../images/logo.png"></img>
    </section>
    <section>
        <button id="demo-menu-lower-right"
                class="mdl-button mdl-js-button mdl-button--icon">
          <i class="material-icons">more_vert</i>
        </button>

        <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
            for="demo-menu-lower-right">
          <li class="mdl-menu__item" onclick='gotoMyPage()'>My Account</li>
          <li class="mdl-menu__item">My Message</li>
          <li class="mdl-menu__item">Sign out</li>
        </ul>
    </section>
</header>

<!-- Right aligned menu below button -->

<div class='content'>
    <section>
        <dl class='auto-title-content'>
            <dt>您的留言</dt>
            <dd></dd>
        </dl>
    </section>

    <section id='messages'>
        <!-- Icon List -->
        <style>
        .demo-list-icon {
          width: 300px;
        }
        </style>

        <ul class="demo-list-icon mdl-list">
          <li class="mdl-list__item">
            <span class="mdl-list__item-primary-content">
            <i class="material-icons mdl-list__item-icon">email</i>
            Bryan Cranston
        </span>
          </li>
          <li class="mdl-list__item">
            <span class="mdl-list__item-primary-content">
            <i class="material-icons mdl-list__item-icon">email</i>
            Aaron Paul
          </span>
          </li>
          <li class="mdl-list__item">
            <span class="mdl-list__item-primary-content">
            <i class="material-icons mdl-list__item-icon">email</i>
            Bob Odenkirk
          </span>
          </li>
        </ul>
    
    <form action="#">
          <div class="mdl-textfield mdl-js-textfield">
            <input class="mdl-textfield__input" type="text" id="sample1">
            <label class="mdl-textfield__label" for="sample1">Leave a message here...</label>
          </div>
    </form>
    </section>
    <section id='login-button-container'>
        <button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">Save
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
function gotoMyPage (argument) {
  window.location.href='my.jsp';
}</script>