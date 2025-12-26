package com.paola.cities_service.service;

import com.paola.cities_service.dto.CityDTO;

public interface ICityService {
    public CityDTO getCitiesHotels(String name, String country);
}
