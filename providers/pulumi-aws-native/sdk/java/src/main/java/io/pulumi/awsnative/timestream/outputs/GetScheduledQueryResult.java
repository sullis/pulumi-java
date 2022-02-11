// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream.outputs;

import io.pulumi.awsnative.timestream.outputs.ScheduledQueryTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScheduledQueryResult {
    private final @Nullable String arn;
    private final @Nullable String sQErrorReportConfiguration;
    private final @Nullable String sQKmsKeyId;
    private final @Nullable String sQName;
    private final @Nullable String sQNotificationConfiguration;
    private final @Nullable String sQQueryString;
    private final @Nullable String sQScheduleConfiguration;
    private final @Nullable String sQScheduledQueryExecutionRoleArn;
    private final @Nullable String sQTargetConfiguration;
    private final @Nullable List<ScheduledQueryTag> tags;

    @OutputCustomType.Constructor({"arn","sQErrorReportConfiguration","sQKmsKeyId","sQName","sQNotificationConfiguration","sQQueryString","sQScheduleConfiguration","sQScheduledQueryExecutionRoleArn","sQTargetConfiguration","tags"})
    private GetScheduledQueryResult(
        @Nullable String arn,
        @Nullable String sQErrorReportConfiguration,
        @Nullable String sQKmsKeyId,
        @Nullable String sQName,
        @Nullable String sQNotificationConfiguration,
        @Nullable String sQQueryString,
        @Nullable String sQScheduleConfiguration,
        @Nullable String sQScheduledQueryExecutionRoleArn,
        @Nullable String sQTargetConfiguration,
        @Nullable List<ScheduledQueryTag> tags) {
        this.arn = arn;
        this.sQErrorReportConfiguration = sQErrorReportConfiguration;
        this.sQKmsKeyId = sQKmsKeyId;
        this.sQName = sQName;
        this.sQNotificationConfiguration = sQNotificationConfiguration;
        this.sQQueryString = sQQueryString;
        this.sQScheduleConfiguration = sQScheduleConfiguration;
        this.sQScheduledQueryExecutionRoleArn = sQScheduledQueryExecutionRoleArn;
        this.sQTargetConfiguration = sQTargetConfiguration;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getSQErrorReportConfiguration() {
        return Optional.ofNullable(this.sQErrorReportConfiguration);
    }
    public Optional<String> getSQKmsKeyId() {
        return Optional.ofNullable(this.sQKmsKeyId);
    }
    public Optional<String> getSQName() {
        return Optional.ofNullable(this.sQName);
    }
    public Optional<String> getSQNotificationConfiguration() {
        return Optional.ofNullable(this.sQNotificationConfiguration);
    }
    public Optional<String> getSQQueryString() {
        return Optional.ofNullable(this.sQQueryString);
    }
    public Optional<String> getSQScheduleConfiguration() {
        return Optional.ofNullable(this.sQScheduleConfiguration);
    }
    public Optional<String> getSQScheduledQueryExecutionRoleArn() {
        return Optional.ofNullable(this.sQScheduledQueryExecutionRoleArn);
    }
    public Optional<String> getSQTargetConfiguration() {
        return Optional.ofNullable(this.sQTargetConfiguration);
    }
    public List<ScheduledQueryTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScheduledQueryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String sQErrorReportConfiguration;
        private @Nullable String sQKmsKeyId;
        private @Nullable String sQName;
        private @Nullable String sQNotificationConfiguration;
        private @Nullable String sQQueryString;
        private @Nullable String sQScheduleConfiguration;
        private @Nullable String sQScheduledQueryExecutionRoleArn;
        private @Nullable String sQTargetConfiguration;
        private @Nullable List<ScheduledQueryTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScheduledQueryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.sQErrorReportConfiguration = defaults.sQErrorReportConfiguration;
    	      this.sQKmsKeyId = defaults.sQKmsKeyId;
    	      this.sQName = defaults.sQName;
    	      this.sQNotificationConfiguration = defaults.sQNotificationConfiguration;
    	      this.sQQueryString = defaults.sQQueryString;
    	      this.sQScheduleConfiguration = defaults.sQScheduleConfiguration;
    	      this.sQScheduledQueryExecutionRoleArn = defaults.sQScheduledQueryExecutionRoleArn;
    	      this.sQTargetConfiguration = defaults.sQTargetConfiguration;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setSQErrorReportConfiguration(@Nullable String sQErrorReportConfiguration) {
            this.sQErrorReportConfiguration = sQErrorReportConfiguration;
            return this;
        }

        public Builder setSQKmsKeyId(@Nullable String sQKmsKeyId) {
            this.sQKmsKeyId = sQKmsKeyId;
            return this;
        }

        public Builder setSQName(@Nullable String sQName) {
            this.sQName = sQName;
            return this;
        }

        public Builder setSQNotificationConfiguration(@Nullable String sQNotificationConfiguration) {
            this.sQNotificationConfiguration = sQNotificationConfiguration;
            return this;
        }

        public Builder setSQQueryString(@Nullable String sQQueryString) {
            this.sQQueryString = sQQueryString;
            return this;
        }

        public Builder setSQScheduleConfiguration(@Nullable String sQScheduleConfiguration) {
            this.sQScheduleConfiguration = sQScheduleConfiguration;
            return this;
        }

        public Builder setSQScheduledQueryExecutionRoleArn(@Nullable String sQScheduledQueryExecutionRoleArn) {
            this.sQScheduledQueryExecutionRoleArn = sQScheduledQueryExecutionRoleArn;
            return this;
        }

        public Builder setSQTargetConfiguration(@Nullable String sQTargetConfiguration) {
            this.sQTargetConfiguration = sQTargetConfiguration;
            return this;
        }

        public Builder setTags(@Nullable List<ScheduledQueryTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetScheduledQueryResult build() {
            return new GetScheduledQueryResult(arn, sQErrorReportConfiguration, sQKmsKeyId, sQName, sQNotificationConfiguration, sQQueryString, sQScheduleConfiguration, sQScheduledQueryExecutionRoleArn, sQTargetConfiguration, tags);
        }
    }
}
