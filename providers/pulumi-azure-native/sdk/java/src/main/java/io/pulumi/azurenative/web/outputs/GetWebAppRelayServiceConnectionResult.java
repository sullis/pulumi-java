// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWebAppRelayServiceConnectionResult {
    private final @Nullable String biztalkUri;
    private final @Nullable String entityConnectionString;
    private final @Nullable String entityName;
    private final @Nullable String hostname;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Kind of resource.
     * 
     */
    private final @Nullable String kind;
    /**
     * Resource Name.
     * 
     */
    private final String name;
    private final @Nullable Integer port;
    private final @Nullable String resourceConnectionString;
    private final @Nullable String resourceType;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"biztalkUri","entityConnectionString","entityName","hostname","id","kind","name","port","resourceConnectionString","resourceType","type"})
    private GetWebAppRelayServiceConnectionResult(
        @Nullable String biztalkUri,
        @Nullable String entityConnectionString,
        @Nullable String entityName,
        @Nullable String hostname,
        String id,
        @Nullable String kind,
        String name,
        @Nullable Integer port,
        @Nullable String resourceConnectionString,
        @Nullable String resourceType,
        String type) {
        this.biztalkUri = biztalkUri;
        this.entityConnectionString = entityConnectionString;
        this.entityName = entityName;
        this.hostname = hostname;
        this.id = Objects.requireNonNull(id);
        this.kind = kind;
        this.name = Objects.requireNonNull(name);
        this.port = port;
        this.resourceConnectionString = resourceConnectionString;
        this.resourceType = resourceType;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getBiztalkUri() {
        return Optional.ofNullable(this.biztalkUri);
    }
    public Optional<String> getEntityConnectionString() {
        return Optional.ofNullable(this.entityConnectionString);
    }
    public Optional<String> getEntityName() {
        return Optional.ofNullable(this.entityName);
    }
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * Resource Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of resource.
     * 
     */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Resource Name.
     * 
     */
    public String getName() {
        return this.name;
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<String> getResourceConnectionString() {
        return Optional.ofNullable(this.resourceConnectionString);
    }
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppRelayServiceConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String biztalkUri;
        private @Nullable String entityConnectionString;
        private @Nullable String entityName;
        private @Nullable String hostname;
        private String id;
        private @Nullable String kind;
        private String name;
        private @Nullable Integer port;
        private @Nullable String resourceConnectionString;
        private @Nullable String resourceType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppRelayServiceConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.biztalkUri = defaults.biztalkUri;
    	      this.entityConnectionString = defaults.entityConnectionString;
    	      this.entityName = defaults.entityName;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.resourceConnectionString = defaults.resourceConnectionString;
    	      this.resourceType = defaults.resourceType;
    	      this.type = defaults.type;
        }

        public Builder setBiztalkUri(@Nullable String biztalkUri) {
            this.biztalkUri = biztalkUri;
            return this;
        }

        public Builder setEntityConnectionString(@Nullable String entityConnectionString) {
            this.entityConnectionString = entityConnectionString;
            return this;
        }

        public Builder setEntityName(@Nullable String entityName) {
            this.entityName = entityName;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setResourceConnectionString(@Nullable String resourceConnectionString) {
            this.resourceConnectionString = resourceConnectionString;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWebAppRelayServiceConnectionResult build() {
            return new GetWebAppRelayServiceConnectionResult(biztalkUri, entityConnectionString, entityName, hostname, id, kind, name, port, resourceConnectionString, resourceType, type);
        }
    }
}
