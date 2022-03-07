// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectFileSystemLocationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectFileSystemLocationGetArgs Empty = new ProjectFileSystemLocationGetArgs();

    /**
     * The name used to access a file system created by Amazon EFS. CodeBuild creates an environment variable by appending the identifier in all capital letters to CODEBUILD\_. For example, if you specify my-efs for identifier, a new environment variable is create named CODEBUILD_MY-EFS.
     * 
     */
    @InputImport(name="identifier")
      private final @Nullable Input<String> identifier;

    public Input<String> getIdentifier() {
        return this.identifier == null ? Input.empty() : this.identifier;
    }

    /**
     * A string that specifies the location of the file system created by Amazon EFS. Its format is `efs-dns-name:/directory-path`.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The mount options for a file system created by AWS EFS.
     * 
     */
    @InputImport(name="mountOptions")
      private final @Nullable Input<String> mountOptions;

    public Input<String> getMountOptions() {
        return this.mountOptions == null ? Input.empty() : this.mountOptions;
    }

    /**
     * The location in the container where you mount the file system.
     * 
     */
    @InputImport(name="mountPoint")
      private final @Nullable Input<String> mountPoint;

    public Input<String> getMountPoint() {
        return this.mountPoint == null ? Input.empty() : this.mountPoint;
    }

    /**
     * Authorization type to use. The only valid value is `OAUTH`. This data type is deprecated and is no longer accurate or used. Use the `aws.codebuild.SourceCredential` resource instead.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProjectFileSystemLocationGetArgs(
        @Nullable Input<String> identifier,
        @Nullable Input<String> location,
        @Nullable Input<String> mountOptions,
        @Nullable Input<String> mountPoint,
        @Nullable Input<String> type) {
        this.identifier = identifier;
        this.location = location;
        this.mountOptions = mountOptions;
        this.mountPoint = mountPoint;
        this.type = type;
    }

    private ProjectFileSystemLocationGetArgs() {
        this.identifier = Input.empty();
        this.location = Input.empty();
        this.mountOptions = Input.empty();
        this.mountPoint = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectFileSystemLocationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identifier;
        private @Nullable Input<String> location;
        private @Nullable Input<String> mountOptions;
        private @Nullable Input<String> mountPoint;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectFileSystemLocationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.location = defaults.location;
    	      this.mountOptions = defaults.mountOptions;
    	      this.mountPoint = defaults.mountPoint;
    	      this.type = defaults.type;
        }

        public Builder setIdentifier(@Nullable Input<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setIdentifier(@Nullable String identifier) {
            this.identifier = Input.ofNullable(identifier);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMountOptions(@Nullable Input<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder setMountOptions(@Nullable String mountOptions) {
            this.mountOptions = Input.ofNullable(mountOptions);
            return this;
        }

        public Builder setMountPoint(@Nullable Input<String> mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }

        public Builder setMountPoint(@Nullable String mountPoint) {
            this.mountPoint = Input.ofNullable(mountPoint);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ProjectFileSystemLocationGetArgs build() {
            return new ProjectFileSystemLocationGetArgs(identifier, location, mountOptions, mountPoint, type);
        }
    }
}