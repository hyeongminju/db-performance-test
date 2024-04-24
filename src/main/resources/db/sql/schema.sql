CREATE TABLE `membership` (
	`membership_id` VARCHAR(10) NOT NULL DEFAULT '0',
	`member_id` VARCHAR(9) NOT NULL DEFAULT '0',
	`created_at` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (`membership_id`)
);
