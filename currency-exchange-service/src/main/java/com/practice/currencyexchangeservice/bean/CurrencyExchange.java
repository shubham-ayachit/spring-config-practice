package com.practice.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class CurrencyExchange {

    private long id;
    private String from;
    private String to;
    private BigDecimal conversionultiple;
    private String environment;

    public CurrencyExchange(long id, String from, String to, BigDecimal conversionultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionultiple = conversionultiple;
    }

    public CurrencyExchange() {
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

    public BigDecimal getConversionultiple() {
        return conversionultiple;
    }

    public void setConversionultiple(BigDecimal conversionultiple) {
        this.conversionultiple = conversionultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    

    

    
}
