// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis.inputs;

import com.pulumi.azurenative.changeanalysis.inputs.NotificationSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a configuration profile.
 * 
 */
public final class ConfigurationProfileResourcePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileResourcePropertiesArgs Empty = new ConfigurationProfileResourcePropertiesArgs();

    /**
     * Settings of change notification configuration for a subscription.
     * 
     */
    @Import(name="notifications")
    private @Nullable Output<NotificationSettingsArgs> notifications;

    /**
     * @return Settings of change notification configuration for a subscription.
     * 
     */
    public Optional<Output<NotificationSettingsArgs>> notifications() {
        return Optional.ofNullable(this.notifications);
    }

    private ConfigurationProfileResourcePropertiesArgs() {}

    private ConfigurationProfileResourcePropertiesArgs(ConfigurationProfileResourcePropertiesArgs $) {
        this.notifications = $.notifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationProfileResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationProfileResourcePropertiesArgs $;

        public Builder() {
            $ = new ConfigurationProfileResourcePropertiesArgs();
        }

        public Builder(ConfigurationProfileResourcePropertiesArgs defaults) {
            $ = new ConfigurationProfileResourcePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param notifications Settings of change notification configuration for a subscription.
         * 
         * @return builder
         * 
         */
        public Builder notifications(@Nullable Output<NotificationSettingsArgs> notifications) {
            $.notifications = notifications;
            return this;
        }

        /**
         * @param notifications Settings of change notification configuration for a subscription.
         * 
         * @return builder
         * 
         */
        public Builder notifications(NotificationSettingsArgs notifications) {
            return notifications(Output.of(notifications));
        }

        public ConfigurationProfileResourcePropertiesArgs build() {
            return $;
        }
    }

}
