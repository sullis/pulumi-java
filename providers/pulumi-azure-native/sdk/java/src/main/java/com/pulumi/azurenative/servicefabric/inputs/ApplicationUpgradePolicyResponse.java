// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ArmApplicationHealthPolicyResponse;
import com.pulumi.azurenative.servicefabric.inputs.ArmRollingUpgradeMonitoringPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the policy for a monitored application upgrade.
 * 
 */
public final class ApplicationUpgradePolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationUpgradePolicyResponse Empty = new ApplicationUpgradePolicyResponse();

    /**
     * Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    @Import(name="applicationHealthPolicy")
    private @Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy;

    /**
     * @return Defines a health policy used to evaluate the health of an application or one of its children entities.
     * 
     */
    public Optional<ArmApplicationHealthPolicyResponse> applicationHealthPolicy() {
        return Optional.ofNullable(this.applicationHealthPolicy);
    }

    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    @Import(name="forceRestart")
    private @Nullable Boolean forceRestart;

    /**
     * @return If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    public Optional<Boolean> forceRestart() {
        return Optional.ofNullable(this.forceRestart);
    }

    /**
     * Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    @Import(name="recreateApplication")
    private @Nullable Boolean recreateApplication;

    /**
     * @return Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     * 
     */
    public Optional<Boolean> recreateApplication() {
        return Optional.ofNullable(this.recreateApplication);
    }

    /**
     * The policy used for monitoring the application upgrade
     * 
     */
    @Import(name="rollingUpgradeMonitoringPolicy")
    private @Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy;

    /**
     * @return The policy used for monitoring the application upgrade
     * 
     */
    public Optional<ArmRollingUpgradeMonitoringPolicyResponse> rollingUpgradeMonitoringPolicy() {
        return Optional.ofNullable(this.rollingUpgradeMonitoringPolicy);
    }

    /**
     * The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    @Import(name="upgradeMode")
    private @Nullable String upgradeMode;

    /**
     * @return The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
     * 
     */
    public Optional<String> upgradeMode() {
        return Optional.ofNullable(this.upgradeMode);
    }

    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    @Import(name="upgradeReplicaSetCheckTimeout")
    private @Nullable String upgradeReplicaSetCheckTimeout;

    /**
     * @return The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     * 
     */
    public Optional<String> upgradeReplicaSetCheckTimeout() {
        return Optional.ofNullable(this.upgradeReplicaSetCheckTimeout);
    }

    private ApplicationUpgradePolicyResponse() {}

    private ApplicationUpgradePolicyResponse(ApplicationUpgradePolicyResponse $) {
        this.applicationHealthPolicy = $.applicationHealthPolicy;
        this.forceRestart = $.forceRestart;
        this.recreateApplication = $.recreateApplication;
        this.rollingUpgradeMonitoringPolicy = $.rollingUpgradeMonitoringPolicy;
        this.upgradeMode = $.upgradeMode;
        this.upgradeReplicaSetCheckTimeout = $.upgradeReplicaSetCheckTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationUpgradePolicyResponse $;

        public Builder() {
            $ = new ApplicationUpgradePolicyResponse();
        }

        public Builder(ApplicationUpgradePolicyResponse defaults) {
            $ = new ApplicationUpgradePolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationHealthPolicy Defines a health policy used to evaluate the health of an application or one of its children entities.
         * 
         * @return builder
         * 
         */
        public Builder applicationHealthPolicy(@Nullable ArmApplicationHealthPolicyResponse applicationHealthPolicy) {
            $.applicationHealthPolicy = applicationHealthPolicy;
            return this;
        }

        /**
         * @param forceRestart If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
         * 
         * @return builder
         * 
         */
        public Builder forceRestart(@Nullable Boolean forceRestart) {
            $.forceRestart = forceRestart;
            return this;
        }

        /**
         * @param recreateApplication Determines whether the application should be recreated on update. If value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
         * 
         * @return builder
         * 
         */
        public Builder recreateApplication(@Nullable Boolean recreateApplication) {
            $.recreateApplication = recreateApplication;
            return this;
        }

        /**
         * @param rollingUpgradeMonitoringPolicy The policy used for monitoring the application upgrade
         * 
         * @return builder
         * 
         */
        public Builder rollingUpgradeMonitoringPolicy(@Nullable ArmRollingUpgradeMonitoringPolicyResponse rollingUpgradeMonitoringPolicy) {
            $.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
            return this;
        }

        /**
         * @param upgradeMode The mode used to monitor health during a rolling upgrade. The values are UnmonitoredAuto, UnmonitoredManual, and Monitored.
         * 
         * @return builder
         * 
         */
        public Builder upgradeMode(@Nullable String upgradeMode) {
            $.upgradeMode = upgradeMode;
            return this;
        }

        /**
         * @param upgradeReplicaSetCheckTimeout The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
         * 
         * @return builder
         * 
         */
        public Builder upgradeReplicaSetCheckTimeout(@Nullable String upgradeReplicaSetCheckTimeout) {
            $.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
            return this;
        }

        public ApplicationUpgradePolicyResponse build() {
            return $;
        }
    }

}
