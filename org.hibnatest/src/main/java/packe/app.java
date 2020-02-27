package packe;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="app")
public class app {
private int id;
private int domain_id;
private String name;
private int created_by;
private String description;
private String type;
private String category;
private String status;
private String app_fields;
private String version;
private String app_logo_url;
private String app_configuration;
private LocalDate created_date;
private int is_active;
private int updated_by;
private LocalDate updated_date;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getDomain_id() {
	return domain_id;
}
public void setDomain_id(int domain_id) {
	this.domain_id = domain_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCreated_by() {
	return created_by;
}
public void setCreated_by(int created_by) {
	this.created_by = created_by;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getApp_fields() {
	return app_fields;
}
public void setApp_fields(String app_fields) {
	this.app_fields = app_fields;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getApp_logo_url() {
	return app_logo_url;
}
public void setApp_logo_url(String app_logo_url) {
	this.app_logo_url = app_logo_url;
}
public String getApp_configuration() {
	return app_configuration;
}
public void setApp_configuration(String app_configuration) {
	this.app_configuration = app_configuration;
}
public LocalDate getCreated_date() {
	return created_date;
}
public void setCreated_date(LocalDate created_date) {
	this.created_date = created_date;
}
public int getIs_active() {
	return is_active;
}
public void setIs_active(int is_active) {
	this.is_active = is_active;
}
public int getUpdated_by() {
	return updated_by;
}
public void setUpdated_by(int updated_by) {
	this.updated_by = updated_by;
}
public LocalDate getUpdated_date() {
	return updated_date;
}
public void setUpdated_date(LocalDate updated_date) {
	this.updated_date = updated_date;
}

@Override
public String toString() {
	return "app [id=" + id + ", domain_id=" + domain_id + ", name=" + name + ", created_by=" + created_by
			+ ", description=" + description + ", type=" + type + ", category=" + category + ", status=" + status
			+ ", app_fields=" + app_fields + ", version=" + version + ", app_logo_url=" + app_logo_url
			+ ", app_configuration=" + app_configuration + ", created_date=" + created_date + ", is_active=" + is_active
			+ ", updated_by=" + updated_by + ", updated_date=" + updated_date + "]";
}

}
