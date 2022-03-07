// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.DataCollectorArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new data collector.
 * 
 */
@ResourceType(type="google-native:apigee/v1:DataCollector")
public class DataCollector extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the data collector was created in milliseconds since the epoch.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time at which the data collector was created in milliseconds since the epoch.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * A description of the data collector.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description of the data collector.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
     */
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    /**
     * @return The time at which the Data Collector was last updated in milliseconds since the epoch.
     * 
     */
    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * ID of the data collector. Must begin with `dc_`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return ID of the data collector. Must begin with `dc_`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Immutable. The type of data this data collector will collect.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Immutable. The type of data this data collector will collect.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(DataCollectorArgs.Builder a);
    }
    private static io.pulumi.googlenative.apigee_v1.DataCollectorArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.apigee_v1.DataCollectorArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DataCollector(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCollector(String name) {
        this(name, DataCollectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCollector(String name, DataCollectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCollector(String name, DataCollectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DataCollector", name, args == null ? DataCollectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataCollector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DataCollector", name, null, makeResourceOptions(options, id));
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
    public static DataCollector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataCollector(name, id, options);
    }
}