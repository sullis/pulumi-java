// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.DiskAddOn;
import io.pulumi.awsnative.lightsail.outputs.DiskLocation;
import io.pulumi.awsnative.lightsail.outputs.DiskTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiskResult {
    /**
     * An array of objects representing the add-ons to enable for the new instance.
     * 
     */
    private final @Nullable List<DiskAddOn> addOns;
    /**
     * Name of the attached Lightsail Instance
     * 
     */
    private final @Nullable String attachedTo;
    /**
     * Attachment State of the Lightsail disk
     * 
     */
    private final @Nullable String attachmentState;
    private final @Nullable String diskArn;
    /**
     * Iops of the Lightsail disk
     * 
     */
    private final @Nullable Integer iops;
    /**
     * Check is Disk is attached state
     * 
     */
    private final @Nullable Boolean isAttached;
    private final @Nullable DiskLocation location;
    /**
     * Path of the  attached Disk
     * 
     */
    private final @Nullable String path;
    /**
     * Resource type of Lightsail instance.
     * 
     */
    private final @Nullable String resourceType;
    /**
     * State of the Lightsail disk
     * 
     */
    private final @Nullable String state;
    /**
     * Support code to help identify any issues
     * 
     */
    private final @Nullable String supportCode;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<DiskTag> tags;

    @OutputCustomType.Constructor
    private GetDiskResult(
        @OutputCustomType.Parameter("addOns") @Nullable List<DiskAddOn> addOns,
        @OutputCustomType.Parameter("attachedTo") @Nullable String attachedTo,
        @OutputCustomType.Parameter("attachmentState") @Nullable String attachmentState,
        @OutputCustomType.Parameter("diskArn") @Nullable String diskArn,
        @OutputCustomType.Parameter("iops") @Nullable Integer iops,
        @OutputCustomType.Parameter("isAttached") @Nullable Boolean isAttached,
        @OutputCustomType.Parameter("location") @Nullable DiskLocation location,
        @OutputCustomType.Parameter("path") @Nullable String path,
        @OutputCustomType.Parameter("resourceType") @Nullable String resourceType,
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("supportCode") @Nullable String supportCode,
        @OutputCustomType.Parameter("tags") @Nullable List<DiskTag> tags) {
        this.addOns = addOns;
        this.attachedTo = attachedTo;
        this.attachmentState = attachmentState;
        this.diskArn = diskArn;
        this.iops = iops;
        this.isAttached = isAttached;
        this.location = location;
        this.path = path;
        this.resourceType = resourceType;
        this.state = state;
        this.supportCode = supportCode;
        this.tags = tags;
    }

    /**
     * An array of objects representing the add-ons to enable for the new instance.
     * 
    */
    public List<DiskAddOn> getAddOns() {
        return this.addOns == null ? List.of() : this.addOns;
    }
    /**
     * Name of the attached Lightsail Instance
     * 
    */
    public Optional<String> getAttachedTo() {
        return Optional.ofNullable(this.attachedTo);
    }
    /**
     * Attachment State of the Lightsail disk
     * 
    */
    public Optional<String> getAttachmentState() {
        return Optional.ofNullable(this.attachmentState);
    }
    public Optional<String> getDiskArn() {
        return Optional.ofNullable(this.diskArn);
    }
    /**
     * Iops of the Lightsail disk
     * 
    */
    public Optional<Integer> getIops() {
        return Optional.ofNullable(this.iops);
    }
    /**
     * Check is Disk is attached state
     * 
    */
    public Optional<Boolean> getIsAttached() {
        return Optional.ofNullable(this.isAttached);
    }
    public Optional<DiskLocation> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Path of the  attached Disk
     * 
    */
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Resource type of Lightsail instance.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }
    /**
     * State of the Lightsail disk
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Support code to help identify any issues
     * 
    */
    public Optional<String> getSupportCode() {
        return Optional.ofNullable(this.supportCode);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<DiskTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DiskAddOn> addOns;
        private @Nullable String attachedTo;
        private @Nullable String attachmentState;
        private @Nullable String diskArn;
        private @Nullable Integer iops;
        private @Nullable Boolean isAttached;
        private @Nullable DiskLocation location;
        private @Nullable String path;
        private @Nullable String resourceType;
        private @Nullable String state;
        private @Nullable String supportCode;
        private @Nullable List<DiskTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addOns = defaults.addOns;
    	      this.attachedTo = defaults.attachedTo;
    	      this.attachmentState = defaults.attachmentState;
    	      this.diskArn = defaults.diskArn;
    	      this.iops = defaults.iops;
    	      this.isAttached = defaults.isAttached;
    	      this.location = defaults.location;
    	      this.path = defaults.path;
    	      this.resourceType = defaults.resourceType;
    	      this.state = defaults.state;
    	      this.supportCode = defaults.supportCode;
    	      this.tags = defaults.tags;
        }

        public Builder setAddOns(@Nullable List<DiskAddOn> addOns) {
            this.addOns = addOns;
            return this;
        }

        public Builder setAttachedTo(@Nullable String attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }

        public Builder setAttachmentState(@Nullable String attachmentState) {
            this.attachmentState = attachmentState;
            return this;
        }

        public Builder setDiskArn(@Nullable String diskArn) {
            this.diskArn = diskArn;
            return this;
        }

        public Builder setIops(@Nullable Integer iops) {
            this.iops = iops;
            return this;
        }

        public Builder setIsAttached(@Nullable Boolean isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        public Builder setLocation(@Nullable DiskLocation location) {
            this.location = location;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setSupportCode(@Nullable String supportCode) {
            this.supportCode = supportCode;
            return this;
        }

        public Builder setTags(@Nullable List<DiskTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDiskResult build() {
            return new GetDiskResult(addOns, attachedTo, attachmentState, diskArn, iops, isAttached, location, path, resourceType, state, supportCode, tags);
        }
    }
}
