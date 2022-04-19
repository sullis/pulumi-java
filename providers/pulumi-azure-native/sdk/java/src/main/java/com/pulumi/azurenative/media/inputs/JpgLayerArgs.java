// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the settings to produce a JPEG image from the input video.
 * 
 */
public final class JpgLayerArgs extends com.pulumi.resources.ResourceArgs {

    public static final JpgLayerArgs Empty = new JpgLayerArgs();

    /**
     * The height of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in height as the input.
     * 
     */
    @Import(name="height")
      private final @Nullable Output<String> height;

    public Output<String> height() {
        return this.height == null ? Codegen.empty() : this.height;
    }

    /**
     * The alphanumeric label for this layer, which can be used in multiplexing different video and audio layers, or in naming the output file.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> label() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JpgLayer'.
     * 
     */
    @Import(name="odataType", required=true)
      private final Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The compression quality of the JPEG output. Range is from 0-100 and the default is 70.
     * 
     */
    @Import(name="quality")
      private final @Nullable Output<Integer> quality;

    public Output<Integer> quality() {
        return this.quality == null ? Codegen.empty() : this.quality;
    }

    /**
     * The width of the output video for this layer. The value can be absolute (in pixels) or relative (in percentage). For example 50% means the output video has half as many pixels in width as the input.
     * 
     */
    @Import(name="width")
      private final @Nullable Output<String> width;

    public Output<String> width() {
        return this.width == null ? Codegen.empty() : this.width;
    }

    public JpgLayerArgs(
        @Nullable Output<String> height,
        @Nullable Output<String> label,
        Output<String> odataType,
        @Nullable Output<Integer> quality,
        @Nullable Output<String> width) {
        this.height = height;
        this.label = label;
        this.odataType = Codegen.stringProp("odataType").output().arg(odataType).require();
        this.quality = quality;
        this.width = width;
    }

    private JpgLayerArgs() {
        this.height = Codegen.empty();
        this.label = Codegen.empty();
        this.odataType = Codegen.empty();
        this.quality = Codegen.empty();
        this.width = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JpgLayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> height;
        private @Nullable Output<String> label;
        private Output<String> odataType;
        private @Nullable Output<Integer> quality;
        private @Nullable Output<String> width;

        public Builder() {
    	      // Empty
        }

        public Builder(JpgLayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.height = defaults.height;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.quality = defaults.quality;
    	      this.width = defaults.width;
        }

        public Builder height(@Nullable Output<String> height) {
            this.height = height;
            return this;
        }
        public Builder height(@Nullable String height) {
            this.height = Codegen.ofNullable(height);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder odataType(Output<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Output.of(Objects.requireNonNull(odataType));
            return this;
        }
        public Builder quality(@Nullable Output<Integer> quality) {
            this.quality = quality;
            return this;
        }
        public Builder quality(@Nullable Integer quality) {
            this.quality = Codegen.ofNullable(quality);
            return this;
        }
        public Builder width(@Nullable Output<String> width) {
            this.width = width;
            return this;
        }
        public Builder width(@Nullable String width) {
            this.width = Codegen.ofNullable(width);
            return this;
        }        public JpgLayerArgs build() {
            return new JpgLayerArgs(height, label, odataType, quality, width);
        }
    }
}
