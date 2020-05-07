package com.starkmark.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starkmark.onlinebookstore.entity.TblBook;

public interface bookRepository extends JpaRepository<TblBook, Long> {

}
