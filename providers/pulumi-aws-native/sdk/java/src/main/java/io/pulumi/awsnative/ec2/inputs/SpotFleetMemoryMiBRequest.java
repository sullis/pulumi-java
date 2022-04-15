// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetMemoryMiBRequest extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetMemoryMiBRequest Empty = new SpotFleetMemoryMiBRequest();

    @Import(name="max")
      private final @Nullable Integer max;

    public Optional<Integer> max() {
        return this.max == null ? Optional.empty() : Optional.ofNullable(this.max);
    }

    @Import(name="min")
      private final @Nullable Integer min;

    public Optional<Integer> min() {
        return this.min == null ? Optional.empty() : Optional.ofNullable(this.min);
    }

    public SpotFleetMemoryMiBRequest(
        @Nullable Integer max,
        @Nullable Integer min) {
        this.max = max;
        this.min = min;
    }

    private SpotFleetMemoryMiBRequest() {
        this.max = null;
        this.min = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetMemoryMiBRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetMemoryMiBRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }        public SpotFleetMemoryMiBRequest build() {
            return new SpotFleetMemoryMiBRequest(max, min);
        }
    }
}
