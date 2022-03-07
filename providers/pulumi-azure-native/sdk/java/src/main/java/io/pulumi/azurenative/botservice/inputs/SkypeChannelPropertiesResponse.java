// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Microsoft Teams channel.
 * 
 */
public final class SkypeChannelPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkypeChannelPropertiesResponse Empty = new SkypeChannelPropertiesResponse();

    /**
     * Calling web hook for Skype channel
     * 
     */
    @InputImport(name="callingWebHook")
      private final @Nullable String callingWebHook;

    public Optional<String> getCallingWebHook() {
        return this.callingWebHook == null ? Optional.empty() : Optional.ofNullable(this.callingWebHook);
    }

    /**
     * Enable calling for Skype channel
     * 
     */
    @InputImport(name="enableCalling")
      private final @Nullable Boolean enableCalling;

    public Optional<Boolean> getEnableCalling() {
        return this.enableCalling == null ? Optional.empty() : Optional.ofNullable(this.enableCalling);
    }

    /**
     * Enable groups for Skype channel
     * 
     */
    @InputImport(name="enableGroups")
      private final @Nullable Boolean enableGroups;

    public Optional<Boolean> getEnableGroups() {
        return this.enableGroups == null ? Optional.empty() : Optional.ofNullable(this.enableGroups);
    }

    /**
     * Enable media cards for Skype channel
     * 
     */
    @InputImport(name="enableMediaCards")
      private final @Nullable Boolean enableMediaCards;

    public Optional<Boolean> getEnableMediaCards() {
        return this.enableMediaCards == null ? Optional.empty() : Optional.ofNullable(this.enableMediaCards);
    }

    /**
     * Enable messaging for Skype channel
     * 
     */
    @InputImport(name="enableMessaging")
      private final @Nullable Boolean enableMessaging;

    public Optional<Boolean> getEnableMessaging() {
        return this.enableMessaging == null ? Optional.empty() : Optional.ofNullable(this.enableMessaging);
    }

    /**
     * Enable screen sharing for Skype channel
     * 
     */
    @InputImport(name="enableScreenSharing")
      private final @Nullable Boolean enableScreenSharing;

    public Optional<Boolean> getEnableScreenSharing() {
        return this.enableScreenSharing == null ? Optional.empty() : Optional.ofNullable(this.enableScreenSharing);
    }

    /**
     * Enable video for Skype channel
     * 
     */
    @InputImport(name="enableVideo")
      private final @Nullable Boolean enableVideo;

    public Optional<Boolean> getEnableVideo() {
        return this.enableVideo == null ? Optional.empty() : Optional.ofNullable(this.enableVideo);
    }

    /**
     * Group mode for Skype channel
     * 
     */
    @InputImport(name="groupsMode")
      private final @Nullable String groupsMode;

    public Optional<String> getGroupsMode() {
        return this.groupsMode == null ? Optional.empty() : Optional.ofNullable(this.groupsMode);
    }

    /**
     * Incoming call route for Skype channel
     * 
     */
    @InputImport(name="incomingCallRoute")
      private final @Nullable String incomingCallRoute;

    public Optional<String> getIncomingCallRoute() {
        return this.incomingCallRoute == null ? Optional.empty() : Optional.ofNullable(this.incomingCallRoute);
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public SkypeChannelPropertiesResponse(
        @Nullable String callingWebHook,
        @Nullable Boolean enableCalling,
        @Nullable Boolean enableGroups,
        @Nullable Boolean enableMediaCards,
        @Nullable Boolean enableMessaging,
        @Nullable Boolean enableScreenSharing,
        @Nullable Boolean enableVideo,
        @Nullable String groupsMode,
        @Nullable String incomingCallRoute,
        Boolean isEnabled) {
        this.callingWebHook = callingWebHook;
        this.enableCalling = enableCalling;
        this.enableGroups = enableGroups;
        this.enableMediaCards = enableMediaCards;
        this.enableMessaging = enableMessaging;
        this.enableScreenSharing = enableScreenSharing;
        this.enableVideo = enableVideo;
        this.groupsMode = groupsMode;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private SkypeChannelPropertiesResponse() {
        this.callingWebHook = null;
        this.enableCalling = null;
        this.enableGroups = null;
        this.enableMediaCards = null;
        this.enableMessaging = null;
        this.enableScreenSharing = null;
        this.enableVideo = null;
        this.groupsMode = null;
        this.incomingCallRoute = null;
        this.isEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkypeChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String callingWebHook;
        private @Nullable Boolean enableCalling;
        private @Nullable Boolean enableGroups;
        private @Nullable Boolean enableMediaCards;
        private @Nullable Boolean enableMessaging;
        private @Nullable Boolean enableScreenSharing;
        private @Nullable Boolean enableVideo;
        private @Nullable String groupsMode;
        private @Nullable String incomingCallRoute;
        private Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SkypeChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callingWebHook = defaults.callingWebHook;
    	      this.enableCalling = defaults.enableCalling;
    	      this.enableGroups = defaults.enableGroups;
    	      this.enableMediaCards = defaults.enableMediaCards;
    	      this.enableMessaging = defaults.enableMessaging;
    	      this.enableScreenSharing = defaults.enableScreenSharing;
    	      this.enableVideo = defaults.enableVideo;
    	      this.groupsMode = defaults.groupsMode;
    	      this.incomingCallRoute = defaults.incomingCallRoute;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setCallingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder setEnableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = enableCalling;
            return this;
        }

        public Builder setEnableGroups(@Nullable Boolean enableGroups) {
            this.enableGroups = enableGroups;
            return this;
        }

        public Builder setEnableMediaCards(@Nullable Boolean enableMediaCards) {
            this.enableMediaCards = enableMediaCards;
            return this;
        }

        public Builder setEnableMessaging(@Nullable Boolean enableMessaging) {
            this.enableMessaging = enableMessaging;
            return this;
        }

        public Builder setEnableScreenSharing(@Nullable Boolean enableScreenSharing) {
            this.enableScreenSharing = enableScreenSharing;
            return this;
        }

        public Builder setEnableVideo(@Nullable Boolean enableVideo) {
            this.enableVideo = enableVideo;
            return this;
        }

        public Builder setGroupsMode(@Nullable String groupsMode) {
            this.groupsMode = groupsMode;
            return this;
        }

        public Builder setIncomingCallRoute(@Nullable String incomingCallRoute) {
            this.incomingCallRoute = incomingCallRoute;
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public SkypeChannelPropertiesResponse build() {
            return new SkypeChannelPropertiesResponse(callingWebHook, enableCalling, enableGroups, enableMediaCards, enableMessaging, enableScreenSharing, enableVideo, groupsMode, incomingCallRoute, isEnabled);
        }
    }
}