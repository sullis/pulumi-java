// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The mapping for the `Job.edit_list` atoms with audio `EditAtom.inputs`.
 * 
 */
public final class AudioMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final AudioMappingArgs Empty = new AudioMappingArgs();

    /**
     * The `EditAtom.key` that references the atom with audio inputs in the `Job.edit_list`.
     * 
     */
    @InputImport(name="atomKey", required=true)
      private final Input<String> atomKey;

    public Input<String> getAtomKey() {
        return this.atomKey;
    }

    /**
     * Audio volume control in dB. Negative values decrease volume, positive values increase. The default is 0.
     * 
     */
    @InputImport(name="gainDb")
      private final @Nullable Input<Double> gainDb;

    public Input<Double> getGainDb() {
        return this.gainDb == null ? Input.empty() : this.gainDb;
    }

    /**
     * The zero-based index of the channel in the input audio stream.
     * 
     */
    @InputImport(name="inputChannel", required=true)
      private final Input<Integer> inputChannel;

    public Input<Integer> getInputChannel() {
        return this.inputChannel;
    }

    /**
     * The `Input.key` that identifies the input file.
     * 
     */
    @InputImport(name="inputKey", required=true)
      private final Input<String> inputKey;

    public Input<String> getInputKey() {
        return this.inputKey;
    }

    /**
     * The zero-based index of the track in the input file.
     * 
     */
    @InputImport(name="inputTrack", required=true)
      private final Input<Integer> inputTrack;

    public Input<Integer> getInputTrack() {
        return this.inputTrack;
    }

    /**
     * The zero-based index of the channel in the output audio stream.
     * 
     */
    @InputImport(name="outputChannel", required=true)
      private final Input<Integer> outputChannel;

    public Input<Integer> getOutputChannel() {
        return this.outputChannel;
    }

    public AudioMappingArgs(
        Input<String> atomKey,
        @Nullable Input<Double> gainDb,
        Input<Integer> inputChannel,
        Input<String> inputKey,
        Input<Integer> inputTrack,
        Input<Integer> outputChannel) {
        this.atomKey = Objects.requireNonNull(atomKey, "expected parameter 'atomKey' to be non-null");
        this.gainDb = gainDb;
        this.inputChannel = Objects.requireNonNull(inputChannel, "expected parameter 'inputChannel' to be non-null");
        this.inputKey = Objects.requireNonNull(inputKey, "expected parameter 'inputKey' to be non-null");
        this.inputTrack = Objects.requireNonNull(inputTrack, "expected parameter 'inputTrack' to be non-null");
        this.outputChannel = Objects.requireNonNull(outputChannel, "expected parameter 'outputChannel' to be non-null");
    }

    private AudioMappingArgs() {
        this.atomKey = Input.empty();
        this.gainDb = Input.empty();
        this.inputChannel = Input.empty();
        this.inputKey = Input.empty();
        this.inputTrack = Input.empty();
        this.outputChannel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> atomKey;
        private @Nullable Input<Double> gainDb;
        private Input<Integer> inputChannel;
        private Input<String> inputKey;
        private Input<Integer> inputTrack;
        private Input<Integer> outputChannel;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atomKey = defaults.atomKey;
    	      this.gainDb = defaults.gainDb;
    	      this.inputChannel = defaults.inputChannel;
    	      this.inputKey = defaults.inputKey;
    	      this.inputTrack = defaults.inputTrack;
    	      this.outputChannel = defaults.outputChannel;
        }

        public Builder setAtomKey(Input<String> atomKey) {
            this.atomKey = Objects.requireNonNull(atomKey);
            return this;
        }

        public Builder setAtomKey(String atomKey) {
            this.atomKey = Input.of(Objects.requireNonNull(atomKey));
            return this;
        }

        public Builder setGainDb(@Nullable Input<Double> gainDb) {
            this.gainDb = gainDb;
            return this;
        }

        public Builder setGainDb(@Nullable Double gainDb) {
            this.gainDb = Input.ofNullable(gainDb);
            return this;
        }

        public Builder setInputChannel(Input<Integer> inputChannel) {
            this.inputChannel = Objects.requireNonNull(inputChannel);
            return this;
        }

        public Builder setInputChannel(Integer inputChannel) {
            this.inputChannel = Input.of(Objects.requireNonNull(inputChannel));
            return this;
        }

        public Builder setInputKey(Input<String> inputKey) {
            this.inputKey = Objects.requireNonNull(inputKey);
            return this;
        }

        public Builder setInputKey(String inputKey) {
            this.inputKey = Input.of(Objects.requireNonNull(inputKey));
            return this;
        }

        public Builder setInputTrack(Input<Integer> inputTrack) {
            this.inputTrack = Objects.requireNonNull(inputTrack);
            return this;
        }

        public Builder setInputTrack(Integer inputTrack) {
            this.inputTrack = Input.of(Objects.requireNonNull(inputTrack));
            return this;
        }

        public Builder setOutputChannel(Input<Integer> outputChannel) {
            this.outputChannel = Objects.requireNonNull(outputChannel);
            return this;
        }

        public Builder setOutputChannel(Integer outputChannel) {
            this.outputChannel = Input.of(Objects.requireNonNull(outputChannel));
            return this;
        }
        public AudioMappingArgs build() {
            return new AudioMappingArgs(atomKey, gainDb, inputChannel, inputKey, inputTrack, outputChannel);
        }
    }
}