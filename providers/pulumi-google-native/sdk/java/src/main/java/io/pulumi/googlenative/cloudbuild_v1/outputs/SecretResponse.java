// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SecretResponse {
    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
     */
    private final String kmsKeyName;
    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
     */
    private final Map<String,String> secretEnv;

    @OutputCustomType.Constructor({"kmsKeyName","secretEnv"})
    private SecretResponse(
        String kmsKeyName,
        Map<String,String> secretEnv) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.secretEnv = Objects.requireNonNull(secretEnv);
    }

    /**
     * Cloud KMS key name to use to decrypt these envs.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
    */
    public Map<String,String> getSecretEnv() {
        return this.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private Map<String,String> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setSecretEnv(Map<String,String> secretEnv) {
            this.secretEnv = Objects.requireNonNull(secretEnv);
            return this;
        }
        public SecretResponse build() {
            return new SecretResponse(kmsKeyName, secretEnv);
        }
    }
}