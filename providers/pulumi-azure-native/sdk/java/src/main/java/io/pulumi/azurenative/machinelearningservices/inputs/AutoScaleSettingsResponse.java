// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoScaleSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoScaleSettingsResponse Empty = new AutoScaleSettingsResponse();

    /**
     * Maximum number of instances for this deployment.
     * 
     */
    @InputImport(name="maxInstances")
    private final @Nullable Integer maxInstances;

    public Optional<Integer> getMaxInstances() {
        return this.maxInstances == null ? Optional.empty() : Optional.ofNullable(this.maxInstances);
    }

    /**
     * Minimum number of instances for this deployment.
     * 
     */
    @InputImport(name="minInstances")
    private final @Nullable Integer minInstances;

    public Optional<Integer> getMinInstances() {
        return this.minInstances == null ? Optional.empty() : Optional.ofNullable(this.minInstances);
    }

    /**
     * The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
     * 
     */
    @InputImport(name="pollingInterval")
    private final @Nullable String pollingInterval;

    public Optional<String> getPollingInterval() {
        return this.pollingInterval == null ? Optional.empty() : Optional.ofNullable(this.pollingInterval);
    }

    /**
     * Expected value is 'Auto'.
     * 
     */
    @InputImport(name="scaleType", required=true)
    private final String scaleType;

    public String getScaleType() {
        return this.scaleType;
    }

    /**
     * Target CPU usage for the autoscaler.
     * 
     */
    @InputImport(name="targetUtilizationPercentage")
    private final @Nullable Integer targetUtilizationPercentage;

    public Optional<Integer> getTargetUtilizationPercentage() {
        return this.targetUtilizationPercentage == null ? Optional.empty() : Optional.ofNullable(this.targetUtilizationPercentage);
    }

    public AutoScaleSettingsResponse(
        @Nullable Integer maxInstances,
        @Nullable Integer minInstances,
        @Nullable String pollingInterval,
        String scaleType,
        @Nullable Integer targetUtilizationPercentage) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.pollingInterval = pollingInterval;
        this.scaleType = Objects.requireNonNull(scaleType, "expected parameter 'scaleType' to be non-null");
        this.targetUtilizationPercentage = targetUtilizationPercentage;
    }

    private AutoScaleSettingsResponse() {
        this.maxInstances = null;
        this.minInstances = null;
        this.pollingInterval = null;
        this.scaleType = null;
        this.targetUtilizationPercentage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private @Nullable String pollingInterval;
        private String scaleType;
        private @Nullable Integer targetUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.pollingInterval = defaults.pollingInterval;
    	      this.scaleType = defaults.scaleType;
    	      this.targetUtilizationPercentage = defaults.targetUtilizationPercentage;
        }

        public Builder setMaxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder setMinInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder setPollingInterval(@Nullable String pollingInterval) {
            this.pollingInterval = pollingInterval;
            return this;
        }

        public Builder setScaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public Builder setTargetUtilizationPercentage(@Nullable Integer targetUtilizationPercentage) {
            this.targetUtilizationPercentage = targetUtilizationPercentage;
            return this;
        }

        public AutoScaleSettingsResponse build() {
            return new AutoScaleSettingsResponse(maxInstances, minInstances, pollingInterval, scaleType, targetUtilizationPercentage);
        }
    }
}
