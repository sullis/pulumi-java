// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMaintenanceConfigurationResult {
    /**
     * Gets or sets extensionProperties of the maintenanceConfiguration. This is for future use only and would be a set of key value pairs for additional information e.g. whether to follow SDP etc.
     * 
     */
    private final @Nullable Map<String,String> extensionProperties;
    /**
     * Fully qualified identifier of the resource
     * 
     */
    private final String id;
    /**
     * Gets or sets location of the resource
     * 
     */
    private final @Nullable String location;
    /**
     * Gets or sets maintenanceScope of the configuration. It represent the impact area of the maintenance
     * 
     */
    private final @Nullable String maintenanceScope;
    /**
     * Name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets namespace of the resource e.g. Microsoft.Maintenance or Microsoft.Sql
     * 
     */
    private final @Nullable String namespace;
    /**
     * Gets or sets tags of the resource
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Type of the resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMaintenanceConfigurationResult(
        @CustomType.Parameter("extensionProperties") @Nullable Map<String,String> extensionProperties,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("maintenanceScope") @Nullable String maintenanceScope,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.extensionProperties = extensionProperties;
        this.id = id;
        this.location = location;
        this.maintenanceScope = maintenanceScope;
        this.name = name;
        this.namespace = namespace;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Gets or sets extensionProperties of the maintenanceConfiguration. This is for future use only and would be a set of key value pairs for additional information e.g. whether to follow SDP etc.
     * 
    */
    public Map<String,String> getExtensionProperties() {
        return this.extensionProperties == null ? Map.of() : this.extensionProperties;
    }
    /**
     * Fully qualified identifier of the resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets location of the resource
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets or sets maintenanceScope of the configuration. It represent the impact area of the maintenance
     * 
    */
    public Optional<String> getMaintenanceScope() {
        return Optional.ofNullable(this.maintenanceScope);
    }
    /**
     * Name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets namespace of the resource e.g. Microsoft.Maintenance or Microsoft.Sql
     * 
    */
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * Gets or sets tags of the resource
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of the resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> extensionProperties;
        private String id;
        private @Nullable String location;
        private @Nullable String maintenanceScope;
        private String name;
        private @Nullable String namespace;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionProperties = defaults.extensionProperties;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.maintenanceScope = defaults.maintenanceScope;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder extensionProperties(@Nullable Map<String,String> extensionProperties) {
            this.extensionProperties = extensionProperties;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder maintenanceScope(@Nullable String maintenanceScope) {
            this.maintenanceScope = maintenanceScope;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetMaintenanceConfigurationResult build() {
            return new GetMaintenanceConfigurationResult(extensionProperties, id, location, maintenanceScope, name, namespace, tags, type);
        }
    }
}
