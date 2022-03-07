// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PkixPublicKeyResponse {
    /**
     * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
     */
    private final String publicKeyPem;
    /**
     * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
     */
    private final String signatureAlgorithm;

    @OutputCustomType.Constructor({"publicKeyPem","signatureAlgorithm"})
    private PkixPublicKeyResponse(
        String publicKeyPem,
        String signatureAlgorithm) {
        this.publicKeyPem = Objects.requireNonNull(publicKeyPem);
        this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
    }

    /**
     * A PEM-encoded public key, as described in https://tools.ietf.org/html/rfc7468#section-13
     * 
    */
    public String getPublicKeyPem() {
        return this.publicKeyPem;
    }
    /**
     * The signature algorithm used to verify a message against a signature using this key. These signature algorithm must match the structure and any object identifiers encoded in `public_key_pem` (i.e. this algorithm must match that of the public key).
     * 
    */
    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PkixPublicKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String publicKeyPem;
        private String signatureAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(PkixPublicKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyPem = defaults.publicKeyPem;
    	      this.signatureAlgorithm = defaults.signatureAlgorithm;
        }

        public Builder setPublicKeyPem(String publicKeyPem) {
            this.publicKeyPem = Objects.requireNonNull(publicKeyPem);
            return this;
        }

        public Builder setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = Objects.requireNonNull(signatureAlgorithm);
            return this;
        }
        public PkixPublicKeyResponse build() {
            return new PkixPublicKeyResponse(publicKeyPem, signatureAlgorithm);
        }
    }
}