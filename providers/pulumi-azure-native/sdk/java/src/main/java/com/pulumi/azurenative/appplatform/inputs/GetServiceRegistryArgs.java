// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceRegistryArgs Empty = new GetServiceRegistryArgs();

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

    /**
     * The name of Service Registry.
     * 
     */
    @Import(name="serviceRegistryName", required=true)
    private Output<String> serviceRegistryName;

    /**
     * @return The name of Service Registry.
     * 
     */
    public Output<String> serviceRegistryName() {
        return this.serviceRegistryName;
    }

    private GetServiceRegistryArgs() {}

    private GetServiceRegistryArgs(GetServiceRegistryArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.serviceRegistryName = $.serviceRegistryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceRegistryArgs $;

        public Builder() {
            $ = new GetServiceRegistryArgs();
        }

        public Builder(GetServiceRegistryArgs defaults) {
            $ = new GetServiceRegistryArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param serviceRegistryName The name of Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistryName(Output<String> serviceRegistryName) {
            $.serviceRegistryName = serviceRegistryName;
            return this;
        }

        /**
         * @param serviceRegistryName The name of Service Registry.
         * 
         * @return builder
         * 
         */
        public Builder serviceRegistryName(String serviceRegistryName) {
            return serviceRegistryName(Output.of(serviceRegistryName));
        }

        public GetServiceRegistryArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.serviceRegistryName = Objects.requireNonNull($.serviceRegistryName, "expected parameter 'serviceRegistryName' to be non-null");
            return $;
        }
    }

}
