// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs.outputs;

import io.pulumi.awsnative.ivs.enums.RecordingConfigurationThumbnailConfigurationRecordingMode;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RecordingConfigurationThumbnailConfiguration {
    /**
     * Thumbnail Recording Mode, which determines whether thumbnails are recorded at an interval or are disabled.
     * 
     */
    private final RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode;
    /**
     * Thumbnail recording Target Interval Seconds defines the interval at which thumbnails are recorded. This field is required if RecordingMode is INTERVAL.
     * 
     */
    private final @Nullable Integer targetIntervalSeconds;

    @CustomType.Constructor
    private RecordingConfigurationThumbnailConfiguration(
        @CustomType.Parameter("recordingMode") RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode,
        @CustomType.Parameter("targetIntervalSeconds") @Nullable Integer targetIntervalSeconds) {
        this.recordingMode = recordingMode;
        this.targetIntervalSeconds = targetIntervalSeconds;
    }

    /**
     * Thumbnail Recording Mode, which determines whether thumbnails are recorded at an interval or are disabled.
     * 
    */
    public RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode() {
        return this.recordingMode;
    }
    /**
     * Thumbnail recording Target Interval Seconds defines the interval at which thumbnails are recorded. This field is required if RecordingMode is INTERVAL.
     * 
    */
    public Optional<Integer> targetIntervalSeconds() {
        return Optional.ofNullable(this.targetIntervalSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordingConfigurationThumbnailConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode;
        private @Nullable Integer targetIntervalSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordingConfigurationThumbnailConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordingMode = defaults.recordingMode;
    	      this.targetIntervalSeconds = defaults.targetIntervalSeconds;
        }

        public Builder recordingMode(RecordingConfigurationThumbnailConfigurationRecordingMode recordingMode) {
            this.recordingMode = Objects.requireNonNull(recordingMode);
            return this;
        }
        public Builder targetIntervalSeconds(@Nullable Integer targetIntervalSeconds) {
            this.targetIntervalSeconds = targetIntervalSeconds;
            return this;
        }        public RecordingConfigurationThumbnailConfiguration build() {
            return new RecordingConfigurationThumbnailConfiguration(recordingMode, targetIntervalSeconds);
        }
    }
}
