// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetKMSSecretCiphertextResult {
    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    private final String ciphertext;
    private final String cryptoKey;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String plaintext;

    @OutputCustomType.Constructor({"ciphertext","cryptoKey","id","plaintext"})
    private GetKMSSecretCiphertextResult(
        String ciphertext,
        String cryptoKey,
        String id,
        String plaintext) {
        this.ciphertext = Objects.requireNonNull(ciphertext);
        this.cryptoKey = Objects.requireNonNull(cryptoKey);
        this.id = Objects.requireNonNull(id);
        this.plaintext = Objects.requireNonNull(plaintext);
    }

    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    public String getCiphertext() {
        return this.ciphertext;
    }
    public String getCryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getPlaintext() {
        return this.plaintext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKMSSecretCiphertextResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ciphertext;
        private String cryptoKey;
        private String id;
        private String plaintext;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKMSSecretCiphertextResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ciphertext = defaults.ciphertext;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.id = defaults.id;
    	      this.plaintext = defaults.plaintext;
        }

        public Builder setCiphertext(String ciphertext) {
            this.ciphertext = Objects.requireNonNull(ciphertext);
            return this;
        }

        public Builder setCryptoKey(String cryptoKey) {
            this.cryptoKey = Objects.requireNonNull(cryptoKey);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPlaintext(String plaintext) {
            this.plaintext = Objects.requireNonNull(plaintext);
            return this;
        }

        public GetKMSSecretCiphertextResult build() {
            return new GetKMSSecretCiphertextResult(ciphertext, cryptoKey, id, plaintext);
        }
    }
}
