package cogent.capstone.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "owners")
public class Owner {
	@Id
	@Column(name = "ownerid")
	private int OwnerId;
	@Column(name = "ownername")
	private String OwnerName;
	@Column(name = "owneremail")
	private String OwnerEmail;
	@Column(name = "ownerphonenumber")
	private String OwnerPhoneNumber;
	@OneToOne(mappedBy = "OwnerId")
	private Property property;
}
