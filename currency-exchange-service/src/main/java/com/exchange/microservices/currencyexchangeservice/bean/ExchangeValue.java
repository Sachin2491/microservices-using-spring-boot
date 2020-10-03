package com.exchange.microservices.currencyexchangeservice.bean;

import lombok.*;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class ExchangeValue {

    @Id
    @NonNull
    private Long id;

    @Column(name = "currency_from")
    @NonNull
    private String from;

    @Column(name = "currency_to")
    @NonNull
    private String to;

    @NonNull
    private BigDecimal conversionMultiple;
    private int port;
}
