package cogent.capstone.modules;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Property {
	@Id
	private int propertyId;
	private String propertyAddress;
	private int propertyBuiltYear;

	@OneToOne
	@JoinColumn(name = "ownerId", nullable = false)
	private Owner ownerId;
}
