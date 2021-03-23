create table if not exists user(
    userId varchar(100) not null primary key comment '用户名  主键',
    password varchar(200) comment '密码',
    role int(5) not null comment '角色',
    state varchar(2) comment '用户状态，01：正常  02：停用',
    creator varchar(100) comment '创建者',
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into user (
    userId,
    password,
    role,
    state
) values (
    'jgc',
    'jgc',
    1,
    '01'
);

commit;