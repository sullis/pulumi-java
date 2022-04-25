// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileSnowflakeConnectorProfileCredentials {
    /**
     * @return The password that corresponds to the username.
     * 
     */
    private final String password;
    /**
     * @return The name of the user.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private ConnectorProfileSnowflakeConnectorProfileCredentials(
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * @return The password that corresponds to the username.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The name of the user.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSnowflakeConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSnowflakeConnectorProfileCredentials defaults) {
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
        }        public ConnectorProfileSnowflakeConnectorProfileCredentials build() {
            return new ConnectorProfileSnowflakeConnectorProfileCredentials(password, username);
        }
    }
}
