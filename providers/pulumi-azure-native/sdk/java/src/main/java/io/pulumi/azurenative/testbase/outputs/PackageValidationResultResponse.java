// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class PackageValidationResultResponse {
    /**
     * Error information.
     * 
     */
    private final List<String> errors;
    /**
     * Indicates whether the package passed the validation.
     * 
     */
    private final Boolean isValid;
    /**
     * Validation name.
     * 
     */
    private final String validationName;

    @OutputCustomType.Constructor({"errors","isValid","validationName"})
    private PackageValidationResultResponse(
        List<String> errors,
        Boolean isValid,
        String validationName) {
        this.errors = Objects.requireNonNull(errors);
        this.isValid = Objects.requireNonNull(isValid);
        this.validationName = Objects.requireNonNull(validationName);
    }

    /**
     * Error information.
     * 
     */
    public List<String> getErrors() {
        return this.errors;
    }
    /**
     * Indicates whether the package passed the validation.
     * 
     */
    public Boolean getIsValid() {
        return this.isValid;
    }
    /**
     * Validation name.
     * 
     */
    public String getValidationName() {
        return this.validationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageValidationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> errors;
        private Boolean isValid;
        private String validationName;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageValidationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.isValid = defaults.isValid;
    	      this.validationName = defaults.validationName;
        }

        public Builder setErrors(List<String> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setIsValid(Boolean isValid) {
            this.isValid = Objects.requireNonNull(isValid);
            return this;
        }

        public Builder setValidationName(String validationName) {
            this.validationName = Objects.requireNonNull(validationName);
            return this;
        }

        public PackageValidationResultResponse build() {
            return new PackageValidationResultResponse(errors, isValid, validationName);
        }
    }
}
