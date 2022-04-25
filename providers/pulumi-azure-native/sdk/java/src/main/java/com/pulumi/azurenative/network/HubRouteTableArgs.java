// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.HubRouteArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HubRouteTableArgs extends com.pulumi.resources.ResourceArgs {

    public static final HubRouteTableArgs Empty = new HubRouteTableArgs();

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
     * List of labels associated with this route table.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<String>> labels;

    /**
     * @return List of labels associated with this route table.
     * 
     */
    public Optional<Output<List<String>>> labels() {
        return Optional.ofNullable(this.labels);
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
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The resource group name of the VirtualHub.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the RouteTable.
     * 
     */
    @Import(name="routeTableName")
    private @Nullable Output<String> routeTableName;

    /**
     * @return The name of the RouteTable.
     * 
     */
    public Optional<Output<String>> routeTableName() {
        return Optional.ofNullable(this.routeTableName);
    }

    /**
     * List of all routes.
     * 
     */
    @Import(name="routes")
    private @Nullable Output<List<HubRouteArgs>> routes;

    /**
     * @return List of all routes.
     * 
     */
    public Optional<Output<List<HubRouteArgs>>> routes() {
        return Optional.ofNullable(this.routes);
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

    private HubRouteTableArgs() {}

    private HubRouteTableArgs(HubRouteTableArgs $) {
        this.id = $.id;
        this.labels = $.labels;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.routeTableName = $.routeTableName;
        this.routes = $.routes;
        this.virtualHubName = $.virtualHubName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubRouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubRouteTableArgs $;

        public Builder() {
            $ = new HubRouteTableArgs();
        }

        public Builder(HubRouteTableArgs defaults) {
            $ = new HubRouteTableArgs(Objects.requireNonNull(defaults));
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
         * @param labels List of labels associated with this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels List of labels associated with this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels List of labels associated with this route table.
         * 
         * @return builder
         * 
         */
        public Builder labels(String... labels) {
            return labels(List.of(labels));
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
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name of the VirtualHub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param routeTableName The name of the RouteTable.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(@Nullable Output<String> routeTableName) {
            $.routeTableName = routeTableName;
            return this;
        }

        /**
         * @param routeTableName The name of the RouteTable.
         * 
         * @return builder
         * 
         */
        public Builder routeTableName(String routeTableName) {
            return routeTableName(Output.of(routeTableName));
        }

        /**
         * @param routes List of all routes.
         * 
         * @return builder
         * 
         */
        public Builder routes(@Nullable Output<List<HubRouteArgs>> routes) {
            $.routes = routes;
            return this;
        }

        /**
         * @param routes List of all routes.
         * 
         * @return builder
         * 
         */
        public Builder routes(List<HubRouteArgs> routes) {
            return routes(Output.of(routes));
        }

        /**
         * @param routes List of all routes.
         * 
         * @return builder
         * 
         */
        public Builder routes(HubRouteArgs... routes) {
            return routes(List.of(routes));
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

        public HubRouteTableArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualHubName = Objects.requireNonNull($.virtualHubName, "expected parameter 'virtualHubName' to be non-null");
            return $;
        }
    }

}
