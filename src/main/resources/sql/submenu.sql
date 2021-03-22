create table if not exists submenu (
    subMenuId varchar(4) not null primary key comment '二级菜单编号  主键',
    parentId varchar(2) not null comment '一级菜单编号',
    subMenuName varchar(50) not null comment '菜单名称',
    url varchar(40) not null comment '菜单路径',
    state varchar(1) comment '1：可用      2：不可用',
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0501',
    '05',
    '订单管理',
    'order',
    '1'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0502',
    '05',
    '历史订单管理',
    'ordHistory',
    '1'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0506',
    '05',
    '订单统计',
    'ordStatistic',
    '1'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0601',
    '06',
    '客户管理',
    'customer',
    '1'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0605',
    '06',
    '客户统计',
    'cusStatistic',
    '1'
);

insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0701',
    '07',
    '进货管理',
    'stock',
    '1'
);


insert into submenu (
    subMenuId,
    parentId,
    subMenuName,
    url,
    state
) values (
    '0705',
    '07',
    '进货统计',
    'stoStatistic',
    '1'
);

commit;