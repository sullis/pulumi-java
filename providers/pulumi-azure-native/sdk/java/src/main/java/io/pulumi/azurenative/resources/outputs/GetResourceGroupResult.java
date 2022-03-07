// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.ResourceGroupPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResourceGroupResult {
    /**
     * The ID of the resource group.
     * 
     */
    private final String id;
    /**
     * The location of the resource group. It cannot be changed after the resource group has been created. It must be one of the supported Azure locations.
     * 
     */
    private final String location;
    /**
     * The ID of the resource that manages this resource group.
     * 
     */
    private final @Nullable String managedBy;
    /**
     * The name of the resource group.
     * 
     */
    private final String name;
    /**
     * The resource group properties.
     * 
     */
    private final ResourceGroupPropertiesResponse properties;
    /**
     * The tags attached to the resource group.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource group.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","managedBy","name","properties","tags","type"})
    private GetResourceGroupResult(
        String id,
        String location,
        @Nullable String managedBy,
        String name,
        ResourceGroupPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.managedBy = managedBy;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The ID of the resource group.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource group. It cannot be changed after the resource group has been created. It must be one of the supported Azure locations.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The ID of the resource that manages this resource group.
     * 
    */
    public Optional<String> getManagedBy() {
        return Optional.ofNullable(this.managedBy);
    }
    /**
     * The name of the resource group.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource group properties.
     * 
    */
    public ResourceGroupPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The tags attached to the resource group.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource group.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private @Nullable String managedBy;
        private String name;
        private ResourceGroupPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedBy = defaults.managedBy;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagedBy(@Nullable String managedBy) {
            this.managedBy = managedBy;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(ResourceGroupPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetResourceGroupResult build() {
            return new GetResourceGroupResult(id, location, managedBy, name, properties, tags, type);
        }
    }
}