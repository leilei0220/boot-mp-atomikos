/*
 Navicat Premium Data Transfer

 Source Server         : leilei
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost:3306
 Source Schema         : lianxi

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : 65001

 Date: 22/12/2019 22:57:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `category_id` bigint(11) NULL DEFAULT NULL,
  `sale_price` double(10, 2) NULL DEFAULT NULL,
  `supplier` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brand` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cutoff` double(2, 2) NULL DEFAULT NULL,
  `cost_price` double(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_category_id`(`category_id`) USING BTREE,
  CONSTRAINT `fk_category_id` FOREIGN KEY (`category_id`) REFERENCES `product_category` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '阿打1111罗技M90', 3, 90.00, '罗技', '罗技', 0.50, 35.00);
INSERT INTO `product` VALUES (2, '罗技M100', 3, 49.00, '罗技', '罗技', 0.90, 33.00);
INSERT INTO `product` VALUES (3, '罗技M115', 3, 99.00, '罗技', '罗技', 0.60, 38.00);
INSERT INTO `product` VALUES (4, '罗技M125', 3, 80.00, '罗技', '罗技', 0.90, 39.00);
INSERT INTO `product` VALUES (5, '罗技木星轨迹球', 3, 182.00, '罗技', '罗技', 0.80, 80.00);
INSERT INTO `product` VALUES (6, '罗技火星轨迹球', 3, 608.10, '罗技', '罗技', 0.87, 290.00);
INSERT INTO `product` VALUES (7, '罗技G9X', 3, 1184.83, '罗技', '罗技', 0.70, 470.00);
INSERT INTO `product` VALUES (8, '罗技M215', 2, 89.00, '罗技', '罗技', 0.79, 30.00);
INSERT INTO `product` VALUES (9, '罗技M305', 2, 119.00, '罗技', '罗技', 0.82, 48.00);
INSERT INTO `product` VALUES (10, '罗技M310', 2, 135.00, '罗技', '罗技', 0.92, 69.80);
INSERT INTO `product` VALUES (11, '罗技M505', 2, 148.00, '罗技', '罗技', 0.92, 72.00);
INSERT INTO `product` VALUES (12, '罗技M555', 2, 275.00, '罗技', '罗技', 0.88, 140.00);
INSERT INTO `product` VALUES (13, '罗技M905', 2, 659.52, '罗技', '罗技', 0.88, 270.00);
INSERT INTO `product` VALUES (14, '罗技MX1100', 2, 792.00, '罗技', '罗技', 0.76, 300.00);
INSERT INTO `product` VALUES (15, '罗技M950', 2, 976.32, '罗技', '罗技', 0.78, 320.00);
INSERT INTO `product` VALUES (16, '罗技MX Air', 2, 1870.56, '罗技', '罗技', 0.72, 400.00);
INSERT INTO `product` VALUES (17, '罗技G1', 4, 155.00, '罗技', '罗技', 0.80, 49.00);
INSERT INTO `product` VALUES (18, '罗技G3', 4, 229.00, '罗技', '罗技', 0.77, 96.00);
INSERT INTO `product` VALUES (19, '罗技G500', 4, 574.56, '罗技', '罗技', 0.88, 130.00);
INSERT INTO `product` VALUES (20, '罗技G700', 4, 1006.56, '罗技', '罗技', 0.79, 278.00);

SET FOREIGN_KEY_CHECKS = 1;
