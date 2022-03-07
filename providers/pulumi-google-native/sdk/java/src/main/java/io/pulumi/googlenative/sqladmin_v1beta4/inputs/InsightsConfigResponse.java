// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1beta4.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Insights configuration. This specifies when Cloud SQL Insights feature is enabled and optional configuration.
 * 
 */
public final class InsightsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final InsightsConfigResponse Empty = new InsightsConfigResponse();

    /**
     * Whether Query Insights feature is enabled.
     * 
     */
    @InputImport(name="queryInsightsEnabled", required=true)
      private final Boolean queryInsightsEnabled;

    public Boolean getQueryInsightsEnabled() {
        return this.queryInsightsEnabled;
    }

    /**
     * Number of query execution plans captured by Insights per minute for all queries combined. Default is 5.
     * 
     */
    @InputImport(name="queryPlansPerMinute", required=true)
      private final Integer queryPlansPerMinute;

    public Integer getQueryPlansPerMinute() {
        return this.queryPlansPerMinute;
    }

    /**
     * Maximum query length stored in bytes. Default value: 1024 bytes. Range: 256-4500 bytes. Query length more than this field value will be truncated to this value. When unset, query length will be the default value. Changing query length will restart the database.
     * 
     */
    @InputImport(name="queryStringLength", required=true)
      private final Integer queryStringLength;

    public Integer getQueryStringLength() {
        return this.queryStringLength;
    }

    /**
     * Whether Query Insights will record application tags from query when enabled.
     * 
     */
    @InputImport(name="recordApplicationTags", required=true)
      private final Boolean recordApplicationTags;

    public Boolean getRecordApplicationTags() {
        return this.recordApplicationTags;
    }

    /**
     * Whether Query Insights will record client address when enabled.
     * 
     */
    @InputImport(name="recordClientAddress", required=true)
      private final Boolean recordClientAddress;

    public Boolean getRecordClientAddress() {
        return this.recordClientAddress;
    }

    public InsightsConfigResponse(
        Boolean queryInsightsEnabled,
        Integer queryPlansPerMinute,
        Integer queryStringLength,
        Boolean recordApplicationTags,
        Boolean recordClientAddress) {
        this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled, "expected parameter 'queryInsightsEnabled' to be non-null");
        this.queryPlansPerMinute = Objects.requireNonNull(queryPlansPerMinute, "expected parameter 'queryPlansPerMinute' to be non-null");
        this.queryStringLength = Objects.requireNonNull(queryStringLength, "expected parameter 'queryStringLength' to be non-null");
        this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags, "expected parameter 'recordApplicationTags' to be non-null");
        this.recordClientAddress = Objects.requireNonNull(recordClientAddress, "expected parameter 'recordClientAddress' to be non-null");
    }

    private InsightsConfigResponse() {
        this.queryInsightsEnabled = null;
        this.queryPlansPerMinute = null;
        this.queryStringLength = null;
        this.recordApplicationTags = null;
        this.recordClientAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean queryInsightsEnabled;
        private Integer queryPlansPerMinute;
        private Integer queryStringLength;
        private Boolean recordApplicationTags;
        private Boolean recordClientAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryPlansPerMinute = defaults.queryPlansPerMinute;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        public Builder setQueryInsightsEnabled(Boolean queryInsightsEnabled) {
            this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled);
            return this;
        }

        public Builder setQueryPlansPerMinute(Integer queryPlansPerMinute) {
            this.queryPlansPerMinute = Objects.requireNonNull(queryPlansPerMinute);
            return this;
        }

        public Builder setQueryStringLength(Integer queryStringLength) {
            this.queryStringLength = Objects.requireNonNull(queryStringLength);
            return this;
        }

        public Builder setRecordApplicationTags(Boolean recordApplicationTags) {
            this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags);
            return this;
        }

        public Builder setRecordClientAddress(Boolean recordClientAddress) {
            this.recordClientAddress = Objects.requireNonNull(recordClientAddress);
            return this;
        }
        public InsightsConfigResponse build() {
            return new InsightsConfigResponse(queryInsightsEnabled, queryPlansPerMinute, queryStringLength, recordApplicationTags, recordClientAddress);
        }
    }
}