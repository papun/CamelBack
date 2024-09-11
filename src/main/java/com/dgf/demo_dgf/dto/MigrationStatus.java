package com.dgf.demo_dgf.dto;

import java.time.LocalDateTime;

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
public class MigrationStatus {
	private String datetime;
	private String ceaseRequestStatus; //Pending,Inprogress,Error,Completed
	private LocalDateTime ceaseRequestTime=LocalDateTime.now();
	private LocalDateTime ceaseCompletionTime=LocalDateTime.now();
	private String provideRequestStatus; //Pending,Inprogress,Error,Completed
	private String remark_Cease="test-remark_Cease";
	private String remark_provide="test-remark_provide";
	private String migrationStatus; //Pending,InProgress,Error,Completed
	private String ceasePayload;
	private String providePayload;
}
