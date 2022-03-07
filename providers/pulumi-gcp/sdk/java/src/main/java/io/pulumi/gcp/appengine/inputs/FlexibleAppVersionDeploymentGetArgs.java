// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentContainerGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentFileGetArgs;
import io.pulumi.gcp.appengine.inputs.FlexibleAppVersionDeploymentZipGetArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionDeploymentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionDeploymentGetArgs Empty = new FlexibleAppVersionDeploymentGetArgs();

    /**
     * Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cloudBuildOptions")
      private final @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions;

    public Input<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> getCloudBuildOptions() {
        return this.cloudBuildOptions == null ? Input.empty() : this.cloudBuildOptions;
    }

    /**
     * The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    @InputImport(name="container")
      private final @Nullable Input<FlexibleAppVersionDeploymentContainerGetArgs> container;

    public Input<FlexibleAppVersionDeploymentContainerGetArgs> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    @InputImport(name="files")
      private final @Nullable Input<List<FlexibleAppVersionDeploymentFileGetArgs>> files;

    public Input<List<FlexibleAppVersionDeploymentFileGetArgs>> getFiles() {
        return this.files == null ? Input.empty() : this.files;
    }

    /**
     * Zip File
     * Structure is documented below.
     * 
     */
    @InputImport(name="zip")
      private final @Nullable Input<FlexibleAppVersionDeploymentZipGetArgs> zip;

    public Input<FlexibleAppVersionDeploymentZipGetArgs> getZip() {
        return this.zip == null ? Input.empty() : this.zip;
    }

    public FlexibleAppVersionDeploymentGetArgs(
        @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions,
        @Nullable Input<FlexibleAppVersionDeploymentContainerGetArgs> container,
        @Nullable Input<List<FlexibleAppVersionDeploymentFileGetArgs>> files,
        @Nullable Input<FlexibleAppVersionDeploymentZipGetArgs> zip) {
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    private FlexibleAppVersionDeploymentGetArgs() {
        this.cloudBuildOptions = Input.empty();
        this.container = Input.empty();
        this.files = Input.empty();
        this.zip = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeploymentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions;
        private @Nullable Input<FlexibleAppVersionDeploymentContainerGetArgs> container;
        private @Nullable Input<List<FlexibleAppVersionDeploymentFileGetArgs>> files;
        private @Nullable Input<FlexibleAppVersionDeploymentZipGetArgs> zip;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionDeploymentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder setCloudBuildOptions(@Nullable Input<FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs> cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }

        public Builder setCloudBuildOptions(@Nullable FlexibleAppVersionDeploymentCloudBuildOptionsGetArgs cloudBuildOptions) {
            this.cloudBuildOptions = Input.ofNullable(cloudBuildOptions);
            return this;
        }

        public Builder setContainer(@Nullable Input<FlexibleAppVersionDeploymentContainerGetArgs> container) {
            this.container = container;
            return this;
        }

        public Builder setContainer(@Nullable FlexibleAppVersionDeploymentContainerGetArgs container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder setFiles(@Nullable Input<List<FlexibleAppVersionDeploymentFileGetArgs>> files) {
            this.files = files;
            return this;
        }

        public Builder setFiles(@Nullable List<FlexibleAppVersionDeploymentFileGetArgs> files) {
            this.files = Input.ofNullable(files);
            return this;
        }

        public Builder setZip(@Nullable Input<FlexibleAppVersionDeploymentZipGetArgs> zip) {
            this.zip = zip;
            return this;
        }

        public Builder setZip(@Nullable FlexibleAppVersionDeploymentZipGetArgs zip) {
            this.zip = Input.ofNullable(zip);
            return this;
        }
        public FlexibleAppVersionDeploymentGetArgs build() {
            return new FlexibleAppVersionDeploymentGetArgs(cloudBuildOptions, container, files, zip);
        }
    }
}