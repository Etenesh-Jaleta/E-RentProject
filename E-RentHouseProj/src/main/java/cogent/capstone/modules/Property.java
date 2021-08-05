package cogent.capstone.modules;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

@Entity
@Data
public class Property {
	@Id
	private int propertyId;
	@Column
	private String propertyAddress;
	@Column
	private int propertyBuiltYear;

	@OneToOne
	@JoinColumn(name = "ownerId", nullable = false)
	@RestResource(path = "ownerProperty", rel = "ownerId")
	private Owner ownerId;
}
