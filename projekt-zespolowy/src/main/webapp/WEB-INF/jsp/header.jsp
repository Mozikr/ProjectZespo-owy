<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="/">Portfolio</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="/">Home</a></li>
        <li><a href="/about">About</a></li>
        <li><a href="/gameProjects-list">Projects</a></li>
        <li><a href="/contact">Contact</a></li>
      </ul>

      <ul class="nav navbar-nav navbar-right">
        <sec:authorize access="!isAuthenticated()">
                      <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                      <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        </sec:authorize>
      </ul>

    </div>
  </div>
</nav>

<div class="icon-bar">
  <a href="#" class="facebook"><i class="fa fa-facebook"></i></a>
  <a href="#" class="twitter"><i class="fa fa-twitter"></i></a>
  <a href="#" class="google"><i class="fa fa-google"></i></a>
  <a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a>
  <a href="#" class="youtube"><i class="fa fa-youtube"></i></a>
</div>
