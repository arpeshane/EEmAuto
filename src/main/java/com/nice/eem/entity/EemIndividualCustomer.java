package com.nice.eem.entity;

//Generated May 17, 2018 12:04:17 PM by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
*
* @author pooja.v
*/
@Entity
@Table(name = "eem_individual_customer")
public class EemIndividualCustomer {

 @Id
 @Column(name="customer_id")
 @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long customerId;
 
 @Column(name="cust_name")
  private String custName;
 
 @Column(name="cust_mail_id")
  private String custMailId;
 
 @Column(name="cust_start_day")
  private String custStartDay;
 
 @Column(name="cust_end_day")
  private String custEndDay;
 
 @Column(name="create_date")
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date createDate;
 
 @Column(name="scheduled_daily")
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date scheduledDaily;
 
 @Column(name="scheduled_weekly")
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date scheduledWeekly;
 
 @Column(name="scheduled_time")
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date scheduledTime;
 
 @Column(name="program_wise_report")
  private String programWiseReport;
 
 @Column(name="site_wise_report")
  private String siteWiseReport;
 
 @Column(name="reason_for_deactivation")
  private String reasonForDeactivation;
 
 @Column(name="cust_deactivation_id")
  private Integer custDeactivationId;
 
 @Column(name="date_of_deactivation")
  @Temporal(javax.persistence.TemporalType.DATE)
  private Date dateOfDeactivation;
 
 @Column(name="last_modified_date")
 @Temporal(javax.persistence.TemporalType.DATE)
  private Date lastModifiedDate;
 
 @Column(name="diactivated_by")
  private String diactivatedBy;
 
 @Column(name="status")
  private String status;

 public EemIndividualCustomer() {
     super();
 }

   public EemIndividualCustomer(Long customerId) {
       super();
       this.customerId = customerId;
 }
   
 public EemIndividualCustomer(Long customerId, String custName, String custMailId, String custStartDay, String custEndDay, Date createDate, Date scheduledDaily, Date scheduledWeekly, Date scheduledTime, String programWiseReport, String siteWiseReport, String reasonForDeactivation, Integer custDeactivationId, Date dateOfDeactivation, Date lastModifiedDate, String diactivatedBy, String status) {
     super();
    this.customerId = customerId;
    this.custName = custName;
    this.custMailId = custMailId;
    this.custStartDay = custStartDay;
    this.custEndDay = custEndDay;
    this.createDate = createDate;
    this.scheduledDaily = scheduledDaily;
    this.scheduledWeekly = scheduledWeekly;
    this.scheduledTime = scheduledTime;
    this.programWiseReport = programWiseReport;
    this.siteWiseReport = siteWiseReport;
    this.reasonForDeactivation = reasonForDeactivation;
    this.custDeactivationId = custDeactivationId;
    this.dateOfDeactivation = dateOfDeactivation;
    this.lastModifiedDate = lastModifiedDate;
    this.diactivatedBy = diactivatedBy;
    this.status = status;
 }

 public Long getCustomerId() {
     return this.customerId;
 }
 
 public void setCustomerId(Long customerId) {
     this.customerId = customerId;
 }
 public String getCustName() {
     return this.custName;
 }
 
 public void setCustName(String custName) {
     this.custName = custName;
 }
 public String getCustMailId() {
     return this.custMailId;
 }
 
 public void setCustMailId(String custMailId) {
     this.custMailId = custMailId;
 }
 public String getCustStartDay() {
     return this.custStartDay;
 }
 
 public void setCustStartDay(String custStartDay) {
     this.custStartDay = custStartDay;
 }
 public String getCustEndDay() {
     return this.custEndDay;
 }
 
 public void setCustEndDay(String custEndDay) {
     this.custEndDay = custEndDay;
 }
 public Date getCreateDate() {
     return this.createDate;
 }
 
 public void setCreateDate(Date createDate) {
     this.createDate = createDate;
 }
 public Date getScheduledDaily() {
     return this.scheduledDaily;
 }
 
 public void setScheduledDaily(Date scheduledDaily) {
     this.scheduledDaily = scheduledDaily;
 }
 public Date getScheduledWeekly() {
     return this.scheduledWeekly;
 }
 
 public void setScheduledWeekly(Date scheduledWeekly) {
     this.scheduledWeekly = scheduledWeekly;
 }
 public Date getScheduledTime() {
     return this.scheduledTime;
 }
 
 public void setScheduledTime(Date scheduledTime) {
     this.scheduledTime = scheduledTime;
 }
 public String getProgramWiseReport() {
     return this.programWiseReport;
 }
 
 public void setProgramWiseReport(String programWiseReport) {
     this.programWiseReport = programWiseReport;
 }
 public String getSiteWiseReport() {
     return this.siteWiseReport;
 }
 
 public void setSiteWiseReport(String siteWiseReport) {
     this.siteWiseReport = siteWiseReport;
 }
 public String getReasonForDeactivation() {
     return this.reasonForDeactivation;
 }
 
 public void setReasonForDeactivation(String reasonForDeactivation) {
     this.reasonForDeactivation = reasonForDeactivation;
 }
 public Integer getCustDeactivationId() {
     return this.custDeactivationId;
 }
 
 public void setCustDeactivationId(Integer custDeactivationId) {
     this.custDeactivationId = custDeactivationId;
 }
 public Date getDateOfDeactivation() {
     return this.dateOfDeactivation;
 }
 
 public void setDateOfDeactivation(Date dateOfDeactivation) {
     this.dateOfDeactivation = dateOfDeactivation;
 }
 public Date getLastModifiedDate() {
     return this.lastModifiedDate;
 }
 
 public void setLastModifiedDate(Date lastModifiedDate) {
     this.lastModifiedDate = lastModifiedDate;
 }
 public String getDiactivatedBy() {
     return this.diactivatedBy;
 }
 
 public void setDiactivatedBy(String diactivatedBy) {
     this.diactivatedBy = diactivatedBy;
 }
 public String getStatus() {
     return this.status;
 }
 
 public void setStatus(String status) {
     this.status = status;
 }




}

