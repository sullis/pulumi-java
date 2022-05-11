// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiOpenidAuthentication {
    /**
     * @return How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
     * 
     */
    private final @Nullable List<String> bearerTokenSendingMethods;
    /**
     * @return OpenID Connect provider identifier. The name of an OpenID Connect Provider.
     * 
     */
    private final String openidProviderName;

    @CustomType.Constructor
    private ApiOpenidAuthentication(
        @CustomType.Parameter("bearerTokenSendingMethods") @Nullable List<String> bearerTokenSendingMethods,
        @CustomType.Parameter("openidProviderName") String openidProviderName) {
        this.bearerTokenSendingMethods = bearerTokenSendingMethods;
        this.openidProviderName = openidProviderName;
    }

    /**
     * @return How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
     * 
     */
    public List<String> bearerTokenSendingMethods() {
        return this.bearerTokenSendingMethods == null ? List.of() : this.bearerTokenSendingMethods;
    }
    /**
     * @return OpenID Connect provider identifier. The name of an OpenID Connect Provider.
     * 
     */
    public String openidProviderName() {
        return this.openidProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOpenidAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> bearerTokenSendingMethods;
        private String openidProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOpenidAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bearerTokenSendingMethods = defaults.bearerTokenSendingMethods;
    	      this.openidProviderName = defaults.openidProviderName;
        }

        public Builder bearerTokenSendingMethods(@Nullable List<String> bearerTokenSendingMethods) {
            this.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }
        public Builder bearerTokenSendingMethods(String... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }
        public Builder openidProviderName(String openidProviderName) {
            this.openidProviderName = Objects.requireNonNull(openidProviderName);
            return this;
        }        public ApiOpenidAuthentication build() {
            return new ApiOpenidAuthentication(bearerTokenSendingMethods, openidProviderName);
        }
    }
}
