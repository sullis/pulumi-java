// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointAdsOnDeliveryRestrictions;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackageAdTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackageManifestLayout;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackagePeriodTriggersItem;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackageProfile;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackageSegmentTemplateFormat;
import io.pulumi.awsnative.mediapackage.enums.OriginEndpointDashPackageUtcTiming;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointDashEncryption;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelection;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 * 
 */
public final class OriginEndpointDashPackage extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointDashPackage Empty = new OriginEndpointDashPackage();

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @Import(name="adTriggers")
      private final @Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers;

    public List<OriginEndpointDashPackageAdTriggersItem> adTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }

    @Import(name="adsOnDeliveryRestrictions")
      private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;

    public Optional<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Optional.empty() : Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }

    @Import(name="encryption")
      private final @Nullable OriginEndpointDashEncryption encryption;

    public Optional<OriginEndpointDashEncryption> encryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * 
     */
    @Import(name="manifestLayout")
      private final @Nullable OriginEndpointDashPackageManifestLayout manifestLayout;

    public Optional<OriginEndpointDashPackageManifestLayout> manifestLayout() {
        return this.manifestLayout == null ? Optional.empty() : Optional.ofNullable(this.manifestLayout);
    }

    /**
     * Time window (in seconds) contained in each manifest.
     * 
     */
    @Import(name="manifestWindowSeconds")
      private final @Nullable Integer manifestWindowSeconds;

    public Optional<Integer> manifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Optional.empty() : Optional.ofNullable(this.manifestWindowSeconds);
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     */
    @Import(name="minBufferTimeSeconds")
      private final @Nullable Integer minBufferTimeSeconds;

    public Optional<Integer> minBufferTimeSeconds() {
        return this.minBufferTimeSeconds == null ? Optional.empty() : Optional.ofNullable(this.minBufferTimeSeconds);
    }

    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
     * 
     */
    @Import(name="minUpdatePeriodSeconds")
      private final @Nullable Integer minUpdatePeriodSeconds;

    public Optional<Integer> minUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds == null ? Optional.empty() : Optional.ofNullable(this.minUpdatePeriodSeconds);
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into more than one period. If the list contains "ADS", new periods will be created where the Channel source contains SCTE-35 ad markers.
     * 
     */
    @Import(name="periodTriggers")
      private final @Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers;

    public List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers() {
        return this.periodTriggers == null ? List.of() : this.periodTriggers;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * 
     */
    @Import(name="profile")
      private final @Nullable OriginEndpointDashPackageProfile profile;

    public Optional<OriginEndpointDashPackageProfile> profile() {
        return this.profile == null ? Optional.empty() : Optional.ofNullable(this.profile);
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> segmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     */
    @Import(name="segmentTemplateFormat")
      private final @Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat;

    public Optional<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat() {
        return this.segmentTemplateFormat == null ? Optional.empty() : Optional.ofNullable(this.segmentTemplateFormat);
    }

    @Import(name="streamSelection")
      private final @Nullable OriginEndpointStreamSelection streamSelection;

    public Optional<OriginEndpointStreamSelection> streamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    /**
     * Duration (in seconds) to delay live content before presentation.
     * 
     */
    @Import(name="suggestedPresentationDelaySeconds")
      private final @Nullable Integer suggestedPresentationDelaySeconds;

    public Optional<Integer> suggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds == null ? Optional.empty() : Optional.ofNullable(this.suggestedPresentationDelaySeconds);
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     */
    @Import(name="utcTiming")
      private final @Nullable OriginEndpointDashPackageUtcTiming utcTiming;

    public Optional<OriginEndpointDashPackageUtcTiming> utcTiming() {
        return this.utcTiming == null ? Optional.empty() : Optional.ofNullable(this.utcTiming);
    }

    /**
     * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * 
     */
    @Import(name="utcTimingUri")
      private final @Nullable String utcTimingUri;

    public Optional<String> utcTimingUri() {
        return this.utcTimingUri == null ? Optional.empty() : Optional.ofNullable(this.utcTimingUri);
    }

    public OriginEndpointDashPackage(
        @Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers,
        @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions,
        @Nullable OriginEndpointDashEncryption encryption,
        @Nullable OriginEndpointDashPackageManifestLayout manifestLayout,
        @Nullable Integer manifestWindowSeconds,
        @Nullable Integer minBufferTimeSeconds,
        @Nullable Integer minUpdatePeriodSeconds,
        @Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers,
        @Nullable OriginEndpointDashPackageProfile profile,
        @Nullable Integer segmentDurationSeconds,
        @Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat,
        @Nullable OriginEndpointStreamSelection streamSelection,
        @Nullable Integer suggestedPresentationDelaySeconds,
        @Nullable OriginEndpointDashPackageUtcTiming utcTiming,
        @Nullable String utcTimingUri) {
        this.adTriggers = adTriggers;
        this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
        this.encryption = encryption;
        this.manifestLayout = manifestLayout;
        this.manifestWindowSeconds = manifestWindowSeconds;
        this.minBufferTimeSeconds = minBufferTimeSeconds;
        this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
        this.periodTriggers = periodTriggers;
        this.profile = profile;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.segmentTemplateFormat = segmentTemplateFormat;
        this.streamSelection = streamSelection;
        this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
        this.utcTiming = utcTiming;
        this.utcTimingUri = utcTimingUri;
    }

    private OriginEndpointDashPackage() {
        this.adTriggers = List.of();
        this.adsOnDeliveryRestrictions = null;
        this.encryption = null;
        this.manifestLayout = null;
        this.manifestWindowSeconds = null;
        this.minBufferTimeSeconds = null;
        this.minUpdatePeriodSeconds = null;
        this.periodTriggers = List.of();
        this.profile = null;
        this.segmentDurationSeconds = null;
        this.segmentTemplateFormat = null;
        this.streamSelection = null;
        this.suggestedPresentationDelaySeconds = null;
        this.utcTiming = null;
        this.utcTimingUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointDashPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers;
        private @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;
        private @Nullable OriginEndpointDashEncryption encryption;
        private @Nullable OriginEndpointDashPackageManifestLayout manifestLayout;
        private @Nullable Integer manifestWindowSeconds;
        private @Nullable Integer minBufferTimeSeconds;
        private @Nullable Integer minUpdatePeriodSeconds;
        private @Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers;
        private @Nullable OriginEndpointDashPackageProfile profile;
        private @Nullable Integer segmentDurationSeconds;
        private @Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat;
        private @Nullable OriginEndpointStreamSelection streamSelection;
        private @Nullable Integer suggestedPresentationDelaySeconds;
        private @Nullable OriginEndpointDashPackageUtcTiming utcTiming;
        private @Nullable String utcTimingUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointDashPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adTriggers = defaults.adTriggers;
    	      this.adsOnDeliveryRestrictions = defaults.adsOnDeliveryRestrictions;
    	      this.encryption = defaults.encryption;
    	      this.manifestLayout = defaults.manifestLayout;
    	      this.manifestWindowSeconds = defaults.manifestWindowSeconds;
    	      this.minBufferTimeSeconds = defaults.minBufferTimeSeconds;
    	      this.minUpdatePeriodSeconds = defaults.minUpdatePeriodSeconds;
    	      this.periodTriggers = defaults.periodTriggers;
    	      this.profile = defaults.profile;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.segmentTemplateFormat = defaults.segmentTemplateFormat;
    	      this.streamSelection = defaults.streamSelection;
    	      this.suggestedPresentationDelaySeconds = defaults.suggestedPresentationDelaySeconds;
    	      this.utcTiming = defaults.utcTiming;
    	      this.utcTimingUri = defaults.utcTimingUri;
        }

        public Builder adTriggers(@Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }
        public Builder adTriggers(OriginEndpointDashPackageAdTriggersItem... adTriggers) {
            return adTriggers(List.of(adTriggers));
        }
        public Builder adsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }
        public Builder encryption(@Nullable OriginEndpointDashEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder manifestLayout(@Nullable OriginEndpointDashPackageManifestLayout manifestLayout) {
            this.manifestLayout = manifestLayout;
            return this;
        }
        public Builder manifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }
        public Builder minBufferTimeSeconds(@Nullable Integer minBufferTimeSeconds) {
            this.minBufferTimeSeconds = minBufferTimeSeconds;
            return this;
        }
        public Builder minUpdatePeriodSeconds(@Nullable Integer minUpdatePeriodSeconds) {
            this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
            return this;
        }
        public Builder periodTriggers(@Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers) {
            this.periodTriggers = periodTriggers;
            return this;
        }
        public Builder periodTriggers(OriginEndpointDashPackagePeriodTriggersItem... periodTriggers) {
            return periodTriggers(List.of(periodTriggers));
        }
        public Builder profile(@Nullable OriginEndpointDashPackageProfile profile) {
            this.profile = profile;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentTemplateFormat(@Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public Builder suggestedPresentationDelaySeconds(@Nullable Integer suggestedPresentationDelaySeconds) {
            this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
            return this;
        }
        public Builder utcTiming(@Nullable OriginEndpointDashPackageUtcTiming utcTiming) {
            this.utcTiming = utcTiming;
            return this;
        }
        public Builder utcTimingUri(@Nullable String utcTimingUri) {
            this.utcTimingUri = utcTimingUri;
            return this;
        }        public OriginEndpointDashPackage build() {
            return new OriginEndpointDashPackage(adTriggers, adsOnDeliveryRestrictions, encryption, manifestLayout, manifestWindowSeconds, minBufferTimeSeconds, minUpdatePeriodSeconds, periodTriggers, profile, segmentDurationSeconds, segmentTemplateFormat, streamSelection, suggestedPresentationDelaySeconds, utcTiming, utcTimingUri);
        }
    }
}
