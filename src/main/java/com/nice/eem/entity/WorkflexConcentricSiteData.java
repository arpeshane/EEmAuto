package com.nice.eem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "workflexdatastatus_concentrix_site")
public class WorkflexConcentricSiteData extends BaseSiteDataEntity {

	WorkflexConcentricSiteData() {
		super();
	}
}