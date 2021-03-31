package com.example.demo.service;

import java.util.List;

public interface IService<E> {
    List<E> findAll();

    E add(E e);

    void remove(E e);

    E update(E e);

    E findById(Long id);
}
