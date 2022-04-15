// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersApiKey;
import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersBasic;
import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersInvocationHttpParameters;
import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersOauth;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventConnectionAuthParameters {
    /**
     * Parameters used for API_KEY authorization. An API key to include in the header for each authentication request. A maximum of 1 are allowed. Conflicts with `basic` and `oauth`. Documented below.
     * 
     */
    private final @Nullable EventConnectionAuthParametersApiKey apiKey;
    /**
     * Parameters used for BASIC authorization. A maximum of 1 are allowed. Conflicts with `api_key` and `oauth`. Documented below.
     * 
     */
    private final @Nullable EventConnectionAuthParametersBasic basic;
    /**
     * Invocation Http Parameters are additional credentials used to sign each Invocation of the ApiDestination created from this Connection. If the ApiDestination Rule Target has additional HttpParameters, the values will be merged together, with the Connection Invocation Http Parameters taking precedence. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
     */
    private final @Nullable EventConnectionAuthParametersInvocationHttpParameters invocationHttpParameters;
    /**
     * Parameters used for OAUTH_CLIENT_CREDENTIALS authorization. A maximum of 1 are allowed. Conflicts with `basic` and `api_key`. Documented below.
     * 
     */
    private final @Nullable EventConnectionAuthParametersOauth oauth;

    @CustomType.Constructor
    private EventConnectionAuthParameters(
        @CustomType.Parameter("apiKey") @Nullable EventConnectionAuthParametersApiKey apiKey,
        @CustomType.Parameter("basic") @Nullable EventConnectionAuthParametersBasic basic,
        @CustomType.Parameter("invocationHttpParameters") @Nullable EventConnectionAuthParametersInvocationHttpParameters invocationHttpParameters,
        @CustomType.Parameter("oauth") @Nullable EventConnectionAuthParametersOauth oauth) {
        this.apiKey = apiKey;
        this.basic = basic;
        this.invocationHttpParameters = invocationHttpParameters;
        this.oauth = oauth;
    }

    /**
     * Parameters used for API_KEY authorization. An API key to include in the header for each authentication request. A maximum of 1 are allowed. Conflicts with `basic` and `oauth`. Documented below.
     * 
    */
    public Optional<EventConnectionAuthParametersApiKey> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * Parameters used for BASIC authorization. A maximum of 1 are allowed. Conflicts with `api_key` and `oauth`. Documented below.
     * 
    */
    public Optional<EventConnectionAuthParametersBasic> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * Invocation Http Parameters are additional credentials used to sign each Invocation of the ApiDestination created from this Connection. If the ApiDestination Rule Target has additional HttpParameters, the values will be merged together, with the Connection Invocation Http Parameters taking precedence. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
    */
    public Optional<EventConnectionAuthParametersInvocationHttpParameters> invocationHttpParameters() {
        return Optional.ofNullable(this.invocationHttpParameters);
    }
    /**
     * Parameters used for OAUTH_CLIENT_CREDENTIALS authorization. A maximum of 1 are allowed. Conflicts with `basic` and `api_key`. Documented below.
     * 
    */
    public Optional<EventConnectionAuthParametersOauth> oauth() {
        return Optional.ofNullable(this.oauth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventConnectionAuthParametersApiKey apiKey;
        private @Nullable EventConnectionAuthParametersBasic basic;
        private @Nullable EventConnectionAuthParametersInvocationHttpParameters invocationHttpParameters;
        private @Nullable EventConnectionAuthParametersOauth oauth;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.basic = defaults.basic;
    	      this.invocationHttpParameters = defaults.invocationHttpParameters;
    	      this.oauth = defaults.oauth;
        }

        public Builder apiKey(@Nullable EventConnectionAuthParametersApiKey apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public Builder basic(@Nullable EventConnectionAuthParametersBasic basic) {
            this.basic = basic;
            return this;
        }
        public Builder invocationHttpParameters(@Nullable EventConnectionAuthParametersInvocationHttpParameters invocationHttpParameters) {
            this.invocationHttpParameters = invocationHttpParameters;
            return this;
        }
        public Builder oauth(@Nullable EventConnectionAuthParametersOauth oauth) {
            this.oauth = oauth;
            return this;
        }        public EventConnectionAuthParameters build() {
            return new EventConnectionAuthParameters(apiKey, basic, invocationHttpParameters, oauth);
        }
    }
}
