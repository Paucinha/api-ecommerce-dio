package br.paucinha.ecommerce.checkout.streaming;

import org.springframework.messaging.MessageChannel;

public interface CheckoutCreatedSource {

    String OUTPUT = "checkout-created-output";

    @Output(OUTPUT)
    MessageChannel output();

}
