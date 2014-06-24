<?php 
$page_title = "Everything - Inscription";
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
        <h3 align="center">Inscription</h3>
        
        <div id="split_page_2"></div>
        
        <form method="post" action="fragments/shared/enregistrer.php">
            <table id="table" align="center">
                <tr>
                    <td><label> Nom de compte :  </label></td>     
                    <td><input id="nom" type="text" required="true" name="login" value=""/></td>
                </tr>
                <tr>
                    <td><label> Prénom :  </label></td>     
                    <td><input id="nom" type="text" required="true" name="prenom" value=""/></td>
                </tr>
                <tr>
                    <td><label> Nom :  </label></td>     
                    <td><input id="nom" type="text" required="true" name="nom" value=""/></td>
                </tr>
                <tr>
                    <td><label> Mot de passe : </label></td>     
                    <td><input id="nom" type="password" required="true" name="password1" value=""/></td>
                </tr>
                <tr>
                    <td><label> Confirmation Mot de passe : </label></td>     
                    <td><input id="nom" type="password" required="true" name="password2" value=""/></td>
                </tr>
                <tr>
                    <td><label> Adresse e-mail : </label></td>     
                    <td> <input id="mail" type="email" name="mail" required="true" value=""/></td>
                </tr>  
           </table>
           
            <p align="center"><input type="submit" value="Valider"><input type="reset" name="reset" VALUE=" Annuler "></p> 
        
        </form>
    </div>
</div>

<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>
