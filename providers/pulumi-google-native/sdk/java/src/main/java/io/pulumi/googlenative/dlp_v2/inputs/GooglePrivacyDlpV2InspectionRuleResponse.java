// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ExclusionRuleResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HotwordRuleResponse;
import java.util.Objects;


/**
 * A single inspection rule to be applied to infoTypes, specified in `InspectionRuleSet`.
 * 
 */
public final class GooglePrivacyDlpV2InspectionRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InspectionRuleResponse Empty = new GooglePrivacyDlpV2InspectionRuleResponse();

    /**
     * Exclusion rule.
     * 
     */
    @InputImport(name="exclusionRule", required=true)
      private final GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule;

    public GooglePrivacyDlpV2ExclusionRuleResponse getExclusionRule() {
        return this.exclusionRule;
    }

    /**
     * Hotword-based detection rule.
     * 
     */
    @InputImport(name="hotwordRule", required=true)
      private final GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

    public GooglePrivacyDlpV2HotwordRuleResponse getHotwordRule() {
        return this.hotwordRule;
    }

    public GooglePrivacyDlpV2InspectionRuleResponse(
        GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule,
        GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
        this.exclusionRule = Objects.requireNonNull(exclusionRule, "expected parameter 'exclusionRule' to be non-null");
        this.hotwordRule = Objects.requireNonNull(hotwordRule, "expected parameter 'hotwordRule' to be non-null");
    }

    private GooglePrivacyDlpV2InspectionRuleResponse() {
        this.exclusionRule = null;
        this.hotwordRule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InspectionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule;
        private GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InspectionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionRule = defaults.exclusionRule;
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setExclusionRule(GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule) {
            this.exclusionRule = Objects.requireNonNull(exclusionRule);
            return this;
        }

        public Builder setHotwordRule(GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
            this.hotwordRule = Objects.requireNonNull(hotwordRule);
            return this;
        }
        public GooglePrivacyDlpV2InspectionRuleResponse build() {
            return new GooglePrivacyDlpV2InspectionRuleResponse(exclusionRule, hotwordRule);
        }
    }
}