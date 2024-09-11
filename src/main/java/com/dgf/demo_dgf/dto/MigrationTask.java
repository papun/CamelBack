package com.dgf.demo_dgf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MigrationTask {

	private String taskId;
	private String connectionId;
	private String ceasePayload;
	private String ceaseRequestStatus; //[Pending,inprogress,error,completed]
	private String ceaseRequestTime;
	private String ceaseCompletionTime;
	private String remarkCease;
	private String provideRequestSatus; //[Pending,inprogress,error,completed]
	private String providePayload;
	private String remarkProvide;	
}
