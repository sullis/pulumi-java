// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayFirewallDisabledRuleGroupResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayFirewallExclusionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Application gateway web application firewall configuration.
 * 
 */
public final class ApplicationGatewayWebApplicationFirewallConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayWebApplicationFirewallConfigurationResponse Empty = new ApplicationGatewayWebApplicationFirewallConfigurationResponse();

    /**
     * The disabled rule groups.
     * 
     */
    @InputImport(name="disabledRuleGroups")
      private final @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups;

    public List<ApplicationGatewayFirewallDisabledRuleGroupResponse> getDisabledRuleGroups() {
        return this.disabledRuleGroups == null ? List.of() : this.disabledRuleGroups;
    }

    /**
     * Whether the web application firewall is enabled or not.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * The exclusion list.
     * 
     */
    @InputImport(name="exclusions")
      private final @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions;

    public List<ApplicationGatewayFirewallExclusionResponse> getExclusions() {
        return this.exclusions == null ? List.of() : this.exclusions;
    }

    /**
     * Maximum file upload size in Mb for WAF.
     * 
     */
    @InputImport(name="fileUploadLimitInMb")
      private final @Nullable Integer fileUploadLimitInMb;

    public Optional<Integer> getFileUploadLimitInMb() {
        return this.fileUploadLimitInMb == null ? Optional.empty() : Optional.ofNullable(this.fileUploadLimitInMb);
    }

    /**
     * Web application firewall mode.
     * 
     */
    @InputImport(name="firewallMode", required=true)
      private final String firewallMode;

    public String getFirewallMode() {
        return this.firewallMode;
    }

    /**
     * Maximum request body size for WAF.
     * 
     */
    @InputImport(name="maxRequestBodySize")
      private final @Nullable Integer maxRequestBodySize;

    public Optional<Integer> getMaxRequestBodySize() {
        return this.maxRequestBodySize == null ? Optional.empty() : Optional.ofNullable(this.maxRequestBodySize);
    }

    /**
     * Maximum request body size in Kb for WAF.
     * 
     */
    @InputImport(name="maxRequestBodySizeInKb")
      private final @Nullable Integer maxRequestBodySizeInKb;

    public Optional<Integer> getMaxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb == null ? Optional.empty() : Optional.ofNullable(this.maxRequestBodySizeInKb);
    }

    /**
     * Whether allow WAF to check request Body.
     * 
     */
    @InputImport(name="requestBodyCheck")
      private final @Nullable Boolean requestBodyCheck;

    public Optional<Boolean> getRequestBodyCheck() {
        return this.requestBodyCheck == null ? Optional.empty() : Optional.ofNullable(this.requestBodyCheck);
    }

    /**
     * The type of the web application firewall rule set. Possible values are: 'OWASP'.
     * 
     */
    @InputImport(name="ruleSetType", required=true)
      private final String ruleSetType;

    public String getRuleSetType() {
        return this.ruleSetType;
    }

    /**
     * The version of the rule set type.
     * 
     */
    @InputImport(name="ruleSetVersion", required=true)
      private final String ruleSetVersion;

    public String getRuleSetVersion() {
        return this.ruleSetVersion;
    }

    public ApplicationGatewayWebApplicationFirewallConfigurationResponse(
        @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups,
        Boolean enabled,
        @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions,
        @Nullable Integer fileUploadLimitInMb,
        String firewallMode,
        @Nullable Integer maxRequestBodySize,
        @Nullable Integer maxRequestBodySizeInKb,
        @Nullable Boolean requestBodyCheck,
        String ruleSetType,
        String ruleSetVersion) {
        this.disabledRuleGroups = disabledRuleGroups;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.exclusions = exclusions;
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        this.firewallMode = Objects.requireNonNull(firewallMode, "expected parameter 'firewallMode' to be non-null");
        this.maxRequestBodySize = maxRequestBodySize;
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        this.requestBodyCheck = requestBodyCheck;
        this.ruleSetType = Objects.requireNonNull(ruleSetType, "expected parameter 'ruleSetType' to be non-null");
        this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion, "expected parameter 'ruleSetVersion' to be non-null");
    }

    private ApplicationGatewayWebApplicationFirewallConfigurationResponse() {
        this.disabledRuleGroups = List.of();
        this.enabled = null;
        this.exclusions = List.of();
        this.fileUploadLimitInMb = null;
        this.firewallMode = null;
        this.maxRequestBodySize = null;
        this.maxRequestBodySizeInKb = null;
        this.requestBodyCheck = null;
        this.ruleSetType = null;
        this.ruleSetVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayWebApplicationFirewallConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups;
        private Boolean enabled;
        private @Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions;
        private @Nullable Integer fileUploadLimitInMb;
        private String firewallMode;
        private @Nullable Integer maxRequestBodySize;
        private @Nullable Integer maxRequestBodySizeInKb;
        private @Nullable Boolean requestBodyCheck;
        private String ruleSetType;
        private String ruleSetVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayWebApplicationFirewallConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledRuleGroups = defaults.disabledRuleGroups;
    	      this.enabled = defaults.enabled;
    	      this.exclusions = defaults.exclusions;
    	      this.fileUploadLimitInMb = defaults.fileUploadLimitInMb;
    	      this.firewallMode = defaults.firewallMode;
    	      this.maxRequestBodySize = defaults.maxRequestBodySize;
    	      this.maxRequestBodySizeInKb = defaults.maxRequestBodySizeInKb;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
    	      this.ruleSetType = defaults.ruleSetType;
    	      this.ruleSetVersion = defaults.ruleSetVersion;
        }

        public Builder setDisabledRuleGroups(@Nullable List<ApplicationGatewayFirewallDisabledRuleGroupResponse> disabledRuleGroups) {
            this.disabledRuleGroups = disabledRuleGroups;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setExclusions(@Nullable List<ApplicationGatewayFirewallExclusionResponse> exclusions) {
            this.exclusions = exclusions;
            return this;
        }

        public Builder setFileUploadLimitInMb(@Nullable Integer fileUploadLimitInMb) {
            this.fileUploadLimitInMb = fileUploadLimitInMb;
            return this;
        }

        public Builder setFirewallMode(String firewallMode) {
            this.firewallMode = Objects.requireNonNull(firewallMode);
            return this;
        }

        public Builder setMaxRequestBodySize(@Nullable Integer maxRequestBodySize) {
            this.maxRequestBodySize = maxRequestBodySize;
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Integer maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Boolean requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public Builder setRuleSetType(String ruleSetType) {
            this.ruleSetType = Objects.requireNonNull(ruleSetType);
            return this;
        }

        public Builder setRuleSetVersion(String ruleSetVersion) {
            this.ruleSetVersion = Objects.requireNonNull(ruleSetVersion);
            return this;
        }
        public ApplicationGatewayWebApplicationFirewallConfigurationResponse build() {
            return new ApplicationGatewayWebApplicationFirewallConfigurationResponse(disabledRuleGroups, enabled, exclusions, fileUploadLimitInMb, firewallMode, maxRequestBodySize, maxRequestBodySizeInKb, requestBodyCheck, ruleSetType, ruleSetVersion);
        }
    }
}