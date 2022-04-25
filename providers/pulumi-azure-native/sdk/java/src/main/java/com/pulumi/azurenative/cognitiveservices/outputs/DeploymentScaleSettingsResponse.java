// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentScaleSettingsResponse {
    /**
     * @return Deployment capacity.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * @return Deployment scale type.
     * 
     */
    private final @Nullable String scaleType;

    @CustomType.Constructor
    private DeploymentScaleSettingsResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("scaleType") @Nullable String scaleType) {
        this.capacity = capacity;
        this.scaleType = scaleType;
    }

    /**
     * @return Deployment capacity.
     * 
     */
    public Optional<Integer> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return Deployment scale type.
     * 
     */
    public Optional<String> scaleType() {
        return Optional.ofNullable(this.scaleType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder scaleType(@Nullable String scaleType) {
            this.scaleType = scaleType;
            return this;
        }        public DeploymentScaleSettingsResponse build() {
            return new DeploymentScaleSettingsResponse(capacity, scaleType);
        }
    }
}
