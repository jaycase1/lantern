create DATABASE IF NOT EXISTS lantern_databse;

use lantern_databsel;


create table user_info (
                           ui_id bigint unsigned not null auto_increment comment '用户Id',
                           ui_name varchar(16) default '' comment '用户名',
                           ui_nickname varchar(16) default '' comment '用户昵称',
                           ui_head_portrait varchar(32) default '' comment '用户图像',
                           ui_idcard varchar(18) default '' comment '用户唯一标识符',
                           ui_sex enum('男','女') comment '用户性别',
                           ui_age tinyint unsigned default 0 comment '用户年龄',
                           ui_birth datetime comment '用户生日',
                           ui_address varchar(32) not null default '' comment '用户家庭地址',
                           ui_phone varchar(11) not null default '' comment '用户联系方式',
                           ui_email varchar(32) not null default '' comment '用户邮箱',
                           ui_password varchar(32) not null default '123456' comment '用户密码',
                           ui_salt varchar(32) not null default '' comment '用户盐',
                           ui_salt_password varchar(32) not null default '' comment '用户盐密',
                           ui_token varchar(32) not null default '' comment '用户盐',
                           ui_login_address varchar(32) not null default '' comment '用户最近登录地址',
                           ui_login_time datetime not null default current_timestamp comment '用户最近登录时间',
                           ui_exit_time datetime default  null comment '用户最近退出时间',
                           ui_first_login enum(TRUE, FALSE) default TRUE comment '用户是否为第一次登录',
                           tri_id bigint unsigned default null comment '用户第三方信息Id',
                           ui_status enum('正常','作废') default '正常' comment '用户状态',
                           primary key (ui_id)
);


create table role_info(
                          ur_id bigint unsigned not null auto_increment comment '角色Id',
                          ur_superior_id bigint unsigned default null comment '角色上级Id',
                          system_id bigint unsigned not null comment '系统Id',
                          system_name varchar(32) not null comment '系统名',
                          service_id bigint unsigned not null comment '服务Id',
                          service_name bigint unsigned not null comment '服务名',
                          role_type enum('商家','客户','供应商','骑手') not null comment '角色类型',
                          role_name varchar(16) not null default '' comment '角色名',
                          remarks varchar(64) not null default '' comment '备注',
                          create_time datetime not null default current_timestamp comment '创建时间',
                          update_time datetime default null comment '修改时间',
                          create_ui_id bigint unsigned not null comment '创建用户Id',
                          create_ui_name varchar(16) not null comment '创建用户名',
                          update_ui_id bigint unsigned not null comment '修改用户Id',
                          update_ui_name varchar(16) not null comment '修改用户名',
                          ur_status enum('正常','作废') default '正常' comment '角色状态',
                          primary key (ur_id)

);

create table group_info (
                            gr_id bigint unsigned not null auto_increment comment '用户组Id',
                            gr_name varchar(16) not null comment '用户组名',
                            gr_superior_id bigint unsigned default null comment '用户组上级Id',
                            gr_superior_name varchar(16) default null comment '用户组上级名',
                            system_id bigint unsigned not null comment '系统Id',
                            system_name varchar(16) not null comment '系统名',
                            limit_num int not null default 2000 comment '用户组人数上限',
                            nowtime_num int not null default 0 comment '用户组当前人数',
                            gr_type enum('区域商家用户组','店铺粉丝用户组','同好交流用户组') not null comment '用户组类型',
                            remarks varchar(64) not null default '' comment '备注',
                            create_time datetime not null default current_timestamp comment '创建时间',
                            update_time datetime default null comment '修改时间',
                            create_ui_id bigint unsigned not null comment '创建用户Id',
                            create_ui_name varchar(16) not null comment '创建用户名',
                            update_ui_id bigint default null comment '修改用户Id',
                            update_ui_name varchar(16) default null comment '修改用户名',
                            gr_status enum('正常','作废') default '正常' comment '用户组状态',
                            primary key (gr_id)

);


