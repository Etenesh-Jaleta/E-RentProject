package cogent.capstone.modules;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Entity
@Data
public class Property {
	@Id
	@Column(name = "propertyid")
	private int PropertyId;
	@Column(name = "propertyaddress")
	private String PropertyAddress;
	@Column(name = "propertybuiltyear")
	private Date PropertyBuiltYear;
	@Column(name = "price")
	private double price;
	@OneToOne
	@JoinColumn(name = "ownerid", nullable = false)
	@RestResource(path = "ownerProperty", rel = "OwnerId")
	private Owner OwnerId;
}
