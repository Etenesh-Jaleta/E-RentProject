package cogent.capstone.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "owners")
public class Owner {
	@Id
	private int ownerId;
	private String ownerName;
	private String ownerEmail;
	private String ownerPhoneNumber;
}
