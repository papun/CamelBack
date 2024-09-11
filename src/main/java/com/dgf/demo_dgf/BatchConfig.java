package com.dgf.demo_dgf;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.batch.core.repository.support.SimpleJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.data.MongoItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.transaction.PlatformTransactionManager;

import com.dgf.demo_dgf.document.model.DgfConnectionDocumentModel;
import com.dgf.demo_dgf.dto.ConnectionDto;

import lombok.extern.slf4j.Slf4j;

import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@Configuration
@EnableBatchProcessing
public class BatchConfig {

	/*
	 * private final JobBuilderFactory jobBuilderFactory; private final
	 * StepBuilderFactory stepBuilderFactory; private final MongoTemplate
	 * mongoTemplate;
	 * 
	 * public BatchConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory
	 * stepBuilderFactory, MongoTemplate mongoTemplate) { this.jobBuilderFactory =
	 * jobBuilderFactory; this.stepBuilderFactory = stepBuilderFactory;
	 * this.mongoTemplate = mongoTemplate; }
	 * 
	 * @Bean public JobRepository jobRepository() throws Exception {
	 * JobRepositoryFactoryBean factoryBean = new JobRepositoryFactoryBean();
	 * factoryBean.setTransactionManager(transactionManager());
	 * factoryBean.setDatabaseType("mongodb");
	 * factoryBean.setCollectionPrefix("batch_"); factoryBean.afterPropertiesSet();
	 * return factoryBean.getObject(); }
	 * 
	 * @Bean public PlatformTransactionManager transactionManager() { return new
	 * MongoTransactionManager(mongoTemplate.getMongoDbFactory()); }
	 */

}
