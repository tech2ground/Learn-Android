<?php 
	define('HOST','mysql.hostinger.in');

	define('USER','u218522661_user');

	define('PASS','rahul123');

	define('DB','u218522661_ram');


	 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');



	
	if($_SERVER['REQUEST_METHOD']=='POST'){

	$username = $_POST['email'];
		
	$password = $_POST['password'];


	$sql = "SELECT * FROM signup WHERE email='$username' AND password='$password'";

	
	$result = mysqli_query($con,$sql);

	$check = mysqli_fetch_array($result);

	
	if(isset($check))
	{

	echo "success";

	}
	else{

	echo "failure";

	}

		mysqli_close($con);

	}