// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SkuCapacityResponse {
    /**
     * Default number of workers for this App Service plan SKU.
     * 
     */
    private final @Nullable Integer $default;
    /**
     * Maximum number of Elastic workers for this App Service plan SKU.
     * 
     */
    private final @Nullable Integer elasticMaximum;
    /**
     * Maximum number of workers for this App Service plan SKU.
     * 
     */
    private final @Nullable Integer maximum;
    /**
     * Minimum number of workers for this App Service plan SKU.
     * 
     */
    private final @Nullable Integer minimum;
    /**
     * Available scale configurations for an App Service plan.
     * 
     */
    private final @Nullable String scaleType;

    @OutputCustomType.Constructor({"$default","elasticMaximum","maximum","minimum","scaleType"})
    private SkuCapacityResponse(
        @Nullable Integer $default,
        @Nullable Integer elasticMaximum,
        @Nullable Integer maximum,
        @Nullable Integer minimum,
        @Nullable String scaleType) {
        this.$default = $default;
        this.elasticMaximum = elasticMaximum;
        this.maximum = maximum;
        this.minimum = minimum;
        this.scaleType = scaleType;
    }

    /**
     * Default number of workers for this App Service plan SKU.
     * 
     */
    public Optional<Integer> get$default() {
        return Optional.ofNullable(this.$default);
    }
    /**
     * Maximum number of Elastic workers for this App Service plan SKU.
     * 
     */
    public Optional<Integer> getElasticMaximum() {
        return Optional.ofNullable(this.elasticMaximum);
    }
    /**
     * Maximum number of workers for this App Service plan SKU.
     * 
     */
    public Optional<Integer> getMaximum() {
        return Optional.ofNullable(this.maximum);
    }
    /**
     * Minimum number of workers for this App Service plan SKU.
     * 
     */
    public Optional<Integer> getMinimum() {
        return Optional.ofNullable(this.minimum);
    }
    /**
     * Available scale configurations for an App Service plan.
     * 
     */
    public Optional<String> getScaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCapacityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer $default;
        private @Nullable Integer elasticMaximum;
        private @Nullable Integer maximum;
        private @Nullable Integer minimum;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCapacityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.$default = defaults.$default;
    	      this.elasticMaximum = defaults.elasticMaximum;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder set$default(@Nullable Integer $default) {
            this.$default = $default;
            return this;
        }

        public Builder setElasticMaximum(@Nullable Integer elasticMaximum) {
            this.elasticMaximum = elasticMaximum;
            return this;
        }

        public Builder setMaximum(@Nullable Integer maximum) {
            this.maximum = maximum;
            return this;
        }

        public Builder setMinimum(@Nullable Integer minimum) {
            this.minimum = minimum;
            return this;
        }

        public Builder setScaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }

        public SkuCapacityResponse build() {
            return new SkuCapacityResponse($default, elasticMaximum, maximum, minimum, scaleType);
        }
    }
}
