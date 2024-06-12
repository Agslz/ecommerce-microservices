package com.ags.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest
        (@NotNull(message = "Product is Mandatory") Integer productId,
         @Positive(message = "Quantity should be mandatory") double quantity

        ) {
}
