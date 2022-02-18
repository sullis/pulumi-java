// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesis.inputs;

import io.pulumi.awsnative.kinesis.enums.StreamModeDetailsStreamMode;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * When specified, enables or updates the mode of stream. Default is PROVISIONED.
 * 
 */
public final class StreamModeDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamModeDetailsArgs Empty = new StreamModeDetailsArgs();

    /**
     * The mode of the stream
     * 
     */
    @InputImport(name="streamMode", required=true)
    private final Input<StreamModeDetailsStreamMode> streamMode;

    public Input<StreamModeDetailsStreamMode> getStreamMode() {
        return this.streamMode;
    }

    public StreamModeDetailsArgs(Input<StreamModeDetailsStreamMode> streamMode) {
        this.streamMode = Objects.requireNonNull(streamMode, "expected parameter 'streamMode' to be non-null");
    }

    private StreamModeDetailsArgs() {
        this.streamMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamModeDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<StreamModeDetailsStreamMode> streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamModeDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder setStreamMode(Input<StreamModeDetailsStreamMode> streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }

        public Builder setStreamMode(StreamModeDetailsStreamMode streamMode) {
            this.streamMode = Input.of(Objects.requireNonNull(streamMode));
            return this;
        }

        public StreamModeDetailsArgs build() {
            return new StreamModeDetailsArgs(streamMode);
        }
    }
}
