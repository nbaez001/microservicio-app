CREATE TABLE tbl_regions (
id BIGINT auto_increment not null primary key,
name varchar(250) null
);

CREATE TABLE tbl_customers (
id BIGINT auto_increment not null primary key,
number_id varchar(8) null,
first_name varchar(250) null,
last_name varchar(250) null,
email varchar(250) null,
photo_url varchar(250) null,
region_id BIGINT null,
state varchar(50) null,
FOREIGN KEY (region_id) REFERENCES tbl_regions (id)
);