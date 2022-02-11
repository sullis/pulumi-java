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
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginEndpointDashPackage extends io.pulumi.resources.InvokeArgs {

    public static final OriginEndpointDashPackage Empty = new OriginEndpointDashPackage();

    @InputImport(name="adTriggers")
    private final @Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers;

    public List<OriginEndpointDashPackageAdTriggersItem> getAdTriggers() {
        return this.adTriggers == null ? List.of() : this.adTriggers;
    }

    @InputImport(name="adsOnDeliveryRestrictions")
    private final @Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions;

    public Optional<OriginEndpointAdsOnDeliveryRestrictions> getAdsOnDeliveryRestrictions() {
        return this.adsOnDeliveryRestrictions == null ? Optional.empty() : Optional.ofNullable(this.adsOnDeliveryRestrictions);
    }

    @InputImport(name="encryption")
    private final @Nullable OriginEndpointDashEncryption encryption;

    public Optional<OriginEndpointDashEncryption> getEncryption() {
        return this.encryption == null ? Optional.empty() : Optional.ofNullable(this.encryption);
    }

    @InputImport(name="manifestLayout")
    private final @Nullable OriginEndpointDashPackageManifestLayout manifestLayout;

    public Optional<OriginEndpointDashPackageManifestLayout> getManifestLayout() {
        return this.manifestLayout == null ? Optional.empty() : Optional.ofNullable(this.manifestLayout);
    }

    @InputImport(name="manifestWindowSeconds")
    private final @Nullable Integer manifestWindowSeconds;

    public Optional<Integer> getManifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Optional.empty() : Optional.ofNullable(this.manifestWindowSeconds);
    }

    @InputImport(name="minBufferTimeSeconds")
    private final @Nullable Integer minBufferTimeSeconds;

    public Optional<Integer> getMinBufferTimeSeconds() {
        return this.minBufferTimeSeconds == null ? Optional.empty() : Optional.ofNullable(this.minBufferTimeSeconds);
    }

    @InputImport(name="minUpdatePeriodSeconds")
    private final @Nullable Integer minUpdatePeriodSeconds;

    public Optional<Integer> getMinUpdatePeriodSeconds() {
        return this.minUpdatePeriodSeconds == null ? Optional.empty() : Optional.ofNullable(this.minUpdatePeriodSeconds);
    }

    @InputImport(name="periodTriggers")
    private final @Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers;

    public List<OriginEndpointDashPackagePeriodTriggersItem> getPeriodTriggers() {
        return this.periodTriggers == null ? List.of() : this.periodTriggers;
    }

    @InputImport(name="profile")
    private final @Nullable OriginEndpointDashPackageProfile profile;

    public Optional<OriginEndpointDashPackageProfile> getProfile() {
        return this.profile == null ? Optional.empty() : Optional.ofNullable(this.profile);
    }

    @InputImport(name="segmentDurationSeconds")
    private final @Nullable Integer segmentDurationSeconds;

    public Optional<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Optional.empty() : Optional.ofNullable(this.segmentDurationSeconds);
    }

    @InputImport(name="segmentTemplateFormat")
    private final @Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat;

    public Optional<OriginEndpointDashPackageSegmentTemplateFormat> getSegmentTemplateFormat() {
        return this.segmentTemplateFormat == null ? Optional.empty() : Optional.ofNullable(this.segmentTemplateFormat);
    }

    @InputImport(name="streamSelection")
    private final @Nullable OriginEndpointStreamSelection streamSelection;

    public Optional<OriginEndpointStreamSelection> getStreamSelection() {
        return this.streamSelection == null ? Optional.empty() : Optional.ofNullable(this.streamSelection);
    }

    @InputImport(name="suggestedPresentationDelaySeconds")
    private final @Nullable Integer suggestedPresentationDelaySeconds;

    public Optional<Integer> getSuggestedPresentationDelaySeconds() {
        return this.suggestedPresentationDelaySeconds == null ? Optional.empty() : Optional.ofNullable(this.suggestedPresentationDelaySeconds);
    }

    @InputImport(name="utcTiming")
    private final @Nullable OriginEndpointDashPackageUtcTiming utcTiming;

    public Optional<OriginEndpointDashPackageUtcTiming> getUtcTiming() {
        return this.utcTiming == null ? Optional.empty() : Optional.ofNullable(this.utcTiming);
    }

    @InputImport(name="utcTimingUri")
    private final @Nullable String utcTimingUri;

    public Optional<String> getUtcTimingUri() {
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

        public Builder setAdTriggers(@Nullable List<OriginEndpointDashPackageAdTriggersItem> adTriggers) {
            this.adTriggers = adTriggers;
            return this;
        }

        public Builder setAdsOnDeliveryRestrictions(@Nullable OriginEndpointAdsOnDeliveryRestrictions adsOnDeliveryRestrictions) {
            this.adsOnDeliveryRestrictions = adsOnDeliveryRestrictions;
            return this;
        }

        public Builder setEncryption(@Nullable OriginEndpointDashEncryption encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setManifestLayout(@Nullable OriginEndpointDashPackageManifestLayout manifestLayout) {
            this.manifestLayout = manifestLayout;
            return this;
        }

        public Builder setManifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }

        public Builder setMinBufferTimeSeconds(@Nullable Integer minBufferTimeSeconds) {
            this.minBufferTimeSeconds = minBufferTimeSeconds;
            return this;
        }

        public Builder setMinUpdatePeriodSeconds(@Nullable Integer minUpdatePeriodSeconds) {
            this.minUpdatePeriodSeconds = minUpdatePeriodSeconds;
            return this;
        }

        public Builder setPeriodTriggers(@Nullable List<OriginEndpointDashPackagePeriodTriggersItem> periodTriggers) {
            this.periodTriggers = periodTriggers;
            return this;
        }

        public Builder setProfile(@Nullable OriginEndpointDashPackageProfile profile) {
            this.profile = profile;
            return this;
        }

        public Builder setSegmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder setSegmentTemplateFormat(@Nullable OriginEndpointDashPackageSegmentTemplateFormat segmentTemplateFormat) {
            this.segmentTemplateFormat = segmentTemplateFormat;
            return this;
        }

        public Builder setStreamSelection(@Nullable OriginEndpointStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder setSuggestedPresentationDelaySeconds(@Nullable Integer suggestedPresentationDelaySeconds) {
            this.suggestedPresentationDelaySeconds = suggestedPresentationDelaySeconds;
            return this;
        }

        public Builder setUtcTiming(@Nullable OriginEndpointDashPackageUtcTiming utcTiming) {
            this.utcTiming = utcTiming;
            return this;
        }

        public Builder setUtcTimingUri(@Nullable String utcTimingUri) {
            this.utcTimingUri = utcTimingUri;
            return this;
        }

        public OriginEndpointDashPackage build() {
            return new OriginEndpointDashPackage(adTriggers, adsOnDeliveryRestrictions, encryption, manifestLayout, manifestWindowSeconds, minBufferTimeSeconds, minUpdatePeriodSeconds, periodTriggers, profile, segmentDurationSeconds, segmentTemplateFormat, streamSelection, suggestedPresentationDelaySeconds, utcTiming, utcTimingUri);
        }
    }
}
