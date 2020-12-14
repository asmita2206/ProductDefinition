package com.springboot.productdefinition.repository;

import com.springboot.productdefinition.constants.StringConstants;
import com.springboot.productdefinition.entity.ProductDefinitionEntity;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductDefinitionRepo extends JpaRepository<ProductDefinitionEntity,String> {

    Optional<ProductDefinitionEntity> findByProductCode(String productCode);
}
