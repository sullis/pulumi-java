// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy used for monitoring the application upgrade
 * 
 */
public final class ArmRollingUpgradeMonitoringPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArmRollingUpgradeMonitoringPolicyResponse Empty = new ArmRollingUpgradeMonitoringPolicyResponse();

    /**
     * The activation Mode of the service package
     * 
     */
    @InputImport(name="failureAction")
    private final @Nullable String failureAction;

    public Optional<String> getFailureAction() {
        return this.failureAction == null ? Optional.empty() : Optional.ofNullable(this.failureAction);
    }

    /**
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @InputImport(name="healthCheckRetryTimeout")
    private final @Nullable String healthCheckRetryTimeout;

    public Optional<String> getHealthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout == null ? Optional.empty() : Optional.ofNullable(this.healthCheckRetryTimeout);
    }

    /**
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @InputImport(name="healthCheckStableDuration")
    private final @Nullable String healthCheckStableDuration;

    public Optional<String> getHealthCheckStableDuration() {
        return this.healthCheckStableDuration == null ? Optional.empty() : Optional.ofNullable(this.healthCheckStableDuration);
    }

    /**
     * The amount of time to wait after completing an upgrade domain before applying health policies. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @InputImport(name="healthCheckWaitDuration")
    private final @Nullable String healthCheckWaitDuration;

    public Optional<String> getHealthCheckWaitDuration() {
        return this.healthCheckWaitDuration == null ? Optional.empty() : Optional.ofNullable(this.healthCheckWaitDuration);
    }

    /**
     * The amount of time each upgrade domain has to complete before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @InputImport(name="upgradeDomainTimeout")
    private final @Nullable String upgradeDomainTimeout;

    public Optional<String> getUpgradeDomainTimeout() {
        return this.upgradeDomainTimeout == null ? Optional.empty() : Optional.ofNullable(this.upgradeDomainTimeout);
    }

    /**
     * The amount of time the overall upgrade has to complete before FailureAction is executed. It is first interpreted as a string representing an ISO 8601 duration. If that fails, then it is interpreted as a number representing the total number of milliseconds.
     * 
     */
    @InputImport(name="upgradeTimeout")
    private final @Nullable String upgradeTimeout;

    public Optional<String> getUpgradeTimeout() {
        return this.upgradeTimeout == null ? Optional.empty() : Optional.ofNullable(this.upgradeTimeout);
    }

    public ArmRollingUpgradeMonitoringPolicyResponse(
        @Nullable String failureAction,
        @Nullable String healthCheckRetryTimeout,
        @Nullable String healthCheckStableDuration,
        @Nullable String healthCheckWaitDuration,
        @Nullable String upgradeDomainTimeout,
        @Nullable String upgradeTimeout) {
        this.failureAction = failureAction;
        this.healthCheckRetryTimeout = healthCheckRetryTimeout;
        this.healthCheckStableDuration = healthCheckStableDuration;
        this.healthCheckWaitDuration = healthCheckWaitDuration;
        this.upgradeDomainTimeout = upgradeDomainTimeout;
        this.upgradeTimeout = upgradeTimeout;
    }

    private ArmRollingUpgradeMonitoringPolicyResponse() {
        this.failureAction = null;
        this.healthCheckRetryTimeout = null;
        this.healthCheckStableDuration = null;
        this.healthCheckWaitDuration = null;
        this.upgradeDomainTimeout = null;
        this.upgradeTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmRollingUpgradeMonitoringPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String failureAction;
        private @Nullable String healthCheckRetryTimeout;
        private @Nullable String healthCheckStableDuration;
        private @Nullable String healthCheckWaitDuration;
        private @Nullable String upgradeDomainTimeout;
        private @Nullable String upgradeTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmRollingUpgradeMonitoringPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureAction = defaults.failureAction;
    	      this.healthCheckRetryTimeout = defaults.healthCheckRetryTimeout;
    	      this.healthCheckStableDuration = defaults.healthCheckStableDuration;
    	      this.healthCheckWaitDuration = defaults.healthCheckWaitDuration;
    	      this.upgradeDomainTimeout = defaults.upgradeDomainTimeout;
    	      this.upgradeTimeout = defaults.upgradeTimeout;
        }

        public Builder setFailureAction(@Nullable String failureAction) {
            this.failureAction = failureAction;
            return this;
        }

        public Builder setHealthCheckRetryTimeout(@Nullable String healthCheckRetryTimeout) {
            this.healthCheckRetryTimeout = healthCheckRetryTimeout;
            return this;
        }

        public Builder setHealthCheckStableDuration(@Nullable String healthCheckStableDuration) {
            this.healthCheckStableDuration = healthCheckStableDuration;
            return this;
        }

        public Builder setHealthCheckWaitDuration(@Nullable String healthCheckWaitDuration) {
            this.healthCheckWaitDuration = healthCheckWaitDuration;
            return this;
        }

        public Builder setUpgradeDomainTimeout(@Nullable String upgradeDomainTimeout) {
            this.upgradeDomainTimeout = upgradeDomainTimeout;
            return this;
        }

        public Builder setUpgradeTimeout(@Nullable String upgradeTimeout) {
            this.upgradeTimeout = upgradeTimeout;
            return this;
        }

        public ArmRollingUpgradeMonitoringPolicyResponse build() {
            return new ArmRollingUpgradeMonitoringPolicyResponse(failureAction, healthCheckRetryTimeout, healthCheckStableDuration, healthCheckWaitDuration, upgradeDomainTimeout, upgradeTimeout);
        }
    }
}
