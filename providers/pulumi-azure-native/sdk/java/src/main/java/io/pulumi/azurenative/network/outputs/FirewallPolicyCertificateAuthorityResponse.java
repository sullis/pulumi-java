// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicyCertificateAuthorityResponse {
    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    private final @Nullable String keyVaultSecretId;
    /**
     * Name of the CA certificate.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"keyVaultSecretId","name"})
    private FirewallPolicyCertificateAuthorityResponse(
        @Nullable String keyVaultSecretId,
        @Nullable String name) {
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    public Optional<String> getKeyVaultSecretId() {
        return Optional.ofNullable(this.keyVaultSecretId);
    }
    /**
     * Name of the CA certificate.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCertificateAuthorityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultSecretId;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCertificateAuthorityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder setKeyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public FirewallPolicyCertificateAuthorityResponse build() {
            return new FirewallPolicyCertificateAuthorityResponse(keyVaultSecretId, name);
        }
    }
}
