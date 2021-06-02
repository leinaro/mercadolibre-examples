package com.leinaro.mercadolibre_android_example.domain.usecase.get_product

import com.leinaro.mercadolibre_android_example.Result
import com.leinaro.mercadolibre_android_example.domain.repository.ProductRepository
import com.leinaro.mercadolibre_android_example.presentation.model.Product
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

interface GetProductInteractor {
    suspend fun execute(productId: String): Flow<Result<Product>>
}

class GetProductDomainInteractor @Inject constructor(
    val repository: ProductRepository,
) : GetProductInteractor {
    override suspend fun execute(productId: String): Flow<Result<Product>> {
        return repository.getProduct(productId)
    }
}