create table if not exists f_order(
    orderId int(6) zerofill not null primary key auto_increment comment '订单编号  主键',
    customerId int(6) comment '客户编号',
    orderTime timestamp default CURRENT_TIMESTAMP comment '下单时间',
    furniture varchar(100) comment '家具品类',
    totalAmount decimal(7,2) comment '总金额',
    frontMoney decimal(7,2) comment '定金',
    frontMoneyTime timestamp comment '定金支付时间',
    payTime timestamp comment '余款支付时间',
    deliverTime timestamp comment '送货时间',
    state enum('1','2','3','4'),
    createTime timestamp default CURRENT_TIMESTAMP comment '创建时间'
);

insert into f_order (
    customerId,
    furniture,
    totalAmount,
    frontMoney
) values (
    '000001',
    '床，沙发',
    3444.01,
    300.02
);
commit;