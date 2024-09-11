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
public class MigrationJobDto {
	private String jobId;
	private String connectionId_fk;
	private String startTime;
	private String completionTime;
	private String migrationStatus;;
}
