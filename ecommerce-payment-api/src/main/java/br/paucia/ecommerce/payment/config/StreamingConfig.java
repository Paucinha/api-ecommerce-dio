package br.paucia.ecommerce.payment.config;

import br.paucia.ecommerce.payment.streaming.CheckoutProcessor;
@Configuration
@EnableBinding(CheckoutProcessor.class)
public class StreamingConfig {
}
