// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GalleryImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryImageArgs Empty = new GalleryImageArgs();

    /**
     * The name of the gallery Image.
     * 
     */
    @InputImport(name="galleryImageName")
    private final @Nullable Input<String> galleryImageName;

    public Input<String> getGalleryImageName() {
        return this.galleryImageName == null ? Input.empty() : this.galleryImageName;
    }

    /**
     * Indicates whether this gallery image is enabled.
     * 
     */
    @InputImport(name="isEnabled")
    private final @Nullable Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled == null ? Input.empty() : this.isEnabled;
    }

    /**
     * Indicates whether this gallery has been overridden for this lab account
     * 
     */
    @InputImport(name="isOverride")
    private final @Nullable Input<Boolean> isOverride;

    public Input<Boolean> getIsOverride() {
        return this.isOverride == null ? Input.empty() : this.isOverride;
    }

    /**
     * Indicates if the plan has been authorized for programmatic deployment.
     * 
     */
    @InputImport(name="isPlanAuthorized")
    private final @Nullable Input<Boolean> isPlanAuthorized;

    public Input<Boolean> getIsPlanAuthorized() {
        return this.isPlanAuthorized == null ? Input.empty() : this.isPlanAuthorized;
    }

    /**
     * The name of the lab Account.
     * 
     */
    @InputImport(name="labAccountName", required=true)
    private final Input<String> labAccountName;

    public Input<String> getLabAccountName() {
        return this.labAccountName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The provisioning status of the resource.
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @InputImport(name="uniqueIdentifier")
    private final @Nullable Input<String> uniqueIdentifier;

    public Input<String> getUniqueIdentifier() {
        return this.uniqueIdentifier == null ? Input.empty() : this.uniqueIdentifier;
    }

    public GalleryImageArgs(
        @Nullable Input<String> galleryImageName,
        @Nullable Input<Boolean> isEnabled,
        @Nullable Input<Boolean> isOverride,
        @Nullable Input<Boolean> isPlanAuthorized,
        Input<String> labAccountName,
        @Nullable Input<String> location,
        @Nullable Input<String> provisioningState,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> uniqueIdentifier) {
        this.galleryImageName = galleryImageName;
        this.isEnabled = isEnabled;
        this.isOverride = isOverride;
        this.isPlanAuthorized = isPlanAuthorized;
        this.labAccountName = Objects.requireNonNull(labAccountName, "expected parameter 'labAccountName' to be non-null");
        this.location = location;
        this.provisioningState = provisioningState;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    private GalleryImageArgs() {
        this.galleryImageName = Input.empty();
        this.isEnabled = Input.empty();
        this.isOverride = Input.empty();
        this.isPlanAuthorized = Input.empty();
        this.labAccountName = Input.empty();
        this.location = Input.empty();
        this.provisioningState = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.uniqueIdentifier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> galleryImageName;
        private @Nullable Input<Boolean> isEnabled;
        private @Nullable Input<Boolean> isOverride;
        private @Nullable Input<Boolean> isPlanAuthorized;
        private Input<String> labAccountName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> provisioningState;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.galleryImageName = defaults.galleryImageName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isOverride = defaults.isOverride;
    	      this.isPlanAuthorized = defaults.isPlanAuthorized;
    	      this.labAccountName = defaults.labAccountName;
    	      this.location = defaults.location;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setGalleryImageName(@Nullable Input<String> galleryImageName) {
            this.galleryImageName = galleryImageName;
            return this;
        }

        public Builder setGalleryImageName(@Nullable String galleryImageName) {
            this.galleryImageName = Input.ofNullable(galleryImageName);
            return this;
        }

        public Builder setIsEnabled(@Nullable Input<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Input.ofNullable(isEnabled);
            return this;
        }

        public Builder setIsOverride(@Nullable Input<Boolean> isOverride) {
            this.isOverride = isOverride;
            return this;
        }

        public Builder setIsOverride(@Nullable Boolean isOverride) {
            this.isOverride = Input.ofNullable(isOverride);
            return this;
        }

        public Builder setIsPlanAuthorized(@Nullable Input<Boolean> isPlanAuthorized) {
            this.isPlanAuthorized = isPlanAuthorized;
            return this;
        }

        public Builder setIsPlanAuthorized(@Nullable Boolean isPlanAuthorized) {
            this.isPlanAuthorized = Input.ofNullable(isPlanAuthorized);
            return this;
        }

        public Builder setLabAccountName(Input<String> labAccountName) {
            this.labAccountName = Objects.requireNonNull(labAccountName);
            return this;
        }

        public Builder setLabAccountName(String labAccountName) {
            this.labAccountName = Input.of(Objects.requireNonNull(labAccountName));
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

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable Input<String> uniqueIdentifier) {
            this.uniqueIdentifier = uniqueIdentifier;
            return this;
        }

        public Builder setUniqueIdentifier(@Nullable String uniqueIdentifier) {
            this.uniqueIdentifier = Input.ofNullable(uniqueIdentifier);
            return this;
        }

        public GalleryImageArgs build() {
            return new GalleryImageArgs(galleryImageName, isEnabled, isOverride, isPlanAuthorized, labAccountName, location, provisioningState, resourceGroupName, tags, uniqueIdentifier);
        }
    }
}
