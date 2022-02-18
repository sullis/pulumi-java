// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProductPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProductPolicyArgs Empty = new GetProductPolicyArgs();

    /**
     * Policy Export Format.
     * 
     */
    @InputImport(name="format")
    private final @Nullable String format;

    public Optional<String> getFormat() {
        return this.format == null ? Optional.empty() : Optional.ofNullable(this.format);
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @InputImport(name="policyId", required=true)
    private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="productId", required=true)
    private final String productId;

    public String getProductId() {
        return this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetProductPolicyArgs(
        @Nullable String format,
        String policyId,
        String productId,
        String resourceGroupName,
        String serviceName) {
        this.format = format;
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.productId = Objects.requireNonNull(productId, "expected parameter 'productId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetProductPolicyArgs() {
        this.format = null;
        this.policyId = null;
        this.productId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String format;
        private String policyId;
        private String productId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.policyId = defaults.policyId;
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setFormat(@Nullable String format) {
            this.format = format;
            return this;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Objects.requireNonNull(productId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetProductPolicyArgs build() {
            return new GetProductPolicyArgs(format, policyId, productId, resourceGroupName, serviceName);
        }
    }
}
