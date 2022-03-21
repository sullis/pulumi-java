// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CertificateAuthorityCertificateAuthorityConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateAuthorityConfigurationGetArgs Empty = new CertificateAuthorityCertificateAuthorityConfigurationGetArgs();

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
     * 
     */
    @Import(name="keyAlgorithm", required=true)
      private final Output<String> keyAlgorithm;

    public Output<String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
     * 
     */
    @Import(name="signingAlgorithm", required=true)
      private final Output<String> signingAlgorithm;

    public Output<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
     * 
     */
    @Import(name="subject", required=true)
      private final Output<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject;

    public Output<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> getSubject() {
        return this.subject;
    }

    public CertificateAuthorityCertificateAuthorityConfigurationGetArgs(
        Output<String> keyAlgorithm,
        Output<String> signingAlgorithm,
        Output<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject) {
        this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm, "expected parameter 'keyAlgorithm' to be non-null");
        this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
    }

    private CertificateAuthorityCertificateAuthorityConfigurationGetArgs() {
        this.keyAlgorithm = Output.empty();
        this.signingAlgorithm = Output.empty();
        this.subject = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCertificateAuthorityConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyAlgorithm;
        private Output<String> signingAlgorithm;
        private Output<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCertificateAuthorityConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
    	      this.subject = defaults.subject;
        }

        public Builder keyAlgorithm(Output<String> keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Output.of(Objects.requireNonNull(keyAlgorithm));
            return this;
        }
        public Builder signingAlgorithm(Output<String> signingAlgorithm) {
            this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm);
            return this;
        }
        public Builder signingAlgorithm(String signingAlgorithm) {
            this.signingAlgorithm = Output.of(Objects.requireNonNull(signingAlgorithm));
            return this;
        }
        public Builder subject(Output<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder subject(CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs subject) {
            this.subject = Output.of(Objects.requireNonNull(subject));
            return this;
        }        public CertificateAuthorityCertificateAuthorityConfigurationGetArgs build() {
            return new CertificateAuthorityCertificateAuthorityConfigurationGetArgs(keyAlgorithm, signingAlgorithm, subject);
        }
    }
}
