// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.enums.LocalDiskInitializeParamsDiskType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new runtime. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class LocalDiskInitializeParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocalDiskInitializeParamsArgs Empty = new LocalDiskInitializeParamsArgs();

    /**
     * Optional. Provide this property when creating the disk.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Provide this property when creating the disk.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
     */
    @Import(name="diskName")
    private @Nullable Output<String> diskName;

    /**
     * @return Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
     */
    public Optional<Output<String>> diskName() {
        return Optional.ofNullable(this.diskName);
    }

    /**
     * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<String> diskSizeGb;

    /**
     * @return Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
     */
    public Optional<Output<String>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @Import(name="diskType")
    private @Nullable Output<LocalDiskInitializeParamsDiskType> diskType;

    /**
     * @return Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    public Optional<Output<LocalDiskInitializeParamsDiskType>> diskType() {
        return Optional.ofNullable(this.diskType);
    }

    /**
     * Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    private LocalDiskInitializeParamsArgs() {}

    private LocalDiskInitializeParamsArgs(LocalDiskInitializeParamsArgs $) {
        this.description = $.description;
        this.diskName = $.diskName;
        this.diskSizeGb = $.diskSizeGb;
        this.diskType = $.diskType;
        this.labels = $.labels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocalDiskInitializeParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocalDiskInitializeParamsArgs $;

        public Builder() {
            $ = new LocalDiskInitializeParamsArgs();
        }

        public Builder(LocalDiskInitializeParamsArgs defaults) {
            $ = new LocalDiskInitializeParamsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Provide this property when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Provide this property when creating the disk.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskName Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
         * 
         * @return builder
         * 
         */
        public Builder diskName(@Nullable Output<String> diskName) {
            $.diskName = diskName;
            return this;
        }

        /**
         * @param diskName Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
         * 
         * @return builder
         * 
         */
        public Builder diskName(String diskName) {
            return diskName(Output.of(diskName));
        }

        /**
         * @param diskSizeGb Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param diskType Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
         * 
         * @return builder
         * 
         */
        public Builder diskType(@Nullable Output<LocalDiskInitializeParamsDiskType> diskType) {
            $.diskType = diskType;
            return this;
        }

        /**
         * @param diskType Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
         * 
         * @return builder
         * 
         */
        public Builder diskType(LocalDiskInitializeParamsDiskType diskType) {
            return diskType(Output.of(diskType));
        }

        /**
         * @param labels Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public LocalDiskInitializeParamsArgs build() {
            return $;
        }
    }

}
