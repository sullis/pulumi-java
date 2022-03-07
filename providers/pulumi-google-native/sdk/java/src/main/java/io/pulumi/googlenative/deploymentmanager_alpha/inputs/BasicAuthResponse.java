// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Basic Auth used as a credential.
 * 
 */
public final class BasicAuthResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicAuthResponse Empty = new BasicAuthResponse();

    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    @InputImport(name="user", required=true)
      private final String user;

    public String getUser() {
        return this.user;
    }

    public BasicAuthResponse(
        String password,
        String user) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private BasicAuthResponse() {
        this.password = null;
        this.user = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicAuthResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String user;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicAuthResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.user = defaults.user;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUser(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }
        public BasicAuthResponse build() {
            return new BasicAuthResponse(password, user);
        }
    }
}