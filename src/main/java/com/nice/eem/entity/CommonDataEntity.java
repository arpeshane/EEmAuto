package com.nice.eem.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class CommonDataEntity {

	@Id
	@Column(name = "id")
	private long id;
	@Column(name = "SSactiveagents")
	private int ssactiveagents;
	@Column(name = "ssactivelastthirtydays")
	private int ssactivelastthirtydays;
	@Column(name = "ssactivelastsevendays")
	private int ssactivelastsevendays;
	@Column(name = "totalagent")
	private int totalagent;
	@Column(name = "totalagentparticipating")
	private int totalagentparticipating;
	@Column(name = "mtdactiveagent")
	private int mtdactiveagent;
	@Column(name = "wtdactiveagent")
	private int wtdactiveagent;
	@Column(name = "currentdayactivegent")
	private int currentdayactivegent;
	@Column(name = "activelastthirtydays")
	private int activelastthirtydays;
	@Column(name = "activelastsevendays")
	private int activelastsevendays;
	@Column(name = "extrahrreqapproved")
	private int extrahrreqapproved;
	@Column(name = "extrahrreqdeclined")
	private int extrahrreqdeclined;
	@Column(name = "extrahrreqrtcwaiting")
	private int extrahrreqrtcwaiting;
	@Column(name = "extrahrreqautoapproved")
	private int extrahrreqautoapproved;

	@Column(name = "extrahrhoursapproved")
	private double extrahrhoursapproved;
	@Column(name = "extrahrhoursdeclined")
	private double extrahrhoursdeclined;
	@Column(name = "extrahrhoursrtcwaiting")
	private double extrahrhoursrtcwaiting;
	@Column(name = "extrahrhourautoapproved")
	private double extrahrhourautoapproved;
	@Column(name = "extrahrrulercmdagent")
	private double extrahrrulercmdagent;
	@Column(name = "extrahrrtcapproved")
	private double extrahrrtcapproved;
	@Column(name = "extrahragtaccepted")
	private double extrahragtaccepted;
	@Column(name = "extrahragtdecliend")
	private double extrahragtdecliend;
	@Column(name = "extrahragtnores")
	private double extrahragtnores;
	@Column(name = "vtoreqapproved")
	private int vtoreqapproved;
	@Column(name = "vtoreqdeclined")
	private int vtoreqdeclined;
	@Column(name = "vtoreqrtcwaiting")
	private int vtoreqrtcwaiting;
	@Column(name = "vtoreqautoapproved")
	private int vtoreqautoapproved;
	@Column(name = "vtohoursapproved")
	private double vtohoursapproved;
	@Column(name = "vtohoursdeclined")
	private double vtohoursdeclined;
	@Column(name = "vtohoursrtcwaiting")
	private double vtohoursrtcwaiting;

	@Column(name = "vtohourautoapproved")
	private double vtohourautoapproved;
	@Column(name = "vtohourrulercmdagent")
	private double vtohourrulercmdagent;
	@Column(name = "vtohourrtcapproved")
	private double vtohourrtcapproved;
	@Column(name = "vtohouragtaccepted")
	private double vtohouragtaccepted;
	@Column(name = "vtohouragtdecliend")
	private double vtohouragtdecliend;
	@Column(name = "vtohouragtnores")
	private double vtohouragtnores;
	@Column(name = "ptoreqapproved")
	private int ptoreqapproved;
	@Column(name = "ptoreqdeclined")
	private int ptoreqdeclined;
	@Column(name = "ptoreqautoapproved")
	private int ptoreqautoapproved;
	@Column(name = "ptohoursapproved")
	private double ptohoursapproved;
	@Column(name = "ptohourautoapproved")
	private double ptohourautoapproved;
	@Column(name = "ptohoursdeclined")
	private double ptohoursdeclined;
	@Column(name = "ttlswap")
	private int ttlswap;
	@Column(name = "ttlswaphr")
	private double ttlswaphr;
	@Column(name = "tradereq")
	private int tradereq;
	@Column(name = "ttltrade_accepted")
	private int ttltrade_accepted;

	@Column(name = "ttltradehr")
	private double ttltradehr;
	@Column(name = "schedulehr")
	private double schedulehr;
	@Column(name = "ahtalert")
	private int ahtalert;
	@Column(name = "aux1")
	private Date aux1;
	@Column(name = "aux2")
	private Date aux2;
	@Column(name = "aux3")
	private Date aux3;
	@Column(name = "aux4")
	private Date aux4;
	@Column(name = "aux5")
	private Date aux5;
	@Column(name = "aux6")
	private Date aux6;
	@Column(name = "aux7")
	private Date aux7;
	@Column(name = "aux8")
	private Date aux8;
	@Column(name = "aux9")
	private Date aux9;
	
	@Column(name = "programid")
	private int programid;
	@Column(name = "programname")
	private String programname;
	@Column(name = "reportdate")
	private Date reportdate;
	@Column(name = "ctzdatetime")
	private Date ctzdatetime;
	@Column(name = "timezone")
	private String timezone;
	public CommonDataEntity() {
		super();
	}
	public CommonDataEntity(long id) {
		super();
		this.id = id;
	}
	public CommonDataEntity(long id, int ssactiveagents, int ssactivelastthirtydays, int ssactivelastsevendays,
			int totalagent, int totalagentparticipating, int mtdactiveagent, int wtdactiveagent,
			int currentdayactivegent, int activelastthirtydays, int activelastsevendays, int extrahrreqapproved,
			int extrahrreqdeclined, int extrahrreqrtcwaiting, int extrahrreqautoapproved, double extrahrhoursapproved,
			double extrahrhoursdeclined, double extrahrhoursrtcwaiting, double extrahrhourautoapproved,
			double extrahrrulercmdagent, double extrahrrtcapproved, double extrahragtaccepted,
			double extrahragtdecliend, double extrahragtnores, int vtoreqapproved, int vtoreqdeclined,
			int vtoreqrtcwaiting, int vtoreqautoapproved, double vtohoursapproved, double vtohoursdeclined,
			double vtohoursrtcwaiting, double vtohourautoapproved, double vtohourrulercmdagent,
			double vtohourrtcapproved, double vtohouragtaccepted, double vtohouragtdecliend, double vtohouragtnores,
			int ptoreqapproved, int ptoreqdeclined, int ptoreqautoapproved, double ptohoursapproved,
			double ptohourautoapproved, double ptohoursdeclined, int ttlswap, double ttlswaphr, int tradereq,
			int ttltrade_accepted, double ttltradehr, double schedulehr, int ahtalert, Date aux1, Date aux2, Date aux3,
			Date aux4, Date aux5, Date aux6, Date aux7, Date aux8, Date aux9, int programid, String programname,
			Date reportdate, Date ctzdatetime, String timezone) {
		super();
		this.id = id;
		this.ssactiveagents = ssactiveagents;
		this.ssactivelastthirtydays = ssactivelastthirtydays;
		this.ssactivelastsevendays = ssactivelastsevendays;
		this.totalagent = totalagent;
		this.totalagentparticipating = totalagentparticipating;
		this.mtdactiveagent = mtdactiveagent;
		this.wtdactiveagent = wtdactiveagent;
		this.currentdayactivegent = currentdayactivegent;
		this.activelastthirtydays = activelastthirtydays;
		this.activelastsevendays = activelastsevendays;
		this.extrahrreqapproved = extrahrreqapproved;
		this.extrahrreqdeclined = extrahrreqdeclined;
		this.extrahrreqrtcwaiting = extrahrreqrtcwaiting;
		this.extrahrreqautoapproved = extrahrreqautoapproved;
		this.extrahrhoursapproved = extrahrhoursapproved;
		this.extrahrhoursdeclined = extrahrhoursdeclined;
		this.extrahrhoursrtcwaiting = extrahrhoursrtcwaiting;
		this.extrahrhourautoapproved = extrahrhourautoapproved;
		this.extrahrrulercmdagent = extrahrrulercmdagent;
		this.extrahrrtcapproved = extrahrrtcapproved;
		this.extrahragtaccepted = extrahragtaccepted;
		this.extrahragtdecliend = extrahragtdecliend;
		this.extrahragtnores = extrahragtnores;
		this.vtoreqapproved = vtoreqapproved;
		this.vtoreqdeclined = vtoreqdeclined;
		this.vtoreqrtcwaiting = vtoreqrtcwaiting;
		this.vtoreqautoapproved = vtoreqautoapproved;
		this.vtohoursapproved = vtohoursapproved;
		this.vtohoursdeclined = vtohoursdeclined;
		this.vtohoursrtcwaiting = vtohoursrtcwaiting;
		this.vtohourautoapproved = vtohourautoapproved;
		this.vtohourrulercmdagent = vtohourrulercmdagent;
		this.vtohourrtcapproved = vtohourrtcapproved;
		this.vtohouragtaccepted = vtohouragtaccepted;
		this.vtohouragtdecliend = vtohouragtdecliend;
		this.vtohouragtnores = vtohouragtnores;
		this.ptoreqapproved = ptoreqapproved;
		this.ptoreqdeclined = ptoreqdeclined;
		this.ptoreqautoapproved = ptoreqautoapproved;
		this.ptohoursapproved = ptohoursapproved;
		this.ptohourautoapproved = ptohourautoapproved;
		this.ptohoursdeclined = ptohoursdeclined;
		this.ttlswap = ttlswap;
		this.ttlswaphr = ttlswaphr;
		this.tradereq = tradereq;
		this.ttltrade_accepted = ttltrade_accepted;
		this.ttltradehr = ttltradehr;
		this.schedulehr = schedulehr;
		this.ahtalert = ahtalert;
		this.aux1 = aux1;
		this.aux2 = aux2;
		this.aux3 = aux3;
		this.aux4 = aux4;
		this.aux5 = aux5;
		this.aux6 = aux6;
		this.aux7 = aux7;
		this.aux8 = aux8;
		this.aux9 = aux9;
		this.programid = programid;
		this.programname = programname;
		this.reportdate = reportdate;
		this.ctzdatetime = ctzdatetime;
		this.timezone = timezone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSsactiveagents() {
		return ssactiveagents;
	}
	public void setSsactiveagents(int ssactiveagents) {
		this.ssactiveagents = ssactiveagents;
	}
	public int getSsactivelastthirtydays() {
		return ssactivelastthirtydays;
	}
	public void setSsactivelastthirtydays(int ssactivelastthirtydays) {
		this.ssactivelastthirtydays = ssactivelastthirtydays;
	}
	public int getSsactivelastsevendays() {
		return ssactivelastsevendays;
	}
	public void setSsactivelastsevendays(int ssactivelastsevendays) {
		this.ssactivelastsevendays = ssactivelastsevendays;
	}
	public int getTotalagent() {
		return totalagent;
	}
	public void setTotalagent(int totalagent) {
		this.totalagent = totalagent;
	}
	public int getTotalagentparticipating() {
		return totalagentparticipating;
	}
	public void setTotalagentparticipating(int totalagentparticipating) {
		this.totalagentparticipating = totalagentparticipating;
	}
	public int getMtdactiveagent() {
		return mtdactiveagent;
	}
	public void setMtdactiveagent(int mtdactiveagent) {
		this.mtdactiveagent = mtdactiveagent;
	}
	public int getWtdactiveagent() {
		return wtdactiveagent;
	}
	public void setWtdactiveagent(int wtdactiveagent) {
		this.wtdactiveagent = wtdactiveagent;
	}
	public int getCurrentdayactivegent() {
		return currentdayactivegent;
	}
	public void setCurrentdayactivegent(int currentdayactivegent) {
		this.currentdayactivegent = currentdayactivegent;
	}
	public int getActivelastthirtydays() {
		return activelastthirtydays;
	}
	public void setActivelastthirtydays(int activelastthirtydays) {
		this.activelastthirtydays = activelastthirtydays;
	}
	public int getActivelastsevendays() {
		return activelastsevendays;
	}
	public void setActivelastsevendays(int activelastsevendays) {
		this.activelastsevendays = activelastsevendays;
	}
	public int getExtrahrreqapproved() {
		return extrahrreqapproved;
	}
	public void setExtrahrreqapproved(int extrahrreqapproved) {
		this.extrahrreqapproved = extrahrreqapproved;
	}
	public int getExtrahrreqdeclined() {
		return extrahrreqdeclined;
	}
	public void setExtrahrreqdeclined(int extrahrreqdeclined) {
		this.extrahrreqdeclined = extrahrreqdeclined;
	}
	public int getExtrahrreqrtcwaiting() {
		return extrahrreqrtcwaiting;
	}
	public void setExtrahrreqrtcwaiting(int extrahrreqrtcwaiting) {
		this.extrahrreqrtcwaiting = extrahrreqrtcwaiting;
	}
	public int getExtrahrreqautoapproved() {
		return extrahrreqautoapproved;
	}
	public void setExtrahrreqautoapproved(int extrahrreqautoapproved) {
		this.extrahrreqautoapproved = extrahrreqautoapproved;
	}
	public double getExtrahrhoursapproved() {
		return extrahrhoursapproved;
	}
	public void setExtrahrhoursapproved(double extrahrhoursapproved) {
		this.extrahrhoursapproved = extrahrhoursapproved;
	}
	public double getExtrahrhoursdeclined() {
		return extrahrhoursdeclined;
	}
	public void setExtrahrhoursdeclined(double extrahrhoursdeclined) {
		this.extrahrhoursdeclined = extrahrhoursdeclined;
	}
	public double getExtrahrhoursrtcwaiting() {
		return extrahrhoursrtcwaiting;
	}
	public void setExtrahrhoursrtcwaiting(double extrahrhoursrtcwaiting) {
		this.extrahrhoursrtcwaiting = extrahrhoursrtcwaiting;
	}
	public double getExtrahrhourautoapproved() {
		return extrahrhourautoapproved;
	}
	public void setExtrahrhourautoapproved(double extrahrhourautoapproved) {
		this.extrahrhourautoapproved = extrahrhourautoapproved;
	}
	public double getExtrahrrulercmdagent() {
		return extrahrrulercmdagent;
	}
	public void setExtrahrrulercmdagent(double extrahrrulercmdagent) {
		this.extrahrrulercmdagent = extrahrrulercmdagent;
	}
	public double getExtrahrrtcapproved() {
		return extrahrrtcapproved;
	}
	public void setExtrahrrtcapproved(double extrahrrtcapproved) {
		this.extrahrrtcapproved = extrahrrtcapproved;
	}
	public double getExtrahragtaccepted() {
		return extrahragtaccepted;
	}
	public void setExtrahragtaccepted(double extrahragtaccepted) {
		this.extrahragtaccepted = extrahragtaccepted;
	}
	public double getExtrahragtdecliend() {
		return extrahragtdecliend;
	}
	public void setExtrahragtdecliend(double extrahragtdecliend) {
		this.extrahragtdecliend = extrahragtdecliend;
	}
	public double getExtrahragtnores() {
		return extrahragtnores;
	}
	public void setExtrahragtnores(double extrahragtnores) {
		this.extrahragtnores = extrahragtnores;
	}
	public int getVtoreqapproved() {
		return vtoreqapproved;
	}
	public void setVtoreqapproved(int vtoreqapproved) {
		this.vtoreqapproved = vtoreqapproved;
	}
	public int getVtoreqdeclined() {
		return vtoreqdeclined;
	}
	public void setVtoreqdeclined(int vtoreqdeclined) {
		this.vtoreqdeclined = vtoreqdeclined;
	}
	public int getVtoreqrtcwaiting() {
		return vtoreqrtcwaiting;
	}
	public void setVtoreqrtcwaiting(int vtoreqrtcwaiting) {
		this.vtoreqrtcwaiting = vtoreqrtcwaiting;
	}
	public int getVtoreqautoapproved() {
		return vtoreqautoapproved;
	}
	public void setVtoreqautoapproved(int vtoreqautoapproved) {
		this.vtoreqautoapproved = vtoreqautoapproved;
	}
	public double getVtohoursapproved() {
		return vtohoursapproved;
	}
	public void setVtohoursapproved(double vtohoursapproved) {
		this.vtohoursapproved = vtohoursapproved;
	}
	public double getVtohoursdeclined() {
		return vtohoursdeclined;
	}
	public void setVtohoursdeclined(double vtohoursdeclined) {
		this.vtohoursdeclined = vtohoursdeclined;
	}
	public double getVtohoursrtcwaiting() {
		return vtohoursrtcwaiting;
	}
	public void setVtohoursrtcwaiting(double vtohoursrtcwaiting) {
		this.vtohoursrtcwaiting = vtohoursrtcwaiting;
	}
	public double getVtohourautoapproved() {
		return vtohourautoapproved;
	}
	public void setVtohourautoapproved(double vtohourautoapproved) {
		this.vtohourautoapproved = vtohourautoapproved;
	}
	public double getVtohourrulercmdagent() {
		return vtohourrulercmdagent;
	}
	public void setVtohourrulercmdagent(double vtohourrulercmdagent) {
		this.vtohourrulercmdagent = vtohourrulercmdagent;
	}
	public double getVtohourrtcapproved() {
		return vtohourrtcapproved;
	}
	public void setVtohourrtcapproved(double vtohourrtcapproved) {
		this.vtohourrtcapproved = vtohourrtcapproved;
	}
	public double getVtohouragtaccepted() {
		return vtohouragtaccepted;
	}
	public void setVtohouragtaccepted(double vtohouragtaccepted) {
		this.vtohouragtaccepted = vtohouragtaccepted;
	}
	public double getVtohouragtdecliend() {
		return vtohouragtdecliend;
	}
	public void setVtohouragtdecliend(double vtohouragtdecliend) {
		this.vtohouragtdecliend = vtohouragtdecliend;
	}
	public double getVtohouragtnores() {
		return vtohouragtnores;
	}
	public void setVtohouragtnores(double vtohouragtnores) {
		this.vtohouragtnores = vtohouragtnores;
	}
	public int getPtoreqapproved() {
		return ptoreqapproved;
	}
	public void setPtoreqapproved(int ptoreqapproved) {
		this.ptoreqapproved = ptoreqapproved;
	}
	public int getPtoreqdeclined() {
		return ptoreqdeclined;
	}
	public void setPtoreqdeclined(int ptoreqdeclined) {
		this.ptoreqdeclined = ptoreqdeclined;
	}
	public int getPtoreqautoapproved() {
		return ptoreqautoapproved;
	}
	public void setPtoreqautoapproved(int ptoreqautoapproved) {
		this.ptoreqautoapproved = ptoreqautoapproved;
	}
	public double getPtohoursapproved() {
		return ptohoursapproved;
	}
	public void setPtohoursapproved(double ptohoursapproved) {
		this.ptohoursapproved = ptohoursapproved;
	}
	public double getPtohourautoapproved() {
		return ptohourautoapproved;
	}
	public void setPtohourautoapproved(double ptohourautoapproved) {
		this.ptohourautoapproved = ptohourautoapproved;
	}
	public double getPtohoursdeclined() {
		return ptohoursdeclined;
	}
	public void setPtohoursdeclined(double ptohoursdeclined) {
		this.ptohoursdeclined = ptohoursdeclined;
	}
	public int getTtlswap() {
		return ttlswap;
	}
	public void setTtlswap(int ttlswap) {
		this.ttlswap = ttlswap;
	}
	public double getTtlswaphr() {
		return ttlswaphr;
	}
	public void setTtlswaphr(double ttlswaphr) {
		this.ttlswaphr = ttlswaphr;
	}
	public int getTradereq() {
		return tradereq;
	}
	public void setTradereq(int tradereq) {
		this.tradereq = tradereq;
	}
	public int getTtltrade_accepted() {
		return ttltrade_accepted;
	}
	public void setTtltrade_accepted(int ttltrade_accepted) {
		this.ttltrade_accepted = ttltrade_accepted;
	}
	public double getTtltradehr() {
		return ttltradehr;
	}
	public void setTtltradehr(double ttltradehr) {
		this.ttltradehr = ttltradehr;
	}
	public double getSchedulehr() {
		return schedulehr;
	}
	public void setSchedulehr(double schedulehr) {
		this.schedulehr = schedulehr;
	}
	public int getAhtalert() {
		return ahtalert;
	}
	public void setAhtalert(int ahtalert) {
		this.ahtalert = ahtalert;
	}
	public Date getAux1() {
		return aux1;
	}
	public void setAux1(Date aux1) {
		this.aux1 = aux1;
	}
	public Date getAux2() {
		return aux2;
	}
	public void setAux2(Date aux2) {
		this.aux2 = aux2;
	}
	public Date getAux3() {
		return aux3;
	}
	public void setAux3(Date aux3) {
		this.aux3 = aux3;
	}
	public Date getAux4() {
		return aux4;
	}
	public void setAux4(Date aux4) {
		this.aux4 = aux4;
	}
	public Date getAux5() {
		return aux5;
	}
	public void setAux5(Date aux5) {
		this.aux5 = aux5;
	}
	public Date getAux6() {
		return aux6;
	}
	public void setAux6(Date aux6) {
		this.aux6 = aux6;
	}
	public Date getAux7() {
		return aux7;
	}
	public void setAux7(Date aux7) {
		this.aux7 = aux7;
	}
	public Date getAux8() {
		return aux8;
	}
	public void setAux8(Date aux8) {
		this.aux8 = aux8;
	}
	public Date getAux9() {
		return aux9;
	}
	public void setAux9(Date aux9) {
		this.aux9 = aux9;
	}
	public int getProgramid() {
		return programid;
	}
	public void setProgramid(int programid) {
		this.programid = programid;
	}
	public String getProgramname() {
		return programname;
	}
	public void setProgramname(String programname) {
		this.programname = programname;
	}
	public Date getReportdate() {
		return reportdate;
	}
	public void setReportdate(Date reportdate) {
		this.reportdate = reportdate;
	}
	public Date getCtzdatetime() {
		return ctzdatetime;
	}
	public void setCtzdatetime(Date ctzdatetime) {
		this.ctzdatetime = ctzdatetime;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	@Override
	public String toString() {
		return "CommonDataEntity [id=" + id + ", ssactiveagents=" + ssactiveagents + ", ssactivelastthirtydays="
				+ ssactivelastthirtydays + ", ssactivelastsevendays=" + ssactivelastsevendays + ", totalagent="
				+ totalagent + ", totalagentparticipating=" + totalagentparticipating + ", mtdactiveagent="
				+ mtdactiveagent + ", wtdactiveagent=" + wtdactiveagent + ", currentdayactivegent="
				+ currentdayactivegent + ", activelastthirtydays=" + activelastthirtydays + ", activelastsevendays="
				+ activelastsevendays + ", extrahrreqapproved=" + extrahrreqapproved + ", extrahrreqdeclined="
				+ extrahrreqdeclined + ", extrahrreqrtcwaiting=" + extrahrreqrtcwaiting + ", extrahrreqautoapproved="
				+ extrahrreqautoapproved + ", extrahrhoursapproved=" + extrahrhoursapproved + ", extrahrhoursdeclined="
				+ extrahrhoursdeclined + ", extrahrhoursrtcwaiting=" + extrahrhoursrtcwaiting
				+ ", extrahrhourautoapproved=" + extrahrhourautoapproved + ", extrahrrulercmdagent="
				+ extrahrrulercmdagent + ", extrahrrtcapproved=" + extrahrrtcapproved + ", extrahragtaccepted="
				+ extrahragtaccepted + ", extrahragtdecliend=" + extrahragtdecliend + ", extrahragtnores="
				+ extrahragtnores + ", vtoreqapproved=" + vtoreqapproved + ", vtoreqdeclined=" + vtoreqdeclined
				+ ", vtoreqrtcwaiting=" + vtoreqrtcwaiting + ", vtoreqautoapproved=" + vtoreqautoapproved
				+ ", vtohoursapproved=" + vtohoursapproved + ", vtohoursdeclined=" + vtohoursdeclined
				+ ", vtohoursrtcwaiting=" + vtohoursrtcwaiting + ", vtohourautoapproved=" + vtohourautoapproved
				+ ", vtohourrulercmdagent=" + vtohourrulercmdagent + ", vtohourrtcapproved=" + vtohourrtcapproved
				+ ", vtohouragtaccepted=" + vtohouragtaccepted + ", vtohouragtdecliend=" + vtohouragtdecliend
				+ ", vtohouragtnores=" + vtohouragtnores + ", ptoreqapproved=" + ptoreqapproved + ", ptoreqdeclined="
				+ ptoreqdeclined + ", ptoreqautoapproved=" + ptoreqautoapproved + ", ptohoursapproved="
				+ ptohoursapproved + ", ptohourautoapproved=" + ptohourautoapproved + ", ptohoursdeclined="
				+ ptohoursdeclined + ", ttlswap=" + ttlswap + ", ttlswaphr=" + ttlswaphr + ", tradereq=" + tradereq
				+ ", ttltrade_accepted=" + ttltrade_accepted + ", ttltradehr=" + ttltradehr + ", schedulehr="
				+ schedulehr + ", ahtalert=" + ahtalert + ", aux1=" + aux1 + ", aux2=" + aux2 + ", aux3=" + aux3
				+ ", aux4=" + aux4 + ", aux5=" + aux5 + ", aux6=" + aux6 + ", aux7=" + aux7 + ", aux8=" + aux8
				+ ", aux9=" + aux9 + ", programid=" + programid + ", programname=" + programname + ", reportdate="
				+ reportdate + ", ctzdatetime=" + ctzdatetime + ", timezone=" + timezone + "]";
	}

	
}