create table login_record (
                              ul_id bigint unsigned not null auto_increment comment '登录记录Id',
                              ui_id bigint unsigned not null comment '用户Id',
                              ul_login_time datetime not null default current_timestamp comment '用户登录时间',
                              ul_exit_time datetime not null default current_timestamp comment '用户退出时间',
                              ul_login_address varchar(32) not null default '' comment '用户登录地址',
                              ul_login_ip varchar(32) not null default '' comment '用户登录Id',
                              ul_login_device enum('苹果','小米','vivo','oppo','华为','三星','联想','戴尔','外星人','其他') default '其他' comment '用户登录设备',
                              ul_login_device_model varchar(32) not null default '' comment '用户登录设备型号',
                              ul_login_syxstem enum('macos','windows','linux','ios','andriod','harmony', 'other') default 'other' comment '用户登录操作系统',
                              ul_login_way enum('账号密码登录','手机验证码登录','第三方扫码登录','第三方小程序登录') default '账号密码登录' comment '用户登录方式',
                              ul_login_terminal enum('手机浏览器','电脑浏览器','第三方App','第三方小程序') not null comment '用户登录终端',
                              ul_quit_way enum('主动退出','会话结束','强制下线') default '会话结束' comment '用户退出方式',
                              tri_id bigint unsigned default null comment '第三方信息Id',
                              primary key (ul_id)

);

create table third_info (
                            tri_id bigint unsigned not null auto_increment comment '第三方信息Id',
                            ui_id bigint unsigned not null comment '用户Id',
                            tri_type enum('第三方程序','第三方小程序') not null comment '第三方类型',
                            tri_platform_id int unsigned default null comment '第三方平台Id',
                            tri_platform_name varchar(32) default  null comment '第三方平台名',
                            tri_software_id int unsigned default null comment '第三方软件Id',
                            tri_software_name varchar(32) default null comment '第三方软件名',
                            tri_user_id bigint unsigned not null comment '第三方Id',
                            tri_user_name varchar(32) not null comment '第三方名',
                            tri_token varchar(32) not null default '' comment '第三方盐密',
                            tri_create_time datetime not null default current_timestamp comment '第三方首次注册时间',
                            tri_invalid_time datetime default null comment '第三方失效时间',
                            primary key (tri_id)

);

create table role_record (
                             rr_id bigint unsigned not null auto_increment comment '用户记录表Id',
                             ui_id bigint unsigned not null comment '用户Id',
                             ur_id bigint unsigned not null comment '角色表Id',
                             system_id bigint unsigned not null comment '系统Id',                   # 用户对应那个系统，可以理解为子公司
                             system_name varchar(32) not null comment '系统名',
                             service_id bigint unsigned not null comment '服务Id',
                             service_name varchar(32) not null comment '服务名',
                             remarks varchar(64) not null default '' comment '备注',
                             create_time datetime not null default current_timestamp comment '角色创建时间',
                             update_time datetime default null comment '角色修改时间',
                             create_ui_id bigint unsigned not null comment '创建角色用户Id',
                             create_ui_name varchar(16) not null comment '创建角色用户名',
                             update_ui_id bigint unsigned default null comment '修改角色用户Id',
                             update_ui_name varchar(16)  default null comment '修改角色用户名',
                             rr_status enum('正常','作废') default '正常' comment '角色状态',
                             primary key (rr_id)



);

create table role_limit (
                            rl_id bigint unsigned not null auto_increment comment '角色限制Id',
                            ur_id bigint unsigned not null comment '角色Id',
                            service_id bigint unsigned not null comment '服务Id',
                            service_name varchar(32) not null comment '服务名',
                            lim_type enum('资源受限','操作受限','视图受限') not null comment '限制类型',
                            remarks varchar(64) not null default '' comment '备注',
                            create_time datetime not null default current_timestamp comment '创建时间',
                            update_time datetime default null comment '修改时间',
                            invalid_time datetime default null comment '失效时间',
                            create_ui_id bigint unsigned not null comment '创建用户Id',
                            create_ui_name varchar(16) not null comment '创建用户名',
                            update_ui_id bigint unsigned not null comment '修改用户Id',
                            update_ui_name varchar(16) not null comment '修改用户名',
                            rl_status enum('正常','作废') default '正常' comment '限制状态',
                            primary key (rl_id)
);
