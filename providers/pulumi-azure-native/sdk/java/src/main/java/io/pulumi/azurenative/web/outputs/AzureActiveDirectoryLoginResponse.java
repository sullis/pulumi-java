// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureActiveDirectoryLoginResponse {
    /**
     * <code>true</code> if the www-authenticate provider should be omitted from the request; otherwise, <code>false</code>.
     * 
     */
    private final @Nullable Boolean disableWWWAuthenticate;
    /**
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
     */
    private final @Nullable List<String> loginParameters;

    @OutputCustomType.Constructor({"disableWWWAuthenticate","loginParameters"})
    private AzureActiveDirectoryLoginResponse(
        @Nullable Boolean disableWWWAuthenticate,
        @Nullable List<String> loginParameters) {
        this.disableWWWAuthenticate = disableWWWAuthenticate;
        this.loginParameters = loginParameters;
    }

    /**
     * <code>true</code> if the www-authenticate provider should be omitted from the request; otherwise, <code>false</code>.
     * 
    */
    public Optional<Boolean> getDisableWWWAuthenticate() {
        return Optional.ofNullable(this.disableWWWAuthenticate);
    }
    /**
     * Login parameters to send to the OpenID Connect authorization endpoint when
     * a user logs in. Each parameter must be in the form "key=value".
     * 
    */
    public List<String> getLoginParameters() {
        return this.loginParameters == null ? List.of() : this.loginParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryLoginResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableWWWAuthenticate;
        private @Nullable List<String> loginParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryLoginResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableWWWAuthenticate = defaults.disableWWWAuthenticate;
    	      this.loginParameters = defaults.loginParameters;
        }

        public Builder setDisableWWWAuthenticate(@Nullable Boolean disableWWWAuthenticate) {
            this.disableWWWAuthenticate = disableWWWAuthenticate;
            return this;
        }

        public Builder setLoginParameters(@Nullable List<String> loginParameters) {
            this.loginParameters = loginParameters;
            return this;
        }
        public AzureActiveDirectoryLoginResponse build() {
            return new AzureActiveDirectoryLoginResponse(disableWWWAuthenticate, loginParameters);
        }
    }
}