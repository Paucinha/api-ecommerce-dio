package br.paucinha.ecommerce.checkout.streaming;

import org.springframework.messaging.SubscribableChannel;

public interface PaymentPaidSink {

    String INPUT = "payment-paid-input";

    @Input(INPUT)
    SubscribableChannel input();
}
