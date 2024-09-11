package com.dgf.demo_dgf.document.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Document(collection = "migration_status")
public class MigrationStatusDocumentModel {
	private String connectionId_fk;
	private String datetime;;
	private String ceaseRequestStatus; //Pending,Inprogress,Error,Completed
	private String ceaseRequestTime;
	private String ceaseCompletionTime;
	private String provideRequestStatus; //Pending,Inprogress,Error,Completed
	private String remark_Cease;
	private String remark_provide;
	private String migrationStatus; //Pending,InProgress,Error,Completed
	private String ceasePayload;
	private String providePayload;
}
