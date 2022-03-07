// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ExclusionRuleResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2HotwordRuleResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2InspectionRuleResponse {
    /**
     * Exclusion rule.
     * 
     */
    private final GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule;
    /**
     * Hotword-based detection rule.
     * 
     */
    private final GooglePrivacyDlpV2HotwordRuleResponse hotwordRule;

    @OutputCustomType.Constructor({"exclusionRule","hotwordRule"})
    private GooglePrivacyDlpV2InspectionRuleResponse(
        GooglePrivacyDlpV2ExclusionRuleResponse exclusionRule,
        GooglePrivacyDlpV2HotwordRuleResponse hotwordRule) {
        this.exclusionRule = Objects.requireNonNull(exclusionRule);
        this.hotwordRule = Objects.requireNonNull(hotwordRule);
    }

    /**
     * Exclusion rule.
     * 
    */
    public GooglePrivacyDlpV2ExclusionRuleResponse getExclusionRule() {
        return this.exclusionRule;
    }
    /**
     * Hotword-based detection rule.
     * 
    */
    public GooglePrivacyDlpV2HotwordRuleResponse getHotwordRule() {
        return this.hotwordRule;
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