-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 03, 2021 at 04:17 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `itpmnew`
--

-- --------------------------------------------------------

--
-- Table structure for table `add suitable rooms for group and sub groups`
--

CREATE TABLE `add suitable rooms for group and sub groups` (
  `Add_Su_G_SG_ID` int(30) NOT NULL,
  `Room_ID` varchar(30) NOT NULL,
  `Session_ID` varchar(30) NOT NULL,
  `Sub_Group_iD` varchar(30) NOT NULL,
  `Group_ID` varchar(30) NOT NULL,
  `Tag` varchar(100) NOT NULL,
  `Room_Type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `add suitable rooms for lecture and tags`
--

CREATE TABLE `add suitable rooms for lecture and tags` (
  `Add_Su_L_SG_ID` int(10) NOT NULL,
  `Room ID` varchar(10) NOT NULL,
  `Session_ID` varchar(30) NOT NULL,
  `Lec_ID` varchar(30) NOT NULL,
  `Tag` varchar(255) NOT NULL,
  `Room_Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `add suitable rooms for subject and tags`
--

CREATE TABLE `add suitable rooms for subject and tags` (
  `Add_Su_Sub_Tag_ID` int(10) NOT NULL,
  `Room ID` varchar(30) NOT NULL,
  `Session_ID` varchar(30) NOT NULL,
  `Subject_ID` varchar(30) NOT NULL,
  `Tag` varchar(255) NOT NULL,
  `Room_Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `lec_id` char(6) NOT NULL,
  `lec_name` varchar(100) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `department` varchar(30) NOT NULL,
  `center` varchar(30) NOT NULL,
  `building` varchar(30) NOT NULL,
  `level` int(1) NOT NULL,
  `rank` char(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`lec_id`, `lec_name`, `faculty`, `department`, `center`, `building`, `level`, `rank`) VALUES
('1100', 'Mr.Joseph', 'Computing', 'IT', 'Malabe', 'D-block', 6, '6.1100'),
('1308', 'Mr.John', 'Computing', 'IT', 'Malabe', 'D-block', 4, '4.1308'),
('1309', 'Ms.Emma', 'Computing', 'IT', 'Malabe', 'D-block', 5, '5.1309'),
('1405', 'Mr.Kamal', 'Computing', 'SE', 'Malabe', 'New Building', 1, '1.1405'),
('1406', 'Mr.Vimal', 'Computing', 'SE', 'Malabe', 'New Building', 2, '2.1406'),
('1407', 'Ms.Anna', 'Computing', 'SE', 'Malabe', 'New Building', 3, '3.1407'),
('2501', 'Mr.Samantha', 'Computing', 'DS', 'Metro', 'New Building', 3, '3.2501');

-- --------------------------------------------------------

--
-- Table structure for table `lecturergroupsubgroup`
--

CREATE TABLE `lecturergroupsubgroup` (
  `selectLecturer` varchar(10) NOT NULL,
  `time` time NOT NULL,
  `group` varchar(20) NOT NULL,
  `subgroup` varchar(10) NOT NULL,
  `sessionID` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `lecturers_consecutive`
--

CREATE TABLE `lecturers_consecutive` (
  `con_Lec_ID` int(11) NOT NULL,
  `lecID` varchar(255) NOT NULL,
  `subject1` varchar(255) NOT NULL,
  `subject2` varchar(255) NOT NULL,
  `subject3` varchar(255) NOT NULL,
  `session1` varchar(255) NOT NULL,
  `session2` varchar(255) NOT NULL,
  `session3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecturers_consecutive`
--

INSERT INTO `lecturers_consecutive` (`con_Lec_ID`, `lecID`, `subject1`, `subject2`, `subject3`, `session1`, `session2`, `session3`) VALUES
(1, 'vvj', 'DS', 'DS', 'DS', '2.Y3S1.SE.05', '2.Y3S1.SE.05', '2.Y3S1.SE.05'),
(2, '987654', 'DS', 'DS', 'DS', '2.Y3S1.SE.05', '2.Y3S1.SE.05', '2.Y3S1.SE.05');

-- --------------------------------------------------------

--
-- Table structure for table `location`
--

CREATE TABLE `location` (
  `locationId` int(5) NOT NULL,
  `buildingName` varchar(255) NOT NULL,
  `roomNumber` varchar(5) NOT NULL,
  `roomCapacity` int(30) NOT NULL,
  `roomType` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `location`
--

INSERT INTO `location` (`locationId`, `buildingName`, `roomNumber`, `roomCapacity`, `roomType`) VALUES
(1, 'D - Block', '301', 200, 'A'),
(2, 'D - Block', '302', 250, 'A'),
(3, 'D - Block', '303', 200, 'A'),
(4, 'Main', '401', 60, 'A'),
(5, 'Main', '201', 60, 'A'),
(6, 'Main', '501', 300, 'A'),
(45, 'Main', '402', 65, 'Lab');

-- --------------------------------------------------------

--
-- Table structure for table `moduletag`
--

CREATE TABLE `moduletag` (
  `indexId` int(5) NOT NULL,
  `name` varchar(50) NOT NULL,
  `code` int(5) NOT NULL,
  `type01` varchar(50) NOT NULL,
  `type01Code` int(5) NOT NULL,
  `type02` varchar(50) NOT NULL,
  `type02Code` int(5) NOT NULL,
  `type03` varchar(50) NOT NULL,
  `type03Code` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `notavailabletime`
--

CREATE TABLE `notavailabletime` (
  `ID` int(11) NOT NULL,
  `type` varchar(20) NOT NULL,
  `typeId` varchar(20) NOT NULL,
  `Day` varchar(20) NOT NULL,
  `startTime` varchar(10) NOT NULL,
  `endTime` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notavailabletime`
--

INSERT INTO `notavailabletime` (`ID`, `type`, `typeId`, `Day`, `startTime`, `endTime`) VALUES
(1, 'Session', '4', 'Monday', '4', '6'),
(2, 'Lecturer', '1308', 'Monday', '20:30:00', '21:30:00'),
(3, 'Lecturer', '1309', 'Wednesday', '10:0:00', '11:0:00');

-- --------------------------------------------------------

--
-- Table structure for table `overlape`
--

CREATE TABLE `overlape` (
  `overID` int(10) NOT NULL,
  `overYear` varchar(255) NOT NULL,
  `over_Semester` varchar(255) NOT NULL,
  `overSpecial` varchar(255) NOT NULL,
  `overTag` varchar(255) NOT NULL,
  `overCode1` varchar(255) NOT NULL,
  `overCode2` varchar(255) NOT NULL,
  `overCode3` varchar(255) NOT NULL,
  `overCode4` varchar(255) NOT NULL,
  `overSe1` varchar(255) NOT NULL,
  `overSe2` varchar(255) NOT NULL,
  `overSe3` varchar(255) NOT NULL,
  `overSe4` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `overlape`
--

INSERT INTO `overlape` (`overID`, `overYear`, `over_Semester`, `overSpecial`, `overTag`, `overCode1`, `overCode2`, `overCode3`, `overCode4`, `overSe1`, `overSe2`, `overSe3`, `overSe4`) VALUES
(1, 'S1', 'sdd', '', '', '', '', 'df', '', '', '', '', ''),
(2, '2.Y3S1.SE.05', 'It2040', 'It2040', 'It2040', 'It2040', 'It2040', 'DS', 'DS', '', '', '', ''),
(3, 'Y1', 'S1', 'IT', 'tute', 'It2040', 'IT2030', 'DS4010', 'SE3050', '2', '2', '2', '2');

-- --------------------------------------------------------

--
-- Table structure for table `parallel`
--

CREATE TABLE `parallel` (
  `paralleID` int(10) NOT NULL,
  `parYear` varchar(255) NOT NULL,
  `parSemester` varchar(255) NOT NULL,
  `parSpecial` varchar(255) NOT NULL,
  `parTag` varchar(255) NOT NULL,
  `parCode1` varchar(255) NOT NULL,
  `parCode2` varchar(255) NOT NULL,
  `parCode3` varchar(255) NOT NULL,
  `parCode4` varchar(255) NOT NULL,
  `parSession1` varchar(255) NOT NULL,
  `parSession2` varchar(255) NOT NULL,
  `parSession3` varchar(255) NOT NULL,
  `parSession4` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `parallel`
--

INSERT INTO `parallel` (`paralleID`, `parYear`, `parSemester`, `parSpecial`, `parTag`, `parCode1`, `parCode2`, `parCode3`, `parCode4`, `parSession1`, `parSession2`, `parSession3`, `parSession4`) VALUES
(1, 'Y1', 'S2', 'df', 'sdf', '100', '34', '223', '22', '', '', '', 0),
(2, '', '', '', '', '', '', '', '', '', '', '', 0),
(3, '', '', '', '', '', '', '', '', '', '', '', 0),
(4, 'Y2', 'S1', 'DS', 'tute', 'It2040', 'It2040', 'It2040', 'It2040', '', '', '', 0),
(5, 'Y2', 'S2', 'IT', 'tute', 'It2040', 'It2040', 'It2040', 'It2040', '', '', '', 0),
(6, 'Y1', 'S1', 'IT', 'tute', 'It2040', 'SE3050', 'IT1020', 'IT2030', '', '', '', 0),
(7, 'Y1', 'S1', 'IT', 'tute', 'It2040', 'It2040', 'It2040', 'It2040', '2', '2', '2', 2);

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE `session` (
  `session_ID` int(11) NOT NULL,
  `lec1` varchar(50) NOT NULL,
  `lec2` varchar(50) NOT NULL,
  `sub_code` char(10) NOT NULL,
  `sub_name` varchar(10) NOT NULL,
  `stu_count` int(11) NOT NULL,
  `tag` varchar(20) NOT NULL,
  `duration` int(11) NOT NULL,
  `Maingroup` char(10) NOT NULL,
  `Subgroup` varchar(11) NOT NULL,
  `full_grpID` char(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`session_ID`, `lec1`, `lec2`, `sub_code`, `sub_name`, `stu_count`, `tag`, `duration`, `Maingroup`, `Subgroup`, `full_grpID`) VALUES
(7, 'Mr.Kamal', '-', 'IT3040', 'ITPM', 120, 'Lecture', 2, 'Y3S1.IM.01', '-', 'Y3S1.IM.01.-'),
(8, 'Mr.Kamal', 'Miss.Devindi', 'IT3040', 'ITPM', 120, 'Tutorial', 1, 'Y3S1.IM.01', '-', 'Y3S1.IM.01.-'),
(9, 'Mr.Vimal', '-', 'SE3080', 'SPM', 120, 'Lecture', 2, 'Y3S1.IM.01', '-', 'Y3S1.IM.01.-'),
(10, 'Mr.Vimal', '-', 'SE3080', 'SPM', 120, 'Tutorial', 1, 'Y3S1.IM.01', '-', 'Y3S1.IM.01.-'),
(11, 'Ms.Anna', 'Mr.Anuruddha', 'IT2020', 'DS', 120, 'Lecture', 2, 'Y3S1.IM.01', '-', 'Y3S1.IM.01.-'),
(12, 'Ms.Anna', 'Miss.Anuththara', 'IT2020', 'DS', 120, 'Lab', 2, 'Y3S1.IM.01', '1', 'Y3S1.IM.01.1');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sID` varchar(10) NOT NULL,
  `sYear` varchar(50) NOT NULL,
  `sSemester` varchar(50) NOT NULL,
  `sProgramme` varchar(50) NOT NULL,
  `sMaiGroupNumber` varchar(50) NOT NULL,
  `sSubGroupNumber` varchar(50) NOT NULL,
  `sMainGroupId` varchar(50) NOT NULL,
  `sSubGroupId` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sID`, `sYear`, `sSemester`, `sProgramme`, `sMaiGroupNumber`, `sSubGroupNumber`, `sMainGroupId`, `sSubGroupId`) VALUES
('10', 'Y2', 'S2', 'CSSE', '01', '4', 'Y2S2.CSSE.01', 'Y2S2.CSSE.01.4'),
('11', 'Y3', 'S1', 'IM', '01', '1', 'Y3S1.IM.01', 'Y3S1.IM.01.1'),
('12', 'Y3', 'S1', 'IM', '01', '2', 'Y3S1.IM.01', 'Y3S1.IM.01.2'),
('13', 'Y3', 'S2', 'IM', '01', '1', 'Y3S2.IM.01', 'Y3S2.IM.01.1'),
('14', 'Y3', 'S2', 'IM', '01', '2', 'Y3S2.IM.01', 'Y3S2.IM.01.2'),
('15', 'Y3', 'S2', 'IM', '01', '3', 'Y3S2.IM.01', 'Y3S2.IM.01.3'),
('16', 'Y4', 'S1', 'CSE', '01', '1', 'Y4S1.CSE.01', 'Y4S1.CSE.01.1'),
('17', 'Y4', 'S1', 'CSE', '01', '2', 'Y4S1.CSE.01', 'Y4S1.CSE.01.2'),
('18', 'Y4', 'S2', 'CSE', '01', '1', 'Y4S2.CSE.01', 'Y4S2.CSE.01.1'),
('19', 'Y4', 'S2', 'CSE', '01', '2', 'Y4S2.CSE.01', 'Y4S2.CSE.01.2'),
('2', 'Y1', 'S1', 'IT', '01', '3', 'Y1S1.IT.01', 'Y1S1.IT.01.3'),
('20', 'Y4', 'S2', 'CSE', '01', '3', 'Y4S2.CSE.01', 'Y4S2.CSE.01.3'),
('3', 'Y1', 'S2', 'IT', '01', '1', 'Y1S2.IT.01', 'Y1S2.IT.01.1'),
('4', 'Y1', 'S2', 'IT', '01', '2', 'Y1S2.IT.01', 'Y1S2.IT.01.2'),
('5', 'Y2', 'S1', 'CSSE', '01', '1', 'Y2S1.CSSE.01', 'Y2S1.CSSE.01.1'),
('6', 'Y2', 'S1', 'CSSE', '01', '2', 'Y2S1.CSSE.01', 'Y2S1.CSSE.01.2'),
('7', 'Y2', 'S2', 'CSSE', '01', '1', 'Y2S2.CSSE.01', 'Y2S2.CSSE.01.1'),
('8', 'Y2', 'S2', 'CSSE', '01', '2', 'Y2S2.CSSE.01', 'Y2S2.CSSE.01.2 '),
('9', 'Y2', 'S2', 'CSSE', '01', '3', 'Y2S2.CSSE.01', 'Y2S2.CSSE.01.3'),
('90', 'Y3', 'S1', 'IT', '12', '1', 'Y3S1.IT.12', 'Y3S1.IT.12.1');

-- --------------------------------------------------------

--
-- Table structure for table `student_consecutive`
--

CREATE TABLE `student_consecutive` (
  `Con_Stu_ID` int(10) NOT NULL,
  `con_Stu_GroupID` varchar(255) NOT NULL,
  `con_Stu_Code1` varchar(255) NOT NULL,
  `con_Stu_Code2` varchar(255) NOT NULL,
  `con_Stu_Code3` varchar(255) NOT NULL,
  `con_Stu_Se1` varchar(255) NOT NULL,
  `con_Stu_Se2` varchar(255) NOT NULL,
  `con_Stu_Se3` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student_consecutive`
--

INSERT INTO `student_consecutive` (`Con_Stu_ID`, `con_Stu_GroupID`, `con_Stu_Code1`, `con_Stu_Code2`, `con_Stu_Code3`, `con_Stu_Se1`, `con_Stu_Se2`, `con_Stu_Se3`) VALUES
(1, 'Y1S12', 'h', '', '', '', '', ''),
(2, 'Y1S110.1', 'SE', 'Sa', 'hh', '', '', ''),
(3, 'null', 'null', 'null', 'null', '', '', ''),
(4, 'null', 'null', 'null', 'null', '', '', ''),
(5, 'null', 'null', 'null', 'null', '', '', ''),
(6, 'null', 'null', 'null', 'null', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

CREATE TABLE `subject` (
  `subject_code` varchar(10) NOT NULL,
  `subject_name` varchar(20) NOT NULL,
  `offered_year` varchar(10) NOT NULL,
  `offered_semester` varchar(5) NOT NULL,
  `no_of_lec_hours` int(3) NOT NULL,
  `no_of_tute_hours` int(3) NOT NULL,
  `no_of_lab_hours` int(3) NOT NULL,
  `no_of_evalu_hours` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subject_code`, `subject_name`, `offered_year`, `offered_semester`, `no_of_lec_hours`, `no_of_tute_hours`, `no_of_lab_hours`, `no_of_evalu_hours`) VALUES
('IE4050', 'SE', 'Year 4', '1st', 2, 1, 0, 2),
('IT2020', 'DS', 'Year 3', '1st', 2, 1, 0, 2),
('IT2021', 'ML', 'Year 2', '1st', 2, 1, 2, 0),
('IT3030', 'DS', 'Year 1', '1st', 2, 1, 0, 2),
('IT3040', 'ITPM', 'Year 3', '1st', 2, 1, 0, 2),
('IT6789', 'OOC', 'Year 4', '1st', 2, 1, 2, 0),
('IT9090', 'EAD', 'Year 3', '1st', 2, 1, 2, 0),
('SE3080', 'SPM', 'Year 3', '1st', 2, 1, 0, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tags`
--

CREATE TABLE `tags` (
  `TagID` int(5) NOT NULL,
  `moTypeCode` varchar(10) NOT NULL,
  `moType` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tags`
--

INSERT INTO `tags` (`TagID`, `moTypeCode`, `moType`) VALUES
(1, '005', 'Lecture'),
(3, '001', 'Tutorial'),
(4, '004', 'Lab');

-- --------------------------------------------------------

--
-- Table structure for table `workdays`
--

CREATE TABLE `workdays` (
  `id` int(100) NOT NULL,
  `Noworkday` int(5) NOT NULL,
  `workday` varchar(100) NOT NULL,
  `worktime` varchar(10) NOT NULL,
  `timeslot` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workdays`
--

INSERT INTO `workdays` (`id`, `Noworkday`, `workday`, `worktime`, `timeslot`) VALUES
(12, 0, '', '0,0', 'Thirty minutes time slots ');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add suitable rooms for group and sub groups`
--
ALTER TABLE `add suitable rooms for group and sub groups`
  ADD PRIMARY KEY (`Add_Su_G_SG_ID`);

--
-- Indexes for table `add suitable rooms for lecture and tags`
--
ALTER TABLE `add suitable rooms for lecture and tags`
  ADD PRIMARY KEY (`Add_Su_L_SG_ID`);

--
-- Indexes for table `add suitable rooms for subject and tags`
--
ALTER TABLE `add suitable rooms for subject and tags`
  ADD PRIMARY KEY (`Add_Su_Sub_Tag_ID`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`lec_id`);

--
-- Indexes for table `lecturers_consecutive`
--
ALTER TABLE `lecturers_consecutive`
  ADD PRIMARY KEY (`con_Lec_ID`);

--
-- Indexes for table `location`
--
ALTER TABLE `location`
  ADD PRIMARY KEY (`locationId`);

--
-- Indexes for table `moduletag`
--
ALTER TABLE `moduletag`
  ADD PRIMARY KEY (`indexId`);

--
-- Indexes for table `notavailabletime`
--
ALTER TABLE `notavailabletime`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `overlape`
--
ALTER TABLE `overlape`
  ADD PRIMARY KEY (`overID`);

--
-- Indexes for table `parallel`
--
ALTER TABLE `parallel`
  ADD PRIMARY KEY (`paralleID`);

--
-- Indexes for table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`session_ID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sID`);

--
-- Indexes for table `student_consecutive`
--
ALTER TABLE `student_consecutive`
  ADD PRIMARY KEY (`Con_Stu_ID`);

--
-- Indexes for table `subject`
--
ALTER TABLE `subject`
  ADD PRIMARY KEY (`subject_code`);

--
-- Indexes for table `tags`
--
ALTER TABLE `tags`
  ADD PRIMARY KEY (`TagID`);

--
-- Indexes for table `workdays`
--
ALTER TABLE `workdays`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add suitable rooms for group and sub groups`
--
ALTER TABLE `add suitable rooms for group and sub groups`
  MODIFY `Add_Su_G_SG_ID` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `add suitable rooms for lecture and tags`
--
ALTER TABLE `add suitable rooms for lecture and tags`
  MODIFY `Add_Su_L_SG_ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `add suitable rooms for subject and tags`
--
ALTER TABLE `add suitable rooms for subject and tags`
  MODIFY `Add_Su_Sub_Tag_ID` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lecturers_consecutive`
--
ALTER TABLE `lecturers_consecutive`
  MODIFY `con_Lec_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `notavailabletime`
--
ALTER TABLE `notavailabletime`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `overlape`
--
ALTER TABLE `overlape`
  MODIFY `overID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `parallel`
--
ALTER TABLE `parallel`
  MODIFY `paralleID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `session`
--
ALTER TABLE `session`
  MODIFY `session_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `student_consecutive`
--
ALTER TABLE `student_consecutive`
  MODIFY `Con_Stu_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `workdays`
--
ALTER TABLE `workdays`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
