// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs();

    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    @Import(name="cryptoKeyName", required=true)
      private final Output<String> cryptoKeyName;

    public Output<String> getCryptoKeyName() {
        return this.cryptoKeyName;
    }

    /**
     * The wrapped data crypto key.
     * A base64-encoded string.
     * 
     */
    @Import(name="wrappedKey", required=true)
      private final Output<String> wrappedKey;

    public Output<String> getWrappedKey() {
        return this.wrappedKey;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs(
        Output<String> cryptoKeyName,
        Output<String> wrappedKey) {
        this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName, "expected parameter 'cryptoKeyName' to be non-null");
        this.wrappedKey = Objects.requireNonNull(wrappedKey, "expected parameter 'wrappedKey' to be non-null");
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs() {
        this.cryptoKeyName = Output.empty();
        this.wrappedKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> cryptoKeyName;
        private Output<String> wrappedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyName = defaults.cryptoKeyName;
    	      this.wrappedKey = defaults.wrappedKey;
        }

        public Builder cryptoKeyName(Output<String> cryptoKeyName) {
            this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
            return this;
        }
        public Builder cryptoKeyName(String cryptoKeyName) {
            this.cryptoKeyName = Output.of(Objects.requireNonNull(cryptoKeyName));
            return this;
        }
        public Builder wrappedKey(Output<String> wrappedKey) {
            this.wrappedKey = Objects.requireNonNull(wrappedKey);
            return this;
        }
        public Builder wrappedKey(String wrappedKey) {
            this.wrappedKey = Output.of(Objects.requireNonNull(wrappedKey));
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoDeterministicConfigCryptoKeyKmsWrappedArgs(cryptoKeyName, wrappedKey);
        }
    }
}
