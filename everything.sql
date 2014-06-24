-- phpMyAdmin SQL Dump
-- version 3.4.10.1
-- http://www.phpmyadmin.net
--
-- Client: localhost
-- Généré le : Mar 24 Juin 2014 à 11:53
-- Version du serveur: 5.5.20
-- Version de PHP: 5.3.10

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `everything`
--

-- --------------------------------------------------------

--
-- Structure de la table `inscrit`
--

CREATE TABLE IF NOT EXISTS `inscrit` (
  `id_inscrit` int(5) NOT NULL AUTO_INCREMENT,
  `pseudo_inscrit` varchar(30) NOT NULL,
  `prenom_inscrit` varchar(30) NOT NULL,
  `nom_inscrit` varchar(30) NOT NULL,
  `mail_inscrit` varchar(30) NOT NULL,
  `mdp_inscrit` varchar(30) NOT NULL,
  `type_compte` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_inscrit`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Contenu de la table `inscrit`
--

INSERT INTO `inscrit` (`id_inscrit`, `pseudo_inscrit`, `prenom_inscrit`, `nom_inscrit`, `mail_inscrit`, `mdp_inscrit`, `type_compte`) VALUES
(1, 'test', 'John', 'Smith', 'test@test.fr', 'test', 1),
(3, 'admin', 'Monsieur', 'Admin', 'admin@admin.fr', 'admin', 0),
(4, 'Jean', 'Jean', 'Lafritte', 'jean@lafritte.fr', 'jean', 1),
(5, 'Jeanne', 'Jeanne', 'Lagauffre', 'jeanne@lagauffre.fr', 'jeanne', 1),
(11, 'admin2', 'Monsieur', 'admin2', 'admin2@admin2.fr', 'c84258e9c39059a89ab77d846ddab9', 0);

-- --------------------------------------------------------

--
-- Structure de la table `modele`
--

CREATE TABLE IF NOT EXISTS `modele` (
  `id_modele` int(11) NOT NULL AUTO_INCREMENT,
  `nom_modele` varchar(20) NOT NULL,
  `description_modele` varchar(1000) NOT NULL,
  `url_modele` varchar(200) NOT NULL,
  `image_modele` varchar(200) NOT NULL,
  `statut_modele` varchar(30) NOT NULL,
  `hauteur_modele` float NOT NULL,
  `largeur_modele` float NOT NULL,
  `longueur_modele` float NOT NULL,
  `date_modele` date NOT NULL,
  `id_inscrit` int(11) NOT NULL,
  PRIMARY KEY (`id_modele`),
  KEY `FK_modele_id_inscrit` (`id_inscrit`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `modele`
--

INSERT INTO `modele` (`id_modele`, `nom_modele`, `description_modele`, `url_modele`, `image_modele`, `statut_modele`, `hauteur_modele`, `largeur_modele`, `longueur_modele`, `date_modele`, `id_inscrit`) VALUES
(2, 'Le Cube', 'C''est un jolie cube et tout et tout super classe avec une couleur bleu ', 'download/modele/cube.rar', 'res/img_modele/cube.jpg', 'azerty', 10, 10, 10, '2014-06-12', 3),
(3, 'La Sphere', 'C''est une jolie sphere et tout et tout', 'download/modele/sphere.rar', 'res/img_modele/sphere.png', 'gggggg', 10, 10, 10, '2014-06-26', 3);

-- --------------------------------------------------------

--
-- Structure de la table `plug_in`
--

CREATE TABLE IF NOT EXISTS `plug_in` (
  `id_plug_in` int(11) NOT NULL AUTO_INCREMENT,
  `nom_plug_in` varchar(30) NOT NULL,
  `desciption_plug_in` varchar(500) NOT NULL,
  `url_plug_in` varchar(200) NOT NULL,
  `image_plug_in` varchar(200) NOT NULL,
  `date_plug_in` date NOT NULL,
  `id_inscrit` int(11) NOT NULL,
  PRIMARY KEY (`id_plug_in`),
  KEY `FK_plug_in_id_inscrit` (`id_inscrit`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `plug_in`
--

INSERT INTO `plug_in` (`id_plug_in`, `nom_plug_in`, `desciption_plug_in`, `url_plug_in`, `image_plug_in`, `date_plug_in`, `id_inscrit`) VALUES
(1, 'test', 'testtesttest', 'test', 'test', '2014-06-18', 1);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `modele`
--
ALTER TABLE `modele`
  ADD CONSTRAINT `FK_modele_id_inscrit` FOREIGN KEY (`id_inscrit`) REFERENCES `inscrit` (`id_inscrit`);

--
-- Contraintes pour la table `plug_in`
--
ALTER TABLE `plug_in`
  ADD CONSTRAINT `FK_plug_in_id_inscrit` FOREIGN KEY (`id_inscrit`) REFERENCES `inscrit` (`id_inscrit`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
