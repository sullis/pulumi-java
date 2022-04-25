// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LocalDiskResponse extends com.pulumi.resources.InvokeArgs {

    public static final LocalDiskResponse Empty = new LocalDiskResponse();

    /**
     * Specifies the number of such disks.
     * 
     */
    @Import(name="diskCount", required=true)
    private Integer diskCount;

    /**
     * @return Specifies the number of such disks.
     * 
     */
    public Integer diskCount() {
        return this.diskCount;
    }

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
    private Integer diskSizeGb;

    /**
     * @return Specifies the size of the disk in base-2 GB.
     * 
     */
    public Integer diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    @Import(name="diskType", required=true)
    private String diskType;

    /**
     * @return Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    public String diskType() {
        return this.diskType;
    }

    private LocalDiskResponse() {}

    private LocalDiskResponse(LocalDiskResponse $) {
        this.diskCount = $.diskCount;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalDiskResponse $;

        public Builder() {
            $ = new LocalDiskResponse();
        }

        public Builder(LocalDiskResponse defaults) {
            $ = new LocalDiskResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskCount Specifies the number of such disks.
         * 
         * @return builder
         * 
         */
        public Builder diskCount(Integer diskCount) {
            $.diskCount = diskCount;
            return this;
        }

        /**
         * @param diskSizeGb Specifies the size of the disk in base-2 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskType Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
         * 
         * @return builder
         * 
         */
        public Builder diskType(String diskType) {
            $.diskType = diskType;
            return this;
        }

        public LocalDiskResponse build() {
            $.diskCount = Objects.requireNonNull($.diskCount, "expected parameter 'diskCount' to be non-null");
            $.diskSizeGb = Objects.requireNonNull($.diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
            $.diskType = Objects.requireNonNull($.diskType, "expected parameter 'diskType' to be non-null");
            return $;
        }
    }

}
