// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a shared file storage system that is associated with a studio resource.</p>
 * 
 */
public final class StudioComponentSharedFileSystemConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioComponentSharedFileSystemConfigurationArgs Empty = new StudioComponentSharedFileSystemConfigurationArgs();

    /**
     * <p>The endpoint of the shared file system that is accessed by the studio component resource.</p>
     * 
     */
    @InputImport(name="endpoint")
    private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    /**
     * <p>The unique identifier for a file system.</p>
     * 
     */
    @InputImport(name="fileSystemId")
    private final @Nullable Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId == null ? Input.empty() : this.fileSystemId;
    }

    /**
     * <p>The mount location for a shared file system on a Linux virtual workstation.</p>
     * 
     */
    @InputImport(name="linuxMountPoint")
    private final @Nullable Input<String> linuxMountPoint;

    public Input<String> getLinuxMountPoint() {
        return this.linuxMountPoint == null ? Input.empty() : this.linuxMountPoint;
    }

    /**
     * <p>The name of the file share.</p>
     * 
     */
    @InputImport(name="shareName")
    private final @Nullable Input<String> shareName;

    public Input<String> getShareName() {
        return this.shareName == null ? Input.empty() : this.shareName;
    }

    /**
     * <p>The mount location for a shared file system on a Windows virtual workstation.</p>
     * 
     */
    @InputImport(name="windowsMountDrive")
    private final @Nullable Input<String> windowsMountDrive;

    public Input<String> getWindowsMountDrive() {
        return this.windowsMountDrive == null ? Input.empty() : this.windowsMountDrive;
    }

    public StudioComponentSharedFileSystemConfigurationArgs(
        @Nullable Input<String> endpoint,
        @Nullable Input<String> fileSystemId,
        @Nullable Input<String> linuxMountPoint,
        @Nullable Input<String> shareName,
        @Nullable Input<String> windowsMountDrive) {
        this.endpoint = endpoint;
        this.fileSystemId = fileSystemId;
        this.linuxMountPoint = linuxMountPoint;
        this.shareName = shareName;
        this.windowsMountDrive = windowsMountDrive;
    }

    private StudioComponentSharedFileSystemConfigurationArgs() {
        this.endpoint = Input.empty();
        this.fileSystemId = Input.empty();
        this.linuxMountPoint = Input.empty();
        this.shareName = Input.empty();
        this.windowsMountDrive = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> fileSystemId;
        private @Nullable Input<String> linuxMountPoint;
        private @Nullable Input<String> shareName;
        private @Nullable Input<String> windowsMountDrive;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioComponentSharedFileSystemConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.linuxMountPoint = defaults.linuxMountPoint;
    	      this.shareName = defaults.shareName;
    	      this.windowsMountDrive = defaults.windowsMountDrive;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setFileSystemId(@Nullable Input<String> fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        public Builder setFileSystemId(@Nullable String fileSystemId) {
            this.fileSystemId = Input.ofNullable(fileSystemId);
            return this;
        }

        public Builder setLinuxMountPoint(@Nullable Input<String> linuxMountPoint) {
            this.linuxMountPoint = linuxMountPoint;
            return this;
        }

        public Builder setLinuxMountPoint(@Nullable String linuxMountPoint) {
            this.linuxMountPoint = Input.ofNullable(linuxMountPoint);
            return this;
        }

        public Builder setShareName(@Nullable Input<String> shareName) {
            this.shareName = shareName;
            return this;
        }

        public Builder setShareName(@Nullable String shareName) {
            this.shareName = Input.ofNullable(shareName);
            return this;
        }

        public Builder setWindowsMountDrive(@Nullable Input<String> windowsMountDrive) {
            this.windowsMountDrive = windowsMountDrive;
            return this;
        }

        public Builder setWindowsMountDrive(@Nullable String windowsMountDrive) {
            this.windowsMountDrive = Input.ofNullable(windowsMountDrive);
            return this;
        }

        public StudioComponentSharedFileSystemConfigurationArgs build() {
            return new StudioComponentSharedFileSystemConfigurationArgs(endpoint, fileSystemId, linuxMountPoint, shareName, windowsMountDrive);
        }
    }
}
