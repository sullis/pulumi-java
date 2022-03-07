// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights;

import io.pulumi.awsnative.applicationinsights.inputs.ApplicationComponentMonitoringSettingArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationCustomComponentArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationLogPatternSetArgs;
import io.pulumi.awsnative.applicationinsights.inputs.ApplicationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * If set to true, application will be configured with recommended monitoring configuration.
     * 
     */
    @InputImport(name="autoConfigurationEnabled")
      private final @Nullable Input<Boolean> autoConfigurationEnabled;

    public Input<Boolean> getAutoConfigurationEnabled() {
        return this.autoConfigurationEnabled == null ? Input.empty() : this.autoConfigurationEnabled;
    }

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources.
     * 
     */
    @InputImport(name="cWEMonitorEnabled")
      private final @Nullable Input<Boolean> cWEMonitorEnabled;

    public Input<Boolean> getCWEMonitorEnabled() {
        return this.cWEMonitorEnabled == null ? Input.empty() : this.cWEMonitorEnabled;
    }

    /**
     * The monitoring settings of the components.
     * 
     */
    @InputImport(name="componentMonitoringSettings")
      private final @Nullable Input<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings;

    public Input<List<ApplicationComponentMonitoringSettingArgs>> getComponentMonitoringSettings() {
        return this.componentMonitoringSettings == null ? Input.empty() : this.componentMonitoringSettings;
    }

    /**
     * The custom grouped components.
     * 
     */
    @InputImport(name="customComponents")
      private final @Nullable Input<List<ApplicationCustomComponentArgs>> customComponents;

    public Input<List<ApplicationCustomComponentArgs>> getCustomComponents() {
        return this.customComponents == null ? Input.empty() : this.customComponents;
    }

    /**
     * The log pattern sets.
     * 
     */
    @InputImport(name="logPatternSets")
      private final @Nullable Input<List<ApplicationLogPatternSetArgs>> logPatternSets;

    public Input<List<ApplicationLogPatternSetArgs>> getLogPatternSets() {
        return this.logPatternSets == null ? Input.empty() : this.logPatternSets;
    }

    /**
     * When set to true, creates opsItems for any problems detected on an application.
     * 
     */
    @InputImport(name="opsCenterEnabled")
      private final @Nullable Input<Boolean> opsCenterEnabled;

    public Input<Boolean> getOpsCenterEnabled() {
        return this.opsCenterEnabled == null ? Input.empty() : this.opsCenterEnabled;
    }

    /**
     * The SNS topic provided to Application Insights that is associated to the created opsItem.
     * 
     */
    @InputImport(name="opsItemSNSTopicArn")
      private final @Nullable Input<String> opsItemSNSTopicArn;

    public Input<String> getOpsItemSNSTopicArn() {
        return this.opsItemSNSTopicArn == null ? Input.empty() : this.opsItemSNSTopicArn;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of Application Insights application.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ApplicationTagArgs>> tags;

    public Input<List<ApplicationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Input<Boolean> autoConfigurationEnabled,
        @Nullable Input<Boolean> cWEMonitorEnabled,
        @Nullable Input<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings,
        @Nullable Input<List<ApplicationCustomComponentArgs>> customComponents,
        @Nullable Input<List<ApplicationLogPatternSetArgs>> logPatternSets,
        @Nullable Input<Boolean> opsCenterEnabled,
        @Nullable Input<String> opsItemSNSTopicArn,
        Input<String> resourceGroupName,
        @Nullable Input<List<ApplicationTagArgs>> tags) {
        this.autoConfigurationEnabled = autoConfigurationEnabled;
        this.cWEMonitorEnabled = cWEMonitorEnabled;
        this.componentMonitoringSettings = componentMonitoringSettings;
        this.customComponents = customComponents;
        this.logPatternSets = logPatternSets;
        this.opsCenterEnabled = opsCenterEnabled;
        this.opsItemSNSTopicArn = opsItemSNSTopicArn;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.autoConfigurationEnabled = Input.empty();
        this.cWEMonitorEnabled = Input.empty();
        this.componentMonitoringSettings = Input.empty();
        this.customComponents = Input.empty();
        this.logPatternSets = Input.empty();
        this.opsCenterEnabled = Input.empty();
        this.opsItemSNSTopicArn = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoConfigurationEnabled;
        private @Nullable Input<Boolean> cWEMonitorEnabled;
        private @Nullable Input<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings;
        private @Nullable Input<List<ApplicationCustomComponentArgs>> customComponents;
        private @Nullable Input<List<ApplicationLogPatternSetArgs>> logPatternSets;
        private @Nullable Input<Boolean> opsCenterEnabled;
        private @Nullable Input<String> opsItemSNSTopicArn;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<ApplicationTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoConfigurationEnabled = defaults.autoConfigurationEnabled;
    	      this.cWEMonitorEnabled = defaults.cWEMonitorEnabled;
    	      this.componentMonitoringSettings = defaults.componentMonitoringSettings;
    	      this.customComponents = defaults.customComponents;
    	      this.logPatternSets = defaults.logPatternSets;
    	      this.opsCenterEnabled = defaults.opsCenterEnabled;
    	      this.opsItemSNSTopicArn = defaults.opsItemSNSTopicArn;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setAutoConfigurationEnabled(@Nullable Input<Boolean> autoConfigurationEnabled) {
            this.autoConfigurationEnabled = autoConfigurationEnabled;
            return this;
        }

        public Builder setAutoConfigurationEnabled(@Nullable Boolean autoConfigurationEnabled) {
            this.autoConfigurationEnabled = Input.ofNullable(autoConfigurationEnabled);
            return this;
        }

        public Builder setCWEMonitorEnabled(@Nullable Input<Boolean> cWEMonitorEnabled) {
            this.cWEMonitorEnabled = cWEMonitorEnabled;
            return this;
        }

        public Builder setCWEMonitorEnabled(@Nullable Boolean cWEMonitorEnabled) {
            this.cWEMonitorEnabled = Input.ofNullable(cWEMonitorEnabled);
            return this;
        }

        public Builder setComponentMonitoringSettings(@Nullable Input<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings) {
            this.componentMonitoringSettings = componentMonitoringSettings;
            return this;
        }

        public Builder setComponentMonitoringSettings(@Nullable List<ApplicationComponentMonitoringSettingArgs> componentMonitoringSettings) {
            this.componentMonitoringSettings = Input.ofNullable(componentMonitoringSettings);
            return this;
        }

        public Builder setCustomComponents(@Nullable Input<List<ApplicationCustomComponentArgs>> customComponents) {
            this.customComponents = customComponents;
            return this;
        }

        public Builder setCustomComponents(@Nullable List<ApplicationCustomComponentArgs> customComponents) {
            this.customComponents = Input.ofNullable(customComponents);
            return this;
        }

        public Builder setLogPatternSets(@Nullable Input<List<ApplicationLogPatternSetArgs>> logPatternSets) {
            this.logPatternSets = logPatternSets;
            return this;
        }

        public Builder setLogPatternSets(@Nullable List<ApplicationLogPatternSetArgs> logPatternSets) {
            this.logPatternSets = Input.ofNullable(logPatternSets);
            return this;
        }

        public Builder setOpsCenterEnabled(@Nullable Input<Boolean> opsCenterEnabled) {
            this.opsCenterEnabled = opsCenterEnabled;
            return this;
        }

        public Builder setOpsCenterEnabled(@Nullable Boolean opsCenterEnabled) {
            this.opsCenterEnabled = Input.ofNullable(opsCenterEnabled);
            return this;
        }

        public Builder setOpsItemSNSTopicArn(@Nullable Input<String> opsItemSNSTopicArn) {
            this.opsItemSNSTopicArn = opsItemSNSTopicArn;
            return this;
        }

        public Builder setOpsItemSNSTopicArn(@Nullable String opsItemSNSTopicArn) {
            this.opsItemSNSTopicArn = Input.ofNullable(opsItemSNSTopicArn);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<List<ApplicationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ApplicationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ApplicationArgs build() {
            return new ApplicationArgs(autoConfigurationEnabled, cWEMonitorEnabled, componentMonitoringSettings, customComponents, logPatternSets, opsCenterEnabled, opsItemSNSTopicArn, resourceGroupName, tags);
        }
    }
}