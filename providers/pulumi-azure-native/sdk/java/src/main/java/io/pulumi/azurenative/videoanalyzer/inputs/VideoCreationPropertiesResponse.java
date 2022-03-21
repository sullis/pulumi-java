// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Optional properties to be used in case a new video resource needs to be created on the service. These will not take effect if the video already exists.
 * 
 */
public final class VideoCreationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoCreationPropertiesResponse Empty = new VideoCreationPropertiesResponse();

    /**
     * Optional description provided by the user. Value can be up to 2048 characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Video retention period indicates how long the video is kept in storage. Value must be specified in ISO8601 duration format (i.e. "P1D" equals 1 day) and can vary between 1 day to 10 years, in 1 day increments. When absent (null), all video content is retained indefinitely. This property is only allowed for topologies where "kind" is set to "live".
     * 
     */
    @Import(name="retentionPeriod")
      private final @Nullable String retentionPeriod;

    public Optional<String> getRetentionPeriod() {
        return this.retentionPeriod == null ? Optional.empty() : Optional.ofNullable(this.retentionPeriod);
    }

    /**
     * Segment length indicates the length of individual content files (segments) which are persisted to storage. Smaller segments provide lower archive playback latency but generate larger volume of storage transactions. Larger segments reduce the amount of storage transactions while increasing the archive playback latency. Value must be specified in ISO8601 duration format (i.e. "PT30S" equals 30 seconds) and can vary between 30 seconds to 5 minutes, in 30 seconds increments. Changing this value after the initial call to create the video resource can lead to errors when uploading content to the archive. Default value is 30 seconds. This property is only allowed for topologies where "kind" is set to "live".
     * 
     */
    @Import(name="segmentLength")
      private final @Nullable String segmentLength;

    public Optional<String> getSegmentLength() {
        return this.segmentLength == null ? Optional.empty() : Optional.ofNullable(this.segmentLength);
    }

    /**
     * Optional title provided by the user. Value can be up to 256 characters long.
     * 
     */
    @Import(name="title")
      private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    public VideoCreationPropertiesResponse(
        @Nullable String description,
        @Nullable String retentionPeriod,
        @Nullable String segmentLength,
        @Nullable String title) {
        this.description = description;
        this.retentionPeriod = retentionPeriod;
        this.segmentLength = segmentLength;
        this.title = title;
    }

    private VideoCreationPropertiesResponse() {
        this.description = null;
        this.retentionPeriod = null;
        this.segmentLength = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoCreationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String retentionPeriod;
        private @Nullable String segmentLength;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoCreationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.segmentLength = defaults.segmentLength;
    	      this.title = defaults.title;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder retentionPeriod(@Nullable String retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }
        public Builder segmentLength(@Nullable String segmentLength) {
            this.segmentLength = segmentLength;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }        public VideoCreationPropertiesResponse build() {
            return new VideoCreationPropertiesResponse(description, retentionPeriod, segmentLength, title);
        }
    }
}
