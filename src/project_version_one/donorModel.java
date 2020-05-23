/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_version_one;

/**
 *
 * @author shihab
 */
public class donorModel {
    private int donorId;
    private String donorName, donorBloodGroup, donorUserName, donorPassword, donorEmail;

    public donorModel(int donorId, String donorName, String donorBloodGroup, String donorUserName, String donorPassword, String donorEmail) {
        this.donorId = donorId;
        this.donorName = donorName;
        this.donorBloodGroup = donorBloodGroup;
        this.donorUserName = donorUserName;
        this.donorPassword = donorPassword;
        this.donorEmail = donorEmail;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorBloodGroup() {
        return donorBloodGroup;
    }

    public void setDonorBloodGroup(String donorBloodGroup) {
        this.donorBloodGroup = donorBloodGroup;
    }

    public String getDonorUserName() {
        return donorUserName;
    }

    public void setDonorUserName(String donorUserName) {
        this.donorUserName = donorUserName;
    }

    public String getDonorPassword() {
        return donorPassword;
    }

    public void setDonorPassword(String donorPassword) {
        this.donorPassword = donorPassword;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }
    
    
}
