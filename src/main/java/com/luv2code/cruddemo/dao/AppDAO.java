package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);
<<<<<<< HEAD
=======

    InstructorDetail findInstructorDetailById(int theId);
>>>>>>> f32acdd7c98fbd1d4bfca98358c32f61c6182fe5
}
