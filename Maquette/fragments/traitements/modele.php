<?php

require_once 'db.php';

/* La fonction requete prends deux paramètre:
        $requete : La requete en SQL
        $select : true si c'est un select, false dans le cas contraire
*/

function creerModele($id_max_modele, $nom, $description, $url, $image, $statut, $hauteur, $largeur, $longueur, $date){
    return requete("insert into modele(id_modele, nom_modele, url_modele, image_modele, date_modele, id_inscrit) 
    values('".$id_max_modele."','".addslashes($nom)."','".addslashes($url)."','".addslashes($image)."','".$date."',3)");
}

function showModele(){
    return requete("select * from modele", true);
}
function showModeleMax(){
    return requete("select MAX(id_modele)+1 from modele", true);
}

function infoModele($num_modele){
    return requete("select * from modele where id_modele = ".addslashes($num_modele),true);
}

function supprimerModele($id_modele){
    return requete("delete from modele where id_modele = ".addslashes($id_modele));
}

function trouverCreateur($id_inscrit){
    return requete("select pseudo_inscrit from inscrit where id_inscrit = ".$id_inscrit , true);
}

?>
