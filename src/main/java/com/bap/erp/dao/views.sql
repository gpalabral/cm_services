USE ERP;
/**
Creacion de la vista par_estado
*/
CREATE VIEW par_estado AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'ESTADO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'VIG', 'ESTADO', 'VIGENTE',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'NVIG', 'ESTADO', 'NO VIGENTE',NULL);
/**
Creacion de la vista par_forma_de_pago
*/
CREATE VIEW par_forma_de_pago AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'FORMA DE PAGO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'EFEC', 'FORMA DE PAGO', 'EFECTIVO',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'CHEQ', 'FORMA DE PAGO', 'CHEQUE',NULL);
/**
Creacion de la vista par_periodo
*/
CREATE VIEW par_periodo AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'PERIODO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'MEN', 'PERIODO', 'MENSUAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'BIMES', 'PERIODO', 'BIMESTRAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'TRIME', 'PERIODO', 'TRIMESTRAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'SEME', 'PERIODO', 'SEMESTRAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'ANU', 'PERIODO', 'ANUAL',NULL);
/**
Creacion de la vista par_recurrencia
*/
CREATE VIEW par_recurrencia AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'RECURRENCIA' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'PER', 'RECURRENCIA', 'PERIODICA',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'NOPER', 'RECURRENCIA', 'NO PERIODICA',NULL);
/**
Creacion de la vista par_tipo_contacto
*/
CREATE VIEW par_tipo_contacto AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO CONTACTO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'GER', 'TIPO CONTACTO', 'GERENTE',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'CCOM', 'TIPO CONTACTO', 'CONTACTO COMERCIAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'CDCP', 'TIPO CONTACTO', 'CONTACTO DE COBRO O PAGO',NULL);
/**
Creacion de la vista par_tipo_documento
*/
CREATE VIEW par_tipo_documento AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO DOCUMENTO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'CI', 'TIPO DOCUMENTO', 'CARNET DE IDENTIDAD',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'NIT', 'TIPO DOCUMENTO', 'NUMERO DE IDENTIFICACION TRIBUTARIA',NULL);
/**
Creacion de la vista par_tipo_documento_mercantil
*/
CREATE VIEW par_tipo_documento_mercantil AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO DOCUMENTO MERCANTIL' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'FACT', 'TIPO DOCUMENTO MERCANTIL', 'FACTURA',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'NODE', 'TIPO DOCUMENTO MERCANTIL', 'NOTA DE DEBITO',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'RECI', 'TIPO DOCUMENTO MERCANTIL', 'RECIBO',NULL);

/**
Creacion de la vista par_tipo_moneda
*/
CREATE VIEW par_tipo_moneda AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO MONEDA' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'BOL', 'TIPO MONEDA', 'BOLIVIANOS',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'SUS', 'TIPO MONEDA', 'DOLARES',NULL);
/**
Creacion de la vista par_tipo_proveedor_cliente
*/
CREATE VIEW par_tipo_proveedor_cliente AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO PROVEEDOR CLIENTE' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'NAT', 'TIPO PROVEEDOR CLIENTE', 'NATURAL',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'JUR', 'TIPO PROVEEDOR CLIENTE', 'JURIDICO',NULL);
/**s
Creacion de la vista par_tipo_registro
*/
CREATE VIEW par_tipo_registro AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO REGISTRO' and fecha_baja is null
    );
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'PROV', 'TIPO REGISTRO', 'PROVEEDOR',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'CLI', 'TIPO REGISTRO', 'CLIENTE',NULL);
INSERT INTO PAR_VALOR (fecha_alta, fecha_baja, fecha_modificacion, usuario_alta, usuario_baja, usuario_modificacion, codigo, contexto, descripcion, valor) 
VALUES (now(), NULL, now(),'test','test','test', 'AMB', 'TIPO REGISTRO', 'AMBOS',NULL);