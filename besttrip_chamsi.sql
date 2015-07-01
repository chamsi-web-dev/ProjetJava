-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 01 Juillet 2015 à 02:07
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
  `id_experience` int(11) NOT NULL,
  `status_commentaire` int(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

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
  `newsletter_compte` int(2) NOT NULL,
  `status_compte` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `compte`
--

INSERT INTO `compte` (`id_compte`, `nom_compte`, `prenom_compte`, `email_compte`, `dob_compte`, `country_compte`, `login_compte`, `pwd_compte`, `type_compte`, `newsletter_compte`, `status_compte`) VALUES
(1, 'chamsi', 'bardi', '', '2015-06-10', 2, 'chamsi', 'chamsi', 'Utilisateur', 0, 1),
(2, 'qdqsdsq', 'sdqsdsq', '', '2015-06-01', 3, 'qsdq', 'QQDSQD', 'Utilisateur', 1, 1),
(3, 'User 3', 'prénom3', '', '2015-06-22', 4, 'user4', 'user4', 'Administrateur', 0, 2),
(4, 'sqdqsd', 'qsdqsd', 'null', '2015-06-23', 1, 'qsdqs', 'dqsdqsd', 'Utilisateur', 0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `contribution`
--

CREATE TABLE IF NOT EXISTS `contribution` (
  `id_contribution` int(50) NOT NULL,
  `description_contribution` varchar(50) NOT NULL,
  `id_compte` int(11) NOT NULL,
  `status_contribution` int(2) DEFAULT NULL,
  `id_guide` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `contribution`
--

INSERT INTO `contribution` (`id_contribution`, `description_contribution`, `id_compte`, `status_contribution`, `id_guide`) VALUES
(3, 'desc contribution 1', 1, 0, 1),
(9, 'test guide compte', 1, 0, 3),
(10, 'zedzdqsdzqdqs', 1, 0, 3),
(11, 'zedzdqsdzqdqsqsqsqSQsqSQsq', 1, 0, 3),
(12, '<qsdqsdsqdqs', 1, 0, 3);

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
  `id_text` int(11) DEFAULT NULL,
  `id_video` int(11) DEFAULT NULL,
  `id_image` int(11) DEFAULT NULL,
  `id_compte` int(20) NOT NULL DEFAULT '0',
  `id_country` int(11) NOT NULL,
  `status_experience` tinyint(2) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `experience`
--

INSERT INTO `experience` (`id_experience`, `title_experience`, `decalage_horaire_experience`, `start_experience`, `end_experience`, `season_experience`, `depense_experience`, `note_experience`, `id_text`, `id_video`, `id_image`, `id_compte`, `id_country`, `status_experience`) VALUES
(9, 'skqmdlkqmdlqskmldk', 5, '2015-07-01', '2015-07-31', 3, 99, 7, 14, 0, 0, 1, 0, 0),
(10, 'kljkjkjklljk', 5, '2015-07-01', '2015-07-31', 3, 9999, 7, 19, 0, 0, 1, 1, 0),
(11, '§/§/!:§/', 5, '2015-07-04', '2015-07-29', 1, 96666, 5, 20, 0, 0, 1, 4, 0),
(12, 'lkmlklmk', 12, '2015-07-05', '2015-07-14', 2, 3666, 3, 21, 0, 0, 1, 1, 0);

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
(1, 'Guide 1', 'TEST DESCRIPTION GUIDE 1', '5', 1, 1, 2),
(2, 'Guide 2', 'TEST DESCRIPTION GUIDE 2', '6', 0, 2, 2),
(3, 'Guide 3', 'TEST DESCRIPTION GUIDE 3', '5', 1, 3, 2);

-- --------------------------------------------------------

--
-- Structure de la table `image`
--

CREATE TABLE IF NOT EXISTS `image` (
  `id_image` int(11) NOT NULL,
  `path_url_image` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=latin1;

--
-- Contenu de la table `text`
--

INSERT INTO `text` (`id_text`, `description_experience`) VALUES
(1, 'SQQDQSDSQDSQD'),
(2, 'qssqdqsdsqddqsdqs'),
(3, 'sqsqsqdsqdsqdsqdsqd'),
(4, ''),
(5, 'SQQSDQSDQSSDSQDDSQDSQDQS'),
(6, 'QQSDSQQSDSQDSQDSQDQS'),
(7, 'qcqsdqssqdsqdqsdsq'),
(8, 'wcxxwcwxcxwcxwcxwcwx'),
(9, 'sdqsqsdqsdqsdqsd'),
(10, 'test test test '),
(11, 'sqqsqsdsqdsqdsqdsq'),
(12, 'xqsdsqdqsdqsdqsdsq'),
(13, 'jkljqklqjlqsjdlksqjdklqsjdsqdqsdq'),
(14, '<wxw<xw<xw<xw<xcfgdfgsddfdsfsdfds'),
(15, 'test test test'),
(16, 'test test test test test '),
(17, 'qsdqsqssqdsqdsqdsqdsqd'),
(18, 'tes terst terst testy'),
(19, 'kjhkjhjkhkhjkhkjhk'),
(20, ''),
(21, '');

-- --------------------------------------------------------

--
-- Structure de la table `video`
--

CREATE TABLE IF NOT EXISTS `video` (
  `id_video` int(11) NOT NULL,
  `title_video` varchar(45) DEFAULT NULL,
  `path_video` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

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
  ADD PRIMARY KEY (`id_commentaire`), ADD KEY `id_experience_2` (`id_experience`);

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
-- Index pour la table `contribution`
--
ALTER TABLE `contribution`
  ADD PRIMARY KEY (`id_contribution`), ADD KEY `id_guide` (`id_guide`), ADD KEY `id_compte` (`id_compte`);

--
-- Index pour la table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`id_country`);

--
-- Index pour la table `experience`
--
ALTER TABLE `experience`
  ADD PRIMARY KEY (`id_experience`,`id_compte`), ADD KEY `fk_Experience_Compte1_idx` (`id_compte`), ADD KEY `country_experience` (`id_country`);

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
  MODIFY `id_commentaire` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT pour la table `compte`
--
ALTER TABLE `compte`
  MODIFY `id_compte` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `contribution`
--
ALTER TABLE `contribution`
  MODIFY `id_contribution` int(50) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT pour la table `experience`
--
ALTER TABLE `experience`
  MODIFY `id_experience` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=13;
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
-- AUTO_INCREMENT pour la table `image`
--
ALTER TABLE `image`
  MODIFY `id_image` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT pour la table `text`
--
ALTER TABLE `text`
  MODIFY `id_text` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT pour la table `video`
--
ALTER TABLE `video`
  MODIFY `id_video` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `commentaire`
--
ALTER TABLE `commentaire`
ADD CONSTRAINT `FK_ID_EXPERIENCE` FOREIGN KEY (`id_experience`) REFERENCES `experience` (`id_experience`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Contraintes pour la table `contribution`
--
ALTER TABLE `contribution`
ADD CONSTRAINT `FK_ID_COMPTE` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`),
ADD CONSTRAINT `FK_ID_GUIDE` FOREIGN KEY (`id_guide`) REFERENCES `guide` (`id_guide`);

--
-- Contraintes pour la table `experience`
--
ALTER TABLE `experience`
ADD CONSTRAINT `fk_Experience_Compte` FOREIGN KEY (`id_compte`) REFERENCES `compte` (`id_compte`) ON DELETE NO ACTION ON UPDATE NO ACTION;

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
