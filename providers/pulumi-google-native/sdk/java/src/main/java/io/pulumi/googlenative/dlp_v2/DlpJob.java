// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dlp_v2.DlpJobArgs;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ErrorResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2InspectDataSourceDetailsResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new job to inspect storage or calculate risk metrics. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more. When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will automatically choose what detectors to run. By default this may be all types, but may change over time as detectors are updated.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dlp/v2:DlpJob")
public class DlpJob extends io.pulumi.resources.CustomResource {
    /**
     * Time when the job was created.
     * 
     */
    @OutputExport(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the job was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Time when the job finished.
     * 
     */
    @OutputExport(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return Time when the job finished.
     * 
     */
    public Output<String> getEndTime() {
        return this.endTime;
    }
    /**
     * A stream of errors encountered running the job.
     * 
     */
    @OutputExport(name="errors", type=List.class, parameters={GooglePrivacyDlpV2ErrorResponse.class})
    private Output<List<GooglePrivacyDlpV2ErrorResponse>> errors;

    /**
     * @return A stream of errors encountered running the job.
     * 
     */
    public Output<List<GooglePrivacyDlpV2ErrorResponse>> getErrors() {
        return this.errors;
    }
    /**
     * Results from inspecting a data source.
     * 
     */
    @OutputExport(name="inspectDetails", type=GooglePrivacyDlpV2InspectDataSourceDetailsResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2InspectDataSourceDetailsResponse> inspectDetails;

    /**
     * @return Results from inspecting a data source.
     * 
     */
    public Output<GooglePrivacyDlpV2InspectDataSourceDetailsResponse> getInspectDetails() {
        return this.inspectDetails;
    }
    /**
     * If created by a job trigger, the resource name of the trigger that instantiated the job.
     * 
     */
    @OutputExport(name="jobTriggerName", type=String.class, parameters={})
    private Output<String> jobTriggerName;

    /**
     * @return If created by a job trigger, the resource name of the trigger that instantiated the job.
     * 
     */
    public Output<String> getJobTriggerName() {
        return this.jobTriggerName;
    }
    /**
     * The server-assigned name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The server-assigned name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Results from analyzing risk of a data source.
     * 
     */
    @OutputExport(name="riskDetails", type=GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse.class, parameters={})
    private Output<GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse> riskDetails;

    /**
     * @return Results from analyzing risk of a data source.
     * 
     */
    public Output<GooglePrivacyDlpV2AnalyzeDataSourceRiskDetailsResponse> getRiskDetails() {
        return this.riskDetails;
    }
    /**
     * Time when the job started.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return Time when the job started.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * State of a job.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of a job.
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * The type of job.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of job.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DlpJobArgs.Builder a);
    }
    private static io.pulumi.googlenative.dlp_v2.DlpJobArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dlp_v2.DlpJobArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DlpJob(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DlpJob(String name) {
        this(name, DlpJobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DlpJob(String name, @Nullable DlpJobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DlpJob(String name, @Nullable DlpJobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:DlpJob", name, args == null ? DlpJobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DlpJob(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dlp/v2:DlpJob", name, null, makeResourceOptions(options, id));
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
    public static DlpJob get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DlpJob(name, id, options);
    }
}