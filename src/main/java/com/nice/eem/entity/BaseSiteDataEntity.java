package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseSiteDataEntity extends CommonDataEntity{
	@Column(name = "siteid")
	private int siteid;
	@Column(name = "sitename")
	private String sitename;
	public BaseSiteDataEntity() {
		super();
	}
	public BaseSiteDataEntity(int siteid, String sitename) {
		super();
		this.siteid = siteid;
		this.sitename = sitename;
	}
	public int getSiteid() {
		return siteid;
	}
	public void setSiteid(int siteid) {
		this.siteid = siteid;
	}
	public String getSitename() {
		return sitename;
	}
	public void setSitename(String sitename) {
		this.sitename = sitename;
	}
	@Override
	public String toString() {
		return "BaseSiteDataEntity [siteid=" + siteid + ", sitename=" + sitename + "]";
	}
	
	
}