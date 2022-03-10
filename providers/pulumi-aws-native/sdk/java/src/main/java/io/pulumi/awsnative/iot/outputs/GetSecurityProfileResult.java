// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.outputs.SecurityProfileBehavior;
import io.pulumi.awsnative.iot.outputs.SecurityProfileMetricToRetain;
import io.pulumi.awsnative.iot.outputs.SecurityProfileTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSecurityProfileResult {
    /**
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
     * 
     */
    private final @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2;
    /**
     * Specifies the destinations to which alerts are sent.
     * 
     */
    private final @Nullable Object alertTargets;
    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
     */
    private final @Nullable List<SecurityProfileBehavior> behaviors;
    /**
     * The ARN (Amazon resource name) of the created security profile.
     * 
     */
    private final @Nullable String securityProfileArn;
    /**
     * A description of the security profile.
     * 
     */
    private final @Nullable String securityProfileDescription;
    /**
     * Metadata that can be used to manage the security profile.
     * 
     */
    private final @Nullable List<SecurityProfileTag> tags;
    /**
     * A set of target ARNs that the security profile is attached to.
     * 
     */
    private final @Nullable List<String> targetArns;

    @OutputCustomType.Constructor
    private GetSecurityProfileResult(
        @OutputCustomType.Parameter("additionalMetricsToRetainV2") @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2,
        @OutputCustomType.Parameter("alertTargets") @Nullable Object alertTargets,
        @OutputCustomType.Parameter("behaviors") @Nullable List<SecurityProfileBehavior> behaviors,
        @OutputCustomType.Parameter("securityProfileArn") @Nullable String securityProfileArn,
        @OutputCustomType.Parameter("securityProfileDescription") @Nullable String securityProfileDescription,
        @OutputCustomType.Parameter("tags") @Nullable List<SecurityProfileTag> tags,
        @OutputCustomType.Parameter("targetArns") @Nullable List<String> targetArns) {
        this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
        this.alertTargets = alertTargets;
        this.behaviors = behaviors;
        this.securityProfileArn = securityProfileArn;
        this.securityProfileDescription = securityProfileDescription;
        this.tags = tags;
        this.targetArns = targetArns;
    }

    /**
     * A list of metrics whose data is retained (stored). By default, data is retained for any metric used in the profile's behaviors, but it is also retained for any metric specified here.
     * 
    */
    public List<SecurityProfileMetricToRetain> getAdditionalMetricsToRetainV2() {
        return this.additionalMetricsToRetainV2 == null ? List.of() : this.additionalMetricsToRetainV2;
    }
    /**
     * Specifies the destinations to which alerts are sent.
     * 
    */
    public Optional<Object> getAlertTargets() {
        return Optional.ofNullable(this.alertTargets);
    }
    /**
     * Specifies the behaviors that, when violated by a device (thing), cause an alert.
     * 
    */
    public List<SecurityProfileBehavior> getBehaviors() {
        return this.behaviors == null ? List.of() : this.behaviors;
    }
    /**
     * The ARN (Amazon resource name) of the created security profile.
     * 
    */
    public Optional<String> getSecurityProfileArn() {
        return Optional.ofNullable(this.securityProfileArn);
    }
    /**
     * A description of the security profile.
     * 
    */
    public Optional<String> getSecurityProfileDescription() {
        return Optional.ofNullable(this.securityProfileDescription);
    }
    /**
     * Metadata that can be used to manage the security profile.
     * 
    */
    public List<SecurityProfileTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A set of target ARNs that the security profile is attached to.
     * 
    */
    public List<String> getTargetArns() {
        return this.targetArns == null ? List.of() : this.targetArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityProfileResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2;
        private @Nullable Object alertTargets;
        private @Nullable List<SecurityProfileBehavior> behaviors;
        private @Nullable String securityProfileArn;
        private @Nullable String securityProfileDescription;
        private @Nullable List<SecurityProfileTag> tags;
        private @Nullable List<String> targetArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityProfileResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetricsToRetainV2 = defaults.additionalMetricsToRetainV2;
    	      this.alertTargets = defaults.alertTargets;
    	      this.behaviors = defaults.behaviors;
    	      this.securityProfileArn = defaults.securityProfileArn;
    	      this.securityProfileDescription = defaults.securityProfileDescription;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        public Builder setAdditionalMetricsToRetainV2(@Nullable List<SecurityProfileMetricToRetain> additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
            return this;
        }

        public Builder setAlertTargets(@Nullable Object alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }

        public Builder setBehaviors(@Nullable List<SecurityProfileBehavior> behaviors) {
            this.behaviors = behaviors;
            return this;
        }

        public Builder setSecurityProfileArn(@Nullable String securityProfileArn) {
            this.securityProfileArn = securityProfileArn;
            return this;
        }

        public Builder setSecurityProfileDescription(@Nullable String securityProfileDescription) {
            this.securityProfileDescription = securityProfileDescription;
            return this;
        }

        public Builder setTags(@Nullable List<SecurityProfileTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetArns(@Nullable List<String> targetArns) {
            this.targetArns = targetArns;
            return this;
        }
        public GetSecurityProfileResult build() {
            return new GetSecurityProfileResult(additionalMetricsToRetainV2, alertTargets, behaviors, securityProfileArn, securityProfileDescription, tags, targetArns);
        }
    }
}
