// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 agreement validation settings.
 * 
 */
public final class X12ValidationSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12ValidationSettingsArgs Empty = new X12ValidationSettingsArgs();

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
     * The value indicating whether to check for duplicate group control number.
     * 
     */
    @InputImport(name="checkDuplicateGroupControlNumber", required=true)
    private final Input<Boolean> checkDuplicateGroupControlNumber;

    public Input<Boolean> getCheckDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
     */
    @InputImport(name="checkDuplicateInterchangeControlNumber", required=true)
    private final Input<Boolean> checkDuplicateInterchangeControlNumber;

    public Input<Boolean> getCheckDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
     */
    @InputImport(name="checkDuplicateTransactionSetControlNumber", required=true)
    private final Input<Boolean> checkDuplicateTransactionSetControlNumber;

    public Input<Boolean> getCheckDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }

    /**
     * The validity period of interchange control number.
     * 
     */
    @InputImport(name="interchangeControlNumberValidityDays", required=true)
    private final Input<Integer> interchangeControlNumberValidityDays;

    public Input<Integer> getInterchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
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
     * The value indicating whether to validate character set in the message.
     * 
     */
    @InputImport(name="validateCharacterSet", required=true)
    private final Input<Boolean> validateCharacterSet;

    public Input<Boolean> getValidateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
     */
    @InputImport(name="validateEDITypes", required=true)
    private final Input<Boolean> validateEDITypes;

    public Input<Boolean> getValidateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
     */
    @InputImport(name="validateXSDTypes", required=true)
    private final Input<Boolean> validateXSDTypes;

    public Input<Boolean> getValidateXSDTypes() {
        return this.validateXSDTypes;
    }

    public X12ValidationSettingsArgs(
        Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes,
        Input<Boolean> checkDuplicateGroupControlNumber,
        Input<Boolean> checkDuplicateInterchangeControlNumber,
        Input<Boolean> checkDuplicateTransactionSetControlNumber,
        Input<Integer> interchangeControlNumberValidityDays,
        Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy,
        Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes,
        Input<Boolean> validateCharacterSet,
        Input<Boolean> validateEDITypes,
        Input<Boolean> validateXSDTypes) {
        this.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber, "expected parameter 'checkDuplicateGroupControlNumber' to be non-null");
        this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber, "expected parameter 'checkDuplicateInterchangeControlNumber' to be non-null");
        this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber, "expected parameter 'checkDuplicateTransactionSetControlNumber' to be non-null");
        this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays, "expected parameter 'interchangeControlNumberValidityDays' to be non-null");
        this.trailingSeparatorPolicy = Objects.requireNonNull(trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
        this.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull(trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
        this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet, "expected parameter 'validateCharacterSet' to be non-null");
        this.validateEDITypes = Objects.requireNonNull(validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
        this.validateXSDTypes = Objects.requireNonNull(validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
    }

    private X12ValidationSettingsArgs() {
        this.allowLeadingAndTrailingSpacesAndZeroes = Input.empty();
        this.checkDuplicateGroupControlNumber = Input.empty();
        this.checkDuplicateInterchangeControlNumber = Input.empty();
        this.checkDuplicateTransactionSetControlNumber = Input.empty();
        this.interchangeControlNumberValidityDays = Input.empty();
        this.trailingSeparatorPolicy = Input.empty();
        this.trimLeadingAndTrailingSpacesAndZeroes = Input.empty();
        this.validateCharacterSet = Input.empty();
        this.validateEDITypes = Input.empty();
        this.validateXSDTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ValidationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> allowLeadingAndTrailingSpacesAndZeroes;
        private Input<Boolean> checkDuplicateGroupControlNumber;
        private Input<Boolean> checkDuplicateInterchangeControlNumber;
        private Input<Boolean> checkDuplicateTransactionSetControlNumber;
        private Input<Integer> interchangeControlNumberValidityDays;
        private Input<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;
        private Input<Boolean> trimLeadingAndTrailingSpacesAndZeroes;
        private Input<Boolean> validateCharacterSet;
        private Input<Boolean> validateEDITypes;
        private Input<Boolean> validateXSDTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ValidationSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLeadingAndTrailingSpacesAndZeroes = defaults.allowLeadingAndTrailingSpacesAndZeroes;
    	      this.checkDuplicateGroupControlNumber = defaults.checkDuplicateGroupControlNumber;
    	      this.checkDuplicateInterchangeControlNumber = defaults.checkDuplicateInterchangeControlNumber;
    	      this.checkDuplicateTransactionSetControlNumber = defaults.checkDuplicateTransactionSetControlNumber;
    	      this.interchangeControlNumberValidityDays = defaults.interchangeControlNumberValidityDays;
    	      this.trailingSeparatorPolicy = defaults.trailingSeparatorPolicy;
    	      this.trimLeadingAndTrailingSpacesAndZeroes = defaults.trimLeadingAndTrailingSpacesAndZeroes;
    	      this.validateCharacterSet = defaults.validateCharacterSet;
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

        public Builder setCheckDuplicateGroupControlNumber(Input<Boolean> checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Objects.requireNonNull(checkDuplicateGroupControlNumber);
            return this;
        }

        public Builder setCheckDuplicateGroupControlNumber(Boolean checkDuplicateGroupControlNumber) {
            this.checkDuplicateGroupControlNumber = Input.of(Objects.requireNonNull(checkDuplicateGroupControlNumber));
            return this;
        }

        public Builder setCheckDuplicateInterchangeControlNumber(Input<Boolean> checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Objects.requireNonNull(checkDuplicateInterchangeControlNumber);
            return this;
        }

        public Builder setCheckDuplicateInterchangeControlNumber(Boolean checkDuplicateInterchangeControlNumber) {
            this.checkDuplicateInterchangeControlNumber = Input.of(Objects.requireNonNull(checkDuplicateInterchangeControlNumber));
            return this;
        }

        public Builder setCheckDuplicateTransactionSetControlNumber(Input<Boolean> checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull(checkDuplicateTransactionSetControlNumber);
            return this;
        }

        public Builder setCheckDuplicateTransactionSetControlNumber(Boolean checkDuplicateTransactionSetControlNumber) {
            this.checkDuplicateTransactionSetControlNumber = Input.of(Objects.requireNonNull(checkDuplicateTransactionSetControlNumber));
            return this;
        }

        public Builder setInterchangeControlNumberValidityDays(Input<Integer> interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Objects.requireNonNull(interchangeControlNumberValidityDays);
            return this;
        }

        public Builder setInterchangeControlNumberValidityDays(Integer interchangeControlNumberValidityDays) {
            this.interchangeControlNumberValidityDays = Input.of(Objects.requireNonNull(interchangeControlNumberValidityDays));
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

        public Builder setValidateCharacterSet(Input<Boolean> validateCharacterSet) {
            this.validateCharacterSet = Objects.requireNonNull(validateCharacterSet);
            return this;
        }

        public Builder setValidateCharacterSet(Boolean validateCharacterSet) {
            this.validateCharacterSet = Input.of(Objects.requireNonNull(validateCharacterSet));
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

        public X12ValidationSettingsArgs build() {
            return new X12ValidationSettingsArgs(allowLeadingAndTrailingSpacesAndZeroes, checkDuplicateGroupControlNumber, checkDuplicateInterchangeControlNumber, checkDuplicateTransactionSetControlNumber, interchangeControlNumberValidityDays, trailingSeparatorPolicy, trimLeadingAndTrailingSpacesAndZeroes, validateCharacterSet, validateEDITypes, validateXSDTypes);
        }
    }
}
