package com.demo.elastic.springelasticdemo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.demo.elastic.springelasticdemo.document.*;


public interface PersonRepository extends ElasticsearchRepository<Person, String> {

}
