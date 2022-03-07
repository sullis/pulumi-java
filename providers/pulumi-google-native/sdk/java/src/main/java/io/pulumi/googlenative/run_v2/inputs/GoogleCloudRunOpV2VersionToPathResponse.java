// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * VersionToPath maps a specific version of a secret to a relative file to mount to, relative to VolumeMount's mount_path.
 * 
 */
public final class GoogleCloudRunOpV2VersionToPathResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2VersionToPathResponse Empty = new GoogleCloudRunOpV2VersionToPathResponse();

    /**
     * Integer octal mode bits to use on this file, must be a value between 01 and 0777 (octal). If 0 or not set, the Volume's default mode will be used. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is an integer representation of the mode bits. So, the octal integer value should look exactly as the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10). For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    @InputImport(name="mode", required=true)
      private final Integer mode;

    public Integer getMode() {
        return this.mode;
    }

    /**
     * The relative path of the secret in the container.
     * 
     */
    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * The Cloud Secret Manager secret version. Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public GoogleCloudRunOpV2VersionToPathResponse(
        Integer mode,
        String path,
        String version) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GoogleCloudRunOpV2VersionToPathResponse() {
        this.mode = null;
        this.path = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VersionToPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer mode;
        private String path;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VersionToPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.path = defaults.path;
    	      this.version = defaults.version;
        }

        public Builder setMode(Integer mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GoogleCloudRunOpV2VersionToPathResponse build() {
            return new GoogleCloudRunOpV2VersionToPathResponse(mode, path, version);
        }
    }
}