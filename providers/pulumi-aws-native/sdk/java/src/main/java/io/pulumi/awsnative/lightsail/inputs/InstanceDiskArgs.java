// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Disk associated with the Instance.
 * 
 */
public final class InstanceDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceDiskArgs Empty = new InstanceDiskArgs();

    /**
     * Instance attached to the disk.
     * 
     */
    @InputImport(name="attachedTo")
    private final @Nullable Input<String> attachedTo;

    public Input<String> getAttachedTo() {
        return this.attachedTo == null ? Input.empty() : this.attachedTo;
    }

    /**
     * Attachment state of the disk.
     * 
     */
    @InputImport(name="attachmentState")
    private final @Nullable Input<String> attachmentState;

    public Input<String> getAttachmentState() {
        return this.attachmentState == null ? Input.empty() : this.attachmentState;
    }

    /**
     * The names to use for your new Lightsail disk.
     * 
     */
    @InputImport(name="diskName", required=true)
    private final Input<String> diskName;

    public Input<String> getDiskName() {
        return this.diskName;
    }

    /**
     * IOPS of disk.
     * 
     */
    @InputImport(name="iOPS")
    private final @Nullable Input<Integer> iOPS;

    public Input<Integer> getIOPS() {
        return this.iOPS == null ? Input.empty() : this.iOPS;
    }

    /**
     * Is the Attached disk is the system disk of the Instance.
     * 
     */
    @InputImport(name="isSystemDisk")
    private final @Nullable Input<Boolean> isSystemDisk;

    public Input<Boolean> getIsSystemDisk() {
        return this.isSystemDisk == null ? Input.empty() : this.isSystemDisk;
    }

    /**
     * Path of the disk attached to the instance.
     * 
     */
    @InputImport(name="path", required=true)
    private final Input<String> path;

    public Input<String> getPath() {
        return this.path;
    }

    /**
     * Size of the disk attached to the Instance.
     * 
     */
    @InputImport(name="sizeInGb")
    private final @Nullable Input<String> sizeInGb;

    public Input<String> getSizeInGb() {
        return this.sizeInGb == null ? Input.empty() : this.sizeInGb;
    }

    public InstanceDiskArgs(
        @Nullable Input<String> attachedTo,
        @Nullable Input<String> attachmentState,
        Input<String> diskName,
        @Nullable Input<Integer> iOPS,
        @Nullable Input<Boolean> isSystemDisk,
        Input<String> path,
        @Nullable Input<String> sizeInGb) {
        this.attachedTo = attachedTo;
        this.attachmentState = attachmentState;
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.iOPS = iOPS;
        this.isSystemDisk = isSystemDisk;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.sizeInGb = sizeInGb;
    }

    private InstanceDiskArgs() {
        this.attachedTo = Input.empty();
        this.attachmentState = Input.empty();
        this.diskName = Input.empty();
        this.iOPS = Input.empty();
        this.isSystemDisk = Input.empty();
        this.path = Input.empty();
        this.sizeInGb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachedTo;
        private @Nullable Input<String> attachmentState;
        private Input<String> diskName;
        private @Nullable Input<Integer> iOPS;
        private @Nullable Input<Boolean> isSystemDisk;
        private Input<String> path;
        private @Nullable Input<String> sizeInGb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTo = defaults.attachedTo;
    	      this.attachmentState = defaults.attachmentState;
    	      this.diskName = defaults.diskName;
    	      this.iOPS = defaults.iOPS;
    	      this.isSystemDisk = defaults.isSystemDisk;
    	      this.path = defaults.path;
    	      this.sizeInGb = defaults.sizeInGb;
        }

        public Builder setAttachedTo(@Nullable Input<String> attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }

        public Builder setAttachedTo(@Nullable String attachedTo) {
            this.attachedTo = Input.ofNullable(attachedTo);
            return this;
        }

        public Builder setAttachmentState(@Nullable Input<String> attachmentState) {
            this.attachmentState = attachmentState;
            return this;
        }

        public Builder setAttachmentState(@Nullable String attachmentState) {
            this.attachmentState = Input.ofNullable(attachmentState);
            return this;
        }

        public Builder setDiskName(Input<String> diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Input.of(Objects.requireNonNull(diskName));
            return this;
        }

        public Builder setIOPS(@Nullable Input<Integer> iOPS) {
            this.iOPS = iOPS;
            return this;
        }

        public Builder setIOPS(@Nullable Integer iOPS) {
            this.iOPS = Input.ofNullable(iOPS);
            return this;
        }

        public Builder setIsSystemDisk(@Nullable Input<Boolean> isSystemDisk) {
            this.isSystemDisk = isSystemDisk;
            return this;
        }

        public Builder setIsSystemDisk(@Nullable Boolean isSystemDisk) {
            this.isSystemDisk = Input.ofNullable(isSystemDisk);
            return this;
        }

        public Builder setPath(Input<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Input.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder setSizeInGb(@Nullable Input<String> sizeInGb) {
            this.sizeInGb = sizeInGb;
            return this;
        }

        public Builder setSizeInGb(@Nullable String sizeInGb) {
            this.sizeInGb = Input.ofNullable(sizeInGb);
            return this;
        }

        public InstanceDiskArgs build() {
            return new InstanceDiskArgs(attachedTo, attachmentState, diskName, iOPS, isSystemDisk, path, sizeInGb);
        }
    }
}
