// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLinkForAzureAdArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkForAzureAdArgs Empty = new PrivateLinkForAzureAdArgs();

    /**
     * Flag indicating whether all tenants are allowed
     * 
     */
    @Import(name="allTenants")
    private @Nullable Output<Boolean> allTenants;

    /**
     * @return Flag indicating whether all tenants are allowed
     * 
     */
    public Optional<Output<Boolean>> allTenants() {
        return Optional.ofNullable(this.allTenants);
    }

    /**
     * Name of this resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of this resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Guid of the owner tenant
     * 
     */
    @Import(name="ownerTenantId")
    private @Nullable Output<String> ownerTenantId;

    /**
     * @return Guid of the owner tenant
     * 
     */
    public Optional<Output<String>> ownerTenantId() {
        return Optional.ofNullable(this.ownerTenantId);
    }

    /**
     * The name of the private link policy in Azure AD.
     * 
     */
    @Import(name="policyName")
    private @Nullable Output<String> policyName;

    /**
     * @return The name of the private link policy in Azure AD.
     * 
     */
    public Optional<Output<String>> policyName() {
        return Optional.ofNullable(this.policyName);
    }

    /**
     * Name of the resource group
     * 
     */
    @Import(name="resourceGroup")
    private @Nullable Output<String> resourceGroup;

    /**
     * @return Name of the resource group
     * 
     */
    public Optional<Output<String>> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of an Azure resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the private link policy resource
     * 
     */
    @Import(name="resourceName")
    private @Nullable Output<String> resourceName;

    /**
     * @return Name of the private link policy resource
     * 
     */
    public Optional<Output<String>> resourceName() {
        return Optional.ofNullable(this.resourceName);
    }

    /**
     * Subscription Identifier
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return Subscription Identifier
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The list of tenantIds.
     * 
     */
    @Import(name="tenants")
    private @Nullable Output<List<String>> tenants;

    /**
     * @return The list of tenantIds.
     * 
     */
    public Optional<Output<List<String>>> tenants() {
        return Optional.ofNullable(this.tenants);
    }

    private PrivateLinkForAzureAdArgs() {}

    private PrivateLinkForAzureAdArgs(PrivateLinkForAzureAdArgs $) {
        this.allTenants = $.allTenants;
        this.name = $.name;
        this.ownerTenantId = $.ownerTenantId;
        this.policyName = $.policyName;
        this.resourceGroup = $.resourceGroup;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.subscriptionId = $.subscriptionId;
        this.tags = $.tags;
        this.tenants = $.tenants;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkForAzureAdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkForAzureAdArgs $;

        public Builder() {
            $ = new PrivateLinkForAzureAdArgs();
        }

        public Builder(PrivateLinkForAzureAdArgs defaults) {
            $ = new PrivateLinkForAzureAdArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allTenants Flag indicating whether all tenants are allowed
         * 
         * @return builder
         * 
         */
        public Builder allTenants(@Nullable Output<Boolean> allTenants) {
            $.allTenants = allTenants;
            return this;
        }

        /**
         * @param allTenants Flag indicating whether all tenants are allowed
         * 
         * @return builder
         * 
         */
        public Builder allTenants(Boolean allTenants) {
            return allTenants(Output.of(allTenants));
        }

        /**
         * @param name Name of this resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of this resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerTenantId Guid of the owner tenant
         * 
         * @return builder
         * 
         */
        public Builder ownerTenantId(@Nullable Output<String> ownerTenantId) {
            $.ownerTenantId = ownerTenantId;
            return this;
        }

        /**
         * @param ownerTenantId Guid of the owner tenant
         * 
         * @return builder
         * 
         */
        public Builder ownerTenantId(String ownerTenantId) {
            return ownerTenantId(Output.of(ownerTenantId));
        }

        /**
         * @param policyName The name of the private link policy in Azure AD.
         * 
         * @return builder
         * 
         */
        public Builder policyName(@Nullable Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        /**
         * @param policyName The name of the private link policy in Azure AD.
         * 
         * @return builder
         * 
         */
        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        /**
         * @param resourceGroup Name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(@Nullable Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * @param resourceGroup Name of the resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        /**
         * @param resourceGroupName Name of an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of an Azure resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName Name of the private link policy resource
         * 
         * @return builder
         * 
         */
        public Builder resourceName(@Nullable Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName Name of the private link policy resource
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        /**
         * @param subscriptionId Subscription Identifier
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subscription Identifier
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tenants The list of tenantIds.
         * 
         * @return builder
         * 
         */
        public Builder tenants(@Nullable Output<List<String>> tenants) {
            $.tenants = tenants;
            return this;
        }

        /**
         * @param tenants The list of tenantIds.
         * 
         * @return builder
         * 
         */
        public Builder tenants(List<String> tenants) {
            return tenants(Output.of(tenants));
        }

        /**
         * @param tenants The list of tenantIds.
         * 
         * @return builder
         * 
         */
        public Builder tenants(String... tenants) {
            return tenants(List.of(tenants));
        }

        public PrivateLinkForAzureAdArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
