<?php

function requete($requete, $select = false){
	$server = 'mysql:host=localhost';
	$bdd = 'dbname=everything';
	$user= 'everything';
	$mdp= 'secret';
	$monPdoEverything = null;
	$pdo = new PDO($server.';'.$bdd, $user, $mdp);
	$pdo->query("SET CHARACTER SET utf8");
	if($select == true){
		$result = $pdo->query($requete);
		$result = $result->fetchAll();
	}else{
		$result = $pdo->exec($requete);
	}
	return $result;
}
?>