# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table canciones (
  id                            serial not null,
  user_id                       integer,
  nombre                        varchar(255),
  descripcion                   varchar(255),
  url_cancion                   varchar(255),
  constraint pk_canciones primary key (id)
);

create table usuario (
  id                            serial not null,
  email                         varchar(255),
  paswd                         varchar(255),
  nombre                        varchar(255),
  is_artist                     boolean,
  constraint pk_usuario primary key (id)
);

alter table canciones add constraint fk_canciones_user_id foreign key (user_id) references usuario (id) on delete restrict on update restrict;
create index ix_canciones_user_id on canciones (user_id);


# --- !Downs

alter table if exists canciones drop constraint if exists fk_canciones_user_id;
drop index if exists ix_canciones_user_id;

drop table if exists canciones cascade;

drop table if exists usuario cascade;

