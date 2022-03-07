// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.MessageScope;
import io.pulumi.azurenative.providerhub.enums.NotificationMode;
import io.pulumi.azurenative.providerhub.enums.ProvisioningState;
import io.pulumi.azurenative.providerhub.inputs.NotificationEndpointArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRegistrationPropertiesArgs Empty = new NotificationRegistrationPropertiesArgs();

    @InputImport(name="includedEvents")
      private final @Nullable Input<List<String>> includedEvents;

    public Input<List<String>> getIncludedEvents() {
        return this.includedEvents == null ? Input.empty() : this.includedEvents;
    }

    @InputImport(name="messageScope")
      private final @Nullable Input<Either<String,MessageScope>> messageScope;

    public Input<Either<String,MessageScope>> getMessageScope() {
        return this.messageScope == null ? Input.empty() : this.messageScope;
    }

    @InputImport(name="notificationEndpoints")
      private final @Nullable Input<List<NotificationEndpointArgs>> notificationEndpoints;

    public Input<List<NotificationEndpointArgs>> getNotificationEndpoints() {
        return this.notificationEndpoints == null ? Input.empty() : this.notificationEndpoints;
    }

    @InputImport(name="notificationMode")
      private final @Nullable Input<Either<String,NotificationMode>> notificationMode;

    public Input<Either<String,NotificationMode>> getNotificationMode() {
        return this.notificationMode == null ? Input.empty() : this.notificationMode;
    }

    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,ProvisioningState>> provisioningState;

    public Input<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    public NotificationRegistrationPropertiesArgs(
        @Nullable Input<List<String>> includedEvents,
        @Nullable Input<Either<String,MessageScope>> messageScope,
        @Nullable Input<List<NotificationEndpointArgs>> notificationEndpoints,
        @Nullable Input<Either<String,NotificationMode>> notificationMode,
        @Nullable Input<Either<String,ProvisioningState>> provisioningState) {
        this.includedEvents = includedEvents;
        this.messageScope = messageScope;
        this.notificationEndpoints = notificationEndpoints;
        this.notificationMode = notificationMode;
        this.provisioningState = provisioningState;
    }

    private NotificationRegistrationPropertiesArgs() {
        this.includedEvents = Input.empty();
        this.messageScope = Input.empty();
        this.notificationEndpoints = Input.empty();
        this.notificationMode = Input.empty();
        this.provisioningState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> includedEvents;
        private @Nullable Input<Either<String,MessageScope>> messageScope;
        private @Nullable Input<List<NotificationEndpointArgs>> notificationEndpoints;
        private @Nullable Input<Either<String,NotificationMode>> notificationMode;
        private @Nullable Input<Either<String,ProvisioningState>> provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includedEvents = defaults.includedEvents;
    	      this.messageScope = defaults.messageScope;
    	      this.notificationEndpoints = defaults.notificationEndpoints;
    	      this.notificationMode = defaults.notificationMode;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setIncludedEvents(@Nullable Input<List<String>> includedEvents) {
            this.includedEvents = includedEvents;
            return this;
        }

        public Builder setIncludedEvents(@Nullable List<String> includedEvents) {
            this.includedEvents = Input.ofNullable(includedEvents);
            return this;
        }

        public Builder setMessageScope(@Nullable Input<Either<String,MessageScope>> messageScope) {
            this.messageScope = messageScope;
            return this;
        }

        public Builder setMessageScope(@Nullable Either<String,MessageScope> messageScope) {
            this.messageScope = Input.ofNullable(messageScope);
            return this;
        }

        public Builder setNotificationEndpoints(@Nullable Input<List<NotificationEndpointArgs>> notificationEndpoints) {
            this.notificationEndpoints = notificationEndpoints;
            return this;
        }

        public Builder setNotificationEndpoints(@Nullable List<NotificationEndpointArgs> notificationEndpoints) {
            this.notificationEndpoints = Input.ofNullable(notificationEndpoints);
            return this;
        }

        public Builder setNotificationMode(@Nullable Input<Either<String,NotificationMode>> notificationMode) {
            this.notificationMode = notificationMode;
            return this;
        }

        public Builder setNotificationMode(@Nullable Either<String,NotificationMode> notificationMode) {
            this.notificationMode = Input.ofNullable(notificationMode);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }
        public NotificationRegistrationPropertiesArgs build() {
            return new NotificationRegistrationPropertiesArgs(includedEvents, messageScope, notificationEndpoints, notificationMode, provisioningState);
        }
    }
}