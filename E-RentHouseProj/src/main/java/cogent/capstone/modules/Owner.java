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
	private int ownerId;
	@Column
	private String ownerName;
	@Column
	private String ownerEmail;
	@Column
	private String ownerPhoneNumber;
	@OneToOne(mappedBy = "ownerId")
	private Property property;
}
