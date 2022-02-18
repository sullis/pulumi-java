// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.CoverageLevel;
import io.pulumi.azurenative.network.enums.EndpointType;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointFilterArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointScopeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint.
 * 
 */
public final class ConnectionMonitorEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorEndpointArgs Empty = new ConnectionMonitorEndpointArgs();

    /**
     * Address of the connection monitor endpoint (IP or domain name).
     * 
     */
    @InputImport(name="address")
    private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    /**
     * Test coverage for the endpoint.
     * 
     */
    @InputImport(name="coverageLevel")
    private final @Nullable Input<Either<String,CoverageLevel>> coverageLevel;

    public Input<Either<String,CoverageLevel>> getCoverageLevel() {
        return this.coverageLevel == null ? Input.empty() : this.coverageLevel;
    }

    /**
     * Filter for sub-items within the endpoint.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<ConnectionMonitorEndpointFilterArgs> filter;

    public Input<ConnectionMonitorEndpointFilterArgs> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The name of the connection monitor endpoint.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Resource ID of the connection monitor endpoint.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * Endpoint scope.
     * 
     */
    @InputImport(name="scope")
    private final @Nullable Input<ConnectionMonitorEndpointScopeArgs> scope;

    public Input<ConnectionMonitorEndpointScopeArgs> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    /**
     * The endpoint type.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,EndpointType>> type;

    public Input<Either<String,EndpointType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConnectionMonitorEndpointArgs(
        @Nullable Input<String> address,
        @Nullable Input<Either<String,CoverageLevel>> coverageLevel,
        @Nullable Input<ConnectionMonitorEndpointFilterArgs> filter,
        Input<String> name,
        @Nullable Input<String> resourceId,
        @Nullable Input<ConnectionMonitorEndpointScopeArgs> scope,
        @Nullable Input<Either<String,EndpointType>> type) {
        this.address = address;
        this.coverageLevel = coverageLevel;
        this.filter = filter;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceId = resourceId;
        this.scope = scope;
        this.type = type;
    }

    private ConnectionMonitorEndpointArgs() {
        this.address = Input.empty();
        this.coverageLevel = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
        this.resourceId = Input.empty();
        this.scope = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;
        private @Nullable Input<Either<String,CoverageLevel>> coverageLevel;
        private @Nullable Input<ConnectionMonitorEndpointFilterArgs> filter;
        private Input<String> name;
        private @Nullable Input<String> resourceId;
        private @Nullable Input<ConnectionMonitorEndpointScopeArgs> scope;
        private @Nullable Input<Either<String,EndpointType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.coverageLevel = defaults.coverageLevel;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.scope = defaults.scope;
    	      this.type = defaults.type;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }

        public Builder setCoverageLevel(@Nullable Input<Either<String,CoverageLevel>> coverageLevel) {
            this.coverageLevel = coverageLevel;
            return this;
        }

        public Builder setCoverageLevel(@Nullable Either<String,CoverageLevel> coverageLevel) {
            this.coverageLevel = Input.ofNullable(coverageLevel);
            return this;
        }

        public Builder setFilter(@Nullable Input<ConnectionMonitorEndpointFilterArgs> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable ConnectionMonitorEndpointFilterArgs filter) {
            this.filter = Input.ofNullable(filter);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setScope(@Nullable Input<ConnectionMonitorEndpointScopeArgs> scope) {
            this.scope = scope;
            return this;
        }

        public Builder setScope(@Nullable ConnectionMonitorEndpointScopeArgs scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,EndpointType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,EndpointType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ConnectionMonitorEndpointArgs build() {
            return new ConnectionMonitorEndpointArgs(address, coverageLevel, filter, name, resourceId, scope, type);
        }
    }
}
