// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.SecurityProfileMetricDimensionOperator;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The dimension of a metric.
 * 
 */
public final class SecurityProfileMetricDimensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileMetricDimensionArgs Empty = new SecurityProfileMetricDimensionArgs();

    /**
     * A unique identifier for the dimension.
     * 
     */
    @Import(name="dimensionName", required=true)
      private final Output<String> dimensionName;

    public Output<String> getDimensionName() {
        return this.dimensionName;
    }

    /**
     * Defines how the dimensionValues of a dimension are interpreted.
     * 
     */
    @Import(name="operator")
      private final @Nullable Output<SecurityProfileMetricDimensionOperator> operator;

    public Output<SecurityProfileMetricDimensionOperator> getOperator() {
        return this.operator == null ? Output.empty() : this.operator;
    }

    public SecurityProfileMetricDimensionArgs(
        Output<String> dimensionName,
        @Nullable Output<SecurityProfileMetricDimensionOperator> operator) {
        this.dimensionName = Objects.requireNonNull(dimensionName, "expected parameter 'dimensionName' to be non-null");
        this.operator = operator;
    }

    private SecurityProfileMetricDimensionArgs() {
        this.dimensionName = Output.empty();
        this.operator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricDimensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dimensionName;
        private @Nullable Output<SecurityProfileMetricDimensionOperator> operator;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricDimensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.operator = defaults.operator;
        }

        public Builder dimensionName(Output<String> dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Output.of(Objects.requireNonNull(dimensionName));
            return this;
        }
        public Builder operator(@Nullable Output<SecurityProfileMetricDimensionOperator> operator) {
            this.operator = operator;
            return this;
        }
        public Builder operator(@Nullable SecurityProfileMetricDimensionOperator operator) {
            this.operator = Output.ofNullable(operator);
            return this;
        }        public SecurityProfileMetricDimensionArgs build() {
            return new SecurityProfileMetricDimensionArgs(dimensionName, operator);
        }
    }
}
