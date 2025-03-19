-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmjg491
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmjg491/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmjg491/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmjg491/upload/picture3.jpg'),(4,'picture4','http://localhost:8080/ssmjg491/upload/picture4.jpg'),(5,'picture5','http://localhost:8080/ssmjg491/upload/picture5.jpg'),(6,'homepage','http://localhost:8080/ssmjg491/upload/1608795168232.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795566579 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (1,'2020-12-24 07:20:59',1,'用户名1','留言内容1','回复内容1'),(2,'2020-12-24 07:20:59',2,'用户名2','留言内容2','回复内容2'),(3,'2020-12-24 07:20:59',3,'用户名3','留言内容3','回复内容3'),(4,'2020-12-24 07:20:59',4,'用户名4','留言内容4','回复内容4'),(5,'2020-12-24 07:20:59',5,'用户名5','留言内容5','回复内容5'),(6,'2020-12-24 07:20:59',6,'用户名6','留言内容6','回复内容6'),(1608795230216,'2020-12-24 07:33:49',1608795046631,'222','1111','22222'),(1608795566578,'2020-12-24 07:39:26',1608795014624,'111','123','466');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795150872 DEFAULT CHARSET=utf8 COMMENT='新闻资讯';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,'2020-12-24 07:20:59','标题1','http://localhost:8080/ssmjg491/upload/news_picture1.jpg','内容1'),(2,'2020-12-24 07:20:59','标题2','http://localhost:8080/ssmjg491/upload/news_picture2.jpg','内容2'),(3,'2020-12-24 07:20:59','标题3','http://localhost:8080/ssmjg491/upload/news_picture3.jpg','内容3'),(4,'2020-12-24 07:20:59','标题4','http://localhost:8080/ssmjg491/upload/news_picture4.jpg','内容4'),(5,'2020-12-24 07:20:59','标题5','http://localhost:8080/ssmjg491/upload/news_picture5.jpg','内容5'),(6,'2020-12-24 07:20:59','标题6','http://localhost:8080/ssmjg491/upload/news_picture6.jpg','内容6'),(1608795150871,'2020-12-24 07:32:30','最新资讯','http://localhost:8080/ssmjg491/upload/1608795143270.jpg','<p>范德萨发dfdgfdgf <img src=\"http://localhost:8080/ssmjg491/upload/1608795148868.jpg\"></p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qingjiaxinxi`
--

DROP TABLE IF EXISTS `qingjiaxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qingjiaxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `qingjiayuanyin` longtext COMMENT '请假原因',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `xueshengzhanghao` varchar(200) DEFAULT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) DEFAULT NULL COMMENT '学生姓名',
  `qingjiashijian` date DEFAULT NULL COMMENT '请假时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795395147 DEFAULT CHARSET=utf8 COMMENT='请假信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qingjiaxinxi`
--

