package com.bunyamintunc.labaratuvar.staj.mapper;

import com.bunyamintunc.labaratuvar.staj.dto.ReportDto;
import com.bunyamintunc.labaratuvar.staj.dto.ReportUpdateDto;
import com.bunyamintunc.labaratuvar.staj.model.Report;

public class ReportMapperManager {

    public static Report mapReportDtoToReportObject(ReportUpdateDto reportDto, Report report){

        report.setDate(reportDto.getDate());
        report.setImgUrl(reportDto.getImgUrl());
        report.setIllnesTitle(reportDto.getIllnesTitle());
        report.setIllnesDescription(reportDto.getIllnesDescription());
        return report;
    }

    public static ReportUpdateDto mapReportToReportObject(Report report){
        ReportUpdateDto reportDto = new ReportUpdateDto();
        reportDto.setId(report.getId());
        reportDto.setDate(report.getDate());
        reportDto.setIllnesTitle(report.getIllnesTitle());
        report.setIllnesDescription(report.getIllnesDescription());
        reportDto.setImgUrl(report.getImgUrl());
        reportDto.setLaborantId(report.getLaborant().getId());
       reportDto.setPatientId(report.getPatient().getId());
        return  reportDto;
    }
}
