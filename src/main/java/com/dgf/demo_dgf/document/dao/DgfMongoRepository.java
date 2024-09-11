package com.dgf.demo_dgf.document.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dgf.demo_dgf.document.model.DgfConnectionDocumentModel;

public interface DgfMongoRepository extends MongoRepository<DgfConnectionDocumentModel, Long>  {

}
