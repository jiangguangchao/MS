create table if not exists role (
    roleId int(5) zerofill not null auto_increment primary key comment '角色编号 主键',
    roleName varchar(30) comment '角色名称',
    describ varchar(100) comment '描述 说明',
    state varchar(1) not null comment '角色状态 1：可用     2：不可用',
    creator varchar(100) comment '创建者',
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into role (
    roleName,
    describ,
    state
) values (
    '管理员',
    '拥有所有权限',
    '1'
);
insert into role (
    roleName,
    describ,
    state
) values (
    '财务',
    '拥有首页和订单权限',
    '1'
);

commit;