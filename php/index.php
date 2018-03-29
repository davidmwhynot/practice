<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="https://bootswatch.com/4/cyborg/bootstrap.css">
	<link rel="stylesheet" href="style.css">
	<title>David Whynot Staging</title>
</head>
<body>


<style>
	body {
		padding: 15px;
		overflow-x: hidden;
	}
	#main {
		max-width: 800px;
		margin: 0 auto;
		overflow-x: hidden;
		text-overflow: ellipsis;
	}
</style>


<div class="container">
	<div class="jumbotron" id="main">
		<h1 class="display-4">Staging Server</h1>
		<p class="lead">For davidwhynot.me</p>
		<hr class="my-4">
		<p>Check out the links to various ongoing projects below.</p>
		<p class="lead">
			<a class="btn btn-primary btn-lg" href="#" role="button">Project</a>
		</p>
	<!-- </div>
	<div id="main"> -->
		<h1>var dumps</h1>
		<h2>headers()</h2>
		<?php
		// $file and $line are passed in for later use
		// Do not assign them values beforehand
		if (!headers_sent($file, $line))
		  {
		  echo("Location: https://www.w3schools.com/");
		  // exit;
		  // Trigger an error here
		  }
		else
		  {
		  echo "Headers sent in $file on line $line";
		  // exit;
		  }
			echo "<br />";
		?>
		<h2>$_SERVER</h2>
		<?php
			var_dump($_SERVER);
			echo '<h5>PHP_SELF</h5>';
			echo "Returns the filename of the currently executing script<br />";
			if(isset($_SERVER['PHP_SELF'])) {
				var_dump($_SERVER['PHP_SELF']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>GATEWAY_INTERFACE</h5>';
			echo "Returns the version of the Common Gateway Interface (CGI) the server is using<br />";
			if(isset($_SERVER['GATEWAY_INTERFACE'])) {
				var_dump($_SERVER['GATEWAY_INTERFACE']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_ADDR</h5>';
			echo "Returns the IP address of the host server<br />";
			if(isset($_SERVER['SERVER_ADDR'])) {
				var_dump($_SERVER['SERVER_ADDR']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_NAME</h5>';
			echo "Returns the name of the host server (such as www.w3schools.com)<br />";
			if(isset($_SERVER['SERVER_NAME'])) {
				var_dump($_SERVER['SERVER_NAME']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_SOFTWARE</h5>';
			echo "Returns the server identification string (such as Apache/2.2.24)<br />";
			if(isset($_SERVER['SERVER_SOFTWARE'])) {
				var_dump($_SERVER['SERVER_SOFTWARE']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_PROTOCOL</h5>';
			echo "Returns the name and revision of the information protocol (such as HTTP/1.1)<br />";
			if(isset($_SERVER['SERVER_PROTOCOL'])) {
				var_dump($_SERVER['SERVER_PROTOCOL']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>REQUEST_METHOD</h5>';
			echo "Returns the request method used to access the page (such as POST)<br />";
			if(isset($_SERVER['REQUEST_METHOD'])) {
				var_dump($_SERVER['REQUEST_METHOD']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>REQUEST_TIME</h5>';
			echo "Returns the timestamp of the start of the request (such as 1377687496)<br />";
			if(isset($_SERVER['REQUEST_TIME'])) {
				var_dump($_SERVER['REQUEST_TIME']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>QUERY_STRING</h5>';
			echo "Returns the query string if the page is accessed via a query string<br />";
			if(isset($_SERVER['QUERY_STRING'])) {
				var_dump($_SERVER['QUERY_STRING']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>HTTP_ACCEPT</h5>';
			echo "Returns the Accept header from the current request<br />";
			if(isset($_SERVER['HTTP_ACCEPT'])) {
				var_dump($_SERVER['HTTP_ACCEPT']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>HTTP_ACCEPT_CHARSET</h5>';
			echo "Returns the Accept_Charset header from the current request (such as utf-8,ISO-8859-1)<br />";
			if(isset($_SERVER['HTTP_ACCEPT_CHARSET'])) {
				var_dump($_SERVER['HTTP_ACCEPT_CHARSET']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>HTTP_HOST</h5>';
			echo "Returns the Host header from the current request<br />";
			if(isset($_SERVER['HTTP_HOST'])) {
				var_dump($_SERVER['HTTP_HOST']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>HTTP_REFERER</h5>';
			echo "Returns the complete URL of the current page (not reliable because not all user-agents support it)<br />";
			if(isset($_SERVER['HTTP_REFERER'])) {
				var_dump($_SERVER['HTTP_REFERER']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>HTTPS</h5>';
			echo "Is the script queried through a secure HTTP protocol<br />";
			if(isset($_SERVER['HTTPS'])) {
				var_dump($_SERVER['HTTPS']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>REMOTE_ADDR</h5>';
			echo "Returns the IP address from where the user is viewing the current page<br />";
			if(isset($_SERVER['REMOTE_ADDR'])) {
				var_dump($_SERVER['REMOTE_ADDR']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>REMOTE_HOST</h5>';
			echo "Returns the Host name from where the user is viewing the current page<br />";
			if(isset($_SERVER['REMOTE_HOST'])) {
				var_dump($_SERVER['REMOTE_HOST']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>REMOTE_PORT</h5>';
			echo "Returns the port being used on the user's machine to communicate with the web server<br />";
			if(isset($_SERVER['REMOTE_PORT'])) {
				var_dump($_SERVER['REMOTE_PORT']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SCRIPT_FILENAME</h5>';
			echo "Returns the absolute pathname of the currently executing script<br />";
			if(isset($_SERVER['SCRIPT_FILENAME'])) {
				var_dump($_SERVER['SCRIPT_FILENAME']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_ADMIN</h5>';
			echo "Returns the value given to the SERVER_ADMIN directive in the web server configuration file (if your script runs on a virtual host, it will be the value defined for that virtual host) (such as someone@w3schools.com)<br />";
			if(isset($_SERVER['SERVER_ADMIN'])) {
				var_dump($_SERVER['SERVER_ADMIN']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_PORT</h5>';
			echo "Returns the port on the server machine being used by the web server for communication (such as 80)<br />";
			if(isset($_SERVER['SERVER_PORT'])) {
				var_dump($_SERVER['SERVER_PORT']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SERVER_SIGNATURE</h5>';
			echo "Returns the server version and virtual host name which are added to server-generated pages<br />";
			if(isset($_SERVER['SERVER_SIGNATURE'])) {
				var_dump($_SERVER['SERVER_SIGNATURE']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>PATH_TRANSLATED</h5>';
			echo "Returns the file system based path to the current script<br />";
			if(isset($_SERVER['PATH_TRANSLATED'])) {
				var_dump($_SERVER['PATH_TRANSLATED']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SCRIPT_NAME</h5>';
			echo "Returns the path of the current script<br />";
			if(isset($_SERVER['SCRIPT_NAME'])) {
				var_dump($_SERVER['SCRIPT_NAME']);
			} else {
				echo "NOT SET <br />";
			}
			echo '<h5>SCRIPT_URI</h5>';
			echo "Returns the URI of the current page<br />";
			if(isset($_SERVER['SCRIPT_URI'])) {
				var_dump($_SERVER['SCRIPT_URI']);
			} else {
				echo "NOT SET <br />";
			}
		?>
		<h2>$_REQUEST</h2>
		<?php
			var_dump($_REQUEST);

		?>
		<h2>$_POST</h2>
		<?php
			var_dump($_POST);
		?>
		<h2>$_GET</h2>
		<?php
			var_dump($_GET);
		?>
		<h2>$_FILES</h2>
		<?php
			var_dump($_FILES);
		?>
		<h2>$_ENV</h2>
		<?php
			var_dump($_ENV);
		?>
		<h2>$_COOKIE</h2>
		<?php
			var_dump($_COOKIE);
		?>
		<h2>$_SESSION</h2>
		<?php
			var_dump($_SESSION);
		?>
	</div>
</div>

</body>
</html>
