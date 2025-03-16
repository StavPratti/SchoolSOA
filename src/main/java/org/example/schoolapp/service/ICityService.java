package org.example.schoolapp.service;

import org.example.schoolapp.model.City;

import java.sql.SQLException;
import java.util.List;

public interface ICityService {

    List<City> getAllCities() throws SQLException;
}
