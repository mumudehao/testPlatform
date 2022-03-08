-- auto-generated definition
create table interface_case
(
    interface_case_id bigint default 1 not null,
    case_id           varchar(10)      not null,
    case_name         varchar(20)      null,
    case_path         varchar(64)      null,
    case_params       varchar(255)     null,
    create_user       varchar(10)      null,
    update_user       varchar(10)      null,
    gmt_create        datetime         null,
    gmt_update        datetime         null,
    constraint interface_case_case_id_uindex
        unique (case_id),
    constraint interface_case_interface_case_id_uindex
        unique (interface_case_id)
);

alter table interface_case
    add primary key (interface_case_id);

