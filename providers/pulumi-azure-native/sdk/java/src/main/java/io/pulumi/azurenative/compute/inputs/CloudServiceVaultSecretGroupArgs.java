// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.CloudServiceVaultCertificateArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a set of certificates which are all in the same Key Vault.
 * 
 */
public final class CloudServiceVaultSecretGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudServiceVaultSecretGroupArgs Empty = new CloudServiceVaultSecretGroupArgs();

    /**
     * The relative URL of the Key Vault containing all of the certificates in VaultCertificates.
     * 
     */
    @InputImport(name="sourceVault")
    private final @Nullable Input<SubResourceArgs> sourceVault;

    public Input<SubResourceArgs> getSourceVault() {
        return this.sourceVault == null ? Input.empty() : this.sourceVault;
    }

    /**
     * The list of key vault references in SourceVault which contain certificates.
     * 
     */
    @InputImport(name="vaultCertificates")
    private final @Nullable Input<List<CloudServiceVaultCertificateArgs>> vaultCertificates;

    public Input<List<CloudServiceVaultCertificateArgs>> getVaultCertificates() {
        return this.vaultCertificates == null ? Input.empty() : this.vaultCertificates;
    }

    public CloudServiceVaultSecretGroupArgs(
        @Nullable Input<SubResourceArgs> sourceVault,
        @Nullable Input<List<CloudServiceVaultCertificateArgs>> vaultCertificates) {
        this.sourceVault = sourceVault;
        this.vaultCertificates = vaultCertificates;
    }

    private CloudServiceVaultSecretGroupArgs() {
        this.sourceVault = Input.empty();
        this.vaultCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudServiceVaultSecretGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> sourceVault;
        private @Nullable Input<List<CloudServiceVaultCertificateArgs>> vaultCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudServiceVaultSecretGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceVault = defaults.sourceVault;
    	      this.vaultCertificates = defaults.vaultCertificates;
        }

        public Builder setSourceVault(@Nullable Input<SubResourceArgs> sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }

        public Builder setSourceVault(@Nullable SubResourceArgs sourceVault) {
            this.sourceVault = Input.ofNullable(sourceVault);
            return this;
        }

        public Builder setVaultCertificates(@Nullable Input<List<CloudServiceVaultCertificateArgs>> vaultCertificates) {
            this.vaultCertificates = vaultCertificates;
            return this;
        }

        public Builder setVaultCertificates(@Nullable List<CloudServiceVaultCertificateArgs> vaultCertificates) {
            this.vaultCertificates = Input.ofNullable(vaultCertificates);
            return this;
        }

        public CloudServiceVaultSecretGroupArgs build() {
            return new CloudServiceVaultSecretGroupArgs(sourceVault, vaultCertificates);
        }
    }
}
