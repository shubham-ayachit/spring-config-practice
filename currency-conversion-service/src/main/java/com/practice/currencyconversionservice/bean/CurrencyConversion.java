package com.practice.currencyconversionservice.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;

public class CurrencyConversion {

    private long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal conversionMultiple;
    private BigDecimal calculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal calculatedAmount, String environment) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.calculatedAmount = calculatedAmount;
        this.environment = environment;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(BigDecimal calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
