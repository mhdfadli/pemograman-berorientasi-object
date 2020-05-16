-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 16, 2020 at 06:53 PM
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
-- Database: `coffeeshop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admiin`
--

CREATE TABLE `admiin` (
  `username` varchar(128) NOT NULL,
  `password` varchar(128) NOT NULL,
  `name` varchar(128) NOT NULL,
  `email` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admiin`
--

INSERT INTO `admiin` (`username`, `password`, `name`, `email`) VALUES
('admin', 'aaaaa', 'admin', 'admin@mail.com');

-- --------------------------------------------------------

--
-- Table structure for table `databuku`
--

CREATE TABLE `databuku` (
  `judul` text NOT NULL,
  `penulis` varchar(50) NOT NULL,
  `penerbit` varchar(50) NOT NULL,
  `tahun` varchar(5) NOT NULL,
  `kode` varchar(6) NOT NULL,
  `sinopsis` text NOT NULL,
  `gambar` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `databuku`
--

INSERT INTO `databuku` (`judul`, `penulis`, `penerbit`, `tahun`, `kode`, `sinopsis`, `gambar`) VALUES
('Sebuah Usaha Melupakan', 'Boy Candra', 'Media Kita', '2016', 'A2', 'Setelah hari-hari yang sedih berlalu.\r\nBulan-bulan pahit memulihkan diriku.\r\nAku menyadari satu hal;\r\nyang bukan untukku sekeras apa pun kupaksakan,\r\ntetap saja tak akan menjadi milikku.\r\nYang kuperjuangkan sekuat usahaku,\r\njika kau tak memperjuangkanku sepenuh hatimu,\r\ntetap saja kita akan berlalu.\r\n\r\nHidup terlalu pendek\r\nuntuk dihabiskan dengan kesedihan berkepanjangan.\r\nAku belajar menerima diri;\r\nbahwa aku memang bukan orang yang kau inginkan.\r\nKelak, suatu hari nanti kau Juga harus belajar menyadari.\r\nBahwa kau sudah kulupakan dan bukan orang yang penting kemudian.', 'src/Image/SEBUAH.jpg'),
('Konspirasi Alam Semesta', 'Fiersa Besari', 'Media Kita', '2017', 'A1', 'Seperti apakah warna cinta?\r\nApakah merah muda\r\nmewakili rekahnya,\r\nataukah kelabu\r\nmewakili pecahnya?', 'src/Image/KOLASE.jpg'),
('Cantik Itu Luka', 'Eka Kurniawan', 'Gramedia Pustaka Utama', '2004', 'A3', 'Di akhir masa kolonial,\r\nseorang perempuan dipaksa menjadi pelaur.\r\nKehidupan itu terus dijalaninya hingga ia memiliki\r\ntiga anak gadis yang kesemuanya cantik.\r\nKetika mengandung anaknya yang keempat,\r\nia berharap anak itu akan lahir buruk rupa.\r\nItulah yang terjadi,\r\nmeskipun secara ironik ia memberinya nama si Cantik.', 'src/Image/CANTIK.jpg'),
('Sepotong Hati Yang Baru', 'Tere Liye', 'Mahaka Publishing', '2012', 'A4', 'Pernikahanku dan Alysa tinggal menghitung hari.\r\nPersis lima hari sebelum kami menikah,\r\nAlysa bertemu dengan pria gagah.\r\nPertemuan mereka berdua\r\nSetelah setahun aku pergi dari kesedihan itu.\r\nBerhasil menyingkirkan kenangan lama yang selalu mengganggu otakku,\r\nAlysa mendadak menghubungiku.\r\nDengan nada yang memelas,\r\nAlysa meminta kami bertemu malam ini.\r\nAlysa menceritakan bahwa pernikahannya dengan pria gagah yang dia yakini jodohnya saat itu, gagal.\r\nAlysa bertanya padaku,\r\n“apakan kau masih mencintaiku?”.\r\nAku menggeleng, “Maafkan aku Alysa,\r\naku sudah menikah.\r\nBukan dengan seseorang yang amat aku cintai, aku inginkan.\r\nTetapi setidaknya ia bisa memberikanku sepotong hati yang baru.\r\nMaafkan aku. Kau lihat. Ini cincin pernikahan kami, batu giok.”\r\nAku menelan ludah. (hlm. 50).\r\nAlysa beranjak pergi dari hadapanku dengan rasa kecewa.\r\nApa yang aku katakan kepada Alysa barusan semuanya bohong.\r\nCincin yang kupakai bukan milikku.\r\nCincin ini kepunyaan adikku. Aku belum menikah. ', 'src/Image/SEPOTONG.jpg'),
('Sarapan Pagi Penuh Dusta', 'Puthut EA', 'MOJOK', '2004', 'B1', 'Jujur, aku selalu membandingkanmu\r\ndengan kekasihku,\r\nAku tahu itu salah,\r\nkekasihku orang yang sangat baik.\r\nTapi kebaikan sering tidak berbanding\r\nlurus dengan rasa suka.', 'src/Image/SARAPAN.jpg'),
('Floating In Space', 'Naela Ali', 'Gramedia Pustaka Utama', '2018', 'C1', 'Have you ever felt like\r\n\r\nyou\'re floating in space?\r\n\r\nHave you ever felt like\r\n\r\nyour body suddenly loses its weight\r\n\r\nand your mind wanders around\r\n\r\nto place where infinity seems possible?\r\n\r\nHave you ever been in love?', 'src/Image/FLOATING.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `kopi`
--

CREATE TABLE `kopi` (
  `id_kopi` varchar(5) NOT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kopi`
--

INSERT INTO `kopi` (`id_kopi`, `nama`, `harga`) VALUES
('K01', 'Affogato', 35000),
('k012', 'Affogato hangat', 45000),
('k0122', 'affogato', 50000),
('K02', 'Espresso', 34000),
('K03', 'Cofe Latte', 25000),
('K04', 'Mochaccino', 18000);

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `nama` varchar(128) NOT NULL,
  `harga` int(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`nama`, `harga`) VALUES
('eskopi', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `pemesanan`
--

CREATE TABLE `pemesanan` (
  `id_pesan` varchar(5) NOT NULL,
  `username` varchar(10) DEFAULT NULL,
  `id_kopi` varchar(5) DEFAULT NULL,
  `ukuranGelas` varchar(10) NOT NULL,
  `gula` varchar(10) NOT NULL,
  `catatan` varchar(50) DEFAULT NULL,
  `no_meja` varchar(10) DEFAULT NULL,
  `tanggal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemesanan`
--

INSERT INTO `pemesanan` (`id_pesan`, `username`, `id_kopi`, `ukuranGelas`, `gula`, `catatan`, `no_meja`, `tanggal`) VALUES
('2304', 'user', 'K01', 'Kecil', 'Ya', 'sdsdsd', 'null', 'Sun 2020.05.10 10:41:25 AM ICT'),
('3118', 'user', 'K01', 'Sedang', 'Ya', 'tes 10 mei', 'null', 'Sun 2020.05.10 09:43:31 AM ICT'),
('568', 'rudiyant', 'K02', 'Kecil', 'Ya', 'oke', 'null', 'Fri 2019.05.03 10:42:57 AM ICT'),
('5861', 'ikaa', 'K01', 'Sedang', 'Ya', 'jangan manis kali', 'null', 'Fri 2020.05.01 06:06:33 PM ICT'),
('5902', 'rudiyant', 'K03', 'Kecil', 'Ya', 'gulanya banyakiin', 'null', 'Fri 2020.05.01 06:10:45 PM ICT'),
('9087', 'ikaa', 'K01', 'Sedang', 'Ya', 'jangan manis kali', 'null', 'Fri 2020.05.01 06:06:33 PM ICT'),
('9861', 'ikaa', 'K01', 'Sedang', 'Ya', 'jangan manis kali', 'null', 'Fri 2020.05.01 06:06:33 PM ICT');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `username` varchar(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `nama` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`username`, `password`, `nama`, `email`) VALUES
('admin', 'aaaaa', 'admin', 'admin@mail.com'),
('albab', 'albab', 'albab', 'alabab@alabab'),
('ikaa', '09876', 'ika', 'ikaalay@yahoo.com'),
('rudiyant', '12345', 'Rudi', 'rudiyant@gmail.com'),
('user', 'user', 'user', 'user@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id_pesan` varchar(5) NOT NULL,
  `username` varchar(10) NOT NULL,
  `namakopi` varchar(128) NOT NULL,
  `ukuran` varchar(10) NOT NULL,
  `gula` varchar(10) NOT NULL,
  `catatan` varchar(50) NOT NULL,
  `no_meja` varchar(10) NOT NULL,
  `tanggal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id_pesan`, `username`, `namakopi`, `ukuran`, `gula`, `catatan`, `no_meja`, `tanggal`) VALUES
('1455', 'user', 'Cofe Latte', 'Kecil', 'Tidak', 'udah manis sih', 'null', 'Sun 2020.05.10 11:19:34 AM ICT'),
('2340', 'user', 'Affogato', 'Sedang', 'Tidak', 'hangat ', 'null', 'Sun 2020.05.10 04:31:52 PM ICT'),
('4469', 'user', 'Espresso', 'Besar', 'Ya', 'ga apa apa kalau ini', 'null', 'Sun 2020.05.10 11:20:37 AM ICT'),
('4780', 'user', 'Mochaccino', 'Sedang', 'Tidak', 'tidak pakai gula', 'null', 'Sat 2020.05.16 05:23:24 PM ICT'),
('5675', 'admin', 'Mochaccino', 'Sedang', 'Tidak', 'nyaman', 'null', 'Sun 2020.05.10 04:19:59 PM ICT'),
('6254', 'user', 'Affogato', 'Sedang', 'Tidak', 'ttetetetete', 'null', 'Sun 2020.05.10 10:45:55 AM ICT'),
('7243', 'user', 'Affogato', 'Besar', 'Tidak', 'tesprak', 'null', 'Sun 2020.05.10 10:32:59 AM ICT'),
('7906', 'user', 'Mochaccino', 'Sedang', 'Tidak', 'sedang', 'null', 'Sun 2020.05.10 11:21:55 AM ICT'),
('9412', 'admin', 'Affogato', 'Besar', 'Ya', 'sedikit aja gula nya ya', 'null', 'Sun 2020.05.10 10:38:35 AM ICT'),
('9942', 'user', 'Cofe Latte', 'Besar', 'Ya', 'ya ya ya', 'null', 'Sun 2020.05.10 03:16:05 PM ICT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admiin`
--
ALTER TABLE `admiin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `kopi`
--
ALTER TABLE `kopi`
  ADD PRIMARY KEY (`id_kopi`);

--
-- Indexes for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD PRIMARY KEY (`id_pesan`),
  ADD KEY `fkusername` (`username`),
  ADD KEY `fkid_kopi` (`id_kopi`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id_pesan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pemesanan`
--
ALTER TABLE `pemesanan`
  ADD CONSTRAINT `fkid_kopi` FOREIGN KEY (`id_kopi`) REFERENCES `kopi` (`id_kopi`),
  ADD CONSTRAINT `fkusername` FOREIGN KEY (`username`) REFERENCES `pengguna` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
