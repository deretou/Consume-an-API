package com.example.ConsumingAPI.entity;

import java.util.ArrayList;
import java.util.List;

public class ExchangeList {
    private List<Market> markets;

    public ExchangeList() {
        markets = new ArrayList<>();
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }
}
