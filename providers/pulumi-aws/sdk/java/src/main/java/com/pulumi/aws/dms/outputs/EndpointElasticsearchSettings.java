// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointElasticsearchSettings {
    /**
     * @return Endpoint for the Elasticsearch cluster.
     * 
     */
    private final String endpointUri;
    /**
     * @return Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
     * 
     */
    private final @Nullable Integer errorRetryDuration;
    /**
     * @return Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
     * 
     */
    private final @Nullable Integer fullLoadErrorPercentage;
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
     * 
     */
    private final String serviceAccessRoleArn;

    @CustomType.Constructor
    private EndpointElasticsearchSettings(
        @CustomType.Parameter("endpointUri") String endpointUri,
        @CustomType.Parameter("errorRetryDuration") @Nullable Integer errorRetryDuration,
        @CustomType.Parameter("fullLoadErrorPercentage") @Nullable Integer fullLoadErrorPercentage,
        @CustomType.Parameter("serviceAccessRoleArn") String serviceAccessRoleArn) {
        this.endpointUri = endpointUri;
        this.errorRetryDuration = errorRetryDuration;
        this.fullLoadErrorPercentage = fullLoadErrorPercentage;
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * @return Endpoint for the Elasticsearch cluster.
     * 
     */
    public String endpointUri() {
        return this.endpointUri;
    }
    /**
     * @return Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
     * 
     */
    public Optional<Integer> errorRetryDuration() {
        return Optional.ofNullable(this.errorRetryDuration);
    }
    /**
     * @return Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
     * 
     */
    public Optional<Integer> fullLoadErrorPercentage() {
        return Optional.ofNullable(this.fullLoadErrorPercentage);
    }
    /**
     * @return Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
     * 
     */
    public String serviceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointElasticsearchSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointUri;
        private @Nullable Integer errorRetryDuration;
        private @Nullable Integer fullLoadErrorPercentage;
        private String serviceAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointElasticsearchSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUri = defaults.endpointUri;
    	      this.errorRetryDuration = defaults.errorRetryDuration;
    	      this.fullLoadErrorPercentage = defaults.fullLoadErrorPercentage;
    	      this.serviceAccessRoleArn = defaults.serviceAccessRoleArn;
        }

        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }
        public Builder errorRetryDuration(@Nullable Integer errorRetryDuration) {
            this.errorRetryDuration = errorRetryDuration;
            return this;
        }
        public Builder fullLoadErrorPercentage(@Nullable Integer fullLoadErrorPercentage) {
            this.fullLoadErrorPercentage = fullLoadErrorPercentage;
            return this;
        }
        public Builder serviceAccessRoleArn(String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = Objects.requireNonNull(serviceAccessRoleArn);
            return this;
        }        public EndpointElasticsearchSettings build() {
            return new EndpointElasticsearchSettings(endpointUri, errorRetryDuration, fullLoadErrorPercentage, serviceAccessRoleArn);
        }
    }
}
