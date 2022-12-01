package com.glfasshonstore.glfasshoncatalogueservice.repository;


import com.glfasshonstore.glfasshoncatalogueservice.dto.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    List<Product> findByCategory(String category);

}