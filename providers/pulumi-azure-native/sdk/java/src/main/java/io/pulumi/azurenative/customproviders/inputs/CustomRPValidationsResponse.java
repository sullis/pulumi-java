// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customproviders.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A validation to apply on custom resource provider requests.
 * 
 */
public final class CustomRPValidationsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomRPValidationsResponse Empty = new CustomRPValidationsResponse();

    /**
     * A link to the validation specification. The specification must be hosted on raw.githubusercontent.com.
     * 
     */
    @InputImport(name="specification", required=true)
    private final String specification;

    public String getSpecification() {
        return this.specification;
    }

    /**
     * The type of validation to run against a matching request.
     * 
     */
    @InputImport(name="validationType")
    private final @Nullable String validationType;

    public Optional<String> getValidationType() {
        return this.validationType == null ? Optional.empty() : Optional.ofNullable(this.validationType);
    }

    public CustomRPValidationsResponse(
        String specification,
        @Nullable String validationType) {
        this.specification = Objects.requireNonNull(specification, "expected parameter 'specification' to be non-null");
        this.validationType = validationType;
    }

    private CustomRPValidationsResponse() {
        this.specification = null;
        this.validationType = null;
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

        public Builder setSpecification(String specification) {
            this.specification = Objects.requireNonNull(specification);
            return this;
        }

        public Builder setValidationType(@Nullable String validationType) {
            this.validationType = validationType;
            return this;
        }

        public CustomRPValidationsResponse build() {
            return new CustomRPValidationsResponse(specification, validationType);
        }
    }
}
