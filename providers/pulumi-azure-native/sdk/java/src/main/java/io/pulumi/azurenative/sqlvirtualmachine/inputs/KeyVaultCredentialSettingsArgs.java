// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configure your SQL virtual machine to be able to connect to the Azure Key Vault service.
 * 
 */
public final class KeyVaultCredentialSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultCredentialSettingsArgs Empty = new KeyVaultCredentialSettingsArgs();

    /**
     * Azure Key Vault url.
     * 
     */
    @InputImport(name="azureKeyVaultUrl")
      private final @Nullable Input<String> azureKeyVaultUrl;

    public Input<String> getAzureKeyVaultUrl() {
        return this.azureKeyVaultUrl == null ? Input.empty() : this.azureKeyVaultUrl;
    }

    /**
     * Credential name.
     * 
     */
    @InputImport(name="credentialName")
      private final @Nullable Input<String> credentialName;

    public Input<String> getCredentialName() {
        return this.credentialName == null ? Input.empty() : this.credentialName;
    }

    /**
     * Enable or disable key vault credential setting.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<Boolean> enable;

    public Input<Boolean> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Service principal name to access key vault.
     * 
     */
    @InputImport(name="servicePrincipalName")
      private final @Nullable Input<String> servicePrincipalName;

    public Input<String> getServicePrincipalName() {
        return this.servicePrincipalName == null ? Input.empty() : this.servicePrincipalName;
    }

    /**
     * Service principal name secret to access key vault.
     * 
     */
    @InputImport(name="servicePrincipalSecret")
      private final @Nullable Input<String> servicePrincipalSecret;

    public Input<String> getServicePrincipalSecret() {
        return this.servicePrincipalSecret == null ? Input.empty() : this.servicePrincipalSecret;
    }

    public KeyVaultCredentialSettingsArgs(
        @Nullable Input<String> azureKeyVaultUrl,
        @Nullable Input<String> credentialName,
        @Nullable Input<Boolean> enable,
        @Nullable Input<String> servicePrincipalName,
        @Nullable Input<String> servicePrincipalSecret) {
        this.azureKeyVaultUrl = azureKeyVaultUrl;
        this.credentialName = credentialName;
        this.enable = enable;
        this.servicePrincipalName = servicePrincipalName;
        this.servicePrincipalSecret = servicePrincipalSecret;
    }

    private KeyVaultCredentialSettingsArgs() {
        this.azureKeyVaultUrl = Input.empty();
        this.credentialName = Input.empty();
        this.enable = Input.empty();
        this.servicePrincipalName = Input.empty();
        this.servicePrincipalSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultCredentialSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> azureKeyVaultUrl;
        private @Nullable Input<String> credentialName;
        private @Nullable Input<Boolean> enable;
        private @Nullable Input<String> servicePrincipalName;
        private @Nullable Input<String> servicePrincipalSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultCredentialSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureKeyVaultUrl = defaults.azureKeyVaultUrl;
    	      this.credentialName = defaults.credentialName;
    	      this.enable = defaults.enable;
    	      this.servicePrincipalName = defaults.servicePrincipalName;
    	      this.servicePrincipalSecret = defaults.servicePrincipalSecret;
        }

        public Builder setAzureKeyVaultUrl(@Nullable Input<String> azureKeyVaultUrl) {
            this.azureKeyVaultUrl = azureKeyVaultUrl;
            return this;
        }

        public Builder setAzureKeyVaultUrl(@Nullable String azureKeyVaultUrl) {
            this.azureKeyVaultUrl = Input.ofNullable(azureKeyVaultUrl);
            return this;
        }

        public Builder setCredentialName(@Nullable Input<String> credentialName) {
            this.credentialName = credentialName;
            return this;
        }

        public Builder setCredentialName(@Nullable String credentialName) {
            this.credentialName = Input.ofNullable(credentialName);
            return this;
        }

        public Builder setEnable(@Nullable Input<Boolean> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable Boolean enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setServicePrincipalName(@Nullable Input<String> servicePrincipalName) {
            this.servicePrincipalName = servicePrincipalName;
            return this;
        }

        public Builder setServicePrincipalName(@Nullable String servicePrincipalName) {
            this.servicePrincipalName = Input.ofNullable(servicePrincipalName);
            return this;
        }

        public Builder setServicePrincipalSecret(@Nullable Input<String> servicePrincipalSecret) {
            this.servicePrincipalSecret = servicePrincipalSecret;
            return this;
        }

        public Builder setServicePrincipalSecret(@Nullable String servicePrincipalSecret) {
            this.servicePrincipalSecret = Input.ofNullable(servicePrincipalSecret);
            return this;
        }
        public KeyVaultCredentialSettingsArgs build() {
            return new KeyVaultCredentialSettingsArgs(azureKeyVaultUrl, credentialName, enable, servicePrincipalName, servicePrincipalSecret);
        }
    }
}