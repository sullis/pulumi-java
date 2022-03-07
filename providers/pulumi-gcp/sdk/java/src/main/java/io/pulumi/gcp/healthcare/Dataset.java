// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.healthcare.DatasetArgs;
import io.pulumi.gcp.healthcare.inputs.DatasetState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A Healthcare `Dataset` is a toplevel logical grouping of `dicomStores`, `fhirStores` and `hl7V2Stores`.
 * 
 * To get more information about Dataset, see:
 * 
 * * [API documentation](https://cloud.google.com/healthcare/docs/reference/rest/v1/projects.locations.datasets)
 * * How-to Guides
 *     * [Creating a dataset](https://cloud.google.com/healthcare/docs/how-tos/datasets)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Dataset can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dataset:Dataset default projects/{{project}}/locations/{{location}}/datasets/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dataset:Dataset default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dataset:Dataset default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dataset:Dataset")
public class Dataset extends io.pulumi.resources.CustomResource {
    /**
     * The location for the Dataset.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location for the Dataset.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The resource name for the Dataset.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for the Dataset.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The fully qualified name of this dataset
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The fully qualified name of this dataset
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * The default timezone used by this dataset. Must be a either a valid IANA time zone name such as
     * "America/New_York" or empty, which defaults to UTC. This is used for parsing times in resources
     * (e.g., HL7 messages) where no explicit timezone is specified.
     * 
     */
    @OutputExport(name="timeZone", type=String.class, parameters={})
    private Output<String> timeZone;

    /**
     * @return The default timezone used by this dataset. Must be a either a valid IANA time zone name such as
     * "America/New_York" or empty, which defaults to UTC. This is used for parsing times in resources
     * (e.g., HL7 messages) where no explicit timezone is specified.
     * 
     */
    public Output<String> getTimeZone() {
        return this.timeZone;
    }

    public interface BuilderApplicator {
        public void apply(DatasetArgs.Builder a);
    }
    private static io.pulumi.gcp.healthcare.DatasetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.healthcare.DatasetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Dataset(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Dataset(String name) {
        this(name, DatasetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Dataset(String name, DatasetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Dataset(String name, DatasetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dataset:Dataset", name, args == null ? DatasetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Dataset(String name, Input<String> id, @Nullable DatasetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dataset:Dataset", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Dataset get(String name, Input<String> id, @Nullable DatasetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Dataset(name, id, state, options);
    }
}