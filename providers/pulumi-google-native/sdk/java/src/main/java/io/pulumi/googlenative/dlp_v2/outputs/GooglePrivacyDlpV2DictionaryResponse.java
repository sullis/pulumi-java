// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2CloudStoragePathResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2WordListResponse;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2DictionaryResponse {
    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
     */
    private final GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;
    /**
     * List of words or phrases to search for.
     * 
     */
    private final GooglePrivacyDlpV2WordListResponse wordList;

    @OutputCustomType.Constructor({"cloudStoragePath","wordList"})
    private GooglePrivacyDlpV2DictionaryResponse(
        GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath,
        GooglePrivacyDlpV2WordListResponse wordList) {
        this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath);
        this.wordList = Objects.requireNonNull(wordList);
    }

    /**
     * Newline-delimited file of words in Cloud Storage. Only a single file is accepted.
     * 
    */
    public GooglePrivacyDlpV2CloudStoragePathResponse getCloudStoragePath() {
        return this.cloudStoragePath;
    }
    /**
     * List of words or phrases to search for.
     * 
    */
    public GooglePrivacyDlpV2WordListResponse getWordList() {
        return this.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath;
        private GooglePrivacyDlpV2WordListResponse wordList;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DictionaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudStoragePath = defaults.cloudStoragePath;
    	      this.wordList = defaults.wordList;
        }

        public Builder setCloudStoragePath(GooglePrivacyDlpV2CloudStoragePathResponse cloudStoragePath) {
            this.cloudStoragePath = Objects.requireNonNull(cloudStoragePath);
            return this;
        }

        public Builder setWordList(GooglePrivacyDlpV2WordListResponse wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }
        public GooglePrivacyDlpV2DictionaryResponse build() {
            return new GooglePrivacyDlpV2DictionaryResponse(cloudStoragePath, wordList);
        }
    }
}