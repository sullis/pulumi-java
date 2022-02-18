// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.OperatingSystemTypes;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GalleryApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GalleryApplicationArgs Empty = new GalleryApplicationArgs();

    /**
     * The description of this gallery Application Definition resource. This property is updatable.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The end of life date of the gallery Application Definition. This property can be used for decommissioning purposes. This property is updatable.
     * 
     */
    @InputImport(name="endOfLifeDate")
    private final @Nullable Input<String> endOfLifeDate;

    public Input<String> getEndOfLifeDate() {
        return this.endOfLifeDate == null ? Input.empty() : this.endOfLifeDate;
    }

    /**
     * The Eula agreement for the gallery Application Definition.
     * 
     */
    @InputImport(name="eula")
    private final @Nullable Input<String> eula;

    public Input<String> getEula() {
        return this.eula == null ? Input.empty() : this.eula;
    }

    /**
     * The name of the gallery Application Definition to be created or updated. The allowed characters are alphabets and numbers with dots, dashes, and periods allowed in the middle. The maximum length is 80 characters.
     * 
     */
    @InputImport(name="galleryApplicationName")
    private final @Nullable Input<String> galleryApplicationName;

    public Input<String> getGalleryApplicationName() {
        return this.galleryApplicationName == null ? Input.empty() : this.galleryApplicationName;
    }

    /**
     * The name of the Shared Application Gallery in which the Application Definition is to be created.
     * 
     */
    @InputImport(name="galleryName", required=true)
    private final Input<String> galleryName;

    public Input<String> getGalleryName() {
        return this.galleryName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The privacy statement uri.
     * 
     */
    @InputImport(name="privacyStatementUri")
    private final @Nullable Input<String> privacyStatementUri;

    public Input<String> getPrivacyStatementUri() {
        return this.privacyStatementUri == null ? Input.empty() : this.privacyStatementUri;
    }

    /**
     * The release note uri.
     * 
     */
    @InputImport(name="releaseNoteUri")
    private final @Nullable Input<String> releaseNoteUri;

    public Input<String> getReleaseNoteUri() {
        return this.releaseNoteUri == null ? Input.empty() : this.releaseNoteUri;
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
     * This property allows you to specify the supported type of the OS that application is built for. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="supportedOSType", required=true)
    private final Input<OperatingSystemTypes> supportedOSType;

    public Input<OperatingSystemTypes> getSupportedOSType() {
        return this.supportedOSType;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public GalleryApplicationArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> endOfLifeDate,
        @Nullable Input<String> eula,
        @Nullable Input<String> galleryApplicationName,
        Input<String> galleryName,
        @Nullable Input<String> location,
        @Nullable Input<String> privacyStatementUri,
        @Nullable Input<String> releaseNoteUri,
        Input<String> resourceGroupName,
        Input<OperatingSystemTypes> supportedOSType,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.endOfLifeDate = endOfLifeDate;
        this.eula = eula;
        this.galleryApplicationName = galleryApplicationName;
        this.galleryName = Objects.requireNonNull(galleryName, "expected parameter 'galleryName' to be non-null");
        this.location = location;
        this.privacyStatementUri = privacyStatementUri;
        this.releaseNoteUri = releaseNoteUri;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.supportedOSType = Objects.requireNonNull(supportedOSType, "expected parameter 'supportedOSType' to be non-null");
        this.tags = tags;
    }

    private GalleryApplicationArgs() {
        this.description = Input.empty();
        this.endOfLifeDate = Input.empty();
        this.eula = Input.empty();
        this.galleryApplicationName = Input.empty();
        this.galleryName = Input.empty();
        this.location = Input.empty();
        this.privacyStatementUri = Input.empty();
        this.releaseNoteUri = Input.empty();
        this.resourceGroupName = Input.empty();
        this.supportedOSType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> endOfLifeDate;
        private @Nullable Input<String> eula;
        private @Nullable Input<String> galleryApplicationName;
        private Input<String> galleryName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> privacyStatementUri;
        private @Nullable Input<String> releaseNoteUri;
        private Input<String> resourceGroupName;
        private Input<OperatingSystemTypes> supportedOSType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.endOfLifeDate = defaults.endOfLifeDate;
    	      this.eula = defaults.eula;
    	      this.galleryApplicationName = defaults.galleryApplicationName;
    	      this.galleryName = defaults.galleryName;
    	      this.location = defaults.location;
    	      this.privacyStatementUri = defaults.privacyStatementUri;
    	      this.releaseNoteUri = defaults.releaseNoteUri;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.supportedOSType = defaults.supportedOSType;
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

        public Builder setEndOfLifeDate(@Nullable Input<String> endOfLifeDate) {
            this.endOfLifeDate = endOfLifeDate;
            return this;
        }

        public Builder setEndOfLifeDate(@Nullable String endOfLifeDate) {
            this.endOfLifeDate = Input.ofNullable(endOfLifeDate);
            return this;
        }

        public Builder setEula(@Nullable Input<String> eula) {
            this.eula = eula;
            return this;
        }

        public Builder setEula(@Nullable String eula) {
            this.eula = Input.ofNullable(eula);
            return this;
        }

        public Builder setGalleryApplicationName(@Nullable Input<String> galleryApplicationName) {
            this.galleryApplicationName = galleryApplicationName;
            return this;
        }

        public Builder setGalleryApplicationName(@Nullable String galleryApplicationName) {
            this.galleryApplicationName = Input.ofNullable(galleryApplicationName);
            return this;
        }

        public Builder setGalleryName(Input<String> galleryName) {
            this.galleryName = Objects.requireNonNull(galleryName);
            return this;
        }

        public Builder setGalleryName(String galleryName) {
            this.galleryName = Input.of(Objects.requireNonNull(galleryName));
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

        public Builder setPrivacyStatementUri(@Nullable Input<String> privacyStatementUri) {
            this.privacyStatementUri = privacyStatementUri;
            return this;
        }

        public Builder setPrivacyStatementUri(@Nullable String privacyStatementUri) {
            this.privacyStatementUri = Input.ofNullable(privacyStatementUri);
            return this;
        }

        public Builder setReleaseNoteUri(@Nullable Input<String> releaseNoteUri) {
            this.releaseNoteUri = releaseNoteUri;
            return this;
        }

        public Builder setReleaseNoteUri(@Nullable String releaseNoteUri) {
            this.releaseNoteUri = Input.ofNullable(releaseNoteUri);
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

        public Builder setSupportedOSType(Input<OperatingSystemTypes> supportedOSType) {
            this.supportedOSType = Objects.requireNonNull(supportedOSType);
            return this;
        }

        public Builder setSupportedOSType(OperatingSystemTypes supportedOSType) {
            this.supportedOSType = Input.of(Objects.requireNonNull(supportedOSType));
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

        public GalleryApplicationArgs build() {
            return new GalleryApplicationArgs(description, endOfLifeDate, eula, galleryApplicationName, galleryName, location, privacyStatementUri, releaseNoteUri, resourceGroupName, supportedOSType, tags);
        }
    }
}
