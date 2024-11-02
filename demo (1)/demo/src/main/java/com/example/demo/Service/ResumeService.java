
package com.example.demo.Service;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Resume;



@Repository

public interface ResumeService extends JpaRepository<Resume, Long> {

}
