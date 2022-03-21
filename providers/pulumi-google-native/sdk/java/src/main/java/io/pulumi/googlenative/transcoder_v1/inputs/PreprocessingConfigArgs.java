// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.transcoder_v1.inputs.AudioArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.ColorArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.CropArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.DeblockArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.DenoiseArgs;
import io.pulumi.googlenative.transcoder_v1.inputs.PadArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Preprocessing configurations.
 * 
 */
public final class PreprocessingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreprocessingConfigArgs Empty = new PreprocessingConfigArgs();

    /**
     * Audio preprocessing configuration.
     * 
     */
    @Import(name="audio")
      private final @Nullable Output<AudioArgs> audio;

    public Output<AudioArgs> getAudio() {
        return this.audio == null ? Output.empty() : this.audio;
    }

    /**
     * Color preprocessing configuration.
     * 
     */
    @Import(name="color")
      private final @Nullable Output<ColorArgs> color;

    public Output<ColorArgs> getColor() {
        return this.color == null ? Output.empty() : this.color;
    }

    /**
     * Specify the video cropping configuration.
     * 
     */
    @Import(name="crop")
      private final @Nullable Output<CropArgs> crop;

    public Output<CropArgs> getCrop() {
        return this.crop == null ? Output.empty() : this.crop;
    }

    /**
     * Deblock preprocessing configuration.
     * 
     */
    @Import(name="deblock")
      private final @Nullable Output<DeblockArgs> deblock;

    public Output<DeblockArgs> getDeblock() {
        return this.deblock == null ? Output.empty() : this.deblock;
    }

    /**
     * Denoise preprocessing configuration.
     * 
     */
    @Import(name="denoise")
      private final @Nullable Output<DenoiseArgs> denoise;

    public Output<DenoiseArgs> getDenoise() {
        return this.denoise == null ? Output.empty() : this.denoise;
    }

    /**
     * Specify the video pad filter configuration.
     * 
     */
    @Import(name="pad")
      private final @Nullable Output<PadArgs> pad;

    public Output<PadArgs> getPad() {
        return this.pad == null ? Output.empty() : this.pad;
    }

    public PreprocessingConfigArgs(
        @Nullable Output<AudioArgs> audio,
        @Nullable Output<ColorArgs> color,
        @Nullable Output<CropArgs> crop,
        @Nullable Output<DeblockArgs> deblock,
        @Nullable Output<DenoiseArgs> denoise,
        @Nullable Output<PadArgs> pad) {
        this.audio = audio;
        this.color = color;
        this.crop = crop;
        this.deblock = deblock;
        this.denoise = denoise;
        this.pad = pad;
    }

    private PreprocessingConfigArgs() {
        this.audio = Output.empty();
        this.color = Output.empty();
        this.crop = Output.empty();
        this.deblock = Output.empty();
        this.denoise = Output.empty();
        this.pad = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreprocessingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AudioArgs> audio;
        private @Nullable Output<ColorArgs> color;
        private @Nullable Output<CropArgs> crop;
        private @Nullable Output<DeblockArgs> deblock;
        private @Nullable Output<DenoiseArgs> denoise;
        private @Nullable Output<PadArgs> pad;

        public Builder() {
    	      // Empty
        }

        public Builder(PreprocessingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.color = defaults.color;
    	      this.crop = defaults.crop;
    	      this.deblock = defaults.deblock;
    	      this.denoise = defaults.denoise;
    	      this.pad = defaults.pad;
        }

        public Builder audio(@Nullable Output<AudioArgs> audio) {
            this.audio = audio;
            return this;
        }
        public Builder audio(@Nullable AudioArgs audio) {
            this.audio = Output.ofNullable(audio);
            return this;
        }
        public Builder color(@Nullable Output<ColorArgs> color) {
            this.color = color;
            return this;
        }
        public Builder color(@Nullable ColorArgs color) {
            this.color = Output.ofNullable(color);
            return this;
        }
        public Builder crop(@Nullable Output<CropArgs> crop) {
            this.crop = crop;
            return this;
        }
        public Builder crop(@Nullable CropArgs crop) {
            this.crop = Output.ofNullable(crop);
            return this;
        }
        public Builder deblock(@Nullable Output<DeblockArgs> deblock) {
            this.deblock = deblock;
            return this;
        }
        public Builder deblock(@Nullable DeblockArgs deblock) {
            this.deblock = Output.ofNullable(deblock);
            return this;
        }
        public Builder denoise(@Nullable Output<DenoiseArgs> denoise) {
            this.denoise = denoise;
            return this;
        }
        public Builder denoise(@Nullable DenoiseArgs denoise) {
            this.denoise = Output.ofNullable(denoise);
            return this;
        }
        public Builder pad(@Nullable Output<PadArgs> pad) {
            this.pad = pad;
            return this;
        }
        public Builder pad(@Nullable PadArgs pad) {
            this.pad = Output.ofNullable(pad);
            return this;
        }        public PreprocessingConfigArgs build() {
            return new PreprocessingConfigArgs(audio, color, crop, deblock, denoise, pad);
        }
    }
}
