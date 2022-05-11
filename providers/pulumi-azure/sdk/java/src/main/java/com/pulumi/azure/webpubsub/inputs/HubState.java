// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.webpubsub.inputs;

import com.pulumi.azure.webpubsub.inputs.HubEventHandlerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HubState extends com.pulumi.resources.ResourceArgs {

    public static final HubState Empty = new HubState();

    /**
     * Is anonymous connections are allowed for this hub? Defaults to `false`.
     * Possible values are `true`, `false`.
     * 
     */
    @Import(name="anonymousConnectionsEnabled")
    private @Nullable Output<Boolean> anonymousConnectionsEnabled;

    /**
     * @return Is anonymous connections are allowed for this hub? Defaults to `false`.
     * Possible values are `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> anonymousConnectionsEnabled() {
        return Optional.ofNullable(this.anonymousConnectionsEnabled);
    }

    /**
     * An `event_handler` block as defined below.
     * 
     */
    @Import(name="eventHandlers")
    private @Nullable Output<List<HubEventHandlerArgs>> eventHandlers;

    /**
     * @return An `event_handler` block as defined below.
     * 
     */
    public Optional<Output<List<HubEventHandlerArgs>>> eventHandlers() {
        return Optional.ofNullable(this.eventHandlers);
    }

    /**
     * The name of the Web Pubsub hub service. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Web Pubsub hub service. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify the id of the Web Pubsub. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="webPubsubId")
    private @Nullable Output<String> webPubsubId;

    /**
     * @return Specify the id of the Web Pubsub. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> webPubsubId() {
        return Optional.ofNullable(this.webPubsubId);
    }

    private HubState() {}

    private HubState(HubState $) {
        this.anonymousConnectionsEnabled = $.anonymousConnectionsEnabled;
        this.eventHandlers = $.eventHandlers;
        this.name = $.name;
        this.webPubsubId = $.webPubsubId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HubState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HubState $;

        public Builder() {
            $ = new HubState();
        }

        public Builder(HubState defaults) {
            $ = new HubState(Objects.requireNonNull(defaults));
        }

        /**
         * @param anonymousConnectionsEnabled Is anonymous connections are allowed for this hub? Defaults to `false`.
         * Possible values are `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder anonymousConnectionsEnabled(@Nullable Output<Boolean> anonymousConnectionsEnabled) {
            $.anonymousConnectionsEnabled = anonymousConnectionsEnabled;
            return this;
        }

        /**
         * @param anonymousConnectionsEnabled Is anonymous connections are allowed for this hub? Defaults to `false`.
         * Possible values are `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder anonymousConnectionsEnabled(Boolean anonymousConnectionsEnabled) {
            return anonymousConnectionsEnabled(Output.of(anonymousConnectionsEnabled));
        }

        /**
         * @param eventHandlers An `event_handler` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder eventHandlers(@Nullable Output<List<HubEventHandlerArgs>> eventHandlers) {
            $.eventHandlers = eventHandlers;
            return this;
        }

        /**
         * @param eventHandlers An `event_handler` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder eventHandlers(List<HubEventHandlerArgs> eventHandlers) {
            return eventHandlers(Output.of(eventHandlers));
        }

        /**
         * @param eventHandlers An `event_handler` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder eventHandlers(HubEventHandlerArgs... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }

        /**
         * @param name The name of the Web Pubsub hub service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Web Pubsub hub service. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param webPubsubId Specify the id of the Web Pubsub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubId(@Nullable Output<String> webPubsubId) {
            $.webPubsubId = webPubsubId;
            return this;
        }

        /**
         * @param webPubsubId Specify the id of the Web Pubsub. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder webPubsubId(String webPubsubId) {
            return webPubsubId(Output.of(webPubsubId));
        }

        public HubState build() {
            return $;
        }
    }

}
