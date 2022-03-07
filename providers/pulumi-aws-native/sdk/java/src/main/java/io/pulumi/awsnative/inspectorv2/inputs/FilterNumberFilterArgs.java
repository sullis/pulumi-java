// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.inspectorv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FilterNumberFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final FilterNumberFilterArgs Empty = new FilterNumberFilterArgs();

    @InputImport(name="lowerInclusive")
      private final @Nullable Input<Double> lowerInclusive;

    public Input<Double> getLowerInclusive() {
        return this.lowerInclusive == null ? Input.empty() : this.lowerInclusive;
    }

    @InputImport(name="upperInclusive")
      private final @Nullable Input<Double> upperInclusive;

    public Input<Double> getUpperInclusive() {
        return this.upperInclusive == null ? Input.empty() : this.upperInclusive;
    }

    public FilterNumberFilterArgs(
        @Nullable Input<Double> lowerInclusive,
        @Nullable Input<Double> upperInclusive) {
        this.lowerInclusive = lowerInclusive;
        this.upperInclusive = upperInclusive;
    }

    private FilterNumberFilterArgs() {
        this.lowerInclusive = Input.empty();
        this.upperInclusive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FilterNumberFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> lowerInclusive;
        private @Nullable Input<Double> upperInclusive;

        public Builder() {
    	      // Empty
        }

        public Builder(FilterNumberFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerInclusive = defaults.lowerInclusive;
    	      this.upperInclusive = defaults.upperInclusive;
        }

        public Builder setLowerInclusive(@Nullable Input<Double> lowerInclusive) {
            this.lowerInclusive = lowerInclusive;
            return this;
        }

        public Builder setLowerInclusive(@Nullable Double lowerInclusive) {
            this.lowerInclusive = Input.ofNullable(lowerInclusive);
            return this;
        }

        public Builder setUpperInclusive(@Nullable Input<Double> upperInclusive) {
            this.upperInclusive = upperInclusive;
            return this;
        }

        public Builder setUpperInclusive(@Nullable Double upperInclusive) {
            this.upperInclusive = Input.ofNullable(upperInclusive);
            return this;
        }
        public FilterNumberFilterArgs build() {
            return new FilterNumberFilterArgs(lowerInclusive, upperInclusive);
        }
    }
}