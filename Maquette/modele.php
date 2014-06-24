<?php 
$page_title = "Everything - Modèles";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
require_once 'fragments/traitements/db.php';
require_once 'fragments/traitements/modele.php';
?>

<div id="recherche">              
        <form method="post" action="fragments/traitements/trait_modif.php">
            <table id="table" align="left">
                <tr>
                    <td><label> Rechercher un model : </label></td>     
                    <td><input id="recherche" type="text" required="true" name="nom" value=""/></td>
                    <td><p align="center"><input type="submit" value="Rechercher"></p></td>
                    <?php if(isset($_SESSION['login'])) { ?> 
                    <td> / </td>
                    <td> Ou uploader le votre : <a href="admin_modele.php" id="urlBackoffice"> <b> ICI </b></a>   !</td>
                    <?php }?>
                </tr>        
            </table>
        </form>
</div>

<div id="page_content">
    
<?php  

$modeles = showModele();

foreach ($modeles as $unModele) {
    ?>
    
    <div id="un_modele">
        <div id="text_modele">
            <br>
            <b><?php echo $unModele['nom_modele'] ?></b>
            <table>
                <tr>
                    <td><img src="<?php echo $unModele['image_modele'] ?>" alt="Pas d'image" title="<?php echo $unModele['nom_modele'] ?>" width="100px"></td>
                    <td><?php echo $unModele['description_modele'] ?></td>    
                </tr>
            </table>
            <div id="split"></div>
            <div id="votes">
            <table>
                <tr>
                    <td><b> Hauteur : <?php echo $unModele['hauteur_modele'] ?></b></td>
                    <td> / </td>
                    <td><b> Largeur : <?php echo $unModele['largeur_modele'] ?></b></td>
                    <td> / </td>
                    <td><b> Longueur : <?php echo $unModele['longueur_modele'] ?></b></td>
                    <td> / </td>
                    <td><b> Posté le : <?php echo $unModele['date_modele'] ?></b></td>
                    <td> / </td>
                    <td><a class="telecharger" href="<?php echo $unModele['url_modele'] ?>" target=""> Télécharger </a></td>
                </tr>
            </table>
            </div>
            <br>
        </div> 
    </div>
    <?php
}
?>
    
                    
               
</div>

<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>
