// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure.outputs;

import io.pulumi.azurenative.offazure.outputs.SitePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHyperVSiteResult {
    /**
     * eTag for concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * Resource Id.
     * 
     */
    private final String id;
    /**
     * Azure location in which Sites is created.
     * 
     */
    private final @Nullable String location;
    /**
     * Name of the Hyper-V site.
     * 
     */
    private final @Nullable String name;
    /**
     * Nested properties of Hyper-V site.
     * 
     */
    private final SitePropertiesResponse properties;
    private final @Nullable Map<String,String> tags;
    /**
     * Type of resource. Type = Microsoft.OffAzure/HyperVSites.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"eTag","id","location","name","properties","tags","type"})
    private GetHyperVSiteResult(
        @Nullable String eTag,
        String id,
        @Nullable String location,
        @Nullable String name,
        SitePropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.eTag = eTag;
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = name;
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * eTag for concurrency control.
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Resource Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Azure location in which Sites is created.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Name of the Hyper-V site.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Nested properties of Hyper-V site.
     * 
    */
    public SitePropertiesResponse getProperties() {
        return this.properties;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Type of resource. Type = Microsoft.OffAzure/HyperVSites.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHyperVSiteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private @Nullable String name;
        private SitePropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHyperVSiteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
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

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(SitePropertiesResponse properties) {
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
        public GetHyperVSiteResult build() {
            return new GetHyperVSiteResult(eTag, id, location, name, properties, tags, type);
        }
    }
}