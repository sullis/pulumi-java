// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The presentation time range, this is asset related and not recommended for Account Filter.
 * 
 */
public final class PresentationTimeRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final PresentationTimeRangeResponse Empty = new PresentationTimeRangeResponse();

    /**
     * The absolute end time boundary.
     * 
     */
    @Import(name="endTimestamp")
    private @Nullable Double endTimestamp;

    /**
     * @return The absolute end time boundary.
     * 
     */
    public Optional<Double> endTimestamp() {
        return Optional.ofNullable(this.endTimestamp);
    }

    /**
     * The indicator of forcing existing of end time stamp.
     * 
     */
    @Import(name="forceEndTimestamp")
    private @Nullable Boolean forceEndTimestamp;

    /**
     * @return The indicator of forcing existing of end time stamp.
     * 
     */
    public Optional<Boolean> forceEndTimestamp() {
        return Optional.ofNullable(this.forceEndTimestamp);
    }

    /**
     * The relative to end right edge.
     * 
     */
    @Import(name="liveBackoffDuration")
    private @Nullable Double liveBackoffDuration;

    /**
     * @return The relative to end right edge.
     * 
     */
    public Optional<Double> liveBackoffDuration() {
        return Optional.ofNullable(this.liveBackoffDuration);
    }

    /**
     * The relative to end sliding window.
     * 
     */
    @Import(name="presentationWindowDuration")
    private @Nullable Double presentationWindowDuration;

    /**
     * @return The relative to end sliding window.
     * 
     */
    public Optional<Double> presentationWindowDuration() {
        return Optional.ofNullable(this.presentationWindowDuration);
    }

    /**
     * The absolute start time boundary.
     * 
     */
    @Import(name="startTimestamp")
    private @Nullable Double startTimestamp;

    /**
     * @return The absolute start time boundary.
     * 
     */
    public Optional<Double> startTimestamp() {
        return Optional.ofNullable(this.startTimestamp);
    }

    /**
     * The time scale of time stamps.
     * 
     */
    @Import(name="timescale")
    private @Nullable Double timescale;

    /**
     * @return The time scale of time stamps.
     * 
     */
    public Optional<Double> timescale() {
        return Optional.ofNullable(this.timescale);
    }

    private PresentationTimeRangeResponse() {}

    private PresentationTimeRangeResponse(PresentationTimeRangeResponse $) {
        this.endTimestamp = $.endTimestamp;
        this.forceEndTimestamp = $.forceEndTimestamp;
        this.liveBackoffDuration = $.liveBackoffDuration;
        this.presentationWindowDuration = $.presentationWindowDuration;
        this.startTimestamp = $.startTimestamp;
        this.timescale = $.timescale;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PresentationTimeRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PresentationTimeRangeResponse $;

        public Builder() {
            $ = new PresentationTimeRangeResponse();
        }

        public Builder(PresentationTimeRangeResponse defaults) {
            $ = new PresentationTimeRangeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endTimestamp The absolute end time boundary.
         * 
         * @return builder
         * 
         */
        public Builder endTimestamp(@Nullable Double endTimestamp) {
            $.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * @param forceEndTimestamp The indicator of forcing existing of end time stamp.
         * 
         * @return builder
         * 
         */
        public Builder forceEndTimestamp(@Nullable Boolean forceEndTimestamp) {
            $.forceEndTimestamp = forceEndTimestamp;
            return this;
        }

        /**
         * @param liveBackoffDuration The relative to end right edge.
         * 
         * @return builder
         * 
         */
        public Builder liveBackoffDuration(@Nullable Double liveBackoffDuration) {
            $.liveBackoffDuration = liveBackoffDuration;
            return this;
        }

        /**
         * @param presentationWindowDuration The relative to end sliding window.
         * 
         * @return builder
         * 
         */
        public Builder presentationWindowDuration(@Nullable Double presentationWindowDuration) {
            $.presentationWindowDuration = presentationWindowDuration;
            return this;
        }

        /**
         * @param startTimestamp The absolute start time boundary.
         * 
         * @return builder
         * 
         */
        public Builder startTimestamp(@Nullable Double startTimestamp) {
            $.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * @param timescale The time scale of time stamps.
         * 
         * @return builder
         * 
         */
        public Builder timescale(@Nullable Double timescale) {
            $.timescale = timescale;
            return this;
        }

        public PresentationTimeRangeResponse build() {
            return $;
        }
    }

}
