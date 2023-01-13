package br.paucia.ecommerce.payment.streaming;

import br.paucia.ecommerce.payment.streaming.Input;
import br.paucia.ecommerce.payment.streaming.Output;

public interface CheckoutProcessor {

    String OUTPUT = "payment-paid-output";
    String INPUT = "checkout-created-input";

    @Output(OUTPUT)
    MessageChanel output();
    @Input(INPUT)
    SubscribableChannel input();
}