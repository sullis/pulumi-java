// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigGetArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigGetArgs;
import com.pulumi.aws.appsync.inputs.GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderGetArgs Empty = new GraphQLApiAdditionalAuthenticationProviderGetArgs();

    /**
     * The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    @Import(name="authenticationType", required=true)
    private Output<String> authenticationType;

    /**
     * @return The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    @Import(name="lambdaAuthorizerConfig")
    private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig;

    /**
     * @return Nested argument containing Lambda authorizer configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigGetArgs>> lambdaAuthorizerConfig() {
        return Optional.ofNullable(this.lambdaAuthorizerConfig);
    }

    /**
     * Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    @Import(name="openidConnectConfig")
    private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigGetArgs> openidConnectConfig;

    /**
     * @return Nested argument containing OpenID Connect configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigGetArgs>> openidConnectConfig() {
        return Optional.ofNullable(this.openidConnectConfig);
    }

    /**
     * The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    @Import(name="userPoolConfig")
    private @Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs> userPoolConfig;

    /**
     * @return The Amazon Cognito User Pool configuration. Defined below.
     * 
     */
    public Optional<Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs>> userPoolConfig() {
        return Optional.ofNullable(this.userPoolConfig);
    }

    private GraphQLApiAdditionalAuthenticationProviderGetArgs() {}

    private GraphQLApiAdditionalAuthenticationProviderGetArgs(GraphQLApiAdditionalAuthenticationProviderGetArgs $) {
        this.authenticationType = $.authenticationType;
        this.lambdaAuthorizerConfig = $.lambdaAuthorizerConfig;
        this.openidConnectConfig = $.openidConnectConfig;
        this.userPoolConfig = $.userPoolConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiAdditionalAuthenticationProviderGetArgs $;

        public Builder() {
            $ = new GraphQLApiAdditionalAuthenticationProviderGetArgs();
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderGetArgs defaults) {
            $ = new GraphQLApiAdditionalAuthenticationProviderGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authenticationType The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(Output<String> authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        /**
         * @param authenticationType The authentication type. Valid values: `API_KEY`, `AWS_IAM`, `AMAZON_COGNITO_USER_POOLS`, `OPENID_CONNECT`, `AWS_LAMBDA`
         * 
         * @return builder
         * 
         */
        public Builder authenticationType(String authenticationType) {
            return authenticationType(Output.of(authenticationType));
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigGetArgs> lambdaAuthorizerConfig) {
            $.lambdaAuthorizerConfig = lambdaAuthorizerConfig;
            return this;
        }

        /**
         * @param lambdaAuthorizerConfig Nested argument containing Lambda authorizer configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder lambdaAuthorizerConfig(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigGetArgs lambdaAuthorizerConfig) {
            return lambdaAuthorizerConfig(Output.of(lambdaAuthorizerConfig));
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigGetArgs> openidConnectConfig) {
            $.openidConnectConfig = openidConnectConfig;
            return this;
        }

        /**
         * @param openidConnectConfig Nested argument containing OpenID Connect configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder openidConnectConfig(GraphQLApiAdditionalAuthenticationProviderOpenidConnectConfigGetArgs openidConnectConfig) {
            return openidConnectConfig(Output.of(openidConnectConfig));
        }

        /**
         * @param userPoolConfig The Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(@Nullable Output<GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs> userPoolConfig) {
            $.userPoolConfig = userPoolConfig;
            return this;
        }

        /**
         * @param userPoolConfig The Amazon Cognito User Pool configuration. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder userPoolConfig(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigGetArgs userPoolConfig) {
            return userPoolConfig(Output.of(userPoolConfig));
        }

        public GraphQLApiAdditionalAuthenticationProviderGetArgs build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            return $;
        }
    }

}
