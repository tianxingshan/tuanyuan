
/* 创建账户 */
CREATE TABLE `t_account` (
  `c_id` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `c_username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `c_password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `c_sex` varchar(4) COLLATE utf8_bin DEFAULT NULL COMMENT '0 男 1女',
  `c_age` varchar(4) COLLATE utf8_bin DEFAULT NULL,
  `c_mobile` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `c_del` varchar(4) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

