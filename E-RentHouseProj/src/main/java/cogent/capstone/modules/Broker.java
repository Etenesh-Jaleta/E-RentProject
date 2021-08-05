package cogent.capstone.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "brokers")
public class Broker {
	@Id
	private int brokerId;
	@Column
	private String brokerName;
	@Column
	private String brokerEmail;
	@Column
	private String brokerPhoneNumber;
	@Column
	private String brokerLicenseNumber;
}
