package com.backpacktravel.service;

import com.backpacktravel.client.CitiesCostOfLivingClient;
import com.backpacktravel.domain.CityDetailsByCoordinatesParameterDto;
import com.backpacktravel.domain.cityDetailsResponseDto.CityDetailsResponseDto;
import com.backpacktravel.domain.cityResponseDto.CityResponseDto;
import com.backpacktravel.domain.currencyResponseDto.CurrencyResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CitiesCostOfLivingService {
    private final CitiesCostOfLivingClient citiesCostOfLivingClient;

    public CityResponseDto fetchCitiesCostOfLivingCity() {
        return citiesCostOfLivingClient.getCity();
    }

    public CurrencyResponseDto fetchCitiesCostOfLivingCurrency() {
        return citiesCostOfLivingClient.getCurrency();
    }

    public CityDetailsResponseDto fetchCitiesCostOfLivingCityByCoordinatesDetails(CityDetailsByCoordinatesParameterDto cityDetailsByCoordinatesParameterDto) {
        return citiesCostOfLivingClient.getCityDetailsByCoordinates(cityDetailsByCoordinatesParameterDto);
    }
}
