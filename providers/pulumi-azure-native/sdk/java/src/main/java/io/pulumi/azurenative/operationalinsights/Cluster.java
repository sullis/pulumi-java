// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.ClusterArgs;
import io.pulumi.azurenative.operationalinsights.outputs.AssociatedWorkspaceResponse;
import io.pulumi.azurenative.operationalinsights.outputs.CapacityReservationPropertiesResponse;
import io.pulumi.azurenative.operationalinsights.outputs.ClusterSkuResponse;
import io.pulumi.azurenative.operationalinsights.outputs.IdentityResponse;
import io.pulumi.azurenative.operationalinsights.outputs.KeyVaultPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The top level Log Analytics cluster resource container.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:operationalinsights:Cluster oiautorest6685 /subscriptions/594038b5-1093-476e-a366-482775671c11/resourcegroups/oiautorest6685/providers/microsoft.operationalinsights/clusters/oiautorest6685 
 * ```
 * 
 */
@ResourceType(type="azure-native:operationalinsights:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * The list of Log Analytics workspaces associated with the cluster
     * 
     */
    @OutputExport(name="associatedWorkspaces", type=List.class, parameters={AssociatedWorkspaceResponse.class})
    private Output</* @Nullable */ List<AssociatedWorkspaceResponse>> associatedWorkspaces;

    /**
     * @return The list of Log Analytics workspaces associated with the cluster
     * 
     */
    public Output</* @Nullable */ List<AssociatedWorkspaceResponse>> getAssociatedWorkspaces() {
        return this.associatedWorkspaces;
    }
    /**
     * The cluster's billing type.
     * 
     */
    @OutputExport(name="billingType", type=String.class, parameters={})
    private Output</* @Nullable */ String> billingType;

    /**
     * @return The cluster's billing type.
     * 
     */
    public Output</* @Nullable */ String> getBillingType() {
        return this.billingType;
    }
    /**
     * Additional properties for capacity reservation
     * 
     */
    @OutputExport(name="capacityReservationProperties", type=CapacityReservationPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ CapacityReservationPropertiesResponse> capacityReservationProperties;

    /**
     * @return Additional properties for capacity reservation
     * 
     */
    public Output</* @Nullable */ CapacityReservationPropertiesResponse> getCapacityReservationProperties() {
        return this.capacityReservationProperties;
    }
    /**
     * The ID associated with the cluster.
     * 
     */
    @OutputExport(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The ID associated with the cluster.
     * 
     */
    public Output<String> getClusterId() {
        return this.clusterId;
    }
    /**
     * The cluster creation time
     * 
     */
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return The cluster creation time
     * 
     */
    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The identity of the resource.
     * 
     */
    @OutputExport(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The identity of the resource.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     * 
     */
    @OutputExport(name="isAvailabilityZonesEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isAvailabilityZonesEnabled;

    /**
     * @return Sets whether the cluster will support availability zones. This can be set as true only in regions where Azure Data Explorer support Availability Zones. This Property can not be modified after cluster creation. Default value is 'true' if region supports Availability Zones.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsAvailabilityZonesEnabled() {
        return this.isAvailabilityZonesEnabled;
    }
    /**
     * The associated key properties.
     * 
     */
    @OutputExport(name="keyVaultProperties", type=KeyVaultPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultPropertiesResponse> keyVaultProperties;

    /**
     * @return The associated key properties.
     * 
     */
    public Output</* @Nullable */ KeyVaultPropertiesResponse> getKeyVaultProperties() {
        return this.keyVaultProperties;
    }
    /**
     * The last time the cluster was updated.
     * 
     */
    @OutputExport(name="lastModifiedDate", type=String.class, parameters={})
    private Output<String> lastModifiedDate;

    /**
     * @return The last time the cluster was updated.
     * 
     */
    public Output<String> getLastModifiedDate() {
        return this.lastModifiedDate;
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
     * The provisioning state of the cluster.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the cluster.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku properties.
     * 
     */
    @OutputExport(name="sku", type=ClusterSkuResponse.class, parameters={})
    private Output</* @Nullable */ ClusterSkuResponse> sku;

    /**
     * @return The sku properties.
     * 
     */
    public Output</* @Nullable */ ClusterSkuResponse> getSku() {
        return this.sku;
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
    public Cluster(String name, ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:operationalinsights:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20190801preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200301preview:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20200801:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20201001:Cluster").build()),
                Input.of(Alias.builder().setType("azure-native:operationalinsights/v20210601:Cluster").build())
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
    public static Cluster get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
