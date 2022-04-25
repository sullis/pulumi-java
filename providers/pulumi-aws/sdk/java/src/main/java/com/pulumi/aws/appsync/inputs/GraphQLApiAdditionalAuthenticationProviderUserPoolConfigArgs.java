// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs Empty = new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs();

    /**
     * A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     * 
     */
    @Import(name="appIdClientRegex")
    private @Nullable Output<String> appIdClientRegex;

    /**
     * @return A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
     * 
     */
    public Optional<Output<String>> appIdClientRegex() {
        return Optional.ofNullable(this.appIdClientRegex);
    }

    /**
     * The AWS region in which the user pool was created.
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return The AWS region in which the user pool was created.
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    /**
     * The user pool ID.
     * 
     */
    @Import(name="userPoolId", required=true)
    private Output<String> userPoolId;

    /**
     * @return The user pool ID.
     * 
     */
    public Output<String> userPoolId() {
        return this.userPoolId;
    }

    private GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs() {}

    private GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs $) {
        this.appIdClientRegex = $.appIdClientRegex;
        this.awsRegion = $.awsRegion;
        this.userPoolId = $.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs $;

        public Builder() {
            $ = new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs();
        }

        public Builder(GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs defaults) {
            $ = new GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
         * 
         * @return builder
         * 
         */
        public Builder appIdClientRegex(@Nullable Output<String> appIdClientRegex) {
            $.appIdClientRegex = appIdClientRegex;
            return this;
        }

        /**
         * @param appIdClientRegex A regular expression for validating the incoming Amazon Cognito User Pool app client ID.
         * 
         * @return builder
         * 
         */
        public Builder appIdClientRegex(String appIdClientRegex) {
            return appIdClientRegex(Output.of(appIdClientRegex));
        }

        /**
         * @param awsRegion The AWS region in which the user pool was created.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion The AWS region in which the user pool was created.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param userPoolId The user pool ID.
         * 
         * @return builder
         * 
         */
        public Builder userPoolId(Output<String> userPoolId) {
            $.userPoolId = userPoolId;
            return this;
        }

        /**
         * @param userPoolId The user pool ID.
         * 
         * @return builder
         * 
         */
        public Builder userPoolId(String userPoolId) {
            return userPoolId(Output.of(userPoolId));
        }

        public GraphQLApiAdditionalAuthenticationProviderUserPoolConfigArgs build() {
            $.userPoolId = Objects.requireNonNull($.userPoolId, "expected parameter 'userPoolId' to be non-null");
            return $;
        }
    }

}
