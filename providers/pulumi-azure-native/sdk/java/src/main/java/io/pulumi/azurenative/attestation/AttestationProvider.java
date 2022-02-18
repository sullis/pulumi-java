// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.attestation.AttestationProviderArgs;
import io.pulumi.azurenative.attestation.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.attestation.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Attestation service response message.
 * API Version: 2020-10-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:attestation:AttestationProvider myattestationprovider subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/MyResourceGroup/providers/Microsoft.Attestation/attestationProviders/myattestationprovider 
 * ```
 * 
 */
@ResourceType(type="azure-native:attestation:AttestationProvider")
public class AttestationProvider extends io.pulumi.resources.CustomResource {
    /**
     * Gets the uri of attestation service
     * 
     */
    @OutputExport(name="attestUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> attestUri;

    /**
     * @return Gets the uri of attestation service
     * 
     */
    public Output</* @Nullable */ String> getAttestUri() {
        return this.attestUri;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * List of private endpoint connections associated with the attestation provider.
     * 
     */
    @OutputExport(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return List of private endpoint connections associated with the attestation provider.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Status of attestation service.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of attestation service.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Trust model for the attestation provider.
     * 
     */
    @OutputExport(name="trustModel", type=String.class, parameters={})
    private Output</* @Nullable */ String> trustModel;

    /**
     * @return Trust model for the attestation provider.
     * 
     */
    public Output</* @Nullable */ String> getTrustModel() {
        return this.trustModel;
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
    public AttestationProvider(String name, AttestationProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:attestation:AttestationProvider", name, args == null ? AttestationProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AttestationProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:attestation:AttestationProvider", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:attestation/v20180901preview:AttestationProvider").build()),
                Input.of(Alias.builder().setType("azure-native:attestation/v20201001:AttestationProvider").build()),
                Input.of(Alias.builder().setType("azure-native:attestation/v20210601preview:AttestationProvider").build())
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
    public static AttestationProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AttestationProvider(name, id, options);
    }
}
