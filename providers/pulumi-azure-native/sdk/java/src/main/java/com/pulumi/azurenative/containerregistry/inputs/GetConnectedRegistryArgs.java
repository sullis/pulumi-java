// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectedRegistryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectedRegistryArgs Empty = new GetConnectedRegistryArgs();

    /**
     * The name of the connected registry.
     * 
     */
    @Import(name="connectedRegistryName", required=true)
    private String connectedRegistryName;

    /**
     * @return The name of the connected registry.
     * 
     */
    public String connectedRegistryName() {
        return this.connectedRegistryName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private String registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public String registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetConnectedRegistryArgs() {}

    private GetConnectedRegistryArgs(GetConnectedRegistryArgs $) {
        this.connectedRegistryName = $.connectedRegistryName;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectedRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectedRegistryArgs $;

        public Builder() {
            $ = new GetConnectedRegistryArgs();
        }

        public Builder(GetConnectedRegistryArgs defaults) {
            $ = new GetConnectedRegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectedRegistryName The name of the connected registry.
         * 
         * @return builder
         * 
         */
        public Builder connectedRegistryName(String connectedRegistryName) {
            $.connectedRegistryName = connectedRegistryName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetConnectedRegistryArgs build() {
            $.connectedRegistryName = Objects.requireNonNull($.connectedRegistryName, "expected parameter 'connectedRegistryName' to be non-null");
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
