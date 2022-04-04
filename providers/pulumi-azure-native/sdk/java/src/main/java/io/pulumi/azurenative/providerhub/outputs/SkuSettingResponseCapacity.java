// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuSettingResponseCapacity {
    private final @Nullable Integer default_;
    private final @Nullable Integer maximum;
    private final Integer minimum;
    private final @Nullable String scaleType;

    @CustomType.Constructor
    private SkuSettingResponseCapacity(
        @CustomType.Parameter("default") @Nullable Integer default_,
        @CustomType.Parameter("maximum") @Nullable Integer maximum,
        @CustomType.Parameter("minimum") Integer minimum,
        @CustomType.Parameter("scaleType") @Nullable String scaleType) {
        this.default_ = default_;
        this.maximum = maximum;
        this.minimum = minimum;
        this.scaleType = scaleType;
    }

    public Optional<Integer> getDefault_() {
        return Optional.ofNullable(this.default_);
    }
    public Optional<Integer> getMaximum() {
        return Optional.ofNullable(this.maximum);
    }
    public Integer getMinimum() {
        return this.minimum;
    }
    public Optional<String> getScaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuSettingResponseCapacity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer default_;
        private @Nullable Integer maximum;
        private Integer minimum;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuSettingResponseCapacity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder default_(@Nullable Integer default_) {
            this.default_ = default_;
            return this;
        }
        public Builder maximum(@Nullable Integer maximum) {
            this.maximum = maximum;
            return this;
        }
        public Builder minimum(Integer minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public Builder scaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }        public SkuSettingResponseCapacity build() {
            return new SkuSettingResponseCapacity(default_, maximum, minimum, scaleType);
        }
    }
}
