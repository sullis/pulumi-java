// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ScaleCapacityResponse {
    /**
     * the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    private final String $default;
    /**
     * the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    private final String maximum;
    /**
     * the minimum number of instances for the resource.
     * 
     */
    private final String minimum;

    @OutputCustomType.Constructor({"$default","maximum","minimum"})
    private ScaleCapacityResponse(
        String $default,
        String maximum,
        String minimum) {
        this.$default = Objects.requireNonNull($default);
        this.maximum = Objects.requireNonNull(maximum);
        this.minimum = Objects.requireNonNull(minimum);
    }

    /**
     * the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
    */
    public String get$default() {
        return this.$default;
    }
    /**
     * the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
    */
    public String getMaximum() {
        return this.maximum;
    }
    /**
     * the minimum number of instances for the resource.
     * 
    */
    public String getMinimum() {
        return this.minimum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String $default;
        private String maximum;
        private String minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder set$default(String $default) {
            this.$default = Objects.requireNonNull($default);
            return this;
        }

        public Builder setMaximum(String maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder setMinimum(String minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public ScaleCapacityResponse build() {
            return new ScaleCapacityResponse($default, maximum, minimum);
        }
    }
}