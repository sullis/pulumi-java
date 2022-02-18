// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.efs;

import io.pulumi.awsnative.efs.inputs.AccessPointPosixUserArgs;
import io.pulumi.awsnative.efs.inputs.AccessPointRootDirectoryArgs;
import io.pulumi.awsnative.efs.inputs.AccessPointTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointArgs Empty = new AccessPointArgs();

    @InputImport(name="accessPointTags")
    private final @Nullable Input<List<AccessPointTagArgs>> accessPointTags;

    public Input<List<AccessPointTagArgs>> getAccessPointTags() {
        return this.accessPointTags == null ? Input.empty() : this.accessPointTags;
    }

    /**
     * (optional) A string of up to 64 ASCII characters that Amazon EFS uses to ensure idempotent creation.
     * 
     */
    @InputImport(name="clientToken")
    private final @Nullable Input<String> clientToken;

    public Input<String> getClientToken() {
        return this.clientToken == null ? Input.empty() : this.clientToken;
    }

    /**
     * The ID of the EFS file system that the access point provides access to.
     * 
     */
    @InputImport(name="fileSystemId", required=true)
    private final Input<String> fileSystemId;

    public Input<String> getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * The operating system user and group applied to all file system requests made using the access point.
     * 
     */
    @InputImport(name="posixUser")
    private final @Nullable Input<AccessPointPosixUserArgs> posixUser;

    public Input<AccessPointPosixUserArgs> getPosixUser() {
        return this.posixUser == null ? Input.empty() : this.posixUser;
    }

    /**
     * Specifies the directory on the Amazon EFS file system that the access point exposes as the root directory of your file system to NFS clients using the access point. The clients using the access point can only access the root directory and below. If the RootDirectory>Path specified does not exist, EFS creates it and applies the CreationInfo settings when a client connects to an access point. When specifying a RootDirectory, you need to provide the Path, and the CreationInfo is optional.
     * 
     */
    @InputImport(name="rootDirectory")
    private final @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory;

    public Input<AccessPointRootDirectoryArgs> getRootDirectory() {
        return this.rootDirectory == null ? Input.empty() : this.rootDirectory;
    }

    public AccessPointArgs(
        @Nullable Input<List<AccessPointTagArgs>> accessPointTags,
        @Nullable Input<String> clientToken,
        Input<String> fileSystemId,
        @Nullable Input<AccessPointPosixUserArgs> posixUser,
        @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory) {
        this.accessPointTags = accessPointTags;
        this.clientToken = clientToken;
        this.fileSystemId = Objects.requireNonNull(fileSystemId, "expected parameter 'fileSystemId' to be non-null");
        this.posixUser = posixUser;
        this.rootDirectory = rootDirectory;
    }

    private AccessPointArgs() {
        this.accessPointTags = Input.empty();
        this.clientToken = Input.empty();
        this.fileSystemId = Input.empty();
        this.posixUser = Input.empty();
        this.rootDirectory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AccessPointTagArgs>> accessPointTags;
        private @Nullable Input<String> clientToken;
        private Input<String> fileSystemId;
        private @Nullable Input<AccessPointPosixUserArgs> posixUser;
        private @Nullable Input<AccessPointRootDirectoryArgs> rootDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointTags = defaults.accessPointTags;
    	      this.clientToken = defaults.clientToken;
    	      this.fileSystemId = defaults.fileSystemId;
    	      this.posixUser = defaults.posixUser;
    	      this.rootDirectory = defaults.rootDirectory;
        }

        public Builder setAccessPointTags(@Nullable Input<List<AccessPointTagArgs>> accessPointTags) {
            this.accessPointTags = accessPointTags;
            return this;
        }

        public Builder setAccessPointTags(@Nullable List<AccessPointTagArgs> accessPointTags) {
            this.accessPointTags = Input.ofNullable(accessPointTags);
            return this;
        }

        public Builder setClientToken(@Nullable Input<String> clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        public Builder setClientToken(@Nullable String clientToken) {
            this.clientToken = Input.ofNullable(clientToken);
            return this;
        }

        public Builder setFileSystemId(Input<String> fileSystemId) {
            this.fileSystemId = Objects.requireNonNull(fileSystemId);
            return this;
        }

        public Builder setFileSystemId(String fileSystemId) {
            this.fileSystemId = Input.of(Objects.requireNonNull(fileSystemId));
            return this;
        }

        public Builder setPosixUser(@Nullable Input<AccessPointPosixUserArgs> posixUser) {
            this.posixUser = posixUser;
            return this;
        }

        public Builder setPosixUser(@Nullable AccessPointPosixUserArgs posixUser) {
            this.posixUser = Input.ofNullable(posixUser);
            return this;
        }

        public Builder setRootDirectory(@Nullable Input<AccessPointRootDirectoryArgs> rootDirectory) {
            this.rootDirectory = rootDirectory;
            return this;
        }

        public Builder setRootDirectory(@Nullable AccessPointRootDirectoryArgs rootDirectory) {
            this.rootDirectory = Input.ofNullable(rootDirectory);
            return this;
        }

        public AccessPointArgs build() {
            return new AccessPointArgs(accessPointTags, clientToken, fileSystemId, posixUser, rootDirectory);
        }
    }
}
