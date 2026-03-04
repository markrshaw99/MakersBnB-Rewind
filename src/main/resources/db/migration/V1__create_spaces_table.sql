CREATE TABLE spaces (
    id bigserial PRIMARY KEY,
    name varchar(250) NOT NULL,
    description text,
    price numeric(10,2),
    rules text,
    owner_id bigint
);
