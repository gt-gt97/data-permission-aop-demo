SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_data_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_data_permission`;
CREATE TABLE `t_data_permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `employee_id` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工号',
  `department_id` int(20) DEFAULT NULL COMMENT '部门id',
  `business_id` int(20) DEFAULT NULL COMMENT '业务线id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='数据权限表';

-- ----------------------------
-- Records of t_data_permission
-- ----------------------------
BEGIN;
INSERT INTO `t_data_permission` VALUES (1, '0001', 1001, 2001);
INSERT INTO `t_data_permission` VALUES (2, '0001', 1003, 2003);
COMMIT;

-- ----------------------------
-- Table structure for t_employee_info
-- ----------------------------
DROP TABLE IF EXISTS `t_employee_info`;
CREATE TABLE `t_employee_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `employee_id` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工号',
  `employee_name` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工姓名',
  `department_id` int(20) DEFAULT NULL COMMENT '部门id',
  `business_id` int(20) DEFAULT NULL COMMENT '业务线id',
  `employee_address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工地址',
  `employee_phone` varchar(11) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工手机号',
  `permission` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '部门id，业务线id',
  `is_technical` varchar(1) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '1' COMMENT '是否属于技术序列，1 是，0 否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='员工信息表';

-- ----------------------------
-- Records of t_employee_info
-- ----------------------------
BEGIN;
INSERT INTO `t_employee_info` VALUES (1, '1', '张三', 1001, 2001, '海淀区', '18723452564', '1001,2001', '1');
INSERT INTO `t_employee_info` VALUES (2, '2', '李四', 1002, 2002, '海淀区', '18723452564', '1002,2002', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
