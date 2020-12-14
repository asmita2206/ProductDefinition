package com.springboot.productdefinition.service;

import com.springboot.productdefinition.constants.StringConstants;
import com.springboot.productdefinition.entity.ProductDefinitionEntity;
import com.springboot.productdefinition.exception.NoRecordFoundException;
import com.springboot.productdefinition.repository.ProductDefinitionRepo;
import com.springboot.productdefinition.request.ProductDefinitionRequest;
import com.springboot.productdefinition.response.ProductDefinitionDeleteResponse;
import com.springboot.productdefinition.utils.ProductDefinitionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDefinitionService {

    @Autowired
    ProductDefinitionRepo productDefinitionRepo;


    public ProductDefinitionEntity createProductDef(ProductDefinitionRequest productDefinitionRequest)  {

        String productCode= ProductDefinitionUtils.generateId(StringConstants.projectId_prefix);
        ProductDefinitionEntity productDefinitionEntity=new ProductDefinitionEntity();
        productDefinitionEntity.setProductCode(productCode);
        productDefinitionEntity.setProductName(productDefinitionRequest.getProductName());
        productDefinitionEntity.setMaterialOfConstruction(productDefinitionRequest.getMaterialOfConstruction());
        productDefinitionEntity.setConstructionType(productDefinitionRequest.getConstructionType());
        productDefinitionEntity.setClassOrShedule(productDefinitionRequest.getClassOrShedule());
        productDefinitionEntity.setMaterialSpecs(productDefinitionRequest.getMaterialSpecs());
        productDefinitionEntity.setStandardType(productDefinitionRequest.getStandardType());

        return productDefinitionRepo.save(productDefinitionEntity);
    }

    public ProductDefinitionEntity getProductDef(String productCode) throws NoRecordFoundException {
        return this.productDefinitionRepo.findByProductCode(productCode).orElseThrow(()->
           new NoRecordFoundException("Record_Not_Found :" +productCode));

    }

    public ProductDefinitionEntity updateProductDef(String productCode, ProductDefinitionRequest productDefinitionRequest) throws NoRecordFoundException {

        ProductDefinitionEntity productDefinitionEntity=productDefinitionRepo.findByProductCode(productCode).orElseThrow(()->{
            return new NoRecordFoundException("Record_Not_Found :" +productCode);
        });
           productDefinitionEntity.getProductCode();
           productDefinitionEntity.setProductName(productDefinitionRequest.getProductName());
           productDefinitionEntity.setStandardType(productDefinitionRequest.getStandardType());
           productDefinitionEntity.setMaterialSpecs(productDefinitionRequest.getMaterialSpecs());
           productDefinitionEntity.setClassOrShedule(productDefinitionRequest.getClassOrShedule());
           productDefinitionEntity.setConstructionType(productDefinitionRequest.getConstructionType());
           productDefinitionEntity.setMaterialOfConstruction(productDefinitionRequest.getMaterialOfConstruction());

           return productDefinitionRepo.save(productDefinitionEntity);
    }

    public ProductDefinitionDeleteResponse deleteProductDef(String productCode) throws NoRecordFoundException {

        ProductDefinitionEntity productDefinitionEntity=productDefinitionRepo.findByProductCode(productCode).orElseThrow(()->{
            return new NoRecordFoundException("Record_Not_Found :" +productCode);
        });

        ProductDefinitionDeleteResponse productDefinitionDeleteResponse =new ProductDefinitionDeleteResponse(productCode,true);
         productDefinitionRepo.delete(productDefinitionEntity);

         return productDefinitionDeleteResponse;

    }
}
