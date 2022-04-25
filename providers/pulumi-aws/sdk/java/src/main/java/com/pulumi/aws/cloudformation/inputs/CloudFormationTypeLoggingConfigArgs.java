// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CloudFormationTypeLoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudFormationTypeLoggingConfigArgs Empty = new CloudFormationTypeLoggingConfigArgs();

    /**
     * Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type&#39;s handlers.
     * 
     */
    @Import(name="logGroupName", required=true)
    private Output<String> logGroupName;

    /**
     * @return Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type&#39;s handlers.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    @Import(name="logRoleArn", required=true)
    private Output<String> logRoleArn;

    /**
     * @return Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
     * 
     */
    public Output<String> logRoleArn() {
        return this.logRoleArn;
    }

    private CloudFormationTypeLoggingConfigArgs() {}

    private CloudFormationTypeLoggingConfigArgs(CloudFormationTypeLoggingConfigArgs $) {
        this.logGroupName = $.logGroupName;
        this.logRoleArn = $.logRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudFormationTypeLoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudFormationTypeLoggingConfigArgs $;

        public Builder() {
            $ = new CloudFormationTypeLoggingConfigArgs();
        }

        public Builder(CloudFormationTypeLoggingConfigArgs defaults) {
            $ = new CloudFormationTypeLoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupName Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type&#39;s handlers.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(Output<String> logGroupName) {
            $.logGroupName = logGroupName;
            return this;
        }

        /**
         * @param logGroupName Name of the CloudWatch Log Group where CloudFormation sends error logging information when invoking the type&#39;s handlers.
         * 
         * @return builder
         * 
         */
        public Builder logGroupName(String logGroupName) {
            return logGroupName(Output.of(logGroupName));
        }

        /**
         * @param logRoleArn Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
         * 
         * @return builder
         * 
         */
        public Builder logRoleArn(Output<String> logRoleArn) {
            $.logRoleArn = logRoleArn;
            return this;
        }

        /**
         * @param logRoleArn Amazon Resource Name (ARN) of the IAM Role CloudFormation assumes when sending error logging information to CloudWatch Logs.
         * 
         * @return builder
         * 
         */
        public Builder logRoleArn(String logRoleArn) {
            return logRoleArn(Output.of(logRoleArn));
        }

        public CloudFormationTypeLoggingConfigArgs build() {
            $.logGroupName = Objects.requireNonNull($.logGroupName, "expected parameter 'logGroupName' to be non-null");
            $.logRoleArn = Objects.requireNonNull($.logRoleArn, "expected parameter 'logRoleArn' to be non-null");
            return $;
        }
    }

}
