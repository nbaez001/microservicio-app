CREATE TABLE tlb_invoices (
id BIGINT auto_increment not null primary key,
number_invoice varchar(25) null,
description varchar(250) null,
customer_id BIGINT null,
create_at date null,
state varchar(50) null
);

CREATE TABLE tbl_invoce_items (
id BIGINT auto_increment not null primary key,
invoice_id BIGINT not null,
product_id BIGINT not null,
quantity INT null,
price decimal(8,2) null,
FOREIGN KEY (invoice_id) REFERENCES tlb_invoices (id)
);