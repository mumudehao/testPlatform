package com.testplatform.platform.POJO;

import java.time.LocalDate;

public class InterfaceCasePO {

    private int interfaceCaseId;
    private String caseId;
    private String caseName;
    private String casePath;
    private String caseParams;
    private String createUser;
    private String updateUser;
    private LocalDate gmtCreate;
    private LocalDate gmtUpdate;

    public int getInterfaceCaseId() {
        return interfaceCaseId;
    }

    public void setInterfaceCaseId(int interfaceCaseId) {
        this.interfaceCaseId = interfaceCaseId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCasePath() {
        return casePath;
    }

    public void setCasePath(String casePath) {
        this.casePath = casePath;
    }

    public String getCaseParams() {
        return caseParams;
    }

    public void setCaseParams(String caseParams) {
        this.caseParams = caseParams;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public LocalDate getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDate getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(LocalDate gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    public InterfaceCasePO(){

    }

    public InterfaceCasePO(int interfaceCaseId, String caseId, String caseName, String casePath, String caseParams, String createUser, String updateUser) {
        this.interfaceCaseId = interfaceCaseId;
        this.caseId = caseId;
        this.caseName = caseName;
        this.casePath = casePath;
        this.caseParams = caseParams;
        this.createUser = createUser;
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "InterfaceCasePO{" +
                "interface_case_id=" + interfaceCaseId +
                ", case_id='" + caseId + '\'' +
                ", case_name='" + caseName + '\'' +
                ", case_path='" + casePath + '\'' +
                ", case_params='" + caseParams + '\'' +
                ", create_user='" + createUser + '\'' +
                ", update_user='" + updateUser + '\'' +
                ", gmt_create=" + gmtCreate +
                ", gmt_update=" + gmtUpdate +
                '}';
    }
}
