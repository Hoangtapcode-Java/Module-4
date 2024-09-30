package com.example.model;

public class HealthDeclaration {
    private String name;
    private int yearOfBirth;
    private String gender;
    private String nationality;
    private String cMND;
    private String transport;
    private String licensePlates;
    private int numberOfSeats;
    private String placeToVisit;
    private String province;
    private String district;
    private String ward;
    private String address;
    private String phone;
    private String email;
    private String symptom;

    private String exposureHistoryFirst;

    private String exposureHistorySecond;

    private String startDate;

    private String endDate;

    public HealthDeclaration() {
    }

    public HealthDeclaration(String name, int yearOfBirth, String gender, String nationality, String cMND, String transport, String licensePlates, int numberOfSeats, String placeToVisit, String province, String district, String ward, String address, String phone, String email, String symptom, String exposureHistoryFirst, String exposureHistorySecond, String startDate, String endDate) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.cMND = cMND;
        this.transport = transport;
        this.licensePlates = licensePlates;
        this.numberOfSeats = numberOfSeats;
        this.placeToVisit = placeToVisit;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.symptom = symptom;
        this.exposureHistoryFirst = exposureHistoryFirst;
        this.exposureHistorySecond = exposureHistorySecond;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getExposureHistoryFirst() {
        return exposureHistoryFirst;
    }

    public void setExposureHistoryFirst(String exposureHistoryFirst) {
        this.exposureHistoryFirst = exposureHistoryFirst;
    }

    public String getExposureHistorySecond() {
        return exposureHistorySecond;
    }

    public void setExposureHistorySecond(String exposureHistorySecond) {
        this.exposureHistorySecond = exposureHistorySecond;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getPlaceToVisit() {
        return placeToVisit;
    }

    public void setPlaceToVisit(String placeToVisit) {
        this.placeToVisit = placeToVisit;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

}
