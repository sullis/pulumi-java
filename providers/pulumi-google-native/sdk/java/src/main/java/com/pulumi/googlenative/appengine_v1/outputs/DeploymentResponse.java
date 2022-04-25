// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.appengine_v1.outputs.CloudBuildOptionsResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ContainerInfoResponse;
import com.pulumi.googlenative.appengine_v1.outputs.ZipInfoResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class DeploymentResponse {
    /**
     * @return Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
     * 
     */
    private final CloudBuildOptionsResponse cloudBuildOptions;
    /**
     * @return The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    private final ContainerInfoResponse container;
    /**
     * @return Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
     * 
     */
    private final Map<String,String> files;
    /**
     * @return The zip file for this deployment, if this is a zip deployment.
     * 
     */
    private final ZipInfoResponse zip;

    @CustomType.Constructor
    private DeploymentResponse(
        @CustomType.Parameter("cloudBuildOptions") CloudBuildOptionsResponse cloudBuildOptions,
        @CustomType.Parameter("container") ContainerInfoResponse container,
        @CustomType.Parameter("files") Map<String,String> files,
        @CustomType.Parameter("zip") ZipInfoResponse zip) {
        this.cloudBuildOptions = cloudBuildOptions;
        this.container = container;
        this.files = files;
        this.zip = zip;
    }

    /**
     * @return Options for any Google Cloud Build builds created as a part of this deployment.These options will only be used if a new build is created, such as when deploying to the App Engine flexible environment using files or zip.
     * 
     */
    public CloudBuildOptionsResponse cloudBuildOptions() {
        return this.cloudBuildOptions;
    }
    /**
     * @return The Docker image for the container that runs the version. Only applicable for instances running in the App Engine flexible environment.
     * 
     */
    public ContainerInfoResponse container() {
        return this.container;
    }
    /**
     * @return Manifest of the files stored in Google Cloud Storage that are included as part of this version. All files must be readable using the credentials supplied with this call.
     * 
     */
    public Map<String,String> files() {
        return this.files;
    }
    /**
     * @return The zip file for this deployment, if this is a zip deployment.
     * 
     */
    public ZipInfoResponse zip() {
        return this.zip;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudBuildOptionsResponse cloudBuildOptions;
        private ContainerInfoResponse container;
        private Map<String,String> files;
        private ZipInfoResponse zip;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        public Builder cloudBuildOptions(CloudBuildOptionsResponse cloudBuildOptions) {
            this.cloudBuildOptions = Objects.requireNonNull(cloudBuildOptions);
            return this;
        }
        public Builder container(ContainerInfoResponse container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder files(Map<String,String> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }
        public Builder zip(ZipInfoResponse zip) {
            this.zip = Objects.requireNonNull(zip);
            return this;
        }        public DeploymentResponse build() {
            return new DeploymentResponse(cloudBuildOptions, container, files, zip);
        }
    }
}
