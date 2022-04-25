// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigateway_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.apigateway_v1beta.outputs.ApigatewayBackendConfigResponse;
import java.util.Objects;

@CustomType
public final class ApigatewayGatewayConfigResponse {
    /**
     * @return Backend settings that are applied to all backends of the Gateway.
     * 
     */
    private final ApigatewayBackendConfigResponse backendConfig;

    @CustomType.Constructor
    private ApigatewayGatewayConfigResponse(@CustomType.Parameter("backendConfig") ApigatewayBackendConfigResponse backendConfig) {
        this.backendConfig = backendConfig;
    }

    /**
     * @return Backend settings that are applied to all backends of the Gateway.
     * 
     */
    public ApigatewayBackendConfigResponse backendConfig() {
        return this.backendConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayGatewayConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayBackendConfigResponse backendConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayGatewayConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendConfig = defaults.backendConfig;
        }

        public Builder backendConfig(ApigatewayBackendConfigResponse backendConfig) {
            this.backendConfig = Objects.requireNonNull(backendConfig);
            return this;
        }        public ApigatewayGatewayConfigResponse build() {
            return new ApigatewayGatewayConfigResponse(backendConfig);
        }
    }
}
