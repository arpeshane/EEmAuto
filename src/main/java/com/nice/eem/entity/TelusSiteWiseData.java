package com.nice.eem.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "workflexdatastatus_telus_site")
public class TelusSiteWiseData extends BaseSiteDataEntity {

	TelusSiteWiseData() {
		super();
	}
}