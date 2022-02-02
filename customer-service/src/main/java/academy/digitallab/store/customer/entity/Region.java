package academy.digitallab.store.customer.entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
}
