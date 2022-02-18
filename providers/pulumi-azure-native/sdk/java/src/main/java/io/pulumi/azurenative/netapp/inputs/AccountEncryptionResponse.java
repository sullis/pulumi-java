// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encryption settings
 * 
 */
public final class AccountEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final AccountEncryptionResponse Empty = new AccountEncryptionResponse();

    /**
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     * 
     */
    @InputImport(name="keySource")
    private final @Nullable String keySource;

    public Optional<String> getKeySource() {
        return this.keySource == null ? Optional.empty() : Optional.ofNullable(this.keySource);
    }

    public AccountEncryptionResponse(@Nullable String keySource) {
        this.keySource = keySource;
    }

    private AccountEncryptionResponse() {
        this.keySource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keySource;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
        }

        public Builder setKeySource(@Nullable String keySource) {
            this.keySource = keySource;
            return this;
        }

        public AccountEncryptionResponse build() {
            return new AccountEncryptionResponse(keySource);
        }
    }
}
