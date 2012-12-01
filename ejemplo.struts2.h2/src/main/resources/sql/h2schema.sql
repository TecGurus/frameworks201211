-- 
-- TABLE: Banco 
--

CREATE TABLE Banco(
    idBanco    NUMBER(38, 0)    NOT NULL,
    nombre     VARCHAR2(50)     NOT NULL,
    CONSTRAINT PK1 PRIMARY KEY (idBanco)
);



-- 
-- TABLE: Cliente 
--

CREATE TABLE Cliente(
    idCliente    NUMBER(38, 0)    NOT NULL,
    nombre       VARCHAR2(50)     NOT NULL,
    apaterno     VARCHAR2(30)     NOT NULL,
    amaterno     VARCHAR2(50)     NOT NULL,
    edad         NUMBER(38, 0)    NOT NULL,
    idBanco      NUMBER(38, 0)    NOT NULL,
    CONSTRAINT PK2 PRIMARY KEY (idCliente)
)
;



-- 
-- TABLE: Cuenta 
--

CREATE TABLE Cuenta(
    idCuenta        NUMBER(38, 0)    NOT NULL,
    numeroCuenta    NUMBER(38, 0)    NOT NULL,
    idTipoCuenta    NUMBER(38, 0)    NOT NULL,
    idCliente       NUMBER(38, 0)    NOT NULL,
    CONSTRAINT PK3 PRIMARY KEY (idCuenta)
)
;



-- 
-- TABLE: Movimiento 
--

CREATE TABLE Movimiento(
    idMovimiento        NUMBER(38, 0)    NOT NULL,
    fecha               TIMESTAMP(6)     NOT NULL,
    monto               NUMBER(9, 2)     NOT NULL,
    idCuenta            NUMBER(38, 0)    NOT NULL,
    idTipoMovimiento    NUMBER(38, 0)    NOT NULL,
    CONSTRAINT PK5 PRIMARY KEY (idMovimiento)
)
;



-- 
-- TABLE: TipoCuenta 
--

CREATE TABLE TipoCuenta(
    idTipoCuenta    NUMBER(38, 0)    NOT NULL,
    nombre          VARCHAR2(20)     NOT NULL,
    CONSTRAINT PK4 PRIMARY KEY (idTipoCuenta)
)
;



-- 
-- TABLE: TipoMovimiento 
--

CREATE TABLE TipoMovimiento(
    idTipoMovimiento    NUMBER(38, 0)    NOT NULL,
    nombre              VARCHAR2(30)     NOT NULL,
    CONSTRAINT PK6 PRIMARY KEY (idTipoMovimiento)
)
;



-- 
-- TABLE: Cliente 
--

ALTER TABLE Cliente ADD CONSTRAINT RefBanco2 
    FOREIGN KEY (idBanco)
    REFERENCES Banco(idBanco)
;


-- 
-- TABLE: Cuenta 
--

ALTER TABLE Cuenta ADD CONSTRAINT RefTipoCuenta3 
    FOREIGN KEY (idTipoCuenta)
    REFERENCES TipoCuenta(idTipoCuenta)
;

ALTER TABLE Cuenta ADD CONSTRAINT RefCliente4 
    FOREIGN KEY (idCliente)
    REFERENCES Cliente(idCliente)
;


-- 
-- TABLE: Movimiento 
--

ALTER TABLE Movimiento ADD CONSTRAINT RefCuenta7 
    FOREIGN KEY (idCuenta)
    REFERENCES Cuenta(idCuenta)
;

ALTER TABLE Movimiento ADD CONSTRAINT RefTipoMovimiento10 
    FOREIGN KEY (idTipoMovimiento)
    REFERENCES TipoMovimiento(idTipoMovimiento)
;
