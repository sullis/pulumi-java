// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.CloudServiceVaultCertificateResponse;
import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CloudServiceVaultSecretGroupResponse {
    /**
     * @return The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    private final @Nullable SubResourceResponse sourceVault;
    /**
     * @return The list of key vault references in SourceVault which contain certificates.
     * 
     */
    private final @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates;

    @CustomType.Constructor
    private CloudServiceVaultSecretGroupResponse(
        @CustomType.Parameter("sourceVault") @Nullable SubResourceResponse sourceVault,
        @CustomType.Parameter("vaultCertificates") @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates) {
        this.sourceVault = sourceVault;
        this.vaultCertificates = vaultCertificates;
    }

    /**
     * @return The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    public Optional<SubResourceResponse> sourceVault() {
        return Optional.ofNullable(this.sourceVault);
    }
    /**
     * @return The list of key vault references in SourceVault which contain certificates.
     * 
     */
    public List<CloudServiceVaultCertificateResponse> vaultCertificates() {
        return this.vaultCertificates == null ? List.of() : this.vaultCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultSecretGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse sourceVault;
        private @Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultSecretGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder sourceVault(@Nullable SubResourceResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }
        public Builder vaultCertificates(@Nullable List<CloudServiceVaultCertificateResponse> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }
        public Builder vaultCertificates(CloudServiceVaultCertificateResponse... vaultCertificates) {
            return vaultCertificates(List.of(vaultCertificates));
        }        public CloudServiceVaultSecretGroupResponse build() {
            return new CloudServiceVaultSecretGroupResponse(sourceVault, vaultCertificates);
        }
    }
}
