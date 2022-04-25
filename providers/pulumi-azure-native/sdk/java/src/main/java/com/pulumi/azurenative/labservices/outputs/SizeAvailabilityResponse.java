// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SizeAvailabilityResponse {
    /**
     * @return Whether or not this size category is available
     * 
     */
    private final @Nullable Boolean isAvailable;
    /**
     * @return The category of the size (Basic, Standard, Performance).
     * 
     */
    private final @Nullable String sizeCategory;

    @CustomType.Constructor
    private SizeAvailabilityResponse(
        @CustomType.Parameter("isAvailable") @Nullable Boolean isAvailable,
        @CustomType.Parameter("sizeCategory") @Nullable String sizeCategory) {
        this.isAvailable = isAvailable;
        this.sizeCategory = sizeCategory;
    }

    /**
     * @return Whether or not this size category is available
     * 
     */
    public Optional<Boolean> isAvailable() {
        return Optional.ofNullable(this.isAvailable);
    }
    /**
     * @return The category of the size (Basic, Standard, Performance).
     * 
     */
    public Optional<String> sizeCategory() {
        return Optional.ofNullable(this.sizeCategory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SizeAvailabilityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isAvailable;
        private @Nullable String sizeCategory;

        public Builder() {
    	      // Empty
        }

        public Builder(SizeAvailabilityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isAvailable = defaults.isAvailable;
    	      this.sizeCategory = defaults.sizeCategory;
        }

        public Builder isAvailable(@Nullable Boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }
        public Builder sizeCategory(@Nullable String sizeCategory) {
            this.sizeCategory = sizeCategory;
            return this;
        }        public SizeAvailabilityResponse build() {
            return new SizeAvailabilityResponse(isAvailable, sizeCategory);
        }
    }
}
