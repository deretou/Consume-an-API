package com.example.ConsumingAPI.entity;



public class Market {
    private Long  id;
    private String name;
    private String name_id;
    private Double volume_usd;
    private Long active_pairs;
    private String url;
    private String country;

    public Market(){}

    public Market(Long  id,
                  String name,
                  String name_id,
                  Double volume_usd,
                  Long active_pairs,
                  String url,
                  String country){

        this.id = id;
        this.name = name;
        this.name_id = name_id;
        this.volume_usd = volume_usd;
        this.active_pairs = active_pairs;
        this.url = url;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    public Double getVolume_usd() {
        return volume_usd;
    }

    public void setVolume_usd(Double volume_usd) {
        this.volume_usd = volume_usd;
    }

    public Long getActive_pairs() {
        return active_pairs;
    }

    public void setActive_pairs(Long active_pairs) {
        this.active_pairs = active_pairs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Market{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", name_id='" + name_id + '\'' +
                ", volume_usd=" + volume_usd +
                ", active_pairs=" + active_pairs +
                ", url='" + url + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
