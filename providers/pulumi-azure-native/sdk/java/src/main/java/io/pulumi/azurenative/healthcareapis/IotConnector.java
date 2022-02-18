// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.healthcareapis.IotConnectorArgs;
import io.pulumi.azurenative.healthcareapis.outputs.IotEventHubIngestionEndpointConfigurationResponse;
import io.pulumi.azurenative.healthcareapis.outputs.IotMappingPropertiesResponse;
import io.pulumi.azurenative.healthcareapis.outputs.ServiceManagedIdentityResponseIdentity;
import io.pulumi.azurenative.healthcareapis.outputs.SystemDataResponse;
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
 * IoT Connector definition.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:healthcareapis:IotConnector blue /subscriptions/subid/resourceGroups/testRG/providers/Microsoft.HealthcareApis/workspaces/workspace1/iotconnectors/blue 
 * ```
 * 
 */
@ResourceType(type="azure-native:healthcareapis:IotConnector")
public class IotConnector extends io.pulumi.resources.CustomResource {
    /**
     * Device Mappings.
     * 
     */
    @OutputExport(name="deviceMapping", type=IotMappingPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ IotMappingPropertiesResponse> deviceMapping;

    /**
     * @return Device Mappings.
     * 
     */
    public Output</* @Nullable */ IotMappingPropertiesResponse> getDeviceMapping() {
        return this.deviceMapping;
    }
    /**
     * An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return An etag associated with the resource, used for optimistic concurrency when editing it.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
    }
    /**
     * Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    @OutputExport(name="identity", type=ServiceManagedIdentityResponseIdentity.class, parameters={})
    private Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> identity;

    /**
     * @return Setting indicating whether the service has a managed identity associated with it.
     * 
     */
    public Output</* @Nullable */ ServiceManagedIdentityResponseIdentity> getIdentity() {
        return this.identity;
    }
    /**
     * Source configuration.
     * 
     */
    @OutputExport(name="ingestionEndpointConfiguration", type=IotEventHubIngestionEndpointConfigurationResponse.class, parameters={})
    private Output</* @Nullable */ IotEventHubIngestionEndpointConfigurationResponse> ingestionEndpointConfiguration;

    /**
     * @return Source configuration.
     * 
     */
    public Output</* @Nullable */ IotEventHubIngestionEndpointConfigurationResponse> getIngestionEndpointConfiguration() {
        return this.ingestionEndpointConfiguration;
    }
    /**
     * The resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
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
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
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
    public IotConnector(String name, IotConnectorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnector", name, args == null ? IotConnectorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IotConnector(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:healthcareapis:IotConnector", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:healthcareapis/v20210601preview:IotConnector").build())
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
    public static IotConnector get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IotConnector(name, id, options);
    }
}
