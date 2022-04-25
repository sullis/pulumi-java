// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomRPValidationsResponse {
    /**
     * @return A link to the validation specification. The specification must be hosted on raw.githubusercontent.com.
     * 
     */
    private final String specification;
    /**
     * @return The type of validation to run against a matching request.
     * 
     */
    private final @Nullable String validationType;

    @CustomType.Constructor
    private CustomRPValidationsResponse(
        @CustomType.Parameter("specification") String specification,
        @CustomType.Parameter("validationType") @Nullable String validationType) {
        this.specification = specification;
        this.validationType = validationType;
    }

    /**
     * @return A link to the validation specification. The specification must be hosted on raw.githubusercontent.com.
     * 
     */
    public String specification() {
        return this.specification;
    }
    /**
     * @return The type of validation to run against a matching request.
     * 
     */
    public Optional<String> validationType() {
        return Optional.ofNullable(this.validationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomRPValidationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String specification;
        private @Nullable String validationType;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomRPValidationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.specification = defaults.specification;
    	      this.validationType = defaults.validationType;
        }

        public Builder specification(String specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }
        public Builder validationType(@Nullable String validationType) {
            this.validationType = validationType;
            return this;
        }        public CustomRPValidationsResponse build() {
            return new CustomRPValidationsResponse(specification, validationType);
        }
    }
}
