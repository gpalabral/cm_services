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
            contexto = 'recurrencia' and fecha_baja is null
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
            contexto = 'tipoGrupo' and fecha_baja is null
    );
