package com.server.service;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {
    
    public void setClazz(final Class<T> clazzToSet);
    
    T findOne(final long id);
 
   List<T> findAll();
 
   void create(final T entity);
 
   T update(final T entity);
 
   void delete(final T entity);
 
   void deleteById(final long entityId);
    
}
