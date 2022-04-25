// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.ActionsRequired;
import com.pulumi.azurenative.containerregistry.enums.ConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The state of a private link service connection.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<Either<String,ActionsRequired>> actionsRequired;

    /**
     * @return A message indicating if changes on the service provider require any updates on the consumer.
     * 
     */
    public Optional<Output<Either<String,ActionsRequired>>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The description for connection status. For example if connection is rejected it can indicate reason for rejection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for connection status. For example if connection is rejected it can indicate reason for rejection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,ConnectionStatus>> status;

    /**
     * @return The private link service connection status.
     * 
     */
    public Optional<Output<Either<String,ConnectionStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateArgs();
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
            $ = new PrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(@Nullable Output<Either<String,ActionsRequired>> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(Either<String,ActionsRequired> actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Either.ofLeft(actionsRequired));
        }

        /**
         * @param actionsRequired A message indicating if changes on the service provider require any updates on the consumer.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(ActionsRequired actionsRequired) {
            return actionsRequired(Either.ofRight(actionsRequired));
        }

        /**
         * @param description The description for connection status. For example if connection is rejected it can indicate reason for rejection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for connection status. For example if connection is rejected it can indicate reason for rejection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status The private link service connection status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,ConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The private link service connection status.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,ConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The private link service connection status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The private link service connection status.
         * 
         * @return builder
         * 
         */
        public Builder status(ConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            return $;
        }
    }

}
