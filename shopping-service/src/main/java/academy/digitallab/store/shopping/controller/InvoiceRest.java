package academy.digitallab.store.shopping.controller;

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
import org.springframework.web.bind.annotation.RestController;

import academy.digitallab.store.shopping.entity.Invoice;
import academy.digitallab.store.shopping.entity.InvoiceItem;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/invoices")
public class InvoiceRest {

	@GetMapping
	public ResponseEntity<List<Invoice>> listAllInvoices() {
		List<Invoice> invoices = new ArrayList<>();

		List<InvoiceItem> invoicesItems = new ArrayList<>();
		InvoiceItem ii = InvoiceItem.builder().productId(1L).build();
		invoicesItems.add(ii);

		Invoice i = Invoice.builder().id(1L).customerId(1L).items(invoicesItems).build();
		invoices.add(i);

		return ResponseEntity.ok(invoices);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Invoice> getInvoice(@PathVariable("id") long id) {
		List<InvoiceItem> invoicesItems = new ArrayList<>();
		InvoiceItem ii = InvoiceItem.builder().productId(1L).build();
		invoicesItems.add(ii);

		Invoice i = Invoice.builder().customerId(1L).items(invoicesItems).build();
		return ResponseEntity.ok(i);
	}

	// -------------------Create a
	// Invoice-------------------------------------------
	@PostMapping
	public ResponseEntity<Invoice> createInvoice(@RequestBody Invoice invoice, BindingResult result) {
		log.info("Creating Invoice : {}", invoice);
		List<InvoiceItem> invoicesItems = new ArrayList<>();
		InvoiceItem ii = InvoiceItem.builder().productId(1L).build();
		invoicesItems.add(ii);

		Invoice invoiceDB = Invoice.builder().customerId(1L).items(invoicesItems).build();

		return ResponseEntity.status(HttpStatus.CREATED).body(invoiceDB);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<?> updateInvoice(@PathVariable("id") long id, @RequestBody Invoice invoice) {
		log.info("Updating Invoice with id {}", id);

		List<InvoiceItem> invoicesItems = new ArrayList<>();
		InvoiceItem ii = InvoiceItem.builder().productId(1L).build();
		invoicesItems.add(ii);

		Invoice currentInvoice = Invoice.builder().customerId(1L).items(invoicesItems).build();
		return ResponseEntity.ok(currentInvoice);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Invoice> deleteInvoice(@PathVariable("id") long id) {
		log.info("Fetching & Deleting Invoice with id {}", id);

		List<InvoiceItem> invoicesItems = new ArrayList<>();
		InvoiceItem ii = InvoiceItem.builder().productId(1L).build();
		invoicesItems.add(ii);

		Invoice invoice = Invoice.builder().customerId(1L).items(invoicesItems).build();
		return ResponseEntity.ok(invoice);
	}
}
