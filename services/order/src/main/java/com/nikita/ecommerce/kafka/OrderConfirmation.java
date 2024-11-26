package com.nikita.ecommerce.kafka;

import java.math.BigDecimal;
import java.util.List;

import com.nikita.ecommerce.customer.CustomerResponse;
import com.nikita.ecommerce.order.PaymentMethod;
import com.nikita.ecommerce.product.PurchaseResponse;


public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
