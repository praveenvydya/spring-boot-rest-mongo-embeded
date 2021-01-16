 
package com.portal.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "user")
public class User extends AbstractModel<Long> {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
	
 
	
//	 @Indexed(name = "deptName")
//	 private String name;
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String firstName;
	private String lastName;

    @NotBlank
    @Size(max=100)
    @Indexed(unique=true)
    private String email;

    private Date createdAt;

    @CreatedBy
    private String createdBy;

    private Date updatedAt;

    @LastModifiedBy
    private String updatedBy;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(@NotBlank @Size(max = 100) String firstName, String lastName, @NotBlank @Size(max = 100) String email,
			Date createdAt, String createdBy, Date updatedAt, String updatedBy) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", createdAt="
				+ createdAt + ", createdBy=" + createdBy + ", updatedAt=" + updatedAt + ", updatedBy=" + updatedBy
				+ "]";
	}

    
    
}
