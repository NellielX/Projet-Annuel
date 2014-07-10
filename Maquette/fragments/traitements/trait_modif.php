<?php
session_start();

require_once 'db.php';
require_once 'inscrit.php';

$nom = $_POST['nom'];
$prenom = $_POST['prenom'];
$mail = $_POST['mail'];
$mdp = $_POST['mdp'];
$id = $_SESSION['id'];

modifierUtilisateur($id, $nom, $prenom, $mail, $mdp);

$_SESSION['nom'] = $_POST['nom'];
$_SESSION['prenom'] = $_POST['prenom'];

header("Location: ../../compte.php");

?>