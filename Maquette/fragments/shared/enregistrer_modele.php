<?php

require_once $_SERVER['DOCUMENT_ROOT'].'/Maquette/fragments/traitements/db.php';
require_once $_SERVER['DOCUMENT_ROOT'].'/Maquette/fragments/traitements/modele.php';

$nom = $_POST['nom'];
$date = $_POST['date'];
$url= $_POST['url'];

var_dump($nom);
var_dump($date);
var_dump($url);

$id_max_modele = showModeleMax();
var_dump($id_max_modele);


//$chemin = "download/modele/".$url; 
//move_uploaded_file($HTTP_POST_FILES["file"]["tmp_name"],$chemin);


$url2 = $_FILES[$url]['tmp_name'];
$chemin_destination = '/download/modele/'.$url2;         
$resultat = move_uploaded_file($_FILES['icone']['name'],$chemin_destination);
if ($resultat) echo "Transfert réussi";

//$chemin2 = "download/modele/".$image; 
//move_uploaded_file($HTTP_POST_FILES["file"]["tmp_name"],$chemin2);
//
//$image=$_FILES["image"]["name"]; 
//list($name, $ext) = explode(".", $image); 
//$ext=".".$ext;
//$chemin = "./download/modele".$nom; 
//move_uploaded_file($HTTP_POST_FILES["file"]["tmp_name"],$chemin);
//$image1 = $chemin;

creerModele($id_max_modele, $nom, $description, $url, $image, $statut, $hauteur, $largeur, $longueur, $date);

?>
<script type="text/javascript">
    alert("Le modele a ete cree avec succes !");
    window.location.replace("http://localhost/Maquette/admin_modele.php");
</script>

