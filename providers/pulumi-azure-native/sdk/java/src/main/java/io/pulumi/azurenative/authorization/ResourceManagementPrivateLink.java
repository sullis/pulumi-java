// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.ResourceManagementPrivateLinkArgs;
import io.pulumi.azurenative.authorization.outputs.ResourceManagementPrivateLinkEndpointConnectionsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:ResourceManagementPrivateLink my-pla 00000000-0000-0000-0000-000000000000 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ResourceManagementPrivateLink")
public class ResourceManagementPrivateLink extends io.pulumi.resources.CustomResource {
    /**
     * the region of the rmpl
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return the region of the rmpl
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The rmpl Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The rmpl Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=ResourceManagementPrivateLinkEndpointConnectionsResponse.class, parameters={})
    private Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> properties;

    public Output<ResourceManagementPrivateLinkEndpointConnectionsResponse> getProperties() {
        return this.properties;
    }
    /**
     * The operation type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The operation type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ResourceManagementPrivateLinkArgs.Builder a);
    }
    private static io.pulumi.azurenative.authorization.ResourceManagementPrivateLinkArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.authorization.ResourceManagementPrivateLinkArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceManagementPrivateLink(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceManagementPrivateLink(String name) {
        this(name, ResourceManagementPrivateLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceManagementPrivateLink(String name, ResourceManagementPrivateLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceManagementPrivateLink(String name, ResourceManagementPrivateLinkArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, args == null ? ResourceManagementPrivateLinkArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceManagementPrivateLink(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ResourceManagementPrivateLink", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:authorization/v20200501:ResourceManagementPrivateLink").build())
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
    public static ResourceManagementPrivateLink get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceManagementPrivateLink(name, id, options);
    }
}