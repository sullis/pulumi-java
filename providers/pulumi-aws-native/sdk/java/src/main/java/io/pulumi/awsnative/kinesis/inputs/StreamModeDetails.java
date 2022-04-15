// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.inputs;

import io.pulumi.awsnative.kinesis.enums.StreamModeDetailsStreamMode;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * When specified, enables or updates the mode of stream. Default is PROVISIONED.
 * 
 */
public final class StreamModeDetails extends io.pulumi.resources.InvokeArgs {

    public static final StreamModeDetails Empty = new StreamModeDetails();

    /**
     * The mode of the stream
     * 
     */
    @Import(name="streamMode", required=true)
      private final StreamModeDetailsStreamMode streamMode;

    public StreamModeDetailsStreamMode streamMode() {
        return this.streamMode;
    }

    public StreamModeDetails(StreamModeDetailsStreamMode streamMode) {
        this.streamMode = Objects.requireNonNull(streamMode, "expected parameter 'streamMode' to be non-null");
    }

    private StreamModeDetails() {
        this.streamMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamModeDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamModeDetailsStreamMode streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamModeDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder streamMode(StreamModeDetailsStreamMode streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }        public StreamModeDetails build() {
            return new StreamModeDetails(streamMode);
        }
    }
}
