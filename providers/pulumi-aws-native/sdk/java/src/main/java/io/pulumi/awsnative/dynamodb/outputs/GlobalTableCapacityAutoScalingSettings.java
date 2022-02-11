// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.awsnative.dynamodb.outputs.GlobalTableTargetTrackingScalingPolicyConfiguration;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalTableCapacityAutoScalingSettings {
    private final Integer maxCapacity;
    private final Integer minCapacity;
    private final @Nullable Integer seedCapacity;
    private final GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

    @OutputCustomType.Constructor({"maxCapacity","minCapacity","seedCapacity","targetTrackingScalingPolicyConfiguration"})
    private GlobalTableCapacityAutoScalingSettings(
        Integer maxCapacity,
        Integer minCapacity,
        @Nullable Integer seedCapacity,
        GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
        this.maxCapacity = Objects.requireNonNull(maxCapacity);
        this.minCapacity = Objects.requireNonNull(minCapacity);
        this.seedCapacity = seedCapacity;
        this.targetTrackingScalingPolicyConfiguration = Objects.requireNonNull(targetTrackingScalingPolicyConfiguration);
    }

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }
    public Integer getMinCapacity() {
        return this.minCapacity;
    }
    public Optional<Integer> getSeedCapacity() {
        return Optional.ofNullable(this.seedCapacity);
    }
    public GlobalTableTargetTrackingScalingPolicyConfiguration getTargetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableCapacityAutoScalingSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxCapacity;
        private Integer minCapacity;
        private @Nullable Integer seedCapacity;
        private GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableCapacityAutoScalingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
    	      this.seedCapacity = defaults.seedCapacity;
    	      this.targetTrackingScalingPolicyConfiguration = defaults.targetTrackingScalingPolicyConfiguration;
        }

        public Builder setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = Objects.requireNonNull(maxCapacity);
            return this;
        }

        public Builder setMinCapacity(Integer minCapacity) {
            this.minCapacity = Objects.requireNonNull(minCapacity);
            return this;
        }

        public Builder setSeedCapacity(@Nullable Integer seedCapacity) {
            this.seedCapacity = seedCapacity;
            return this;
        }

        public Builder setTargetTrackingScalingPolicyConfiguration(GlobalTableTargetTrackingScalingPolicyConfiguration targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = Objects.requireNonNull(targetTrackingScalingPolicyConfiguration);
            return this;
        }

        public GlobalTableCapacityAutoScalingSettings build() {
            return new GlobalTableCapacityAutoScalingSettings(maxCapacity, minCapacity, seedCapacity, targetTrackingScalingPolicyConfiguration);
        }
    }
}
