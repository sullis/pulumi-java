// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.batch_v1beta1.inputs.JobTemplateSpecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CronJobSpec describes how the job execution will look like and when it will actually run.
 * 
 */
public final class CronJobSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CronJobSpecArgs Empty = new CronJobSpecArgs();

    /**
     * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
     * 
     */
    @InputImport(name="concurrencyPolicy")
      private final @Nullable Input<String> concurrencyPolicy;

    public Input<String> getConcurrencyPolicy() {
        return this.concurrencyPolicy == null ? Input.empty() : this.concurrencyPolicy;
    }

    /**
     * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    @InputImport(name="failedJobsHistoryLimit")
      private final @Nullable Input<Integer> failedJobsHistoryLimit;

    public Input<Integer> getFailedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit == null ? Input.empty() : this.failedJobsHistoryLimit;
    }

    /**
     * Specifies the job that will be created when executing a CronJob.
     * 
     */
    @InputImport(name="jobTemplate", required=true)
      private final Input<JobTemplateSpecArgs> jobTemplate;

    public Input<JobTemplateSpecArgs> getJobTemplate() {
        return this.jobTemplate;
    }

    /**
     * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
     * 
     */
    @InputImport(name="schedule", required=true)
      private final Input<String> schedule;

    public Input<String> getSchedule() {
        return this.schedule;
    }

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
     * 
     */
    @InputImport(name="startingDeadlineSeconds")
      private final @Nullable Input<Integer> startingDeadlineSeconds;

    public Input<Integer> getStartingDeadlineSeconds() {
        return this.startingDeadlineSeconds == null ? Input.empty() : this.startingDeadlineSeconds;
    }

    /**
     * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
     * 
     */
    @InputImport(name="successfulJobsHistoryLimit")
      private final @Nullable Input<Integer> successfulJobsHistoryLimit;

    public Input<Integer> getSuccessfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit == null ? Input.empty() : this.successfulJobsHistoryLimit;
    }

    /**
     * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
     * 
     */
    @InputImport(name="suspend")
      private final @Nullable Input<Boolean> suspend;

    public Input<Boolean> getSuspend() {
        return this.suspend == null ? Input.empty() : this.suspend;
    }

    public CronJobSpecArgs(
        @Nullable Input<String> concurrencyPolicy,
        @Nullable Input<Integer> failedJobsHistoryLimit,
        Input<JobTemplateSpecArgs> jobTemplate,
        Input<String> schedule,
        @Nullable Input<Integer> startingDeadlineSeconds,
        @Nullable Input<Integer> successfulJobsHistoryLimit,
        @Nullable Input<Boolean> suspend) {
        this.concurrencyPolicy = concurrencyPolicy;
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        this.jobTemplate = Objects.requireNonNull(jobTemplate, "expected parameter 'jobTemplate' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        this.suspend = suspend;
    }

    private CronJobSpecArgs() {
        this.concurrencyPolicy = Input.empty();
        this.failedJobsHistoryLimit = Input.empty();
        this.jobTemplate = Input.empty();
        this.schedule = Input.empty();
        this.startingDeadlineSeconds = Input.empty();
        this.successfulJobsHistoryLimit = Input.empty();
        this.suspend = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CronJobSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> concurrencyPolicy;
        private @Nullable Input<Integer> failedJobsHistoryLimit;
        private Input<JobTemplateSpecArgs> jobTemplate;
        private Input<String> schedule;
        private @Nullable Input<Integer> startingDeadlineSeconds;
        private @Nullable Input<Integer> successfulJobsHistoryLimit;
        private @Nullable Input<Boolean> suspend;

        public Builder() {
    	      // Empty
        }

        public Builder(CronJobSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrencyPolicy = defaults.concurrencyPolicy;
    	      this.failedJobsHistoryLimit = defaults.failedJobsHistoryLimit;
    	      this.jobTemplate = defaults.jobTemplate;
    	      this.schedule = defaults.schedule;
    	      this.startingDeadlineSeconds = defaults.startingDeadlineSeconds;
    	      this.successfulJobsHistoryLimit = defaults.successfulJobsHistoryLimit;
    	      this.suspend = defaults.suspend;
        }

        public Builder setConcurrencyPolicy(@Nullable Input<String> concurrencyPolicy) {
            this.concurrencyPolicy = concurrencyPolicy;
            return this;
        }

        public Builder setConcurrencyPolicy(@Nullable String concurrencyPolicy) {
            this.concurrencyPolicy = Input.ofNullable(concurrencyPolicy);
            return this;
        }

        public Builder setFailedJobsHistoryLimit(@Nullable Input<Integer> failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = failedJobsHistoryLimit;
            return this;
        }

        public Builder setFailedJobsHistoryLimit(@Nullable Integer failedJobsHistoryLimit) {
            this.failedJobsHistoryLimit = Input.ofNullable(failedJobsHistoryLimit);
            return this;
        }

        public Builder setJobTemplate(Input<JobTemplateSpecArgs> jobTemplate) {
            this.jobTemplate = Objects.requireNonNull(jobTemplate);
            return this;
        }

        public Builder setJobTemplate(JobTemplateSpecArgs jobTemplate) {
            this.jobTemplate = Input.of(Objects.requireNonNull(jobTemplate));
            return this;
        }

        public Builder setSchedule(Input<String> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(String schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setStartingDeadlineSeconds(@Nullable Input<Integer> startingDeadlineSeconds) {
            this.startingDeadlineSeconds = startingDeadlineSeconds;
            return this;
        }

        public Builder setStartingDeadlineSeconds(@Nullable Integer startingDeadlineSeconds) {
            this.startingDeadlineSeconds = Input.ofNullable(startingDeadlineSeconds);
            return this;
        }

        public Builder setSuccessfulJobsHistoryLimit(@Nullable Input<Integer> successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
            return this;
        }

        public Builder setSuccessfulJobsHistoryLimit(@Nullable Integer successfulJobsHistoryLimit) {
            this.successfulJobsHistoryLimit = Input.ofNullable(successfulJobsHistoryLimit);
            return this;
        }

        public Builder setSuspend(@Nullable Input<Boolean> suspend) {
            this.suspend = suspend;
            return this;
        }

        public Builder setSuspend(@Nullable Boolean suspend) {
            this.suspend = Input.ofNullable(suspend);
            return this;
        }
        public CronJobSpecArgs build() {
            return new CronJobSpecArgs(concurrencyPolicy, failedJobsHistoryLimit, jobTemplate, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, suspend);
        }
    }
}