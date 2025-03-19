DROP DATABASE IF EXISTS ssmjg491;

CREATE DATABASE ssmjg491 default character set utf8mb4 collate utf8mb4_general_ci;

USE ssmjg491;

DROP TABLE IF EXISTS `xuesheng`;

CREATE TABLE `xuesheng` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`xueshengzhanghao` varchar(200) NOT NULL UNIQUE   COMMENT '学生账号',
	`xueshengxingming` varchar(200) NOT NULL   COMMENT '学生姓名',
	`sushehao` varchar(200)    COMMENT '宿舍号',
	`mima` varchar(200) NOT NULL   COMMENT '密码',
	`xingbie` varchar(200)    COMMENT '性别',
	`youxiang` varchar(200) NOT NULL   COMMENT '邮箱',
	`lianxidianhua` varchar(200) NOT NULL   COMMENT '联系电话',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生';

INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生1','学生姓名1','宿舍号1','123456','男','773890001@qq.com','13823888881');
INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生2','学生姓名2','宿舍号2','123456','男','773890002@qq.com','13823888882');
INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生3','学生姓名3','宿舍号3','123456','男','773890003@qq.com','13823888883');
INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生4','学生姓名4','宿舍号4','123456','男','773890004@qq.com','13823888884');
INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生5','学生姓名5','宿舍号5','123456','男','773890005@qq.com','13823888885');
INSERT INTO xuesheng(xueshengzhanghao,xueshengxingming,sushehao,mima,xingbie,youxiang,lianxidianhua) VALUES('学生6','学生姓名6','宿舍号6','123456','男','773890006@qq.com','13823888886');

DROP TABLE IF EXISTS `sushehao`;

CREATE TABLE `sushehao` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`sushehao` varchar(200) NOT NULL UNIQUE   COMMENT '宿舍号',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宿舍号';

INSERT INTO sushehao(sushehao) VALUES('宿舍号1');
INSERT INTO sushehao(sushehao) VALUES('宿舍号2');
INSERT INTO sushehao(sushehao) VALUES('宿舍号3');
INSERT INTO sushehao(sushehao) VALUES('宿舍号4');
INSERT INTO sushehao(sushehao) VALUES('宿舍号5');
INSERT INTO sushehao(sushehao) VALUES('宿舍号6');

DROP TABLE IF EXISTS `sushezhang`;

CREATE TABLE `sushezhang` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`sushezhangzhanghao` varchar(200) NOT NULL UNIQUE   COMMENT '宿舍长账号',
	`sushezhangxingming` varchar(200) NOT NULL   COMMENT '宿舍长姓名',
	`mima` varchar(200) NOT NULL   COMMENT '密码',
	`xingbie` varchar(200)    COMMENT '性别',
	`sushehao` varchar(200)    COMMENT '宿舍号',
	`lianxidianhua` varchar(200)    COMMENT '联系电话',
	`youxiang` varchar(200)    COMMENT '邮箱',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宿舍长';

INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长1','宿舍长姓名1','123456','男','宿舍号1','13823888881','773890001@qq.com');
INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长2','宿舍长姓名2','123456','男','宿舍号2','13823888882','773890002@qq.com');
INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长3','宿舍长姓名3','123456','男','宿舍号3','13823888883','773890003@qq.com');
INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长4','宿舍长姓名4','123456','男','宿舍号4','13823888884','773890004@qq.com');
INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长5','宿舍长姓名5','123456','男','宿舍号5','13823888885','773890005@qq.com');
INSERT INTO sushezhang(sushezhangzhanghao,sushezhangxingming,mima,xingbie,sushehao,lianxidianhua,youxiang) VALUES('宿舍长6','宿舍长姓名6','123456','男','宿舍号6','13823888886','773890006@qq.com');

DROP TABLE IF EXISTS `sushetonggao`;

CREATE TABLE `sushetonggao` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`biaoti` varchar(200)    COMMENT '标题',
	`fengmian` varchar(200)    COMMENT '封面',
	`neirong` longtext    COMMENT '内容',
	`fabushijian` date    COMMENT '发布时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宿舍通告';

INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题1','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian1.jpg','内容1',CURRENT_TIMESTAMP);
INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题2','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian2.jpg','内容2',CURRENT_TIMESTAMP);
INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题3','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian3.jpg','内容3',CURRENT_TIMESTAMP);
INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题4','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian4.jpg','内容4',CURRENT_TIMESTAMP);
INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题5','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian5.jpg','内容5',CURRENT_TIMESTAMP);
INSERT INTO sushetonggao(biaoti,fengmian,neirong,fabushijian) VALUES('标题6','http://localhost:8080/ssmjg491/upload/sushetonggao_fengmian6.jpg','内容6',CURRENT_TIMESTAMP);

DROP TABLE IF EXISTS `weishengtongbao`;

CREATE TABLE `weishengtongbao` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`jibenqingkuang` longtext    COMMENT '基本情况',
	`biaoti` varchar(200)    COMMENT '标题',
	`cunzaiwenti` longtext    COMMENT '存在问题',
	`jidianyaoqiu` longtext    COMMENT '几点要求',
	`fengmian` varchar(200)    COMMENT '封面',
	`fabushijian` date    COMMENT '发布时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='卫生通报';

INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况1','标题1','存在问题1','几点要求1','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian1.jpg',CURRENT_TIMESTAMP);
INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况2','标题2','存在问题2','几点要求2','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian2.jpg',CURRENT_TIMESTAMP);
INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况3','标题3','存在问题3','几点要求3','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian3.jpg',CURRENT_TIMESTAMP);
INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况4','标题4','存在问题4','几点要求4','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian4.jpg',CURRENT_TIMESTAMP);
INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况5','标题5','存在问题5','几点要求5','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian5.jpg',CURRENT_TIMESTAMP);
INSERT INTO weishengtongbao(jibenqingkuang,biaoti,cunzaiwenti,jidianyaoqiu,fengmian,fabushijian) VALUES('基本情况6','标题6','存在问题6','几点要求6','http://localhost:8080/ssmjg491/upload/weishengtongbao_fengmian6.jpg',CURRENT_TIMESTAMP);

DROP TABLE IF EXISTS `qingjiaxinxi`;

CREATE TABLE `qingjiaxinxi` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`qingjiayuanyin` longtext    COMMENT '请假原因',
	`biaoti` varchar(200)    COMMENT '标题',
	`xueshengzhanghao` varchar(200)    COMMENT '学生账号',
	`xueshengxingming` varchar(200)    COMMENT '学生姓名',
	`qingjiashijian` date    COMMENT '请假时间',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='请假信息';

INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因1','标题1','学生账号1','学生姓名1',CURRENT_TIMESTAMP,'否','');
INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因2','标题2','学生账号2','学生姓名2',CURRENT_TIMESTAMP,'否','');
INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因3','标题3','学生账号3','学生姓名3',CURRENT_TIMESTAMP,'否','');
INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因4','标题4','学生账号4','学生姓名4',CURRENT_TIMESTAMP,'否','');
INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因5','标题5','学生账号5','学生姓名5',CURRENT_TIMESTAMP,'否','');
INSERT INTO qingjiaxinxi(qingjiayuanyin,biaoti,xueshengzhanghao,xueshengxingming,qingjiashijian,sfsh,shhf) VALUES('请假原因6','标题6','学生账号6','学生姓名6',CURRENT_TIMESTAMP,'否','');

DROP TABLE IF EXISTS `shebeibaoxiu`;

CREATE TABLE `shebeibaoxiu` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`weizhi` varchar(200)    COMMENT '位置',
	`biaoti` varchar(200)    COMMENT '标题',
	`shebeimingcheng` varchar(200)    COMMENT '设备名称',
	`qingkuangshuoming` longtext    COMMENT '情况说明',
	`dengjishijian` date    COMMENT '登记时间',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='设备报修';

INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置1','标题1','设备名称1','情况说明1',CURRENT_TIMESTAMP,'否','');
INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置2','标题2','设备名称2','情况说明2',CURRENT_TIMESTAMP,'否','');
INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置3','标题3','设备名称3','情况说明3',CURRENT_TIMESTAMP,'否','');
INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置4','标题4','设备名称4','情况说明4',CURRENT_TIMESTAMP,'否','');
INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置5','标题5','设备名称5','情况说明5',CURRENT_TIMESTAMP,'否','');
INSERT INTO shebeibaoxiu(weizhi,biaoti,shebeimingcheng,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('位置6','标题6','设备名称6','情况说明6',CURRENT_TIMESTAMP,'否','');

DROP TABLE IF EXISTS `susherenyuanshangbao`;

CREATE TABLE `susherenyuanshangbao` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`quexirenshu` varchar(200)    COMMENT '缺席人数',
	`sushezhangzhanghao` varchar(200)    COMMENT '宿舍长账号',
	`sushehao` varchar(200)    COMMENT '宿舍号',
	`beizhu` longtext    COMMENT '备注',
	`shangbaoshijian` date    COMMENT '上报时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宿舍人员上报';

INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号1','宿舍号1','备注1',CURRENT_TIMESTAMP);
INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号2','宿舍号2','备注2',CURRENT_TIMESTAMP);
INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号3','宿舍号3','备注3',CURRENT_TIMESTAMP);
INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号4','宿舍号4','备注4',CURRENT_TIMESTAMP);
INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号5','宿舍号5','备注5',CURRENT_TIMESTAMP);
INSERT INTO susherenyuanshangbao(quexirenshu,sushezhangzhanghao,sushehao,beizhu,shangbaoshijian) VALUES('0','宿舍长账号6','宿舍号6','备注6',CURRENT_TIMESTAMP);

DROP TABLE IF EXISTS `youxiushezhangpingbi`;

CREATE TABLE `youxiushezhangpingbi` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`tupian` varchar(200)    COMMENT '图片',
	`sushehao` varchar(200)    COMMENT '宿舍号',
	`sheyouxingming` varchar(200)    COMMENT '舍友姓名',
	`dangxuanneirong` longtext    COMMENT '当选内容',
	`pingbishijian` date    COMMENT '评比时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优秀舍长评比';

INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian1.jpg','宿舍号1','舍友姓名1','当选内容1',CURRENT_TIMESTAMP);
INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian2.jpg','宿舍号2','舍友姓名2','当选内容2',CURRENT_TIMESTAMP);
INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian3.jpg','宿舍号3','舍友姓名3','当选内容3',CURRENT_TIMESTAMP);
INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian4.jpg','宿舍号4','舍友姓名4','当选内容4',CURRENT_TIMESTAMP);
INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian5.jpg','宿舍号5','舍友姓名5','当选内容5',CURRENT_TIMESTAMP);
INSERT INTO youxiushezhangpingbi(tupian,sushehao,sheyouxingming,dangxuanneirong,pingbishijian) VALUES('http://localhost:8080/ssmjg491/upload/youxiushezhangpingbi_tupian6.jpg','宿舍号6','舍友姓名6','当选内容6',CURRENT_TIMESTAMP);

DROP TABLE IF EXISTS `susherenyuandiaodong`;

CREATE TABLE `susherenyuandiaodong` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`biaoti` varchar(200)    COMMENT '标题',
	`sushezhangzhanghao` varchar(200)    COMMENT '宿舍长账号',
	`sushehao` varchar(200)    COMMENT '宿舍号',
	`qingkuangshuoming` longtext    COMMENT '情况说明',
	`dengjishijian` date    COMMENT '登记时间',
	`sfsh` varchar(200)   default '否' COMMENT '是否审核',
	`shhf` longtext    COMMENT '审核回复',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='宿舍人员调动';

INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题1','宿舍长账号1','宿舍号1','情况说明1',CURRENT_TIMESTAMP,'否','');
INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题2','宿舍长账号2','宿舍号2','情况说明2',CURRENT_TIMESTAMP,'否','');
INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题3','宿舍长账号3','宿舍号3','情况说明3',CURRENT_TIMESTAMP,'否','');
INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题4','宿舍长账号4','宿舍号4','情况说明4',CURRENT_TIMESTAMP,'否','');
INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题5','宿舍长账号5','宿舍号5','情况说明5',CURRENT_TIMESTAMP,'否','');
INSERT INTO susherenyuandiaodong(biaoti,sushezhangzhanghao,sushehao,qingkuangshuoming,dengjishijian,sfsh,shhf) VALUES('标题6','宿舍长账号6','宿舍号6','情况说明6',CURRENT_TIMESTAMP,'否','');

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`title` varchar(200) NOT NULL   COMMENT '标题',
	`picture` varchar(200) NOT NULL   COMMENT '图片',
	`content` longtext NOT NULL   COMMENT '内容',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='新闻资讯';

INSERT INTO news(title,picture,content) VALUES('标题1','http://localhost:8080/ssmjg491/upload/news_picture1.jpg','内容1');
INSERT INTO news(title,picture,content) VALUES('标题2','http://localhost:8080/ssmjg491/upload/news_picture2.jpg','内容2');
INSERT INTO news(title,picture,content) VALUES('标题3','http://localhost:8080/ssmjg491/upload/news_picture3.jpg','内容3');
INSERT INTO news(title,picture,content) VALUES('标题4','http://localhost:8080/ssmjg491/upload/news_picture4.jpg','内容4');
INSERT INTO news(title,picture,content) VALUES('标题5','http://localhost:8080/ssmjg491/upload/news_picture5.jpg','内容5');
INSERT INTO news(title,picture,content) VALUES('标题6','http://localhost:8080/ssmjg491/upload/news_picture6.jpg','内容6');

DROP TABLE IF EXISTS `messages`;

CREATE TABLE `messages` (
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '创建时间',
	`userid` bigint NOT NULL   COMMENT '留言人id',
	`username` varchar(200)    COMMENT '用户名',
	`content` longtext NOT NULL   COMMENT '留言内容',
	`reply` longtext    COMMENT '回复内容',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='留言板';

INSERT INTO messages(userid,username,content,reply) VALUES(1,'用户名1','留言内容1','回复内容1');
INSERT INTO messages(userid,username,content,reply) VALUES(2,'用户名2','留言内容2','回复内容2');
INSERT INTO messages(userid,username,content,reply) VALUES(3,'用户名3','留言内容3','回复内容3');
INSERT INTO messages(userid,username,content,reply) VALUES(4,'用户名4','留言内容4','回复内容4');
INSERT INTO messages(userid,username,content,reply) VALUES(5,'用户名5','留言内容5','回复内容5');
INSERT INTO messages(userid,username,content,reply) VALUES(6,'用户名6','留言内容6','回复内容6');


DROP TABLE IF EXISTS `config`;

CREATE TABLE `config`(
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`name` varchar(100) NOT NULL COMMENT '配置参数名称',
	`value` varchar(100) COMMENT '配置参数值',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='配置文件';

insert into config(id,name,value) values(1,'picture1','http://localhost:8080/ssmjg491/upload/picture1.jpg');
insert into config(id,name,value) values(2,'picture2','http://localhost:8080/ssmjg491/upload/picture2.jpg');
insert into config(id,name,value) values(3,'picture3','http://localhost:8080/ssmjg491/upload/picture3.jpg');
insert into config(id,name,value) values(4,'picture4','http://localhost:8080/ssmjg491/upload/picture4.jpg');
insert into config(id,name,value) values(5,'picture5','http://localhost:8080/ssmjg491/upload/picture5.jpg');
insert into config(id,name) values(6,'homepage');


DROP TABLE IF EXISTS `users`;

CREATE TABLE `users`(
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`password` varchar(100) NOT NULL COMMENT '密码',
	`role` varchar(100) default '管理员' COMMENT '角色',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

insert into users(id,username, password) values(1,'abo','abo');

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token`(
	`id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
	`userid` bigint NOT NULL COMMENT '用户id',
	`username` varchar(100) NOT NULL COMMENT '用户名',
	`tablename` varchar(100) COMMENT '表名',
	`role` varchar(100) COMMENT '角色',
	`token` varchar(200) NOT NULL COMMENT '密码',
	`addtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '新增时间',
	`expiratedtime` timestamp NOT NULL default CURRENT_TIMESTAMP COMMENT '过期时间',
	PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';

