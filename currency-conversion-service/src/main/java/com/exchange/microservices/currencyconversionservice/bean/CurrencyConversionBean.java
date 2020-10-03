package com.exchange.microservices.currencyconversionservice.bean;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class CurrencyConversionBean {

    @NonNull
    private long id;

    @NonNull
    private String from;

    @NonNull
    private String to;

    @NonNull
    private BigDecimal conversionMultiple;

    @NonNull
    private BigDecimal quantity;

    private BigDecimal totalCalculatedAmount;

    private int port;
}
