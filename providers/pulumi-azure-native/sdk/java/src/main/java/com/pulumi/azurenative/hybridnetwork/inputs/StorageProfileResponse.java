// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridnetwork.inputs;

import com.pulumi.azurenative.hybridnetwork.inputs.DataDiskResponse;
import com.pulumi.azurenative.hybridnetwork.inputs.ImageReferenceResponse;
import com.pulumi.azurenative.hybridnetwork.inputs.OsDiskResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the storage settings for the virtual machine disks.
 * 
 */
public final class StorageProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final StorageProfileResponse Empty = new StorageProfileResponse();

    /**
     * Specifies the parameters that are used to add a data disk to a virtual machine.
     * 
     */
    @Import(name="dataDisks")
    private @Nullable List<DataDiskResponse> dataDisks;

    /**
     * @return Specifies the parameters that are used to add a data disk to a virtual machine.
     * 
     */
    public Optional<List<DataDiskResponse>> dataDisks() {
        return Optional.ofNullable(this.dataDisks);
    }

    /**
     * The image reference properties.
     * 
     */
    @Import(name="imageReference")
    private @Nullable ImageReferenceResponse imageReference;

    /**
     * @return The image reference properties.
     * 
     */
    public Optional<ImageReferenceResponse> imageReference() {
        return Optional.ofNullable(this.imageReference);
    }

    /**
     * Specifies information about the operating system disk used by the virtual machine.
     * 
     */
    @Import(name="osDisk")
    private @Nullable OsDiskResponse osDisk;

    /**
     * @return Specifies information about the operating system disk used by the virtual machine.
     * 
     */
    public Optional<OsDiskResponse> osDisk() {
        return Optional.ofNullable(this.osDisk);
    }

    private StorageProfileResponse() {}

    private StorageProfileResponse(StorageProfileResponse $) {
        this.dataDisks = $.dataDisks;
        this.imageReference = $.imageReference;
        this.osDisk = $.osDisk;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageProfileResponse $;

        public Builder() {
            $ = new StorageProfileResponse();
        }

        public Builder(StorageProfileResponse defaults) {
            $ = new StorageProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataDisks Specifies the parameters that are used to add a data disk to a virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(@Nullable List<DataDiskResponse> dataDisks) {
            $.dataDisks = dataDisks;
            return this;
        }

        /**
         * @param dataDisks Specifies the parameters that are used to add a data disk to a virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder dataDisks(DataDiskResponse... dataDisks) {
            return dataDisks(List.of(dataDisks));
        }

        /**
         * @param imageReference The image reference properties.
         * 
         * @return builder
         * 
         */
        public Builder imageReference(@Nullable ImageReferenceResponse imageReference) {
            $.imageReference = imageReference;
            return this;
        }

        /**
         * @param osDisk Specifies information about the operating system disk used by the virtual machine.
         * 
         * @return builder
         * 
         */
        public Builder osDisk(@Nullable OsDiskResponse osDisk) {
            $.osDisk = osDisk;
            return this;
        }

        public StorageProfileResponse build() {
            return $;
        }
    }

}
