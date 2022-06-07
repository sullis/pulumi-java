// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPlacementPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlacementPolicyArgs Empty = new GetPlacementPolicyArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return Name of the cluster in the private cloud
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
     * 
     */
    @Import(name="placementPolicyName", required=true)
    private Output<String> placementPolicyName;

    /**
     * @return Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
     * 
     */
    public Output<String> placementPolicyName() {
        return this.placementPolicyName;
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return Name of the private cloud
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPlacementPolicyArgs() {}

    private GetPlacementPolicyArgs(GetPlacementPolicyArgs $) {
        this.clusterName = $.clusterName;
        this.placementPolicyName = $.placementPolicyName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlacementPolicyArgs $;

        public Builder() {
            $ = new GetPlacementPolicyArgs();
        }

        public Builder(GetPlacementPolicyArgs defaults) {
            $ = new GetPlacementPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName Name of the cluster in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName Name of the cluster in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param placementPolicyName Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
         * 
         * @return builder
         * 
         */
        public Builder placementPolicyName(Output<String> placementPolicyName) {
            $.placementPolicyName = placementPolicyName;
            return this;
        }

        /**
         * @param placementPolicyName Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
         * 
         * @return builder
         * 
         */
        public Builder placementPolicyName(String placementPolicyName) {
            return placementPolicyName(Output.of(placementPolicyName));
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName Name of the private cloud
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPlacementPolicyArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.placementPolicyName = Objects.requireNonNull($.placementPolicyName, "expected parameter 'placementPolicyName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
