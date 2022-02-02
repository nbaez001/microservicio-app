package academy.digitallab.store.product.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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

import academy.digitallab.store.product.entity.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@GetMapping
	public ResponseEntity<List<Product>> listProduct(
			@RequestParam(name = "categoryId", required = false) Long categoryId) {
		List<Product> products = new ArrayList<>();
		Product p = Product.builder().id(1L).name("PRODUCTO 1").build();
		products.add(p);

		return ResponseEntity.ok(products);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable("id") Long id) {
		Product product = Product.builder().id(1L).name("PRODUCTO 1").build();
		return ResponseEntity.ok(product);
	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product, BindingResult result) {
		Product productCreate = Product.builder().id(1L).name("PRODUCTO 1").build();
		return ResponseEntity.status(HttpStatus.CREATED).body(productCreate);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		product.setId(id);
		Product productDB = Product.builder().id(1L).name("PRODUCTO 1").build();
		return ResponseEntity.ok(productDB);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id) {
		Product productDelete = Product.builder().id(1L).name("PRODUCTO 1").build();
		return ResponseEntity.ok(productDelete);
	}

	@GetMapping(value = "/{id}/stock")
	public ResponseEntity<Product> updateStockProduct(@PathVariable Long id,
			@RequestParam(name = "quantity", required = true) Double quantity) {
		Product product = Product.builder().id(1L).name("PRODUCTO 1").build();
		return ResponseEntity.ok(product);
	}
}
