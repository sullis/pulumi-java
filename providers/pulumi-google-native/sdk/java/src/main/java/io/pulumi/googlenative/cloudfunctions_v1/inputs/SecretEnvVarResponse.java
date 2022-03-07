// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudfunctions_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for a secret environment variable. It has the information necessary to fetch the secret value from secret manager and expose it as an environment variable. Secret value is not a part of the configuration. Secret values are only fetched when a new clone starts.
 * 
 */
public final class SecretEnvVarResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretEnvVarResponse Empty = new SecretEnvVarResponse();

    /**
     * Name of the environment variable.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Project identifier (preferrably project number but can also be the project ID) of the project that contains the secret. If not set, it will be populated with the function's project assuming that the secret exists in the same project as of the function.
     * 
     */
    @InputImport(name="project", required=true)
      private final String project;

    public String getProject() {
        return this.project;
    }

    /**
     * Name of the secret in secret manager (not the full resource name).
     * 
     */
    @InputImport(name="secret", required=true)
      private final String secret;

    public String getSecret() {
        return this.secret;
    }

    /**
     * Version of the secret (version number or the string 'latest'). It is recommended to use a numeric version for secret environment variables as any updates to the secret value is not reflected until new clones start.
     * 
     */
    @InputImport(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public SecretEnvVarResponse(
        String key,
        String project,
        String secret,
        String version) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private SecretEnvVarResponse() {
        this.key = null;
        this.project = null;
        this.secret = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretEnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String project;
        private String secret;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretEnvVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.project = defaults.project;
    	      this.secret = defaults.secret;
    	      this.version = defaults.version;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
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

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public SecretEnvVarResponse build() {
            return new SecretEnvVarResponse(key, project, secret, version);
        }
    }
}