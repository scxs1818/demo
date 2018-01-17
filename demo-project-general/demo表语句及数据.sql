

DROP TABLE IF EXISTS `class_info`;

CREATE TABLE `class_info` (
  `class_id` varchar(10) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `class_name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `class_info` */

insert  into `class_info`(`class_id`,`user_id`,`class_name`) values ('06-01','1','六年纪1班'),('06-02','2','六年纪2班'),('06-01','3','六年级1班'),('06-02','7','6年级7班');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `name` varchar(50) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `user_id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户名',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;



insert  into `user`(`name`,`age`,`user_id`) values ('zhangsan',10,1),('lisi',5,2),('wangwu',20,3),('wangwu',11,7),('hahaa',101,8);
