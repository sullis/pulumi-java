// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.AbortConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobExecutionsRetryConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobExecutionsRolloutConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.JobTemplateTagArgs;
import io.pulumi.awsnative.iot.inputs.PresignedUrlConfigPropertiesArgs;
import io.pulumi.awsnative.iot.inputs.TimeoutConfigPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateArgs Empty = new JobTemplateArgs();

    /**
     * The criteria that determine when and how a job abort takes place.
     * 
     */
    @Import(name="abortConfig")
      private final @Nullable Output<AbortConfigPropertiesArgs> abortConfig;

    public Output<AbortConfigPropertiesArgs> getAbortConfig() {
        return this.abortConfig == null ? Output.empty() : this.abortConfig;
    }

    /**
     * A description of the Job Template.
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    /**
     * The job document. Required if you don't specify a value for documentSource.
     * 
     */
    @Import(name="document")
      private final @Nullable Output<String> document;

    public Output<String> getDocument() {
        return this.document == null ? Output.empty() : this.document;
    }

    /**
     * An S3 link to the job document to use in the template. Required if you don't specify a value for document.
     * 
     */
    @Import(name="documentSource")
      private final @Nullable Output<String> documentSource;

    public Output<String> getDocumentSource() {
        return this.documentSource == null ? Output.empty() : this.documentSource;
    }

    /**
     * Optional for copying a JobTemplate from a pre-existing Job configuration.
     * 
     */
    @Import(name="jobArn")
      private final @Nullable Output<String> jobArn;

    public Output<String> getJobArn() {
        return this.jobArn == null ? Output.empty() : this.jobArn;
    }

    @Import(name="jobExecutionsRetryConfig")
      private final @Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig;

    public Output<JobExecutionsRetryConfigPropertiesArgs> getJobExecutionsRetryConfig() {
        return this.jobExecutionsRetryConfig == null ? Output.empty() : this.jobExecutionsRetryConfig;
    }

    /**
     * Allows you to create a staged rollout of a job.
     * 
     */
    @Import(name="jobExecutionsRolloutConfig")
      private final @Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig;

    public Output<JobExecutionsRolloutConfigPropertiesArgs> getJobExecutionsRolloutConfig() {
        return this.jobExecutionsRolloutConfig == null ? Output.empty() : this.jobExecutionsRolloutConfig;
    }

    @Import(name="jobTemplateId", required=true)
      private final Output<String> jobTemplateId;

    public Output<String> getJobTemplateId() {
        return this.jobTemplateId;
    }

    /**
     * Configuration for pre-signed S3 URLs.
     * 
     */
    @Import(name="presignedUrlConfig")
      private final @Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig;

    public Output<PresignedUrlConfigPropertiesArgs> getPresignedUrlConfig() {
        return this.presignedUrlConfig == null ? Output.empty() : this.presignedUrlConfig;
    }

    /**
     * Metadata that can be used to manage the JobTemplate.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<JobTemplateTagArgs>> tags;

    public Output<List<JobTemplateTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Specifies the amount of time each device has to finish its execution of the job.
     * 
     */
    @Import(name="timeoutConfig")
      private final @Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig;

    public Output<TimeoutConfigPropertiesArgs> getTimeoutConfig() {
        return this.timeoutConfig == null ? Output.empty() : this.timeoutConfig;
    }

    public JobTemplateArgs(
        @Nullable Output<AbortConfigPropertiesArgs> abortConfig,
        Output<String> description,
        @Nullable Output<String> document,
        @Nullable Output<String> documentSource,
        @Nullable Output<String> jobArn,
        @Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig,
        @Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig,
        Output<String> jobTemplateId,
        @Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig,
        @Nullable Output<List<JobTemplateTagArgs>> tags,
        @Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig) {
        this.abortConfig = abortConfig;
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.document = document;
        this.documentSource = documentSource;
        this.jobArn = jobArn;
        this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
        this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
        this.jobTemplateId = Objects.requireNonNull(jobTemplateId, "expected parameter 'jobTemplateId' to be non-null");
        this.presignedUrlConfig = presignedUrlConfig;
        this.tags = tags;
        this.timeoutConfig = timeoutConfig;
    }

    private JobTemplateArgs() {
        this.abortConfig = Output.empty();
        this.description = Output.empty();
        this.document = Output.empty();
        this.documentSource = Output.empty();
        this.jobArn = Output.empty();
        this.jobExecutionsRetryConfig = Output.empty();
        this.jobExecutionsRolloutConfig = Output.empty();
        this.jobTemplateId = Output.empty();
        this.presignedUrlConfig = Output.empty();
        this.tags = Output.empty();
        this.timeoutConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AbortConfigPropertiesArgs> abortConfig;
        private Output<String> description;
        private @Nullable Output<String> document;
        private @Nullable Output<String> documentSource;
        private @Nullable Output<String> jobArn;
        private @Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig;
        private @Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig;
        private Output<String> jobTemplateId;
        private @Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig;
        private @Nullable Output<List<JobTemplateTagArgs>> tags;
        private @Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortConfig = defaults.abortConfig;
    	      this.description = defaults.description;
    	      this.document = defaults.document;
    	      this.documentSource = defaults.documentSource;
    	      this.jobArn = defaults.jobArn;
    	      this.jobExecutionsRetryConfig = defaults.jobExecutionsRetryConfig;
    	      this.jobExecutionsRolloutConfig = defaults.jobExecutionsRolloutConfig;
    	      this.jobTemplateId = defaults.jobTemplateId;
    	      this.presignedUrlConfig = defaults.presignedUrlConfig;
    	      this.tags = defaults.tags;
    	      this.timeoutConfig = defaults.timeoutConfig;
        }

        public Builder abortConfig(@Nullable Output<AbortConfigPropertiesArgs> abortConfig) {
            this.abortConfig = abortConfig;
            return this;
        }
        public Builder abortConfig(@Nullable AbortConfigPropertiesArgs abortConfig) {
            this.abortConfig = Output.ofNullable(abortConfig);
            return this;
        }
        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }
        public Builder document(@Nullable Output<String> document) {
            this.document = document;
            return this;
        }
        public Builder document(@Nullable String document) {
            this.document = Output.ofNullable(document);
            return this;
        }
        public Builder documentSource(@Nullable Output<String> documentSource) {
            this.documentSource = documentSource;
            return this;
        }
        public Builder documentSource(@Nullable String documentSource) {
            this.documentSource = Output.ofNullable(documentSource);
            return this;
        }
        public Builder jobArn(@Nullable Output<String> jobArn) {
            this.jobArn = jobArn;
            return this;
        }
        public Builder jobArn(@Nullable String jobArn) {
            this.jobArn = Output.ofNullable(jobArn);
            return this;
        }
        public Builder jobExecutionsRetryConfig(@Nullable Output<JobExecutionsRetryConfigPropertiesArgs> jobExecutionsRetryConfig) {
            this.jobExecutionsRetryConfig = jobExecutionsRetryConfig;
            return this;
        }
        public Builder jobExecutionsRetryConfig(@Nullable JobExecutionsRetryConfigPropertiesArgs jobExecutionsRetryConfig) {
            this.jobExecutionsRetryConfig = Output.ofNullable(jobExecutionsRetryConfig);
            return this;
        }
        public Builder jobExecutionsRolloutConfig(@Nullable Output<JobExecutionsRolloutConfigPropertiesArgs> jobExecutionsRolloutConfig) {
            this.jobExecutionsRolloutConfig = jobExecutionsRolloutConfig;
            return this;
        }
        public Builder jobExecutionsRolloutConfig(@Nullable JobExecutionsRolloutConfigPropertiesArgs jobExecutionsRolloutConfig) {
            this.jobExecutionsRolloutConfig = Output.ofNullable(jobExecutionsRolloutConfig);
            return this;
        }
        public Builder jobTemplateId(Output<String> jobTemplateId) {
            this.jobTemplateId = Objects.requireNonNull(jobTemplateId);
            return this;
        }
        public Builder jobTemplateId(String jobTemplateId) {
            this.jobTemplateId = Output.of(Objects.requireNonNull(jobTemplateId));
            return this;
        }
        public Builder presignedUrlConfig(@Nullable Output<PresignedUrlConfigPropertiesArgs> presignedUrlConfig) {
            this.presignedUrlConfig = presignedUrlConfig;
            return this;
        }
        public Builder presignedUrlConfig(@Nullable PresignedUrlConfigPropertiesArgs presignedUrlConfig) {
            this.presignedUrlConfig = Output.ofNullable(presignedUrlConfig);
            return this;
        }
        public Builder tags(@Nullable Output<List<JobTemplateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<JobTemplateTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(JobTemplateTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder timeoutConfig(@Nullable Output<TimeoutConfigPropertiesArgs> timeoutConfig) {
            this.timeoutConfig = timeoutConfig;
            return this;
        }
        public Builder timeoutConfig(@Nullable TimeoutConfigPropertiesArgs timeoutConfig) {
            this.timeoutConfig = Output.ofNullable(timeoutConfig);
            return this;
        }        public JobTemplateArgs build() {
            return new JobTemplateArgs(abortConfig, description, document, documentSource, jobArn, jobExecutionsRetryConfig, jobExecutionsRolloutConfig, jobTemplateId, presignedUrlConfig, tags, timeoutConfig);
        }
    }
}
