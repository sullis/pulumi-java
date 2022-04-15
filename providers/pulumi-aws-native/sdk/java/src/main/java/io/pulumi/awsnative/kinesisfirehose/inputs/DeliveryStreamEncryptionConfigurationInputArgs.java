// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamEncryptionConfigurationInputArgs Empty = new DeliveryStreamEncryptionConfigurationInputArgs();

    @Import(name="keyARN")
      private final @Nullable Output<String> keyARN;

    public Output<String> keyARN() {
        return this.keyARN == null ? Codegen.empty() : this.keyARN;
    }

    @Import(name="keyType", required=true)
      private final Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType;

    public Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType() {
        return this.keyType;
    }

    public DeliveryStreamEncryptionConfigurationInputArgs(
        @Nullable Output<String> keyARN,
        Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType) {
        this.keyARN = keyARN;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private DeliveryStreamEncryptionConfigurationInputArgs() {
        this.keyARN = Codegen.empty();
        this.keyType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyARN;
        private Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyARN = defaults.keyARN;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyARN(@Nullable Output<String> keyARN) {
            this.keyARN = keyARN;
            return this;
        }
        public Builder keyARN(@Nullable String keyARN) {
            this.keyARN = Codegen.ofNullable(keyARN);
            return this;
        }
        public Builder keyType(Output<DeliveryStreamEncryptionConfigurationInputKeyType> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder keyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            this.keyType = Output.of(Objects.requireNonNull(keyType));
            return this;
        }        public DeliveryStreamEncryptionConfigurationInputArgs build() {
            return new DeliveryStreamEncryptionConfigurationInputArgs(keyARN, keyType);
        }
    }
}
