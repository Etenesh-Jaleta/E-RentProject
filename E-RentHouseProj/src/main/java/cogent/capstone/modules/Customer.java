package cogent.capstone.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
	@Id
	@Column(name = "customerid")
	private int CustomerId;
	@Column(name = "customername")
	private String CustomerName;
	@Column(name = "customeremail")
	private String CustomerEmail;
	@Column(name = "customerphonenumber")
	private String CustomerPhone;

}
