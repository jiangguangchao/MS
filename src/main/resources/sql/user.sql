create table if not exists user(
    userId varchar(100) not null primary key comment '用户名  主键',
    password varchar(200) comment '密码',
    role varchar(3) comment '角色',
    state varchar(2) comment '用户状态，01：正常  02：停用'
);

insert into user (
    userId,
    password,
    state
) values (
    'jgc',
    'jgc',
    '01'
);

commit;