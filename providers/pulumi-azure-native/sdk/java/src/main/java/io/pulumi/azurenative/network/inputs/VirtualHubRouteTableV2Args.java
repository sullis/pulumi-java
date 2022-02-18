// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.VirtualHubRouteV2Args;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VirtualHubRouteTableV2 Resource.
 * 
 */
public final class VirtualHubRouteTableV2Args extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubRouteTableV2Args Empty = new VirtualHubRouteTableV2Args();

    /**
     * List of all connections attached to this route table v2.
     * 
     */
    @InputImport(name="attachedConnections")
    private final @Nullable Input<List<String>> attachedConnections;

    public Input<List<String>> getAttachedConnections() {
        return this.attachedConnections == null ? Input.empty() : this.attachedConnections;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of all routes.
     * 
     */
    @InputImport(name="routes")
    private final @Nullable Input<List<VirtualHubRouteV2Args>> routes;

    public Input<List<VirtualHubRouteV2Args>> getRoutes() {
        return this.routes == null ? Input.empty() : this.routes;
    }

    public VirtualHubRouteTableV2Args(
        @Nullable Input<List<String>> attachedConnections,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<List<VirtualHubRouteV2Args>> routes) {
        this.attachedConnections = attachedConnections;
        this.id = id;
        this.name = name;
        this.routes = routes;
    }

    private VirtualHubRouteTableV2Args() {
        this.attachedConnections = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.routes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteTableV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> attachedConnections;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<List<VirtualHubRouteV2Args>> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteTableV2Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedConnections = defaults.attachedConnections;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.routes = defaults.routes;
        }

        public Builder setAttachedConnections(@Nullable Input<List<String>> attachedConnections) {
            this.attachedConnections = attachedConnections;
            return this;
        }

        public Builder setAttachedConnections(@Nullable List<String> attachedConnections) {
            this.attachedConnections = Input.ofNullable(attachedConnections);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRoutes(@Nullable Input<List<VirtualHubRouteV2Args>> routes) {
            this.routes = routes;
            return this;
        }

        public Builder setRoutes(@Nullable List<VirtualHubRouteV2Args> routes) {
            this.routes = Input.ofNullable(routes);
            return this;
        }

        public VirtualHubRouteTableV2Args build() {
            return new VirtualHubRouteTableV2Args(attachedConnections, id, name, routes);
        }
    }
}
