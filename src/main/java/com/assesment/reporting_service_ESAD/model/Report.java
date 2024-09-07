package com.assesment.reporting_service_ESAD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Report")
@Data
@Builder
@ToString
public class Report {
    
    @Id
    private UUID reportID;
    private String ReportName;
    private Date submittedDate;


}
