// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CryptoKeyConfigResponse {
    /**
     * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    private final String keyReference;

    @CustomType.Constructor
    private CryptoKeyConfigResponse(@CustomType.Parameter("keyReference") String keyReference) {
        this.keyReference = keyReference;
    }

    /**
     * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
    */
    public String getKeyReference() {
        return this.keyReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyReference = defaults.keyReference;
        }

        public Builder keyReference(String keyReference) {
            this.keyReference = Objects.requireNonNull(keyReference);
            return this;
        }        public CryptoKeyConfigResponse build() {
            return new CryptoKeyConfigResponse(keyReference);
        }
    }
}
