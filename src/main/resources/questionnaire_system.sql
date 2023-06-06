CREATE TABLE IF NOT EXISTS  `feedback` (
  `survey_id` int NOT NULL,
  `done_time` datetime(1) NOT NULL,
  `question_id` varchar(45) NOT NULL,
  `question_num` int NOT NULL,
  `user_email` varchar(45) NOT NULL,
  PRIMARY KEY (`survey_id`,`done_time`)
);

CREATE TABLE IF NOT EXISTS `question_info` (
  `question_id` int NOT NULL AUTO_INCREMENT,
  `question_title` varchar(45) NOT NULL,
  `question_describe` varchar(45) NOT NULL,
  `question_type` tinyint NOT NULL,
  `survey_id` int NOT NULL,
  PRIMARY KEY (`question_id`)
);

CREATE TABLE IF NOT EXISTS `question_option` (
  `question_id` int NOT NULL,
  `question_title` varchar(45) NOT NULL,
  `option_content` varchar(45) NOT NULL,
  `question_number` int NOT NULL,
  PRIMARY KEY (`question_id`,`question_title`)
) ;
CREATE TABLE IF NOT EXISTS `survey_info` (
  `survey_id` int NOT NULL AUTO_INCREMENT,
  `survey_title` varchar(45) NOT NULL,
  `start_time` date DEFAULT NULL,
  `end_time` date DEFAULT NULL,
  PRIMARY KEY (`survey_id`)
);
CREATE TABLE IF NOT EXISTS `user` (
  `user_email` varchar(45) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `user_phone` int NOT NULL,
  `user_age` int NOT NULL,
  PRIMARY KEY (`user_email`)
) 
