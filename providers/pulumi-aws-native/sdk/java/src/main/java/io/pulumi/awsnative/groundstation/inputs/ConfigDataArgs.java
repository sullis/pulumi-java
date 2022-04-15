// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.inputs;

import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaDownlinkDemodDecodeConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigAntennaUplinkConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigDataflowEndpointConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigS3RecordingConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigTrackingConfigArgs;
import io.pulumi.awsnative.groundstation.inputs.ConfigUplinkEchoConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigDataArgs Empty = new ConfigDataArgs();

    @Import(name="antennaDownlinkConfig")
      private final @Nullable Output<ConfigAntennaDownlinkConfigArgs> antennaDownlinkConfig;

    public Output<ConfigAntennaDownlinkConfigArgs> antennaDownlinkConfig() {
        return this.antennaDownlinkConfig == null ? Codegen.empty() : this.antennaDownlinkConfig;
    }

    @Import(name="antennaDownlinkDemodDecodeConfig")
      private final @Nullable Output<ConfigAntennaDownlinkDemodDecodeConfigArgs> antennaDownlinkDemodDecodeConfig;

    public Output<ConfigAntennaDownlinkDemodDecodeConfigArgs> antennaDownlinkDemodDecodeConfig() {
        return this.antennaDownlinkDemodDecodeConfig == null ? Codegen.empty() : this.antennaDownlinkDemodDecodeConfig;
    }

    @Import(name="antennaUplinkConfig")
      private final @Nullable Output<ConfigAntennaUplinkConfigArgs> antennaUplinkConfig;

    public Output<ConfigAntennaUplinkConfigArgs> antennaUplinkConfig() {
        return this.antennaUplinkConfig == null ? Codegen.empty() : this.antennaUplinkConfig;
    }

    @Import(name="dataflowEndpointConfig")
      private final @Nullable Output<ConfigDataflowEndpointConfigArgs> dataflowEndpointConfig;

    public Output<ConfigDataflowEndpointConfigArgs> dataflowEndpointConfig() {
        return this.dataflowEndpointConfig == null ? Codegen.empty() : this.dataflowEndpointConfig;
    }

    @Import(name="s3RecordingConfig")
      private final @Nullable Output<ConfigS3RecordingConfigArgs> s3RecordingConfig;

    public Output<ConfigS3RecordingConfigArgs> s3RecordingConfig() {
        return this.s3RecordingConfig == null ? Codegen.empty() : this.s3RecordingConfig;
    }

    @Import(name="trackingConfig")
      private final @Nullable Output<ConfigTrackingConfigArgs> trackingConfig;

    public Output<ConfigTrackingConfigArgs> trackingConfig() {
        return this.trackingConfig == null ? Codegen.empty() : this.trackingConfig;
    }

    @Import(name="uplinkEchoConfig")
      private final @Nullable Output<ConfigUplinkEchoConfigArgs> uplinkEchoConfig;

    public Output<ConfigUplinkEchoConfigArgs> uplinkEchoConfig() {
        return this.uplinkEchoConfig == null ? Codegen.empty() : this.uplinkEchoConfig;
    }

    public ConfigDataArgs(
        @Nullable Output<ConfigAntennaDownlinkConfigArgs> antennaDownlinkConfig,
        @Nullable Output<ConfigAntennaDownlinkDemodDecodeConfigArgs> antennaDownlinkDemodDecodeConfig,
        @Nullable Output<ConfigAntennaUplinkConfigArgs> antennaUplinkConfig,
        @Nullable Output<ConfigDataflowEndpointConfigArgs> dataflowEndpointConfig,
        @Nullable Output<ConfigS3RecordingConfigArgs> s3RecordingConfig,
        @Nullable Output<ConfigTrackingConfigArgs> trackingConfig,
        @Nullable Output<ConfigUplinkEchoConfigArgs> uplinkEchoConfig) {
        this.antennaDownlinkConfig = antennaDownlinkConfig;
        this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
        this.antennaUplinkConfig = antennaUplinkConfig;
        this.dataflowEndpointConfig = dataflowEndpointConfig;
        this.s3RecordingConfig = s3RecordingConfig;
        this.trackingConfig = trackingConfig;
        this.uplinkEchoConfig = uplinkEchoConfig;
    }

    private ConfigDataArgs() {
        this.antennaDownlinkConfig = Codegen.empty();
        this.antennaDownlinkDemodDecodeConfig = Codegen.empty();
        this.antennaUplinkConfig = Codegen.empty();
        this.dataflowEndpointConfig = Codegen.empty();
        this.s3RecordingConfig = Codegen.empty();
        this.trackingConfig = Codegen.empty();
        this.uplinkEchoConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigAntennaDownlinkConfigArgs> antennaDownlinkConfig;
        private @Nullable Output<ConfigAntennaDownlinkDemodDecodeConfigArgs> antennaDownlinkDemodDecodeConfig;
        private @Nullable Output<ConfigAntennaUplinkConfigArgs> antennaUplinkConfig;
        private @Nullable Output<ConfigDataflowEndpointConfigArgs> dataflowEndpointConfig;
        private @Nullable Output<ConfigS3RecordingConfigArgs> s3RecordingConfig;
        private @Nullable Output<ConfigTrackingConfigArgs> trackingConfig;
        private @Nullable Output<ConfigUplinkEchoConfigArgs> uplinkEchoConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antennaDownlinkConfig = defaults.antennaDownlinkConfig;
    	      this.antennaDownlinkDemodDecodeConfig = defaults.antennaDownlinkDemodDecodeConfig;
    	      this.antennaUplinkConfig = defaults.antennaUplinkConfig;
    	      this.dataflowEndpointConfig = defaults.dataflowEndpointConfig;
    	      this.s3RecordingConfig = defaults.s3RecordingConfig;
    	      this.trackingConfig = defaults.trackingConfig;
    	      this.uplinkEchoConfig = defaults.uplinkEchoConfig;
        }

        public Builder antennaDownlinkConfig(@Nullable Output<ConfigAntennaDownlinkConfigArgs> antennaDownlinkConfig) {
            this.antennaDownlinkConfig = antennaDownlinkConfig;
            return this;
        }
        public Builder antennaDownlinkConfig(@Nullable ConfigAntennaDownlinkConfigArgs antennaDownlinkConfig) {
            this.antennaDownlinkConfig = Codegen.ofNullable(antennaDownlinkConfig);
            return this;
        }
        public Builder antennaDownlinkDemodDecodeConfig(@Nullable Output<ConfigAntennaDownlinkDemodDecodeConfigArgs> antennaDownlinkDemodDecodeConfig) {
            this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
            return this;
        }
        public Builder antennaDownlinkDemodDecodeConfig(@Nullable ConfigAntennaDownlinkDemodDecodeConfigArgs antennaDownlinkDemodDecodeConfig) {
            this.antennaDownlinkDemodDecodeConfig = Codegen.ofNullable(antennaDownlinkDemodDecodeConfig);
            return this;
        }
        public Builder antennaUplinkConfig(@Nullable Output<ConfigAntennaUplinkConfigArgs> antennaUplinkConfig) {
            this.antennaUplinkConfig = antennaUplinkConfig;
            return this;
        }
        public Builder antennaUplinkConfig(@Nullable ConfigAntennaUplinkConfigArgs antennaUplinkConfig) {
            this.antennaUplinkConfig = Codegen.ofNullable(antennaUplinkConfig);
            return this;
        }
        public Builder dataflowEndpointConfig(@Nullable Output<ConfigDataflowEndpointConfigArgs> dataflowEndpointConfig) {
            this.dataflowEndpointConfig = dataflowEndpointConfig;
            return this;
        }
        public Builder dataflowEndpointConfig(@Nullable ConfigDataflowEndpointConfigArgs dataflowEndpointConfig) {
            this.dataflowEndpointConfig = Codegen.ofNullable(dataflowEndpointConfig);
            return this;
        }
        public Builder s3RecordingConfig(@Nullable Output<ConfigS3RecordingConfigArgs> s3RecordingConfig) {
            this.s3RecordingConfig = s3RecordingConfig;
            return this;
        }
        public Builder s3RecordingConfig(@Nullable ConfigS3RecordingConfigArgs s3RecordingConfig) {
            this.s3RecordingConfig = Codegen.ofNullable(s3RecordingConfig);
            return this;
        }
        public Builder trackingConfig(@Nullable Output<ConfigTrackingConfigArgs> trackingConfig) {
            this.trackingConfig = trackingConfig;
            return this;
        }
        public Builder trackingConfig(@Nullable ConfigTrackingConfigArgs trackingConfig) {
            this.trackingConfig = Codegen.ofNullable(trackingConfig);
            return this;
        }
        public Builder uplinkEchoConfig(@Nullable Output<ConfigUplinkEchoConfigArgs> uplinkEchoConfig) {
            this.uplinkEchoConfig = uplinkEchoConfig;
            return this;
        }
        public Builder uplinkEchoConfig(@Nullable ConfigUplinkEchoConfigArgs uplinkEchoConfig) {
            this.uplinkEchoConfig = Codegen.ofNullable(uplinkEchoConfig);
            return this;
        }        public ConfigDataArgs build() {
            return new ConfigDataArgs(antennaDownlinkConfig, antennaDownlinkDemodDecodeConfig, antennaUplinkConfig, dataflowEndpointConfig, s3RecordingConfig, trackingConfig, uplinkEchoConfig);
        }
    }
}
