<?php
	session_start();
	$_SESSION = array();
	var_dump($_SESSION);
	header('Location: ../../index.php');
?>