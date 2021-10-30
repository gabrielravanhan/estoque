CREATE TABLE produto (
    id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    preco DECIMAL(12, 2),
    id_categoria BIGINT
);

ALTER TABLE produto ADD CONSTRAINT FK_PRODUTO_CATEGORIA FOREIGN KEY (id_categoria) REFERENCES categoria(id);

INSERT INTO produto(nome, preco, id_categoria) VALUES ('Coca Cola 2L', 9.90, 4);
INSERT INTO produto(nome, preco, id_categoria) VALUES ('Filé Mignon', 70.00, 1);
INSERT INTO produto(nome, preco, id_categoria) VALUES ('Filé de Tilápia', 33.00, 2);
INSERT INTO produto(nome, preco, id_categoria) VALUES ('Leite Integral Longa Vida UHT', 3.99, 3);