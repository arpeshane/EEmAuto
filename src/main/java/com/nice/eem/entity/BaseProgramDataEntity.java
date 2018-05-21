package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class BaseProgramDataEntity extends CommonDataEntity{
	@Column(name = "loginhoursactual")
	private double loginhoursactual;
	@Column(name = "abandonedcalls")
	private int abandonedcalls;
	@Column(name = "answeredcalls")
	private int answeredcalls;
	@Column(name = "acw")
	private double acw;
	@Column(name = "talktime")
	private double talktime;
	@Column(name = "ahtactual")
	private double ahtactual;
	@Column(name = "occupancy")
	private double occupancy;
	@Column(name = "servicelevel")
	private double servicelevel;
	@Column(name = "successrecordsinwfm")
	private int successrecordsinwfm;
	@Column(name = "failedrecordsinwfm")
	private int failedrecordsinwfm;
	public BaseProgramDataEntity() {
		super();
	}
	public BaseProgramDataEntity(double loginhoursactual, int abandonedcalls, int answeredcalls, double acw,
			double talktime, double ahtactual, double occupancy, double servicelevel, int successrecordsinwfm,
			int failedrecordsinwfm) {
		super();
		this.loginhoursactual = loginhoursactual;
		this.abandonedcalls = abandonedcalls;
		this.answeredcalls = answeredcalls;
		this.acw = acw;
		this.talktime = talktime;
		this.ahtactual = ahtactual;
		this.occupancy = occupancy;
		this.servicelevel = servicelevel;
		this.successrecordsinwfm = successrecordsinwfm;
		this.failedrecordsinwfm = failedrecordsinwfm;
	}
	public double getLoginhoursactual() {
		return loginhoursactual;
	}
	public void setLoginhoursactual(double loginhoursactual) {
		this.loginhoursactual = loginhoursactual;
	}
	public int getAbandonedcalls() {
		return abandonedcalls;
	}
	public void setAbandonedcalls(int abandonedcalls) {
		this.abandonedcalls = abandonedcalls;
	}
	public int getAnsweredcalls() {
		return answeredcalls;
	}
	public void setAnsweredcalls(int answeredcalls) {
		this.answeredcalls = answeredcalls;
	}
	public double getAcw() {
		return acw;
	}
	public void setAcw(double acw) {
		this.acw = acw;
	}
	public double getTalktime() {
		return talktime;
	}
	public void setTalktime(double talktime) {
		this.talktime = talktime;
	}
	public double getAhtactual() {
		return ahtactual;
	}
	public void setAhtactual(double ahtactual) {
		this.ahtactual = ahtactual;
	}
	public double getOccupancy() {
		return occupancy;
	}
	public void setOccupancy(double occupancy) {
		this.occupancy = occupancy;
	}
	public double getServicelevel() {
		return servicelevel;
	}
	public void setServicelevel(double servicelevel) {
		this.servicelevel = servicelevel;
	}
	public int getSuccessrecordsinwfm() {
		return successrecordsinwfm;
	}
	public void setSuccessrecordsinwfm(int successrecordsinwfm) {
		this.successrecordsinwfm = successrecordsinwfm;
	}
	public int getFailedrecordsinwfm() {
		return failedrecordsinwfm;
	}
	public void setFailedrecordsinwfm(int failedrecordsinwfm) {
		this.failedrecordsinwfm = failedrecordsinwfm;
	}
	@Override
	public String toString() {
		return "BaseProgramDataEntity [loginhoursactual=" + loginhoursactual + ", abandonedcalls=" + abandonedcalls
				+ ", answeredcalls=" + answeredcalls + ", acw=" + acw + ", talktime=" + talktime + ", ahtactual="
				+ ahtactual + ", occupancy=" + occupancy + ", servicelevel=" + servicelevel + ", successrecordsinwfm="
				+ successrecordsinwfm + ", failedrecordsinwfm=" + failedrecordsinwfm + "]";
	}
	
}
