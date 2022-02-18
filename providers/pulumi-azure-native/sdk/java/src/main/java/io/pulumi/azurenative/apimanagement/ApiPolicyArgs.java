// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.PolicyContentFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiPolicyArgs Empty = new ApiPolicyArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @InputImport(name="apiId", required=true)
    private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Format of the policyContent.
     * 
     */
    @InputImport(name="format")
    private final @Nullable Input<Either<String,PolicyContentFormat>> format;

    public Input<Either<String,PolicyContentFormat>> getFormat() {
        return this.format == null ? Input.empty() : this.format;
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Contents of the Policy as defined by the format.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public ApiPolicyArgs(
        Input<String> apiId,
        @Nullable Input<Either<String,PolicyContentFormat>> format,
        @Nullable Input<String> policyId,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        Input<String> value) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.format = format == null ? Input.ofLeft("xml") : format;
        this.policyId = policyId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ApiPolicyArgs() {
        this.apiId = Input.empty();
        this.format = Input.empty();
        this.policyId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<Either<String,PolicyContentFormat>> format;
        private @Nullable Input<String> policyId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.format = defaults.format;
    	      this.policyId = defaults.policyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.value = defaults.value;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setFormat(@Nullable Input<Either<String,PolicyContentFormat>> format) {
            this.format = format;
            return this;
        }

        public Builder setFormat(@Nullable Either<String,PolicyContentFormat> format) {
            this.format = Input.ofNullable(format);
            return this;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }

        public ApiPolicyArgs build() {
            return new ApiPolicyArgs(apiId, format, policyId, resourceGroupName, serviceName, value);
        }
    }
}
