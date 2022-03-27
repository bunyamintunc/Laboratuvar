package com.bunyamintunc.labaratuvar.staj.controller;

import com.bunyamintunc.labaratuvar.staj.dto.ReportDto;
import com.bunyamintunc.labaratuvar.staj.dto.ReportUpdateDto;
import com.bunyamintunc.labaratuvar.staj.mapper.ReportMapperManager;
import com.bunyamintunc.labaratuvar.staj.model.Report;
import com.bunyamintunc.labaratuvar.staj.repository.ReportRepository;
import com.bunyamintunc.labaratuvar.staj.service.ReportService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Autowired
    private ReportRepository reportRepository;

    @GetMapping("new")
    public String showReportForm(ReportDto reportDto){
        return "report-form";
    }

    @PostMapping("/addreport")
    public String addRepor(@Valid ReportDto reportDto, BindingResult result, Model model){
        if(result.hasErrors()){
            return "report-form";
        }else{
            this.reportService.add(reportDto);
            return "redirect:/report/getall";

        }
    }



    @GetMapping("/getall")
    public String getAll(Model model, @Param("key") String key){
        model.addAttribute("reports",this.reportService.getAllReport(key));
        model.addAttribute("key",key);
        return "main-home";
    }

    @GetMapping("/delete/{reportid}")
    public String deleteReportById(@PathVariable("reportid") long reportId){
        this.reportService.delete(reportId);
        return "redirect:/report/getall";
    }


    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Report report = reportService.findById(id);
        model.addAttribute("reportDto", ReportMapperManager.mapReportToReportObject(report));
        return "update-report";
    }

    @PostMapping("/update/{id}")
    public String updateReport(@PathVariable("id") long id, @Valid ReportUpdateDto reportDto, BindingResult result, Model model) {

        Report report = reportService.findById(id);
        reportRepository.save(ReportMapperManager.mapReportDtoToReportObject(reportDto,report));
        return "main-home";
    }

     

}
