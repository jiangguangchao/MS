create table if not exists menu (
    menuId varchar(2) not null primary key comment '一级菜单编号  主键',
    menuName varchar(50) not null comment '菜单名称',
    url varchar(40) not null comment ' 菜单路径',
    state varchar(1) comment '1：可用      2：不可用',
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into menu (
    menuId,
    menuName,
    url,
    state
) values (
    '00',
    '首页',
    'home',
    '1'
);

insert into menu (
    menuId,
    menuName,
    url,
    state
) values (
    '05',
    '订单',
    'om',
    '1'
);

insert into menu (
    menuId,
    menuName,
    url,
    state
) values (
    '06',
    '客户',
    'cm',
    '1'
);

insert into menu (
    menuId,
    menuName,
    url,
    state
) values (
    '07',
    '进货',
    'stockmag',
    '1'
);
commit;