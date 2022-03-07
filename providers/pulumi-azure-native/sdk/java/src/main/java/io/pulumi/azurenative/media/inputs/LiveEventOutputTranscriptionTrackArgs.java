// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a transcription track in the output of a live event, generated using speech-to-text transcription. This property is reserved for future use, any value set on this property will be ignored.
 * 
 */
public final class LiveEventOutputTranscriptionTrackArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiveEventOutputTranscriptionTrackArgs Empty = new LiveEventOutputTranscriptionTrackArgs();

    /**
     * The output track name. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    @InputImport(name="trackName", required=true)
      private final Input<String> trackName;

    public Input<String> getTrackName() {
        return this.trackName;
    }

    public LiveEventOutputTranscriptionTrackArgs(Input<String> trackName) {
        this.trackName = Objects.requireNonNull(trackName, "expected parameter 'trackName' to be non-null");
    }

    private LiveEventOutputTranscriptionTrackArgs() {
        this.trackName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventOutputTranscriptionTrackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> trackName;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventOutputTranscriptionTrackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.trackName = defaults.trackName;
        }

        public Builder setTrackName(Input<String> trackName) {
            this.trackName = Objects.requireNonNull(trackName);
            return this;
        }

        public Builder setTrackName(String trackName) {
            this.trackName = Input.of(Objects.requireNonNull(trackName));
            return this;
        }
        public LiveEventOutputTranscriptionTrackArgs build() {
            return new LiveEventOutputTranscriptionTrackArgs(trackName);
        }
    }
}