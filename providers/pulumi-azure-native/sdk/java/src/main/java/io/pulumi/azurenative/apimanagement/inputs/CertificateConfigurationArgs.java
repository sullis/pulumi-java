// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.CertificateInformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Certificate configuration which consist of non-trusted intermediates and root certificates.
 * 
 */
public final class CertificateConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigurationArgs Empty = new CertificateConfigurationArgs();

    /**
     * Certificate information.
     * 
     */
    @InputImport(name="certificate")
      private final @Nullable Input<CertificateInformationArgs> certificate;

    public Input<CertificateInformationArgs> getCertificate() {
        return this.certificate == null ? Input.empty() : this.certificate;
    }

    /**
     * Certificate Password.
     * 
     */
    @InputImport(name="certificatePassword")
      private final @Nullable Input<String> certificatePassword;

    public Input<String> getCertificatePassword() {
        return this.certificatePassword == null ? Input.empty() : this.certificatePassword;
    }

    /**
     * Base64 Encoded certificate.
     * 
     */
    @InputImport(name="encodedCertificate")
      private final @Nullable Input<String> encodedCertificate;

    public Input<String> getEncodedCertificate() {
        return this.encodedCertificate == null ? Input.empty() : this.encodedCertificate;
    }

    /**
     * The System.Security.Cryptography.x509certificates.StoreName certificate store location. Only Root and CertificateAuthority are valid locations.
     * 
     */
    @InputImport(name="storeName", required=true)
      private final Input<String> storeName;

    public Input<String> getStoreName() {
        return this.storeName;
    }

    public CertificateConfigurationArgs(
        @Nullable Input<CertificateInformationArgs> certificate,
        @Nullable Input<String> certificatePassword,
        @Nullable Input<String> encodedCertificate,
        Input<String> storeName) {
        this.certificate = certificate;
        this.certificatePassword = certificatePassword;
        this.encodedCertificate = encodedCertificate;
        this.storeName = Objects.requireNonNull(storeName, "expected parameter 'storeName' to be non-null");
    }

    private CertificateConfigurationArgs() {
        this.certificate = Input.empty();
        this.certificatePassword = Input.empty();
        this.encodedCertificate = Input.empty();
        this.storeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CertificateInformationArgs> certificate;
        private @Nullable Input<String> certificatePassword;
        private @Nullable Input<String> encodedCertificate;
        private Input<String> storeName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificatePassword = defaults.certificatePassword;
    	      this.encodedCertificate = defaults.encodedCertificate;
    	      this.storeName = defaults.storeName;
        }

        public Builder setCertificate(@Nullable Input<CertificateInformationArgs> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder setCertificate(@Nullable CertificateInformationArgs certificate) {
            this.certificate = Input.ofNullable(certificate);
            return this;
        }

        public Builder setCertificatePassword(@Nullable Input<String> certificatePassword) {
            this.certificatePassword = certificatePassword;
            return this;
        }

        public Builder setCertificatePassword(@Nullable String certificatePassword) {
            this.certificatePassword = Input.ofNullable(certificatePassword);
            return this;
        }

        public Builder setEncodedCertificate(@Nullable Input<String> encodedCertificate) {
            this.encodedCertificate = encodedCertificate;
            return this;
        }

        public Builder setEncodedCertificate(@Nullable String encodedCertificate) {
            this.encodedCertificate = Input.ofNullable(encodedCertificate);
            return this;
        }

        public Builder setStoreName(Input<String> storeName) {
            this.storeName = Objects.requireNonNull(storeName);
            return this;
        }

        public Builder setStoreName(String storeName) {
            this.storeName = Input.of(Objects.requireNonNull(storeName));
            return this;
        }
        public CertificateConfigurationArgs build() {
            return new CertificateConfigurationArgs(certificate, certificatePassword, encodedCertificate, storeName);
        }
    }
}