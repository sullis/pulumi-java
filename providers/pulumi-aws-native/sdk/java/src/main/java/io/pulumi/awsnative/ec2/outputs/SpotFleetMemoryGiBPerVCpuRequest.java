// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetMemoryGiBPerVCpuRequest {
    private final @Nullable Double max;
    private final @Nullable Double min;

    @OutputCustomType.Constructor
    private SpotFleetMemoryGiBPerVCpuRequest(
        @OutputCustomType.Parameter("max") @Nullable Double max,
        @OutputCustomType.Parameter("min") @Nullable Double min) {
        this.max = max;
        this.min = min;
    }

    public Optional<Double> getMax() {
        return Optional.ofNullable(this.max);
    }
    public Optional<Double> getMin() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetMemoryGiBPerVCpuRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double max;
        private @Nullable Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetMemoryGiBPerVCpuRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(@Nullable Double max) {
            this.max = max;
            return this;
        }

        public Builder setMin(@Nullable Double min) {
            this.min = min;
            return this;
        }
        public SpotFleetMemoryGiBPerVCpuRequest build() {
            return new SpotFleetMemoryGiBPerVCpuRequest(max, min);
        }
    }
}
