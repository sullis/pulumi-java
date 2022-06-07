// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationPlainArgs Empty = new GetReplicationPlainArgs();

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
     * The name of the replication.
     * 
     */
    @Import(name="replicationName", required=true)
    private String replicationName;

    /**
     * @return The name of the replication.
     * 
     */
    public String replicationName() {
        return this.replicationName;
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

    private GetReplicationPlainArgs() {}

    private GetReplicationPlainArgs(GetReplicationPlainArgs $) {
        this.registryName = $.registryName;
        this.replicationName = $.replicationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationPlainArgs $;

        public Builder() {
            $ = new GetReplicationPlainArgs();
        }

        public Builder(GetReplicationPlainArgs defaults) {
            $ = new GetReplicationPlainArgs(Objects.requireNonNull(defaults));
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
         * @param replicationName The name of the replication.
         * 
         * @return builder
         * 
         */
        public Builder replicationName(String replicationName) {
            $.replicationName = replicationName;
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

        public GetReplicationPlainArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.replicationName = Objects.requireNonNull($.replicationName, "expected parameter 'replicationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
