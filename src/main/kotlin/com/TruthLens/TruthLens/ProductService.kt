package com.TruthLens.TruthLens

import org.springframework.stereotype.Service
import java.util.Optional

@Service
class ProductService(private val productRepository: ProductRepository) {

    fun getAllProducts(): List<Product> = productRepository.findAll().filterNotNull()

    fun getProductById(id: Long): Optional<Product?> = productRepository.findById(id)

    fun createProduct(product: Product): Product = productRepository.save(product)

    fun updateProduct(id: Long, product: Product): Product {
        return if (productRepository.existsById(id)) {
            val updatedProduct = product.copy(id = id) // Ensure the ID is correctly set
            productRepository.save(updatedProduct)
        } else {
            throw RuntimeException("Product not found with id $id")
        }
    }

    fun deleteProduct(id: Long) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id)
        } else {
            throw RuntimeException("Product not found with id $id")
        }
    }
}
