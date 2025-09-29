package com.firefly.domain.lending.loan.servicing.infra;

import com.firefly.common.product.sdk.invoker.ApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Default implementation of the ClientFactory interface.
 * Creates client service instances using the appropriate API clients and dependencies.
 */
@Component
public class ClientFactory {

    private final ApiClient apiClient;

    @Autowired
    public ClientFactory(
            ProductMgmtProperties productMgmtProperties) {
        this.apiClient = new ApiClient();
        this.apiClient.setBasePath(productMgmtProperties.getBasePath());
    }

}
