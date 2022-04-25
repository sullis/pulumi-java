// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration {
    /**
     * @return Describes the interval in milliseconds between checkpoint operations.
     * 
     */
    private final @Nullable Integer checkpointInterval;
    /**
     * @return Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    private final @Nullable Boolean checkpointingEnabled;
    /**
     * @return Describes whether the application uses Kinesis Data Analytics&#39; default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointing_enabled`, `checkpoint_interval`, or `min_pause_between_checkpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
     * * `checkpointing_enabled = true`
     * * `checkpoint_interval = 60000`
     * * `min_pause_between_checkpoints = 5000`
     * 
     */
    private final String configurationType;
    /**
     * @return Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
     * 
     */
    private final @Nullable Integer minPauseBetweenCheckpoints;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration(
        @CustomType.Parameter("checkpointInterval") @Nullable Integer checkpointInterval,
        @CustomType.Parameter("checkpointingEnabled") @Nullable Boolean checkpointingEnabled,
        @CustomType.Parameter("configurationType") String configurationType,
        @CustomType.Parameter("minPauseBetweenCheckpoints") @Nullable Integer minPauseBetweenCheckpoints) {
        this.checkpointInterval = checkpointInterval;
        this.checkpointingEnabled = checkpointingEnabled;
        this.configurationType = configurationType;
        this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
    }

    /**
     * @return Describes the interval in milliseconds between checkpoint operations.
     * 
     */
    public Optional<Integer> checkpointInterval() {
        return Optional.ofNullable(this.checkpointInterval);
    }
    /**
     * @return Describes whether checkpointing is enabled for a Flink-based Kinesis Data Analytics application.
     * 
     */
    public Optional<Boolean> checkpointingEnabled() {
        return Optional.ofNullable(this.checkpointingEnabled);
    }
    /**
     * @return Describes whether the application uses Kinesis Data Analytics&#39; default checkpointing behavior. Valid values: `CUSTOM`, `DEFAULT`. Set this attribute to `CUSTOM` in order for any specified `checkpointing_enabled`, `checkpoint_interval`, or `min_pause_between_checkpoints` attribute values to be effective. If this attribute is set to `DEFAULT`, the application will always use the following values:
     * * `checkpointing_enabled = true`
     * * `checkpoint_interval = 60000`
     * * `min_pause_between_checkpoints = 5000`
     * 
     */
    public String configurationType() {
        return this.configurationType;
    }
    /**
     * @return Describes the minimum time in milliseconds after a checkpoint operation completes that a new checkpoint operation can start.
     * 
     */
    public Optional<Integer> minPauseBetweenCheckpoints() {
        return Optional.ofNullable(this.minPauseBetweenCheckpoints);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer checkpointInterval;
        private @Nullable Boolean checkpointingEnabled;
        private String configurationType;
        private @Nullable Integer minPauseBetweenCheckpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointInterval = defaults.checkpointInterval;
    	      this.checkpointingEnabled = defaults.checkpointingEnabled;
    	      this.configurationType = defaults.configurationType;
    	      this.minPauseBetweenCheckpoints = defaults.minPauseBetweenCheckpoints;
        }

        public Builder checkpointInterval(@Nullable Integer checkpointInterval) {
            this.checkpointInterval = checkpointInterval;
            return this;
        }
        public Builder checkpointingEnabled(@Nullable Boolean checkpointingEnabled) {
            this.checkpointingEnabled = checkpointingEnabled;
            return this;
        }
        public Builder configurationType(String configurationType) {
            this.configurationType = Objects.requireNonNull(configurationType);
            return this;
        }
        public Builder minPauseBetweenCheckpoints(@Nullable Integer minPauseBetweenCheckpoints) {
            this.minPauseBetweenCheckpoints = minPauseBetweenCheckpoints;
            return this;
        }        public ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration build() {
            return new ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration(checkpointInterval, checkpointingEnabled, configurationType, minPauseBetweenCheckpoints);
        }
    }
}
