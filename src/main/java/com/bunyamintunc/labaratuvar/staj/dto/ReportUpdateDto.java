package com.bunyamintunc.labaratuvar.staj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReportUpdateDto {

    private long id;
    private String illnesTitle;
    private String illnesDescription;
    private String date;
    private String imgUrl;
    private long  laborantId;
    private long patientId;



}
