// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.keyvault.MHSMPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.keyvault.outputs.MHSMPrivateEndpointResponse;
import io.pulumi.azurenative.keyvault.outputs.MHSMPrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.keyvault.outputs.ManagedHsmSkuResponse;
import io.pulumi.azurenative.keyvault.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Private endpoint connection resource.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:keyvault:MHSMPrivateEndpointConnection sample-pec /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/sample-group/providers/Microsoft.KeyVault/managedhsms/sample-mhsm/privateEndpointConnections/sample-pec 
 * ```
 * 
 */
@ResourceType(type="azure-native:keyvault:MHSMPrivateEndpointConnection")
public class MHSMPrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Modified whenever there is a change in the state of private endpoint connection.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * The supported Azure location where the managed HSM Pool should be created.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The supported Azure location where the managed HSM Pool should be created.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the managed HSM Pool.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the managed HSM Pool.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Properties of the private endpoint object.
     * 
     */
    @OutputExport(name="privateEndpoint", type=MHSMPrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ MHSMPrivateEndpointResponse> privateEndpoint;

    /**
     * @return Properties of the private endpoint object.
     * 
     */
    public Output</* @Nullable */ MHSMPrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * Approval state of the private link connection.
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=MHSMPrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output</* @Nullable */ MHSMPrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return Approval state of the private link connection.
     * 
     */
    public Output</* @Nullable */ MHSMPrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the private endpoint connection.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SKU details
     * 
     */
    @OutputExport(name="sku", type=ManagedHsmSkuResponse.class, parameters={})
    private Output</* @Nullable */ ManagedHsmSkuResponse> sku;

    /**
     * @return SKU details
     * 
     */
    public Output</* @Nullable */ ManagedHsmSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Metadata pertaining to creation and last modification of the key vault resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the key vault resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The resource type of the managed HSM Pool.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the managed HSM Pool.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(MHSMPrivateEndpointConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.keyvault.MHSMPrivateEndpointConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.keyvault.MHSMPrivateEndpointConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public MHSMPrivateEndpointConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MHSMPrivateEndpointConnection(String name) {
        this(name, MHSMPrivateEndpointConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MHSMPrivateEndpointConnection(String name, MHSMPrivateEndpointConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MHSMPrivateEndpointConnection(String name, MHSMPrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:MHSMPrivateEndpointConnection", name, args == null ? MHSMPrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MHSMPrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:keyvault:MHSMPrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210401preview:MHSMPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20210601preview:MHSMPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211001:MHSMPrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:keyvault/v20211101preview:MHSMPrivateEndpointConnection").build())
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
    public static MHSMPrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MHSMPrivateEndpointConnection(name, id, options);
    }
}