// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.DistributionCacheBehaviorArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionCustomErrorResponseArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionDefaultCacheBehaviorArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLegacyCustomOriginArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLegacyS3OriginArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionLoggingArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupsArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionRestrictionsArgs;
import io.pulumi.awsnative.cloudfront.inputs.DistributionViewerCertificateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigArgs Empty = new DistributionConfigArgs();

    @InputImport(name="aliases")
    private final @Nullable Input<List<String>> aliases;

    public Input<List<String>> getAliases() {
        return this.aliases == null ? Input.empty() : this.aliases;
    }

    @InputImport(name="cNAMEs")
    private final @Nullable Input<List<String>> cNAMEs;

    public Input<List<String>> getCNAMEs() {
        return this.cNAMEs == null ? Input.empty() : this.cNAMEs;
    }

    @InputImport(name="cacheBehaviors")
    private final @Nullable Input<List<DistributionCacheBehaviorArgs>> cacheBehaviors;

    public Input<List<DistributionCacheBehaviorArgs>> getCacheBehaviors() {
        return this.cacheBehaviors == null ? Input.empty() : this.cacheBehaviors;
    }

    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    @InputImport(name="customErrorResponses")
    private final @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses;

    public Input<List<DistributionCustomErrorResponseArgs>> getCustomErrorResponses() {
        return this.customErrorResponses == null ? Input.empty() : this.customErrorResponses;
    }

    @InputImport(name="customOrigin")
    private final @Nullable Input<DistributionLegacyCustomOriginArgs> customOrigin;

    public Input<DistributionLegacyCustomOriginArgs> getCustomOrigin() {
        return this.customOrigin == null ? Input.empty() : this.customOrigin;
    }

    @InputImport(name="defaultCacheBehavior")
    private final @Nullable Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior;

    public Input<DistributionDefaultCacheBehaviorArgs> getDefaultCacheBehavior() {
        return this.defaultCacheBehavior == null ? Input.empty() : this.defaultCacheBehavior;
    }

    @InputImport(name="defaultRootObject")
    private final @Nullable Input<String> defaultRootObject;

    public Input<String> getDefaultRootObject() {
        return this.defaultRootObject == null ? Input.empty() : this.defaultRootObject;
    }

    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    @InputImport(name="httpVersion")
    private final @Nullable Input<String> httpVersion;

    public Input<String> getHttpVersion() {
        return this.httpVersion == null ? Input.empty() : this.httpVersion;
    }

    @InputImport(name="iPV6Enabled")
    private final @Nullable Input<Boolean> iPV6Enabled;

    public Input<Boolean> getIPV6Enabled() {
        return this.iPV6Enabled == null ? Input.empty() : this.iPV6Enabled;
    }

    @InputImport(name="logging")
    private final @Nullable Input<DistributionLoggingArgs> logging;

    public Input<DistributionLoggingArgs> getLogging() {
        return this.logging == null ? Input.empty() : this.logging;
    }

    @InputImport(name="originGroups")
    private final @Nullable Input<DistributionOriginGroupsArgs> originGroups;

    public Input<DistributionOriginGroupsArgs> getOriginGroups() {
        return this.originGroups == null ? Input.empty() : this.originGroups;
    }

    @InputImport(name="origins")
    private final @Nullable Input<List<DistributionOriginArgs>> origins;

    public Input<List<DistributionOriginArgs>> getOrigins() {
        return this.origins == null ? Input.empty() : this.origins;
    }

    @InputImport(name="priceClass")
    private final @Nullable Input<String> priceClass;

    public Input<String> getPriceClass() {
        return this.priceClass == null ? Input.empty() : this.priceClass;
    }

    @InputImport(name="restrictions")
    private final @Nullable Input<DistributionRestrictionsArgs> restrictions;

    public Input<DistributionRestrictionsArgs> getRestrictions() {
        return this.restrictions == null ? Input.empty() : this.restrictions;
    }

    @InputImport(name="s3Origin")
    private final @Nullable Input<DistributionLegacyS3OriginArgs> s3Origin;

    public Input<DistributionLegacyS3OriginArgs> getS3Origin() {
        return this.s3Origin == null ? Input.empty() : this.s3Origin;
    }

    @InputImport(name="viewerCertificate")
    private final @Nullable Input<DistributionViewerCertificateArgs> viewerCertificate;

    public Input<DistributionViewerCertificateArgs> getViewerCertificate() {
        return this.viewerCertificate == null ? Input.empty() : this.viewerCertificate;
    }

    @InputImport(name="webACLId")
    private final @Nullable Input<String> webACLId;

    public Input<String> getWebACLId() {
        return this.webACLId == null ? Input.empty() : this.webACLId;
    }

    public DistributionConfigArgs(
        @Nullable Input<List<String>> aliases,
        @Nullable Input<List<String>> cNAMEs,
        @Nullable Input<List<DistributionCacheBehaviorArgs>> cacheBehaviors,
        @Nullable Input<String> comment,
        @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses,
        @Nullable Input<DistributionLegacyCustomOriginArgs> customOrigin,
        @Nullable Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior,
        @Nullable Input<String> defaultRootObject,
        Input<Boolean> enabled,
        @Nullable Input<String> httpVersion,
        @Nullable Input<Boolean> iPV6Enabled,
        @Nullable Input<DistributionLoggingArgs> logging,
        @Nullable Input<DistributionOriginGroupsArgs> originGroups,
        @Nullable Input<List<DistributionOriginArgs>> origins,
        @Nullable Input<String> priceClass,
        @Nullable Input<DistributionRestrictionsArgs> restrictions,
        @Nullable Input<DistributionLegacyS3OriginArgs> s3Origin,
        @Nullable Input<DistributionViewerCertificateArgs> viewerCertificate,
        @Nullable Input<String> webACLId) {
        this.aliases = aliases;
        this.cNAMEs = cNAMEs;
        this.cacheBehaviors = cacheBehaviors;
        this.comment = comment;
        this.customErrorResponses = customErrorResponses;
        this.customOrigin = customOrigin;
        this.defaultCacheBehavior = defaultCacheBehavior;
        this.defaultRootObject = defaultRootObject;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.httpVersion = httpVersion;
        this.iPV6Enabled = iPV6Enabled;
        this.logging = logging;
        this.originGroups = originGroups;
        this.origins = origins;
        this.priceClass = priceClass;
        this.restrictions = restrictions;
        this.s3Origin = s3Origin;
        this.viewerCertificate = viewerCertificate;
        this.webACLId = webACLId;
    }

    private DistributionConfigArgs() {
        this.aliases = Input.empty();
        this.cNAMEs = Input.empty();
        this.cacheBehaviors = Input.empty();
        this.comment = Input.empty();
        this.customErrorResponses = Input.empty();
        this.customOrigin = Input.empty();
        this.defaultCacheBehavior = Input.empty();
        this.defaultRootObject = Input.empty();
        this.enabled = Input.empty();
        this.httpVersion = Input.empty();
        this.iPV6Enabled = Input.empty();
        this.logging = Input.empty();
        this.originGroups = Input.empty();
        this.origins = Input.empty();
        this.priceClass = Input.empty();
        this.restrictions = Input.empty();
        this.s3Origin = Input.empty();
        this.viewerCertificate = Input.empty();
        this.webACLId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> aliases;
        private @Nullable Input<List<String>> cNAMEs;
        private @Nullable Input<List<DistributionCacheBehaviorArgs>> cacheBehaviors;
        private @Nullable Input<String> comment;
        private @Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses;
        private @Nullable Input<DistributionLegacyCustomOriginArgs> customOrigin;
        private @Nullable Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior;
        private @Nullable Input<String> defaultRootObject;
        private Input<Boolean> enabled;
        private @Nullable Input<String> httpVersion;
        private @Nullable Input<Boolean> iPV6Enabled;
        private @Nullable Input<DistributionLoggingArgs> logging;
        private @Nullable Input<DistributionOriginGroupsArgs> originGroups;
        private @Nullable Input<List<DistributionOriginArgs>> origins;
        private @Nullable Input<String> priceClass;
        private @Nullable Input<DistributionRestrictionsArgs> restrictions;
        private @Nullable Input<DistributionLegacyS3OriginArgs> s3Origin;
        private @Nullable Input<DistributionViewerCertificateArgs> viewerCertificate;
        private @Nullable Input<String> webACLId;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.cNAMEs = defaults.cNAMEs;
    	      this.cacheBehaviors = defaults.cacheBehaviors;
    	      this.comment = defaults.comment;
    	      this.customErrorResponses = defaults.customErrorResponses;
    	      this.customOrigin = defaults.customOrigin;
    	      this.defaultCacheBehavior = defaults.defaultCacheBehavior;
    	      this.defaultRootObject = defaults.defaultRootObject;
    	      this.enabled = defaults.enabled;
    	      this.httpVersion = defaults.httpVersion;
    	      this.iPV6Enabled = defaults.iPV6Enabled;
    	      this.logging = defaults.logging;
    	      this.originGroups = defaults.originGroups;
    	      this.origins = defaults.origins;
    	      this.priceClass = defaults.priceClass;
    	      this.restrictions = defaults.restrictions;
    	      this.s3Origin = defaults.s3Origin;
    	      this.viewerCertificate = defaults.viewerCertificate;
    	      this.webACLId = defaults.webACLId;
        }

        public Builder setAliases(@Nullable Input<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setAliases(@Nullable List<String> aliases) {
            this.aliases = Input.ofNullable(aliases);
            return this;
        }

        public Builder setCNAMEs(@Nullable Input<List<String>> cNAMEs) {
            this.cNAMEs = cNAMEs;
            return this;
        }

        public Builder setCNAMEs(@Nullable List<String> cNAMEs) {
            this.cNAMEs = Input.ofNullable(cNAMEs);
            return this;
        }

        public Builder setCacheBehaviors(@Nullable Input<List<DistributionCacheBehaviorArgs>> cacheBehaviors) {
            this.cacheBehaviors = cacheBehaviors;
            return this;
        }

        public Builder setCacheBehaviors(@Nullable List<DistributionCacheBehaviorArgs> cacheBehaviors) {
            this.cacheBehaviors = Input.ofNullable(cacheBehaviors);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setCustomErrorResponses(@Nullable Input<List<DistributionCustomErrorResponseArgs>> customErrorResponses) {
            this.customErrorResponses = customErrorResponses;
            return this;
        }

        public Builder setCustomErrorResponses(@Nullable List<DistributionCustomErrorResponseArgs> customErrorResponses) {
            this.customErrorResponses = Input.ofNullable(customErrorResponses);
            return this;
        }

        public Builder setCustomOrigin(@Nullable Input<DistributionLegacyCustomOriginArgs> customOrigin) {
            this.customOrigin = customOrigin;
            return this;
        }

        public Builder setCustomOrigin(@Nullable DistributionLegacyCustomOriginArgs customOrigin) {
            this.customOrigin = Input.ofNullable(customOrigin);
            return this;
        }

        public Builder setDefaultCacheBehavior(@Nullable Input<DistributionDefaultCacheBehaviorArgs> defaultCacheBehavior) {
            this.defaultCacheBehavior = defaultCacheBehavior;
            return this;
        }

        public Builder setDefaultCacheBehavior(@Nullable DistributionDefaultCacheBehaviorArgs defaultCacheBehavior) {
            this.defaultCacheBehavior = Input.ofNullable(defaultCacheBehavior);
            return this;
        }

        public Builder setDefaultRootObject(@Nullable Input<String> defaultRootObject) {
            this.defaultRootObject = defaultRootObject;
            return this;
        }

        public Builder setDefaultRootObject(@Nullable String defaultRootObject) {
            this.defaultRootObject = Input.ofNullable(defaultRootObject);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setHttpVersion(@Nullable Input<String> httpVersion) {
            this.httpVersion = httpVersion;
            return this;
        }

        public Builder setHttpVersion(@Nullable String httpVersion) {
            this.httpVersion = Input.ofNullable(httpVersion);
            return this;
        }

        public Builder setIPV6Enabled(@Nullable Input<Boolean> iPV6Enabled) {
            this.iPV6Enabled = iPV6Enabled;
            return this;
        }

        public Builder setIPV6Enabled(@Nullable Boolean iPV6Enabled) {
            this.iPV6Enabled = Input.ofNullable(iPV6Enabled);
            return this;
        }

        public Builder setLogging(@Nullable Input<DistributionLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLogging(@Nullable DistributionLoggingArgs logging) {
            this.logging = Input.ofNullable(logging);
            return this;
        }

        public Builder setOriginGroups(@Nullable Input<DistributionOriginGroupsArgs> originGroups) {
            this.originGroups = originGroups;
            return this;
        }

        public Builder setOriginGroups(@Nullable DistributionOriginGroupsArgs originGroups) {
            this.originGroups = Input.ofNullable(originGroups);
            return this;
        }

        public Builder setOrigins(@Nullable Input<List<DistributionOriginArgs>> origins) {
            this.origins = origins;
            return this;
        }

        public Builder setOrigins(@Nullable List<DistributionOriginArgs> origins) {
            this.origins = Input.ofNullable(origins);
            return this;
        }

        public Builder setPriceClass(@Nullable Input<String> priceClass) {
            this.priceClass = priceClass;
            return this;
        }

        public Builder setPriceClass(@Nullable String priceClass) {
            this.priceClass = Input.ofNullable(priceClass);
            return this;
        }

        public Builder setRestrictions(@Nullable Input<DistributionRestrictionsArgs> restrictions) {
            this.restrictions = restrictions;
            return this;
        }

        public Builder setRestrictions(@Nullable DistributionRestrictionsArgs restrictions) {
            this.restrictions = Input.ofNullable(restrictions);
            return this;
        }

        public Builder setS3Origin(@Nullable Input<DistributionLegacyS3OriginArgs> s3Origin) {
            this.s3Origin = s3Origin;
            return this;
        }

        public Builder setS3Origin(@Nullable DistributionLegacyS3OriginArgs s3Origin) {
            this.s3Origin = Input.ofNullable(s3Origin);
            return this;
        }

        public Builder setViewerCertificate(@Nullable Input<DistributionViewerCertificateArgs> viewerCertificate) {
            this.viewerCertificate = viewerCertificate;
            return this;
        }

        public Builder setViewerCertificate(@Nullable DistributionViewerCertificateArgs viewerCertificate) {
            this.viewerCertificate = Input.ofNullable(viewerCertificate);
            return this;
        }

        public Builder setWebACLId(@Nullable Input<String> webACLId) {
            this.webACLId = webACLId;
            return this;
        }

        public Builder setWebACLId(@Nullable String webACLId) {
            this.webACLId = Input.ofNullable(webACLId);
            return this;
        }

        public DistributionConfigArgs build() {
            return new DistributionConfigArgs(aliases, cNAMEs, cacheBehaviors, comment, customErrorResponses, customOrigin, defaultCacheBehavior, defaultRootObject, enabled, httpVersion, iPV6Enabled, logging, originGroups, origins, priceClass, restrictions, s3Origin, viewerCertificate, webACLId);
        }
    }
}
