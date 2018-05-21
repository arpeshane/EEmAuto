package com.nice.eem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "workflexdatastatus_concentrix")
public class WorkflexConcentricProgramData extends BaseProgramDataEntity{
		
	WorkflexConcentricProgramData(){
		super();
	}
}