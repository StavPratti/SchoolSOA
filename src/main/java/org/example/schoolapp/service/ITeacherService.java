package org.example.schoolapp.service;

import org.example.schoolapp.dao.exceptions.TeacherDAOException;
import org.example.schoolapp.dto.TeacherInsertDTO;
import org.example.schoolapp.dto.TeacherReadOnlyDTO;
import org.example.schoolapp.dto.TeacherUpdateDTO;
import org.example.schoolapp.exceptions.TeacherAlreadyExistsException;
import org.example.schoolapp.exceptions.TeacherNotFoundException;

import java.util.List;

public interface ITeacherService {

    TeacherReadOnlyDTO insertTeacher(TeacherInsertDTO dto)
            throws TeacherDAOException, TeacherAlreadyExistsException;

    TeacherReadOnlyDTO updateTeacher(Integer id, TeacherUpdateDTO dto)
            throws TeacherDAOException, TeacherAlreadyExistsException, TeacherNotFoundException;

    void deleteTeacher(Integer id) throws TeacherDAOException, TeacherNotFoundException;

    TeacherReadOnlyDTO getTeacherById(Integer id) throws
            TeacherDAOException, TeacherNotFoundException;

    List<TeacherReadOnlyDTO> getAllTeachers() throws TeacherDAOException;

    List<TeacherReadOnlyDTO> getTeachersByLastname(String lastname) throws TeacherDAOException;
}