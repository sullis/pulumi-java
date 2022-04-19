// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.CertificateInformationResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom hostname configuration.
 * 
 */
public final class HostnameConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final HostnameConfigurationResponse Empty = new HostnameConfigurationResponse();

    /**
     * Certificate information.
     * 
     */
    @Import(name="certificate")
      private final @Nullable CertificateInformationResponse certificate;

    public Optional<CertificateInformationResponse> certificate() {
        return this.certificate == null ? Optional.empty() : Optional.ofNullable(this.certificate);
    }

    /**
     * Certificate Password.
     * 
     */
    @Import(name="certificatePassword")
      private final @Nullable String certificatePassword;

    public Optional<String> certificatePassword() {
        return this.certificatePassword == null ? Optional.empty() : Optional.ofNullable(this.certificatePassword);
    }

    /**
     * Specify true to setup the certificate associated with this Hostname as the Default SSL Certificate. If a client does not send the SNI header, then this will be the certificate that will be challenged. The property is useful if a service has multiple custom hostname enabled and it needs to decide on the default ssl certificate. The setting only applied to Proxy Hostname Type.
     * 
     */
    @Import(name="defaultSslBinding")
      private final @Nullable Boolean defaultSslBinding;

    public Optional<Boolean> defaultSslBinding() {
        return this.defaultSslBinding == null ? Optional.empty() : Optional.ofNullable(this.defaultSslBinding);
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @Import(name="encodedCertificate")
      private final @Nullable String encodedCertificate;

    public Optional<String> encodedCertificate() {
        return this.encodedCertificate == null ? Optional.empty() : Optional.ofNullable(this.encodedCertificate);
    }

    /**
     * Hostname to configure on the Api Management service.
     * 
     */
    @Import(name="hostName", required=true)
      private final String hostName;

    public String hostName() {
        return this.hostName;
    }

    /**
     * System or User Assigned Managed identity clientId as generated by Azure AD, which has GET access to the keyVault containing the SSL certificate.
     * 
     */
    @Import(name="identityClientId")
      private final @Nullable String identityClientId;

    public Optional<String> identityClientId() {
        return this.identityClientId == null ? Optional.empty() : Optional.ofNullable(this.identityClientId);
    }

    /**
     * Url to the KeyVault Secret containing the Ssl Certificate. If absolute Url containing version is provided, auto-update of ssl certificate will not work. This requires Api Management service to be configured with aka.ms/apimmsi. The secret should be of type *application/x-pkcs12*
     * 
     */
    @Import(name="keyVaultId")
      private final @Nullable String keyVaultId;

    public Optional<String> keyVaultId() {
        return this.keyVaultId == null ? Optional.empty() : Optional.ofNullable(this.keyVaultId);
    }

    /**
     * Specify true to always negotiate client certificate on the hostname. Default Value is false.
     * 
     */
    @Import(name="negotiateClientCertificate")
      private final @Nullable Boolean negotiateClientCertificate;

    public Optional<Boolean> negotiateClientCertificate() {
        return this.negotiateClientCertificate == null ? Optional.empty() : Optional.ofNullable(this.negotiateClientCertificate);
    }

    /**
     * Hostname type.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public HostnameConfigurationResponse(
        @Nullable CertificateInformationResponse certificate,
        @Nullable String certificatePassword,
        @Nullable Boolean defaultSslBinding,
        @Nullable String encodedCertificate,
        String hostName,
        @Nullable String identityClientId,
        @Nullable String keyVaultId,
        @Nullable Boolean negotiateClientCertificate,
        String type) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = Codegen.booleanProp("defaultSslBinding").arg(defaultSslBinding).def(false).getNullable();
        this.encodedCertificate = encodedCertificate;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.identityClientId = identityClientId;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = Codegen.booleanProp("negotiateClientCertificate").arg(negotiateClientCertificate).def(false).getNullable();
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private HostnameConfigurationResponse() {
        this.certificate = null;
        this.certificatePassword = null;
        this.defaultSslBinding = null;
        this.encodedCertificate = null;
        this.hostName = null;
        this.identityClientId = null;
        this.keyVaultId = null;
        this.negotiateClientCertificate = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostnameConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateInformationResponse certificate;
        private @Nullable String certificatePassword;
        private @Nullable Boolean defaultSslBinding;
        private @Nullable String encodedCertificate;
        private String hostName;
        private @Nullable String identityClientId;
        private @Nullable String keyVaultId;
        private @Nullable Boolean negotiateClientCertificate;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(HostnameConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.defaultSslBinding = defaults.defaultSslBinding;
    	      this.encodedCertificate = defaults.encodedCertificate;
    	      this.hostName = defaults.hostName;
    	      this.identityClientId = defaults.identityClientId;
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.negotiateClientCertificate = defaults.negotiateClientCertificate;
    	      this.type = defaults.type;
        }

        public Builder certificate(@Nullable CertificateInformationResponse certificate) {
            this.certificate = certificate;
            return this;
        }
        public Builder certificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }
        public Builder defaultSslBinding(@Nullable Boolean defaultSslBinding) {
            this.defaultSslBinding = defaultSslBinding;
            return this;
        }
        public Builder encodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }
        public Builder hostName(String hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }
        public Builder identityClientId(@Nullable String identityClientId) {
            this.identityClientId = identityClientId;
            return this;
        }
        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }
        public Builder negotiateClientCertificate(@Nullable Boolean negotiateClientCertificate) {
            this.negotiateClientCertificate = negotiateClientCertificate;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public HostnameConfigurationResponse build() {
            return new HostnameConfigurationResponse(certificate, certificatePassword, defaultSslBinding, encodedCertificate, hostName, identityClientId, keyVaultId, negotiateClientCertificate, type);
        }
    }
}
