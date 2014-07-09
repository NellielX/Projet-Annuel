<?php
session_start();

require_once 'db.php';
require_once 'inscrit.php';

modifierUtilisateur($_SESSION['id'], $_POST['nom'], $_POST['prenom'], $_POST['mail'], $_POST['mdp']);

$_SESSION['nom'] = $_POST['nom'];
$_SESSION['prenom'] = $_POST['prenom'];

header("Location: ../../compte.php");

?>