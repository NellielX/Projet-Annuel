<?php session_start(); ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="fr" lang="fr">
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <head>
        <title><?php echo $page_title; ?></title>
        <link rel="stylesheet" type="text/css" href="res/style.css">
        <link rel="stylesheet" type="text/css" href="res/jcarousel.basic.css">
        <script type="text/javascript" src="../Maquette/fragments/traitements/jquery.js"></script>
        <script type="text/javascript" src="../Maquette/fragments/traitements/jquery.jcarousel.min.js"></script>
        <script type="text/javascript" src="../Maquette/fragments/traitements/jcarousel.basic.js"></script>
        <script> 
            $(document).ready(function() {
                $('.full-width').horizontalNav({});
            });
        </script>
    </head>

<body>   
    <div id="page">
	<div id="content-header">
                    
            <?php if(!isset($_SESSION['login'])) { ?>
                <div id="login" align="right">
                        <form method="post" action="fragments/traitements/connexion.php">
                            <table id="table" align="right">
                                <tr>
                                    <td><label for="login"> Login : </label></td>     
                                    <td><input size="10" type="text" name="login" id="login_connexion" required/></td>
                                    <td><label> Mot de passe : </label></td>     
                                    <td><input size="10" type="password" name="mdp" id="mdp_connexion" required/></td>
                                    <td><input type="submit" name="connexion" value="Connexion"></td>
                                </tr>         
                            </table>
                            <p align="center"></p>
                        </form>
                </div>
            <?php } ?>
            <?php if(isset($_SESSION['login'])) { ?>
                <div id="login2" align="right">
                            <table id="table" align="right">
                                <tr>
                                    <td><label for="login"> Bienvenue   <?php echo $_SESSION['prenom']; echo " "; echo $_SESSION['nom'];?> </label></td>     
                                </tr>         
                            </table>
                            <p align="center"></p>
                </div>
            <?php } ?>
            
            <ul id="main-menu">
                    <li><a href="index.php">Acceuil</a></li>
                    <li><div id="split_menu"></div></li>
                    <li><a href="modele.php">Créations</a></li>
                    <li><div id="split_menu"></div></li>
                    <li><a href="download.php">Téléchargement</a></li>
                    <li><div id="split_menu"></div></li>
                    <li><a href="tuto.php">Tutoriel</a></li>
                <?php
                    if (isset($_SESSION['admin'])) {
                        if ($_SESSION['admin'] == true) {
                            ?>
                                <li><div id="split_menu"></div></li>
                                <li><a href="compte.php">Mon compte</a></li>
                            <?php
                        } else if ($_SESSION['admin'] == false) {
                            ?>
                            <li><div id="split_menu"></div></li>
                            <li><a href="backoffice.php" id="urlBackoffice">Backoffice</a></li>
                            <li><div id="split_menu"></div></li>
                            <li><a href="admin_modele.php" id="urlBackoffice">Gestion des modèles</a></li>
                            <?php
                        }
                    }
                ?>
                    <?php if(!isset($_SESSION['login'])) { ?>
                        <li><div id="split_menu"></div></li>
                        <li><a href="inscription.php">S'inscrire</a></li>
                    <?php } ?>
                    <?php if(isset($_SESSION['login'])) { ?>
                        <li><div id="split_menu"></div></li>
                        <li><a href="fragments/traitements/disconnect.php">Se d&eacute;connecter</a></li>
                    <?php } ?>                   
            </ul>
	</div>
    <div id="content">
        
<div id="pub">
    <div id="text_pub">
        <embed id="lapub" src="http://s0.2mdn.net/4118425/300x600_IBM_Intel_Nextscale.swf" flashvars="moviePath=http://s0.2mdn.net/4118425/&amp;moviepath=http://s0.2mdn.net/4118425/&amp;clickTag=http%3A//ad-emea.doubleclick.net/click%253Bh%253Dv8/3f0b/f/10e/%252a/q%253B279872309%253B0-0%253B0%253B106864678%253B4986-300/600%253B57314831/57203942/1%253B%253B%257Esscs%253D%253fhttp%3A//ads.horyzon-media.com/clic/countgo.asp%3F3062241%2C140081%2C6485416071221184018%2C6586153083%2CS%2Csystemtarget%3D%2524qc%253d1307229780%253b%2524ql%253dmedium%253b%2524qpc%253d75001%253b%2524qpp%253d0%253b%2524qt%253d184_1903_42652t%253b%2524b%253d16330%253b%2524o%253d11999%253b%2524sh%253d768%253b%2524sw%253d1600%2C9908907%2CURL%3Dhttp%253a%252f%252fwww-03.ibm.com/systems/fr/x/hardware/highdensity/nextscale/sanslimite.html%253Fcmp%253D333AD%2526ct%253D333AD05W%2526cr%253DPCInpact%7CThematique_cloud%7CStandard_display%2526cm%253DB%2526csr%253Dswiotfr%7Cca%7Cintelxpress%7Cnextscale%7Cnextscale%7Cq12014%2526ccy%253DFR%2526cd%253D2014-03-03%2526cn%253Dq1%7CIntXpress%7Cleintel%7Cnextscale%7CBanner%7C300x600%7Cfr%2526csz%253D300x600%2526S_TACT%253D333AD05W&amp;clickTag=http%3A//ad-emea.doubleclick.net/click%253Bh%253Dv8/3f0b/f/10e/%252a/q%253B279872309%253B0-0%253B0%253B106864678%253B4986-300/600%253B57314831/57203942/1%253B%253B%257Esscs%253D%253fhttp%3A//ads.horyzon-media.com/clic/countgo.asp%3F3062241%2C140081%2C6485416071221184018%2C6586153083%2CS%2Csystemtarget%3D%2524qc%253d1307229780%253b%2524ql%253dmedium%253b%2524qpc%253d75001%253b%2524qpp%253d0%253b%2524qt%253d184_1903_42652t%253b%2524b%253d16330%253b%2524o%253d11999%253b%2524sh%253d768%253b%2524sw%253d1600%2C9908907%2CURL%3Dhttp%253a%252f%252fwww-03.ibm.com/systems/fr/x/hardware/highdensity/nextscale/sanslimite.html%253Fcmp%253D333AD%2526ct%253D333AD05W%2526cr%253DPCInpact%7CThematique_cloud%7CStandard_display%2526cm%253DB%2526csr%253Dswiotfr%7Cca%7Cintelxpress%7Cnextscale%7Cnextscale%7Cq12014%2526ccy%253DFR%2526cd%253D2014-03-03%2526cn%253Dq1%7CIntXpress%7Cleintel%7Cnextscale%7CBanner%7C300x600%7Cfr%2526csz%253D300x600%2526S_TACT%253D333AD05W" width="300" height="600" type="application/x-shockwave-flash" quality="high" swliveconnect="true" wmode="opaque" name="DCF279872309" base="http://s0.2mdn.net/4118425" allowscriptaccess="never"> </embed>         
    </div>
</div>
        
        