// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetCapacityRebalanceReplacementStrategy;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetCapacityRebalance {
    private final @Nullable EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy;
    private final @Nullable Integer terminationDelay;

    @OutputCustomType.Constructor({"replacementStrategy","terminationDelay"})
    private EC2FleetCapacityRebalance(
        @Nullable EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy,
        @Nullable Integer terminationDelay) {
        this.replacementStrategy = replacementStrategy;
        this.terminationDelay = terminationDelay;
    }

    public Optional<EC2FleetCapacityRebalanceReplacementStrategy> getReplacementStrategy() {
        return Optional.ofNullable(this.replacementStrategy);
    }
    public Optional<Integer> getTerminationDelay() {
        return Optional.ofNullable(this.terminationDelay);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetCapacityRebalance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy;
        private @Nullable Integer terminationDelay;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetCapacityRebalance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replacementStrategy = defaults.replacementStrategy;
    	      this.terminationDelay = defaults.terminationDelay;
        }

        public Builder setReplacementStrategy(@Nullable EC2FleetCapacityRebalanceReplacementStrategy replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }

        public Builder setTerminationDelay(@Nullable Integer terminationDelay) {
            this.terminationDelay = terminationDelay;
            return this;
        }

        public EC2FleetCapacityRebalance build() {
            return new EC2FleetCapacityRebalance(replacementStrategy, terminationDelay);
        }
    }
}
