package com.testplatform.platform.POJO;

import java.time.LocalDate;


public class InterfaceResultPO {

    private int resultId;
    private String excuteGroupId;
    private String caseId;
    private int type;
    private String resultDetail;
    private LocalDate gmtCreate;

    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public String getExcuteGroupId() {
        return excuteGroupId;
    }

    public void setExcuteGroupId(String excuteGroupId) {
        this.excuteGroupId = excuteGroupId;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getResultDetail() {
        return resultDetail;
    }

    public void setResultDetail(String resultDetail) {
        this.resultDetail = resultDetail;
    }

    public LocalDate getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDate gmtCreate) {
        this.gmtCreate = gmtCreate;
    }


    public InterfaceResultPO(int resultId, String excuteGroupId, String caseId, int type, String resultDetail) {
        this.resultId = resultId;
        this.excuteGroupId = excuteGroupId;
        this.caseId = caseId;
        this.type = type;
        this.resultDetail = resultDetail;
    }

    @Override
    public String toString() {
        return "InterfaceResultPO{" +
                "resultId=" + resultId +
                ", excuteGroupId='" + excuteGroupId + '\'' +
                ", caseId='" + caseId + '\'' +
                ", type=" + type +
                ", resultDetail='" + resultDetail + '\'' +
                ", gmtCreate=" + gmtCreate +
                '}';
    }
}
