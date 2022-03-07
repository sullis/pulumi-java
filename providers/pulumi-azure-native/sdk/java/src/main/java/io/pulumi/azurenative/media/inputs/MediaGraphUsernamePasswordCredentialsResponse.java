// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Username/password credential pair.
 * 
 */
public final class MediaGraphUsernamePasswordCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final MediaGraphUsernamePasswordCredentialsResponse Empty = new MediaGraphUsernamePasswordCredentialsResponse();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.MediaGraphUsernamePasswordCredentials'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * Password for a username/password pair.
     * 
     */
    @InputImport(name="password", required=true)
      private final String password;

    public String getPassword() {
        return this.password;
    }

    /**
     * Username for a username/password pair.
     * 
     */
    @InputImport(name="username", required=true)
      private final String username;

    public String getUsername() {
        return this.username;
    }

    public MediaGraphUsernamePasswordCredentialsResponse(
        String odataType,
        String password,
        String username) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private MediaGraphUsernamePasswordCredentialsResponse() {
        this.odataType = null;
        this.password = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaGraphUsernamePasswordCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaGraphUsernamePasswordCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public MediaGraphUsernamePasswordCredentialsResponse build() {
            return new MediaGraphUsernamePasswordCredentialsResponse(odataType, password, username);
        }
    }
}