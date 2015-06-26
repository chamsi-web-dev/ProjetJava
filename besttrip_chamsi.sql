-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 25 Juin 2015 à 00:30
-- Version du serveur :  5.6.24
-- Version de PHP :  5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `besttrip_chamsi`
--

-- --------------------------------------------------------

--
-- Structure de la table `commentaire`
--

CREATE TABLE IF NOT EXISTS `commentaire` (
  `id_commentaire` int(20) NOT NULL,
  `content_commentaire` text NOT NULL,
  `rating_commentaire` int(10) NOT NULL,
  `id_experience` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `companie`
--

CREATE TABLE IF NOT EXISTS `companie` (
  `id_companie` int(11) NOT NULL,
  `nom_companie` varchar(45) DEFAULT NULL,
  `score_companie` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

CREATE TABLE IF NOT EXISTS `compte` (
  `id_compte` int(20) NOT NULL,
  `nom_compte` varchar(45) DEFAULT NULL,
  `prenom_compte` varchar(45) DEFAULT NULL,
  `email_compte` varchar(50) NOT NULL,
  `dob_compte` date DEFAULT NULL,
  `country_compte` int(3) DEFAULT NULL,
  `login_compte` varchar(20) DEFAULT NULL,
  `pwd_compte` varchar(20) DEFAULT NULL,
  `type_compte` varchar(20) DEFAULT NULL,
  `status_compte` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`id_compte`, `nom_compte`, `prenom_compte`, `email_compte`, `dob_compte`, `country_compte`, `login_compte`, `pwd_compte`, `type_compte`, `status_compte`) VALUES
(1, 'chamsi', 'bardi', '', '2015-06-10', 2, 'chamsi', 'chamsi', 'Utilisateur', 1),
(2, 'qdqsdsq', 'sdqsdsq', '', '2015-06-01', 3, 'qsdq', 'QQDSQD', 'Utilisateur', 1),
(3, 'User 3', 'prénom3', '', '2015-06-22', 4, 'user4', 'user4', 'Administrateur', 2),
(4, 'sqdqsd', 'qsdqsd', 'null', '2015-06-23', 1, 'qsdqs', 'dqsdqsd', 'Utilisateur', 0);

-- --------------------------------------------------------

--
-- Structure de la table `country`
--

CREATE TABLE IF NOT EXISTS `country` (
  `id_country` int(11) NOT NULL,
  `name_country` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `country`
--

INSERT INTO `country` (`id_country`, `name_country`) VALUES
(1, 'Tunisie'),
(2, 'France'),
(3, 'Suisse'),
(4, 'Italie'),
(5, 'Egypte'),
(6, 'Malysie'),
(7, 'île de séchelle');

-- --------------------------------------------------------

--
-- Structure de la table `experience`
--

CREATE TABLE IF NOT EXISTS `experience` (
  `id_experience` int(11) NOT NULL,
  `title_experience` varchar(45) DEFAULT NULL,
  `decalage_horaire_experience` int(10) DEFAULT NULL,
  `start_experience` date DEFAULT NULL,
  `end_experience` date DEFAULT NULL,
  `season_experience` int(2) DEFAULT NULL,
  `depense_experience` float DEFAULT NULL,
  `note_experience` int(10) DEFAULT NULL,
  `id_text` int(11) NOT NULL DEFAULT '0',
  `id_video` int(11) NOT NULL DEFAULT '0',
  `id_image` int(11) NOT NULL DEFAULT '0',
  `id_compte` int(20) NOT NULL,
  `id_country` int(11) NOT NULL,
  `status_experience` tinyint(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `experience`
--

INSERT INTO `experience` (`id_experience`, `title_experience`, `decalage_horaire_experience`, `start_experience`, `end_experience`, `season_experience`, `depense_experience`, `note_experience`, `id_text`, `id_video`, `id_image`, `id_compte`, `id_country`, `status_experience`) VALUES
(5, 'Experience 1', 3, '2015-06-21', '2015-06-24', 3, 100, 5, 1, 1, 1, 1, 3, 1),
(6, 'Experience 2', 3, '2015-06-21', '2015-06-24', 3, 100, 5, 1, 1, 1, 1, 3, 1),
(7, 'Experience 3', 3, '2015-06-21', '2015-06-24', 3, 100, 5, 1, 1, 1, 1, 3, 0);

-- --------------------------------------------------------

--
-- Structure de la table `flux`
--

CREATE TABLE IF NOT EXISTS `flux` (
  `id_flux` int(20) NOT NULL,
  `lien_flux` varchar(20) NOT NULL,
  `status_flux` int(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `flux`
--

INSERT INTO `flux` (`id_flux`, `lien_flux`, `status_flux`) VALUES
(1, 'flux1', 0),
(2, 'flux2', 1),
(5, 'flux 5', 0),
(6, 'flux 6', 1);

-- --------------------------------------------------------

--
-- Structure de la table `guide`
--

CREATE TABLE IF NOT EXISTS `guide` (
  `id_guide` int(11) NOT NULL,
  `name_guide` varchar(45) DEFAULT NULL,
  `description_guide` varchar(45) DEFAULT NULL,
  `note_guide` varchar(45) DEFAULT NULL,
  `status_guide` int(2) DEFAULT NULL,
  `id_country` int(11) NOT NULL,
  `id_compte` int(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `guide`
--

INSERT INTO `guide` (`id_guide`, `name_guide`, `description_guide`, `note_guide`, `status_guide`, `id_country`, `id_compte`) VALUES
(1, 'Guide 1', 'TEST DESCRIPTION GUIDE 1', '5', 0, 1, 2),
(2, 'Guide 2', 'TEST DESCRIPTION GUIDE 2', '6', 0, 2, 2),
(3, 'Guide 3', 'TEST DESCRIPTION GUIDE 3', '5', 0, 3, 2);

-- --------------------------------------------------------

--
-- Structure de la table `image`
--

CREATE TABLE IF NOT EXISTS `image` (
  `id_image` int(11) NOT NULL,
  `path_url_image` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `image`
--

INSERT INTO `image` (`id_image`, `path_url_image`) VALUES
(1, 'path/to/image.png'),
(2, 'path/to/image2.png');

-- --------------------------------------------------------

--
-- Structure de la table `lieu`
--

CREATE TABLE IF NOT EXISTS `lieu` (
  `id_lieu` int(11) NOT NULL,
  `nom_lieu` varchar(45) DEFAULT NULL,
  `score_lieu` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recommander`
--

CREATE TABLE IF NOT EXISTS `recommander` (
  `id_recommander` int(11) NOT NULL,
  `type_recommander` varchar(20) DEFAULT NULL,
  `Compte_id_compte` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `text`
--

CREATE TABLE IF NOT EXISTS `text` (
  `id_text` int(11) NOT NULL,
  `description_experience` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `text`
--

INSERT INTO `text` (`id_text`, `description_experience`) VALUES
(1, 'Description expérience 1'),
(2, 'Description expérience 2');

-- --------------------------------------------------------

--
-- Structure de la table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `id_video` int(11) NOT NULL,
  `title_video` varchar(45) DEFAULT NULL,
  `path_video` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `video`
--

INSERT INTO `video` (`id_video`, `title_video`, `path_video`) VALUES
(1, 'Welcome Chamsi', '/path/to/video.mp4'),
(2, 'Welcome Leaders', '/path/to/est.mp4');

-- --------------------------------------------------------

--
-- Structure de la table `ville`
--

CREATE TABLE IF NOT EXISTS `ville` (
  `id_ville` int(11) NOT NULL,
  `nom_ville` varchar(45) DEFAULT NULL,
  `score_ville` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `ville`
--

INSERT INTO `ville` (`id_ville`, `nom_ville`, `score_ville`) VALUES
(1, 'Gabés', '6.5'),
(2, 'Hammmet', '5.3');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `commentaire`
--
ALTER TABLE `commentaire`
  ADD PRIMARY KEY (`id_commentaire`), ADD UNIQUE KEY `id_experience` (`id_experience`);

--
-- Index pour la table `companie`
--
ALTER TABLE `companie`
  ADD PRIMARY KEY (`id_companie`);

--
-- Index pour la table `compte`
--
ALTER TABLE `compte`
  ADD PRIMARY KEY (`id_compte`);

--
-- Index pour la table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`id_country`);

--
-- Index pour la table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id_experience`,`id_text`,`id_video`,`id_image`,`id_compte`), ADD KEY `fk_Experience_Text1_idx` (`id_text`), ADD KEY `fk_Experience_Video1_idx` (`id_video`), ADD KEY `fk_Experience_Image1_idx` (`id_image`), ADD KEY `fk_Experience_Compte1_idx` (`id_compte`), ADD KEY `country_experience` (`id_country`);

--
-- Index pour la table `flux`
--
ALTER TABLE `flux`
  ADD PRIMARY KEY (`id_flux`);

--
-- Index pour la table `guide`
--
ALTER TABLE `guide`
  ADD PRIMARY KEY (`id_guide`,`id_country`,`id_compte`), ADD KEY `fk_Guide_Country1_idx` (`id_country`), ADD KEY `fk_Guide_Compte1_idx` (`id_compte`);

--
-- Index pour la table `image`
--
ALTER TABLE `image`
  ADD PRIMARY KEY (`id_image`);

--
-- Index pour la table `lieu`
--
ALTER TABLE `lieu`
  ADD PRIMARY KEY (`id_lieu`);

--
-- Index pour la table `recommander`
--
ALTER TABLE `recommander`
  ADD PRIMARY KEY (`id_recommander`,`Compte_id_compte`), ADD KEY `fk_Recommander_Compte_idx` (`Compte_id_compte`);

--
-- Index pour la table `text`
--
ALTER TABLE `text`
  ADD PRIMARY KEY (`id_text`);

--
-- Index pour la table `video`
--
ALTER TABLE `video`
  ADD PRIMARY KEY (`id_video`);

--
-- Index pour la table `ville`
--
ALTER TABLE `ville`
  ADD PRIMARY KEY (`id_ville`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `commentaire`
--
ALTER TABLE `commentaire`
  MODIFY `id_commentaire` int(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `id_compte` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `experience`
--
ALTER TABLE `experience`
  MODIFY `id_experience` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT pour la table `flux`
--
ALTER TABLE `flux`
  MODIFY `id_flux` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `guide`
--
ALTER TABLE `guide`
  MODIFY `id_guide` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `commentaire`
--
ALTER TABLE `commentaire`
ADD CONSTRAINT `FK_ID_EXPERIENCE` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `experience`
--
ALTER TABLE `experience`
ADD CONSTRAINT `fk_Experience_Compte` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_Experience_Image` FOREIGN KEY (`id_image`) REFERENCES `image` (`id_image`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_Experience_Text1` FOREIGN KEY (`id_text`) REFERENCES `text` (`id_text`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_Experience_Video1` FOREIGN KEY (`id_video`) REFERENCES `video` (`id_video`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `guide`
--
ALTER TABLE `guide`
ADD CONSTRAINT `fk_Guide_Compte` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_Guide_Country` FOREIGN KEY (`id_country`) REFERENCES `country` (`id_country`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `recommander`
--
ALTER TABLE `recommander`
ADD CONSTRAINT `fk_Recommander_Compte` FOREIGN KEY (`Compte_id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
