// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SshPublicKeyResponse {
    /**
     * Optional. It is used to store the function/usage of the key
     * 
     */
    private final @Nullable String description;
    /**
     * Ssh public key base64 encoded. The format should be: '<keyType> <keyData>', e.g. ssh-rsa AAAABBBB
     * 
     */
    private final @Nullable String key;

    @OutputCustomType.Constructor({"description","key"})
    private SshPublicKeyResponse(
        @Nullable String description,
        @Nullable String key) {
        this.description = description;
        this.key = key;
    }

    /**
     * Optional. It is used to store the function/usage of the key
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Ssh public key base64 encoded. The format should be: '<keyType> <keyData>', e.g. ssh-rsa AAAABBBB
     * 
    */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(SshPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }
        public SshPublicKeyResponse build() {
            return new SshPublicKeyResponse(description, key);
        }
    }
}