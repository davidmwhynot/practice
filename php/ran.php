<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://bootswatch.com/4/cyborg/bootstrap.css">
	<title>Random</title>
</head>
<body>



<div class="container">

	<div class="jumbotron">
		<h1>Random</h1>
		<?php
		echo bin2hex(random_bytes(64));
		?>
	</div>

</div>


</body>
</html>
