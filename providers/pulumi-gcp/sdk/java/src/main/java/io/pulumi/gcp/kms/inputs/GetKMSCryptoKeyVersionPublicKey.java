// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKMSCryptoKeyVersionPublicKey extends io.pulumi.resources.InvokeArgs {

    public static final GetKMSCryptoKeyVersionPublicKey Empty = new GetKMSCryptoKeyVersionPublicKey();

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    @InputImport(name="algorithm", required=true)
      private final String algorithm;

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The public key, encoded in PEM format. For more information, see the RFC 7468 sections for General Considerations and Textual Encoding of Subject Public Key Info.
     * 
     */
    @InputImport(name="pem", required=true)
      private final String pem;

    public String getPem() {
        return this.pem;
    }

    public GetKMSCryptoKeyVersionPublicKey(
        String algorithm,
        String pem) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.pem = Objects.requireNonNull(pem, "expected parameter 'pem' to be non-null");
    }

    private GetKMSCryptoKeyVersionPublicKey() {
        this.algorithm = null;
        this.pem = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSCryptoKeyVersionPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private String pem;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSCryptoKeyVersionPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.pem = defaults.pem;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setPem(String pem) {
            this.pem = Objects.requireNonNull(pem);
            return this;
        }
        public GetKMSCryptoKeyVersionPublicKey build() {
            return new GetKMSCryptoKeyVersionPublicKey(algorithm, pem);
        }
    }
}