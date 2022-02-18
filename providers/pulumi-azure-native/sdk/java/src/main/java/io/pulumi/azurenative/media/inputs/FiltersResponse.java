// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.AudioOverlayResponse;
import io.pulumi.azurenative.media.inputs.DeinterlaceResponse;
import io.pulumi.azurenative.media.inputs.RectangleResponse;
import io.pulumi.azurenative.media.inputs.VideoOverlayResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes all the filtering operations, such as de-interlacing, rotation etc. that are to be applied to the input media before encoding.
 * 
 */
public final class FiltersResponse extends io.pulumi.resources.InvokeArgs {

    public static final FiltersResponse Empty = new FiltersResponse();

    /**
     * The parameters for the rectangular window with which to crop the input video.
     * 
     */
    @InputImport(name="crop")
    private final @Nullable RectangleResponse crop;

    public Optional<RectangleResponse> getCrop() {
        return this.crop == null ? Optional.empty() : Optional.ofNullable(this.crop);
    }

    /**
     * The de-interlacing settings.
     * 
     */
    @InputImport(name="deinterlace")
    private final @Nullable DeinterlaceResponse deinterlace;

    public Optional<DeinterlaceResponse> getDeinterlace() {
        return this.deinterlace == null ? Optional.empty() : Optional.ofNullable(this.deinterlace);
    }

    /**
     * The properties of overlays to be applied to the input video. These could be audio, image or video overlays.
     * 
     */
    @InputImport(name="overlays")
    private final @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays;

    public List<Either<AudioOverlayResponse,VideoOverlayResponse>> getOverlays() {
        return this.overlays == null ? List.of() : this.overlays;
    }

    /**
     * The rotation, if any, to be applied to the input video, before it is encoded. Default is Auto
     * 
     */
    @InputImport(name="rotation")
    private final @Nullable String rotation;

    public Optional<String> getRotation() {
        return this.rotation == null ? Optional.empty() : Optional.ofNullable(this.rotation);
    }

    public FiltersResponse(
        @Nullable RectangleResponse crop,
        @Nullable DeinterlaceResponse deinterlace,
        @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays,
        @Nullable String rotation) {
        this.crop = crop;
        this.deinterlace = deinterlace;
        this.overlays = overlays;
        this.rotation = rotation;
    }

    private FiltersResponse() {
        this.crop = null;
        this.deinterlace = null;
        this.overlays = List.of();
        this.rotation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FiltersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RectangleResponse crop;
        private @Nullable DeinterlaceResponse deinterlace;
        private @Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays;
        private @Nullable String rotation;

        public Builder() {
    	      // Empty
        }

        public Builder(FiltersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crop = defaults.crop;
    	      this.deinterlace = defaults.deinterlace;
    	      this.overlays = defaults.overlays;
    	      this.rotation = defaults.rotation;
        }

        public Builder setCrop(@Nullable RectangleResponse crop) {
            this.crop = crop;
            return this;
        }

        public Builder setDeinterlace(@Nullable DeinterlaceResponse deinterlace) {
            this.deinterlace = deinterlace;
            return this;
        }

        public Builder setOverlays(@Nullable List<Either<AudioOverlayResponse,VideoOverlayResponse>> overlays) {
            this.overlays = overlays;
            return this;
        }

        public Builder setRotation(@Nullable String rotation) {
            this.rotation = rotation;
            return this;
        }

        public FiltersResponse build() {
            return new FiltersResponse(crop, deinterlace, overlays, rotation);
        }
    }
}
