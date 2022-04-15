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
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointDashEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
 * 
 */
public final class OriginEndpointDashPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointDashPackageArgs Empty = new OriginEndpointDashPackageArgs();

    /**
     * A list of SCTE-35 message types that are treated as ad markers in the output.  If empty, no ad markers are output.  Specify multiple items to create ad markers for all of the included message types.
     * 
     */
    @Import(name="adTriggers")
      private final @Nullable Output<List<OriginEndpointDashPackageAdTriggersItem>> adTriggers;

    public Output<List<OriginEndpointDashPackageAdTriggersItem>> adTriggers() {
        return this.adTriggers == null ? Codegen.empty() : this.adTriggers;
    }

    @Import(name="adsOnDeliveryRestrictions")
      private final @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;

    public Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Codegen.empty() : this.adsOnDeliveryRestrictions;
    }

    @Import(name="encryption")
      private final @Nullable Output<OriginEndpointDashEncryptionArgs> encryption;

    public Output<OriginEndpointDashEncryptionArgs> encryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).  When set to FULL, elements like SegmentTemplate and ContentProtection are included in each Representation.  When set to COMPACT, duplicate elements are combined and presented at the AdaptationSet level.
     * 
     */
    @Import(name="manifestLayout")
      private final @Nullable Output<OriginEndpointDashPackageManifestLayout> manifestLayout;

    public Output<OriginEndpointDashPackageManifestLayout> manifestLayout() {
        return this.manifestLayout == null ? Codegen.empty() : this.manifestLayout;
    }

    /**
     * Time window (in seconds) contained in each manifest.
     * 
     */
    @Import(name="manifestWindowSeconds")
      private final @Nullable Output<Integer> manifestWindowSeconds;

    public Output<Integer> manifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Codegen.empty() : this.manifestWindowSeconds;
    }

    /**
     * Minimum duration (in seconds) that a player will buffer media before starting the presentation.
     * 
     */
    @Import(name="minBufferTimeSeconds")
      private final @Nullable Output<Integer> minBufferTimeSeconds;

    public Output<Integer> minBufferTimeSeconds() {
        return this.minBufferTimeSeconds == null ? Codegen.empty() : this.minBufferTimeSeconds;
    }

    /**
     * Minimum duration (in seconds) between potential changes to the Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD).
     * 
     */
    @Import(name="minUpdatePeriodSeconds")
      private final @Nullable Output<Integer> minUpdatePeriodSeconds;

    public Output<Integer> minUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds == null ? Codegen.empty() : this.minUpdatePeriodSeconds;
    }

    /**
     * A list of triggers that controls when the outgoing Dynamic Adaptive Streaming over HTTP (DASH) Media Presentation Description (MPD) will be partitioned into multiple periods. If empty, the content will not be partitioned into more than one period. If the list contains "ADS", new periods will be created where the Channel source contains SCTE-35 ad markers.
     * 
     */
    @Import(name="periodTriggers")
      private final @Nullable Output<List<OriginEndpointDashPackagePeriodTriggersItem>> periodTriggers;

    public Output<List<OriginEndpointDashPackagePeriodTriggersItem>> periodTriggers() {
        return this.periodTriggers == null ? Codegen.empty() : this.periodTriggers;
    }

    /**
     * The Dynamic Adaptive Streaming over HTTP (DASH) profile type.  When set to "HBBTV_1_5", HbbTV 1.5 compliant output is enabled.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<OriginEndpointDashPackageProfile> profile;

    public Output<OriginEndpointDashPackageProfile> profile() {
        return this.profile == null ? Codegen.empty() : this.profile;
    }

    /**
     * Duration (in seconds) of each segment. Actual segments will be rounded to the nearest multiple of the source segment duration.
     * 
     */
    @Import(name="segmentDurationSeconds")
      private final @Nullable Output<Integer> segmentDurationSeconds;

    public Output<Integer> segmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Codegen.empty() : this.segmentDurationSeconds;
    }

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).  When set to NUMBER_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Number$ media URLs.  When set to TIME_WITH_TIMELINE, a full timeline is presented in each SegmentTemplate, with $Time$ media URLs. When set to NUMBER_WITH_DURATION, only a duration is included in each SegmentTemplate, with $Number$ media URLs.
     * 
     */
    @Import(name="segmentTemplateFormat")
      private final @Nullable Output<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat;

    public Output<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat() {
        return this.segmentTemplateFormat == null ? Codegen.empty() : this.segmentTemplateFormat;
    }

    @Import(name="streamSelection")
      private final @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;

    public Output<OriginEndpointStreamSelectionArgs> streamSelection() {
        return this.streamSelection == null ? Codegen.empty() : this.streamSelection;
    }

    /**
     * Duration (in seconds) to delay live content before presentation.
     * 
     */
    @Import(name="suggestedPresentationDelaySeconds")
      private final @Nullable Output<Integer> suggestedPresentationDelaySeconds;

    public Output<Integer> suggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds == null ? Codegen.empty() : this.suggestedPresentationDelaySeconds;
    }

    /**
     * Determines the type of UTCTiming included in the Media Presentation Description (MPD)
     * 
     */
    @Import(name="utcTiming")
      private final @Nullable Output<OriginEndpointDashPackageUtcTiming> utcTiming;

    public Output<OriginEndpointDashPackageUtcTiming> utcTiming() {
        return this.utcTiming == null ? Codegen.empty() : this.utcTiming;
    }

    /**
     * Specifies the value attribute of the UTCTiming field when utcTiming is set to HTTP-ISO or HTTP-HEAD
     * 
     */
    @Import(name="utcTimingUri")
      private final @Nullable Output<String> utcTimingUri;

    public Output<String> utcTimingUri() {
        return this.utcTimingUri == null ? Codegen.empty() : this.utcTimingUri;
    }

    public OriginEndpointDashPackageArgs(
        @Nullable Output<List<OriginEndpointDashPackageAdTriggersItem>> adTriggers,
        @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions,
        @Nullable Output<OriginEndpointDashEncryptionArgs> encryption,
        @Nullable Output<OriginEndpointDashPackageManifestLayout> manifestLayout,
        @Nullable Output<Integer> manifestWindowSeconds,
        @Nullable Output<Integer> minBufferTimeSeconds,
        @Nullable Output<Integer> minUpdatePeriodSeconds,
        @Nullable Output<List<OriginEndpointDashPackagePeriodTriggersItem>> periodTriggers,
        @Nullable Output<OriginEndpointDashPackageProfile> profile,
        @Nullable Output<Integer> segmentDurationSeconds,
        @Nullable Output<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat,
        @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection,
        @Nullable Output<Integer> suggestedPresentationDelaySeconds,
        @Nullable Output<OriginEndpointDashPackageUtcTiming> utcTiming,
        @Nullable Output<String> utcTimingUri) {
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

    private OriginEndpointDashPackageArgs() {
        this.adTriggers = Codegen.empty();
        this.adsOnDeliveryRestrictions = Codegen.empty();
        this.encryption = Codegen.empty();
        this.manifestLayout = Codegen.empty();
        this.manifestWindowSeconds = Codegen.empty();
        this.minBufferTimeSeconds = Codegen.empty();
        this.minUpdatePeriodSeconds = Codegen.empty();
        this.periodTriggers = Codegen.empty();
        this.profile = Codegen.empty();
        this.segmentDurationSeconds = Codegen.empty();
        this.segmentTemplateFormat = Codegen.empty();
        this.streamSelection = Codegen.empty();
        this.suggestedPresentationDelaySeconds = Codegen.empty();
        this.utcTiming = Codegen.empty();
        this.utcTimingUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointDashPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<OriginEndpointDashPackageAdTriggersItem>> adTriggers;
        private @Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions;
        private @Nullable Output<OriginEndpointDashEncryptionArgs> encryption;
        private @Nullable Output<OriginEndpointDashPackageManifestLayout> manifestLayout;
        private @Nullable Output<Integer> manifestWindowSeconds;
        private @Nullable Output<Integer> minBufferTimeSeconds;
        private @Nullable Output<Integer> minUpdatePeriodSeconds;
        private @Nullable Output<List<OriginEndpointDashPackagePeriodTriggersItem>> periodTriggers;
        private @Nullable Output<OriginEndpointDashPackageProfile> profile;
        private @Nullable Output<Integer> segmentDurationSeconds;
        private @Nullable Output<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat;
        private @Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection;
        private @Nullable Output<Integer> suggestedPresentationDelaySeconds;
        private @Nullable Output<OriginEndpointDashPackageUtcTiming> utcTiming;
        private @Nullable Output<String> utcTimingUri;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointDashPackageArgs defaults) {
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

        public Builder adTriggers(@Nullable Output<List<OriginEndpointDashPackageAdTriggersItem>> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }
        public Builder adTriggers(@Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers) {
            this.adTriggers = Codegen.ofNullable(adTriggers);
            return this;
        }
        public Builder adTriggers(OriginEndpointDashPackageAdTriggersItem... adTriggers) {
            return adTriggers(List.of(adTriggers));
        }
        public Builder adsOnDeliveryRestrictions(@Nullable Output<OriginEndpointAdsOnDeliveryRestrictions> adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }
        public Builder adsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = Codegen.ofNullable(adsOnDeliveryRestrictions);
            return this;
        }
        public Builder encryption(@Nullable Output<OriginEndpointDashEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable OriginEndpointDashEncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder manifestLayout(@Nullable Output<OriginEndpointDashPackageManifestLayout> manifestLayout) {
            this.manifestLayout = manifestLayout;
            return this;
        }
        public Builder manifestLayout(@Nullable OriginEndpointDashPackageManifestLayout manifestLayout) {
            this.manifestLayout = Codegen.ofNullable(manifestLayout);
            return this;
        }
        public Builder manifestWindowSeconds(@Nullable Output<Integer> manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }
        public Builder manifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = Codegen.ofNullable(manifestWindowSeconds);
            return this;
        }
        public Builder minBufferTimeSeconds(@Nullable Output<Integer> minBufferTimeSeconds) {
            this.minBufferTimeSeconds = minBufferTimeSeconds;
            return this;
        }
        public Builder minBufferTimeSeconds(@Nullable Integer minBufferTimeSeconds) {
            this.minBufferTimeSeconds = Codegen.ofNullable(minBufferTimeSeconds);
            return this;
        }
        public Builder minUpdatePeriodSeconds(@Nullable Output<Integer> minUpdatePeriodSeconds) {
            this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
            return this;
        }
        public Builder minUpdatePeriodSeconds(@Nullable Integer minUpdatePeriodSeconds) {
            this.minUpdatePeriodSeconds = Codegen.ofNullable(minUpdatePeriodSeconds);
            return this;
        }
        public Builder periodTriggers(@Nullable Output<List<OriginEndpointDashPackagePeriodTriggersItem>> periodTriggers) {
            this.periodTriggers = periodTriggers;
            return this;
        }
        public Builder periodTriggers(@Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers) {
            this.periodTriggers = Codegen.ofNullable(periodTriggers);
            return this;
        }
        public Builder periodTriggers(OriginEndpointDashPackagePeriodTriggersItem... periodTriggers) {
            return periodTriggers(List.of(periodTriggers));
        }
        public Builder profile(@Nullable Output<OriginEndpointDashPackageProfile> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable OriginEndpointDashPackageProfile profile) {
            this.profile = Codegen.ofNullable(profile);
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Output<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }
        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Codegen.ofNullable(segmentDurationSeconds);
            return this;
        }
        public Builder segmentTemplateFormat(@Nullable Output<OriginEndpointDashPackageSegmentTemplateFormat> segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }
        public Builder segmentTemplateFormat(@Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat) {
            this.segmentTemplateFormat = Codegen.ofNullable(segmentTemplateFormat);
            return this;
        }
        public Builder streamSelection(@Nullable Output<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public Builder streamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Codegen.ofNullable(streamSelection);
            return this;
        }
        public Builder suggestedPresentationDelaySeconds(@Nullable Output<Integer> suggestedPresentationDelaySeconds) {
            this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
            return this;
        }
        public Builder suggestedPresentationDelaySeconds(@Nullable Integer suggestedPresentationDelaySeconds) {
            this.suggestedPresentationDelaySeconds = Codegen.ofNullable(suggestedPresentationDelaySeconds);
            return this;
        }
        public Builder utcTiming(@Nullable Output<OriginEndpointDashPackageUtcTiming> utcTiming) {
            this.utcTiming = utcTiming;
            return this;
        }
        public Builder utcTiming(@Nullable OriginEndpointDashPackageUtcTiming utcTiming) {
            this.utcTiming = Codegen.ofNullable(utcTiming);
            return this;
        }
        public Builder utcTimingUri(@Nullable Output<String> utcTimingUri) {
            this.utcTimingUri = utcTimingUri;
            return this;
        }
        public Builder utcTimingUri(@Nullable String utcTimingUri) {
            this.utcTimingUri = Codegen.ofNullable(utcTimingUri);
            return this;
        }        public OriginEndpointDashPackageArgs build() {
            return new OriginEndpointDashPackageArgs(adTriggers, adsOnDeliveryRestrictions, encryption, manifestLayout, manifestWindowSeconds, minBufferTimeSeconds, minUpdatePeriodSeconds, periodTriggers, profile, segmentDurationSeconds, segmentTemplateFormat, streamSelection, suggestedPresentationDelaySeconds, utcTiming, utcTimingUri);
        }
    }
}
