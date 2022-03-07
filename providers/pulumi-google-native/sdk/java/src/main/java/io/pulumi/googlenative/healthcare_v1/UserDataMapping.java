// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.healthcare_v1.UserDataMappingArgs;
import io.pulumi.googlenative.healthcare_v1.outputs.AttributeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a new User data mapping in the parent consent store.
 * 
 */
@ResourceType(type="google-native:healthcare/v1:UserDataMapping")
public class UserDataMapping extends io.pulumi.resources.CustomResource {
    /**
     * Indicates the time when this mapping was archived.
     * 
     */
    @OutputExport(name="archiveTime", type=String.class, parameters={})
    private Output<String> archiveTime;

    /**
     * @return Indicates the time when this mapping was archived.
     * 
     */
    public Output<String> getArchiveTime() {
        return this.archiveTime;
    }
    /**
     * Indicates whether this mapping is archived.
     * 
     */
    @OutputExport(name="archived", type=Boolean.class, parameters={})
    private Output<Boolean> archived;

    /**
     * @return Indicates whether this mapping is archived.
     * 
     */
    public Output<Boolean> getArchived() {
        return this.archived;
    }
    /**
     * A unique identifier for the mapped resource.
     * 
     */
    @OutputExport(name="dataId", type=String.class, parameters={})
    private Output<String> dataId;

    /**
     * @return A unique identifier for the mapped resource.
     * 
     */
    public Output<String> getDataId() {
        return this.dataId;
    }
    /**
     * Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name of the User data mapping, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/userDataMappings/{user_data_mapping_id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
     * 
     */
    @OutputExport(name="resourceAttributes", type=List.class, parameters={AttributeResponse.class})
    private Output<List<AttributeResponse>> resourceAttributes;

    /**
     * @return Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
     * 
     */
    public Output<List<AttributeResponse>> getResourceAttributes() {
        return this.resourceAttributes;
    }
    /**
     * User's UUID provided by the client.
     * 
     */
    @OutputExport(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return User's UUID provided by the client.
     * 
     */
    public Output<String> getUserId() {
        return this.userId;
    }

    public interface BuilderApplicator {
        public void apply(UserDataMappingArgs.Builder a);
    }
    private static io.pulumi.googlenative.healthcare_v1.UserDataMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.healthcare_v1.UserDataMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public UserDataMapping(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserDataMapping(String name) {
        this(name, UserDataMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserDataMapping(String name, UserDataMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserDataMapping(String name, UserDataMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:UserDataMapping", name, args == null ? UserDataMappingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private UserDataMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:healthcare/v1:UserDataMapping", name, null, makeResourceOptions(options, id));
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
    public static UserDataMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new UserDataMapping(name, id, options);
    }
}