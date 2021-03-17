create table if not exists customer(
    id int(6) zerofill not null primary key auto_increment comment '客户编号  主键',
    name varchar(200) comment '客户名称',
    sex enum('0','1') default '1' comment '0:女    1:男',
    age int(2) comment '年龄',
    mobile1 varchar(20) comment '手机号1',
    mobile2 varchar(20) comment '手机号2',
    address varchar(200) comment '地址',
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into customer (
    name,
    age,
    mobile1,
    address
) values (
    '刘德华',
    55,
    '12345678765',
    '平舆'
);
commit;