// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackendArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendArgs Empty = new GetBackendArgs();

    /**
     * Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="backendId", required=true)
    private Output<String> backendId;

    /**
     * @return Identifier of the Backend entity. Must be unique in the current API Management service instance.
     * 
     */
    public Output<String> backendId() {
        return this.backendId;
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

    private GetBackendArgs() {}

    private GetBackendArgs(GetBackendArgs $) {
        this.backendId = $.backendId;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendArgs $;

        public Builder() {
            $ = new GetBackendArgs();
        }

        public Builder(GetBackendArgs defaults) {
            $ = new GetBackendArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder backendId(Output<String> backendId) {
            $.backendId = backendId;
            return this;
        }

        /**
         * @param backendId Identifier of the Backend entity. Must be unique in the current API Management service instance.
         * 
         * @return builder
         * 
         */
        public Builder backendId(String backendId) {
            return backendId(Output.of(backendId));
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

        public GetBackendArgs build() {
            $.backendId = Objects.requireNonNull($.backendId, "expected parameter 'backendId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
