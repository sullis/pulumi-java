// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2CloudSqlInstanceResponse;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Volume represents a named volume in a container.
 * 
 */
public final class GoogleCloudRunOpV2VolumeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2VolumeResponse Empty = new GoogleCloudRunOpV2VolumeResponse();

    /**
     * For Cloud SQL volumes, contains the specific instances that should be mounted. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run.
     * 
     */
    @InputImport(name="cloudSqlInstance", required=true)
      private final GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance;

    public GoogleCloudRunOpV2CloudSqlInstanceResponse getCloudSqlInstance() {
        return this.cloudSqlInstance;
    }

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     * 
     */
    @InputImport(name="secret", required=true)
      private final GoogleCloudRunOpV2SecretVolumeSourceResponse secret;

    public GoogleCloudRunOpV2SecretVolumeSourceResponse getSecret() {
        return this.secret;
    }

    public GoogleCloudRunOpV2VolumeResponse(
        GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance,
        String name,
        GoogleCloudRunOpV2SecretVolumeSourceResponse secret) {
        this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance, "expected parameter 'cloudSqlInstance' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private GoogleCloudRunOpV2VolumeResponse() {
        this.cloudSqlInstance = null;
        this.name = null;
        this.secret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance;
        private String name;
        private GoogleCloudRunOpV2SecretVolumeSourceResponse secret;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlInstance = defaults.cloudSqlInstance;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder setCloudSqlInstance(GoogleCloudRunOpV2CloudSqlInstanceResponse cloudSqlInstance) {
            this.cloudSqlInstance = Objects.requireNonNull(cloudSqlInstance);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecret(GoogleCloudRunOpV2SecretVolumeSourceResponse secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        public GoogleCloudRunOpV2VolumeResponse build() {
            return new GoogleCloudRunOpV2VolumeResponse(cloudSqlInstance, name, secret);
        }
    }
}