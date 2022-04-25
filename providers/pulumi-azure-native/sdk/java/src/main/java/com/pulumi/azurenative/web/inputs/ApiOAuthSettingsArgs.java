// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.ApiOAuthSettingsParameterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * OAuth settings for the connection provider
 * 
 */
public final class ApiOAuthSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOAuthSettingsArgs Empty = new ApiOAuthSettingsArgs();

    /**
     * Resource provider client id
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Resource provider client id
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Client Secret needed for OAuth
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return Client Secret needed for OAuth
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * OAuth parameters key is the name of parameter
     * 
     */
    @Import(name="customParameters")
    private @Nullable Output<Map<String,ApiOAuthSettingsParameterArgs>> customParameters;

    /**
     * @return OAuth parameters key is the name of parameter
     * 
     */
    public Optional<Output<Map<String,ApiOAuthSettingsParameterArgs>>> customParameters() {
        return Optional.ofNullable(this.customParameters);
    }

    /**
     * Identity provider
     * 
     */
    @Import(name="identityProvider")
    private @Nullable Output<String> identityProvider;

    /**
     * @return Identity provider
     * 
     */
    public Optional<Output<String>> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }

    /**
     * Read only properties for this oauth setting.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Object> properties;

    /**
     * @return Read only properties for this oauth setting.
     * 
     */
    public Optional<Output<Object>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Url
     * 
     */
    @Import(name="redirectUrl")
    private @Nullable Output<String> redirectUrl;

    /**
     * @return Url
     * 
     */
    public Optional<Output<String>> redirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }

    /**
     * OAuth scopes
     * 
     */
    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    /**
     * @return OAuth scopes
     * 
     */
    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    private ApiOAuthSettingsArgs() {}

    private ApiOAuthSettingsArgs(ApiOAuthSettingsArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.customParameters = $.customParameters;
        this.identityProvider = $.identityProvider;
        this.properties = $.properties;
        this.redirectUrl = $.redirectUrl;
        this.scopes = $.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOAuthSettingsArgs $;

        public Builder() {
            $ = new ApiOAuthSettingsArgs();
        }

        public Builder(ApiOAuthSettingsArgs defaults) {
            $ = new ApiOAuthSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Resource provider client id
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Resource provider client id
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client Secret needed for OAuth
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client Secret needed for OAuth
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param customParameters OAuth parameters key is the name of parameter
         * 
         * @return builder
         * 
         */
        public Builder customParameters(@Nullable Output<Map<String,ApiOAuthSettingsParameterArgs>> customParameters) {
            $.customParameters = customParameters;
            return this;
        }

        /**
         * @param customParameters OAuth parameters key is the name of parameter
         * 
         * @return builder
         * 
         */
        public Builder customParameters(Map<String,ApiOAuthSettingsParameterArgs> customParameters) {
            return customParameters(Output.of(customParameters));
        }

        /**
         * @param identityProvider Identity provider
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(@Nullable Output<String> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider Identity provider
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(String identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        /**
         * @param properties Read only properties for this oauth setting.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Object> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Read only properties for this oauth setting.
         * 
         * @return builder
         * 
         */
        public Builder properties(Object properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param redirectUrl Url
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * @param redirectUrl Url
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        /**
         * @param scopes OAuth scopes
         * 
         * @return builder
         * 
         */
        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        /**
         * @param scopes OAuth scopes
         * 
         * @return builder
         * 
         */
        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        /**
         * @param scopes OAuth scopes
         * 
         * @return builder
         * 
         */
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public ApiOAuthSettingsArgs build() {
            return $;
        }
    }

}
