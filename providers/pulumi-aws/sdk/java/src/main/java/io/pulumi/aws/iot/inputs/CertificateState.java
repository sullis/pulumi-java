// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateState extends io.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * Boolean flag to indicate if the certificate should be active
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> active() {
        return this.active == null ? Codegen.empty() : this.active;
    }

    /**
     * The ARN of the created certificate.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The certificate data, in PEM format.
     * 
     */
    @Import(name="certificatePem")
      private final @Nullable Output<String> certificatePem;

    public Output<String> certificatePem() {
        return this.certificatePem == null ? Codegen.empty() : this.certificatePem;
    }

    /**
     * The certificate signing request. Review
     * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
     * for more information on generating a certificate from a certificate signing request (CSR).
     * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
     * for more information on generating keys and a certificate.
     * 
     */
    @Import(name="csr")
      private final @Nullable Output<String> csr;

    public Output<String> csr() {
        return this.csr == null ? Codegen.empty() : this.csr;
    }

    /**
     * When no CSR is provided, the private key.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey == null ? Codegen.empty() : this.privateKey;
    }

    /**
     * When no CSR is provided, the public key.
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> publicKey() {
        return this.publicKey == null ? Codegen.empty() : this.publicKey;
    }

    public CertificateState(
        @Nullable Output<Boolean> active,
        @Nullable Output<String> arn,
        @Nullable Output<String> certificatePem,
        @Nullable Output<String> csr,
        @Nullable Output<String> privateKey,
        @Nullable Output<String> publicKey) {
        this.active = active;
        this.arn = arn;
        this.certificatePem = certificatePem;
        this.csr = csr;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    private CertificateState() {
        this.active = Codegen.empty();
        this.arn = Codegen.empty();
        this.certificatePem = Codegen.empty();
        this.csr = Codegen.empty();
        this.privateKey = Codegen.empty();
        this.publicKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> certificatePem;
        private @Nullable Output<String> csr;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<String> publicKey;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.arn = defaults.arn;
    	      this.certificatePem = defaults.certificatePem;
    	      this.csr = defaults.csr;
    	      this.privateKey = defaults.privateKey;
    	      this.publicKey = defaults.publicKey;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }
        public Builder active(@Nullable Boolean active) {
            this.active = Codegen.ofNullable(active);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder certificatePem(@Nullable Output<String> certificatePem) {
            this.certificatePem = certificatePem;
            return this;
        }
        public Builder certificatePem(@Nullable String certificatePem) {
            this.certificatePem = Codegen.ofNullable(certificatePem);
            return this;
        }
        public Builder csr(@Nullable Output<String> csr) {
            this.csr = csr;
            return this;
        }
        public Builder csr(@Nullable String csr) {
            this.csr = Codegen.ofNullable(csr);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Codegen.ofNullable(privateKey);
            return this;
        }
        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }
        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Codegen.ofNullable(publicKey);
            return this;
        }        public CertificateState build() {
            return new CertificateState(active, arn, certificatePem, csr, privateKey, publicKey);
        }
    }
}
