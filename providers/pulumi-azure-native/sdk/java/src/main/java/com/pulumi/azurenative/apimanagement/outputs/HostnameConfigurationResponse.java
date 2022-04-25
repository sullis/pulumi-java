// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.CertificateInformationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostnameConfigurationResponse {
    /**
     * @return Certificate information.
     * 
     */
    private final @Nullable CertificateInformationResponse certificate;
    /**
     * @return Certificate Password.
     * 
     */
    private final @Nullable String certificatePassword;
    /**
     * @return Specify true to setup the certificate associated with this Hostname as the Default SSL Certificate. If a client does not send the SNI header, then this will be the certificate that will be challenged. The property is useful if a service has multiple custom hostname enabled and it needs to decide on the default ssl certificate. The setting only applied to Proxy Hostname Type.
     * 
     */
    private final @Nullable Boolean defaultSslBinding;
    /**
     * @return Base64 Encoded certificate.
     * 
     */
    private final @Nullable String encodedCertificate;
    /**
     * @return Hostname to configure on the Api Management service.
     * 
     */
    private final String hostName;
    /**
     * @return System or User Assigned Managed identity clientId as generated by Azure AD, which has GET access to the keyVault containing the SSL certificate.
     * 
     */
    private final @Nullable String identityClientId;
    /**
     * @return Url to the KeyVault Secret containing the Ssl Certificate. If absolute Url containing version is provided, auto-update of ssl certificate will not work. This requires Api Management service to be configured with aka.ms/apimmsi. The secret should be of type *application/x-pkcs12*
     * 
     */
    private final @Nullable String keyVaultId;
    /**
     * @return Specify true to always negotiate client certificate on the hostname. Default Value is false.
     * 
     */
    private final @Nullable Boolean negotiateClientCertificate;
    /**
     * @return Hostname type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private HostnameConfigurationResponse(
        @CustomType.Parameter("certificate") @Nullable CertificateInformationResponse certificate,
        @CustomType.Parameter("certificatePassword") @Nullable String certificatePassword,
        @CustomType.Parameter("defaultSslBinding") @Nullable Boolean defaultSslBinding,
        @CustomType.Parameter("encodedCertificate") @Nullable String encodedCertificate,
        @CustomType.Parameter("hostName") String hostName,
        @CustomType.Parameter("identityClientId") @Nullable String identityClientId,
        @CustomType.Parameter("keyVaultId") @Nullable String keyVaultId,
        @CustomType.Parameter("negotiateClientCertificate") @Nullable Boolean negotiateClientCertificate,
        @CustomType.Parameter("type") String type) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.defaultSslBinding = defaultSslBinding;
        this.encodedCertificate = encodedCertificate;
        this.hostName = hostName;
        this.identityClientId = identityClientId;
        this.keyVaultId = keyVaultId;
        this.negotiateClientCertificate = negotiateClientCertificate;
        this.type = type;
    }

    /**
     * @return Certificate information.
     * 
     */
    public Optional<CertificateInformationResponse> certificate() {
        return Optional.ofNullable(this.certificate);
    }
    /**
     * @return Certificate Password.
     * 
     */
    public Optional<String> certificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }
    /**
     * @return Specify true to setup the certificate associated with this Hostname as the Default SSL Certificate. If a client does not send the SNI header, then this will be the certificate that will be challenged. The property is useful if a service has multiple custom hostname enabled and it needs to decide on the default ssl certificate. The setting only applied to Proxy Hostname Type.
     * 
     */
    public Optional<Boolean> defaultSslBinding() {
        return Optional.ofNullable(this.defaultSslBinding);
    }
    /**
     * @return Base64 Encoded certificate.
     * 
     */
    public Optional<String> encodedCertificate() {
        return Optional.ofNullable(this.encodedCertificate);
    }
    /**
     * @return Hostname to configure on the Api Management service.
     * 
     */
    public String hostName() {
        return this.hostName;
    }
    /**
     * @return System or User Assigned Managed identity clientId as generated by Azure AD, which has GET access to the keyVault containing the SSL certificate.
     * 
     */
    public Optional<String> identityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }
    /**
     * @return Url to the KeyVault Secret containing the Ssl Certificate. If absolute Url containing version is provided, auto-update of ssl certificate will not work. This requires Api Management service to be configured with aka.ms/apimmsi. The secret should be of type *application/x-pkcs12*
     * 
     */
    public Optional<String> keyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * @return Specify true to always negotiate client certificate on the hostname. Default Value is false.
     * 
     */
    public Optional<Boolean> negotiateClientCertificate() {
        return Optional.ofNullable(this.negotiateClientCertificate);
    }
    /**
     * @return Hostname type.
     * 
     */
    public String type() {
        return this.type;
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
