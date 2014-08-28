<?php 
$page_title = "Everything - Modèles";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
require_once 'fragments/traitements/db.php';
require_once 'fragments/traitements/modele.php';
?>

<style type="text/css">
#page {
	height: 1500px;
}
</style>

<div id="recherche">              
        <form method="post" action="fragments/traitements/trait_modif.php">
            <table id="table" align="left">
                <tr>
                    <td><label> Rechercher une création : </label></td>     
                    <td><input id="recherche" type="text" required="true" name="nom" value=""/></td>
                    <td><p align="center"><input type="submit" value="Rechercher"></p></td>
                    <?php if(isset($_SESSION['login'])) { ?> 
                    <td> / </td>
                    <td> Ou uploader la votre : <a href="admin_modele.php" id="urlBackoffice"> <b> ICI </b></a>   !</td>
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
                    <td><img id="images_upload" src="<?php echo $unModele['image_modele'] ?>" alt="Pas d'image" title="<?php echo $unModele['nom_modele'] ?>" width="100px"></td>
                </tr>
            </table>
            <div id="split"></div>
            <div id="votes">
            <table>
                <tr>
                     <?php $nomInscrit = trouverCreateur($unModele['id_inscrit']); ?>
                     <td><b> Posté le : <?php echo $unModele['date_modele'] ?> par <font color="green"><u><?php echo $nomInscrit[0][0] ?></u></font></b></td>
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
