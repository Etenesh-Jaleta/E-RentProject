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
	@Column(name = "brokerid")
	private int BrokerId;
	@Column(name = "brokername")
	private String BrokerName;
	@Column(name = "brokeremail")
	private String BrokerEmail;
	@Column(name = "brokerphonenumber")
	private String BrokerPhoneNumber;
	@Column(name = "brokerlicensenumber")
	private String BrokerLicenseNumber;
}
