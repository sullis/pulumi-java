// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNodeTypeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeTypeArgs Empty = new GetNodeTypeArgs();

    /**
     * The name of the cluster resource.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the cluster resource.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the node type.
     * 
     */
    @Import(name="nodeTypeName", required=true)
    private Output<String> nodeTypeName;

    /**
     * @return The name of the node type.
     * 
     */
    public Output<String> nodeTypeName() {
        return this.nodeTypeName;
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

    private GetNodeTypeArgs() {}

    private GetNodeTypeArgs(GetNodeTypeArgs $) {
        this.clusterName = $.clusterName;
        this.nodeTypeName = $.nodeTypeName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeTypeArgs $;

        public Builder() {
            $ = new GetNodeTypeArgs();
        }

        public Builder(GetNodeTypeArgs defaults) {
            $ = new GetNodeTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the cluster resource.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param nodeTypeName The name of the node type.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeName(Output<String> nodeTypeName) {
            $.nodeTypeName = nodeTypeName;
            return this;
        }

        /**
         * @param nodeTypeName The name of the node type.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeName(String nodeTypeName) {
            return nodeTypeName(Output.of(nodeTypeName));
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

        public GetNodeTypeArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.nodeTypeName = Objects.requireNonNull($.nodeTypeName, "expected parameter 'nodeTypeName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
