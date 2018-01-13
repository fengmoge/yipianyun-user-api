package yipianyun.user.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Entity implements Serializable{
	
	private static final long serialVersionUID = -2575885979551096616L;

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public boolean equals(Object vo) {
		return EqualsBuilder.reflectionEquals(this, vo);
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
