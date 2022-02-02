package academy.digitallab.store.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import academy.digitallab.store.customer.entity.Customer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerRest {

	@GetMapping
	public ResponseEntity<List<Customer>> listAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		Customer c = Customer.builder().firstName("NERIO").id(1L).build();
		customers.add(c);
		return ResponseEntity.ok(customers);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id) {
		log.info("Fetching Customer with id {}", id);
		Customer customer = Customer.builder().firstName("NERIO").id(1L).build();
		return ResponseEntity.ok(customer);
	}

	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer, BindingResult result) {
		log.info("Creating Customer : {}", customer);
		Customer customerDB = Customer.builder().firstName("NERIO").id(1L).build();

		return ResponseEntity.status(HttpStatus.CREATED).body(customerDB);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {
		log.info("Updating Customer with id {}", id);

		Customer currentCustomer = Customer.builder().firstName("NERIO").id(1L).build();
		currentCustomer.setId(id);
		return ResponseEntity.ok(currentCustomer);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") long id) {
		log.info("Fetching & Deleting Customer with id {}", id);

		Customer customer = Customer.builder().firstName("NERIO").id(1L).build();
		return ResponseEntity.ok(customer);
	}

}
