-- 角色菜单表
create table if not exists role_menu(
    roleId int(5) not null comment '角色编号',
    subMenuId varchar(4) not null comment '二级菜单编号',
    creator varchar(100) comment '权限添加者',
    createTime timestamp default CURRENT_TIMESTAMP comment '添加时间',
    primary key(roleId,subMenuId)
);