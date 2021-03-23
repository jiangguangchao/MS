-- 角色操作权限，次表记录的是页面的上的操作按钮是否有权限
create table if not exists role_action(
    roleId int(5) not null comment '角色编号',
    actionUrl varchar(100) not null comment '该操作向后台发起请求的url',
    creator varchar(100) comment '权限添加者',
    createTime timestamp default CURRENT_TIMESTAMP comment '添加时间',
    primary key(roleId,actionUrl)
)