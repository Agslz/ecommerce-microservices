package com.ags.ecommerce.kafka;

import com.ags.ecommerce.customer.CustomerResponse;
import com.ags.ecommerce.order.PaymentMethod;
import com.ags.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products


) {
}
