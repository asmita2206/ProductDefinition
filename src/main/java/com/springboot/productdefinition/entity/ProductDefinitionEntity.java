package com.springboot.productdefinition.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product_definition")
public class ProductDefinitionEntity {

    @Id
    private String productCode;
    @NotNull
    private String productName;
    @NotNull
    private String materialOfConstruction;
    private String constructionType;
    private String classOrShedule;
    private String materialSpecs;
    private String standardType;

    public ProductDefinitionEntity() {
    }

    public ProductDefinitionEntity(String productCode, String productName, String materialOfConstruction, String constructionType, String classOrShedule, String materialSpecs, String standardType) {
        this.productCode = productCode;
        this.productName = productName;
        this.materialOfConstruction = materialOfConstruction;
        this.constructionType = constructionType;
        this.classOrShedule = classOrShedule;
        this.materialSpecs = materialSpecs;
        this.standardType = standardType;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMaterialOfConstruction() {
        return materialOfConstruction;
    }

    public void setMaterialOfConstruction(String materialOfConstruction) {
        this.materialOfConstruction = materialOfConstruction;
    }

    public String getConstructionType() {
        return constructionType;
    }

    public void setConstructionType(String constructionType) {
        this.constructionType = constructionType;
    }

    public String getClassOrShedule() {
        return classOrShedule;
    }

    public void setClassOrShedule(String classOrShedule) {
        this.classOrShedule = classOrShedule;
    }

    public String getMaterialSpecs() {
        return materialSpecs;
    }

    public void setMaterialSpecs(String materialSpecs) {
        this.materialSpecs = materialSpecs;
    }

    public String getStandardType() {
        return standardType;
    }

    public void setStandardType(String standardType) {
        this.standardType = standardType;
    }

    @Override
    public String toString() {
        return "ProductDefinitionEntity{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", materialOfConstruction='" + materialOfConstruction + '\'' +
                ", constructionType='" + constructionType + '\'' +
                ", classOrShedule='" + classOrShedule + '\'' +
                ", materialSpecs='" + materialSpecs + '\'' +
                ", standardType='" + standardType + '\'' +
                '}';
    }
}
