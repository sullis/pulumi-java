// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CryptoKeyVersionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionTemplateArgs Empty = new CryptoKeyVersionTemplateArgs();

    /**
     * The algorithm to use when creating a version based on this template.
     * See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
     * 
     */
    @InputImport(name="algorithm", required=true)
    private final Input<String> algorithm;

    public Input<String> getAlgorithm() {
        return this.algorithm;
    }

    /**
     * The protection level to use when creating a version based on this template. Possible values include "SOFTWARE", "HSM", "EXTERNAL". Defaults to "SOFTWARE".
     * 
     */
    @InputImport(name="protectionLevel")
    private final @Nullable Input<String> protectionLevel;

    public Input<String> getProtectionLevel() {
        return this.protectionLevel == null ? Input.empty() : this.protectionLevel;
    }

    public CryptoKeyVersionTemplateArgs(
        Input<String> algorithm,
        @Nullable Input<String> protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = protectionLevel;
    }

    private CryptoKeyVersionTemplateArgs() {
        this.algorithm = Input.empty();
        this.protectionLevel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> algorithm;
        private @Nullable Input<String> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder setAlgorithm(Input<String> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }

        public Builder setAlgorithm(String algorithm) {
            this.algorithm = Input.of(Objects.requireNonNull(algorithm));
            return this;
        }

        public Builder setProtectionLevel(@Nullable Input<String> protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }

        public Builder setProtectionLevel(@Nullable String protectionLevel) {
            this.protectionLevel = Input.ofNullable(protectionLevel);
            return this;
        }

        public CryptoKeyVersionTemplateArgs build() {
            return new CryptoKeyVersionTemplateArgs(algorithm, protectionLevel);
        }
    }
}
