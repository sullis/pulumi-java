// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * The Edifact validation override settings.
 * 
 */
public final class EdifactValidationOverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdifactValidationOverrideArgs Empty = new EdifactValidationOverrideArgs();

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    @InputImport(name="allowLeadingAndTrailingSpacesAndZeroes", required=true)
    private final Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes;

    public Input<Boolean> getAllowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate character Set.
     * 
     */
    @InputImport(name="enforceCharacterSet", required=true)
    private final Input<Boolean> enforceCharacterSet;

    public Input<Boolean> getEnforceCharacterSet() {
        return this.enforceCharacterSet;
    }

    /**
     * The message id on which the validation settings has to be applied.
     * 
     */
    @InputImport(name="messageId", required=true)
    private final Input<String> messageId;

    public Input<String> getMessageId() {
        return this.messageId;
    }

    /**
     * The trailing separator policy.
     * 
     */
    @InputImport(name="trailingSeparatorPolicy", required=true)
    private final Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;

    public Input<Either<String,TrailingSeparatorPolicy>> getTrailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    @InputImport(name="trimLeadingAndTrailingSpacesAndZeroes", required=true)
    private final Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes;

    public Input<Boolean> getTrimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate EDI types.
     * 
     */
    @InputImport(name="validateEDITypes", required=true)
    private final Input<Boolean> validateEDITypes;

    public Input<Boolean> getValidateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to validate XSD types.
     * 
     */
    @InputImport(name="validateXSDTypes", required=true)
    private final Input<Boolean> validateXSDTypes;

    public Input<Boolean> getValidateXSDTypes() {
        return this.validateXSDTypes;
    }

    public EdifactValidationOverrideArgs(
        Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes,
        Input<Boolean> enforceCharacterSet,
        Input<String> messageId,
        Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy,
        Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes,
        Input<Boolean> validateEDITypes,
        Input<Boolean> validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.enforceCharacterSet = Objects.requireNonNull(enforceCharacterSet, "expected parameter 'enforceCharacterSet' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
        this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.validateEDITypes = Objects.requireNonNull(validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
        this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
    }

    private EdifactValidationOverrideArgs() {
        this.allowLeadingAndTrailingSpacesAndZeroes = Input.empty();
        this.enforceCharacterSet = Input.empty();
        this.messageId = Input.empty();
        this.trailingSeparatorPolicy = Input.empty();
        this.trimLeadingAndTrailingSpacesAndZeroes = Input.empty();
        this.validateEDITypes = Input.empty();
        this.validateXSDTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdifactValidationOverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes;
        private Input<Boolean> enforceCharacterSet;
        private Input<String> messageId;
        private Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;
        private Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes;
        private Input<Boolean> validateEDITypes;
        private Input<Boolean> validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(EdifactValidationOverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.enforceCharacterSet = defaults.enforceCharacterSet;
    	      this.messageId = defaults.messageId;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateEDITypes = defaults.validateEDITypes;
    	      this.validateXSDTypes = defaults.validateXSDTypes;
        }

        public Builder setAllowLeadingAndTrailingSpacesAndZeroes(Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setAllowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            this.allowLeadingAndTrailingSpacesAndZeroes = Input.of(Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes));
            return this;
        }

        public Builder setEnforceCharacterSet(Input<Boolean> enforceCharacterSet) {
            this.enforceCharacterSet = Objects.requireNonNull(enforceCharacterSet);
            return this;
        }

        public Builder setEnforceCharacterSet(Boolean enforceCharacterSet) {
            this.enforceCharacterSet = Input.of(Objects.requireNonNull(enforceCharacterSet));
            return this;
        }

        public Builder setMessageId(Input<String> messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Input.of(Objects.requireNonNull(messageId));
            return this;
        }

        public Builder setTrailingSeparatorPolicy(Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy);
            return this;
        }

        public Builder setTrailingSeparatorPolicy(Either<String,TrailingSeparatorPolicy> trailingSeparatorPolicy) {
            this.trailingSeparatorPolicy = Input.of(Objects.requireNonNull(trailingSeparatorPolicy));
            return this;
        }

        public Builder setTrimLeadingAndTrailingSpacesAndZeroes(Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes);
            return this;
        }

        public Builder setTrimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            this.trimLeadingAndTrailingSpacesAndZeroes = Input.of(Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes));
            return this;
        }

        public Builder setValidateEDITypes(Input<Boolean> validateEDITypes) {
            this.validateEDITypes = Objects.requireNonNull(validateEDITypes);
            return this;
        }

        public Builder setValidateEDITypes(Boolean validateEDITypes) {
            this.validateEDITypes = Input.of(Objects.requireNonNull(validateEDITypes));
            return this;
        }

        public Builder setValidateXSDTypes(Input<Boolean> validateXSDTypes) {
            this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes);
            return this;
        }

        public Builder setValidateXSDTypes(Boolean validateXSDTypes) {
            this.validateXSDTypes = Input.of(Objects.requireNonNull(validateXSDTypes));
            return this;
        }

        public EdifactValidationOverrideArgs build() {
            return new EdifactValidationOverrideArgs(allowLeadingAndTrailingSpacesAndZeroes, enforceCharacterSet, messageId, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateEDITypes, validateXSDTypes);
        }
    }
}
