// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.enums.DeliveryStreamEncryptionConfigurationNoEncryptionConfig;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamKMSEncryptionConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamEncryptionConfigurationArgs Empty = new DeliveryStreamEncryptionConfigurationArgs();

    @Import(name="kMSEncryptionConfig")
      private final @Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig;

    public Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig() {
        return this.kMSEncryptionConfig == null ? Codegen.empty() : this.kMSEncryptionConfig;
    }

    @Import(name="noEncryptionConfig")
      private final @Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig;

    public Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig() {
        return this.noEncryptionConfig == null ? Codegen.empty() : this.noEncryptionConfig;
    }

    public DeliveryStreamEncryptionConfigurationArgs(
        @Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig,
        @Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig) {
        this.kMSEncryptionConfig = kMSEncryptionConfig;
        this.noEncryptionConfig = noEncryptionConfig;
    }

    private DeliveryStreamEncryptionConfigurationArgs() {
        this.kMSEncryptionConfig = Codegen.empty();
        this.noEncryptionConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig;
        private @Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kMSEncryptionConfig = defaults.kMSEncryptionConfig;
    	      this.noEncryptionConfig = defaults.noEncryptionConfig;
        }

        public Builder kMSEncryptionConfig(@Nullable Output<DeliveryStreamKMSEncryptionConfigArgs> kMSEncryptionConfig) {
            this.kMSEncryptionConfig = kMSEncryptionConfig;
            return this;
        }
        public Builder kMSEncryptionConfig(@Nullable DeliveryStreamKMSEncryptionConfigArgs kMSEncryptionConfig) {
            this.kMSEncryptionConfig = Codegen.ofNullable(kMSEncryptionConfig);
            return this;
        }
        public Builder noEncryptionConfig(@Nullable Output<DeliveryStreamEncryptionConfigurationNoEncryptionConfig> noEncryptionConfig) {
            this.noEncryptionConfig = noEncryptionConfig;
            return this;
        }
        public Builder noEncryptionConfig(@Nullable DeliveryStreamEncryptionConfigurationNoEncryptionConfig noEncryptionConfig) {
            this.noEncryptionConfig = Codegen.ofNullable(noEncryptionConfig);
            return this;
        }        public DeliveryStreamEncryptionConfigurationArgs build() {
            return new DeliveryStreamEncryptionConfigurationArgs(kMSEncryptionConfig, noEncryptionConfig);
        }
    }
}
