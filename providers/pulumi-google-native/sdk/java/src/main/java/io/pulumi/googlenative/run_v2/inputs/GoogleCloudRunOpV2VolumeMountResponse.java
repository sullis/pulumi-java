// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * VolumeMount describes a mounting of a Volume within a container.
 * 
 */
public final class GoogleCloudRunOpV2VolumeMountResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2VolumeMountResponse Empty = new GoogleCloudRunOpV2VolumeMountResponse();

    /**
     * Path within the container at which the volume should be mounted. Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must otherwise be `/cloudsql`. All instances defined in the Volume will be available as `/cloudsql/[instance]`. For more information on Cloud SQL volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
     * 
     */
    @InputImport(name="mountPath", required=true)
      private final String mountPath;

    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * This must match the Name of a Volume.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GoogleCloudRunOpV2VolumeMountResponse(
        String mountPath,
        String name) {
        this.mountPath = Objects.requireNonNull(mountPath, "expected parameter 'mountPath' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GoogleCloudRunOpV2VolumeMountResponse() {
        this.mountPath = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VolumeMountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VolumeMountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.name = defaults.name;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GoogleCloudRunOpV2VolumeMountResponse build() {
            return new GoogleCloudRunOpV2VolumeMountResponse(mountPath, name);
        }
    }
}