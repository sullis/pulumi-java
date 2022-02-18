// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.outputs;

import io.pulumi.azurenative.authorization.outputs.ResourceManagementPrivateLinkEndpointConnectionsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceManagementPrivateLinkResult {
    /**
     * The rmplResourceID.
     * 
     */
    private final String id;
    /**
     * the region of the rmpl
     * 
     */
    private final @Nullable String location;
    /**
     * The rmpl Name.
     * 
     */
    private final String name;
    private final ResourceManagementPrivateLinkEndpointConnectionsResponse properties;
    /**
     * The operation type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","type"})
    private GetResourceManagementPrivateLinkResult(
        String id,
        @Nullable String location,
        String name,
        ResourceManagementPrivateLinkEndpointConnectionsResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The rmplResourceID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * the region of the rmpl
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The rmpl Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    public ResourceManagementPrivateLinkEndpointConnectionsResponse getProperties() {
        return this.properties;
    }
    /**
     * The operation type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceManagementPrivateLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private ResourceManagementPrivateLinkEndpointConnectionsResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceManagementPrivateLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ResourceManagementPrivateLinkEndpointConnectionsResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetResourceManagementPrivateLinkResult build() {
            return new GetResourceManagementPrivateLinkResult(id, location, name, properties, type);
        }
    }
}
