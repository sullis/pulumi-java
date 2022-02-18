// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationInputKeyType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryStreamEncryptionConfigurationInput {
    private final @Nullable String keyARN;
    private final DeliveryStreamEncryptionConfigurationInputKeyType keyType;

    @OutputCustomType.Constructor({"keyARN","keyType"})
    private DeliveryStreamEncryptionConfigurationInput(
        @Nullable String keyARN,
        DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
        this.keyARN = keyARN;
        this.keyType = Objects.requireNonNull(keyType);
    }

    public Optional<String> getKeyARN() {
        return Optional.ofNullable(this.keyARN);
    }
    public DeliveryStreamEncryptionConfigurationInputKeyType getKeyType() {
        return this.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyARN;
        private DeliveryStreamEncryptionConfigurationInputKeyType keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyARN = defaults.keyARN;
    	      this.keyType = defaults.keyType;
        }

        public Builder setKeyARN(@Nullable String keyARN) {
            this.keyARN = keyARN;
            return this;
        }

        public Builder setKeyType(DeliveryStreamEncryptionConfigurationInputKeyType keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public DeliveryStreamEncryptionConfigurationInput build() {
            return new DeliveryStreamEncryptionConfigurationInput(keyARN, keyType);
        }
    }
}
