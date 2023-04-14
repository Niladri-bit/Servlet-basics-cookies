<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP PAGE</title>

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card-content">
					<h3>Register here</h3>
					
					<div class="form" id="myform">
						<form action="newRegister" method= "post">
							<input type="text" name="user_name" placeholder="enter username"/>
							<input type="password" name="user_password" placeholder="enter password"/>
							<input type="email" name="user_email" placeholder="enter email"/>
							<button type="submit" class="btn">Submit</button>
						</form>
					</div>
					<div class="loader center-align" style="display:none">
						  <div class="preloader-wrapper big active">
    						<div class="spinner-layer spinner-blue-only">
      							<div class="circle-clipper left">
        							<div class="circle"></div>
      							</div>
      							<div class="gap-patch">
        							<div class="circle"></div>
      							</div>
      							<div class="circle-clipper right">
        							<div class="circle"></div>
      							</div>
    						</div>
  						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
  src="https://code.jquery.com/jquery-3.6.4.min.js"
  integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
  crossorigin="anonymous"></script> 
  
  <script >
  console.log('hekl');
  	$("#myform").on('submit',function(event){
  		event.preventDefault();
  		var f = $(this).serialize();
  		$.ajax({
  			url:"newRegister",
  			data:f,
  			type:'POST',
  			success:function(data,testStatus,jqXHR){
  				console.log(data);
  				console.log("success");
  			}
  		}),
  		error:function(jqXHR,textStatus,errorThrown){
  			console.log(data);
				console.log("error");
  		}
  	})
  </script>
</body>
</html>