<?php
require_once 'db.php';
require_once 'modele.php';

supprimerModele($_GET['id']);

header("Location: ../../admin_modele.php");

?>