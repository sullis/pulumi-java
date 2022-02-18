// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A custom preset for encoding audio with the AAC codec.
 * 
 */
public final class AudioEncoderAacArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioEncoderAacArgs Empty = new AudioEncoderAacArgs();

    /**
     * Bitrate, in kilobits per second or Kbps, at which audio should be encoded (2-channel stereo audio at a sampling rate of 48 kHz). Allowed values are 96, 112, 128, 160, 192, 224, and 256. If omitted, the bitrate of the input audio is used.
     * 
     */
    @InputImport(name="bitrateKbps")
    private final @Nullable Input<String> bitrateKbps;

    public Input<String> getBitrateKbps() {
        return this.bitrateKbps == null ? Input.empty() : this.bitrateKbps;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.AudioEncoderAac'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AudioEncoderAacArgs(
        @Nullable Input<String> bitrateKbps,
        Input<String> type) {
        this.bitrateKbps = bitrateKbps;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AudioEncoderAacArgs() {
        this.bitrateKbps = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioEncoderAacArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bitrateKbps;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioEncoderAacArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateKbps = defaults.bitrateKbps;
    	      this.type = defaults.type;
        }

        public Builder setBitrateKbps(@Nullable Input<String> bitrateKbps) {
            this.bitrateKbps = bitrateKbps;
            return this;
        }

        public Builder setBitrateKbps(@Nullable String bitrateKbps) {
            this.bitrateKbps = Input.ofNullable(bitrateKbps);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AudioEncoderAacArgs build() {
            return new AudioEncoderAacArgs(bitrateKbps, type);
        }
    }
}
