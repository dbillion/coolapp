package com.oludayo.coolapp.repo;

import java.util.Collection;

import org.springframework.stereotype.Repository;

@Repository
public interface CommonRepository<T> {
    public T save(T domain);

    public Iterable<T> save(Collection<T> domains);

    public void delete(T domain);

    public T findById(String id);

    public Iterable<T> findAll();
}