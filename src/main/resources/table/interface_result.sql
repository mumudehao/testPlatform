create table interface_result
(
    result_id         bigint default 1 not null,
    excute_group_id   varchar(20)      null,
    interface_case_id int              null,
    type              int    default 0 null comment ' 0:未执行, 1:通过, 2:失败',
    result_detail     varchar(255)     null,
    gmt_create        datetime         null,
    constraint interface_result_result_id_uindex
        unique (result_id)
);

alter table interface_result
    add primary key (result_id);

