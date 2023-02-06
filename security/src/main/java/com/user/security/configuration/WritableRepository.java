package com.user.security.configuration;

import java.io.Serializable;

import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface WritableRepository<T, ID extends Serializable> extends ReadOnlyRepository<T, ID> {

    <S extends T> S save(S entity);
    <S extends T> S saveAndFlush(S entity);
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);
    void flush();

    void deleteById(ID id);
    void delete(T entity);
    void deleteAll(Iterable<? extends T> entities);

}
