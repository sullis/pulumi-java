// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StoredInfoTypeConfigResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2StoredInfoTypeStatsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2StoredInfoTypeVersionResponse {
    /**
     * StoredInfoType configuration.
     * 
     */
    private final GooglePrivacyDlpV2StoredInfoTypeConfigResponse config;
    /**
     * Create timestamp of the version. Read-only, determined by the system when the version is created.
     * 
     */
    private final String createTime;
    /**
     * Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user's Google Cloud Storage bucket, and if this data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
     * 
     */
    private final List<GooglePrivacyDlpV2ErrorResponse> errors;
    /**
     * Stored info type version state. Read-only, updated by the system during dictionary creation.
     * 
     */
    private final String state;
    /**
     * Statistics about this storedInfoType version.
     * 
     */
    private final GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats;

    @OutputCustomType.Constructor({"config","createTime","errors","state","stats"})
    private GooglePrivacyDlpV2StoredInfoTypeVersionResponse(
        GooglePrivacyDlpV2StoredInfoTypeConfigResponse config,
        String createTime,
        List<GooglePrivacyDlpV2ErrorResponse> errors,
        String state,
        GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats) {
        this.config = Objects.requireNonNull(config);
        this.createTime = Objects.requireNonNull(createTime);
        this.errors = Objects.requireNonNull(errors);
        this.state = Objects.requireNonNull(state);
        this.stats = Objects.requireNonNull(stats);
    }

    /**
     * StoredInfoType configuration.
     * 
    */
    public GooglePrivacyDlpV2StoredInfoTypeConfigResponse getConfig() {
        return this.config;
    }
    /**
     * Create timestamp of the version. Read-only, determined by the system when the version is created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Errors that occurred when creating this storedInfoType version, or anomalies detected in the storedInfoType data that render it unusable. Only the five most recent errors will be displayed, with the most recent error appearing first. For example, some of the data for stored custom dictionaries is put in the user's Google Cloud Storage bucket, and if this data is modified or deleted by the user or another system, the dictionary becomes invalid. If any errors occur, fix the problem indicated by the error message and use the UpdateStoredInfoType API method to create another version of the storedInfoType to continue using it, reusing the same `config` if it was not the source of the error.
     * 
    */
    public List<GooglePrivacyDlpV2ErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * Stored info type version state. Read-only, updated by the system during dictionary creation.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * Statistics about this storedInfoType version.
     * 
    */
    public GooglePrivacyDlpV2StoredInfoTypeStatsResponse getStats() {
        return this.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2StoredInfoTypeConfigResponse config;
        private String createTime;
        private List<GooglePrivacyDlpV2ErrorResponse> errors;
        private String state;
        private GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StoredInfoTypeVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.errors = defaults.errors;
    	      this.state = defaults.state;
    	      this.stats = defaults.stats;
        }

        public Builder setConfig(GooglePrivacyDlpV2StoredInfoTypeConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setErrors(List<GooglePrivacyDlpV2ErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStats(GooglePrivacyDlpV2StoredInfoTypeStatsResponse stats) {
            this.stats = Objects.requireNonNull(stats);
            return this;
        }
        public GooglePrivacyDlpV2StoredInfoTypeVersionResponse build() {
            return new GooglePrivacyDlpV2StoredInfoTypeVersionResponse(config, createTime, errors, state, stats);
        }
    }
}