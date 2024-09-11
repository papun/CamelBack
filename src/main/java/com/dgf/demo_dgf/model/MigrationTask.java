package com.dgf.demo_dgf.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
@Entity
@Table(name = "migration_task")
public class MigrationTask {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private Long taskId;
	
	@Column(name = "connection_id")
	private Long connectionId;
	
	@Column(name = "cease_payload")
	private String ceasePayload;
	
	@Column(name = "cease_request_status")
	private String ceaseRequestStatus; //Pending,Inprogress,Error,Completed
	
	@Column(name = "cease_request_time")
	private LocalDateTime ceaseRequestTime;
	
	@Column(name = "cease_completion_time")
	private LocalDateTime ceaseCompletionTime;
	
	@Column(name = "remark_cease")
	private String remark_Cease;
	
	@Column(name = "migration_status")
	private String migrationStatus;
	
	@Column(name = "provide_request_status")
	private String provideRequestStatus; //Pending,Inprogress,Error,Completed
	
	@Column(name = "provide_payload")
	private String providePayload;
	
	@Column(name = "remark_provide")
	private String remarkProvide;	
	
	 @ManyToOne
	 @JoinColumn(name = "migrationJobId_fk")
	 private MigrationJob migrationJob;
	
}
