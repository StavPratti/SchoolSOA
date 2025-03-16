package org.example.schoolapp.dao;
import org.example.schoolapp.model.City;

import java.sql.SQLException;
import java.util.List;

public interface ICityDAO {

    // All CRUD methods need to be defined.
    // This is for combo box ->
    List<City> getAll() throws SQLException;
}
