// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appsync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GraphQLApiUserPoolConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GraphQLApiUserPoolConfigArgs Empty = new GraphQLApiUserPoolConfigArgs();

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
     * The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn&#39;t match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
     * 
     */
    @Import(name="defaultAction", required=true)
    private Output<String> defaultAction;

    /**
     * @return The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn&#39;t match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
     * 
     */
    public Output<String> defaultAction() {
        return this.defaultAction;
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

    private GraphQLApiUserPoolConfigArgs() {}

    private GraphQLApiUserPoolConfigArgs(GraphQLApiUserPoolConfigArgs $) {
        this.appIdClientRegex = $.appIdClientRegex;
        this.awsRegion = $.awsRegion;
        this.defaultAction = $.defaultAction;
        this.userPoolId = $.userPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GraphQLApiUserPoolConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GraphQLApiUserPoolConfigArgs $;

        public Builder() {
            $ = new GraphQLApiUserPoolConfigArgs();
        }

        public Builder(GraphQLApiUserPoolConfigArgs defaults) {
            $ = new GraphQLApiUserPoolConfigArgs(Objects.requireNonNull(defaults));
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
         * @param defaultAction The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn&#39;t match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(Output<String> defaultAction) {
            $.defaultAction = defaultAction;
            return this;
        }

        /**
         * @param defaultAction The action that you want your GraphQL API to take when a request that uses Amazon Cognito User Pool authentication doesn&#39;t match the Amazon Cognito User Pool configuration. Valid: `ALLOW` and `DENY`
         * 
         * @return builder
         * 
         */
        public Builder defaultAction(String defaultAction) {
            return defaultAction(Output.of(defaultAction));
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

        public GraphQLApiUserPoolConfigArgs build() {
            $.defaultAction = Objects.requireNonNull($.defaultAction, "expected parameter 'defaultAction' to be non-null");
            $.userPoolId = Objects.requireNonNull($.userPoolId, "expected parameter 'userPoolId' to be non-null");
            return $;
        }
    }

}
