// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Trusted Root certificates properties for tls.
 * 
 */
public final class FirewallPolicyCertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyCertificateAuthorityArgs Empty = new FirewallPolicyCertificateAuthorityArgs();

    /**
     * Secret Id of (base-64 encoded unencrypted pfx) 'Secret' or 'Certificate' object stored in KeyVault.
     * 
     */
    @InputImport(name="keyVaultSecretId")
    private final @Nullable Input<String> keyVaultSecretId;

    public Input<String> getKeyVaultSecretId() {
        return this.keyVaultSecretId == null ? Input.empty() : this.keyVaultSecretId;
    }

    /**
     * Name of the CA certificate.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public FirewallPolicyCertificateAuthorityArgs(
        @Nullable Input<String> keyVaultSecretId,
        @Nullable Input<String> name) {
        this.keyVaultSecretId = keyVaultSecretId;
        this.name = name;
    }

    private FirewallPolicyCertificateAuthorityArgs() {
        this.keyVaultSecretId = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyVaultSecretId;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultSecretId = defaults.keyVaultSecretId;
    	      this.name = defaults.name;
        }

        public Builder setKeyVaultSecretId(@Nullable Input<String> keyVaultSecretId) {
            this.keyVaultSecretId = keyVaultSecretId;
            return this;
        }

        public Builder setKeyVaultSecretId(@Nullable String keyVaultSecretId) {
            this.keyVaultSecretId = Input.ofNullable(keyVaultSecretId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public FirewallPolicyCertificateAuthorityArgs build() {
            return new FirewallPolicyCertificateAuthorityArgs(keyVaultSecretId, name);
        }
    }
}
