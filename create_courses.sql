CREATE TABLE `course` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`courseTitle` VARCHAR(250),
	`instructorName` VARCHAR(250),
	`credit` INT(5),
	`cost` INT(20),
	`description` TEXT,
	PRIMARY KEY (`id`)
);