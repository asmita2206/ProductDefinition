package com.springboot.productdefinition.response;

public class ProductDefinitionDeleteResponse {

    private String projectCode;
    private boolean projectCodeDeleted;

    public ProductDefinitionDeleteResponse(String projectCode, boolean projectCodeDeleted) {
        this.projectCode = projectCode;
        this.projectCodeDeleted = projectCodeDeleted;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public boolean isProjectCodeDeleted() {
        return projectCodeDeleted;
    }

    public void setProjectCodeDeleted(boolean projectCodeDeleted) {
        this.projectCodeDeleted = projectCodeDeleted;
    }
}
