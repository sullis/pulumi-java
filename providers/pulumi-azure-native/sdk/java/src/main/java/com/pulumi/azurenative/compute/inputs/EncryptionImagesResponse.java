// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.DataDiskImageEncryptionResponse;
import com.pulumi.azurenative.compute.inputs.OSDiskImageEncryptionResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional. Allows users to provide customer managed keys for encrypting the OS and data disks in the gallery artifact.
 * 
 */
public final class EncryptionImagesResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionImagesResponse Empty = new EncryptionImagesResponse();

    /**
     * A list of encryption specifications for data disk images.
     * 
     */
    @Import(name="dataDiskImages")
    private @Nullable List<DataDiskImageEncryptionResponse> dataDiskImages;

    /**
     * @return A list of encryption specifications for data disk images.
     * 
     */
    public Optional<List<DataDiskImageEncryptionResponse>> dataDiskImages() {
        return Optional.ofNullable(this.dataDiskImages);
    }

    /**
     * Contains encryption settings for an OS disk image.
     * 
     */
    @Import(name="osDiskImage")
    private @Nullable OSDiskImageEncryptionResponse osDiskImage;

    /**
     * @return Contains encryption settings for an OS disk image.
     * 
     */
    public Optional<OSDiskImageEncryptionResponse> osDiskImage() {
        return Optional.ofNullable(this.osDiskImage);
    }

    private EncryptionImagesResponse() {}

    private EncryptionImagesResponse(EncryptionImagesResponse $) {
        this.dataDiskImages = $.dataDiskImages;
        this.osDiskImage = $.osDiskImage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionImagesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionImagesResponse $;

        public Builder() {
            $ = new EncryptionImagesResponse();
        }

        public Builder(EncryptionImagesResponse defaults) {
            $ = new EncryptionImagesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataDiskImages A list of encryption specifications for data disk images.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskImages(@Nullable List<DataDiskImageEncryptionResponse> dataDiskImages) {
            $.dataDiskImages = dataDiskImages;
            return this;
        }

        /**
         * @param dataDiskImages A list of encryption specifications for data disk images.
         * 
         * @return builder
         * 
         */
        public Builder dataDiskImages(DataDiskImageEncryptionResponse... dataDiskImages) {
            return dataDiskImages(List.of(dataDiskImages));
        }

        /**
         * @param osDiskImage Contains encryption settings for an OS disk image.
         * 
         * @return builder
         * 
         */
        public Builder osDiskImage(@Nullable OSDiskImageEncryptionResponse osDiskImage) {
            $.osDiskImage = osDiskImage;
            return this;
        }

        public EncryptionImagesResponse build() {
            return $;
        }
    }

}
