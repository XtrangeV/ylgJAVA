/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : ylg_java

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-11-23 01:04:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for 员工表
-- ----------------------------
DROP TABLE IF EXISTS `员工表`;
CREATE TABLE `员工表` (
  `员工ID` int(255) DEFAULT NULL,
  `员工姓名` char(255) CHARACTER SET utf8 DEFAULT NULL,
  `员工职位` char(255) CHARACTER SET utf8 DEFAULT NULL,
  `员工入职时间` char(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of 员工表
-- ----------------------------
INSERT INTO `员工表` VALUES ('1', '名字a', '3', '昨天');
INSERT INTO `员工表` VALUES ('2', '我', '饿', '20180909');

-- ----------------------------
-- Table structure for 部门员工映射表
-- ----------------------------
DROP TABLE IF EXISTS `部门员工映射表`;
CREATE TABLE `部门员工映射表` (
  `部门员工映射表` varchar(255) DEFAULT NULL,
  `映射` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of 部门员工映射表
-- ----------------------------
INSERT INTO `部门员工映射表` VALUES ('123', '321');

-- ----------------------------
-- Table structure for 部门表
-- ----------------------------
DROP TABLE IF EXISTS `部门表`;
CREATE TABLE `部门表` (
  `部门ID` int(11) DEFAULT NULL,
  `部门名` char(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of 部门表
-- ----------------------------
INSERT INTO `部门表` VALUES ('1', 'a');
INSERT INTO `部门表` VALUES ('2', 'b');
INSERT INTO `部门表` VALUES ('3', 'c');
INSERT INTO `部门表` VALUES ('4', 'd');
