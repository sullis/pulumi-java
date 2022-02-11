// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ConnectionClientParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionClientParametersArgs Empty = new ConnectionClientParametersArgs();

    @InputImport(name="clientID", required=true)
    private final Input<String> clientID;

    public Input<String> getClientID() {
        return this.clientID;
    }

    @InputImport(name="clientSecret", required=true)
    private final Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret;
    }

    public ConnectionClientParametersArgs(
        Input<String> clientID,
        Input<String> clientSecret) {
        this.clientID = Objects.requireNonNull(clientID, "expected parameter 'clientID' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
    }

    private ConnectionClientParametersArgs() {
        this.clientID = Input.empty();
        this.clientSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionClientParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientID;
        private Input<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionClientParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientID = defaults.clientID;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setClientID(Input<String> clientID) {
            this.clientID = Objects.requireNonNull(clientID);
            return this;
        }

        public Builder setClientID(String clientID) {
            this.clientID = Input.of(Objects.requireNonNull(clientID));
            return this;
        }

        public Builder setClientSecret(Input<String> clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Input.of(Objects.requireNonNull(clientSecret));
            return this;
        }

        public ConnectionClientParametersArgs build() {
            return new ConnectionClientParametersArgs(clientID, clientSecret);
        }
    }
}
