/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50540
Source Host           : 127.0.0.1:3306
Source Database       : jfinal_demo

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2015-09-25 12:19:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `content` mediumtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', 'fffffff1234567890', 'fdfdadsfsdf123121adsfdsadf');
INSERT INTO `blog` VALUES ('3', 'tttt1234567890', 'cccccccccccc123\r\ndsafasdgfdvxzcvsdvdfvadsvad');
INSERT INTO `blog` VALUES ('6', 'ffffff11111', 'adfdsssssssssssss');
INSERT INTO `blog` VALUES ('8', 'jfinal+rest', 'gggggggggggg');
INSERT INTO `blog` VALUES ('9', '123456wewqr', '7890123124432324');
INSERT INTO `blog` VALUES ('11', 'ssss12357654', 'sssssssssss');
INSERT INTO `blog` VALUES ('17', '123456abc', '1242423523');
INSERT INTO `blog` VALUES ('18', '456363', '6363643634636');
INSERT INTO `blog` VALUES ('19', '3232rweew123', 'asdfdasgadfadsf');
INSERT INTO `blog` VALUES ('22', 'ccccccccccccc123', 'vvvvvvvvvvvvvvvvv');
INSERT INTO `blog` VALUES ('23', 'test rest', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('24', 'test rest', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('25', 'test rest', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('26', 'test rest', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('27', 'test rest', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('28', 'test rest123', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('29', 'test rest123', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('30', 'test restful url call', 'test resttest resttest resttest rest');
INSERT INTO `blog` VALUES ('31', 'tttt', 'tttttttttttttttttt');
INSERT INTO `blog` VALUES ('33', 'adfafsafdsfas', 'dfasssssssssssssssssss');
INSERT INTO `blog` VALUES ('34', 'gggggggggggg', 'gggggggggggggggggggggggg');
INSERT INTO `blog` VALUES ('36', 'dsafasdfsadf', 'sadfasdfasdfasfdadsf');
INSERT INTO `blog` VALUES ('37', 'vvvvvvvvvvvvv', 'vvvvvvvvvvvvvvvvvvvvvvvvvvvv');
INSERT INTO `blog` VALUES ('38', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('39', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('40', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('41', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('42', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('43', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('44', 'title', 'cxt text');
INSERT INTO `blog` VALUES ('45', 'asdfdsfdsf', 'asdffffffadsffdasfd');
INSERT INTO `blog` VALUES ('46', 'qqqqqqqqqqqq', 'cccccccccccccccccccc');
INSERT INTO `blog` VALUES ('47', 'vvvvvvvvvvvvvvv', 'vvvasddddddddd');
INSERT INTO `blog` VALUES ('48', 'aaa', 'bbb');
INSERT INTO `blog` VALUES ('49', 'bbbbbb', 'cccccccccc');
INSERT INTO `blog` VALUES ('50', 'aaaaaa', 'bbbbbbbbbbbbbb');
