// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.genomics_v1alpha2.enums.DiskType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Google Compute Engine disk resource specification.
 * 
 */
public final class DiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskArgs Empty = new DiskArgs();

    /**
     * Required at create time and cannot be overridden at run time. Specifies the path in the docker container where files on this disk should be located. For example, if `mountPoint` is `/mnt/disk`, and the parameter has `localPath` `inputs/file.txt`, the docker container can access the data at `/mnt/disk/inputs/file.txt`.
     * 
     */
    @InputImport(name="mountPoint")
      private final @Nullable Input<String> mountPoint;

    public Input<String> getMountPoint() {
        return this.mountPoint == null ? Input.empty() : this.mountPoint;
    }

    /**
     * The name of the disk that can be used in the pipeline parameters. Must be 1 - 63 characters. The name "boot" is reserved for system use.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Specifies how a sourced-base persistent disk will be mounted. See https://cloud.google.com/compute/docs/disks/persistent-disks#use_multi_instances for more details. Can only be set at create time.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * The size of the disk. Defaults to 500 (GB). This field is not applicable for local SSD.
     * 
     */
    @InputImport(name="sizeGb")
      private final @Nullable Input<Integer> sizeGb;

    public Input<Integer> getSizeGb() {
        return this.sizeGb == null ? Input.empty() : this.sizeGb;
    }

    /**
     * The full or partial URL of the persistent disk to attach. See https://cloud.google.com/compute/docs/reference/latest/instances#resource and https://cloud.google.com/compute/docs/disks/persistent-disks#snapshots for more details.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The type of the disk to create.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<DiskType> type;

    public Input<DiskType> getType() {
        return this.type;
    }

    public DiskArgs(
        @Nullable Input<String> mountPoint,
        Input<String> name,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<Integer> sizeGb,
        @Nullable Input<String> source,
        Input<DiskType> type) {
        this.mountPoint = mountPoint;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = readOnly;
        this.sizeGb = sizeGb;
        this.source = source;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DiskArgs() {
        this.mountPoint = Input.empty();
        this.name = Input.empty();
        this.readOnly = Input.empty();
        this.sizeGb = Input.empty();
        this.source = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> mountPoint;
        private Input<String> name;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<Integer> sizeGb;
        private @Nullable Input<String> source;
        private Input<DiskType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPoint = defaults.mountPoint;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.sizeGb = defaults.sizeGb;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder setMountPoint(@Nullable Input<String> mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        public Builder setMountPoint(@Nullable String mountPoint) {
            this.mountPoint = Input.ofNullable(mountPoint);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setReadOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder setSizeGb(@Nullable Input<Integer> sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }

        public Builder setSizeGb(@Nullable Integer sizeGb) {
            this.sizeGb = Input.ofNullable(sizeGb);
            return this;
        }

        public Builder setSource(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder setType(Input<DiskType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(DiskType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public DiskArgs build() {
            return new DiskArgs(mountPoint, name, readOnly, sizeGb, source, type);
        }
    }
}