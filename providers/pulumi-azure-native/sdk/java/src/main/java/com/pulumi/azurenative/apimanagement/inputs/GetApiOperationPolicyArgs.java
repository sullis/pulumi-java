// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiOperationPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiOperationPolicyArgs Empty = new GetApiOperationPolicyArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
    private Output<String> apiId;

    /**
     * @return API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }

    /**
     * Policy Export Format.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Policy Export Format.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="operationId", required=true)
    private Output<String> operationId;

    /**
     * @return Operation identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> operationId() {
        return this.operationId;
    }

    /**
     * The identifier of the Policy.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return The identifier of the Policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetApiOperationPolicyArgs() {}

    private GetApiOperationPolicyArgs(GetApiOperationPolicyArgs $) {
        this.apiId = $.apiId;
        this.format = $.format;
        this.operationId = $.operationId;
        this.policyId = $.policyId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiOperationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiOperationPolicyArgs $;

        public Builder() {
            $ = new GetApiOperationPolicyArgs();
        }

        public Builder(GetApiOperationPolicyArgs defaults) {
            $ = new GetApiOperationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(Output<String> apiId) {
            $.apiId = apiId;
            return this;
        }

        /**
         * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
         * 
         * @return builder
         * 
         */
        public Builder apiId(String apiId) {
            return apiId(Output.of(apiId));
        }

        /**
         * @param format Policy Export Format.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Policy Export Format.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        /**
         * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        /**
         * @param policyId The identifier of the Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The identifier of the Policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetApiOperationPolicyArgs build() {
            $.apiId = Objects.requireNonNull($.apiId, "expected parameter 'apiId' to be non-null");
            $.operationId = Objects.requireNonNull($.operationId, "expected parameter 'operationId' to be non-null");
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
