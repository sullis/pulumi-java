// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointFilterResponse;
import io.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointScopeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorEndpointResponse {
    /**
     * Address of the connection monitor endpoint (IP or domain name).
     * 
     */
    private final @Nullable String address;
    /**
     * Test coverage for the endpoint.
     * 
     */
    private final @Nullable String coverageLevel;
    /**
     * Filter for sub-items within the endpoint.
     * 
     */
    private final @Nullable ConnectionMonitorEndpointFilterResponse filter;
    /**
     * The name of the connection monitor endpoint.
     * 
     */
    private final String name;
    /**
     * Resource ID of the connection monitor endpoint.
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Endpoint scope.
     * 
     */
    private final @Nullable ConnectionMonitorEndpointScopeResponse scope;
    /**
     * The endpoint type.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"address","coverageLevel","filter","name","resourceId","scope","type"})
    private ConnectionMonitorEndpointResponse(
        @Nullable String address,
        @Nullable String coverageLevel,
        @Nullable ConnectionMonitorEndpointFilterResponse filter,
        String name,
        @Nullable String resourceId,
        @Nullable ConnectionMonitorEndpointScopeResponse scope,
        @Nullable String type) {
        this.address = address;
        this.coverageLevel = coverageLevel;
        this.filter = filter;
        this.name = Objects.requireNonNull(name);
        this.resourceId = resourceId;
        this.scope = scope;
        this.type = type;
    }

    /**
     * Address of the connection monitor endpoint (IP or domain name).
     * 
    */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    /**
     * Test coverage for the endpoint.
     * 
    */
    public Optional<String> getCoverageLevel() {
        return Optional.ofNullable(this.coverageLevel);
    }
    /**
     * Filter for sub-items within the endpoint.
     * 
    */
    public Optional<ConnectionMonitorEndpointFilterResponse> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The name of the connection monitor endpoint.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource ID of the connection monitor endpoint.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Endpoint scope.
     * 
    */
    public Optional<ConnectionMonitorEndpointScopeResponse> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * The endpoint type.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String coverageLevel;
        private @Nullable ConnectionMonitorEndpointFilterResponse filter;
        private String name;
        private @Nullable String resourceId;
        private @Nullable ConnectionMonitorEndpointScopeResponse scope;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.coverageLevel = defaults.coverageLevel;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setCoverageLevel(@Nullable String coverageLevel) {
            this.coverageLevel = coverageLevel;
            return this;
        }

        public Builder setFilter(@Nullable ConnectionMonitorEndpointFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setScope(@Nullable ConnectionMonitorEndpointScopeResponse scope) {
            this.scope = scope;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ConnectionMonitorEndpointResponse build() {
            return new ConnectionMonitorEndpointResponse(address, coverageLevel, filter, name, resourceId, scope, type);
        }
    }
}