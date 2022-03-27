package com.bunyamintunc.labaratuvar.staj.repository;


import com.bunyamintunc.labaratuvar.staj.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReportRepository extends JpaRepository<Report,Long> {


    @Query(value = "select R from Report R where "+"concat(R.id,R.patient.name,R.patient.surname,R.laborant.id,R.laborant.surname,R.number) "
                    +"like %?1%")
    public List<Report> findAll(String key);
}
