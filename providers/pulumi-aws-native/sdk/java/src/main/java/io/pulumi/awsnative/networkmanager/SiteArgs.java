// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.networkmanager.inputs.SiteLocationArgs;
import io.pulumi.awsnative.networkmanager.inputs.SiteTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final SiteArgs Empty = new SiteArgs();

    /**
     * The description of the site.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the global network.
     * 
     */
    @InputImport(name="globalNetworkId", required=true)
      private final Input<String> globalNetworkId;

    public Input<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The location of the site.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<SiteLocationArgs> location;

    public Input<SiteLocationArgs> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The tags for the site.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<SiteTagArgs>> tags;

    public Input<List<SiteTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SiteArgs(
        @Nullable Input<String> description,
        Input<String> globalNetworkId,
        @Nullable Input<SiteLocationArgs> location,
        @Nullable Input<List<SiteTagArgs>> tags) {
        this.description = description;
        this.globalNetworkId = Objects.requireNonNull(globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
        this.location = location;
        this.tags = tags;
    }

    private SiteArgs() {
        this.description = Input.empty();
        this.globalNetworkId = Input.empty();
        this.location = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> globalNetworkId;
        private @Nullable Input<SiteLocationArgs> location;
        private @Nullable Input<List<SiteTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.globalNetworkId = defaults.globalNetworkId;
    	      this.location = defaults.location;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGlobalNetworkId(Input<String> globalNetworkId) {
            this.globalNetworkId = Objects.requireNonNull(globalNetworkId);
            return this;
        }

        public Builder setGlobalNetworkId(String globalNetworkId) {
            this.globalNetworkId = Input.of(Objects.requireNonNull(globalNetworkId));
            return this;
        }

        public Builder setLocation(@Nullable Input<SiteLocationArgs> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable SiteLocationArgs location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setTags(@Nullable Input<List<SiteTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SiteTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SiteArgs build() {
            return new SiteArgs(description, globalNetworkId, location, tags);
        }
    }
}