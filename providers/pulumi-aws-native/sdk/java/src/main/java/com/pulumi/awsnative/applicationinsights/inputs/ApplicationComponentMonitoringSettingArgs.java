// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights.inputs;

import com.pulumi.awsnative.applicationinsights.enums.ApplicationComponentMonitoringSettingComponentConfigurationMode;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationComponentConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The monitoring setting of the component.
 * 
 */
public final class ApplicationComponentMonitoringSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationComponentMonitoringSettingArgs Empty = new ApplicationComponentMonitoringSettingArgs();

    /**
     * The ARN of the compnonent.
     * 
     */
    @Import(name="componentARN")
    private @Nullable Output<String> componentARN;

    /**
     * @return The ARN of the compnonent.
     * 
     */
    public Optional<Output<String>> componentARN() {
        return Optional.ofNullable(this.componentARN);
    }

    /**
     * The component monitoring configuration mode.
     * 
     */
    @Import(name="componentConfigurationMode", required=true)
    private Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode;

    /**
     * @return The component monitoring configuration mode.
     * 
     */
    public Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode() {
        return this.componentConfigurationMode;
    }

    /**
     * The name of the component.
     * 
     */
    @Import(name="componentName")
    private @Nullable Output<String> componentName;

    /**
     * @return The name of the component.
     * 
     */
    public Optional<Output<String>> componentName() {
        return Optional.ofNullable(this.componentName);
    }

    /**
     * The monitoring configuration of the component.
     * 
     */
    @Import(name="customComponentConfiguration")
    private @Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration;

    /**
     * @return The monitoring configuration of the component.
     * 
     */
    public Optional<Output<ApplicationComponentConfigurationArgs>> customComponentConfiguration() {
        return Optional.ofNullable(this.customComponentConfiguration);
    }

    /**
     * The overwritten settings on default component monitoring configuration.
     * 
     */
    @Import(name="defaultOverwriteComponentConfiguration")
    private @Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration;

    /**
     * @return The overwritten settings on default component monitoring configuration.
     * 
     */
    public Optional<Output<ApplicationComponentConfigurationArgs>> defaultOverwriteComponentConfiguration() {
        return Optional.ofNullable(this.defaultOverwriteComponentConfiguration);
    }

    /**
     * The tier of the application component.
     * 
     */
    @Import(name="tier", required=true)
    private Output<String> tier;

    /**
     * @return The tier of the application component.
     * 
     */
    public Output<String> tier() {
        return this.tier;
    }

    private ApplicationComponentMonitoringSettingArgs() {}

    private ApplicationComponentMonitoringSettingArgs(ApplicationComponentMonitoringSettingArgs $) {
        this.componentARN = $.componentARN;
        this.componentConfigurationMode = $.componentConfigurationMode;
        this.componentName = $.componentName;
        this.customComponentConfiguration = $.customComponentConfiguration;
        this.defaultOverwriteComponentConfiguration = $.defaultOverwriteComponentConfiguration;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationComponentMonitoringSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationComponentMonitoringSettingArgs $;

        public Builder() {
            $ = new ApplicationComponentMonitoringSettingArgs();
        }

        public Builder(ApplicationComponentMonitoringSettingArgs defaults) {
            $ = new ApplicationComponentMonitoringSettingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param componentARN The ARN of the compnonent.
         * 
         * @return builder
         * 
         */
        public Builder componentARN(@Nullable Output<String> componentARN) {
            $.componentARN = componentARN;
            return this;
        }

        /**
         * @param componentARN The ARN of the compnonent.
         * 
         * @return builder
         * 
         */
        public Builder componentARN(String componentARN) {
            return componentARN(Output.of(componentARN));
        }

        /**
         * @param componentConfigurationMode The component monitoring configuration mode.
         * 
         * @return builder
         * 
         */
        public Builder componentConfigurationMode(Output<ApplicationComponentMonitoringSettingComponentConfigurationMode> componentConfigurationMode) {
            $.componentConfigurationMode = componentConfigurationMode;
            return this;
        }

        /**
         * @param componentConfigurationMode The component monitoring configuration mode.
         * 
         * @return builder
         * 
         */
        public Builder componentConfigurationMode(ApplicationComponentMonitoringSettingComponentConfigurationMode componentConfigurationMode) {
            return componentConfigurationMode(Output.of(componentConfigurationMode));
        }

        /**
         * @param componentName The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder componentName(@Nullable Output<String> componentName) {
            $.componentName = componentName;
            return this;
        }

        /**
         * @param componentName The name of the component.
         * 
         * @return builder
         * 
         */
        public Builder componentName(String componentName) {
            return componentName(Output.of(componentName));
        }

        /**
         * @param customComponentConfiguration The monitoring configuration of the component.
         * 
         * @return builder
         * 
         */
        public Builder customComponentConfiguration(@Nullable Output<ApplicationComponentConfigurationArgs> customComponentConfiguration) {
            $.customComponentConfiguration = customComponentConfiguration;
            return this;
        }

        /**
         * @param customComponentConfiguration The monitoring configuration of the component.
         * 
         * @return builder
         * 
         */
        public Builder customComponentConfiguration(ApplicationComponentConfigurationArgs customComponentConfiguration) {
            return customComponentConfiguration(Output.of(customComponentConfiguration));
        }

        /**
         * @param defaultOverwriteComponentConfiguration The overwritten settings on default component monitoring configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultOverwriteComponentConfiguration(@Nullable Output<ApplicationComponentConfigurationArgs> defaultOverwriteComponentConfiguration) {
            $.defaultOverwriteComponentConfiguration = defaultOverwriteComponentConfiguration;
            return this;
        }

        /**
         * @param defaultOverwriteComponentConfiguration The overwritten settings on default component monitoring configuration.
         * 
         * @return builder
         * 
         */
        public Builder defaultOverwriteComponentConfiguration(ApplicationComponentConfigurationArgs defaultOverwriteComponentConfiguration) {
            return defaultOverwriteComponentConfiguration(Output.of(defaultOverwriteComponentConfiguration));
        }

        /**
         * @param tier The tier of the application component.
         * 
         * @return builder
         * 
         */
        public Builder tier(Output<String> tier) {
            $.tier = tier;
            return this;
        }

        /**
         * @param tier The tier of the application component.
         * 
         * @return builder
         * 
         */
        public Builder tier(String tier) {
            return tier(Output.of(tier));
        }

        public ApplicationComponentMonitoringSettingArgs build() {
            $.componentConfigurationMode = Objects.requireNonNull($.componentConfigurationMode, "expected parameter 'componentConfigurationMode' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
