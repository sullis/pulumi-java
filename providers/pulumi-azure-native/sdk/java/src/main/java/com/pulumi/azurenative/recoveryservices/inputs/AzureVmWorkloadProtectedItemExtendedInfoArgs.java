// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information on Azure Workload for SQL specific backup item.
 * 
 */
public final class AzureVmWorkloadProtectedItemExtendedInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureVmWorkloadProtectedItemExtendedInfoArgs Empty = new AzureVmWorkloadProtectedItemExtendedInfoArgs();

    /**
     * The oldest backup copy available for this backup item.
     * 
     */
    @Import(name="oldestRecoveryPoint")
    private @Nullable Output<String> oldestRecoveryPoint;

    /**
     * @return The oldest backup copy available for this backup item.
     * 
     */
    public Optional<Output<String>> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    @Import(name="policyState")
    private @Nullable Output<String> policyState;

    /**
     * @return Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    public Optional<Output<String>> policyState() {
        return Optional.ofNullable(this.policyState);
    }

    /**
     * Number of backup copies available for this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
    private @Nullable Output<Integer> recoveryPointCount;

    /**
     * @return Number of backup copies available for this backup item.
     * 
     */
    public Optional<Output<Integer>> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    private AzureVmWorkloadProtectedItemExtendedInfoArgs() {}

    private AzureVmWorkloadProtectedItemExtendedInfoArgs(AzureVmWorkloadProtectedItemExtendedInfoArgs $) {
        this.oldestRecoveryPoint = $.oldestRecoveryPoint;
        this.policyState = $.policyState;
        this.recoveryPointCount = $.recoveryPointCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureVmWorkloadProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureVmWorkloadProtectedItemExtendedInfoArgs $;

        public Builder() {
            $ = new AzureVmWorkloadProtectedItemExtendedInfoArgs();
        }

        public Builder(AzureVmWorkloadProtectedItemExtendedInfoArgs defaults) {
            $ = new AzureVmWorkloadProtectedItemExtendedInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param oldestRecoveryPoint The oldest backup copy available for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder oldestRecoveryPoint(@Nullable Output<String> oldestRecoveryPoint) {
            $.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        /**
         * @param oldestRecoveryPoint The oldest backup copy available for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder oldestRecoveryPoint(String oldestRecoveryPoint) {
            return oldestRecoveryPoint(Output.of(oldestRecoveryPoint));
        }

        /**
         * @param policyState Indicates consistency of policy object and policy applied to this backup item.
         * 
         * @return builder
         * 
         */
        public Builder policyState(@Nullable Output<String> policyState) {
            $.policyState = policyState;
            return this;
        }

        /**
         * @param policyState Indicates consistency of policy object and policy applied to this backup item.
         * 
         * @return builder
         * 
         */
        public Builder policyState(String policyState) {
            return policyState(Output.of(policyState));
        }

        /**
         * @param recoveryPointCount Number of backup copies available for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointCount(@Nullable Output<Integer> recoveryPointCount) {
            $.recoveryPointCount = recoveryPointCount;
            return this;
        }

        /**
         * @param recoveryPointCount Number of backup copies available for this backup item.
         * 
         * @return builder
         * 
         */
        public Builder recoveryPointCount(Integer recoveryPointCount) {
            return recoveryPointCount(Output.of(recoveryPointCount));
        }

        public AzureVmWorkloadProtectedItemExtendedInfoArgs build() {
            return $;
        }
    }

}
