CREATE DATABASE GerenciadorDePedidos;
use GerenciadorDePedidos;

CREATE TABLE Cliente(
idCliente int (6) auto_increment primary key);

CREATE TABLE LocalLoja(
idLocalLoja int (6) auto_increment primary key
, EnderecoLoja varchar(30) not null
, UF varchar(3) not null);

CREATE TABLE Bebidas(
idBebidas int (6) auto_increment primary key
, valorBebida double(6,2) not null
, nomeBebida varchar(30) not null
, quantidadeBebida int (7) not null );

CREATE TABLE Assados(
idAssados int (6) auto_increment primary key
, valorAssado double(6,2) not null
, nomeAssado varchar(30) not null
, quantidadeAssado int (7) not null );

CREATE TABLE Adicional(
idAdicional int (6) auto_increment primary key
, valorAdicional double(6,2) not null
, nomeAdicional varchar(30) not null
, quantidadeAdicional int (7) not null );-- quantidade sendo inserida e nao a quantidade em estoque

-- -----------------

CREATE TABLE Usuarios(
idUsuarios int(6) auto_increment primary key
, loginUsuarios varchar(15) not null
, senhaUsuarios varchar (15) not null);

CREATE TABLE Gestores(
idGestores int(6) auto_increment primary key
, loginGestores varchar(15) not null
, senhaGestores varchar (15) not null);

-- ---------------
SELECT * FROM Assados;

SELECT * FROM Gestores;

SELECT * FROM Usuarios;

SELECT loginGestores, senhaGestores FROM Gestores;

SELECT loginUsuarios, senhaUsuarios FROM usuarios where loginUsuarios = "teste" and senhaUsuarios = "teste";

DELETE FROM Gestores WHERE idGestores = 4;
-- ---------

INSERT INTO Bebidas (valorbebida, nomeBebida, quantidadeBebida)
VALUES( 2
, "Coca Cola"
, 4),
(4
, "Sprite"
, 5);

INSERT INTO Assados (valorAssado, nomeAssado, quantidadeAssado)
VALUES(
5
, "Calzone de Carne"
, 6),
( 4.5
, "Crepe de queijo"
, 8);

INSERT INTO Adicional (valorAdicional, nomeAdicional, quantidadeAdicional)
VALUES(
1.00
, "Leite ninho"
, 10),
(0.50
, "Banana em rodelas"
, 30),
(
2.00
, "kiwi em cubos"
, 9);

-- ------------

CREATE TABLE Balconista(
idBalconista int(6) auto_increment primary key
, idLocalLoja int (6)
-- pesquisar modo salvar ArrayList SQL
 );
 
/*
CREATE TABLE Pedidos(
idBalconista int(6)
-- pesquisar modo salvar ArrayList SQL
);

CREATE TABLE Produtos(
-- pesquisar modo salvar ArrayList SQL
);
*/
