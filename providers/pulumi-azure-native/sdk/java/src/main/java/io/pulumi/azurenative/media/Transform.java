// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.TransformArgs;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.azurenative.media.outputs.TransformOutputResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:Transform createdTransform /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contosoresources/providers/Microsoft.Media/mediaservices/contosomedia/transforms/createdTransform 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:Transform")
public class Transform extends io.pulumi.resources.CustomResource {
    /**
     * The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    @OutputExport(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return The UTC date and time when the Transform was created, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public Output<String> getCreated() {
        return this.created;
    }
    /**
     * An optional verbose description of the Transform.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional verbose description of the Transform.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    @OutputExport(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The UTC date and time when the Transform was last updated, in 'YYYY-MM-DDThh:mm:ssZ' format.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An array of one or more TransformOutputs that the Transform should generate.
     * 
     */
    @OutputExport(name="outputs", type=List.class, parameters={TransformOutputResponse.class})
    private Output<List<TransformOutputResponse>> outputs;

    /**
     * @return An array of one or more TransformOutputs that the Transform should generate.
     * 
     */
    public Output<List<TransformOutputResponse>> getOutputs() {
        return this.outputs;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Transform(String name, TransformArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Transform", name, args == null ? TransformArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Transform(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:Transform", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:media/v20180330preview:Transform").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180601preview:Transform").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20180701:Transform").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20200501:Transform").build()),
                Input.of(Alias.builder().setType("azure-native:media/v20210601:Transform").build())
            ))
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
    public static Transform get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Transform(name, id, options);
    }
}
