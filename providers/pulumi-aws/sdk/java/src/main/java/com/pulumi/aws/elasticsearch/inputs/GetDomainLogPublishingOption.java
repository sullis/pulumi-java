// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDomainLogPublishingOption extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainLogPublishingOption Empty = new GetDomainLogPublishingOption();

    /**
     * The CloudWatch Log Group where the logs are published.
     * 
     */
    @Import(name="cloudwatchLogGroupArn", required=true)
    private String cloudwatchLogGroupArn;

    /**
     * @return The CloudWatch Log Group where the logs are published.
     * 
     */
    public String cloudwatchLogGroupArn() {
        return this.cloudwatchLogGroupArn;
    }

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return Whether node to node encryption is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The type of Elasticsearch log being published.
     * 
     */
    @Import(name="logType", required=true)
    private String logType;

    /**
     * @return The type of Elasticsearch log being published.
     * 
     */
    public String logType() {
        return this.logType;
    }

    private GetDomainLogPublishingOption() {}

    private GetDomainLogPublishingOption(GetDomainLogPublishingOption $) {
        this.cloudwatchLogGroupArn = $.cloudwatchLogGroupArn;
        this.enabled = $.enabled;
        this.logType = $.logType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainLogPublishingOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainLogPublishingOption $;

        public Builder() {
            $ = new GetDomainLogPublishingOption();
        }

        public Builder(GetDomainLogPublishingOption defaults) {
            $ = new GetDomainLogPublishingOption(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchLogGroupArn The CloudWatch Log Group where the logs are published.
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchLogGroupArn(String cloudwatchLogGroupArn) {
            $.cloudwatchLogGroupArn = cloudwatchLogGroupArn;
            return this;
        }

        /**
         * @param enabled Whether node to node encryption is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param logType The type of Elasticsearch log being published.
         * 
         * @return builder
         * 
         */
        public Builder logType(String logType) {
            $.logType = logType;
            return this;
        }

        public GetDomainLogPublishingOption build() {
            $.cloudwatchLogGroupArn = Objects.requireNonNull($.cloudwatchLogGroupArn, "expected parameter 'cloudwatchLogGroupArn' to be non-null");
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            $.logType = Objects.requireNonNull($.logType, "expected parameter 'logType' to be non-null");
            return $;
        }
    }

}
