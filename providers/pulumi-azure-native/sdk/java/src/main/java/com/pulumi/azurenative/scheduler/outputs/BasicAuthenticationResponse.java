// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BasicAuthenticationResponse {
    /**
     * @return Gets or sets the password, return value will always be empty.
     * 
     */
    private final @Nullable String password;
    /**
     * @return Gets or sets the HTTP authentication type.
     * Expected value is &#39;Basic&#39;.
     * 
     */
    private final String type;
    /**
     * @return Gets or sets the username.
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private BasicAuthenticationResponse(
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("username") @Nullable String username) {
        this.password = password;
        this.type = type;
        this.username = username;
    }

    /**
     * @return Gets or sets the password, return value will always be empty.
     * 
     */
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    /**
     * @return Gets or sets the HTTP authentication type.
     * Expected value is &#39;Basic&#39;.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Gets or sets the username.
     * 
     */
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String type;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.type = defaults.type;
    	      this.username = defaults.username;
        }

        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public BasicAuthenticationResponse build() {
            return new BasicAuthenticationResponse(password, type, username);
        }
    }
}
