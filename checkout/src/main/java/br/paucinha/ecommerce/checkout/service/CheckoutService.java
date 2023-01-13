package br.paucinha.ecommerce.checkout.service;

import br.paucinha.ecommerce.checkout.entity.CheckoutEntity;
import br.paucinha.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
