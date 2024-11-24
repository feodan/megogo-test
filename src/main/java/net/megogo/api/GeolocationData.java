package net.megogo.api;

import lombok.Getter;

@Getter
public class GeolocationData {
    private String status;
    private String country;
    private String countryCode;
    private String region;
    private String regionName;
    private String city;
    private String zip;
    private Double lat;
    private Double lon;
    private String timezone;
    private String isp;
    private String org;
    private String as;
    private String query;
}
