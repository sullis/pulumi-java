// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudfunctions_v1.outputs.SecretVersionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class SecretVolumeResponse {
    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
     */
    private final String mountPath;
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    private final String project;
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    private final String secret;
    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
     */
    private final List<SecretVersionResponse> versions;

    @OutputCustomType.Constructor({"mountPath","project","secret","versions"})
    private SecretVolumeResponse(
        String mountPath,
        String project,
        String secret,
        List<SecretVersionResponse> versions) {
        this.mountPath = Objects.requireNonNull(mountPath);
        this.project = Objects.requireNonNull(project);
        this.secret = Objects.requireNonNull(secret);
        this.versions = Objects.requireNonNull(versions);
    }

    /**
     * The path within the container to mount the secret volume. For example, setting the mount_path as `/etc/secrets` would mount the secret value files under the `/etc/secrets` directory. This directory will also be completely shadowed and unavailable to mount any other secrets. Recommended mount paths: /etc/secrets Restricted mount paths: /cloudsql, /dev/log, /pod, /proc, /var/log
     * 
    */
    public String getMountPath() {
        return this.mountPath;
    }
    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
    */
    public String getSecret() {
        return this.secret;
    }
    /**
     * List of secret versions to mount for this secret. If empty, the `latest` version of the secret will be made available in a file named after the secret under the mount point.
     * 
    */
    public List<SecretVersionResponse> getVersions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretVolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mountPath;
        private String project;
        private String secret;
        private List<SecretVersionResponse> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretVolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        public Builder setMountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setVersions(List<SecretVersionResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public SecretVolumeResponse build() {
            return new SecretVolumeResponse(mountPath, project, secret, versions);
        }
    }
}