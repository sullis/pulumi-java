// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs;
import com.pulumi.azurenative.network.inputs.FirewallPolicyIntrusionDetectionSignatureSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The operation for configuring intrusion detection.
 * 
 */
public final class FirewallPolicyIntrusionDetectionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyIntrusionDetectionConfigurationArgs Empty = new FirewallPolicyIntrusionDetectionConfigurationArgs();

    /**
     * List of rules for traffic to bypass.
     * 
     */
    @Import(name="bypassTrafficSettings")
    private @Nullable Output<List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs>> bypassTrafficSettings;

    /**
     * @return List of rules for traffic to bypass.
     * 
     */
    public Optional<Output<List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs>>> bypassTrafficSettings() {
        return Optional.ofNullable(this.bypassTrafficSettings);
    }

    /**
     * List of specific signatures states.
     * 
     */
    @Import(name="signatureOverrides")
    private @Nullable Output<List<FirewallPolicyIntrusionDetectionSignatureSpecificationArgs>> signatureOverrides;

    /**
     * @return List of specific signatures states.
     * 
     */
    public Optional<Output<List<FirewallPolicyIntrusionDetectionSignatureSpecificationArgs>>> signatureOverrides() {
        return Optional.ofNullable(this.signatureOverrides);
    }

    private FirewallPolicyIntrusionDetectionConfigurationArgs() {}

    private FirewallPolicyIntrusionDetectionConfigurationArgs(FirewallPolicyIntrusionDetectionConfigurationArgs $) {
        this.bypassTrafficSettings = $.bypassTrafficSettings;
        this.signatureOverrides = $.signatureOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyIntrusionDetectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyIntrusionDetectionConfigurationArgs $;

        public Builder() {
            $ = new FirewallPolicyIntrusionDetectionConfigurationArgs();
        }

        public Builder(FirewallPolicyIntrusionDetectionConfigurationArgs defaults) {
            $ = new FirewallPolicyIntrusionDetectionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bypassTrafficSettings List of rules for traffic to bypass.
         * 
         * @return builder
         * 
         */
        public Builder bypassTrafficSettings(@Nullable Output<List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs>> bypassTrafficSettings) {
            $.bypassTrafficSettings = bypassTrafficSettings;
            return this;
        }

        /**
         * @param bypassTrafficSettings List of rules for traffic to bypass.
         * 
         * @return builder
         * 
         */
        public Builder bypassTrafficSettings(List<FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs> bypassTrafficSettings) {
            return bypassTrafficSettings(Output.of(bypassTrafficSettings));
        }

        /**
         * @param bypassTrafficSettings List of rules for traffic to bypass.
         * 
         * @return builder
         * 
         */
        public Builder bypassTrafficSettings(FirewallPolicyIntrusionDetectionBypassTrafficSpecificationsArgs... bypassTrafficSettings) {
            return bypassTrafficSettings(List.of(bypassTrafficSettings));
        }

        /**
         * @param signatureOverrides List of specific signatures states.
         * 
         * @return builder
         * 
         */
        public Builder signatureOverrides(@Nullable Output<List<FirewallPolicyIntrusionDetectionSignatureSpecificationArgs>> signatureOverrides) {
            $.signatureOverrides = signatureOverrides;
            return this;
        }

        /**
         * @param signatureOverrides List of specific signatures states.
         * 
         * @return builder
         * 
         */
        public Builder signatureOverrides(List<FirewallPolicyIntrusionDetectionSignatureSpecificationArgs> signatureOverrides) {
            return signatureOverrides(Output.of(signatureOverrides));
        }

        /**
         * @param signatureOverrides List of specific signatures states.
         * 
         * @return builder
         * 
         */
        public Builder signatureOverrides(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs... signatureOverrides) {
            return signatureOverrides(List.of(signatureOverrides));
        }

        public FirewallPolicyIntrusionDetectionConfigurationArgs build() {
            return $;
        }
    }

}
