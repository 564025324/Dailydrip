/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50562
Source Host           : localhost:3306
Source Database       : dailydrip

Target Server Type    : MYSQL
Target Server Version : 50562
File Encoding         : 65001

Date: 2020-01-08 19:51:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dd_module`
-- ----------------------------
DROP TABLE IF EXISTS `dd_module`;
CREATE TABLE `dd_module` (
`id`  int(20) NOT NULL AUTO_INCREMENT ,
`module_id`  int(20) NOT NULL COMMENT 'Ä£¿éid' ,
`module_name`  varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'Ä£¿éÃû³Æ' ,
`create_time`  datetime NOT NULL ,
`modify_time`  datetime NOT NULL ,
`status`  char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '×´Ì¬' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of dd_module
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `dd_record_main`
-- ----------------------------
DROP TABLE IF EXISTS `dd_record_main`;
CREATE TABLE `dd_record_main` (
`id`  bigint(18) NOT NULL AUTO_INCREMENT COMMENT '×ÔÔöÖ÷¼ü' ,
`m_id`  bigint(18) NOT NULL COMMENT 'Ö÷±íid' ,
`module_id`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'Ä£¿éid' ,
`m_subject`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'Ö÷Ìâ' ,
`m_desc`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ÃèÊö' ,
`m_memo`  varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '±¸×¢' ,
`create_userid`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '´´½¨ÈË' ,
`create_time`  datetime NOT NULL COMMENT '´´½¨Ê±¼ä' ,
`modify_time`  datetime NOT NULL COMMENT 'ÐÞ¸ÄÊ±¼ä' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of dd_record_main
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for `dd_user`
-- ----------------------------
DROP TABLE IF EXISTS `dd_user`;
CREATE TABLE `dd_user` (
`id`  int(200) NOT NULL AUTO_INCREMENT ,
`user_id`  int(200) NOT NULL ,
`user_name`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ÓÃ»§Ãû³Æ' ,
`user_mobile`  bigint(50) NULL DEFAULT NULL COMMENT 'ÓÃ»§ÊÖ»úºÅ' ,
`user_email`  varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'ÓÃ»§ÓÊÏäµØÖ·' ,
`status`  char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '×´Ì¬' ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1

;

-- ----------------------------
-- Records of dd_user
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for `dd_module`
-- ----------------------------
ALTER TABLE `dd_module` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `dd_record_main`
-- ----------------------------
ALTER TABLE `dd_record_main` AUTO_INCREMENT=1;

-- ----------------------------
-- Auto increment value for `dd_user`
-- ----------------------------
ALTER TABLE `dd_user` AUTO_INCREMENT=1;
