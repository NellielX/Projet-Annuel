<?php 
$page_title = "Everything - BackOffice";
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/header.php');
require_once 'fragments/traitements/db.php';
require_once 'fragments/traitements/inscrit.php';
?>
<style type="text/css">
    #pub{
        display: none;
    }
    #text_pub{
        display: none;
    }
</style>

<h3 align="center">Supprimer un utilisateur</h3>        
<div id="split_page_2"></div>


<div id="corp_validation">
    <div id="text_validation">
			<table align="center">
			    <tr>
			        <th>ID</th>
			        <th>Nom</th>
			        <th>Prénom</th>
			        <th>Login</th>
			        <th>Email</th>
			        <th>Action</th>
			    </tr>
			<?php
			$inscrits = showUsers();
			    foreach ($inscrits as $modele) {
			?>
			    <tr>
				<td><?=$modele['id_inscrit'] ?></td>
				<td><?=$modele['nom_inscrit'] ?></td>
				<td><?=$modele['prenom_inscrit'] ?></td>
				<td><?=$modele['pseudo_inscrit'] ?></td>
				<td><?=$modele['mail_inscrit'] ?></td>
				<td><a style="color: black; font-weight: bold; text-decoration: underline;" href="fragments/traitements/bo_suppr_inscrit.php?id=<?php echo $modele['id_inscrit'] ?>">Supprimer</a></td>
			    </tr>
			    
			<?php
			    }
			?>
			</table>
	</div>
</div>

<?php
include ($_SERVER['DOCUMENT_ROOT'] . '/Maquette/fragments/shared/footer.php');
?>
