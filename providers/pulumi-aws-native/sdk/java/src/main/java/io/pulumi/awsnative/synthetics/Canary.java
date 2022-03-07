// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.synthetics.CanaryArgs;
import io.pulumi.awsnative.synthetics.outputs.CanaryArtifactConfig;
import io.pulumi.awsnative.synthetics.outputs.CanaryCode;
import io.pulumi.awsnative.synthetics.outputs.CanaryRunConfig;
import io.pulumi.awsnative.synthetics.outputs.CanarySchedule;
import io.pulumi.awsnative.synthetics.outputs.CanaryTag;
import io.pulumi.awsnative.synthetics.outputs.CanaryVPCConfig;
import io.pulumi.awsnative.synthetics.outputs.CanaryVisualReference;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Synthetics::Canary
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:synthetics:Canary")
public class Canary extends io.pulumi.resources.CustomResource {
    /**
     * Provide artifact configuration
     * 
     */
    @OutputExport(name="artifactConfig", type=CanaryArtifactConfig.class, parameters={})
    private Output</* @Nullable */ CanaryArtifactConfig> artifactConfig;

    /**
     * @return Provide artifact configuration
     * 
     */
    public Output</* @Nullable */ CanaryArtifactConfig> getArtifactConfig() {
        return this.artifactConfig;
    }
    /**
     * Provide the s3 bucket output location for test results
     * 
     */
    @OutputExport(name="artifactS3Location", type=String.class, parameters={})
    private Output<String> artifactS3Location;

    /**
     * @return Provide the s3 bucket output location for test results
     * 
     */
    public Output<String> getArtifactS3Location() {
        return this.artifactS3Location;
    }
    /**
     * Provide the canary script source
     * 
     */
    @OutputExport(name="code", type=CanaryCode.class, parameters={})
    private Output<CanaryCode> code;

    /**
     * @return Provide the canary script source
     * 
     */
    public Output<CanaryCode> getCode() {
        return this.code;
    }
    /**
     * Lambda Execution role used to run your canaries
     * 
     */
    @OutputExport(name="executionRoleArn", type=String.class, parameters={})
    private Output<String> executionRoleArn;

    /**
     * @return Lambda Execution role used to run your canaries
     * 
     */
    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Retention period of failed canary runs represented in number of days
     * 
     */
    @OutputExport(name="failureRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> failureRetentionPeriod;

    /**
     * @return Retention period of failed canary runs represented in number of days
     * 
     */
    public Output</* @Nullable */ Integer> getFailureRetentionPeriod() {
        return this.failureRetentionPeriod;
    }
    /**
     * Name of the canary.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the canary.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provide canary run configuration
     * 
     */
    @OutputExport(name="runConfig", type=CanaryRunConfig.class, parameters={})
    private Output</* @Nullable */ CanaryRunConfig> runConfig;

    /**
     * @return Provide canary run configuration
     * 
     */
    public Output</* @Nullable */ CanaryRunConfig> getRunConfig() {
        return this.runConfig;
    }
    /**
     * Runtime version of Synthetics Library
     * 
     */
    @OutputExport(name="runtimeVersion", type=String.class, parameters={})
    private Output<String> runtimeVersion;

    /**
     * @return Runtime version of Synthetics Library
     * 
     */
    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * Frequency to run your canaries
     * 
     */
    @OutputExport(name="schedule", type=CanarySchedule.class, parameters={})
    private Output<CanarySchedule> schedule;

    /**
     * @return Frequency to run your canaries
     * 
     */
    public Output<CanarySchedule> getSchedule() {
        return this.schedule;
    }
    /**
     * Runs canary if set to True. Default is False
     * 
     */
    @OutputExport(name="startCanaryAfterCreation", type=Boolean.class, parameters={})
    private Output<Boolean> startCanaryAfterCreation;

    /**
     * @return Runs canary if set to True. Default is False
     * 
     */
    public Output<Boolean> getStartCanaryAfterCreation() {
        return this.startCanaryAfterCreation;
    }
    /**
     * State of the canary
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the canary
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Retention period of successful canary runs represented in number of days
     * 
     */
    @OutputExport(name="successRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> successRetentionPeriod;

    /**
     * @return Retention period of successful canary runs represented in number of days
     * 
     */
    public Output</* @Nullable */ Integer> getSuccessRetentionPeriod() {
        return this.successRetentionPeriod;
    }
    @OutputExport(name="tags", type=List.class, parameters={CanaryTag.class})
    private Output</* @Nullable */ List<CanaryTag>> tags;

    public Output</* @Nullable */ List<CanaryTag>> getTags() {
        return this.tags;
    }
    /**
     * Provide VPC Configuration if enabled.
     * 
     */
    @OutputExport(name="vPCConfig", type=CanaryVPCConfig.class, parameters={})
    private Output</* @Nullable */ CanaryVPCConfig> vPCConfig;

    /**
     * @return Provide VPC Configuration if enabled.
     * 
     */
    public Output</* @Nullable */ CanaryVPCConfig> getVPCConfig() {
        return this.vPCConfig;
    }
    /**
     * Visual reference configuration for visual testing
     * 
     */
    @OutputExport(name="visualReference", type=CanaryVisualReference.class, parameters={})
    private Output</* @Nullable */ CanaryVisualReference> visualReference;

    /**
     * @return Visual reference configuration for visual testing
     * 
     */
    public Output</* @Nullable */ CanaryVisualReference> getVisualReference() {
        return this.visualReference;
    }

    public interface BuilderApplicator {
        public void apply(CanaryArgs.Builder a);
    }
    private static io.pulumi.awsnative.synthetics.CanaryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.synthetics.CanaryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Canary(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Canary(String name) {
        this(name, CanaryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Canary(String name, CanaryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Canary(String name, CanaryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:synthetics:Canary", name, args == null ? CanaryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Canary(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:synthetics:Canary", name, null, makeResourceOptions(options, id));
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
    public static Canary get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Canary(name, id, options);
    }
}