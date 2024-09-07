package com.assesment.reporting_service_ESAD.repository;

import com.assesment.reporting_service_ESAD.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReportRepository extends JpaRepository<Report, UUID> {
}
