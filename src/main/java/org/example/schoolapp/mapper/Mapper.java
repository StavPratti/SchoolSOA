package org.example.schoolapp.mapper;

import org.example.schoolapp.dto.TeacherInsertDTO;
import org.example.schoolapp.dto.TeacherReadOnlyDTO;
import org.example.schoolapp.dto.TeacherUpdateDTO;
import org.example.schoolapp.model.Teacher;

import java.util.Optional;

public class Mapper {

    private Mapper() {

    }

    public static Teacher mapTeacherInsertToModel(TeacherInsertDTO dto) {
        return new Teacher(null, dto.getFirstname(), dto.getLastname(), dto.getVat(), dto.getFatherName(),
                dto.getPhoneNum(), dto.getEmail(), dto.getStreet(), dto.getStreetNum(), dto.getZipCode(),
                dto.getCityId(), null, null, null);
    }

    public static Teacher mapTeacherUpdateToModel(TeacherUpdateDTO dto) {
        return new Teacher(dto.getId(), dto.getFirstname(), dto.getLastname(), dto.getVat(), dto.getFatherName(),
                dto.getPhoneNum(), dto.getEmail(), dto.getStreet(), dto.getStreetNum(), dto.getZipCode(),
                dto.getCityId(), null, null, null);
    }

    // DAO might return null
    // Optional does not allow nulls but empty
    public static Optional<TeacherReadOnlyDTO> mapTeacherToReadOnlyDTO(Teacher teacher) {
        if (teacher == null) return Optional.empty();
        return Optional.of(new TeacherReadOnlyDTO(teacher.getId(), teacher.getUuid(), teacher.getFirstname(), teacher.getLastname(),
                teacher.getVat(), teacher.getFatherName(), teacher.getPhoneNum(), teacher.getEmail(), teacher.getStreet(),
                teacher.getStreetNum(), teacher.getZipCode(), teacher.getCityId()));
    }
}
