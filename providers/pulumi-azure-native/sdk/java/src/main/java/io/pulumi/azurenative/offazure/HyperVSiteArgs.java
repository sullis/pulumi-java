// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.offazure;

import io.pulumi.azurenative.offazure.inputs.SitePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HyperVSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final HyperVSiteArgs Empty = new HyperVSiteArgs();

    /**
     * eTag for concurrency control.
     * 
     */
    @InputImport(name="eTag")
    private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Azure location in which Sites is created.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Name of the Hyper-V site.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Nested properties of Hyper-V site.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<SitePropertiesArgs> properties;

    public Input<SitePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Site name.
     * 
     */
    @InputImport(name="siteName")
    private final @Nullable Input<String> siteName;

    public Input<String> getSiteName() {
        return this.siteName == null ? Input.empty() : this.siteName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public HyperVSiteArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<SitePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> siteName,
        @Nullable Input<Map<String,String>> tags) {
        this.eTag = eTag;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = siteName;
        this.tags = tags;
    }

    private HyperVSiteArgs() {
        this.eTag = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.siteName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HyperVSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<SitePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> siteName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(HyperVSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
    	      this.tags = defaults.tags;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setProperties(@Nullable Input<SitePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable SitePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSiteName(@Nullable Input<String> siteName) {
            this.siteName = siteName;
            return this;
        }

        public Builder setSiteName(@Nullable String siteName) {
            this.siteName = Input.ofNullable(siteName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public HyperVSiteArgs build() {
            return new HyperVSiteArgs(eTag, location, name, properties, resourceGroupName, siteName, tags);
        }
    }
}
