
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Game project edit</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@2.0.7/css/boxicons.min.css">
</head>
<body>

<jsp:include page="header.jsp"/>

<div class="jumbotron">
  <div class="container text-center">
    <h1>Project edit
      <small class="text-muted">#${gameProject.id}</small>
    </h1>
  </div>

</div>
	<div class="container mt-5">
	<a href="/gameProjects-list">Go back</a>
      <form:form method="POST"
                  action="/gameProject-edit" modelAttribute="gameProject">

        <div class="form-group">
          <form:input type="hidden" path="id" class="form-control"/>
        </div>

        <div class="form-group">
        	<form:label path="title" >Title</form:label>
        	<form:input path="title" class="form-control"/>
        </div>

        <div class="form-group">
        	<form:label path="shortDescription" >Short description</form:label>
        	<form:input path="shortDescription" class="form-control"/>
        </div>

        <div class="form-group">
        	<form:label path="longDescription" >Long description</form:label>
        	<form:textarea path="longDescription" class="form-control" rows="3"/>
        </div>

        <div class="form-group">
        	<form:label path="gameUrl" >Game URL</form:label>
        	<form:input path="gameUrl" class="form-control"/>
        </div>

        <fieldset class="form-group">

          <legend>Picture URLs</legend>

          <div class="form-group">

            <div class="form-group">
              <form:input path="picture1Url" class="form-control" placeholder="Picture 1 URL"/>
            </div>

            <div class="form-group">
              <form:input class="form-control" path="picture2Url" placeholder="Picture 2 URL"/>
            </div>

            <div class="form-group">
              <form:input class="form-control" path="picture3Url" placeholder="Picture 3 URL"/>
            </div>

          </div>
        </fieldset>

        <div class="form-group">
        	<form:label path="iconUrl" >Icon URL</form:label>
        	<form:input path="iconUrl" class="form-control"/>
        </div>

        <button type="submit" class="btn btn-primary">Save</button>
      </form:form>
    </div>










		</div>
	</div>
</div>


</body>


</html>
