// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs Empty = new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs();

    /**
     * The number of seconds a response should be cached for. The default is 5 minutes (300 seconds). The Lambda function can override this by returning a `ttlOverride` key in its response. A value of 0 disables caching of responses. Minimum value of 0. Maximum value of 3600.
     * 
     */
    @Import(name="authorizerResultTtlInSeconds")
      private final @Nullable Output<Integer> authorizerResultTtlInSeconds;

    public Output<Integer> authorizerResultTtlInSeconds() {
        return this.authorizerResultTtlInSeconds == null ? Codegen.empty() : this.authorizerResultTtlInSeconds;
    }

    /**
     * The ARN of the Lambda function to be called for authorization. Note: This Lambda function must have a resource-based policy assigned to it, to allow `lambda:InvokeFunction` from service principal `appsync.amazonaws.com`.
     * 
     */
    @Import(name="authorizerUri", required=true)
      private final Output<String> authorizerUri;

    public Output<String> authorizerUri() {
        return this.authorizerUri;
    }

    /**
     * A regular expression for validation of tokens before the Lambda function is called.
     * 
     */
    @Import(name="identityValidationExpression")
      private final @Nullable Output<String> identityValidationExpression;

    public Output<String> identityValidationExpression() {
        return this.identityValidationExpression == null ? Codegen.empty() : this.identityValidationExpression;
    }

    public GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs(
        @Nullable Output<Integer> authorizerResultTtlInSeconds,
        Output<String> authorizerUri,
        @Nullable Output<String> identityValidationExpression) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        this.authorizerUri = Objects.requireNonNull(authorizerUri, "expected parameter 'authorizerUri' to be non-null");
        this.identityValidationExpression = identityValidationExpression;
    }

    private GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs() {
        this.authorizerResultTtlInSeconds = Codegen.empty();
        this.authorizerUri = Codegen.empty();
        this.identityValidationExpression = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> authorizerResultTtlInSeconds;
        private Output<String> authorizerUri;
        private @Nullable Output<String> identityValidationExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizerResultTtlInSeconds = defaults.authorizerResultTtlInSeconds;
    	      this.authorizerUri = defaults.authorizerUri;
    	      this.identityValidationExpression = defaults.identityValidationExpression;
        }

        public Builder authorizerResultTtlInSeconds(@Nullable Output<Integer> authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
            return this;
        }
        public Builder authorizerResultTtlInSeconds(@Nullable Integer authorizerResultTtlInSeconds) {
            this.authorizerResultTtlInSeconds = Codegen.ofNullable(authorizerResultTtlInSeconds);
            return this;
        }
        public Builder authorizerUri(Output<String> authorizerUri) {
            this.authorizerUri = Objects.requireNonNull(authorizerUri);
            return this;
        }
        public Builder authorizerUri(String authorizerUri) {
            this.authorizerUri = Output.of(Objects.requireNonNull(authorizerUri));
            return this;
        }
        public Builder identityValidationExpression(@Nullable Output<String> identityValidationExpression) {
            this.identityValidationExpression = identityValidationExpression;
            return this;
        }
        public Builder identityValidationExpression(@Nullable String identityValidationExpression) {
            this.identityValidationExpression = Codegen.ofNullable(identityValidationExpression);
            return this;
        }        public GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs build() {
            return new GraphQLApiAdditionalAuthenticationProviderLambdaAuthorizerConfigArgs(authorizerResultTtlInSeconds, authorizerUri, identityValidationExpression);
        }
    }
}
