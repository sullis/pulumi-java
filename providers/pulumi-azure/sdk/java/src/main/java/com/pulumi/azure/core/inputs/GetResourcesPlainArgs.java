// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourcesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcesPlainArgs Empty = new GetResourcesPlainArgs();

    /**
     * The name of the Resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags which the resource has to have in order to be included in the result.
     * 
     */
    @Import(name="requiredTags")
    private @Nullable Map<String,String> requiredTags;

    /**
     * @return A mapping of tags which the resource has to have in order to be included in the result.
     * 
     */
    public Optional<Map<String,String>> requiredTags() {
        return Optional.ofNullable(this.requiredTags);
    }

    /**
     * The name of the Resource group where the Resources are located.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return The name of the Resource group where the Resources are located.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetResourcesPlainArgs() {}

    private GetResourcesPlainArgs(GetResourcesPlainArgs $) {
        this.name = $.name;
        this.requiredTags = $.requiredTags;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcesPlainArgs $;

        public Builder() {
            $ = new GetResourcesPlainArgs();
        }

        public Builder(GetResourcesPlainArgs defaults) {
            $ = new GetResourcesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param requiredTags A mapping of tags which the resource has to have in order to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder requiredTags(@Nullable Map<String,String> requiredTags) {
            $.requiredTags = requiredTags;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource group where the Resources are located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param type The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetResourcesPlainArgs build() {
            return $;
        }
    }

}
