// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A securely stored value.
 * 
 */
public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number}/secrets/{secret_id}/versions/{version_id}.
     * 
     */
    @InputImport(name="cloudSecret")
      private final @Nullable Input<String> cloudSecret;

    public Input<String> getCloudSecret() {
        return this.cloudSecret == null ? Input.empty() : this.cloudSecret;
    }

    public SecretArgs(@Nullable Input<String> cloudSecret) {
        this.cloudSecret = cloudSecret;
    }

    private SecretArgs() {
        this.cloudSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder setCloudSecret(@Nullable Input<String> cloudSecret) {
            this.cloudSecret = cloudSecret;
            return this;
        }

        public Builder setCloudSecret(@Nullable String cloudSecret) {
            this.cloudSecret = Input.ofNullable(cloudSecret);
            return this;
        }
        public SecretArgs build() {
            return new SecretArgs(cloudSecret);
        }
    }
}