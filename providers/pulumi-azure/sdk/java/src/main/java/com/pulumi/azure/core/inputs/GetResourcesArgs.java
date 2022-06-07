// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourcesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcesArgs Empty = new GetResourcesArgs();

    /**
     * The name of the Resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A mapping of tags which the resource has to have in order to be included in the result.
     * 
     */
    @Import(name="requiredTags")
    private @Nullable Output<Map<String,String>> requiredTags;

    /**
     * @return A mapping of tags which the resource has to have in order to be included in the result.
     * 
     */
    public Optional<Output<Map<String,String>>> requiredTags() {
        return Optional.ofNullable(this.requiredTags);
    }

    /**
     * The name of the Resource group where the Resources are located.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the Resource group where the Resources are located.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GetResourcesArgs() {}

    private GetResourcesArgs(GetResourcesArgs $) {
        this.name = $.name;
        this.requiredTags = $.requiredTags;
        this.resourceGroupName = $.resourceGroupName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcesArgs $;

        public Builder() {
            $ = new GetResourcesArgs();
        }

        public Builder(GetResourcesArgs defaults) {
            $ = new GetResourcesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param requiredTags A mapping of tags which the resource has to have in order to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder requiredTags(@Nullable Output<Map<String,String>> requiredTags) {
            $.requiredTags = requiredTags;
            return this;
        }

        /**
         * @param requiredTags A mapping of tags which the resource has to have in order to be included in the result.
         * 
         * @return builder
         * 
         */
        public Builder requiredTags(Map<String,String> requiredTags) {
            return requiredTags(Output.of(requiredTags));
        }

        /**
         * @param resourceGroupName The name of the Resource group where the Resources are located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource group where the Resources are located.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param type The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The Resource Type of the Resources you want to list (e.g. `Microsoft.Network/virtualNetworks`). A full list of available Resource Types can be found [here](https://docs.microsoft.com/en-us/azure/azure-resource-manager/azure-services-resource-providers).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GetResourcesArgs build() {
            return $;
        }
    }

}
