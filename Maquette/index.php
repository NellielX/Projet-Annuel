<?php 
$page_title = "Everything - Index";
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

<div id="partie1">
    <div class="wrapper" align="center">
        <div class="jcarousel-wrapper">
            <div class="jcarousel">
                <ul>
                    <li><img src="res/img/LeapMotion.jpg" width="600" height="400" alt=""></li>
                    <li><img src="res/img/leap.jpg" width="600" height="400" alt=""></li>
                    <li><img src="res/img/cube.jpg" width="600" height="400" alt=""></li>
                </ul>
            </div>
            <a href="#" class="jcarousel-control-prev">&lsaquo;</a>
            <a href="#" class="jcarousel-control-next">&rsaquo;</a>               
            <p class="jcarousel-pagination"></p>
        </div>
    </div>
</div>

<div id="partie2">
    
    Bienvenue sur le site d’EveryThing ! <br><br>
    Afin d’utiliser l’application dans les meilleures conditions, il vous est conseillé de vous procurer le dispositif Leap Motion. <br><br>
    De plus amples informations sont disponibles ici : <a href="https://www.leapmotion.com/" target="blanc"> https://www.leapmotion.com </a><br><br>
    Une fois inscrit, vous pouvez télécharger l’application, mais aussi un panel d’outils d’édition. <br><br>
    La communauté s’agrandissant, vous pourrez aussi télécharger les modèles mis à disposition d’autres utilisateurs.

    
</div>






<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>

