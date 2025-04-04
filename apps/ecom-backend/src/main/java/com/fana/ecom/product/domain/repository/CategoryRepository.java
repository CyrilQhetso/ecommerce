package com.fana.ecom.product.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fana.ecom.product.domain.aggregate.Category;
import com.fana.ecom.product.domain.vo.PublicId;

public interface CategoryRepository {

    Page<Category> findAll(Pageable pageable);

    int delete(PublicId publicId);

    Category save(Category categoryToCreate);
}
