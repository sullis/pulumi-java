// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pairs a set of secret environment variables mapped to encrypted values with the Cloud KMS key to use to decrypt the value.
 * 
 */
public final class InlineSecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final InlineSecretArgs Empty = new InlineSecretArgs();

    /**
     * Map of environment variable name to its encrypted value. Secret environment variables must be unique across all of a build's secrets, and must be used by at least one build step. Values can be at most 64 KB in size. There can be at most 100 secret values across all of a build's secrets.
     * 
     */
    @Import(name="envMap")
      private final @Nullable Output<Map<String,String>> envMap;

    public Output<Map<String,String>> getEnvMap() {
        return this.envMap == null ? Output.empty() : this.envMap;
    }

    /**
     * Resource name of Cloud KMS crypto key to decrypt the encrypted value. In format: projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Output.empty() : this.kmsKeyName;
    }

    public InlineSecretArgs(
        @Nullable Output<Map<String,String>> envMap,
        @Nullable Output<String> kmsKeyName) {
        this.envMap = envMap;
        this.kmsKeyName = kmsKeyName;
    }

    private InlineSecretArgs() {
        this.envMap = Output.empty();
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InlineSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> envMap;
        private @Nullable Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(InlineSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envMap = defaults.envMap;
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder envMap(@Nullable Output<Map<String,String>> envMap) {
            this.envMap = envMap;
            return this;
        }
        public Builder envMap(@Nullable Map<String,String> envMap) {
            this.envMap = Output.ofNullable(envMap);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Output.ofNullable(kmsKeyName);
            return this;
        }        public InlineSecretArgs build() {
            return new InlineSecretArgs(envMap, kmsKeyName);
        }
    }
}
