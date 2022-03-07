// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalDiskArgs Empty = new LocalDiskArgs();

    /**
     * Specifies the number of such disks.
     * 
     */
    @InputImport(name="diskCount")
      private final @Nullable Input<Integer> diskCount;

    public Input<Integer> getDiskCount() {
        return this.diskCount == null ? Input.empty() : this.diskCount;
    }

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    @InputImport(name="diskType")
      private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    public LocalDiskArgs(
        @Nullable Input<Integer> diskCount,
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<String> diskType) {
        this.diskCount = diskCount;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
    }

    private LocalDiskArgs() {
        this.diskCount = Input.empty();
        this.diskSizeGb = Input.empty();
        this.diskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> diskCount;
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<String> diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCount = defaults.diskCount;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
        }

        public Builder setDiskCount(@Nullable Input<Integer> diskCount) {
            this.diskCount = diskCount;
            return this;
        }

        public Builder setDiskCount(@Nullable Integer diskCount) {
            this.diskCount = Input.ofNullable(diskCount);
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setDiskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }
        public LocalDiskArgs build() {
            return new LocalDiskArgs(diskCount, diskSizeGb, diskType);
        }
    }
}