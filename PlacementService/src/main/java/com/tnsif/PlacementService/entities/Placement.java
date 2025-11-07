package com.tnsif.PlacementService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @Column(name = "placement_id")
    private int placementId;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_role")
    private String jobRole;

    @Column(name = "package")
    private double packageOffered;

    @Column(name = "drive_date")
    private String driveDate;

    @Column(name = "location")
    private String location;

    @Column(name = "eligibility_criteria")
    private String eligibilityCriteria;

    public Placement() {
        super();
    }

    public Placement(int placementId, String companyName, String jobRole, double packageOffered, String driveDate,
            String location, String eligibilityCriteria) {
        super();
        this.placementId = placementId;
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.packageOffered = packageOffered;
        this.driveDate = driveDate;
        this.location = location;
        this.eligibilityCriteria = eligibilityCriteria;
    }

    public int getPlacementId() {
        return placementId;
    }

    public void setPlacementId(int placementId) {
        this.placementId = placementId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(double packageOffered) {
        this.packageOffered = packageOffered;
    }

    public String getDriveDate() {
        return driveDate;
    }

    public void setDriveDate(String driveDate) {
        this.driveDate = driveDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }

    @Override
    public String toString() {
        return "Placement [placementId=" + placementId + ", companyName=" + companyName + ", jobRole=" + jobRole
                + ", packageOffered=" + packageOffered + ", driveDate=" + driveDate + ", location=" + location
                + ", eligibilityCriteria=" + eligibilityCriteria + "]";
    }
}

