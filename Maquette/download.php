<?php 
$page_title = "Everything - Download";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
?>


<div id="download">
    <p><b>Téléchargez l'application</b> <br><br> Vous trouverz ici l'application.</p>
    
    <a class="telecharger" href="/Maquette/download/everything.rar" target=""> Télécharger </a>
    

</div>



    <div id="plug-ins">
        <div id="split_page"></div>
        <p><b>Plug-ins</b><br><br> Cette section regroupe des modules téléchargeables.</p>

        <div id="un_plug_in">
            <div id="text_plug_in">
                <br>
                <b>Nouveaux pinceaux</b>
                <table>
                    <tr>
                        <td><img src="http://us.cdn4.123rf.com/168nwm/larser/larser1201/larser120101047/11942674-vector-illustration-de-taches-rouges-avec-un-pinceau-de-peinture-rouge.jpg" alt="Pas d'image" title="" width="100px"></td>
                        <td>Plus large palette de couleurs pour l'application</td>    
                    </tr>
                </table>
                <div id="split"></div>
                <div id="votes">
                <table>
                    <tr>
                        <?php if(isset($_SESSION['login'])) { ?>
                        <td><a class="telecharger" href="download/plug_in/palette_couleurs.jar" target=""> Télécharger </a></td>
                        <?php } ?>
                    </tr>
                </table>
                </div>
                <br>
            </div> 
        </div>

    </div>


<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>
