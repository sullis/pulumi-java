// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.speech_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.speech_v1.CustomClassArgs;
import io.pulumi.googlenative.speech_v1.outputs.ClassItemResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Create a custom class.
 * 
 */
@ResourceType(type="google-native:speech/v1:CustomClass")
public class CustomClass extends io.pulumi.resources.CustomResource {
    /**
     * If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    @OutputExport(name="customClassId", type=String.class, parameters={})
    private Output<String> customClassId;

    /**
     * @return If this custom class is a resource, the custom_class_id is the resource id of the CustomClass. Case sensitive.
     * 
     */
    public Output<String> getCustomClassId() {
        return this.customClassId;
    }
    /**
     * A collection of class items.
     * 
     */
    @OutputExport(name="items", type=List.class, parameters={ClassItemResponse.class})
    private Output<List<ClassItemResponse>> items;

    /**
     * @return A collection of class items.
     * 
     */
    public Output<List<ClassItemResponse>> getItems() {
        return this.items;
    }
    /**
     * The resource name of the custom class.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the custom class.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(CustomClassArgs.Builder a);
    }
    private static io.pulumi.googlenative.speech_v1.CustomClassArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.speech_v1.CustomClassArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CustomClass(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomClass(String name) {
        this(name, CustomClassArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomClass(String name, CustomClassArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomClass(String name, CustomClassArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:CustomClass", name, args == null ? CustomClassArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CustomClass(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:speech/v1:CustomClass", name, null, makeResourceOptions(options, id));
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
    public static CustomClass get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomClass(name, id, options);
    }
}