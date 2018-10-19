-- 使用自增id时，统一类型为varchar(32)
-- base_user 基础用户表
CREATE TABLE `sbv`.`base_user`  (
  `id` varchar(32) NOT NULL COMMENT '用户ID',
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(128) NOT NULL COMMENT '密码',
  `status` varchar(1) NOT NULL COMMENT '状态[1:启用，0关闭]',
  PRIMARY KEY (`id`)
);
-- base_user_info 用户信息表
CREATE TABLE `sbv`.`base_user_info`  (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `nick_name` varchar(32) NULL COMMENT '真实姓名',
  `phone` varchar(32) NULL COMMENT '手机',
  `telephone` varchar(32) NULL COMMENT '固定电话',
  `email` varchar(64) NULL COMMENT '邮箱',
  `image_id` varchar(32) NULL COMMENT '图片id',
  `age` int(3) NULL COMMENT '年龄',
  `sex` int(1) NULL COMMENT '性别',
  `credit` int(11) NULL COMMENT '信用',
  `birthday` timestamp(0) NULL COMMENT '生日',
  `IDCard` varchar(18) NULL COMMENT '身份证',
  `account_id` varchar(32) NULL COMMENT '账号id',
  `create_time` timestamp(0) NULL DEFAULT NULL COMMENT '创建时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户'
);
-- base_account 用户账号表
CREATE TABLE `sbv`.`base_account`  (
  `id` varchar(32) NOT NULL COMMENT '账号id',
  `vip_level` int(8) NULL COMMENT 'VIP等级',
  `balance` decimal(16, 2) NULL COMMENT '余额',
  `all_balance` decimal(16, 2) NULL COMMENT '总充值金额额度',
  `update_time` timestamp(0) NULL COMMENT '更新时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户id',
  PRIMARY KEY (`id`)
);
-- base_user_role 用户角色中间表
CREATE TABLE `sbv`.`base_user_role`  (
  `id` varchar(32) NOT NULL COMMENT '用户角色中间表id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `role_id` varchar(32) NULL COMMENT '角色id',
  `create_time` timestamp(0) NULL COMMENT '创建时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `status` varchar(1) NULL COMMENT '标志【0：关闭；1：开启】',
  PRIMARY KEY (`id`)
);
-- base_role 角色表
CREATE TABLE `sbv`.`base_role`  (
  `id` varchar(32) NOT NULL COMMENT '角色id',
  `name` varchar(64) NULL COMMENT '角色名',
  `note` varchar(255) NULL COMMENT '备注，解释角色',
  `code` varchar(255) NULL COMMENT '唯一码',
  `type` varchar(8) NULL COMMENT '类型【如1为管理员等】',
  `status` varchar(1) NULL COMMENT '标志【0：关闭，1开启】',
  `create_time` timestamp(0) NULL COMMENT '创建时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `update_time` timestamp(0) NULL COMMENT '更新时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  PRIMARY KEY (`id`)
);
-- base_role_menu 角色权限【菜单】表
CREATE TABLE `sbv`.`base_role_menu`  (
  `id` varchar(32) NOT NULL COMMENT '用户角色权限【拥有的菜单权限】中间表id',
  `role_id` varchar(32) NULL COMMENT '角色id',
  `menu_id` varchar(32) NULL COMMENT '权限id【菜单】',
  `create_user_id` varchar(32) NULL COMMENT '创建用户id',
  `create_time` timestamp(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：开启；1关闭】',
  PRIMARY KEY (`id`)
);
-- menu 权限【菜单】【解释：权限决定菜单】表
CREATE TABLE `sbv`.`menu`  (
  `id` varchar(32) NULL COMMENT '权限id【菜单】',
  `name` varchar(64) NULL COMMENT '权限名',
  `code` varchar(255) NULL COMMENT '权限唯一码',
  `image_id` varchar(32) NULL COMMENT '图像id',
  `type` varchar(8) NULL COMMENT '类型【几级菜单，1级，2级等】',
  `rank` int(8) NULL COMMENT '统一菜单排序优先级',
  `parent_id` varchar(32) NULL COMMENT '上级菜单',
  `status` varchar(1) NULL COMMENT '标志【0：关闭；1：开启】',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` timestamp(0) NULL COMMENT '创建时间'
);
-- base_manage 基础管理员表
CREATE TABLE `sbv`.`base_manage`  (
  `id` varchar(32) NOT NULL COMMENT '管理员id',
  `name` varchar(255) NULL COMMENT '管理员名',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` timestamp(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：关闭；1：开启】',
  PRIMARY KEY (`id`)
);
-- image 图像表
CREATE TABLE `sbv`.`image`  (
  `id` varchar(32) NOT NULL COMMENT '图像id',
  `url` varchar(255) NULL COMMENT '图像地址',
  `description` varchar(255) NULL COMMENT '图像介绍',
  `type` varchar(16) NULL COMMENT '图像类型【.png,.jpg,.bmp】',
  PRIMARY KEY (`id`)
);
-- base_user_mark 用户标记中间表
CREATE TABLE `sbv`.`base_user_mark`  (
  `id` varchar(32) NOT NULL COMMENT '用户标志中间表id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `mark_id` varchar(32) NULL COMMENT '标志id',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` timestamp(0) NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
);
-- mark 用户标记表
CREATE TABLE `sbv`.`mark`  (
  `id` varchar(32) NOT NULL COMMENT '标志id',
  `name` varchar(64) NULL COMMENT '标志内容',
  `description` varchar(255) NULL COMMENT '简介',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `update_user_id` int(32) NULL COMMENT '更新用户',
  `status` varchar(1) NULL COMMENT '标志【0：不再使用；1：使用中】',
  PRIMARY KEY (`id`)
);
-- pay_record 支付记录表
CREATE TABLE `sbv`.`pay_record`  (
  `id` varchar(32) NOT NULL COMMENT '支付id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `pay_account` decimal(16, 2) NULL COMMENT '支付金额',
  `title` varchar(255) NULL COMMENT '支付标题',
  `description` varchar(255) NULL COMMENT '支付内容',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- recharge_record 充值记录表
CREATE TABLE `sbv`.`recharge_record`  (
  `id` varchar(32) NOT NULL COMMENT '充值记录id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `recharge_account` decimal(16, 2) NULL COMMENT '充值金额',
  `description` varchar(255) NULL COMMENT '解释，简介',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- author 作者表
CREATE TABLE `sbv`.`author`  (
  `id` varchar(32) NOT NULL COMMENT '作者id',
  `name` varchar(32) NULL COMMENT '作者名',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `image_id` varchar(32) NULL COMMENT '图像id',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- public_contact 公开联系表【微博等联系方式】
CREATE TABLE `sbv`.`public_contact`  (
  `id` varchar(32) NOT NULL COMMENT '公开联系方式id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `name` varchar(64) NULL COMMENT '公开联系名',
  `type` varchar(32) NULL COMMENT '类型【微信，微博等】',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- book 书籍表
CREATE TABLE `sbv`.`book`  (
  `id` varchar(32) NOT NULL COMMENT '书籍id',
  `name` varchar(64) NULL COMMENT '书籍名',
  `description` varchar(255) NULL COMMENT '简介',
  `author_id` varchar(32) NULL COMMENT '作者id',
  `type` varchar(8) NULL COMMENT '类型【玄幻，修真等】',
  `comment_id` varchar(32) NULL COMMENT '评论id',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `recent_chapter_id` varchar(32) NULL COMMENT '最新章节',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- book_price 书籍价格
CREATE TABLE `sbv`.`book_price`  (
  `id` varchar(32) NOT NULL COMMENT '书籍价格id',
  `book_id` varchar(32) NULL COMMENT '书籍id',
  `price` decimal(16, 2) NULL COMMENT '价格',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);
-- chapter 章节表
CREATE TABLE `sbv`.`chapter`  (
  `id` varchar(32) NOT NULL COMMENT '章节id',
  `book_id` varchar(32) NULL COMMENT '书籍id',
  `chapter_sort_id` int(11) NULL COMMENT '第几章【数字1、2、3...】',
  `name` varchar(64) NULL COMMENT '章节名',
  `description` varchar(255) NULL COMMENT '章节简介',
  `content_url` varchar(32) NULL COMMENT '章节内容地址',
  `author_id` varchar(32) NULL COMMENT '作者id',
  `previous_chapter` varchar(32) NULL COMMENT '上个章节id',
  `status` varchar(1) NULL COMMENT '状态【0：删除；1：存在】',
  `look_times` int(11) NULL COMMENT '阅读次数',
  `report` int(11) NULL COMMENT '举报次数',
  `create_time` datetime(0) NULL COMMENT '创建 时间',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  PRIMARY KEY (`id`)
);
-- chapter_price 章节价格表
CREATE TABLE `sbv`.`chapter_price`  (
  `id` varchar(32) NOT NULL COMMENT '章节价格id',
  `chapter_id` varchar(32) NULL COMMENT '章节id',
  `price` decimal(16, 2) NULL COMMENT '价格',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);
-- comment 评论表
CREATE TABLE `sbv`.`comment`  (
  `id` varchar(32) NOT NULL COMMENT '评论id',
  `book_id` varchar(32) NULL COMMENT '书籍id',
  `chapter_id` varchar(32) NULL COMMENT '章节id',
  `star_level` int(2) NULL COMMENT '评论星级【1,2,3,4,5】',
  `content` varchar(255) NULL COMMENT '评论',
  `type` varchar(16) NULL COMMENT '评论类型【书籍，章节】',
  `create_user_id` varchar(32) NULL COMMENT '超级用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `status` varchar(255) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- report 举报表
CREATE TABLE `sbv`.`report`  (
  `id` varchar(32) NOT NULL COMMENT '举报id',
  `title` varchar(255) NULL COMMENT '举报标题【举报类型选择出来的类型合并字】',
  `content` varchar(255) NULL COMMENT '内容',
  `user_id` varchar(32) NULL COMMENT '举报用户id',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `status` varchar(1) NULL COMMENT '标志【0：已删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- report_report_type 举报类型中间表
CREATE TABLE `sbv`.`report_report_type`  (
  `id` varchar(32) NOT NULL COMMENT '举报内容与举报类型中间表id',
  `report_id` varchar(32) NULL COMMENT '举报内容表id',
  `report_type_id` varchar(32) NULL COMMENT '举报类型表id',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `status` varchar(1) NOT NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- report_type 举报类型表
CREATE TABLE `sbv`.`report_type`  (
  `id` varchar(32) NOT NULL COMMENT '举报类型id',
  `name` varchar(64) NULL COMMENT '举报类型【如：暴力，抄袭】',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_user_id` varchar(32) NULL COMMENT '更新用户',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- shopping_cart 购物车标
CREATE TABLE `sbv`.`shopping_cart`  (
  `id` varchar(32) NOT NULL COMMENT '购物车id',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- shopping_cart_item 购物车项表
CREATE TABLE `sbv`.`shopping_cart_item`  (
  `shopping_cart_id` varchar(32) NOT NULL COMMENT '购物车项id',
  `commodity_id` varchar(32) NULL COMMENT '商品id',
  `type` varchar(8) NULL COMMENT '类型【书籍或者章节】',
  `count` int(11) NULL COMMENT '数量',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1存在】'
);
-- order 订单表
CREATE TABLE `sbv`.`order`  (
  `id` varchar(32) NOT NULL COMMENT '订单id',
  `price_sum` decimal(16, 2) NULL COMMENT '总价格',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(8) NULL COMMENT '类型【0：删除；1：存在；2：已付款等】',
  PRIMARY KEY (`id`)
);
-- order_item 订单项表
CREATE TABLE `sbv`.`order_item`  (
  `order_id` varchar(32) NOT NULL COMMENT '订单id',
  `commodity_id` varchar(32) NULL COMMENT '商品id',
  `type` varchar(8) NULL COMMENT '类型【书籍或者章节】',
  `count` int(11) NULL COMMENT '数量',
  `create_user_id` varchar(32) NULL COMMENT '创建用户',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】'
);
-- base_user_address 用户地址表
CREATE TABLE `sbv`.`base_user_address`  (
  `id` varchar(32) NOT NULL COMMENT '用户地址id',
  `user_id` varchar(32) NULL COMMENT '用户id',
  `address_id` varchar(32) NULL COMMENT '地址id',
  `default` varchar(1) NULL COMMENT '默认地址【Boolean类型】',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  `create_time` datetime(0) NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
);
-- address 地址表
CREATE TABLE `sbv`.`address`  (
  `id` varchar(32) NOT NULL COMMENT '地址id',
  `country_id` varchar(32) NULL COMMENT '国家id',
  `provence_id` varchar(32) NULL COMMENT '省份id',
  `city_id` varchar(32) NULL COMMENT '市 id',
  `street_id` varchar(32) NULL COMMENT '区，街道 id',
  `town_id` varchar(32) NULL COMMENT '镇id',
  `village_id` varchar(32) NULL COMMENT '村id',
  `another` varchar(255) NULL COMMENT '其他的具体地址',
  PRIMARY KEY (`id`)
);
-- country 国家表
CREATE TABLE `sbv`.`country`  (
  `id` varchar(32) NOT NULL COMMENT '国家id',
  `name` varchar(255) NULL COMMENT '国家名',
  `shorthand` varchar(32) NULL COMMENT '国家缩写',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0:删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- provence 省份表
CREATE TABLE `sbv`.`provence`  (
  `id` varchar(32) NOT NULL COMMENT '省份id',
  `name` varchar(64) NULL COMMENT '省份名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `country_id` varchar(32) NULL COMMENT '国家id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- city 城市表
CREATE TABLE `sbv`.`city`  (
  `id` varchar(32) NOT NULL COMMENT '省份id',
  `name` varchar(64) NULL COMMENT '省份名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `country_id` varchar(32) NULL COMMENT '国家id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- street 区或街道表
CREATE TABLE `sbv`.`street`  (
  `id` varchar(32) NOT NULL COMMENT '区或街道id',
  `name` varchar(64) NULL COMMENT '区或街道名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `city_id` varchar(32) NULL COMMENT '城市id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- district 县城表
CREATE TABLE `sbv`.`district`  (
  `id` varchar(32) NOT NULL COMMENT '县id',
  `name` varchar(64) NULL COMMENT '县名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `city_id` varchar(32) NULL COMMENT '城市id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- town 城镇表
CREATE TABLE `sbv`.`town`  (
  `id` varchar(32) NOT NULL COMMENT '镇id',
  `name` varchar(64) NULL COMMENT '镇名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `district_id` varchar(32) NULL COMMENT '县id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);
-- village 乡村表
CREATE TABLE `sbv`.`village`  (
  `id` varchar(32) NOT NULL COMMENT '村id',
  `name` varchar(64) NULL COMMENT '村名',
  `shorthand` varchar(32) NULL COMMENT '缩写',
  `town_id` varchar(32) NULL COMMENT '镇id',
  `description` varchar(255) NULL COMMENT '简介',
  `status` varchar(1) NULL COMMENT '标志【0：删除；1：存在】',
  PRIMARY KEY (`id`)
);