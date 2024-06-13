package com.ags.ecommerce.payment;

import com.ags.ecommerce.customer.CustomerResponse;
import com.ags.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
