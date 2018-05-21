package com.nice.eem.entity;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "workflexdatastatus_lyft_site")
public class LyftSiteWiseData extends BaseSiteDataEntity {

	LyftSiteWiseData() {
		super();
	}
}