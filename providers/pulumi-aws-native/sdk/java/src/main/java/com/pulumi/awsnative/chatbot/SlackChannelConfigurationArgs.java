// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.chatbot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlackChannelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SlackChannelConfigurationArgs Empty = new SlackChannelConfigurationArgs();

    /**
     * The name of the configuration
     * 
     */
    @Import(name="configurationName", required=true)
    private Output<String> configurationName;

    /**
     * @return The name of the configuration
     * 
     */
    public Output<String> configurationName() {
        return this.configurationName;
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed &#39;AdministratorAccess&#39; policy is applied as a default if this is not set.
     * 
     */
    @Import(name="guardrailPolicies")
    private @Nullable Output<List<String>> guardrailPolicies;

    /**
     * @return The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed &#39;AdministratorAccess&#39; policy is applied as a default if this is not set.
     * 
     */
    public Optional<Output<List<String>>> guardrailPolicies() {
        return Optional.ofNullable(this.guardrailPolicies);
    }

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot
     * 
     */
    @Import(name="iamRoleArn", required=true)
    private Output<String> iamRoleArn;

    /**
     * @return The ARN of the IAM role that defines the permissions for AWS Chatbot
     * 
     */
    public Output<String> iamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
     * 
     */
    @Import(name="loggingLevel")
    private @Nullable Output<String> loggingLevel;

    /**
     * @return Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
     * 
     */
    public Optional<Output<String>> loggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }

    /**
     * The id of the Slack channel
     * 
     */
    @Import(name="slackChannelId", required=true)
    private Output<String> slackChannelId;

    /**
     * @return The id of the Slack channel
     * 
     */
    public Output<String> slackChannelId() {
        return this.slackChannelId;
    }

    /**
     * The id of the Slack workspace
     * 
     */
    @Import(name="slackWorkspaceId", required=true)
    private Output<String> slackWorkspaceId;

    /**
     * @return The id of the Slack workspace
     * 
     */
    public Output<String> slackWorkspaceId() {
        return this.slackWorkspaceId;
    }

    /**
     * ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
     * 
     */
    @Import(name="snsTopicArns")
    private @Nullable Output<List<String>> snsTopicArns;

    /**
     * @return ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
     * 
     */
    public Optional<Output<List<String>>> snsTopicArns() {
        return Optional.ofNullable(this.snsTopicArns);
    }

    /**
     * Enables use of a user role requirement in your chat configuration
     * 
     */
    @Import(name="userRoleRequired")
    private @Nullable Output<Boolean> userRoleRequired;

    /**
     * @return Enables use of a user role requirement in your chat configuration
     * 
     */
    public Optional<Output<Boolean>> userRoleRequired() {
        return Optional.ofNullable(this.userRoleRequired);
    }

    private SlackChannelConfigurationArgs() {}

    private SlackChannelConfigurationArgs(SlackChannelConfigurationArgs $) {
        this.configurationName = $.configurationName;
        this.guardrailPolicies = $.guardrailPolicies;
        this.iamRoleArn = $.iamRoleArn;
        this.loggingLevel = $.loggingLevel;
        this.slackChannelId = $.slackChannelId;
        this.slackWorkspaceId = $.slackWorkspaceId;
        this.snsTopicArns = $.snsTopicArns;
        this.userRoleRequired = $.userRoleRequired;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlackChannelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlackChannelConfigurationArgs $;

        public Builder() {
            $ = new SlackChannelConfigurationArgs();
        }

        public Builder(SlackChannelConfigurationArgs defaults) {
            $ = new SlackChannelConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationName The name of the configuration
         * 
         * @return builder
         * 
         */
        public Builder configurationName(Output<String> configurationName) {
            $.configurationName = configurationName;
            return this;
        }

        /**
         * @param configurationName The name of the configuration
         * 
         * @return builder
         * 
         */
        public Builder configurationName(String configurationName) {
            return configurationName(Output.of(configurationName));
        }

        /**
         * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed &#39;AdministratorAccess&#39; policy is applied as a default if this is not set.
         * 
         * @return builder
         * 
         */
        public Builder guardrailPolicies(@Nullable Output<List<String>> guardrailPolicies) {
            $.guardrailPolicies = guardrailPolicies;
            return this;
        }

        /**
         * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed &#39;AdministratorAccess&#39; policy is applied as a default if this is not set.
         * 
         * @return builder
         * 
         */
        public Builder guardrailPolicies(List<String> guardrailPolicies) {
            return guardrailPolicies(Output.of(guardrailPolicies));
        }

        /**
         * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. The AWS managed &#39;AdministratorAccess&#39; policy is applied as a default if this is not set.
         * 
         * @return builder
         * 
         */
        public Builder guardrailPolicies(String... guardrailPolicies) {
            return guardrailPolicies(List.of(guardrailPolicies));
        }

        /**
         * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(Output<String> iamRoleArn) {
            $.iamRoleArn = iamRoleArn;
            return this;
        }

        /**
         * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot
         * 
         * @return builder
         * 
         */
        public Builder iamRoleArn(String iamRoleArn) {
            return iamRoleArn(Output.of(iamRoleArn));
        }

        /**
         * @param loggingLevel Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(@Nullable Output<String> loggingLevel) {
            $.loggingLevel = loggingLevel;
            return this;
        }

        /**
         * @param loggingLevel Specifies the logging level for this configuration:ERROR,INFO or NONE. This property affects the log entries pushed to Amazon CloudWatch logs
         * 
         * @return builder
         * 
         */
        public Builder loggingLevel(String loggingLevel) {
            return loggingLevel(Output.of(loggingLevel));
        }

        /**
         * @param slackChannelId The id of the Slack channel
         * 
         * @return builder
         * 
         */
        public Builder slackChannelId(Output<String> slackChannelId) {
            $.slackChannelId = slackChannelId;
            return this;
        }

        /**
         * @param slackChannelId The id of the Slack channel
         * 
         * @return builder
         * 
         */
        public Builder slackChannelId(String slackChannelId) {
            return slackChannelId(Output.of(slackChannelId));
        }

        /**
         * @param slackWorkspaceId The id of the Slack workspace
         * 
         * @return builder
         * 
         */
        public Builder slackWorkspaceId(Output<String> slackWorkspaceId) {
            $.slackWorkspaceId = slackWorkspaceId;
            return this;
        }

        /**
         * @param slackWorkspaceId The id of the Slack workspace
         * 
         * @return builder
         * 
         */
        public Builder slackWorkspaceId(String slackWorkspaceId) {
            return slackWorkspaceId(Output.of(slackWorkspaceId));
        }

        /**
         * @param snsTopicArns ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArns(@Nullable Output<List<String>> snsTopicArns) {
            $.snsTopicArns = snsTopicArns;
            return this;
        }

        /**
         * @param snsTopicArns ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArns(List<String> snsTopicArns) {
            return snsTopicArns(Output.of(snsTopicArns));
        }

        /**
         * @param snsTopicArns ARNs of SNS topics which delivers notifications to AWS Chatbot, for example CloudWatch alarm notifications.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicArns(String... snsTopicArns) {
            return snsTopicArns(List.of(snsTopicArns));
        }

        /**
         * @param userRoleRequired Enables use of a user role requirement in your chat configuration
         * 
         * @return builder
         * 
         */
        public Builder userRoleRequired(@Nullable Output<Boolean> userRoleRequired) {
            $.userRoleRequired = userRoleRequired;
            return this;
        }

        /**
         * @param userRoleRequired Enables use of a user role requirement in your chat configuration
         * 
         * @return builder
         * 
         */
        public Builder userRoleRequired(Boolean userRoleRequired) {
            return userRoleRequired(Output.of(userRoleRequired));
        }

        public SlackChannelConfigurationArgs build() {
            $.configurationName = Objects.requireNonNull($.configurationName, "expected parameter 'configurationName' to be non-null");
            $.iamRoleArn = Objects.requireNonNull($.iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
            $.slackChannelId = Objects.requireNonNull($.slackChannelId, "expected parameter 'slackChannelId' to be non-null");
            $.slackWorkspaceId = Objects.requireNonNull($.slackWorkspaceId, "expected parameter 'slackWorkspaceId' to be non-null");
            return $;
        }
    }

}
