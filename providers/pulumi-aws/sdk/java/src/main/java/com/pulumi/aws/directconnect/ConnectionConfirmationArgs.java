// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionConfirmationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionConfirmationArgs Empty = new ConnectionConfirmationArgs();

    /**
     * The ID of the hosted connection.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return The ID of the hosted connection.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    private ConnectionConfirmationArgs() {}

    private ConnectionConfirmationArgs(ConnectionConfirmationArgs $) {
        this.connectionId = $.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionConfirmationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionConfirmationArgs $;

        public Builder() {
            $ = new ConnectionConfirmationArgs();
        }

        public Builder(ConnectionConfirmationArgs defaults) {
            $ = new ConnectionConfirmationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId The ID of the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        public ConnectionConfirmationArgs build() {
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            return $;
        }
    }

}
