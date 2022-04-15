// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionBasicAuthParameters extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionBasicAuthParameters Empty = new ConnectionBasicAuthParameters();

    @Import(name="password", required=true)
      private final String password;

    public String password() {
        return this.password;
    }

    @Import(name="username", required=true)
      private final String username;

    public String username() {
        return this.username;
    }

    public ConnectionBasicAuthParameters(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private ConnectionBasicAuthParameters() {
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionBasicAuthParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionBasicAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public ConnectionBasicAuthParameters build() {
            return new ConnectionBasicAuthParameters(password, username);
        }
    }
}
