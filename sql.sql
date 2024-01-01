CREATE TABLE `sequence` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建 时间',
  `gmt_modified` datetime NOT NULL COMMENT '修改时间',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `value` bigint NOT NULL COMMENT '值',
  PRIMARY KEY (`id`),
  UNIQUE KEY `unique_name_tnt` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


CREATE TABLE `spike_activity` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `activity_id` bigint unsigned NOT NULL COMMENT '活动id',
  `activity_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '活动名称',
  `product_id` bigint unsigned NOT NULL COMMENT '商品id',
  `activity_start_time` bigint unsigned NOT NULL COMMENT '活动开始时间',
  `activity_end_time` bigint unsigned NOT NULL COMMENT '活动结束时间',
  `limit_num` bigint unsigned NOT NULL COMMENT '限购数量',
  `stock_num` bigint unsigned NOT NULL COMMENT '活动数量',
  `activity_status` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '活动状态',
  `activity_picture_url` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '活动商品图片',
  `activity_price_amt` bigint unsigned NOT NULL COMMENT '活动金额',
  `ccy` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '币种',
  `cas_version` bigint unsigned NOT NULL DEFAULT '0' COMMENT '版本号，用于乐观锁',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_activity_id` (`activity_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


CREATE TABLE `spike_order` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `order_id` bigint unsigned NOT NULL COMMENT '订单id',
  `product_id` bigint unsigned NOT NULL COMMENT '商品id',
  `user_id` bigint unsigned NOT NULL COMMENT '用户id',
  `buy_num` bigint unsigned NOT NULL COMMENT '购买数量',
  `order_price_amt` bigint unsigned NOT NULL COMMENT '订单金额',
  `ccy` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '币种',
  `address` varchar(8192) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '地址',
  `pay_type` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '支付方式',
  `order_time` bigint unsigned NOT NULL COMMENT '订单下单时间',
  `order_status` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '订单状态',
  `cas_version` bigint unsigned NOT NULL DEFAULT '0' COMMENT '版本号，乐观锁实现',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_order_id` (`order_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


CREATE TABLE `spike_product` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `product_id` bigint unsigned NOT NULL COMMENT '商品id',
  `product_name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品名称',
  `picture_url` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品图片',
  `product_price_amt` bigint unsigned NOT NULL COMMENT '商品价格',
  `ccy` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '币种',
  `tag` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标识',
  `cas_version` bigint unsigned NOT NULL COMMENT '版本号，乐观锁实现',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_product_id` (`product_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint unsigned NOT NULL,
  `user_name` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `salt` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gmt_create` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


