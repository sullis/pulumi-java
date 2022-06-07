// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationRecoveryPlanArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationRecoveryPlanArgs Empty = new GetReplicationRecoveryPlanArgs();

    /**
     * Name of the recovery plan.
     * 
     */
    @Import(name="recoveryPlanName", required=true)
    private Output<String> recoveryPlanName;

    /**
     * @return Name of the recovery plan.
     * 
     */
    public Output<String> recoveryPlanName() {
        return this.recoveryPlanName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private GetReplicationRecoveryPlanArgs() {}

    private GetReplicationRecoveryPlanArgs(GetReplicationRecoveryPlanArgs $) {
        this.recoveryPlanName = $.recoveryPlanName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationRecoveryPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationRecoveryPlanArgs $;

        public Builder() {
            $ = new GetReplicationRecoveryPlanArgs();
        }

        public Builder(GetReplicationRecoveryPlanArgs defaults) {
            $ = new GetReplicationRecoveryPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recoveryPlanName Name of the recovery plan.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPlanName(Output<String> recoveryPlanName) {
            $.recoveryPlanName = recoveryPlanName;
            return this;
        }

        /**
         * @param recoveryPlanName Name of the recovery plan.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPlanName(String recoveryPlanName) {
            return recoveryPlanName(Output.of(recoveryPlanName));
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public GetReplicationRecoveryPlanArgs build() {
            $.recoveryPlanName = Objects.requireNonNull($.recoveryPlanName, "expected parameter 'recoveryPlanName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
