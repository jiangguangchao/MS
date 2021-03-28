-- 角色菜单表
create table if not exists role_menu(
    roleId int(5) zerofill not null comment '角色编号',
    menuId varchar(4) not null comment '一级或者二级菜单编号',
    creator varchar(100) comment '权限添加者',
    createTime timestamp default CURRENT_TIMESTAMP comment '添加时间',
    primary key(roleId,menuId)
);


insert into role_menu(
  roleId,
  menuId
) values (
  2,
  '00'
);

insert into role_menu(
  roleId,
  menuId
) values (
  2,
  '0501'
);