LOCK TABLES `qingjiaxinxi` WRITE;
/*!40000 ALTER TABLE `qingjiaxinxi` DISABLE KEYS */;
INSERT INTO `qingjiaxinxi` VALUES (1,'2020-12-24 07:20:59','请假原因1','标题1','学生账号1','学生姓名1','2020-12-24','否',''),(2,'2020-12-24 07:20:59','请假原因2','标题2','学生账号2','学生姓名2','2020-12-24','否',''),(3,'2020-12-24 07:20:59','请假原因3','标题3','学生账号3','学生姓名3','2020-12-24','否',''),(4,'2020-12-24 07:20:59','请假原因4','标题4','学生账号4','学生姓名4','2020-12-24','否',''),(5,'2020-12-24 07:20:59','请假原因5','标题5','学生账号5','学生姓名5','2020-12-24','否',''),(6,'2020-12-24 07:20:59','请假原因6','标题6','学生账号6','学生姓名6','2020-12-24','否',''),(1608795270228,'2020-12-24 07:34:29','家里有事','我要请假','222','胡集','2020-12-24','是','11'),(1608795395146,'2020-12-24 07:36:34','家里有急事','我要请假','111','胡月','2020-12-24','是','11');
/*!40000 ALTER TABLE `qingjiaxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeibaoxiu`
--

DROP TABLE IF EXISTS `shebeibaoxiu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeibaoxiu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `shebeimingcheng` varchar(200) DEFAULT NULL COMMENT '设备名称',
  `qingkuangshuoming` longtext COMMENT '情况说明',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795419633 DEFAULT CHARSET=utf8 COMMENT='设备报修';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeibaoxiu`
--

LOCK TABLES `shebeibaoxiu` WRITE;
/*!40000 ALTER TABLE `shebeibaoxiu` DISABLE KEYS */;
INSERT INTO `shebeibaoxiu` VALUES (1,'2020-12-24 07:20:59','位置1','标题1','设备名称1','情况说明1','2020-12-24','否',''),(2,'2020-12-24 07:20:59','位置2','标题2','设备名称2','情况说明2','2020-12-24','否',''),(3,'2020-12-24 07:20:59','位置3','标题3','设备名称3','情况说明3','2020-12-24','否',''),(4,'2020-12-24 07:20:59','位置4','标题4','设备名称4','情况说明4','2020-12-24','否',''),(5,'2020-12-24 07:20:59','位置5','标题5','设备名称5','情况说明5','2020-12-24','否',''),(6,'2020-12-24 07:20:59','位置6','标题6','设备名称6','情况说明6','2020-12-24','否',''),(1608795419632,'2020-12-24 07:36:59','111','灯不亮了','灯','<p>灯不亮了</p>','2020-12-24','是','已修好');
/*!40000 ALTER TABLE `shebeibaoxiu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushehao`
--

DROP TABLE IF EXISTS `sushehao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushehao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushehao` varchar(200) NOT NULL COMMENT '宿舍号',
  PRIMARY KEY (`id`),
  UNIQUE KEY `sushehao` (`sushehao`)
) ENGINE=InnoDB AUTO_INCREMENT=1608794984812 DEFAULT CHARSET=utf8 COMMENT='宿舍号';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushehao`
--

LOCK TABLES `sushehao` WRITE;
/*!40000 ALTER TABLE `sushehao` DISABLE KEYS */;
INSERT INTO `sushehao` VALUES (1,'2020-12-24 07:20:59','宿舍号1'),(2,'2020-12-24 07:20:59','宿舍号2'),(3,'2020-12-24 07:20:59','宿舍号3'),(4,'2020-12-24 07:20:59','宿舍号4'),(5,'2020-12-24 07:20:59','宿舍号5'),(6,'2020-12-24 07:20:59','宿舍号6'),(1608794978094,'2020-12-24 07:29:37','101'),(1608794984811,'2020-12-24 07:29:44','213');
/*!40000 ALTER TABLE `sushehao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `susherenyuandiaodong`
--

DROP TABLE IF EXISTS `susherenyuandiaodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `susherenyuandiaodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `sushezhangzhanghao` varchar(200) DEFAULT NULL COMMENT '宿舍长账号',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `qingkuangshuoming` longtext COMMENT '情况说明',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795348726 DEFAULT CHARSET=utf8 COMMENT='宿舍人员调动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `susherenyuandiaodong`
--

LOCK TABLES `susherenyuandiaodong` WRITE;
/*!40000 ALTER TABLE `susherenyuandiaodong` DISABLE KEYS */;
INSERT INTO `susherenyuandiaodong` VALUES (1,'2020-12-24 07:20:59','标题1','宿舍长账号1','宿舍号1','情况说明1','2020-12-24','否',''),(2,'2020-12-24 07:20:59','标题2','宿舍长账号2','宿舍号2','情况说明2','2020-12-24','否',''),(3,'2020-12-24 07:20:59','标题3','宿舍长账号3','宿舍号3','情况说明3','2020-12-24','否',''),(4,'2020-12-24 07:20:59','标题4','宿舍长账号4','宿舍号4','情况说明4','2020-12-24','否',''),(5,'2020-12-24 07:20:59','标题5','宿舍长账号5','宿舍号5','情况说明5','2020-12-24','否',''),(6,'2020-12-24 07:20:59','标题6','宿舍长账号6','宿舍号6','情况说明6','2020-12-24','否',''),(1608795348725,'2020-12-24 07:35:48','胡月外宿','222','101','胡月外宿','2020-12-24','是','11');
/*!40000 ALTER TABLE `susherenyuandiaodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `susherenyuanshangbao`
--

DROP TABLE IF EXISTS `susherenyuanshangbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `susherenyuanshangbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `quexirenshu` varchar(200) DEFAULT NULL COMMENT '缺席人数',
  `sushezhangzhanghao` varchar(200) DEFAULT NULL COMMENT '宿舍长账号',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `beizhu` longtext COMMENT '备注',
  `shangbaoshijian` date DEFAULT NULL COMMENT '上报时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795285292 DEFAULT CHARSET=utf8 COMMENT='宿舍人员上报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `susherenyuanshangbao`
--

LOCK TABLES `susherenyuanshangbao` WRITE;
/*!40000 ALTER TABLE `susherenyuanshangbao` DISABLE KEYS */;
INSERT INTO `susherenyuanshangbao` VALUES (1,'2020-12-24 07:20:59','0','宿舍长账号1','宿舍号1','备注1','2020-12-24'),(2,'2020-12-24 07:20:59','0','宿舍长账号2','宿舍号2','备注2','2020-12-24'),(3,'2020-12-24 07:20:59','0','宿舍长账号3','宿舍号3','备注3','2020-12-24'),(4,'2020-12-24 07:20:59','0','宿舍长账号4','宿舍号4','备注4','2020-12-24'),(5,'2020-12-24 07:20:59','0','宿舍长账号5','宿舍号5','备注5','2020-12-24'),(6,'2020-12-24 07:20:59','0','宿舍长账号6','宿舍号6','备注6','2020-12-24'),(1608795285291,'2020-12-24 07:34:44','0','222','101','无','2020-12-24');
/*!40000 ALTER TABLE `susherenyuanshangbao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushetonggao`
--

DROP TABLE IF EXISTS `sushetonggao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushetonggao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `neirong` longtext COMMENT '内容',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795081513 DEFAULT CHARSET=utf8 COMMENT='宿舍通告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushetonggao`
--

LOCK TABLES `sushetonggao` WRITE;
/*!40000 ALTER TABLE `sushetonggao` DISABLE KEYS */;
INSERT INTO `sushetonggao` VALUES (1,'2020-12-24 07:20:59','标题1','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian1.jpg','内容1','2020-12-24'),(2,'2020-12-24 07:20:59','标题2','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian2.jpg','内容2','2020-12-24'),(3,'2020-12-24 07:20:59','标题3','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian3.jpg','内容3','2020-12-24'),(4,'2020-12-24 07:20:59','标题4','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian4.jpg','内容4','2020-12-24'),(5,'2020-12-24 07:20:59','标题5','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian5.jpg','内容5','2020-12-24'),(6,'2020-12-24 07:20:59','标题6','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian6.jpg','内容6','2020-12-24'),(1608795081512,'2020-12-24 07:31:21','最新通告','http://localhost:8080/ssmjg491/upload/1608795071571.jpg','<p>发打发第三方第三方<img src=\"http://localhost:8080/ssmjg491/upload/1608795080836.jpg\"></p>','2020-12-24');
/*!40000 ALTER TABLE `sushetonggao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sushezhang`
--

DROP TABLE IF EXISTS `sushezhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sushezhang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `sushezhangzhanghao` varchar(200) NOT NULL COMMENT '宿舍长账号',
  `sushezhangxingming` varchar(200) NOT NULL COMMENT '宿舍长姓名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`),
  UNIQUE KEY `sushezhangzhanghao` (`sushezhangzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795046632 DEFAULT CHARSET=utf8 COMMENT='宿舍长';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sushezhang`
--

LOCK TABLES `sushezhang` WRITE;
/*!40000 ALTER TABLE `sushezhang` DISABLE KEYS */;
INSERT INTO `sushezhang` VALUES (1,'2020-12-24 07:20:59','宿舍长1','宿舍长姓名1','123456','男','宿舍号1','13823888881','773890001@qq.com'),(2,'2020-12-24 07:20:59','宿舍长2','宿舍长姓名2','123456','男','宿舍号2','13823888882','773890002@qq.com'),(3,'2020-12-24 07:20:59','宿舍长3','宿舍长姓名3','123456','男','宿舍号3','13823888883','773890003@qq.com'),(4,'2020-12-24 07:20:59','宿舍长4','宿舍长姓名4','123456','男','宿舍号4','13823888884','773890004@qq.com'),(5,'2020-12-24 07:20:59','宿舍长5','宿舍长姓名5','123456','男','宿舍号5','13823888885','773890005@qq.com'),(6,'2020-12-24 07:20:59','宿舍长6','宿舍长姓名6','123456','男','宿舍号6','13823888886','773890006@qq.com'),(1608795046631,'2020-12-24 07:30:46','222','胡集','222','女','101','13213212312','146556562@qq.com');
/*!40000 ALTER TABLE `sushezhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','eqllwwwn3mx20fm9a9nj3dywm7c1o4gh','2020-12-24 07:29:24','2020-12-24 08:39:48'),(2,1608795046631,'222','sushezhang','宿舍长','8fci9mj4mpf1gj1ui0fsfn8v4lm3pm3b','2020-12-24 07:33:13','2020-12-24 08:38:35'),(3,1608795014624,'111','xuesheng','学生','e6qxdvrhdupgnwtgr60n3g1o7urhy6ps','2020-12-24 07:36:03','2020-12-24 08:40:05');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2020-12-24 07:20:59');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weishengtongbao`
--

DROP TABLE IF EXISTS `weishengtongbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weishengtongbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jibenqingkuang` longtext COMMENT '基本情况',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `cunzaiwenti` longtext COMMENT '存在问题',
  `jidianyaoqiu` longtext COMMENT '几点要求',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795118688 DEFAULT CHARSET=utf8 COMMENT='卫生通报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weishengtongbao`
--

LOCK TABLES `weishengtongbao` WRITE;
/*!40000 ALTER TABLE `weishengtongbao` DISABLE KEYS */;
INSERT INTO `weishengtongbao` VALUES (1,'2020-12-24 07:20:59','基本情况1','标题1','存在问题1','几点要求1','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian1.jpg','2020-12-24'),(2,'2020-12-24 07:20:59','基本情况2','标题2','存在问题2','几点要求2','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian2.jpg','2020-12-24'),(3,'2020-12-24 07:20:59','基本情况3','标题3','存在问题3','几点要求3','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian3.jpg','2020-12-24'),(4,'2020-12-24 07:20:59','基本情况4','标题4','存在问题4','几点要求4','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian4.jpg','2020-12-24'),(5,'2020-12-24 07:20:59','基本情况5','标题5','存在问题5','几点要求5','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian5.jpg','2020-12-24'),(6,'2020-12-24 07:20:59','基本情况6','标题6','存在问题6','几点要求6','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian6.jpg','2020-12-24'),(1608795118687,'2020-12-24 07:31:58','富士达范德萨范德萨','12周卫生通报','<p>富士达发的发的</p>','<p>辅导辅导辅导</p>','http://localhost:8080/ssmjg491/upload/1608795110700.jpg','2020-12-24');
/*!40000 ALTER TABLE `weishengtongbao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengzhanghao` varchar(200) NOT NULL COMMENT '学生账号',
  `xueshengxingming` varchar(200) NOT NULL COMMENT '学生姓名',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `youxiang` varchar(200) NOT NULL COMMENT '邮箱',
  `lianxidianhua` varchar(200) NOT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueshengzhanghao` (`xueshengzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795014625 DEFAULT CHARSET=utf8 COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (1,'2020-12-24 07:20:59','学生1','学生姓名1','宿舍号1','123456','男','773890001@qq.com','13823888881'),(2,'2020-12-24 07:20:59','学生2','学生姓名2','宿舍号2','123456','男','773890002@qq.com','13823888882'),(3,'2020-12-24 07:20:59','学生3','学生姓名3','宿舍号3','123456','男','773890003@qq.com','13823888883'),(4,'2020-12-24 07:20:59','学生4','学生姓名4','宿舍号4','123456','男','773890004@qq.com','13823888884'),(5,'2020-12-24 07:20:59','学生5','学生姓名5','宿舍号5','123456','男','773890005@qq.com','13823888885'),(6,'2020-12-24 07:20:59','学生6','学生姓名6','宿舍号6','123456','男','773890006@qq.com','13823888886'),(1608795014624,'2020-12-24 07:30:14','111','胡月','101','111','女','262656@qq.com','13513513525');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `youxiushezhangpingbi`
--

DROP TABLE IF EXISTS `youxiushezhangpingbi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `youxiushezhangpingbi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `sushehao` varchar(200) DEFAULT NULL COMMENT '宿舍号',
  `sheyouxingming` varchar(200) DEFAULT NULL COMMENT '舍友姓名',
  `dangxuanneirong` longtext COMMENT '当选内容',
  `pingbishijian` date DEFAULT NULL COMMENT '评比时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1608795324151 DEFAULT CHARSET=utf8 COMMENT='优秀舍长评比';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `youxiushezhangpingbi`
--

LOCK TABLES `youxiushezhangpingbi` WRITE;
/*!40000 ALTER TABLE `youxiushezhangpingbi` DISABLE KEYS */;
INSERT INTO `youxiushezhangpingbi` VALUES (1,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian1.jpg','宿舍号1','舍友姓名1','当选内容1','2020-12-24'),(2,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian2.jpg','宿舍号2','舍友姓名2','当选内容2','2020-12-24'),(3,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian3.jpg','宿舍号3','舍友姓名3','当选内容3','2020-12-24'),(4,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian4.jpg','宿舍号4','舍友姓名4','当选内容4','2020-12-24'),(5,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian5.jpg','宿舍号5','舍友姓名5','当选内容5','2020-12-24'),(6,'2020-12-24 07:20:59','http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian6.jpg','宿舍号6','舍友姓名6','当选内容6','2020-12-24'),(1608795324150,'2020-12-24 07:35:23','http://localhost:8080/ssmjg491/upload/1608795299393.jpg','101','胡月','<p>整理.打扫第一</p>','2020-12-24');
/*!40000 ALTER TABLE `youxiushezhangpingbi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-24 15:41:50
