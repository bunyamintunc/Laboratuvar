package com.bunyamintunc.labaratuvar.staj.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private UUID number;
    private String illnesTitle;
    private String illnesDescription;
    private String date;
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "laborantId")
    private Laborant laborant;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;


}
