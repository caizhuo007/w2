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
    <link rel="stylesheet" href="/statics/css/my.css">
</head>

<body>
<header>
    <section>
        <img src="/statics/image/logo.png"></img>
    </section>
    <section>
        <span id='account'>Welcome, <%=request.getAttribute("userName")%></span>
        <button id="demo-menu-lower-right"
                class="mdl-button mdl-js-button mdl-button--icon">

          <i class="material-icons">menu</i>
        </button>

        <ul class="mdl-menu mdl-menu--bottom-right mdl-js-menu mdl-js-ripple-effect"
            for="demo-menu-lower-right">
          <li class="mdl-menu__item" >My Account</li>
          <li class="mdl-menu__item" onclick="logout()">Sign out</li>
        </ul>
    </section>
</header>

<!-- Right aligned menu below button -->

<div class='content'>
    <section>
        <dl class='auto-title-content'>
            <dt>Your account information</dt>
            <dd>以下是您的账户信息以及正在使用的产品信息，如果您有任何问题，请给我<a href='mymessage.jsp'>留言</a>.
            </dd>
        </dl>
    </section>

    <section>
          <dl>
            <dt>Account name</dt>
            <dd> <%=request.getAttribute("userName")%></dd>
          </dl>
          <dl>
            <dt>Product</dt>
          </dl>

          <table class="mdl-data-table">
              <thead>
                <tr>
                  <th class="mdl-data-table__cell--non-numeric">Material</th>
                  <th>Quantity</th>
                  <th>Unit price</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td class="mdl-data-table__cell--non-numeric">Acrylic (Transparent)</td>
                  <td>25</td>
                  <td>$2.90</td>
                </tr>
                <tr>
                  <td class="mdl-data-table__cell--non-numeric">Plywood (Birch)</td>
                  <td>50</td>
                  <td>$1.25</td>
                </tr>
                <tr>
                  <td class="mdl-data-table__cell--non-numeric">Laminate (Gold on Blue)</td>
                  <td>10</td>
                  <td>$2.35</td>
                </tr>
              </tbody>
          </table>

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
    function logout (argument) {
        window.location.href="/logout";
    }
</script>