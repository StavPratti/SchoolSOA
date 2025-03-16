package org.example.schoolapp.dao.exceptions;

import java.io.Serial;

public class TeacherDAOException extends Exception {

    @Serial
    private static final long serialVersionUID = 1L;

    // For SQL Exception
    public TeacherDAOException(String message) {
        super(message);
    }
}
