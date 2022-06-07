// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApiPortalArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApiPortalArgs Empty = new GetApiPortalArgs();

    /**
     * The name of API portal.
     * 
     */
    @Import(name="apiPortalName", required=true)
    private Output<String> apiPortalName;

    /**
     * @return The name of API portal.
     * 
     */
    public Output<String> apiPortalName() {
        return this.apiPortalName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetApiPortalArgs() {}

    private GetApiPortalArgs(GetApiPortalArgs $) {
        this.apiPortalName = $.apiPortalName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApiPortalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApiPortalArgs $;

        public Builder() {
            $ = new GetApiPortalArgs();
        }

        public Builder(GetApiPortalArgs defaults) {
            $ = new GetApiPortalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiPortalName The name of API portal.
         * 
         * @return builder
         * 
         */
        public Builder apiPortalName(Output<String> apiPortalName) {
            $.apiPortalName = apiPortalName;
            return this;
        }

        /**
         * @param apiPortalName The name of API portal.
         * 
         * @return builder
         * 
         */
        public Builder apiPortalName(String apiPortalName) {
            return apiPortalName(Output.of(apiPortalName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetApiPortalArgs build() {
            $.apiPortalName = Objects.requireNonNull($.apiPortalName, "expected parameter 'apiPortalName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
