package academy.digitallab.store.customer.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String numberID;
	private String firstName;
	private String lastName;
	private String email;
	private String photoUrl;
	private Region region;

	private String state;
}
