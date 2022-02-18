// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class OptimizedAutoscaleResponse {
    /**
     * A boolean value that indicate if the optimized autoscale feature is enabled or not.
     * 
     */
    private final Boolean isEnabled;
    /**
     * Maximum allowed instances count.
     * 
     */
    private final Integer maximum;
    /**
     * Minimum allowed instances count.
     * 
     */
    private final Integer minimum;
    /**
     * The version of the template defined, for instance 1.
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor({"isEnabled","maximum","minimum","version"})
    private OptimizedAutoscaleResponse(
        Boolean isEnabled,
        Integer maximum,
        Integer minimum,
        Integer version) {
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.maximum = Objects.requireNonNull(maximum);
        this.minimum = Objects.requireNonNull(minimum);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * A boolean value that indicate if the optimized autoscale feature is enabled or not.
     * 
     */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Maximum allowed instances count.
     * 
     */
    public Integer getMaximum() {
        return this.maximum;
    }
    /**
     * Minimum allowed instances count.
     * 
     */
    public Integer getMinimum() {
        return this.minimum;
    }
    /**
     * The version of the template defined, for instance 1.
     * 
     */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptimizedAutoscaleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEnabled;
        private Integer maximum;
        private Integer minimum;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(OptimizedAutoscaleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.version = defaults.version;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setMaximum(Integer maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }

        public Builder setMinimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public OptimizedAutoscaleResponse build() {
            return new OptimizedAutoscaleResponse(isEnabled, maximum, minimum, version);
        }
    }
}
