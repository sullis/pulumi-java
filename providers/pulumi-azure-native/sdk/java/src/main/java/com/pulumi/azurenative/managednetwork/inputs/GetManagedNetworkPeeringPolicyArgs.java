// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedNetworkPeeringPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedNetworkPeeringPolicyArgs Empty = new GetManagedNetworkPeeringPolicyArgs();

    /**
     * The name of the Managed Network.
     * 
     */
    @Import(name="managedNetworkName", required=true)
    private Output<String> managedNetworkName;

    /**
     * @return The name of the Managed Network.
     * 
     */
    public Output<String> managedNetworkName() {
        return this.managedNetworkName;
    }

    /**
     * The name of the Managed Network Peering Policy.
     * 
     */
    @Import(name="managedNetworkPeeringPolicyName", required=true)
    private Output<String> managedNetworkPeeringPolicyName;

    /**
     * @return The name of the Managed Network Peering Policy.
     * 
     */
    public Output<String> managedNetworkPeeringPolicyName() {
        return this.managedNetworkPeeringPolicyName;
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

    private GetManagedNetworkPeeringPolicyArgs() {}

    private GetManagedNetworkPeeringPolicyArgs(GetManagedNetworkPeeringPolicyArgs $) {
        this.managedNetworkName = $.managedNetworkName;
        this.managedNetworkPeeringPolicyName = $.managedNetworkPeeringPolicyName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedNetworkPeeringPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedNetworkPeeringPolicyArgs $;

        public Builder() {
            $ = new GetManagedNetworkPeeringPolicyArgs();
        }

        public Builder(GetManagedNetworkPeeringPolicyArgs defaults) {
            $ = new GetManagedNetworkPeeringPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(Output<String> managedNetworkName) {
            $.managedNetworkName = managedNetworkName;
            return this;
        }

        /**
         * @param managedNetworkName The name of the Managed Network.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkName(String managedNetworkName) {
            return managedNetworkName(Output.of(managedNetworkName));
        }

        /**
         * @param managedNetworkPeeringPolicyName The name of the Managed Network Peering Policy.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkPeeringPolicyName(Output<String> managedNetworkPeeringPolicyName) {
            $.managedNetworkPeeringPolicyName = managedNetworkPeeringPolicyName;
            return this;
        }

        /**
         * @param managedNetworkPeeringPolicyName The name of the Managed Network Peering Policy.
         * 
         * @return builder
         * 
         */
        public Builder managedNetworkPeeringPolicyName(String managedNetworkPeeringPolicyName) {
            return managedNetworkPeeringPolicyName(Output.of(managedNetworkPeeringPolicyName));
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

        public GetManagedNetworkPeeringPolicyArgs build() {
            $.managedNetworkName = Objects.requireNonNull($.managedNetworkName, "expected parameter 'managedNetworkName' to be non-null");
            $.managedNetworkPeeringPolicyName = Objects.requireNonNull($.managedNetworkPeeringPolicyName, "expected parameter 'managedNetworkPeeringPolicyName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
