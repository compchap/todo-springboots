package io.compchap.springboots.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todo")
public class ToDo {
	@Id
	private String id;
	private String description;
	private String status;
	private String createdOn;
	
	public ToDo() {
	}
	
	public ToDo(String id, String description, String status, String createdOn) {
		super();
		this.id = id;
		this.description = description;
		this.status = status;
		this.createdOn = createdOn;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
	@Override
	public String toString(){
		return String.format("ToDo[id=%s, description=%s, createdOn=%s, status=%s]", id, description, createdOn, status);
	}

}
