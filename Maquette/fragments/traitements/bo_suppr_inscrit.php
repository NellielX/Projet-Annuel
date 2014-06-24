<?php
require_once 'db.php';
require_once 'inscrit.php';

supprimerUtilisateur($_GET['id']);

header("Location: ../../backoffice.php");

?>