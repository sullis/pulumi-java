// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.CertificateInformationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Certificate configuration which consist of non-trusted intermediates and root certificates.
 * 
 */
public final class CertificateConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateConfigurationResponse Empty = new CertificateConfigurationResponse();

    /**
     * Certificate information.
     * 
     */
    @Import(name="certificate")
    private @Nullable CertificateInformationResponse certificate;

    /**
     * @return Certificate information.
     * 
     */
    public Optional<CertificateInformationResponse> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * Certificate Password.
     * 
     */
    @Import(name="certificatePassword")
    private @Nullable String certificatePassword;

    /**
     * @return Certificate Password.
     * 
     */
    public Optional<String> certificatePassword() {
        return Optional.ofNullable(this.certificatePassword);
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @Import(name="encodedCertificate")
    private @Nullable String encodedCertificate;

    /**
     * @return Base64 Encoded certificate.
     * 
     */
    public Optional<String> encodedCertificate() {
        return Optional.ofNullable(this.encodedCertificate);
    }

    /**
     * The System.Security.Cryptography.x509certificates.StoreName certificate store location. Only Root and CertificateAuthority are valid locations.
     * 
     */
    @Import(name="storeName", required=true)
    private String storeName;

    /**
     * @return The System.Security.Cryptography.x509certificates.StoreName certificate store location. Only Root and CertificateAuthority are valid locations.
     * 
     */
    public String storeName() {
        return this.storeName;
    }

    private CertificateConfigurationResponse() {}

    private CertificateConfigurationResponse(CertificateConfigurationResponse $) {
        this.certificate = $.certificate;
        this.certificatePassword = $.certificatePassword;
        this.encodedCertificate = $.encodedCertificate;
        this.storeName = $.storeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigurationResponse $;

        public Builder() {
            $ = new CertificateConfigurationResponse();
        }

        public Builder(CertificateConfigurationResponse defaults) {
            $ = new CertificateConfigurationResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate Certificate information.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable CertificateInformationResponse certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificatePassword Certificate Password.
         * 
         * @return builder
         * 
         */
        public Builder certificatePassword(@Nullable String certificatePassword) {
            $.certificatePassword = certificatePassword;
            return this;
        }

        /**
         * @param encodedCertificate Base64 Encoded certificate.
         * 
         * @return builder
         * 
         */
        public Builder encodedCertificate(@Nullable String encodedCertificate) {
            $.encodedCertificate = encodedCertificate;
            return this;
        }

        /**
         * @param storeName The System.Security.Cryptography.x509certificates.StoreName certificate store location. Only Root and CertificateAuthority are valid locations.
         * 
         * @return builder
         * 
         */
        public Builder storeName(String storeName) {
            $.storeName = storeName;
            return this;
        }

        public CertificateConfigurationResponse build() {
            $.storeName = Objects.requireNonNull($.storeName, "expected parameter 'storeName' to be non-null");
            return $;
        }
    }

}
