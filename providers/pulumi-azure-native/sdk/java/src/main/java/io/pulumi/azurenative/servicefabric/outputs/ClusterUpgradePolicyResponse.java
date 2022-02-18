// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ClusterHealthPolicyResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClusterUpgradeDeltaHealthPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterUpgradePolicyResponse {
    /**
     * The cluster delta health policy used when upgrading the cluster.
     * 
     */
    private final @Nullable ClusterUpgradeDeltaHealthPolicyResponse deltaHealthPolicy;
    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    private final @Nullable Boolean forceRestart;
    /**
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String healthCheckRetryTimeout;
    /**
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String healthCheckStableDuration;
    /**
     * The length of time to wait after completing an upgrade domain before performing health checks. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String healthCheckWaitDuration;
    /**
     * The cluster health policy used when upgrading the cluster.
     * 
     */
    private final ClusterHealthPolicyResponse healthPolicy;
    /**
     * The amount of time each upgrade domain has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String upgradeDomainTimeout;
    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String upgradeReplicaSetCheckTimeout;
    /**
     * The amount of time the overall upgrade has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    private final String upgradeTimeout;

    @OutputCustomType.Constructor({"deltaHealthPolicy","forceRestart","healthCheckRetryTimeout","healthCheckStableDuration","healthCheckWaitDuration","healthPolicy","upgradeDomainTimeout","upgradeReplicaSetCheckTimeout","upgradeTimeout"})
    private ClusterUpgradePolicyResponse(
        @Nullable ClusterUpgradeDeltaHealthPolicyResponse deltaHealthPolicy,
        @Nullable Boolean forceRestart,
        String healthCheckRetryTimeout,
        String healthCheckStableDuration,
        String healthCheckWaitDuration,
        ClusterHealthPolicyResponse healthPolicy,
        String upgradeDomainTimeout,
        String upgradeReplicaSetCheckTimeout,
        String upgradeTimeout) {
        this.deltaHealthPolicy = deltaHealthPolicy;
        this.forceRestart = forceRestart;
        this.healthCheckRetryTimeout = Objects.requireNonNull(healthCheckRetryTimeout);
        this.healthCheckStableDuration = Objects.requireNonNull(healthCheckStableDuration);
        this.healthCheckWaitDuration = Objects.requireNonNull(healthCheckWaitDuration);
        this.healthPolicy = Objects.requireNonNull(healthPolicy);
        this.upgradeDomainTimeout = Objects.requireNonNull(upgradeDomainTimeout);
        this.upgradeReplicaSetCheckTimeout = Objects.requireNonNull(upgradeReplicaSetCheckTimeout);
        this.upgradeTimeout = Objects.requireNonNull(upgradeTimeout);
    }

    /**
     * The cluster delta health policy used when upgrading the cluster.
     * 
     */
    public Optional<ClusterUpgradeDeltaHealthPolicyResponse> getDeltaHealthPolicy() {
        return Optional.ofNullable(this.deltaHealthPolicy);
    }
    /**
     * If true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     * 
     */
    public Optional<Boolean> getForceRestart() {
        return Optional.ofNullable(this.forceRestart);
    }
    /**
     * The amount of time to retry health evaluation when the application or cluster is unhealthy before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getHealthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout;
    }
    /**
     * The amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getHealthCheckStableDuration() {
        return this.healthCheckStableDuration;
    }
    /**
     * The length of time to wait after completing an upgrade domain before performing health checks. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getHealthCheckWaitDuration() {
        return this.healthCheckWaitDuration;
    }
    /**
     * The cluster health policy used when upgrading the cluster.
     * 
     */
    public ClusterHealthPolicyResponse getHealthPolicy() {
        return this.healthPolicy;
    }
    /**
     * The amount of time each upgrade domain has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getUpgradeDomainTimeout() {
        return this.upgradeDomainTimeout;
    }
    /**
     * The maximum amount of time to block processing of an upgrade domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getUpgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout;
    }
    /**
     * The amount of time the overall upgrade has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     * 
     */
    public String getUpgradeTimeout() {
        return this.upgradeTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ClusterUpgradeDeltaHealthPolicyResponse deltaHealthPolicy;
        private @Nullable Boolean forceRestart;
        private String healthCheckRetryTimeout;
        private String healthCheckStableDuration;
        private String healthCheckWaitDuration;
        private ClusterHealthPolicyResponse healthPolicy;
        private String upgradeDomainTimeout;
        private String upgradeReplicaSetCheckTimeout;
        private String upgradeTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deltaHealthPolicy = defaults.deltaHealthPolicy;
    	      this.forceRestart = defaults.forceRestart;
    	      this.healthCheckRetryTimeout = defaults.healthCheckRetryTimeout;
    	      this.healthCheckStableDuration = defaults.healthCheckStableDuration;
    	      this.healthCheckWaitDuration = defaults.healthCheckWaitDuration;
    	      this.healthPolicy = defaults.healthPolicy;
    	      this.upgradeDomainTimeout = defaults.upgradeDomainTimeout;
    	      this.upgradeReplicaSetCheckTimeout = defaults.upgradeReplicaSetCheckTimeout;
    	      this.upgradeTimeout = defaults.upgradeTimeout;
        }

        public Builder setDeltaHealthPolicy(@Nullable ClusterUpgradeDeltaHealthPolicyResponse deltaHealthPolicy) {
            this.deltaHealthPolicy = deltaHealthPolicy;
            return this;
        }

        public Builder setForceRestart(@Nullable Boolean forceRestart) {
            this.forceRestart = forceRestart;
            return this;
        }

        public Builder setHealthCheckRetryTimeout(String healthCheckRetryTimeout) {
            this.healthCheckRetryTimeout = Objects.requireNonNull(healthCheckRetryTimeout);
            return this;
        }

        public Builder setHealthCheckStableDuration(String healthCheckStableDuration) {
            this.healthCheckStableDuration = Objects.requireNonNull(healthCheckStableDuration);
            return this;
        }

        public Builder setHealthCheckWaitDuration(String healthCheckWaitDuration) {
            this.healthCheckWaitDuration = Objects.requireNonNull(healthCheckWaitDuration);
            return this;
        }

        public Builder setHealthPolicy(ClusterHealthPolicyResponse healthPolicy) {
            this.healthPolicy = Objects.requireNonNull(healthPolicy);
            return this;
        }

        public Builder setUpgradeDomainTimeout(String upgradeDomainTimeout) {
            this.upgradeDomainTimeout = Objects.requireNonNull(upgradeDomainTimeout);
            return this;
        }

        public Builder setUpgradeReplicaSetCheckTimeout(String upgradeReplicaSetCheckTimeout) {
            this.upgradeReplicaSetCheckTimeout = Objects.requireNonNull(upgradeReplicaSetCheckTimeout);
            return this;
        }

        public Builder setUpgradeTimeout(String upgradeTimeout) {
            this.upgradeTimeout = Objects.requireNonNull(upgradeTimeout);
            return this;
        }

        public ClusterUpgradePolicyResponse build() {
            return new ClusterUpgradePolicyResponse(deltaHealthPolicy, forceRestart, healthCheckRetryTimeout, healthCheckStableDuration, healthCheckWaitDuration, healthPolicy, upgradeDomainTimeout, upgradeReplicaSetCheckTimeout, upgradeTimeout);
        }
    }
}
