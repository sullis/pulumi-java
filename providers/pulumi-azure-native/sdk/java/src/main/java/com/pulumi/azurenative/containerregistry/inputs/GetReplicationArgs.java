// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationArgs Empty = new GetReplicationArgs();

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private Output<String> registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The name of the replication.
     * 
     */
    @Import(name="replicationName", required=true)
    private Output<String> replicationName;

    /**
     * @return The name of the replication.
     * 
     */
    public Output<String> replicationName() {
        return this.replicationName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReplicationArgs() {}

    private GetReplicationArgs(GetReplicationArgs $) {
        this.registryName = $.registryName;
        this.replicationName = $.replicationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationArgs $;

        public Builder() {
            $ = new GetReplicationArgs();
        }

        public Builder(GetReplicationArgs defaults) {
            $ = new GetReplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        /**
         * @param replicationName The name of the replication.
         * 
         * @return builder
         * 
         */
        public Builder replicationName(Output<String> replicationName) {
            $.replicationName = replicationName;
            return this;
        }

        /**
         * @param replicationName The name of the replication.
         * 
         * @return builder
         * 
         */
        public Builder replicationName(String replicationName) {
            return replicationName(Output.of(replicationName));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetReplicationArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.replicationName = Objects.requireNonNull($.replicationName, "expected parameter 'replicationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
