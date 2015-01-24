/**
Creacion de la vista par_recurrencia
*/
CREATE VIEW par_recurrencia AS
    (
        select 
            codigo,            
            descripcion
        from
            par_valor
        where
            contexto = 'RECURRENCIA' and fecha_baja is null
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
            par_valor
        where
            contexto = 'TIPO_GRUPO' and fecha_baja is null
    );
