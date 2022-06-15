package com.example.demo.client.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Optional;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dto {

    private int id;
    private String name;
    private String url;
    private Object country;
    private Optional district;
    private Optional sub_district;

    public Dto(@JsonProperty("id") int id,
               @JsonProperty("name") String name,
               @JsonProperty("url") String url,
               @JsonProperty("country") Object country,
               @JsonProperty("district") Optional  district,
               @JsonProperty("sub_district") Optional sub_district){
        this.id = id;
        this.name = name;
        this.url = url;
        this.country = country;
        this.district = district;
        this.sub_district = sub_district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getCountry() {
        return country;
    }

    public void setCountry(Object country) {
        this.country = country;
    }

    public Optional getDistrict() {
        return district;
    }

    public void setDistrict(Optional district) {
        this.district = district;
    }

    public Optional getSub_district() {
        return sub_district;
    }

    public void setSub_district(Optional sub_district) {
        this.sub_district = sub_district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dto dto = (Dto) o;
        return id == dto.id && Objects.equals(name, dto.name) && Objects.equals(url, dto.url) && Objects.equals(country, dto.country) && Objects.equals(district, dto.district) && Objects.equals(sub_district, dto.sub_district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, url, country, district, sub_district);
    }

    @Override
    public String toString() {
        return "dto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", country=" + country +
                ", district=" + district +
                ", sub_district=" + sub_district +
                '}';
    }
}
