// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.inputs.EventRequestMessageResponse;
import io.pulumi.azurenative.containerregistry.inputs.EventResponseMessageResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The event for a webhook.
 * 
 */
public final class EventResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventResponse Empty = new EventResponse();

    /**
     * The event request message sent to the service URI.
     * 
     */
    @InputImport(name="eventRequestMessage")
    private final @Nullable EventRequestMessageResponse eventRequestMessage;

    public Optional<EventRequestMessageResponse> getEventRequestMessage() {
        return this.eventRequestMessage == null ? Optional.empty() : Optional.ofNullable(this.eventRequestMessage);
    }

    /**
     * The event response message received from the service URI.
     * 
     */
    @InputImport(name="eventResponseMessage")
    private final @Nullable EventResponseMessageResponse eventResponseMessage;

    public Optional<EventResponseMessageResponse> getEventResponseMessage() {
        return this.eventResponseMessage == null ? Optional.empty() : Optional.ofNullable(this.eventResponseMessage);
    }

    /**
     * The event ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public EventResponse(
        @Nullable EventRequestMessageResponse eventRequestMessage,
        @Nullable EventResponseMessageResponse eventResponseMessage,
        @Nullable String id) {
        this.eventRequestMessage = eventRequestMessage;
        this.eventResponseMessage = eventResponseMessage;
        this.id = id;
    }

    private EventResponse() {
        this.eventRequestMessage = null;
        this.eventResponseMessage = null;
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventRequestMessageResponse eventRequestMessage;
        private @Nullable EventResponseMessageResponse eventResponseMessage;
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventRequestMessage = defaults.eventRequestMessage;
    	      this.eventResponseMessage = defaults.eventResponseMessage;
    	      this.id = defaults.id;
        }

        public Builder setEventRequestMessage(@Nullable EventRequestMessageResponse eventRequestMessage) {
            this.eventRequestMessage = eventRequestMessage;
            return this;
        }

        public Builder setEventResponseMessage(@Nullable EventResponseMessageResponse eventResponseMessage) {
            this.eventResponseMessage = eventResponseMessage;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public EventResponse build() {
            return new EventResponse(eventRequestMessage, eventResponseMessage, id);
        }
    }
}
