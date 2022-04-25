// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.TerminateNotificationProfileResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledEventsProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScheduledEventsProfileResponse Empty = new ScheduledEventsProfileResponse();

    /**
     * Specifies Terminate Scheduled Event related configurations.
     * 
     */
    @Import(name="terminateNotificationProfile")
    private @Nullable TerminateNotificationProfileResponse terminateNotificationProfile;

    /**
     * @return Specifies Terminate Scheduled Event related configurations.
     * 
     */
    public Optional<TerminateNotificationProfileResponse> terminateNotificationProfile() {
        return Optional.ofNullable(this.terminateNotificationProfile);
    }

    private ScheduledEventsProfileResponse() {}

    private ScheduledEventsProfileResponse(ScheduledEventsProfileResponse $) {
        this.terminateNotificationProfile = $.terminateNotificationProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledEventsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledEventsProfileResponse $;

        public Builder() {
            $ = new ScheduledEventsProfileResponse();
        }

        public Builder(ScheduledEventsProfileResponse defaults) {
            $ = new ScheduledEventsProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param terminateNotificationProfile Specifies Terminate Scheduled Event related configurations.
         * 
         * @return builder
         * 
         */
        public Builder terminateNotificationProfile(@Nullable TerminateNotificationProfileResponse terminateNotificationProfile) {
            $.terminateNotificationProfile = terminateNotificationProfile;
            return this;
        }

        public ScheduledEventsProfileResponse build() {
            return $;
        }
    }

}
