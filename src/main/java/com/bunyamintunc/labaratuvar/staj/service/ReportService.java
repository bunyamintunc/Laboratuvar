package com.bunyamintunc.labaratuvar.staj.service;


import com.bunyamintunc.labaratuvar.staj.dto.ReportDto;
import com.bunyamintunc.labaratuvar.staj.model.Laborant;
import com.bunyamintunc.labaratuvar.staj.model.Patient;
import com.bunyamintunc.labaratuvar.staj.model.Report;
import com.bunyamintunc.labaratuvar.staj.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private PatientService patientService;

    @Autowired
    private LaborantService laborantService;

    public Report add(ReportDto reportDto){
        Report report = new Report();
        Patient patient = this.patientService.getById(reportDto.getPatientId());
        Laborant laborant = this.laborantService.getById(reportDto.getLaborantId());

        if(patient != null && laborant != null){
            report.setDate(reportDto.getDate());
            report.setIllnesTitle(reportDto.getIllnesTitle());
            report.setLaborant(laborant);
            report.setNumber(UUID.randomUUID());
            report.setPatient(patient);
            report.setIllnesDescription(reportDto.getIllnesDescription());
            report.setImgUrl(reportDto.getImgUrl());
        }else{
            return null;
        }

        return this.reportRepository.save(report);
    }

    public Report getById(Long reportId){
        return this.reportRepository.getById(reportId);
    }

    public List<Report> getAllReport(String key){
        if(key != null){
            return this.reportRepository.findAll(key);
        }
        return this.reportRepository.findAll();
    }

    public void delete(long reportId) {

        this.reportRepository.deleteById(reportId);
    }

    public Report findById(long reportId){

        return this.reportRepository.findById(reportId).orElse(null);
    }


    public void update(Report report){
        this.reportRepository.save(report);
    }
}
