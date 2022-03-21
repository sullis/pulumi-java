// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datafusion_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The crypto key configuration. This field is used by the Customer-managed encryption keys (CMEK) feature.
 * 
 */
public final class CryptoKeyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyConfigArgs Empty = new CryptoKeyConfigArgs();

    /**
     * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="keyReference")
      private final @Nullable Output<String> keyReference;

    public Output<String> getKeyReference() {
        return this.keyReference == null ? Output.empty() : this.keyReference;
    }

    public CryptoKeyConfigArgs(@Nullable Output<String> keyReference) {
        this.keyReference = keyReference;
    }

    private CryptoKeyConfigArgs() {
        this.keyReference = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyReference;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyReference = defaults.keyReference;
        }

        public Builder keyReference(@Nullable Output<String> keyReference) {
            this.keyReference = keyReference;
            return this;
        }
        public Builder keyReference(@Nullable String keyReference) {
            this.keyReference = Output.ofNullable(keyReference);
            return this;
        }        public CryptoKeyConfigArgs build() {
            return new CryptoKeyConfigArgs(keyReference);
        }
    }
}
