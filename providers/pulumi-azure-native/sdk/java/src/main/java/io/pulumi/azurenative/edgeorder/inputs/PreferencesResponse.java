// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.EncryptionPreferencesResponse;
import io.pulumi.azurenative.edgeorder.inputs.ManagementResourcePreferencesResponse;
import io.pulumi.azurenative.edgeorder.inputs.NotificationPreferenceResponse;
import io.pulumi.azurenative.edgeorder.inputs.TransportPreferencesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Preferences related to the order
 * 
 */
public final class PreferencesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PreferencesResponse Empty = new PreferencesResponse();

    /**
     * Preferences related to the Encryption.
     * 
     */
    @InputImport(name="encryptionPreferences")
    private final @Nullable EncryptionPreferencesResponse encryptionPreferences;

    public Optional<EncryptionPreferencesResponse> getEncryptionPreferences() {
        return this.encryptionPreferences == null ? Optional.empty() : Optional.ofNullable(this.encryptionPreferences);
    }

    /**
     * Preferences related to the Management resource.
     * 
     */
    @InputImport(name="managementResourcePreferences")
    private final @Nullable ManagementResourcePreferencesResponse managementResourcePreferences;

    public Optional<ManagementResourcePreferencesResponse> getManagementResourcePreferences() {
        return this.managementResourcePreferences == null ? Optional.empty() : Optional.ofNullable(this.managementResourcePreferences);
    }

    /**
     * Notification preferences.
     * 
     */
    @InputImport(name="notificationPreferences")
    private final @Nullable List<NotificationPreferenceResponse> notificationPreferences;

    public List<NotificationPreferenceResponse> getNotificationPreferences() {
        return this.notificationPreferences == null ? List.of() : this.notificationPreferences;
    }

    /**
     * Preferences related to the shipment logistics of the order.
     * 
     */
    @InputImport(name="transportPreferences")
    private final @Nullable TransportPreferencesResponse transportPreferences;

    public Optional<TransportPreferencesResponse> getTransportPreferences() {
        return this.transportPreferences == null ? Optional.empty() : Optional.ofNullable(this.transportPreferences);
    }

    public PreferencesResponse(
        @Nullable EncryptionPreferencesResponse encryptionPreferences,
        @Nullable ManagementResourcePreferencesResponse managementResourcePreferences,
        @Nullable List<NotificationPreferenceResponse> notificationPreferences,
        @Nullable TransportPreferencesResponse transportPreferences) {
        this.encryptionPreferences = encryptionPreferences;
        this.managementResourcePreferences = managementResourcePreferences;
        this.notificationPreferences = notificationPreferences;
        this.transportPreferences = transportPreferences;
    }

    private PreferencesResponse() {
        this.encryptionPreferences = null;
        this.managementResourcePreferences = null;
        this.notificationPreferences = List.of();
        this.transportPreferences = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EncryptionPreferencesResponse encryptionPreferences;
        private @Nullable ManagementResourcePreferencesResponse managementResourcePreferences;
        private @Nullable List<NotificationPreferenceResponse> notificationPreferences;
        private @Nullable TransportPreferencesResponse transportPreferences;

        public Builder() {
    	      // Empty
        }

        public Builder(PreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionPreferences = defaults.encryptionPreferences;
    	      this.managementResourcePreferences = defaults.managementResourcePreferences;
    	      this.notificationPreferences = defaults.notificationPreferences;
    	      this.transportPreferences = defaults.transportPreferences;
        }

        public Builder setEncryptionPreferences(@Nullable EncryptionPreferencesResponse encryptionPreferences) {
            this.encryptionPreferences = encryptionPreferences;
            return this;
        }

        public Builder setManagementResourcePreferences(@Nullable ManagementResourcePreferencesResponse managementResourcePreferences) {
            this.managementResourcePreferences = managementResourcePreferences;
            return this;
        }

        public Builder setNotificationPreferences(@Nullable List<NotificationPreferenceResponse> notificationPreferences) {
            this.notificationPreferences = notificationPreferences;
            return this;
        }

        public Builder setTransportPreferences(@Nullable TransportPreferencesResponse transportPreferences) {
            this.transportPreferences = transportPreferences;
            return this;
        }

        public PreferencesResponse build() {
            return new PreferencesResponse(encryptionPreferences, managementResourcePreferences, notificationPreferences, transportPreferences);
        }
    }
}
