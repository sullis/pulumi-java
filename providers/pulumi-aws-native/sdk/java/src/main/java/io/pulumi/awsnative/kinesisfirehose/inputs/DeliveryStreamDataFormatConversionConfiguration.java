// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamInputFormatConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamOutputFormatConfiguration;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSchemaConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamDataFormatConversionConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamDataFormatConversionConfiguration Empty = new DeliveryStreamDataFormatConversionConfiguration();

    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    @InputImport(name="inputFormatConfiguration")
    private final @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration;

    public Optional<DeliveryStreamInputFormatConfiguration> getInputFormatConfiguration() {
        return this.inputFormatConfiguration == null ? Optional.empty() : Optional.ofNullable(this.inputFormatConfiguration);
    }

    @InputImport(name="outputFormatConfiguration")
    private final @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration;

    public Optional<DeliveryStreamOutputFormatConfiguration> getOutputFormatConfiguration() {
        return this.outputFormatConfiguration == null ? Optional.empty() : Optional.ofNullable(this.outputFormatConfiguration);
    }

    @InputImport(name="schemaConfiguration")
    private final @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration;

    public Optional<DeliveryStreamSchemaConfiguration> getSchemaConfiguration() {
        return this.schemaConfiguration == null ? Optional.empty() : Optional.ofNullable(this.schemaConfiguration);
    }

    public DeliveryStreamDataFormatConversionConfiguration(
        @Nullable Boolean enabled,
        @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration,
        @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration,
        @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = inputFormatConfiguration;
        this.outputFormatConfiguration = outputFormatConfiguration;
        this.schemaConfiguration = schemaConfiguration;
    }

    private DeliveryStreamDataFormatConversionConfiguration() {
        this.enabled = null;
        this.inputFormatConfiguration = null;
        this.outputFormatConfiguration = null;
        this.schemaConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDataFormatConversionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration;
        private @Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration;
        private @Nullable DeliveryStreamSchemaConfiguration schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDataFormatConversionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.inputFormatConfiguration = defaults.inputFormatConfiguration;
    	      this.outputFormatConfiguration = defaults.outputFormatConfiguration;
    	      this.schemaConfiguration = defaults.schemaConfiguration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setInputFormatConfiguration(@Nullable DeliveryStreamInputFormatConfiguration inputFormatConfiguration) {
            this.inputFormatConfiguration = inputFormatConfiguration;
            return this;
        }

        public Builder setOutputFormatConfiguration(@Nullable DeliveryStreamOutputFormatConfiguration outputFormatConfiguration) {
            this.outputFormatConfiguration = outputFormatConfiguration;
            return this;
        }

        public Builder setSchemaConfiguration(@Nullable DeliveryStreamSchemaConfiguration schemaConfiguration) {
            this.schemaConfiguration = schemaConfiguration;
            return this;
        }

        public DeliveryStreamDataFormatConversionConfiguration build() {
            return new DeliveryStreamDataFormatConversionConfiguration(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}
