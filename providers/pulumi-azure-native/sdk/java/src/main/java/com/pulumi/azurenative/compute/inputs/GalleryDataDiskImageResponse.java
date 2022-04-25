// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.GalleryArtifactVersionSourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This is the data disk image.
 * 
 */
public final class GalleryDataDiskImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final GalleryDataDiskImageResponse Empty = new GalleryDataDiskImageResponse();

    /**
     * The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
     * 
     */
    @Import(name="hostCaching")
    private @Nullable String hostCaching;

    /**
     * @return The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
     * 
     */
    public Optional<String> hostCaching() {
        return Optional.ofNullable(this.hostCaching);
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @Import(name="lun", required=true)
    private Integer lun;

    /**
     * @return This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * This property indicates the size of the VHD to be created.
     * 
     */
    @Import(name="sizeInGB", required=true)
    private Integer sizeInGB;

    /**
     * @return This property indicates the size of the VHD to be created.
     * 
     */
    public Integer sizeInGB() {
        return this.sizeInGB;
    }

    /**
     * The gallery artifact version source.
     * 
     */
    @Import(name="source")
    private @Nullable GalleryArtifactVersionSourceResponse source;

    /**
     * @return The gallery artifact version source.
     * 
     */
    public Optional<GalleryArtifactVersionSourceResponse> source() {
        return Optional.ofNullable(this.source);
    }

    private GalleryDataDiskImageResponse() {}

    private GalleryDataDiskImageResponse(GalleryDataDiskImageResponse $) {
        this.hostCaching = $.hostCaching;
        this.lun = $.lun;
        this.sizeInGB = $.sizeInGB;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GalleryDataDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GalleryDataDiskImageResponse $;

        public Builder() {
            $ = new GalleryDataDiskImageResponse();
        }

        public Builder(GalleryDataDiskImageResponse defaults) {
            $ = new GalleryDataDiskImageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostCaching The host caching of the disk. Valid values are &#39;None&#39;, &#39;ReadOnly&#39;, and &#39;ReadWrite&#39;
         * 
         * @return builder
         * 
         */
        public Builder hostCaching(@Nullable String hostCaching) {
            $.hostCaching = hostCaching;
            return this;
        }

        /**
         * @param lun This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
         * 
         * @return builder
         * 
         */
        public Builder lun(Integer lun) {
            $.lun = lun;
            return this;
        }

        /**
         * @param sizeInGB This property indicates the size of the VHD to be created.
         * 
         * @return builder
         * 
         */
        public Builder sizeInGB(Integer sizeInGB) {
            $.sizeInGB = sizeInGB;
            return this;
        }

        /**
         * @param source The gallery artifact version source.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable GalleryArtifactVersionSourceResponse source) {
            $.source = source;
            return this;
        }

        public GalleryDataDiskImageResponse build() {
            $.lun = Objects.requireNonNull($.lun, "expected parameter 'lun' to be non-null");
            $.sizeInGB = Objects.requireNonNull($.sizeInGB, "expected parameter 'sizeInGB' to be non-null");
            return $;
        }
    }

}
