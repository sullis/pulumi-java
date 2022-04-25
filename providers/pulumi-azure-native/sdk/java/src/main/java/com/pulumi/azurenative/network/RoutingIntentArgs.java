// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.RoutingPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoutingIntentArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoutingIntentArgs Empty = new RoutingIntentArgs();

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The resource group name of the RoutingIntent.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name of the RoutingIntent.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the per VirtualHub singleton Routing Intent resource.
     * 
     */
    @Import(name="routingIntentName")
    private @Nullable Output<String> routingIntentName;

    /**
     * @return The name of the per VirtualHub singleton Routing Intent resource.
     * 
     */
    public Optional<Output<String>> routingIntentName() {
        return Optional.ofNullable(this.routingIntentName);
    }

    /**
     * List of routing policies.
     * 
     */
    @Import(name="routingPolicies")
    private @Nullable Output<List<RoutingPolicyArgs>> routingPolicies;

    /**
     * @return List of routing policies.
     * 
     */
    public Optional<Output<List<RoutingPolicyArgs>>> routingPolicies() {
        return Optional.ofNullable(this.routingPolicies);
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName", required=true)
    private Output<String> virtualHubName;

    /**
     * @return The name of the VirtualHub.
     * 
     */
    public Output<String> virtualHubName() {
        return this.virtualHubName;
    }

    private RoutingIntentArgs() {}

    private RoutingIntentArgs(RoutingIntentArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.routingIntentName = $.routingIntentName;
        this.routingPolicies = $.routingPolicies;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutingIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutingIntentArgs $;

        public Builder() {
            $ = new RoutingIntentArgs();
        }

        public Builder(RoutingIntentArgs defaults) {
            $ = new RoutingIntentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resource that is unique within a resource group. This name can be used to access the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The resource group name of the RoutingIntent.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the RoutingIntent.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
         * 
         * @return builder
         * 
         */
        public Builder routingIntentName(@Nullable Output<String> routingIntentName) {
            $.routingIntentName = routingIntentName;
            return this;
        }

        /**
         * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
         * 
         * @return builder
         * 
         */
        public Builder routingIntentName(String routingIntentName) {
            return routingIntentName(Output.of(routingIntentName));
        }

        /**
         * @param routingPolicies List of routing policies.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicies(@Nullable Output<List<RoutingPolicyArgs>> routingPolicies) {
            $.routingPolicies = routingPolicies;
            return this;
        }

        /**
         * @param routingPolicies List of routing policies.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicies(List<RoutingPolicyArgs> routingPolicies) {
            return routingPolicies(Output.of(routingPolicies));
        }

        /**
         * @param routingPolicies List of routing policies.
         * 
         * @return builder
         * 
         */
        public Builder routingPolicies(RoutingPolicyArgs... routingPolicies) {
            return routingPolicies(List.of(routingPolicies));
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(Output<String> virtualHubName) {
            $.virtualHubName = virtualHubName;
            return this;
        }

        /**
         * @param virtualHubName The name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder virtualHubName(String virtualHubName) {
            return virtualHubName(Output.of(virtualHubName));
        }

        public RoutingIntentArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
