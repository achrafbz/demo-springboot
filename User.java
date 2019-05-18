package com.stago.model;

import java.util.UUID;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class User {

	private String login;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	private String password;

	private boolean active;

	private Date created;

	private Date updated;

	private Date lastConnection;

	public User() {
	}

	public User(String login, UUID id, String password, boolean active, Date created, Date updated,
			Date lastConnection) {
		super();
		this.login = login;
		this.id = id;
		this.password = password;
		this.active = active;
		this.created = created;
		this.updated = updated;
		this.lastConnection = lastConnection;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Date getLastConnection() {
		return lastConnection;
	}

	public void setLastConnection(Date lastConnection) {
		this.lastConnection = lastConnection;
	}

}
