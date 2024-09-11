package com.dgf.demo_dgf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class MongoConfig {
	/*
	 * private final MongoTemplate mongoTemplate;
	 * 
	 * public MongoConfig(MongoTemplate mongoTemplate) { this.mongoTemplate =
	 * mongoTemplate; }
	 * 
	 * @Bean public MongoTransactionManager transactionManager() { return new
	 * MongoTransactionManager(mongoTemplate.getMongoDbFactory()); }
	 */
}
