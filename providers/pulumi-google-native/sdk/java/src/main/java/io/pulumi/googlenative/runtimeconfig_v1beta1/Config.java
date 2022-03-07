// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.runtimeconfig_v1beta1.ConfigArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new RuntimeConfig resource. The configuration name must be unique within project.
 * 
 */
@ResourceType(type="google-native:runtimeconfig/v1beta1:Config")
public class Config extends io.pulumi.resources.CustomResource {
    /**
     * An optional description of the RuntimeConfig object.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of the RuntimeConfig object.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The resource name of a runtime config. The name must have the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME] The `[PROJECT_ID]` must be a valid project ID, and `[CONFIG_NAME]` is an arbitrary name that matches the `[0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])?` regular expression. The length of `[CONFIG_NAME]` must be less than 64 characters. You pick the RuntimeConfig resource name, but the server will validate that the name adheres to this format. After you create the resource, you cannot change the resource's name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of a runtime config. The name must have the format: projects/[PROJECT_ID]/configs/[CONFIG_NAME] The `[PROJECT_ID]` must be a valid project ID, and `[CONFIG_NAME]` is an arbitrary name that matches the `[0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])?` regular expression. The length of `[CONFIG_NAME]` must be less than 64 characters. You pick the RuntimeConfig resource name, but the server will validate that the name adheres to this format. After you create the resource, you cannot change the resource's name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ConfigArgs.Builder a);
    }
    private static io.pulumi.googlenative.runtimeconfig_v1beta1.ConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.runtimeconfig_v1beta1.ConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Config(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Config(String name) {
        this(name, ConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Config(String name, @Nullable ConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Config(String name, @Nullable ConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Config", name, args == null ? ConfigArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Config(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:runtimeconfig/v1beta1:Config", name, null, makeResourceOptions(options, id));
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
    public static Config get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Config(name, id, options);
    }
}