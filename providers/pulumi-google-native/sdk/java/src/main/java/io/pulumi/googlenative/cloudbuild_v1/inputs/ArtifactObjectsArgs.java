// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Files in the workspace to upload to Cloud Storage upon successful completion of all build steps.
 * 
 */
public final class ArtifactObjectsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ArtifactObjectsArgs Empty = new ArtifactObjectsArgs();

    /**
     * Cloud Storage bucket and optional object path, in the form "gs://bucket/path/to/somewhere/". (see [Bucket Name Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)). Files in the workspace matching any path pattern will be uploaded to Cloud Storage with this location as a prefix.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Path globs used to match files in the build's workspace.
     * 
     */
    @InputImport(name="paths")
      private final @Nullable Input<List<String>> paths;

    public Input<List<String>> getPaths() {
        return this.paths == null ? Input.empty() : this.paths;
    }

    public ArtifactObjectsArgs(
        @Nullable Input<String> location,
        @Nullable Input<List<String>> paths) {
        this.location = location;
        this.paths = paths;
    }

    private ArtifactObjectsArgs() {
        this.location = Input.empty();
        this.paths = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactObjectsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> paths;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactObjectsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.paths = defaults.paths;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPaths(@Nullable Input<List<String>> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setPaths(@Nullable List<String> paths) {
            this.paths = Input.ofNullable(paths);
            return this;
        }
        public ArtifactObjectsArgs build() {
            return new ArtifactObjectsArgs(location, paths);
        }
    }
}