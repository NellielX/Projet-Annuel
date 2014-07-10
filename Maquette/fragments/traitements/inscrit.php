<?php

require_once 'db.php';

/* La fonction requete prends deux paramètre:
        $requete : La requete en SQL
        $select : true si c'est un select, false dans le cas contraire
*/

function creerUtilisateur($id_max, $pseudo, $prenom, $nom, $mdp, $mail){
    return requete("insert into inscrit(id_inscrit, pseudo_inscrit, prenom_inscrit, nom_inscrit, mail_inscrit, mdp_inscrit, type_compte) values('".$id_max."','".addslashes($pseudo)."','".addslashes($prenom)."','".addslashes($nom)."','".addslashes($mail)."','".addslashes($mdp)."',1)");
}

//function seLoguer($username, $mdp){
//    return requete("select * from inscrit where pseudo_inscrit = '".addslashes($username)."' and mdp_inscrit = md5('".addslashes($mdp)."')",true);
//}

function seLoguer($username, $mdp){
    return requete("select * from inscrit where pseudo_inscrit = '".addslashes($username)."' and mdp_inscrit = '".addslashes($mdp)."'",true);
}

function showUsers(){
    return requete("select * from inscrit where type_compte = 1", true);
}

function showUsersMax(){
    return requete("select MAX(id_inscrit)+1 from inscrit", true);
}

function infoUser($num_inscrit){
    return requete("select * from inscrit where id_inscrit = ".addslashes($num_inscrit),true);
}

function supprimerUtilisateur($id_inscrit){
    return requete("delete from inscrit where id_inscrit = ".addslashes($id_inscrit));
}

function modifierUtilisateur($num_inscrit, $nom, $prenom, $mail, $mdp){
    return requete("update inscrit set nom_inscrit ='".addslashes($nom)."', prenom_inscrit ='".addslashes($prenom)."', mail_inscrit ='".addslashes($mail)."', mdp_inscrit = '".addslashes($mdp)."' where id_inscrit = ".addslashes($num_inscrit));
}

function verifLogin($username){
    return requete("select count(*) from inscrit where pseudo_inscrit = '" . addslashes($username) . "'", true);
}

?>