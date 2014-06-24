<?php 
$page_title = "Everything - Mon compte";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
?>
<style type="text/css">
    #pub{
        display: none;
    }
    #text_pub{
        display: none;
    }
</style>
<div id="">
    <div id="">
        <h3 align="center">Mes informations personnelles</h3>
        
        <div id="split_page_2"></div>
        
        <form method="post" action="fragments/traitements/trait_modif.php">
            <table id="table" align="center">
                <tr>
                    <td><label> Prénom : </label></td>     
                    <td><input id="nom" type="text"  name="prenom" value="<?php echo $_SESSION['prenom']; ?>"/></td>
                </tr>
                <tr>
                    <td><label> Nom : </label></td>     
                    <td><input id="nom" type="text"  name="nom" value="<?php echo $_SESSION['nom']; ?>"/></td>
                </tr>
                <tr>
                    <td><label> Mot de passe : </label></td>     
                    <td><input id="nom" type="text"  name="mdp" value=""/></td>
                </tr>
                <tr>
                    <td><label> Confirmation Mot de passe : </label></td>     
                    <td><input id="nom" type="text" name="mdp" value=""/></td>
                </tr>
                <tr>
                    <td><label> Adresse e-mail : </label></td>     
                    <td> <input id="mail" type="email" name="mail"  value="<?php echo $_SESSION['email']; ?>"/></td>
                </tr>          
            </table>
            <p align="center"><input type="submit" value="Valider"><input type="reset" name="reset" VALUE=" Annuler "></p> 
        </form>
    </div>
</div>

<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>


