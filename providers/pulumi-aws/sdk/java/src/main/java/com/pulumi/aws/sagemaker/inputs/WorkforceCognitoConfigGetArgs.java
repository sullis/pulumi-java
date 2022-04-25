// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkforceCognitoConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkforceCognitoConfigGetArgs Empty = new WorkforceCognitoConfigGetArgs();

    /**
     * The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return The OIDC IdP client ID used to configure your private workforce.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * The id for your Amazon Cognito user pool.
     * 
     */
    @Import(name="userPool", required=true)
    private Output<String> userPool;

    /**
     * @return The id for your Amazon Cognito user pool.
     * 
     */
    public Output<String> userPool() {
        return this.userPool;
    }

    private WorkforceCognitoConfigGetArgs() {}

    private WorkforceCognitoConfigGetArgs(WorkforceCognitoConfigGetArgs $) {
        this.clientId = $.clientId;
        this.userPool = $.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkforceCognitoConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkforceCognitoConfigGetArgs $;

        public Builder() {
            $ = new WorkforceCognitoConfigGetArgs();
        }

        public Builder(WorkforceCognitoConfigGetArgs defaults) {
            $ = new WorkforceCognitoConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The OIDC IdP client ID used to configure your private workforce.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The OIDC IdP client ID used to configure your private workforce.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param userPool The id for your Amazon Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPool(Output<String> userPool) {
            $.userPool = userPool;
            return this;
        }

        /**
         * @param userPool The id for your Amazon Cognito user pool.
         * 
         * @return builder
         * 
         */
        public Builder userPool(String userPool) {
            return userPool(Output.of(userPool));
        }

        public WorkforceCognitoConfigGetArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.userPool = Objects.requireNonNull($.userPool, "expected parameter 'userPool' to be non-null");
            return $;
        }
    }

}
