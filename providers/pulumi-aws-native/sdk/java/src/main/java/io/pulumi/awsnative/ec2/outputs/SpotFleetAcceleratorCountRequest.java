// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SpotFleetAcceleratorCountRequest {
    private final @Nullable Integer max;
    private final @Nullable Integer min;

    @OutputCustomType.Constructor({"max","min"})
    private SpotFleetAcceleratorCountRequest(
        @Nullable Integer max,
        @Nullable Integer min) {
        this.max = max;
        this.min = min;
    }

    public Optional<Integer> getMax() {
        return Optional.ofNullable(this.max);
    }
    public Optional<Integer> getMin() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetAcceleratorCountRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetAcceleratorCountRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder setMax(@Nullable Integer max) {
            this.max = max;
            return this;
        }

        public Builder setMin(@Nullable Integer min) {
            this.min = min;
            return this;
        }

        public SpotFleetAcceleratorCountRequest build() {
            return new SpotFleetAcceleratorCountRequest(max, min);
        }
    }
}
