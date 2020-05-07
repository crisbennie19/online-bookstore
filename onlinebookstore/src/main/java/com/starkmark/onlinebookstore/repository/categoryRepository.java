package com.starkmark.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starkmark.onlinebookstore.entity.TblCategory;

public interface categoryRepository extends JpaRepository<TblCategory, Long> {

}
