// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendProxyContractResponse {
    /**
     * Password to connect to the WebProxy Server
     * 
     */
    private final @Nullable String password;
    /**
     * WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     * 
     */
    private final String url;
    /**
     * Username to connect to the WebProxy server
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"password","url","username"})
    private BackendProxyContractResponse(
        @Nullable String password,
        String url,
        @Nullable String username) {
        this.password = password;
        this.url = Objects.requireNonNull(url);
        this.username = username;
    }

    /**
     * Password to connect to the WebProxy Server
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * WebProxy Server AbsoluteUri property which includes the entire URI stored in the Uri instance, including all fragments and query strings.
     * 
    */
    public String getUrl() {
        return this.url;
    }
    /**
     * Username to connect to the WebProxy server
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendProxyContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private String url;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendProxyContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public BackendProxyContractResponse build() {
            return new BackendProxyContractResponse(password, url, username);
        }
    }
}