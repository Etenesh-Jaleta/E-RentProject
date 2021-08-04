package cogent.capstone.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
	@Id
	private int customerId;
	private String customerName;
	private String customerEmail;
	private String customerPhone;

}
