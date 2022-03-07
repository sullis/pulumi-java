// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2DictionaryResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2RegexResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2StoredInfoTypeConfigResponse {
    /**
     * Description of the StoredInfoType (max 256 characters).
     * 
     */
    private final String description;
    /**
     * Store dictionary-based CustomInfoType.
     * 
     */
    private final GooglePrivacyDlpV2DictionaryResponse dictionary;
    /**
     * Display name of the StoredInfoType (max 256 characters).
     * 
     */
    private final String displayName;
    /**
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * 
     */
    private final GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse largeCustomDictionary;
    /**
     * Store regular expression-based StoredInfoType.
     * 
     */
    private final GooglePrivacyDlpV2RegexResponse regex;

    @OutputCustomType.Constructor({"description","dictionary","displayName","largeCustomDictionary","regex"})
    private GooglePrivacyDlpV2StoredInfoTypeConfigResponse(
        String description,
        GooglePrivacyDlpV2DictionaryResponse dictionary,
        String displayName,
        GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse largeCustomDictionary,
        GooglePrivacyDlpV2RegexResponse regex) {
        this.description = Objects.requireNonNull(description);
        this.dictionary = Objects.requireNonNull(dictionary);
        this.displayName = Objects.requireNonNull(displayName);
        this.largeCustomDictionary = Objects.requireNonNull(largeCustomDictionary);
        this.regex = Objects.requireNonNull(regex);
    }

    /**
     * Description of the StoredInfoType (max 256 characters).
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Store dictionary-based CustomInfoType.
     * 
    */
    public GooglePrivacyDlpV2DictionaryResponse getDictionary() {
        return this.dictionary;
    }
    /**
     * Display name of the StoredInfoType (max 256 characters).
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * 
    */
    public GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse getLargeCustomDictionary() {
        return this.largeCustomDictionary;
    }
    /**
     * Store regular expression-based StoredInfoType.
     * 
    */
    public GooglePrivacyDlpV2RegexResponse getRegex() {
        return this.regex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private GooglePrivacyDlpV2DictionaryResponse dictionary;
        private String displayName;
        private GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse largeCustomDictionary;
        private GooglePrivacyDlpV2RegexResponse regex;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StoredInfoTypeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dictionary = defaults.dictionary;
    	      this.displayName = defaults.displayName;
    	      this.largeCustomDictionary = defaults.largeCustomDictionary;
    	      this.regex = defaults.regex;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDictionary(GooglePrivacyDlpV2DictionaryResponse dictionary) {
            this.dictionary = Objects.requireNonNull(dictionary);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setLargeCustomDictionary(GooglePrivacyDlpV2LargeCustomDictionaryConfigResponse largeCustomDictionary) {
            this.largeCustomDictionary = Objects.requireNonNull(largeCustomDictionary);
            return this;
        }

        public Builder setRegex(GooglePrivacyDlpV2RegexResponse regex) {
            this.regex = Objects.requireNonNull(regex);
            return this;
        }
        public GooglePrivacyDlpV2StoredInfoTypeConfigResponse build() {
            return new GooglePrivacyDlpV2StoredInfoTypeConfigResponse(description, dictionary, displayName, largeCustomDictionary, regex);
        }
    }
}