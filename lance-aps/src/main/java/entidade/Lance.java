package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Lance {
	
	@Id
	@GeneratedValue	
	private Integer id; 
	@Column (nullable = false, length = 100)
	private Integer v1;
	@Column (nullable = false, length = 100)
	private Integer v2;
	@Column (nullable = false, length = 100)
	private Integer v3;
	@Column (nullable = false, length = 100)
	private Integer total;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getV1() {
		return v1;
	}

	public void setV1(Integer v1) {
		this.v1 = v1;
	}

	public Integer getV2() {
		return v2;
	}

	public void setV2(Integer v2) {
		this.v2 = v2;
	}

	public Integer getV3() {
		return v3;
	}

	public void setV3(Integer v3) {
		this.v3 = v3;
	}

	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
		
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//da um cache
		Lance other = (Lance) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
