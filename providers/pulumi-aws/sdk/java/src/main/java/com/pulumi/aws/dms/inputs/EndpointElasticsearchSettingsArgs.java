// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointElasticsearchSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointElasticsearchSettingsArgs Empty = new EndpointElasticsearchSettingsArgs();

    /**
     * Endpoint for the Elasticsearch cluster.
     * 
     */
    @Import(name="endpointUri", required=true)
    private Output<String> endpointUri;

    /**
     * @return Endpoint for the Elasticsearch cluster.
     * 
     */
    public Output<String> endpointUri() {
        return this.endpointUri;
    }

    /**
     * Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
     * 
     */
    @Import(name="errorRetryDuration")
    private @Nullable Output<Integer> errorRetryDuration;

    /**
     * @return Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
     * 
     */
    public Optional<Output<Integer>> errorRetryDuration() {
        return Optional.ofNullable(this.errorRetryDuration);
    }

    /**
     * Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
     * 
     */
    @Import(name="fullLoadErrorPercentage")
    private @Nullable Output<Integer> fullLoadErrorPercentage;

    /**
     * @return Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
     * 
     */
    public Optional<Output<Integer>> fullLoadErrorPercentage() {
        return Optional.ofNullable(this.fullLoadErrorPercentage);
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
     * 
     */
    @Import(name="serviceAccessRoleArn", required=true)
    private Output<String> serviceAccessRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
     * 
     */
    public Output<String> serviceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    private EndpointElasticsearchSettingsArgs() {}

    private EndpointElasticsearchSettingsArgs(EndpointElasticsearchSettingsArgs $) {
        this.endpointUri = $.endpointUri;
        this.errorRetryDuration = $.errorRetryDuration;
        this.fullLoadErrorPercentage = $.fullLoadErrorPercentage;
        this.serviceAccessRoleArn = $.serviceAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointElasticsearchSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointElasticsearchSettingsArgs $;

        public Builder() {
            $ = new EndpointElasticsearchSettingsArgs();
        }

        public Builder(EndpointElasticsearchSettingsArgs defaults) {
            $ = new EndpointElasticsearchSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpointUri Endpoint for the Elasticsearch cluster.
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(Output<String> endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        /**
         * @param endpointUri Endpoint for the Elasticsearch cluster.
         * 
         * @return builder
         * 
         */
        public Builder endpointUri(String endpointUri) {
            return endpointUri(Output.of(endpointUri));
        }

        /**
         * @param errorRetryDuration Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder errorRetryDuration(@Nullable Output<Integer> errorRetryDuration) {
            $.errorRetryDuration = errorRetryDuration;
            return this;
        }

        /**
         * @param errorRetryDuration Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
         * 
         * @return builder
         * 
         */
        public Builder errorRetryDuration(Integer errorRetryDuration) {
            return errorRetryDuration(Output.of(errorRetryDuration));
        }

        /**
         * @param fullLoadErrorPercentage Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder fullLoadErrorPercentage(@Nullable Output<Integer> fullLoadErrorPercentage) {
            $.fullLoadErrorPercentage = fullLoadErrorPercentage;
            return this;
        }

        /**
         * @param fullLoadErrorPercentage Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
         * 
         * @return builder
         * 
         */
        public Builder fullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
            return fullLoadErrorPercentage(Output.of(fullLoadErrorPercentage));
        }

        /**
         * @param serviceAccessRoleArn Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccessRoleArn(Output<String> serviceAccessRoleArn) {
            $.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        /**
         * @param serviceAccessRoleArn Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccessRoleArn(String serviceAccessRoleArn) {
            return serviceAccessRoleArn(Output.of(serviceAccessRoleArn));
        }

        public EndpointElasticsearchSettingsArgs build() {
            $.endpointUri = Objects.requireNonNull($.endpointUri, "expected parameter 'endpointUri' to be non-null");
            $.serviceAccessRoleArn = Objects.requireNonNull($.serviceAccessRoleArn, "expected parameter 'serviceAccessRoleArn' to be non-null");
            return $;
        }
    }

}
