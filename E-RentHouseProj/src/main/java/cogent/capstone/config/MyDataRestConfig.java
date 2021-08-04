package cogent.capstone.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import cogent.capstone.modules.Broker;
import cogent.capstone.modules.Customer;
import cogent.capstone.modules.Owner;
import cogent.capstone.modules.Property;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		Class[] domainTypes = { Property.class, Customer.class, Broker.class, Owner.class };
		config.exposeIdsFor(domainTypes);
	}
}
