// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the common properties for all audio codecs.
 * 
 */
public final class AudioArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioArgs Empty = new AudioArgs();

    /**
     * The bitrate, in bits per second, of the output encoded audio.
     * 
     */
    @InputImport(name="bitrate")
    private final @Nullable Input<Integer> bitrate;

    public Input<Integer> getBitrate() {
        return this.bitrate == null ? Input.empty() : this.bitrate;
    }

    /**
     * The number of channels in the audio.
     * 
     */
    @InputImport(name="channels")
    private final @Nullable Input<Integer> channels;

    public Input<Integer> getChannels() {
        return this.channels == null ? Input.empty() : this.channels;
    }

    /**
     * An optional label for the codec. The label can be used to control muxing behavior.
     * 
     */
    @InputImport(name="label")
    private final @Nullable Input<String> label;

    public Input<String> getLabel() {
        return this.label == null ? Input.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.Audio'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The sampling rate to use for encoding in hertz.
     * 
     */
    @InputImport(name="samplingRate")
    private final @Nullable Input<Integer> samplingRate;

    public Input<Integer> getSamplingRate() {
        return this.samplingRate == null ? Input.empty() : this.samplingRate;
    }

    public AudioArgs(
        @Nullable Input<Integer> bitrate,
        @Nullable Input<Integer> channels,
        @Nullable Input<String> label,
        Input<String> odataType,
        @Nullable Input<Integer> samplingRate) {
        this.bitrate = bitrate;
        this.channels = channels;
        this.label = label;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.samplingRate = samplingRate;
    }

    private AudioArgs() {
        this.bitrate = Input.empty();
        this.channels = Input.empty();
        this.label = Input.empty();
        this.odataType = Input.empty();
        this.samplingRate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bitrate;
        private @Nullable Input<Integer> channels;
        private @Nullable Input<String> label;
        private Input<String> odataType;
        private @Nullable Input<Integer> samplingRate;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrate = defaults.bitrate;
    	      this.channels = defaults.channels;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.samplingRate = defaults.samplingRate;
        }

        public Builder setBitrate(@Nullable Input<Integer> bitrate) {
            this.bitrate = bitrate;
            return this;
        }

        public Builder setBitrate(@Nullable Integer bitrate) {
            this.bitrate = Input.ofNullable(bitrate);
            return this;
        }

        public Builder setChannels(@Nullable Input<Integer> channels) {
            this.channels = channels;
            return this;
        }

        public Builder setChannels(@Nullable Integer channels) {
            this.channels = Input.ofNullable(channels);
            return this;
        }

        public Builder setLabel(@Nullable Input<String> label) {
            this.label = label;
            return this;
        }

        public Builder setLabel(@Nullable String label) {
            this.label = Input.ofNullable(label);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setSamplingRate(@Nullable Input<Integer> samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        public Builder setSamplingRate(@Nullable Integer samplingRate) {
            this.samplingRate = Input.ofNullable(samplingRate);
            return this;
        }

        public AudioArgs build() {
            return new AudioArgs(bitrate, channels, label, odataType, samplingRate);
        }
    }
}
