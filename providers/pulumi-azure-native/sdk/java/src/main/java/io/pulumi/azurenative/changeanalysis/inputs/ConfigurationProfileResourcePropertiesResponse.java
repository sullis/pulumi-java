// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.inputs;

import io.pulumi.azurenative.changeanalysis.inputs.NotificationSettingsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a configuration profile.
 * 
 */
public final class ConfigurationProfileResourcePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationProfileResourcePropertiesResponse Empty = new ConfigurationProfileResourcePropertiesResponse();

    /**
     * Settings of change notification configuration for a subscription.
     * 
     */
    @InputImport(name="notifications")
    private final @Nullable NotificationSettingsResponse notifications;

    public Optional<NotificationSettingsResponse> getNotifications() {
        return this.notifications == null ? Optional.empty() : Optional.ofNullable(this.notifications);
    }

    public ConfigurationProfileResourcePropertiesResponse(@Nullable NotificationSettingsResponse notifications) {
        this.notifications = notifications;
    }

    private ConfigurationProfileResourcePropertiesResponse() {
        this.notifications = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileResourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NotificationSettingsResponse notifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileResourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notifications = defaults.notifications;
        }

        public Builder setNotifications(@Nullable NotificationSettingsResponse notifications) {
            this.notifications = notifications;
            return this;
        }

        public ConfigurationProfileResourcePropertiesResponse build() {
            return new ConfigurationProfileResourcePropertiesResponse(notifications);
        }
    }
}
