// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot;

import io.pulumi.awsnative.iot.inputs.SecurityProfileBehaviorArgs;
import io.pulumi.awsnative.iot.inputs.SecurityProfileMetricToRetainArgs;
import io.pulumi.awsnative.iot.inputs.SecurityProfileTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityProfileArgs Empty = new SecurityProfileArgs();

    @InputImport(name="additionalMetricsToRetainV2")
    private final @Nullable Input<List<SecurityProfileMetricToRetainArgs>> additionalMetricsToRetainV2;

    public Input<List<SecurityProfileMetricToRetainArgs>> getAdditionalMetricsToRetainV2() {
        return this.additionalMetricsToRetainV2 == null ? Input.empty() : this.additionalMetricsToRetainV2;
    }

    @InputImport(name="alertTargets")
    private final @Nullable Input<Object> alertTargets;

    public Input<Object> getAlertTargets() {
        return this.alertTargets == null ? Input.empty() : this.alertTargets;
    }

    @InputImport(name="behaviors")
    private final @Nullable Input<List<SecurityProfileBehaviorArgs>> behaviors;

    public Input<List<SecurityProfileBehaviorArgs>> getBehaviors() {
        return this.behaviors == null ? Input.empty() : this.behaviors;
    }

    @InputImport(name="securityProfileDescription")
    private final @Nullable Input<String> securityProfileDescription;

    public Input<String> getSecurityProfileDescription() {
        return this.securityProfileDescription == null ? Input.empty() : this.securityProfileDescription;
    }

    @InputImport(name="securityProfileName")
    private final @Nullable Input<String> securityProfileName;

    public Input<String> getSecurityProfileName() {
        return this.securityProfileName == null ? Input.empty() : this.securityProfileName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<SecurityProfileTagArgs>> tags;

    public Input<List<SecurityProfileTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="targetArns")
    private final @Nullable Input<List<String>> targetArns;

    public Input<List<String>> getTargetArns() {
        return this.targetArns == null ? Input.empty() : this.targetArns;
    }

    public SecurityProfileArgs(
        @Nullable Input<List<SecurityProfileMetricToRetainArgs>> additionalMetricsToRetainV2,
        @Nullable Input<Object> alertTargets,
        @Nullable Input<List<SecurityProfileBehaviorArgs>> behaviors,
        @Nullable Input<String> securityProfileDescription,
        @Nullable Input<String> securityProfileName,
        @Nullable Input<List<SecurityProfileTagArgs>> tags,
        @Nullable Input<List<String>> targetArns) {
        this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
        this.alertTargets = alertTargets;
        this.behaviors = behaviors;
        this.securityProfileDescription = securityProfileDescription;
        this.securityProfileName = securityProfileName;
        this.tags = tags;
        this.targetArns = targetArns;
    }

    private SecurityProfileArgs() {
        this.additionalMetricsToRetainV2 = Input.empty();
        this.alertTargets = Input.empty();
        this.behaviors = Input.empty();
        this.securityProfileDescription = Input.empty();
        this.securityProfileName = Input.empty();
        this.tags = Input.empty();
        this.targetArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SecurityProfileMetricToRetainArgs>> additionalMetricsToRetainV2;
        private @Nullable Input<Object> alertTargets;
        private @Nullable Input<List<SecurityProfileBehaviorArgs>> behaviors;
        private @Nullable Input<String> securityProfileDescription;
        private @Nullable Input<String> securityProfileName;
        private @Nullable Input<List<SecurityProfileTagArgs>> tags;
        private @Nullable Input<List<String>> targetArns;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetricsToRetainV2 = defaults.additionalMetricsToRetainV2;
    	      this.alertTargets = defaults.alertTargets;
    	      this.behaviors = defaults.behaviors;
    	      this.securityProfileDescription = defaults.securityProfileDescription;
    	      this.securityProfileName = defaults.securityProfileName;
    	      this.tags = defaults.tags;
    	      this.targetArns = defaults.targetArns;
        }

        public Builder setAdditionalMetricsToRetainV2(@Nullable Input<List<SecurityProfileMetricToRetainArgs>> additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2 = additionalMetricsToRetainV2;
            return this;
        }

        public Builder setAdditionalMetricsToRetainV2(@Nullable List<SecurityProfileMetricToRetainArgs> additionalMetricsToRetainV2) {
            this.additionalMetricsToRetainV2 = Input.ofNullable(additionalMetricsToRetainV2);
            return this;
        }

        public Builder setAlertTargets(@Nullable Input<Object> alertTargets) {
            this.alertTargets = alertTargets;
            return this;
        }

        public Builder setAlertTargets(@Nullable Object alertTargets) {
            this.alertTargets = Input.ofNullable(alertTargets);
            return this;
        }

        public Builder setBehaviors(@Nullable Input<List<SecurityProfileBehaviorArgs>> behaviors) {
            this.behaviors = behaviors;
            return this;
        }

        public Builder setBehaviors(@Nullable List<SecurityProfileBehaviorArgs> behaviors) {
            this.behaviors = Input.ofNullable(behaviors);
            return this;
        }

        public Builder setSecurityProfileDescription(@Nullable Input<String> securityProfileDescription) {
            this.securityProfileDescription = securityProfileDescription;
            return this;
        }

        public Builder setSecurityProfileDescription(@Nullable String securityProfileDescription) {
            this.securityProfileDescription = Input.ofNullable(securityProfileDescription);
            return this;
        }

        public Builder setSecurityProfileName(@Nullable Input<String> securityProfileName) {
            this.securityProfileName = securityProfileName;
            return this;
        }

        public Builder setSecurityProfileName(@Nullable String securityProfileName) {
            this.securityProfileName = Input.ofNullable(securityProfileName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<SecurityProfileTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SecurityProfileTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetArns(@Nullable Input<List<String>> targetArns) {
            this.targetArns = targetArns;
            return this;
        }

        public Builder setTargetArns(@Nullable List<String> targetArns) {
            this.targetArns = Input.ofNullable(targetArns);
            return this;
        }

        public SecurityProfileArgs build() {
            return new SecurityProfileArgs(additionalMetricsToRetainV2, alertTargets, behaviors, securityProfileDescription, securityProfileName, tags, targetArns);
        }
    }
}
