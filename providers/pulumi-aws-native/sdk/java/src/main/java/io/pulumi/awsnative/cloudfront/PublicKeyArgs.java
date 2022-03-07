// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront;

import io.pulumi.awsnative.cloudfront.inputs.PublicKeyConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


public final class PublicKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicKeyArgs Empty = new PublicKeyArgs();

    @InputImport(name="publicKeyConfig", required=true)
      private final Input<PublicKeyConfigArgs> publicKeyConfig;

    public Input<PublicKeyConfigArgs> getPublicKeyConfig() {
        return this.publicKeyConfig;
    }

    public PublicKeyArgs(Input<PublicKeyConfigArgs> publicKeyConfig) {
        this.publicKeyConfig = Objects.requireNonNull(publicKeyConfig, "expected parameter 'publicKeyConfig' to be non-null");
    }

    private PublicKeyArgs() {
        this.publicKeyConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PublicKeyConfigArgs> publicKeyConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeyConfig = defaults.publicKeyConfig;
        }

        public Builder setPublicKeyConfig(Input<PublicKeyConfigArgs> publicKeyConfig) {
            this.publicKeyConfig = Objects.requireNonNull(publicKeyConfig);
            return this;
        }

        public Builder setPublicKeyConfig(PublicKeyConfigArgs publicKeyConfig) {
            this.publicKeyConfig = Input.of(Objects.requireNonNull(publicKeyConfig));
            return this;
        }
        public PublicKeyArgs build() {
            return new PublicKeyArgs(publicKeyConfig);
        }
    }
}