// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2ReplaceDictionaryConfigResponse {
    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    private final GooglePrivacyDlpV2WordListResponse wordList;

    @CustomType.Constructor
    private GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(@CustomType.Parameter("wordList") GooglePrivacyDlpV2WordListResponse wordList) {
        this.wordList = wordList;
    }

    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * 
     */
    public GooglePrivacyDlpV2WordListResponse wordList() {
        return this.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2WordListResponse wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceDictionaryConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wordList = defaults.wordList;
        }

        public Builder wordList(GooglePrivacyDlpV2WordListResponse wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }        public GooglePrivacyDlpV2ReplaceDictionaryConfigResponse build() {
            return new GooglePrivacyDlpV2ReplaceDictionaryConfigResponse(wordList);
        }
    }
}
