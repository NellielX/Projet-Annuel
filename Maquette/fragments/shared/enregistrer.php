<?php

require_once $_SERVER['DOCUMENT_ROOT'].'/Maquette/fragments/traitements/db.php';
require_once $_SERVER['DOCUMENT_ROOT'].'/Maquette/fragments/traitements/inscrit.php';

$pseudo = $_POST['login'];
$prenom= $_POST['prenom'];
$nom = $_POST['nom'];
$mdp = $_POST['password1'];
$confirm_mdp = $_POST['password2'];
$mail = $_POST['mail'];

$id_max = showUsersMax();
creerUtilisateur($id_max, $pseudo, $prenom, $nom, $mdp, $mail);

?>
<script type="text/javascript">
    alert("Vous etes maintenant enregistre. Vous pouvez des a present vous connecter sur le site");
    window.location.replace("http://localhost/Maquette/index.php");
</script>
