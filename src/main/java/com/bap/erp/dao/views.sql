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
/**
Creacion de la vista par_proveedor_combustible
*/
CREATE VIEW par_proveedor_combustible AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'PROVEEDOR COMBUSTIBLE' and fecha_baja is null
    );
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
/**
Creacion de la vista par_tipo_grupo
*/
CREATE VIEW par_tipo_grupo AS
    (
        select 
            codigo,            
            descripcion
        from
            PAR_VALOR
        where
            contexto = 'TIPO GRUPO' and fecha_baja is null
    );
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
