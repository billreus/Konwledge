# 使用子查询的方式找出属于Action分类的所有电影对应的title,description

## 题目描述
film表
column0 | column1
------- | -------
字段 | 说明
film_id | 电影id
title | 电影名称
description | 电影描述信息

```sql
CREATE TABLE IF NOT EXISTS film (
film_id smallint(5)  NOT NULL DEFAULT '0',
title varchar(255) NOT NULL,
description text,
PRIMARY KEY (film_id));

```
category表
column0 | column1
------- | -------
字段 | 说明
category_id | 电影分类id
name | 电影分类名称
last_update | 电影分类最后更新时间

```sql
CREATE TABLE category  (
category_id  tinyint(3)  NOT NULL ,
name  varchar(25) NOT NULL, `last_update` timestamp,
PRIMARY KEY ( category_id ));
```

film_category表
column0 | column1
------- | -------
字段 | 说明
film_id | 电影id
category_id | 电影分类id
last_update | 电影id和分类id对应关系的最后更新时间

```sql
CREATE TABLE film_category  (
film_id  smallint(5)  NOT NULL,
category_id  tinyint(3)  NOT NULL, `last_update` timestamp);
```

使用子查询的方式找出属于Action分类的所有电影对应的title,descriptio

## 题解

使用子查询

```sql
select title, description from film as f
where f.film_id in(
select fc.film_id from film_category as fc
where fc.category_id in (
select c.category_id from category as c
where c.name = 'Action'))
```