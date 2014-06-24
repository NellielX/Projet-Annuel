<?php

require_once 'inscrit.php';

$pseudo = $_POST['login'];
$mdp = $_POST['mdp'];

$user =  seLoguer($pseudo,$mdp);
//var_dump($user);
if ($user <> null){
    session_start();
    $_SESSION['id'] = $user[0]['id_inscrit'];
    $_SESSION['login'] = $user[0]['pseudo_inscrit'];
    $_SESSION['nom'] = $user[0]['nom_inscrit'];
    $_SESSION['prenom'] = $user[0]['prenom_inscrit'];
    $_SESSION['email'] = $user[0]['mail_inscrit'];
    $_SESSION['admin'] = $user[0]['type_compte'];
?>

	<script type="text/javascript">
		alert("Vous etes maintenant connecte");
		window.location.replace("http://localhost/Maquette/");
	</script>

<?php

}else{

?>

	<script type="text/javascript">
		alert("L'identifiant ou le mot de passe est incorrect");
		window.location.replace("http://localhost/Maquette/");
	</script>
<?php

}

?>