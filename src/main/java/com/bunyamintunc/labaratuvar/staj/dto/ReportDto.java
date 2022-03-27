package com.bunyamintunc.labaratuvar.staj.dto;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
public class ReportDto {


    private String illnesTitle;
    private String illnesDescription;
    private String date;
    private String imgUrl;
    private long  laborantId;
    private long patientId;



}
