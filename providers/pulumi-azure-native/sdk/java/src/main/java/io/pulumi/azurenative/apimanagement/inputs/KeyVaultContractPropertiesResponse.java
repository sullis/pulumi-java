// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.KeyVaultLastAccessStatusContractPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KeyVault contract details.
 * 
 */
public final class KeyVaultContractPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultContractPropertiesResponse Empty = new KeyVaultContractPropertiesResponse();

    /**
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to access key vault secret.
     * 
     */
    @InputImport(name="identityClientId")
    private final @Nullable String identityClientId;

    public Optional<String> getIdentityClientId() {
        return this.identityClientId == null ? Optional.empty() : Optional.ofNullable(this.identityClientId);
    }

    /**
     * Last time sync and refresh status of secret from key vault.
     * 
     */
    @InputImport(name="lastStatus")
    private final @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus;

    public Optional<KeyVaultLastAccessStatusContractPropertiesResponse> getLastStatus() {
        return this.lastStatus == null ? Optional.empty() : Optional.ofNullable(this.lastStatus);
    }

    /**
     * Key vault secret identifier for fetching secret. Providing a versioned secret will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi
     * 
     */
    @InputImport(name="secretIdentifier")
    private final @Nullable String secretIdentifier;

    public Optional<String> getSecretIdentifier() {
        return this.secretIdentifier == null ? Optional.empty() : Optional.ofNullable(this.secretIdentifier);
    }

    public KeyVaultContractPropertiesResponse(
        @Nullable String identityClientId,
        @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus,
        @Nullable String secretIdentifier) {
        this.identityClientId = identityClientId;
        this.lastStatus = lastStatus;
        this.secretIdentifier = secretIdentifier;
    }

    private KeyVaultContractPropertiesResponse() {
        this.identityClientId = null;
        this.lastStatus = null;
        this.secretIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String identityClientId;
        private @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus;
        private @Nullable String secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityClientId = defaults.identityClientId;
    	      this.lastStatus = defaults.lastStatus;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder setIdentityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }

        public Builder setLastStatus(@Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus) {
            this.lastStatus = lastStatus;
            return this;
        }

        public Builder setSecretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }

        public KeyVaultContractPropertiesResponse build() {
            return new KeyVaultContractPropertiesResponse(identityClientId, lastStatus, secretIdentifier);
        }
    }
}
