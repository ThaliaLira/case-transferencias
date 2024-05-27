create table clientes(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    numero_da_conta varchar(100) not null,
    saldo_da_conta varchar(100),

    primary key(id)

);