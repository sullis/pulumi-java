// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.toolresults_v1beta3;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.toolresults_v1beta3.PerfSampleSeriesArgs;
import io.pulumi.googlenative.toolresults_v1beta3.outputs.BasicPerfSampleSeriesResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a PerfSampleSeries. May return any of the following error code(s): - ALREADY_EXISTS - PerfMetricSummary already exists for the given Step - NOT_FOUND - The containing Step does not exist
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:toolresults/v1beta3:PerfSampleSeries")
public class PerfSampleSeries extends io.pulumi.resources.CustomResource {
    /**
     * Basic series represented by a line chart
     * 
     */
    @OutputExport(name="basicPerfSampleSeries", type=BasicPerfSampleSeriesResponse.class, parameters={})
    private Output<BasicPerfSampleSeriesResponse> basicPerfSampleSeries;

    /**
     * @return Basic series represented by a line chart
     * 
     */
    public Output<BasicPerfSampleSeriesResponse> getBasicPerfSampleSeries() {
        return this.basicPerfSampleSeries;
    }
    /**
     * A tool results execution ID.
     * 
     */
    @OutputExport(name="executionId", type=String.class, parameters={})
    private Output<String> executionId;

    /**
     * @return A tool results execution ID.
     * 
     */
    public Output<String> getExecutionId() {
        return this.executionId;
    }
    /**
     * A tool results history ID.
     * 
     */
    @OutputExport(name="historyId", type=String.class, parameters={})
    private Output<String> historyId;

    /**
     * @return A tool results history ID.
     * 
     */
    public Output<String> getHistoryId() {
        return this.historyId;
    }
    /**
     * The cloud project
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The cloud project
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * A sample series id
     * 
     */
    @OutputExport(name="sampleSeriesId", type=String.class, parameters={})
    private Output<String> sampleSeriesId;

    /**
     * @return A sample series id
     * 
     */
    public Output<String> getSampleSeriesId() {
        return this.sampleSeriesId;
    }
    /**
     * A tool results step ID.
     * 
     */
    @OutputExport(name="stepId", type=String.class, parameters={})
    private Output<String> stepId;

    /**
     * @return A tool results step ID.
     * 
     */
    public Output<String> getStepId() {
        return this.stepId;
    }

    public interface BuilderApplicator {
        public void apply(PerfSampleSeriesArgs.Builder a);
    }
    private static io.pulumi.googlenative.toolresults_v1beta3.PerfSampleSeriesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.toolresults_v1beta3.PerfSampleSeriesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PerfSampleSeries(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PerfSampleSeries(String name) {
        this(name, PerfSampleSeriesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PerfSampleSeries(String name, PerfSampleSeriesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PerfSampleSeries(String name, PerfSampleSeriesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:PerfSampleSeries", name, args == null ? PerfSampleSeriesArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PerfSampleSeries(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:toolresults/v1beta3:PerfSampleSeries", name, null, makeResourceOptions(options, id));
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
    public static PerfSampleSeries get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PerfSampleSeries(name, id, options);
    }
}