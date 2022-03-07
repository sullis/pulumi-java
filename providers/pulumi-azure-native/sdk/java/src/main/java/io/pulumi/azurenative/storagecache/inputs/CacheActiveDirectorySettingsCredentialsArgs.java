// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Active Directory admin credentials used to join the HPC Cache to a domain.
 * 
 */
public final class CacheActiveDirectorySettingsCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CacheActiveDirectorySettingsCredentialsArgs Empty = new CacheActiveDirectorySettingsCredentialsArgs();

    /**
     * Plain text password of the Active Directory domain administrator. This value is stored encrypted and not returned on response.
     * 
     */
    @InputImport(name="password", required=true)
      private final Input<String> password;

    public Input<String> getPassword() {
        return this.password;
    }

    /**
     * Username of the Active Directory domain administrator. This value is stored encrypted and not returned on response.
     * 
     */
    @InputImport(name="username", required=true)
      private final Input<String> username;

    public Input<String> getUsername() {
        return this.username;
    }

    public CacheActiveDirectorySettingsCredentialsArgs(
        Input<String> password,
        Input<String> username) {
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.username = Objects.requireNonNull(username, "expected parameter 'username' to be non-null");
    }

    private CacheActiveDirectorySettingsCredentialsArgs() {
        this.password = Input.empty();
        this.username = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheActiveDirectorySettingsCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> password;
        private Input<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheActiveDirectorySettingsCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(Input<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Input.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder setUsername(Input<String> username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Input.of(Objects.requireNonNull(username));
            return this;
        }
        public CacheActiveDirectorySettingsCredentialsArgs build() {
            return new CacheActiveDirectorySettingsCredentialsArgs(password, username);
        }
    }
}