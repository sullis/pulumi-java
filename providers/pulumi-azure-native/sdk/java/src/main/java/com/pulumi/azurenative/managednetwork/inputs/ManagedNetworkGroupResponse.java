// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork.inputs;

import com.pulumi.azurenative.managednetwork.inputs.ResourceIdResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Managed Network Group resource
 * 
 */
public final class ManagedNetworkGroupResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedNetworkGroupResponse Empty = new ManagedNetworkGroupResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Responsibility role under which this Managed Network Group will be created
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    /**
     * @return Responsibility role under which this Managed Network Group will be created
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The collection of management groups covered by the Managed Network
     * 
     */
    @Import(name="managementGroups")
    private @Nullable List<ResourceIdResponse> managementGroups;

    /**
     * @return The collection of management groups covered by the Managed Network
     * 
     */
    public Optional<List<ResourceIdResponse>> managementGroups() {
        return Optional.ofNullable(this.managementGroups);
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    /**
     * @return Provisioning state of the ManagedNetwork resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The collection of  subnets covered by the Managed Network
     * 
     */
    @Import(name="subnets")
    private @Nullable List<ResourceIdResponse> subnets;

    /**
     * @return The collection of  subnets covered by the Managed Network
     * 
     */
    public Optional<List<ResourceIdResponse>> subnets() {
        return Optional.ofNullable(this.subnets);
    }

    /**
     * The collection of subscriptions covered by the Managed Network
     * 
     */
    @Import(name="subscriptions")
    private @Nullable List<ResourceIdResponse> subscriptions;

    /**
     * @return The collection of subscriptions covered by the Managed Network
     * 
     */
    public Optional<List<ResourceIdResponse>> subscriptions() {
        return Optional.ofNullable(this.subscriptions);
    }

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String type() {
        return this.type;
    }

    /**
     * The collection of virtual nets covered by the Managed Network
     * 
     */
    @Import(name="virtualNetworks")
    private @Nullable List<ResourceIdResponse> virtualNetworks;

    /**
     * @return The collection of virtual nets covered by the Managed Network
     * 
     */
    public Optional<List<ResourceIdResponse>> virtualNetworks() {
        return Optional.ofNullable(this.virtualNetworks);
    }

    private ManagedNetworkGroupResponse() {}

    private ManagedNetworkGroupResponse(ManagedNetworkGroupResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.kind = $.kind;
        this.location = $.location;
        this.managementGroups = $.managementGroups;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.subnets = $.subnets;
        this.subscriptions = $.subscriptions;
        this.type = $.type;
        this.virtualNetworks = $.virtualNetworks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedNetworkGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedNetworkGroupResponse $;

        public Builder() {
            $ = new ManagedNetworkGroupResponse();
        }

        public Builder(ManagedNetworkGroupResponse defaults) {
            $ = new ManagedNetworkGroupResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param etag A unique read-only string that changes whenever the resource is updated.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param id Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param kind Responsibility role under which this Managed Network Group will be created
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param location The geo-location where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        /**
         * @param managementGroups The collection of management groups covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder managementGroups(@Nullable List<ResourceIdResponse> managementGroups) {
            $.managementGroups = managementGroups;
            return this;
        }

        /**
         * @param managementGroups The collection of management groups covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder managementGroups(ResourceIdResponse... managementGroups) {
            return managementGroups(List.of(managementGroups));
        }

        /**
         * @param name The name of the resource
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param provisioningState Provisioning state of the ManagedNetwork resource.
         * 
         * @return builder
         * 
         */
        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        /**
         * @param subnets The collection of  subnets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subnets(@Nullable List<ResourceIdResponse> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets The collection of  subnets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subnets(ResourceIdResponse... subnets) {
            return subnets(List.of(subnets));
        }

        /**
         * @param subscriptions The collection of subscriptions covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subscriptions(@Nullable List<ResourceIdResponse> subscriptions) {
            $.subscriptions = subscriptions;
            return this;
        }

        /**
         * @param subscriptions The collection of subscriptions covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder subscriptions(ResourceIdResponse... subscriptions) {
            return subscriptions(List.of(subscriptions));
        }

        /**
         * @param type The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            $.type = type;
            return this;
        }

        /**
         * @param virtualNetworks The collection of virtual nets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(@Nullable List<ResourceIdResponse> virtualNetworks) {
            $.virtualNetworks = virtualNetworks;
            return this;
        }

        /**
         * @param virtualNetworks The collection of virtual nets covered by the Managed Network
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworks(ResourceIdResponse... virtualNetworks) {
            return virtualNetworks(List.of(virtualNetworks));
        }

        public ManagedNetworkGroupResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
