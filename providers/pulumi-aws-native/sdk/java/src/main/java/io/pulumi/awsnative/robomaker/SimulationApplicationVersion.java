// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.robomaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.robomaker.SimulationApplicationVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:robomaker:SimulationApplicationVersion")
public class SimulationApplicationVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="application", type=String.class, parameters={})
    private Output<String> application;

    public Output<String> getApplication() {
        return this.application;
    }
    @OutputExport(name="applicationVersion", type=String.class, parameters={})
    private Output<String> applicationVersion;

    public Output<String> getApplicationVersion() {
        return this.applicationVersion;
    }
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The revision ID of robot application.
     * 
     */
    @OutputExport(name="currentRevisionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> currentRevisionId;

    /**
     * @return The revision ID of robot application.
     * 
     */
    public Output</* @Nullable */ String> getCurrentRevisionId() {
        return this.currentRevisionId;
    }

    public interface BuilderApplicator {
        public void apply(SimulationApplicationVersionArgs.Builder a);
    }
    private static io.pulumi.awsnative.robomaker.SimulationApplicationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.robomaker.SimulationApplicationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SimulationApplicationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SimulationApplicationVersion(String name) {
        this(name, SimulationApplicationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SimulationApplicationVersion(String name, SimulationApplicationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SimulationApplicationVersion(String name, SimulationApplicationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplicationVersion", name, args == null ? SimulationApplicationVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SimulationApplicationVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:robomaker:SimulationApplicationVersion", name, null, makeResourceOptions(options, id));
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
    public static SimulationApplicationVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SimulationApplicationVersion(name, id, options);
    }
}