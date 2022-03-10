// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.ConfigAntennaDownlinkConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigAntennaDownlinkDemodDecodeConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigAntennaUplinkConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigDataflowEndpointConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigS3RecordingConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigTrackingConfig;
import io.pulumi.awsnative.groundstation.outputs.ConfigUplinkEchoConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConfigData {
    private final @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig;
    private final @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;
    private final @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig;
    private final @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig;
    private final @Nullable ConfigS3RecordingConfig s3RecordingConfig;
    private final @Nullable ConfigTrackingConfig trackingConfig;
    private final @Nullable ConfigUplinkEchoConfig uplinkEchoConfig;

    @OutputCustomType.Constructor
    private ConfigData(
        @OutputCustomType.Parameter("antennaDownlinkConfig") @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig,
        @OutputCustomType.Parameter("antennaDownlinkDemodDecodeConfig") @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig,
        @OutputCustomType.Parameter("antennaUplinkConfig") @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig,
        @OutputCustomType.Parameter("dataflowEndpointConfig") @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig,
        @OutputCustomType.Parameter("s3RecordingConfig") @Nullable ConfigS3RecordingConfig s3RecordingConfig,
        @OutputCustomType.Parameter("trackingConfig") @Nullable ConfigTrackingConfig trackingConfig,
        @OutputCustomType.Parameter("uplinkEchoConfig") @Nullable ConfigUplinkEchoConfig uplinkEchoConfig) {
        this.antennaDownlinkConfig = antennaDownlinkConfig;
        this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
        this.antennaUplinkConfig = antennaUplinkConfig;
        this.dataflowEndpointConfig = dataflowEndpointConfig;
        this.s3RecordingConfig = s3RecordingConfig;
        this.trackingConfig = trackingConfig;
        this.uplinkEchoConfig = uplinkEchoConfig;
    }

    public Optional<ConfigAntennaDownlinkConfig> getAntennaDownlinkConfig() {
        return Optional.ofNullable(this.antennaDownlinkConfig);
    }
    public Optional<ConfigAntennaDownlinkDemodDecodeConfig> getAntennaDownlinkDemodDecodeConfig() {
        return Optional.ofNullable(this.antennaDownlinkDemodDecodeConfig);
    }
    public Optional<ConfigAntennaUplinkConfig> getAntennaUplinkConfig() {
        return Optional.ofNullable(this.antennaUplinkConfig);
    }
    public Optional<ConfigDataflowEndpointConfig> getDataflowEndpointConfig() {
        return Optional.ofNullable(this.dataflowEndpointConfig);
    }
    public Optional<ConfigS3RecordingConfig> getS3RecordingConfig() {
        return Optional.ofNullable(this.s3RecordingConfig);
    }
    public Optional<ConfigTrackingConfig> getTrackingConfig() {
        return Optional.ofNullable(this.trackingConfig);
    }
    public Optional<ConfigUplinkEchoConfig> getUplinkEchoConfig() {
        return Optional.ofNullable(this.uplinkEchoConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig;
        private @Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig;
        private @Nullable ConfigAntennaUplinkConfig antennaUplinkConfig;
        private @Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig;
        private @Nullable ConfigS3RecordingConfig s3RecordingConfig;
        private @Nullable ConfigTrackingConfig trackingConfig;
        private @Nullable ConfigUplinkEchoConfig uplinkEchoConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.antennaDownlinkConfig = defaults.antennaDownlinkConfig;
    	      this.antennaDownlinkDemodDecodeConfig = defaults.antennaDownlinkDemodDecodeConfig;
    	      this.antennaUplinkConfig = defaults.antennaUplinkConfig;
    	      this.dataflowEndpointConfig = defaults.dataflowEndpointConfig;
    	      this.s3RecordingConfig = defaults.s3RecordingConfig;
    	      this.trackingConfig = defaults.trackingConfig;
    	      this.uplinkEchoConfig = defaults.uplinkEchoConfig;
        }

        public Builder setAntennaDownlinkConfig(@Nullable ConfigAntennaDownlinkConfig antennaDownlinkConfig) {
            this.antennaDownlinkConfig = antennaDownlinkConfig;
            return this;
        }

        public Builder setAntennaDownlinkDemodDecodeConfig(@Nullable ConfigAntennaDownlinkDemodDecodeConfig antennaDownlinkDemodDecodeConfig) {
            this.antennaDownlinkDemodDecodeConfig = antennaDownlinkDemodDecodeConfig;
            return this;
        }

        public Builder setAntennaUplinkConfig(@Nullable ConfigAntennaUplinkConfig antennaUplinkConfig) {
            this.antennaUplinkConfig = antennaUplinkConfig;
            return this;
        }

        public Builder setDataflowEndpointConfig(@Nullable ConfigDataflowEndpointConfig dataflowEndpointConfig) {
            this.dataflowEndpointConfig = dataflowEndpointConfig;
            return this;
        }

        public Builder setS3RecordingConfig(@Nullable ConfigS3RecordingConfig s3RecordingConfig) {
            this.s3RecordingConfig = s3RecordingConfig;
            return this;
        }

        public Builder setTrackingConfig(@Nullable ConfigTrackingConfig trackingConfig) {
            this.trackingConfig = trackingConfig;
            return this;
        }

        public Builder setUplinkEchoConfig(@Nullable ConfigUplinkEchoConfig uplinkEchoConfig) {
            this.uplinkEchoConfig = uplinkEchoConfig;
            return this;
        }
        public ConfigData build() {
            return new ConfigData(antennaDownlinkConfig, antennaDownlinkDemodDecodeConfig, antennaUplinkConfig, dataflowEndpointConfig, s3RecordingConfig, trackingConfig, uplinkEchoConfig);
        }
    }
}
