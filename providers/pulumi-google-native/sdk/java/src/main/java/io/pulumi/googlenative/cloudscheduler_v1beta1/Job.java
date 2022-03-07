// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudscheduler_v1beta1.JobArgs;
import io.pulumi.googlenative.cloudscheduler_v1beta1.outputs.AppEngineHttpTargetResponse;
import io.pulumi.googlenative.cloudscheduler_v1beta1.outputs.HttpTargetResponse;
import io.pulumi.googlenative.cloudscheduler_v1beta1.outputs.PubsubTargetResponse;
import io.pulumi.googlenative.cloudscheduler_v1beta1.outputs.RetryConfigResponse;
import io.pulumi.googlenative.cloudscheduler_v1beta1.outputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a job.
 * 
 */
@ResourceType(type="google-native:cloudscheduler/v1beta1:Job")
public class Job extends io.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP target.
     * 
     */
    @OutputExport(name="appEngineHttpTarget", type=AppEngineHttpTargetResponse.class, parameters={})
    private Output<AppEngineHttpTargetResponse> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target.
     * 
     */
    public Output<AppEngineHttpTargetResponse> getAppEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
     * 
     */
    @OutputExport(name="attemptDeadline", type=String.class, parameters={})
    private Output<String> attemptDeadline;

    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. The failed attempt can be viewed in execution logs. Cloud Scheduler will retry the job according to the RetryConfig. The allowed duration for this deadline is: * For HTTP targets, between 15 seconds and 30 minutes. * For App Engine HTTP targets, between 15 seconds and 24 hours 15 seconds. * For PubSub targets, this field is ignored.
     * 
     */
    public Output<String> getAttemptDeadline() {
        return this.attemptDeadline;
    }
    /**
     * Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Optionally caller-specified in CreateJob or UpdateJob. A human-readable description for the job. This string must not contain more than 500 characters.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * HTTP target.
     * 
     */
    @OutputExport(name="httpTarget", type=HttpTargetResponse.class, parameters={})
    private Output<HttpTargetResponse> httpTarget;

    /**
     * @return HTTP target.
     * 
     */
    public Output<HttpTargetResponse> getHttpTarget() {
        return this.httpTarget;
    }
    /**
     * The time the last job attempt started.
     * 
     */
    @OutputExport(name="lastAttemptTime", type=String.class, parameters={})
    private Output<String> lastAttemptTime;

    /**
     * @return The time the last job attempt started.
     * 
     */
    public Output<String> getLastAttemptTime() {
        return this.lastAttemptTime;
    }
    /**
     * Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
     * 
     */
    @OutputExport(name="legacyAppEngineCron", type=Boolean.class, parameters={})
    private Output<Boolean> legacyAppEngineCron;

    /**
     * @return Immutable. This field is used to manage the legacy App Engine Cron jobs using the Cloud Scheduler API. If the field is set to true, the job will be considered a legacy job. Note that App Engine Cron jobs have fewer features than Cloud Scheduler jobs, e.g., are only limited to App Engine targets.
     * 
     */
    public Output<Boolean> getLegacyAppEngineCron() {
        return this.legacyAppEngineCron;
    }
    /**
     * Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Optionally caller-specified in CreateJob, after which it becomes output only. The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Pub/Sub target.
     * 
     */
    @OutputExport(name="pubsubTarget", type=PubsubTargetResponse.class, parameters={})
    private Output<PubsubTargetResponse> pubsubTarget;

    /**
     * @return Pub/Sub target.
     * 
     */
    public Output<PubsubTargetResponse> getPubsubTarget() {
        return this.pubsubTarget;
    }
    /**
     * Settings that determine the retry behavior.
     * 
     */
    @OutputExport(name="retryConfig", type=RetryConfigResponse.class, parameters={})
    private Output<RetryConfigResponse> retryConfig;

    /**
     * @return Settings that determine the retry behavior.
     * 
     */
    public Output<RetryConfigResponse> getRetryConfig() {
        return this.retryConfig;
    }
    /**
     * Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count > 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    @OutputExport(name="schedule", type=String.class, parameters={})
    private Output<String> schedule;

    /**
     * @return Required, except when used with UpdateJob. Describes the schedule on which the job will be executed. The schedule can be either of the following types: * [Crontab](http://en.wikipedia.org/wiki/Cron#Overview) * English-like [schedule](https://cloud.google.com/scheduler/docs/configuring/cron-job-schedules) As a general rule, execution `n + 1` of a job will not begin until execution `n` has finished. Cloud Scheduler will never allow two simultaneously outstanding executions. For example, this implies that if the `n+1`th execution is scheduled to run at 16:00 but the `n`th execution takes until 16:15, the `n+1`th execution will not start until `16:15`. A scheduled start time will be delayed if the previous execution has not ended when its scheduled time occurs. If retry_count > 0 and a job attempt fails, the job will be tried a total of retry_count times, with exponential backoff, until the next scheduled start time.
     * 
     */
    public Output<String> getSchedule() {
        return this.schedule;
    }
    /**
     * The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    @OutputExport(name="scheduleTime", type=String.class, parameters={})
    private Output<String> scheduleTime;

    /**
     * @return The next time the job is scheduled. Note that this may be a retry of a previously failed attempt or the next execution time according to the schedule.
     * 
     */
    public Output<String> getScheduleTime() {
        return this.scheduleTime;
    }
    /**
     * State of the job.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The response from the target for the last attempted execution.
     * 
     */
    @OutputExport(name="status", type=StatusResponse.class, parameters={})
    private Output<StatusResponse> status;

    /**
     * @return The response from the target for the last attempted execution.
     * 
     */
    public Output<StatusResponse> getStatus() {
        return this.status;
    }
    /**
     * Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting schedule. The value of this field must be a time zone name from the [tz database](http://en.wikipedia.org/wiki/Tz_database). Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string "utc". If a time zone is not specified, the default will be in UTC (also known as GMT).
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }
    /**
     * The creation time of the job.
     * 
     */
    @OutputExport(name="userUpdateTime", type=String.class, parameters={})
    private Output<String> userUpdateTime;

    /**
     * @return The creation time of the job.
     * 
     */
    public Output<String> getUserUpdateTime() {
        return this.userUpdateTime;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable JobArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudscheduler_v1beta1.JobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudscheduler_v1beta1.JobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Job(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudscheduler/v1beta1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Job(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudscheduler/v1beta1:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}