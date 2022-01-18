package com.demo.elastic.springelasticdemo.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.demo.elastic.springelasticdemo.config")
public class ElasticConfiguration extends AbstractElasticsearchConfiguration {
	
	@Override
	public RestHighLevelClient elasticsearchClient() {
		return null;
	}

}
