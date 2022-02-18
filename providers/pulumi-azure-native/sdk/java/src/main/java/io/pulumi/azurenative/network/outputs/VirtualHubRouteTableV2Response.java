// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.VirtualHubRouteV2Response;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualHubRouteTableV2Response {
    /**
     * List of all connections attached to this route table v2.
     * 
     */
    private final @Nullable List<String> attachedConnections;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    private final String provisioningState;
    /**
     * List of all routes.
     * 
     */
    private final @Nullable List<VirtualHubRouteV2Response> routes;

    @OutputCustomType.Constructor({"attachedConnections","etag","id","name","provisioningState","routes"})
    private VirtualHubRouteTableV2Response(
        @Nullable List<String> attachedConnections,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable List<VirtualHubRouteV2Response> routes) {
        this.attachedConnections = attachedConnections;
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.routes = routes;
    }

    /**
     * List of all connections attached to this route table v2.
     * 
     */
    public List<String> getAttachedConnections() {
        return this.attachedConnections == null ? List.of() : this.attachedConnections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the virtual hub route table v2 resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of all routes.
     * 
     */
    public List<VirtualHubRouteV2Response> getRoutes() {
        return this.routes == null ? List.of() : this.routes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteTableV2Response defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> attachedConnections;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable List<VirtualHubRouteV2Response> routes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteTableV2Response defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedConnections = defaults.attachedConnections;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routes = defaults.routes;
        }

        public Builder setAttachedConnections(@Nullable List<String> attachedConnections) {
            this.attachedConnections = attachedConnections;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRoutes(@Nullable List<VirtualHubRouteV2Response> routes) {
            this.routes = routes;
            return this;
        }

        public VirtualHubRouteTableV2Response build() {
            return new VirtualHubRouteTableV2Response(attachedConnections, etag, id, name, provisioningState, routes);
        }
    }
}
