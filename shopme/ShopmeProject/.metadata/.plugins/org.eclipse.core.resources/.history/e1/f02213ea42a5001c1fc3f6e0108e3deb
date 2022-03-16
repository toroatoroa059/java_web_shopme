package com.shopme.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Entity
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, unique = true, length = 40)
	private String name;
	
	@Column(nullable = false, length = 150)
	private String description;
	
	/**
	 * Required Empty Constructor
	 */
	
	public Role() {}
	
	public Role(Integer id) {
		this.id = id;
	}
	
	public Role(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return new HashCodeBuilder().append(getId())
				.append(getName())
				.append(getDescription())
				.build();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Role)) return false;
		
		Role that = (Role) obj;
		return new EqualsBuilder().append(getId(), that.getId())
				.append(getName(), that.getName())
				.append(getDescription(), that.getDescription())
				.isEquals();
	}
	
}
