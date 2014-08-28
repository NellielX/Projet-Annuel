<?php 
$page_title = "Everything - Gestion modèle";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
require_once 'fragments/traitements/db.php';
require_once 'fragments/traitements/modele.php';
?>
<style type="text/css">
    #pub{
        display: none;
    }
    #text_pub{
        display: none;
    }
</style>
<?php if(isset($_SESSION['login'])) { ?> 
<div id="">
    <div id="">
        <h3 align="center">Uploader un modèle</h3>
        
        <div id="split_page_2"></div>
        
        <form method="post" action="fragments/shared/enregistrer_modele.php">
            <table id="table" align="center">
                <tr>
                    <td><label> Nom de l'image :  </label></td>     
                    <td><input id="nom" type="text" required="true" name="nom" value=""/></td>
                </tr>
                <tr>
                    <td><label> Url de l'image :  </label></td>     
                    <td><input name="url" type="file"></td>
                </tr>
                <tr>
                    <td><label> Date de création : </label></td>     
                    <td> <input id="mail" type="date" name="date" required="true" value=""/></td>
                </tr>  
           </table>
           
            <p align="center"><input type="submit" value="Valider"><input type="reset" name="reset" VALUE=" Annuler "></p> 
        
        </form>
    </div>
</div> 
 <?php } else { ?>
     <h3 align="center">Vous devez être connecter pour uploader un modele ! </h3>
<?php
 }
?>

 <?php  
    if (isset($_SESSION['admin'])) {
        if ($_SESSION['admin'] == false) { ?>
        <br><br>
        <h3 align="center">Supprimer un modèle</h3>        
        <div id="split_page_2"></div>

        <div id="corp_validation">
            <div id="text_validation">
                                <table align="center">
                                    <tr>
                                        <th>ID</th>
                                        <th>Nom du modèle</th>
                                    </tr>
                                <?php
                                $modeles = showModele();
                                    foreach ($modeles as $modele) {
                                ?>
                                    <tr>
                                        <td><?=$modele['id_modele'] ?></td>
                                        <td><?=$modele['nom_modele'] ?></td>
                                        <td><a style="color: black; font-weight: bold; text-decoration: underline;" href="fragments/traitements/bo_suppr_modele.php?id=<?php echo $modele['id_modele'] ?>">Supprimer</a></td>
                                    </tr>

                                <?php
                                    }
                                ?>
                                </table>
                </div>
        </div>
        <?php } }?>

<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>
