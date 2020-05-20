-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2020 at 12:27 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `responsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `id_kereta` varchar(128) NOT NULL,
  `namak` varchar(128) NOT NULL,
  `kelas` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`id_kereta`, `namak`, `kelas`) VALUES
('k03', 'inzana', 'bisnis'),
('k04', 'kacang rebus', 'bisnis '),
('k05', 'bembeng coklat', 'bisnis'),
('k06', 'pinus', 'bisnis');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE `tiket` (
  `nama` varchar(128) NOT NULL,
  `jenkel` varchar(128) NOT NULL,
  `stasiun` varchar(128) NOT NULL,
  `kereta` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`nama`, `jenkel`, `stasiun`, `kereta`) VALUES
('dinda sari', 'perempuan', 'tugujogya', 'surya kencana'),
('permaina', 'perempuan', 'maguwo', 'pratameks'),
('ahmad', 'laki-laki', 'lempuyangan', 'surya kencana'),
('geri', 'laki-laki', 'tugujogya', 'hahua'),
('ani', 'perempuan', 'lempuyangan', 'pratameks'),
('junaidi', 'laki-laki', 'maguwo', 'surya kencana'),
('dinatun', 'perempuan', 'lempuyangan', 'prameks');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`id_kereta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
