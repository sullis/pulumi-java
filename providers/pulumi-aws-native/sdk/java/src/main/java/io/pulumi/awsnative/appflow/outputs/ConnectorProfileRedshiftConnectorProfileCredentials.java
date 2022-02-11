// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileRedshiftConnectorProfileCredentials {
    private final String password;
    private final String username;

    @OutputCustomType.Constructor({"password","username"})
    private ConnectorProfileRedshiftConnectorProfileCredentials(
        String password,
        String username) {
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileRedshiftConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileRedshiftConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public ConnectorProfileRedshiftConnectorProfileCredentials build() {
            return new ConnectorProfileRedshiftConnectorProfileCredentials(password, username);
        }
    }
}
