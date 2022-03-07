// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2beta1.EntityTypeArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1EntityTypeEntityResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates an entity type in the specified agent. Note: You should always train an agent prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/es/docs/training).
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:dialogflow/v2beta1:EntityType")
public class EntityType extends io.pulumi.resources.CustomResource {
    /**
     * Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    @OutputExport(name="autoExpansionMode", type=String.class, parameters={})
    private Output<String> autoExpansionMode;

    /**
     * @return Optional. Indicates whether the entity type can be automatically expanded.
     * 
     */
    public Output<String> getAutoExpansionMode() {
        return this.autoExpansionMode;
    }
    /**
     * The name of the entity type.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of the entity type.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    @OutputExport(name="enableFuzzyExtraction", type=Boolean.class, parameters={})
    private Output<Boolean> enableFuzzyExtraction;

    /**
     * @return Optional. Enables fuzzy entity extraction during classification.
     * 
     */
    public Output<Boolean> getEnableFuzzyExtraction() {
        return this.enableFuzzyExtraction;
    }
    /**
     * Optional. The collection of entity entries associated with the entity type.
     * 
     */
    @OutputExport(name="entities", type=List.class, parameters={GoogleCloudDialogflowV2beta1EntityTypeEntityResponse.class})
    private Output<List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse>> entities;

    /**
     * @return Optional. The collection of entity entries associated with the entity type.
     * 
     */
    public Output<List<GoogleCloudDialogflowV2beta1EntityTypeEntityResponse>> getEntities() {
        return this.entities;
    }
    /**
     * Indicates the kind of entity type.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Indicates the kind of entity type.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Supported formats: - `projects//agent/entityTypes/` - `projects//locations//agent/entityTypes/`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(EntityTypeArgs.Builder a);
    }
    private static io.pulumi.googlenative.dialogflow_v2beta1.EntityTypeArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dialogflow_v2beta1.EntityTypeArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public EntityType(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityType(String name) {
        this(name, EntityTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityType(String name, EntityTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityType(String name, EntityTypeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:EntityType", name, args == null ? EntityTypeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private EntityType(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v2beta1:EntityType", name, null, makeResourceOptions(options, id));
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
    public static EntityType get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new EntityType(name, id, options);
    }
}