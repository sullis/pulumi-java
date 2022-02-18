// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The liveness probe requirements.
 * 
 */
public final class AKSServiceResponseResponseLivenessProbeRequirements extends io.pulumi.resources.InvokeArgs {

    public static final AKSServiceResponseResponseLivenessProbeRequirements Empty = new AKSServiceResponseResponseLivenessProbeRequirements();

    /**
     * The number of failures to allow before returning an unhealthy status.
     * 
     */
    @InputImport(name="failureThreshold")
    private final @Nullable Integer failureThreshold;

    public Optional<Integer> getFailureThreshold() {
        return this.failureThreshold == null ? Optional.empty() : Optional.ofNullable(this.failureThreshold);
    }

    /**
     * The delay before the first probe in seconds.
     * 
     */
    @InputImport(name="initialDelaySeconds")
    private final @Nullable Integer initialDelaySeconds;

    public Optional<Integer> getInitialDelaySeconds() {
        return this.initialDelaySeconds == null ? Optional.empty() : Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * The length of time between probes in seconds.
     * 
     */
    @InputImport(name="periodSeconds")
    private final @Nullable Integer periodSeconds;

    public Optional<Integer> getPeriodSeconds() {
        return this.periodSeconds == null ? Optional.empty() : Optional.ofNullable(this.periodSeconds);
    }

    /**
     * The number of successful probes before returning a healthy status.
     * 
     */
    @InputImport(name="successThreshold")
    private final @Nullable Integer successThreshold;

    public Optional<Integer> getSuccessThreshold() {
        return this.successThreshold == null ? Optional.empty() : Optional.ofNullable(this.successThreshold);
    }

    /**
     * The probe timeout in seconds.
     * 
     */
    @InputImport(name="timeoutSeconds")
    private final @Nullable Integer timeoutSeconds;

    public Optional<Integer> getTimeoutSeconds() {
        return this.timeoutSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutSeconds);
    }

    public AKSServiceResponseResponseLivenessProbeRequirements(
        @Nullable Integer failureThreshold,
        @Nullable Integer initialDelaySeconds,
        @Nullable Integer periodSeconds,
        @Nullable Integer successThreshold,
        @Nullable Integer timeoutSeconds) {
        this.failureThreshold = failureThreshold;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.timeoutSeconds = timeoutSeconds;
    }

    private AKSServiceResponseResponseLivenessProbeRequirements() {
        this.failureThreshold = null;
        this.initialDelaySeconds = null;
        this.periodSeconds = null;
        this.successThreshold = null;
        this.timeoutSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer failureThreshold;
        private @Nullable Integer initialDelaySeconds;
        private @Nullable Integer periodSeconds;
        private @Nullable Integer successThreshold;
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseLivenessProbeRequirements defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder setFailureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }

        public Builder setInitialDelaySeconds(@Nullable Integer initialDelaySeconds) {
            this.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder setPeriodSeconds(@Nullable Integer periodSeconds) {
            this.periodSeconds = periodSeconds;
            return this;
        }

        public Builder setSuccessThreshold(@Nullable Integer successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }

        public Builder setTimeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public AKSServiceResponseResponseLivenessProbeRequirements build() {
            return new AKSServiceResponseResponseLivenessProbeRequirements(failureThreshold, initialDelaySeconds, periodSeconds, successThreshold, timeoutSeconds);
        }
    }
}
