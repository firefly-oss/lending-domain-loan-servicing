package com.firefly.domain.lending.loan.servicing.infra;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration properties.
 * Maps the properties defined in application.yaml under api-configuration.
 */
@Configuration
@ConfigurationProperties(prefix = "api-configuration.common-platform.product-mgmt")
@Data
public class ProductMgmtProperties {

    private String basePath;

}