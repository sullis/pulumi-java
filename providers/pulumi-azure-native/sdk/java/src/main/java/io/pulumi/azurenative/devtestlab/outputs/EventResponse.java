// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventResponse {
    /**
     * The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    private final @Nullable String eventName;

    @OutputCustomType.Constructor({"eventName"})
    private EventResponse(@Nullable String eventName) {
        this.eventName = eventName;
    }

    /**
     * The event type for which this notification is enabled (i.e. AutoShutdown, Cost)
     * 
     */
    public Optional<String> getEventName() {
        return Optional.ofNullable(this.eventName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventName = defaults.eventName;
        }

        public Builder setEventName(@Nullable String eventName) {
            this.eventName = eventName;
            return this;
        }

        public EventResponse build() {
            return new EventResponse(eventName);
        }
    }
}
