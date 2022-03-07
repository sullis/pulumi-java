// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DictionaryResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ExcludeInfoTypesResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RegexResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2ExclusionRuleResponse {
    /**
     * Dictionary which defines the rule.
     * 
     */
    private final GooglePrivacyDlpV2DictionaryResponse dictionary;
    /**
     * Set of infoTypes for which findings would affect this rule.
     * 
     */
    private final GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes;
    /**
     * How the rule is applied, see MatchingType documentation for details.
     * 
     */
    private final String matchingType;
    /**
     * Regular expression which defines the rule.
     * 
     */
    private final GooglePrivacyDlpV2RegexResponse regex;

    @OutputCustomType.Constructor({"dictionary","excludeInfoTypes","matchingType","regex"})
    private GooglePrivacyDlpV2ExclusionRuleResponse(
        GooglePrivacyDlpV2DictionaryResponse dictionary,
        GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes,
        String matchingType,
        GooglePrivacyDlpV2RegexResponse regex) {
        this.dictionary = Objects.requireNonNull(dictionary);
        this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes);
        this.matchingType = Objects.requireNonNull(matchingType);
        this.regex = Objects.requireNonNull(regex);
    }

    /**
     * Dictionary which defines the rule.
     * 
    */
    public GooglePrivacyDlpV2DictionaryResponse getDictionary() {
        return this.dictionary;
    }
    /**
     * Set of infoTypes for which findings would affect this rule.
     * 
    */
    public GooglePrivacyDlpV2ExcludeInfoTypesResponse getExcludeInfoTypes() {
        return this.excludeInfoTypes;
    }
    /**
     * How the rule is applied, see MatchingType documentation for details.
     * 
    */
    public String getMatchingType() {
        return this.matchingType;
    }
    /**
     * Regular expression which defines the rule.
     * 
    */
    public GooglePrivacyDlpV2RegexResponse getRegex() {
        return this.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExclusionRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2DictionaryResponse dictionary;
        private GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes;
        private String matchingType;
        private GooglePrivacyDlpV2RegexResponse regex;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExclusionRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionary = defaults.dictionary;
    	      this.excludeInfoTypes = defaults.excludeInfoTypes;
    	      this.matchingType = defaults.matchingType;
    	      this.regex = defaults.regex;
        }

        public Builder setDictionary(GooglePrivacyDlpV2DictionaryResponse dictionary) {
            this.dictionary = Objects.requireNonNull(dictionary);
            return this;
        }

        public Builder setExcludeInfoTypes(GooglePrivacyDlpV2ExcludeInfoTypesResponse excludeInfoTypes) {
            this.excludeInfoTypes = Objects.requireNonNull(excludeInfoTypes);
            return this;
        }

        public Builder setMatchingType(String matchingType) {
            this.matchingType = Objects.requireNonNull(matchingType);
            return this;
        }

        public Builder setRegex(GooglePrivacyDlpV2RegexResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        public GooglePrivacyDlpV2ExclusionRuleResponse build() {
            return new GooglePrivacyDlpV2ExclusionRuleResponse(dictionary, excludeInfoTypes, matchingType, regex);
        }
    }
}