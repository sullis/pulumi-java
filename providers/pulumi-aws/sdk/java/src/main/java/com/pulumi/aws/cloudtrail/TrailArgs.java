// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail;

import com.pulumi.aws.cloudtrail.inputs.TrailAdvancedEventSelectorArgs;
import com.pulumi.aws.cloudtrail.inputs.TrailEventSelectorArgs;
import com.pulumi.aws.cloudtrail.inputs.TrailInsightSelectorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrailArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrailArgs Empty = new TrailArgs();

    /**
     * Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    @Import(name="advancedEventSelectors")
    private @Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors;

    /**
     * @return Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
     * 
     */
    public Optional<Output<List<TrailAdvancedEventSelectorArgs>>> advancedEventSelectors() {
        return Optional.ofNullable(this.advancedEventSelectors);
    }

    /**
     * Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    @Import(name="cloudWatchLogsGroupArn")
    private @Nullable Output<String> cloudWatchLogsGroupArn;

    /**
     * @return Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
     * 
     */
    public Optional<Output<String>> cloudWatchLogsGroupArn() {
        return Optional.ofNullable(this.cloudWatchLogsGroupArn);
    }

    /**
     * Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    @Import(name="cloudWatchLogsRoleArn")
    private @Nullable Output<String> cloudWatchLogsRoleArn;

    /**
     * @return Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
     * 
     */
    public Optional<Output<String>> cloudWatchLogsRoleArn() {
        return Optional.ofNullable(this.cloudWatchLogsRoleArn);
    }

    /**
     * Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enableLogFileValidation")
    private @Nullable Output<Boolean> enableLogFileValidation;

    /**
     * @return Whether log file integrity validation is enabled. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableLogFileValidation() {
        return Optional.ofNullable(this.enableLogFileValidation);
    }

    /**
     * Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    @Import(name="enableLogging")
    private @Nullable Output<Boolean> enableLogging;

    /**
     * @return Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
     * 
     */
    public Optional<Output<Boolean>> enableLogging() {
        return Optional.ofNullable(this.enableLogging);
    }

    /**
     * Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    @Import(name="eventSelectors")
    private @Nullable Output<List<TrailEventSelectorArgs>> eventSelectors;

    /**
     * @return Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
     * 
     */
    public Optional<Output<List<TrailEventSelectorArgs>>> eventSelectors() {
        return Optional.ofNullable(this.eventSelectors);
    }

    /**
     * Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    @Import(name="includeGlobalServiceEvents")
    private @Nullable Output<Boolean> includeGlobalServiceEvents;

    /**
     * @return Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> includeGlobalServiceEvents() {
        return Optional.ofNullable(this.includeGlobalServiceEvents);
    }

    /**
     * Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    @Import(name="insightSelectors")
    private @Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors;

    /**
     * @return Configuration block for identifying unusual operational activity. See details below.
     * 
     */
    public Optional<Output<List<TrailInsightSelectorArgs>>> insightSelectors() {
        return Optional.ofNullable(this.insightSelectors);
    }

    /**
     * Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    @Import(name="isMultiRegionTrail")
    private @Nullable Output<Boolean> isMultiRegionTrail;

    /**
     * @return Whether the trail is created in the current region or in all regions. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isMultiRegionTrail() {
        return Optional.ofNullable(this.isMultiRegionTrail);
    }

    /**
     * Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    @Import(name="isOrganizationTrail")
    private @Nullable Output<Boolean> isOrganizationTrail;

    /**
     * @return Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> isOrganizationTrail() {
        return Optional.ofNullable(this.isOrganizationTrail);
    }

    /**
     * KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return KMS key ARN to use to encrypt the logs delivered by CloudTrail.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * Specifies the name of the advanced event selector.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the advanced event selector.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Name of the S3 bucket designated for publishing log files.
     * 
     */
    @Import(name="s3BucketName", required=true)
    private Output<String> s3BucketName;

    /**
     * @return Name of the S3 bucket designated for publishing log files.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }

    /**
     * S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    @Import(name="s3KeyPrefix")
    private @Nullable Output<String> s3KeyPrefix;

    /**
     * @return S3 key prefix that follows the name of the bucket you have designated for log file delivery.
     * 
     */
    public Optional<Output<String>> s3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    /**
     * Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    @Import(name="snsTopicName")
    private @Nullable Output<String> snsTopicName;

    /**
     * @return Name of the Amazon SNS topic defined for notification of log file delivery.
     * 
     */
    public Optional<Output<String>> snsTopicName() {
        return Optional.ofNullable(this.snsTopicName);
    }

    /**
     * Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TrailArgs() {}

    private TrailArgs(TrailArgs $) {
        this.advancedEventSelectors = $.advancedEventSelectors;
        this.cloudWatchLogsGroupArn = $.cloudWatchLogsGroupArn;
        this.cloudWatchLogsRoleArn = $.cloudWatchLogsRoleArn;
        this.enableLogFileValidation = $.enableLogFileValidation;
        this.enableLogging = $.enableLogging;
        this.eventSelectors = $.eventSelectors;
        this.includeGlobalServiceEvents = $.includeGlobalServiceEvents;
        this.insightSelectors = $.insightSelectors;
        this.isMultiRegionTrail = $.isMultiRegionTrail;
        this.isOrganizationTrail = $.isOrganizationTrail;
        this.kmsKeyId = $.kmsKeyId;
        this.name = $.name;
        this.s3BucketName = $.s3BucketName;
        this.s3KeyPrefix = $.s3KeyPrefix;
        this.snsTopicName = $.snsTopicName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrailArgs $;

        public Builder() {
            $ = new TrailArgs();
        }

        public Builder(TrailArgs defaults) {
            $ = new TrailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(@Nullable Output<List<TrailAdvancedEventSelectorArgs>> advancedEventSelectors) {
            $.advancedEventSelectors = advancedEventSelectors;
            return this;
        }

        /**
         * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(List<TrailAdvancedEventSelectorArgs> advancedEventSelectors) {
            return advancedEventSelectors(Output.of(advancedEventSelectors));
        }

        /**
         * @param advancedEventSelectors Specifies an advanced event selector for enabling data event logging. Fields documented below. Conflicts with `event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder advancedEventSelectors(TrailAdvancedEventSelectorArgs... advancedEventSelectors) {
            return advancedEventSelectors(List.of(advancedEventSelectors));
        }

        /**
         * @param cloudWatchLogsGroupArn Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogsGroupArn(@Nullable Output<String> cloudWatchLogsGroupArn) {
            $.cloudWatchLogsGroupArn = cloudWatchLogsGroupArn;
            return this;
        }

        /**
         * @param cloudWatchLogsGroupArn Log group name using an ARN that represents the log group to which CloudTrail logs will be delivered. Note that CloudTrail requires the Log Stream wildcard.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogsGroupArn(String cloudWatchLogsGroupArn) {
            return cloudWatchLogsGroupArn(Output.of(cloudWatchLogsGroupArn));
        }

        /**
         * @param cloudWatchLogsRoleArn Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogsRoleArn(@Nullable Output<String> cloudWatchLogsRoleArn) {
            $.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
            return this;
        }

        /**
         * @param cloudWatchLogsRoleArn Role for the CloudWatch Logs endpoint to assume to write to a user’s log group.
         * 
         * @return builder
         * 
         */
        public Builder cloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
            return cloudWatchLogsRoleArn(Output.of(cloudWatchLogsRoleArn));
        }

        /**
         * @param enableLogFileValidation Whether log file integrity validation is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableLogFileValidation(@Nullable Output<Boolean> enableLogFileValidation) {
            $.enableLogFileValidation = enableLogFileValidation;
            return this;
        }

        /**
         * @param enableLogFileValidation Whether log file integrity validation is enabled. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableLogFileValidation(Boolean enableLogFileValidation) {
            return enableLogFileValidation(Output.of(enableLogFileValidation));
        }

        /**
         * @param enableLogging Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(@Nullable Output<Boolean> enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        /**
         * @param enableLogging Enables logging for the trail. Defaults to `true`. Setting this to `false` will pause logging.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            return enableLogging(Output.of(enableLogging));
        }

        /**
         * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder eventSelectors(@Nullable Output<List<TrailEventSelectorArgs>> eventSelectors) {
            $.eventSelectors = eventSelectors;
            return this;
        }

        /**
         * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder eventSelectors(List<TrailEventSelectorArgs> eventSelectors) {
            return eventSelectors(Output.of(eventSelectors));
        }

        /**
         * @param eventSelectors Specifies an event selector for enabling data event logging. Fields documented below. Please note the [CloudTrail limits](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/WhatIsCloudTrail-Limits.html) when configuring these. Conflicts with `advanced_event_selector`.
         * 
         * @return builder
         * 
         */
        public Builder eventSelectors(TrailEventSelectorArgs... eventSelectors) {
            return eventSelectors(List.of(eventSelectors));
        }

        /**
         * @param includeGlobalServiceEvents Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeGlobalServiceEvents(@Nullable Output<Boolean> includeGlobalServiceEvents) {
            $.includeGlobalServiceEvents = includeGlobalServiceEvents;
            return this;
        }

        /**
         * @param includeGlobalServiceEvents Whether the trail is publishing events from global services such as IAM to the log files. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder includeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
            return includeGlobalServiceEvents(Output.of(includeGlobalServiceEvents));
        }

        /**
         * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
         * 
         * @return builder
         * 
         */
        public Builder insightSelectors(@Nullable Output<List<TrailInsightSelectorArgs>> insightSelectors) {
            $.insightSelectors = insightSelectors;
            return this;
        }

        /**
         * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
         * 
         * @return builder
         * 
         */
        public Builder insightSelectors(List<TrailInsightSelectorArgs> insightSelectors) {
            return insightSelectors(Output.of(insightSelectors));
        }

        /**
         * @param insightSelectors Configuration block for identifying unusual operational activity. See details below.
         * 
         * @return builder
         * 
         */
        public Builder insightSelectors(TrailInsightSelectorArgs... insightSelectors) {
            return insightSelectors(List.of(insightSelectors));
        }

        /**
         * @param isMultiRegionTrail Whether the trail is created in the current region or in all regions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isMultiRegionTrail(@Nullable Output<Boolean> isMultiRegionTrail) {
            $.isMultiRegionTrail = isMultiRegionTrail;
            return this;
        }

        /**
         * @param isMultiRegionTrail Whether the trail is created in the current region or in all regions. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isMultiRegionTrail(Boolean isMultiRegionTrail) {
            return isMultiRegionTrail(Output.of(isMultiRegionTrail));
        }

        /**
         * @param isOrganizationTrail Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isOrganizationTrail(@Nullable Output<Boolean> isOrganizationTrail) {
            $.isOrganizationTrail = isOrganizationTrail;
            return this;
        }

        /**
         * @param isOrganizationTrail Whether the trail is an AWS Organizations trail. Organization trails log events for the master account and all member accounts. Can only be created in the organization master account. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
            return isOrganizationTrail(Output.of(isOrganizationTrail));
        }

        /**
         * @param kmsKeyId KMS key ARN to use to encrypt the logs delivered by CloudTrail.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId KMS key ARN to use to encrypt the logs delivered by CloudTrail.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param name Specifies the name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the advanced event selector.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param s3BucketName Name of the S3 bucket designated for publishing log files.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(Output<String> s3BucketName) {
            $.s3BucketName = s3BucketName;
            return this;
        }

        /**
         * @param s3BucketName Name of the S3 bucket designated for publishing log files.
         * 
         * @return builder
         * 
         */
        public Builder s3BucketName(String s3BucketName) {
            return s3BucketName(Output.of(s3BucketName));
        }

        /**
         * @param s3KeyPrefix S3 key prefix that follows the name of the bucket you have designated for log file delivery.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(@Nullable Output<String> s3KeyPrefix) {
            $.s3KeyPrefix = s3KeyPrefix;
            return this;
        }

        /**
         * @param s3KeyPrefix S3 key prefix that follows the name of the bucket you have designated for log file delivery.
         * 
         * @return builder
         * 
         */
        public Builder s3KeyPrefix(String s3KeyPrefix) {
            return s3KeyPrefix(Output.of(s3KeyPrefix));
        }

        /**
         * @param snsTopicName Name of the Amazon SNS topic defined for notification of log file delivery.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicName(@Nullable Output<String> snsTopicName) {
            $.snsTopicName = snsTopicName;
            return this;
        }

        /**
         * @param snsTopicName Name of the Amazon SNS topic defined for notification of log file delivery.
         * 
         * @return builder
         * 
         */
        public Builder snsTopicName(String snsTopicName) {
            return snsTopicName(Output.of(snsTopicName));
        }

        /**
         * @param tags Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the trail. If configured with provider defaultTags present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TrailArgs build() {
            $.s3BucketName = Objects.requireNonNull($.s3BucketName, "expected parameter 's3BucketName' to be non-null");
            return $;
        }
    }

}
