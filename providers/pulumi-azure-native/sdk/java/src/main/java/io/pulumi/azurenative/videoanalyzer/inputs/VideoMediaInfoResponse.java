// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about the video and audio content.
 * 
 */
public final class VideoMediaInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VideoMediaInfoResponse Empty = new VideoMediaInfoResponse();

    /**
     * Video segment length indicates the length of individual video files (segments) which are persisted to storage. Smaller segments provide lower archive playback latency but generate larger volume of storage transactions. Larger segments reduce the amount of storage transactions while increasing the archive playback latency. Value must be specified in ISO8601 duration format (i.e. "PT30S" equals 30 seconds) and can vary between 30 seconds to 5 minutes, in 30 seconds increments.
     * 
     */
    @InputImport(name="segmentLength", required=true)
      private final String segmentLength;

    public String getSegmentLength() {
        return this.segmentLength;
    }

    public VideoMediaInfoResponse(String segmentLength) {
        this.segmentLength = Objects.requireNonNull(segmentLength, "expected parameter 'segmentLength' to be non-null");
    }

    private VideoMediaInfoResponse() {
        this.segmentLength = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoMediaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String segmentLength;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoMediaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.segmentLength = defaults.segmentLength;
        }

        public Builder setSegmentLength(String segmentLength) {
            this.segmentLength = Objects.requireNonNull(segmentLength);
            return this;
        }
        public VideoMediaInfoResponse build() {
            return new VideoMediaInfoResponse(segmentLength);
        }
    }
}