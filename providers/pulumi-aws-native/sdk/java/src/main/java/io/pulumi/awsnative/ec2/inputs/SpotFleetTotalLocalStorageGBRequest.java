// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetTotalLocalStorageGBRequest extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetTotalLocalStorageGBRequest Empty = new SpotFleetTotalLocalStorageGBRequest();

    @InputImport(name="max")
      private final @Nullable Double max;

    public Optional<Double> getMax() {
        return this.max == null ? Optional.empty() : Optional.ofNullable(this.max);
    }

    @InputImport(name="min")
      private final @Nullable Double min;

    public Optional<Double> getMin() {
        return this.min == null ? Optional.empty() : Optional.ofNullable(this.min);
    }

    public SpotFleetTotalLocalStorageGBRequest(
        @Nullable Double max,
        @Nullable Double min) {
        this.max = max;
        this.min = min;
    }

    private SpotFleetTotalLocalStorageGBRequest() {
        this.max = null;
        this.min = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTotalLocalStorageGBRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double max;
        private @Nullable Double min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTotalLocalStorageGBRequest defaults) {
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
        public SpotFleetTotalLocalStorageGBRequest build() {
            return new SpotFleetTotalLocalStorageGBRequest(max, min);
        }
    }
}