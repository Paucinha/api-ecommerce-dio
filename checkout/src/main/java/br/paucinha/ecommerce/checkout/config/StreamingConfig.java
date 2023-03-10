package br.paucinha.ecommerce.checkout.config;

import br.paucinha.ecommerce.checkout.streaming.CheckoutCreatedSource;
import br.paucinha.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}


