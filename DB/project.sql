-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 05 Ara 2018, 21:26:21
-- Sunucu sürümü: 10.1.36-MariaDB
-- PHP Sürümü: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `project`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `customer`
--

CREATE TABLE `customer` (
  `cid` int(11) NOT NULL,
  `cName` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cSurname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cPhone` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `cAddress` varchar(255) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `customer`
--

INSERT INTO `customer` (`cid`, `cName`, `cSurname`, `cPhone`, `cAddress`) VALUES
(18, 'Deniz', 'Bilir', '05458963654', 'İstanbul/Levent'),
(19, 'Sinem', 'Şaşmazel', '05066286875', 'İstanbul/Fatih'),
(20, 'Ayla', 'Sever', '05052366589', 'Antalya/Side'),
(23, 'Umut', 'Yener', '05325614758', 'Gayrettepe/İstanbul');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `orders`
--

CREATE TABLE `orders` (
  `oid` int(11) NOT NULL,
  `oName` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `oSurname` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `oStatus` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `oAddress` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `oCost` varchar(255) COLLATE utf8_turkish_ci NOT NULL,
  `oDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `orders`
--

INSERT INTO `orders` (`oid`, `oName`, `oSurname`, `oStatus`, `oAddress`, `oCost`, `oDate`) VALUES
(3, 'Umut', 'Yener', 'Shipped', 'Gayrettepe/İstanbul', '10', '2018-12-04'),
(4, 'Deniz', 'Bilir', 'Preparing', 'İstanbul/Levent', '20', '2018-12-04'),
(5, 'Sinem', 'Şaşmazel', 'Delivered', 'İstanbul/Fatih', '40', '2018-12-04'),
(6, 'Ayla', 'Sever', 'Preparing', 'Antalya/Side', '30', '2018-12-04');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cid`);

--
-- Tablo için indeksler `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`oid`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `customer`
--
ALTER TABLE `customer`
  MODIFY `cid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Tablo için AUTO_INCREMENT değeri `orders`
--
ALTER TABLE `orders`
  MODIFY `oid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
