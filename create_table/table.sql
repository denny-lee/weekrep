CREATE TABLE `weekreport` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `dep` varchar(128) DEFAULT NULL,
  `thisWeek` varchar(2000) DEFAULT NULL,
  `risk` varchar(1000) DEFAULT NULL,
  `nextWeek` varchar(2000) DEFAULT NULL,
  `gain` varchar(1000) DEFAULT NULL,
  `isDelete` tinyint(1) DEFAULT '0',
  `createGmt` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
;

CREATE TABLE `developer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `dep` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;