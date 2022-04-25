// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class WebAclVisibilityConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclVisibilityConfigGetArgs Empty = new WebAclVisibilityConfigGetArgs();

    /**
     * A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    @Import(name="cloudwatchMetricsEnabled", required=true)
    private Output<Boolean> cloudwatchMetricsEnabled;

    /**
     * @return A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
     * 
     */
    public Output<Boolean> cloudwatchMetricsEnabled() {
        return this.cloudwatchMetricsEnabled;
    }

    /**
     * A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    @Import(name="sampledRequestsEnabled", required=true)
    private Output<Boolean> sampledRequestsEnabled;

    /**
     * @return A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
     * 
     */
    public Output<Boolean> sampledRequestsEnabled() {
        return this.sampledRequestsEnabled;
    }

    private WebAclVisibilityConfigGetArgs() {}

    private WebAclVisibilityConfigGetArgs(WebAclVisibilityConfigGetArgs $) {
        this.cloudwatchMetricsEnabled = $.cloudwatchMetricsEnabled;
        this.metricName = $.metricName;
        this.sampledRequestsEnabled = $.sampledRequestsEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclVisibilityConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclVisibilityConfigGetArgs $;

        public Builder() {
            $ = new WebAclVisibilityConfigGetArgs();
        }

        public Builder(WebAclVisibilityConfigGetArgs defaults) {
            $ = new WebAclVisibilityConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudwatchMetricsEnabled A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchMetricsEnabled(Output<Boolean> cloudwatchMetricsEnabled) {
            $.cloudwatchMetricsEnabled = cloudwatchMetricsEnabled;
            return this;
        }

        /**
         * @param cloudwatchMetricsEnabled A boolean indicating whether the associated resource sends metrics to CloudWatch. For the list of available metrics, see [AWS WAF Metrics](https://docs.aws.amazon.com/waf/latest/developerguide/monitoring-cloudwatch.html#waf-metrics).
         * 
         * @return builder
         * 
         */
        public Builder cloudwatchMetricsEnabled(Boolean cloudwatchMetricsEnabled) {
            return cloudwatchMetricsEnabled(Output.of(cloudwatchMetricsEnabled));
        }

        /**
         * @param metricName A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName A friendly name of the CloudWatch metric. The name can contain only alphanumeric characters (A-Z, a-z, 0-9) hyphen(-) and underscore (\_), with length from one to 128 characters. It can&#39;t contain whitespace or metric names reserved for AWS WAF, for example `All` and `Default_Action`.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param sampledRequestsEnabled A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
         * 
         * @return builder
         * 
         */
        public Builder sampledRequestsEnabled(Output<Boolean> sampledRequestsEnabled) {
            $.sampledRequestsEnabled = sampledRequestsEnabled;
            return this;
        }

        /**
         * @param sampledRequestsEnabled A boolean indicating whether AWS WAF should store a sampling of the web requests that match the rules. You can view the sampled requests through the AWS WAF console.
         * 
         * @return builder
         * 
         */
        public Builder sampledRequestsEnabled(Boolean sampledRequestsEnabled) {
            return sampledRequestsEnabled(Output.of(sampledRequestsEnabled));
        }

        public WebAclVisibilityConfigGetArgs build() {
            $.cloudwatchMetricsEnabled = Objects.requireNonNull($.cloudwatchMetricsEnabled, "expected parameter 'cloudwatchMetricsEnabled' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.sampledRequestsEnabled = Objects.requireNonNull($.sampledRequestsEnabled, "expected parameter 'sampledRequestsEnabled' to be non-null");
            return $;
        }
    }

}
