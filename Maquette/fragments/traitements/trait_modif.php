<?php
session_start();

require_once 'db.php';
require_once 'inscrit.php';

modifierUtilisateur($_SESSION['id'], $_POST['nom'], $_POST['prenom'], $_POST['mail']);

$_SESSION['nom'] = $_POST['nom'];
$_SESSION['prenom'] = $_POST['prenom'];
$_SESSION['email'] = $_POST['mail'];

header("Location: ../../compte.php");

?>