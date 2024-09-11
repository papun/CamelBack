package com.dgf.demo_dgf.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "migration_job")
public class MigrationJob {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "job_id")
	private Long jobId;
	
	@Column(name = "start_time")
	private LocalDateTime startTime;
	
	@Column(name = "completion_time")
	private LocalDateTime completionTime;
	
	@Column(name = "migration_status")
	private String migrationStatus;
	
	@OneToOne
    @JoinColumn(name = "device_fk")
    private Device device;
	
	@OneToMany(mappedBy = "migrationJob", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MigrationTask> migrationTasks;

}
