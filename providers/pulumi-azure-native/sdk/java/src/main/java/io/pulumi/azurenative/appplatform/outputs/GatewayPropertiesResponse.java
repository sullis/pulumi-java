// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.GatewayApiMetadataPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.GatewayCorsPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.GatewayInstanceResponse;
import io.pulumi.azurenative.appplatform.outputs.GatewayOperatorPropertiesResponse;
import io.pulumi.azurenative.appplatform.outputs.GatewayResourceRequestsResponse;
import io.pulumi.azurenative.appplatform.outputs.SsoPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewayPropertiesResponse {
    /**
     * API metadata property for Spring Cloud Gateway
     * 
     */
    private final @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;
    /**
     * Cross-Origin Resource Sharing property
     * 
     */
    private final @Nullable GatewayCorsPropertiesResponse corsProperties;
    /**
     * Indicate if only https is allowed.
     * 
     */
    private final @Nullable Boolean httpsOnly;
    /**
     * Collection of instances belong to Spring Cloud Gateway.
     * 
     */
    private final List<GatewayInstanceResponse> instances;
    /**
     * Properties of the Spring Cloud Gateway Operator.
     * 
     */
    private final GatewayOperatorPropertiesResponse operatorProperties;
    /**
     * State of the Spring Cloud Gateway.
     * 
     */
    private final String provisioningState;
    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    private final @Nullable Boolean $public;
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    private final @Nullable GatewayResourceRequestsResponse resourceRequests;
    /**
     * Single sign-on related configuration
     * 
     */
    private final @Nullable SsoPropertiesResponse ssoProperties;
    /**
     * URL of the Spring Cloud Gateway, exposed when 'public' is true.
     * 
     */
    private final String url;

    @OutputCustomType.Constructor({"apiMetadataProperties","corsProperties","httpsOnly","instances","operatorProperties","provisioningState","$public","resourceRequests","ssoProperties","url"})
    private GatewayPropertiesResponse(
        @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties,
        @Nullable GatewayCorsPropertiesResponse corsProperties,
        @Nullable Boolean httpsOnly,
        List<GatewayInstanceResponse> instances,
        GatewayOperatorPropertiesResponse operatorProperties,
        String provisioningState,
        @Nullable Boolean $public,
        @Nullable GatewayResourceRequestsResponse resourceRequests,
        @Nullable SsoPropertiesResponse ssoProperties,
        String url) {
        this.apiMetadataProperties = apiMetadataProperties;
        this.corsProperties = corsProperties;
        this.httpsOnly = httpsOnly;
        this.instances = Objects.requireNonNull(instances);
        this.operatorProperties = Objects.requireNonNull(operatorProperties);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.$public = $public;
        this.resourceRequests = resourceRequests;
        this.ssoProperties = ssoProperties;
        this.url = Objects.requireNonNull(url);
    }

    /**
     * API metadata property for Spring Cloud Gateway
     * 
     */
    public Optional<GatewayApiMetadataPropertiesResponse> getApiMetadataProperties() {
        return Optional.ofNullable(this.apiMetadataProperties);
    }
    /**
     * Cross-Origin Resource Sharing property
     * 
     */
    public Optional<GatewayCorsPropertiesResponse> getCorsProperties() {
        return Optional.ofNullable(this.corsProperties);
    }
    /**
     * Indicate if only https is allowed.
     * 
     */
    public Optional<Boolean> getHttpsOnly() {
        return Optional.ofNullable(this.httpsOnly);
    }
    /**
     * Collection of instances belong to Spring Cloud Gateway.
     * 
     */
    public List<GatewayInstanceResponse> getInstances() {
        return this.instances;
    }
    /**
     * Properties of the Spring Cloud Gateway Operator.
     * 
     */
    public GatewayOperatorPropertiesResponse getOperatorProperties() {
        return this.operatorProperties;
    }
    /**
     * State of the Spring Cloud Gateway.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Indicates whether the Spring Cloud Gateway exposes endpoint.
     * 
     */
    public Optional<Boolean> get$public() {
        return Optional.ofNullable(this.$public);
    }
    /**
     * The requested resource quantity for required CPU and Memory.
     * 
     */
    public Optional<GatewayResourceRequestsResponse> getResourceRequests() {
        return Optional.ofNullable(this.resourceRequests);
    }
    /**
     * Single sign-on related configuration
     * 
     */
    public Optional<SsoPropertiesResponse> getSsoProperties() {
        return Optional.ofNullable(this.ssoProperties);
    }
    /**
     * URL of the Spring Cloud Gateway, exposed when 'public' is true.
     * 
     */
    public String getUrl() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties;
        private @Nullable GatewayCorsPropertiesResponse corsProperties;
        private @Nullable Boolean httpsOnly;
        private List<GatewayInstanceResponse> instances;
        private GatewayOperatorPropertiesResponse operatorProperties;
        private String provisioningState;
        private @Nullable Boolean $public;
        private @Nullable GatewayResourceRequestsResponse resourceRequests;
        private @Nullable SsoPropertiesResponse ssoProperties;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiMetadataProperties = defaults.apiMetadataProperties;
    	      this.corsProperties = defaults.corsProperties;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.instances = defaults.instances;
    	      this.operatorProperties = defaults.operatorProperties;
    	      this.provisioningState = defaults.provisioningState;
    	      this.$public = defaults.$public;
    	      this.resourceRequests = defaults.resourceRequests;
    	      this.ssoProperties = defaults.ssoProperties;
    	      this.url = defaults.url;
        }

        public Builder setApiMetadataProperties(@Nullable GatewayApiMetadataPropertiesResponse apiMetadataProperties) {
            this.apiMetadataProperties = apiMetadataProperties;
            return this;
        }

        public Builder setCorsProperties(@Nullable GatewayCorsPropertiesResponse corsProperties) {
            this.corsProperties = corsProperties;
            return this;
        }

        public Builder setHttpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }

        public Builder setInstances(List<GatewayInstanceResponse> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder setOperatorProperties(GatewayOperatorPropertiesResponse operatorProperties) {
            this.operatorProperties = Objects.requireNonNull(operatorProperties);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder set$public(@Nullable Boolean $public) {
            this.$public = $public;
            return this;
        }

        public Builder setResourceRequests(@Nullable GatewayResourceRequestsResponse resourceRequests) {
            this.resourceRequests = resourceRequests;
            return this;
        }

        public Builder setSsoProperties(@Nullable SsoPropertiesResponse ssoProperties) {
            this.ssoProperties = ssoProperties;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public GatewayPropertiesResponse build() {
            return new GatewayPropertiesResponse(apiMetadataProperties, corsProperties, httpsOnly, instances, operatorProperties, provisioningState, $public, resourceRequests, ssoProperties, url);
        }
    }
}
