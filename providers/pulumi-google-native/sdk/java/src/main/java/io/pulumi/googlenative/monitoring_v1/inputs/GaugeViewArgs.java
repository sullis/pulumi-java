// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A gauge chart shows where the current value sits within a pre-defined range. The upper and lower bounds should define the possible range of values for the scorecard's query (inclusive).
 * 
 */
public final class GaugeViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final GaugeViewArgs Empty = new GaugeViewArgs();

    /**
     * The lower bound for this gauge chart. The value of the chart should always be greater than or equal to this.
     * 
     */
    @InputImport(name="lowerBound")
      private final @Nullable Input<Double> lowerBound;

    public Input<Double> getLowerBound() {
        return this.lowerBound == null ? Input.empty() : this.lowerBound;
    }

    /**
     * The upper bound for this gauge chart. The value of the chart should always be less than or equal to this.
     * 
     */
    @InputImport(name="upperBound")
      private final @Nullable Input<Double> upperBound;

    public Input<Double> getUpperBound() {
        return this.upperBound == null ? Input.empty() : this.upperBound;
    }

    public GaugeViewArgs(
        @Nullable Input<Double> lowerBound,
        @Nullable Input<Double> upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    private GaugeViewArgs() {
        this.lowerBound = Input.empty();
        this.upperBound = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GaugeViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> lowerBound;
        private @Nullable Input<Double> upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GaugeViewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lowerBound = defaults.lowerBound;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder setLowerBound(@Nullable Input<Double> lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder setLowerBound(@Nullable Double lowerBound) {
            this.lowerBound = Input.ofNullable(lowerBound);
            return this;
        }

        public Builder setUpperBound(@Nullable Input<Double> upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public Builder setUpperBound(@Nullable Double upperBound) {
            this.upperBound = Input.ofNullable(upperBound);
            return this;
        }
        public GaugeViewArgs build() {
            return new GaugeViewArgs(lowerBound, upperBound);
        }
    }
}