// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.PrivateEndpointConnectionPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * For optimistic concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Path reference to this private endpoint endpoint connection. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/privateEndpointConnections/{privateEndpointConnectionName}
     * 
     */
    private final String id;
    /**
     * Name of the private endpoint endpoint connection.
     * 
     */
    private final String name;
    /**
     * Properties of the private endpoint endpoint connection.
     * 
     */
    private final PrivateEndpointConnectionPropertiesResponse properties;
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/privateEndpointConnections].
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","name","properties","type"})
    private GetPrivateEndpointConnectionResult(
        @Nullable String eTag,
        String id,
        String name,
        PrivateEndpointConnectionPropertiesResponse properties,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * For optimistic concurrency control.
     * 
     */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Path reference to this private endpoint endpoint connection. /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}/privateEndpointConnections/{privateEndpointConnectionName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the private endpoint endpoint connection.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the private endpoint endpoint connection.
     * 
     */
    public PrivateEndpointConnectionPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Type of the object = [Microsoft.Migrate/assessmentProjects/privateEndpointConnections].
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private String name;
        private PrivateEndpointConnectionPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(PrivateEndpointConnectionPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(eTag, id, name, properties, type);
        }
    }
}
