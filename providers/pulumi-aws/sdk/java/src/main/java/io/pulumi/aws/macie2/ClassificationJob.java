// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.macie2.ClassificationJobArgs;
import io.pulumi.aws.macie2.inputs.ClassificationJobState;
import io.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinition;
import io.pulumi.aws.macie2.outputs.ClassificationJobScheduleFrequency;
import io.pulumi.aws.macie2.outputs.ClassificationJobUserPausedDetail;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage an [AWS Macie Classification Job](https://docs.aws.amazon.com/macie/latest/APIReference/jobs.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_macie2_classification_job` can be imported using the id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:macie2/classificationJob:ClassificationJob example abcd1
 * ```
 * 
 */
@ResourceType(type="aws:macie2/classificationJob:ClassificationJob")
public class ClassificationJob extends io.pulumi.resources.CustomResource {
    /**
     * The date and time, in UTC and extended RFC 3339 format, when the job was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time, in UTC and extended RFC 3339 format, when the job was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The custom data identifiers to use for data analysis and classification.
     * 
     */
    @Export(name="customDataIdentifierIds", type=List.class, parameters={String.class})
    private Output<List<String>> customDataIdentifierIds;

    /**
     * @return The custom data identifiers to use for data analysis and classification.
     * 
     */
    public Output<List<String>> customDataIdentifierIds() {
        return this.customDataIdentifierIds;
    }
    /**
     * A custom description of the job. The description can contain as many as 200 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A custom description of the job. The description can contain as many as 200 characters.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * 
     */
    @Export(name="initialRun", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> initialRun;

    /**
     * @return Specifies whether to analyze all existing, eligible objects immediately after the job is created.
     * 
     */
    public Output</* @Nullable */ Boolean> initialRun() {
        return this.initialRun;
    }
    @Export(name="jobArn", type=String.class, parameters={})
    private Output<String> jobArn;

    public Output<String> jobArn() {
        return this.jobArn;
    }
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * The status for the job. Valid values are: `CANCELLED`, `RUNNING` and `USER_PAUSED`
     * 
     */
    @Export(name="jobStatus", type=String.class, parameters={})
    private Output<String> jobStatus;

    /**
     * @return The status for the job. Valid values are: `CANCELLED`, `RUNNING` and `USER_PAUSED`
     * 
     */
    public Output<String> jobStatus() {
        return this.jobStatus;
    }
    /**
     * The schedule for running the job. Valid values are: `ONE_TIME` - Run the job only once. If you specify this value, don't specify a value for the `schedule_frequency` property. `SCHEDULED` - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the `schedule_frequency` property to define the recurrence pattern for the job.
     * 
     */
    @Export(name="jobType", type=String.class, parameters={})
    private Output<String> jobType;

    /**
     * @return The schedule for running the job. Valid values are: `ONE_TIME` - Run the job only once. If you specify this value, don't specify a value for the `schedule_frequency` property. `SCHEDULED` - Run the job on a daily, weekly, or monthly basis. If you specify this value, use the `schedule_frequency` property to define the recurrence pattern for the job.
     * 
     */
    public Output<String> jobType() {
        return this.jobType;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * 
     */
    @Export(name="s3JobDefinition", type=ClassificationJobS3JobDefinition.class, parameters={})
    private Output<ClassificationJobS3JobDefinition> s3JobDefinition;

    /**
     * @return The S3 buckets that contain the objects to analyze, and the scope of that analysis. (documented below)
     * 
     */
    public Output<ClassificationJobS3JobDefinition> s3JobDefinition() {
        return this.s3JobDefinition;
    }
    /**
     * The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * 
     */
    @Export(name="samplingPercentage", type=Integer.class, parameters={})
    private Output<Integer> samplingPercentage;

    /**
     * @return The sampling depth, as a percentage, to apply when processing objects. This value determines the percentage of eligible objects that the job analyzes. If this value is less than 100, Amazon Macie selects the objects to analyze at random, up to the specified percentage, and analyzes all the data in those objects.
     * 
     */
    public Output<Integer> samplingPercentage() {
        return this.samplingPercentage;
    }
    /**
     * The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the `job_type` property to `ONE_TIME`. (documented below)
     * 
     */
    @Export(name="scheduleFrequency", type=ClassificationJobScheduleFrequency.class, parameters={})
    private Output<ClassificationJobScheduleFrequency> scheduleFrequency;

    /**
     * @return The recurrence pattern for running the job. To run the job only once, don't specify a value for this property and set the value for the `job_type` property to `ONE_TIME`. (documented below)
     * 
     */
    public Output<ClassificationJobScheduleFrequency> scheduleFrequency() {
        return this.scheduleFrequency;
    }
    /**
     * A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of key-value pairs that specifies the tags to associate with the job. A job can have a maximum of 50 tags. Each tag consists of a tag key and an associated tag value. The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * If the current status of the job is `USER_PAUSED`, specifies when the job was paused and when the job or job run will expire and be cancelled if it isn't resumed. This value is present only if the value for `job-status` is `USER_PAUSED`.
     * 
     */
    @Export(name="userPausedDetails", type=List.class, parameters={ClassificationJobUserPausedDetail.class})
    private Output<List<ClassificationJobUserPausedDetail>> userPausedDetails;

    /**
     * @return If the current status of the job is `USER_PAUSED`, specifies when the job was paused and when the job or job run will expire and be cancelled if it isn't resumed. This value is present only if the value for `job-status` is `USER_PAUSED`.
     * 
     */
    public Output<List<ClassificationJobUserPausedDetail>> userPausedDetails() {
        return this.userPausedDetails;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClassificationJob(String name) {
        this(name, ClassificationJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClassificationJob(String name, ClassificationJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClassificationJob(String name, ClassificationJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/classificationJob:ClassificationJob", name, args == null ? ClassificationJobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClassificationJob(String name, Output<String> id, @Nullable ClassificationJobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:macie2/classificationJob:ClassificationJob", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClassificationJob get(String name, Output<String> id, @Nullable ClassificationJobState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClassificationJob(name, id, state, options);
    }
}
