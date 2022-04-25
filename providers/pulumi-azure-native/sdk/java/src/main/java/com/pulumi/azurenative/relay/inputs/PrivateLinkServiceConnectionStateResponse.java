// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An object that represents the approval state of the private link connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionStateResponse Empty = new PrivateLinkServiceConnectionStateResponse();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionRequired")
    private @Nullable String actionRequired;

    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<String> actionRequired() {
        return Optional.ofNullable(this.actionRequired);
    }

    /**
     * The reason for approval or rejection.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The reason for approval or rejection.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicates whether the connection has been approved, rejected or removed by the Relay Namespace owner.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return Indicates whether the connection has been approved, rejected or removed by the Relay Namespace owner.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateLinkServiceConnectionStateResponse() {}

    private PrivateLinkServiceConnectionStateResponse(PrivateLinkServiceConnectionStateResponse $) {
        this.actionRequired = $.actionRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateResponse $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateResponse();
        }

        public Builder(PrivateLinkServiceConnectionStateResponse defaults) {
            $ = new PrivateLinkServiceConnectionStateResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionRequired(@Nullable String actionRequired) {
            $.actionRequired = actionRequired;
            return this;
        }

        /**
         * @param description The reason for approval or rejection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param status Indicates whether the connection has been approved, rejected or removed by the Relay Namespace owner.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public PrivateLinkServiceConnectionStateResponse build() {
            return $;
        }
    }

}
