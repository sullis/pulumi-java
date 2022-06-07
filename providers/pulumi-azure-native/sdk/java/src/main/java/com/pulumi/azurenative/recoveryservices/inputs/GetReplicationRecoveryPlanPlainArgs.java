// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationRecoveryPlanPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationRecoveryPlanPlainArgs Empty = new GetReplicationRecoveryPlanPlainArgs();

    /**
     * Name of the recovery plan.
     * 
     */
    @Import(name="recoveryPlanName", required=true)
    private String recoveryPlanName;

    /**
     * @return Name of the recovery plan.
     * 
     */
    public String recoveryPlanName() {
        return this.recoveryPlanName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group where the recovery services vault is present.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the recovery services vault.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetReplicationRecoveryPlanPlainArgs() {}

    private GetReplicationRecoveryPlanPlainArgs(GetReplicationRecoveryPlanPlainArgs $) {
        this.recoveryPlanName = $.recoveryPlanName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationRecoveryPlanPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationRecoveryPlanPlainArgs $;

        public Builder() {
            $ = new GetReplicationRecoveryPlanPlainArgs();
        }

        public Builder(GetReplicationRecoveryPlanPlainArgs defaults) {
            $ = new GetReplicationRecoveryPlanPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recoveryPlanName Name of the recovery plan.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPlanName(String recoveryPlanName) {
            $.recoveryPlanName = recoveryPlanName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the recovery services vault is present.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the recovery services vault.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetReplicationRecoveryPlanPlainArgs build() {
            $.recoveryPlanName = Objects.requireNonNull($.recoveryPlanName, "expected parameter 'recoveryPlanName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
