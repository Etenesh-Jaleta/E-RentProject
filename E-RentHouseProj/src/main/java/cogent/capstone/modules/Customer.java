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
	private int customerId;
	@Column
	private String customerName;
	@Column
	private String customerEmail;
	@Column
	private String customerPhone;

}
