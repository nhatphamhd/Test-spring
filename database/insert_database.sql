set search_path to test_spring;

insert into users (username,password,fullname,status)
values('MANAGER','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','ADMIN',1);

insert into users (username,password,fullname,status)
values('User','$2a$10$/RUbuT9KIqk6f8enaTQiLOXzhnUkiwEJRdtzdrMXXwU7dgnLKTCYG','PVN',2);

insert into new (code,thumbnail,title,content,shortDescription)
values('NEWS SPORT1','img1','bản tin thể thao1', 'bản tin thể thao1','bản tin thể thao1');
insert into new (code,thumbnail,title,content,shortDescription)

values('NEWS SPORT3','img3','bản tin thể thao3', 'bản tin thể thao3','bản tin thể thao3');

insert into new (code,thumbnail,title,content,shortDescription)
values('NEWS SPORT4','img4','bản tin thể thao4', 'bản tin thể thao4','bản tin thể thao4');