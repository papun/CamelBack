package com.dgf.demo_dgf;

/*
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.item.data.MongoItemReader;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
*/
import com.dgf.demo_dgf.document.model.DgfConnectionDocumentModel;
import com.dgf.demo_dgf.dto.ConnectionDto;

import java.util.Collections;


/*@Configuration*/
public class BatchJobConfig {
	/*
	 * private final JobBuilderFactory jobBuilderFactory; private final
	 * StepBuilderFactory stepBuilderFactory; private final MongoTemplate
	 * mongoTemplate;
	 */

	/*
	 * public BatchJobConfig(JobBuilderFactory jobBuilderFactory, StepBuilderFactory
	 * stepBuilderFactory, MongoTemplate mongoTemplate) { this.jobBuilderFactory =
	 * jobBuilderFactory; this.stepBuilderFactory = stepBuilderFactory;
	 * this.mongoTemplate = mongoTemplate; }
	 * 
	 * @Bean public Job processJob(JobRepository jobRepository) { return
	 * jobBuilderFactory.get("processJob") .incrementer(new RunIdIncrementer())
	 * .repository(jobRepository) .flow(orderStep1()) .end() .build(); }
	 * 
	 * @Bean public Step orderStep1() { return stepBuilderFactory.get("orderStep1")
	 * .<DgfConnectionDocumentModel, DgfConnectionDto>chunk(10)
	 * .reader(mongoItemReader()) .processor(processor()) .writer(writer())
	 * .build(); }
	 * 
	 * @Bean public MongoItemReader<DgfConnectionDocumentModel> mongoItemReader() {
	 * MongoItemReader<DgfConnectionDocumentModel> reader = new MongoItemReader<>();
	 * reader.setTemplate(mongoTemplate); reader.setQuery("{}"); // Add query
	 * conditions if needed reader.setTargetType(DgfConnectionDocumentModel.class);
	 * reader.setSort(Collections.singletonMap("_id", Sort.Direction.ASC)); return
	 * reader; }
	 * 
	 * @Bean public ItemProcessor<DgfConnectionDocumentModel, DgfConnectionDto>
	 * processor() { return document -> DgfConnectionDto.builder()
	 * .id(document.getId()) .name(document.getName())
	 * .oderable(Boolean.valueOf(document.getOderable()))
	 * .billable(Boolean.valueOf(document.getBillable()))
	 * .billing_name(document.getBilling_name()) .build(); }
	 * 
	 * @Bean public ItemWriter<DgfConnectionDto> writer() { return items -> { for
	 * (DgfConnectionDto item : items) { System.out.println(item); // Replace with
	 * actual processing logic } }; }
	 */
}



