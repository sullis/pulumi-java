// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.GalleryArtifactVersionSourceResponse;
import com.pulumi.azurenative.compute.outputs.GalleryDataDiskImageResponse;
import com.pulumi.azurenative.compute.outputs.GalleryOSDiskImageResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GalleryImageVersionStorageProfileResponse {
    /**
     * @return A list of data disk images.
     * 
     */
    private final @Nullable List<GalleryDataDiskImageResponse> dataDiskImages;
    /**
     * @return This is the OS disk image.
     * 
     */
    private final @Nullable GalleryOSDiskImageResponse osDiskImage;
    /**
     * @return The gallery artifact version source.
     * 
     */
    private final @Nullable GalleryArtifactVersionSourceResponse source;

    @CustomType.Constructor
    private GalleryImageVersionStorageProfileResponse(
        @CustomType.Parameter("dataDiskImages") @Nullable List<GalleryDataDiskImageResponse> dataDiskImages,
        @CustomType.Parameter("osDiskImage") @Nullable GalleryOSDiskImageResponse osDiskImage,
        @CustomType.Parameter("source") @Nullable GalleryArtifactVersionSourceResponse source) {
        this.dataDiskImages = dataDiskImages;
        this.osDiskImage = osDiskImage;
        this.source = source;
    }

    /**
     * @return A list of data disk images.
     * 
     */
    public List<GalleryDataDiskImageResponse> dataDiskImages() {
        return this.dataDiskImages == null ? List.of() : this.dataDiskImages;
    }
    /**
     * @return This is the OS disk image.
     * 
     */
    public Optional<GalleryOSDiskImageResponse> osDiskImage() {
        return Optional.ofNullable(this.osDiskImage);
    }
    /**
     * @return The gallery artifact version source.
     * 
     */
    public Optional<GalleryArtifactVersionSourceResponse> source() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryImageVersionStorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GalleryDataDiskImageResponse> dataDiskImages;
        private @Nullable GalleryOSDiskImageResponse osDiskImage;
        private @Nullable GalleryArtifactVersionSourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryImageVersionStorageProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskImages = defaults.dataDiskImages;
    	      this.osDiskImage = defaults.osDiskImage;
    	      this.source = defaults.source;
        }

        public Builder dataDiskImages(@Nullable List<GalleryDataDiskImageResponse> dataDiskImages) {
            this.dataDiskImages = dataDiskImages;
            return this;
        }
        public Builder dataDiskImages(GalleryDataDiskImageResponse... dataDiskImages) {
            return dataDiskImages(List.of(dataDiskImages));
        }
        public Builder osDiskImage(@Nullable GalleryOSDiskImageResponse osDiskImage) {
            this.osDiskImage = osDiskImage;
            return this;
        }
        public Builder source(@Nullable GalleryArtifactVersionSourceResponse source) {
            this.source = source;
            return this;
        }        public GalleryImageVersionStorageProfileResponse build() {
            return new GalleryImageVersionStorageProfileResponse(dataDiskImages, osDiskImage, source);
        }
    }
}
