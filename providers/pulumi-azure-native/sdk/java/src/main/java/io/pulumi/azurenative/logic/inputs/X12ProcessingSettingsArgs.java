// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The X12 processing settings.
 * 
 */
public final class X12ProcessingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12ProcessingSettingsArgs Empty = new X12ProcessingSettingsArgs();

    /**
     * The value indicating whether to convert numerical type to implied decimal.
     * 
     */
    @Import(name="convertImpliedDecimal", required=true)
      private final Output<Boolean> convertImpliedDecimal;

    public Output<Boolean> getConvertImpliedDecimal() {
        return this.convertImpliedDecimal;
    }

    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    @Import(name="createEmptyXmlTagsForTrailingSeparators", required=true)
      private final Output<Boolean> createEmptyXmlTagsForTrailingSeparators;

    public Output<Boolean> getCreateEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * The value indicating whether to mask security information.
     * 
     */
    @Import(name="maskSecurityInfo", required=true)
      private final Output<Boolean> maskSecurityInfo;

    public Output<Boolean> getMaskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * The value indicating whether to preserve interchange.
     * 
     */
    @Import(name="preserveInterchange", required=true)
      private final Output<Boolean> preserveInterchange;

    public Output<Boolean> getPreserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * The value indicating whether to suspend interchange on error.
     * 
     */
    @Import(name="suspendInterchangeOnError", required=true)
      private final Output<Boolean> suspendInterchangeOnError;

    public Output<Boolean> getSuspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * The value indicating whether to use dot as decimal separator.
     * 
     */
    @Import(name="useDotAsDecimalSeparator", required=true)
      private final Output<Boolean> useDotAsDecimalSeparator;

    public Output<Boolean> getUseDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    public X12ProcessingSettingsArgs(
        Output<Boolean> convertImpliedDecimal,
        Output<Boolean> createEmptyXmlTagsForTrailingSeparators,
        Output<Boolean> maskSecurityInfo,
        Output<Boolean> preserveInterchange,
        Output<Boolean> suspendInterchangeOnError,
        Output<Boolean> useDotAsDecimalSeparator) {
        this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal, "expected parameter 'convertImpliedDecimal' to be non-null");
        this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators, "expected parameter 'createEmptyXmlTagsForTrailingSeparators' to be non-null");
        this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo, "expected parameter 'maskSecurityInfo' to be non-null");
        this.preserveInterchange = Objects.requireNonNull(preserveInterchange, "expected parameter 'preserveInterchange' to be non-null");
        this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError, "expected parameter 'suspendInterchangeOnError' to be non-null");
        this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator, "expected parameter 'useDotAsDecimalSeparator' to be non-null");
    }

    private X12ProcessingSettingsArgs() {
        this.convertImpliedDecimal = Output.empty();
        this.createEmptyXmlTagsForTrailingSeparators = Output.empty();
        this.maskSecurityInfo = Output.empty();
        this.preserveInterchange = Output.empty();
        this.suspendInterchangeOnError = Output.empty();
        this.useDotAsDecimalSeparator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ProcessingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> convertImpliedDecimal;
        private Output<Boolean> createEmptyXmlTagsForTrailingSeparators;
        private Output<Boolean> maskSecurityInfo;
        private Output<Boolean> preserveInterchange;
        private Output<Boolean> suspendInterchangeOnError;
        private Output<Boolean> useDotAsDecimalSeparator;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ProcessingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convertImpliedDecimal = defaults.convertImpliedDecimal;
    	      this.createEmptyXmlTagsForTrailingSeparators = defaults.createEmptyXmlTagsForTrailingSeparators;
    	      this.maskSecurityInfo = defaults.maskSecurityInfo;
    	      this.preserveInterchange = defaults.preserveInterchange;
    	      this.suspendInterchangeOnError = defaults.suspendInterchangeOnError;
    	      this.useDotAsDecimalSeparator = defaults.useDotAsDecimalSeparator;
        }

        public Builder convertImpliedDecimal(Output<Boolean> convertImpliedDecimal) {
            this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal);
            return this;
        }
        public Builder convertImpliedDecimal(Boolean convertImpliedDecimal) {
            this.convertImpliedDecimal = Output.of(Objects.requireNonNull(convertImpliedDecimal));
            return this;
        }
        public Builder createEmptyXmlTagsForTrailingSeparators(Output<Boolean> createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators);
            return this;
        }
        public Builder createEmptyXmlTagsForTrailingSeparators(Boolean createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Output.of(Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators));
            return this;
        }
        public Builder maskSecurityInfo(Output<Boolean> maskSecurityInfo) {
            this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo);
            return this;
        }
        public Builder maskSecurityInfo(Boolean maskSecurityInfo) {
            this.maskSecurityInfo = Output.of(Objects.requireNonNull(maskSecurityInfo));
            return this;
        }
        public Builder preserveInterchange(Output<Boolean> preserveInterchange) {
            this.preserveInterchange = Objects.requireNonNull(preserveInterchange);
            return this;
        }
        public Builder preserveInterchange(Boolean preserveInterchange) {
            this.preserveInterchange = Output.of(Objects.requireNonNull(preserveInterchange));
            return this;
        }
        public Builder suspendInterchangeOnError(Output<Boolean> suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError);
            return this;
        }
        public Builder suspendInterchangeOnError(Boolean suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Output.of(Objects.requireNonNull(suspendInterchangeOnError));
            return this;
        }
        public Builder useDotAsDecimalSeparator(Output<Boolean> useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator);
            return this;
        }
        public Builder useDotAsDecimalSeparator(Boolean useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Output.of(Objects.requireNonNull(useDotAsDecimalSeparator));
            return this;
        }        public X12ProcessingSettingsArgs build() {
            return new X12ProcessingSettingsArgs(convertImpliedDecimal, createEmptyXmlTagsForTrailingSeparators, maskSecurityInfo, preserveInterchange, suspendInterchangeOnError, useDotAsDecimalSeparator);
        }
    }
}
