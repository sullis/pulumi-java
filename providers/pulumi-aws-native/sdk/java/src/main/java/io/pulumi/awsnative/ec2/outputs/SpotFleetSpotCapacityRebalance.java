// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.SpotFleetSpotCapacityRebalanceReplacementStrategy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetSpotCapacityRebalance {
    private final @Nullable SpotFleetSpotCapacityRebalanceReplacementStrategy replacementStrategy;
    private final @Nullable Integer terminationDelay;

    @OutputCustomType.Constructor({"replacementStrategy","terminationDelay"})
    private SpotFleetSpotCapacityRebalance(
        @Nullable SpotFleetSpotCapacityRebalanceReplacementStrategy replacementStrategy,
        @Nullable Integer terminationDelay) {
        this.replacementStrategy = replacementStrategy;
        this.terminationDelay = terminationDelay;
    }

    public Optional<SpotFleetSpotCapacityRebalanceReplacementStrategy> getReplacementStrategy() {
        return Optional.ofNullable(this.replacementStrategy);
    }
    public Optional<Integer> getTerminationDelay() {
        return Optional.ofNullable(this.terminationDelay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotCapacityRebalance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetSpotCapacityRebalanceReplacementStrategy replacementStrategy;
        private @Nullable Integer terminationDelay;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotCapacityRebalance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replacementStrategy = defaults.replacementStrategy;
    	      this.terminationDelay = defaults.terminationDelay;
        }

        public Builder setReplacementStrategy(@Nullable SpotFleetSpotCapacityRebalanceReplacementStrategy replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder setTerminationDelay(@Nullable Integer terminationDelay) {
            this.terminationDelay = terminationDelay;
            return this;
        }
        public SpotFleetSpotCapacityRebalance build() {
            return new SpotFleetSpotCapacityRebalance(replacementStrategy, terminationDelay);
        }
    }
}