package cogent.capstone.modules;

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
	private String brokerName;
	private String brokerEmail;
	private String brokerPhoneNumber;
	private String brokerLicenseNumber;
}
