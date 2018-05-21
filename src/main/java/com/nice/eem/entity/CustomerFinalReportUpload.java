package com.nice.eem.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "customer_final_eport")
public class CustomerFinalReportUpload {
	@Id
	@GeneratedValue
	@Column(name = "report_file_id")
	private long id;
	@Column(name="report_file_name")
	private String fileName;
	@Lob
	@Column(name="report_file_data")
	private byte[] data;
	
	public CustomerFinalReportUpload() {
		super();
	}
	public CustomerFinalReportUpload(long id) {
		super();
		this.id = id;
	}
	public CustomerFinalReportUpload(long id, String fileName, byte[] data) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.data = data;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "UploadFile [id=" + id + ", fileName=" + fileName + ", data=" + Arrays.toString(data) + "]";
	}

	
}
