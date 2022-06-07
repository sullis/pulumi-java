// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterArgs Empty = new GetClusterArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetClusterArgs() {}

    private GetClusterArgs(GetClusterArgs $) {
        this.clusterName = $.clusterName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterArgs $;

        public Builder() {
            $ = new GetClusterArgs();
        }

        public Builder(GetClusterArgs defaults) {
            $ = new GetClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetClusterArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
