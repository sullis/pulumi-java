// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PermissionArgs Empty = new PermissionArgs();

    /**
     * The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    @Import(name="eventSourceToken")
    private @Nullable Output<String> eventSourceToken;

    /**
     * @return The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
     * 
     */
    public Optional<Output<String>> eventSourceToken() {
        return Optional.ofNullable(this.eventSourceToken);
    }

    /**
     * Name of the Lambda function whose resource policy you are updating
     * 
     */
    @Import(name="function", required=true)
    private Output<String> function;

    /**
     * @return Name of the Lambda function whose resource policy you are updating
     * 
     */
    public Output<String> function() {
        return this.function;
    }

    /**
     * The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    /**
     * @return The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }

    /**
     * Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    @Import(name="qualifier")
    private @Nullable Output<String> qualifier;

    /**
     * @return Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
     * 
     */
    public Optional<Output<String>> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    /**
     * This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    @Import(name="sourceAccount")
    private @Nullable Output<String> sourceAccount;

    /**
     * @return This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
     * 
     */
    public Optional<Output<String>> sourceAccount() {
        return Optional.ofNullable(this.sourceAccount);
    }

    /**
     * When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    @Import(name="sourceArn")
    private @Nullable Output<String> sourceArn;

    /**
     * @return When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
     * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
     * For S3, this should be the ARN of the S3 Bucket.
     * For EventBridge events, this should be the ARN of the EventBridge Rule.
     * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
     * 
     */
    public Optional<Output<String>> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }

    /**
     * A unique statement identifier. By default generated by this provider.
     * 
     */
    @Import(name="statementId")
    private @Nullable Output<String> statementId;

    /**
     * @return A unique statement identifier. By default generated by this provider.
     * 
     */
    public Optional<Output<String>> statementId() {
        return Optional.ofNullable(this.statementId);
    }

    /**
     * A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    @Import(name="statementIdPrefix")
    private @Nullable Output<String> statementIdPrefix;

    /**
     * @return A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
     * 
     */
    public Optional<Output<String>> statementIdPrefix() {
        return Optional.ofNullable(this.statementIdPrefix);
    }

    private PermissionArgs() {}

    private PermissionArgs(PermissionArgs $) {
        this.action = $.action;
        this.eventSourceToken = $.eventSourceToken;
        this.function = $.function;
        this.principal = $.principal;
        this.qualifier = $.qualifier;
        this.sourceAccount = $.sourceAccount;
        this.sourceArn = $.sourceArn;
        this.statementId = $.statementId;
        this.statementIdPrefix = $.statementIdPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PermissionArgs $;

        public Builder() {
            $ = new PermissionArgs();
        }

        public Builder(PermissionArgs defaults) {
            $ = new PermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action The AWS Lambda action you want to allow in this statement. (e.g., `lambda:InvokeFunction`)
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param eventSourceToken The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
         * 
         * @return builder
         * 
         */
        public Builder eventSourceToken(@Nullable Output<String> eventSourceToken) {
            $.eventSourceToken = eventSourceToken;
            return this;
        }

        /**
         * @param eventSourceToken The Event Source Token to validate.  Used with [Alexa Skills](https://developer.amazon.com/docs/custom-skills/host-a-custom-skill-as-an-aws-lambda-function.html#use-aws-cli).
         * 
         * @return builder
         * 
         */
        public Builder eventSourceToken(String eventSourceToken) {
            return eventSourceToken(Output.of(eventSourceToken));
        }

        /**
         * @param function Name of the Lambda function whose resource policy you are updating
         * 
         * @return builder
         * 
         */
        public Builder function(Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function Name of the Lambda function whose resource policy you are updating
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        /**
         * @param principal The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
         * 
         * @return builder
         * 
         */
        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        /**
         * @param principal The principal who is getting this permissionE.g., `s3.amazonaws.com`, an AWS account ID, or any valid AWS service principal such as `events.amazonaws.com` or `sns.amazonaws.com`.
         * 
         * @return builder
         * 
         */
        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        /**
         * @param qualifier Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable Output<String> qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        /**
         * @param qualifier Query parameter to specify function version or alias name. The permission will then apply to the specific qualified ARNE.g., `arn:aws:lambda:aws-region:acct-id:function:function-name:2`
         * 
         * @return builder
         * 
         */
        public Builder qualifier(String qualifier) {
            return qualifier(Output.of(qualifier));
        }

        /**
         * @param sourceAccount This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(@Nullable Output<String> sourceAccount) {
            $.sourceAccount = sourceAccount;
            return this;
        }

        /**
         * @param sourceAccount This parameter is used for S3 and SES. The AWS account ID (without a hyphen) of the source owner.
         * 
         * @return builder
         * 
         */
        public Builder sourceAccount(String sourceAccount) {
            return sourceAccount(Output.of(sourceAccount));
        }

        /**
         * @param sourceArn When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
         * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
         * For S3, this should be the ARN of the S3 Bucket.
         * For EventBridge events, this should be the ARN of the EventBridge Rule.
         * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            $.sourceArn = sourceArn;
            return this;
        }

        /**
         * @param sourceArn When the principal is an AWS service, the ARN of the specific resource within that service to grant permission to.
         * Without this, any resource from `principal` will be granted permission – even if that resource is from another account.
         * For S3, this should be the ARN of the S3 Bucket.
         * For EventBridge events, this should be the ARN of the EventBridge Rule.
         * For API Gateway, this should be the ARN of the API, as described [here](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-control-access-using-iam-policies-to-invoke-api.html).
         * 
         * @return builder
         * 
         */
        public Builder sourceArn(String sourceArn) {
            return sourceArn(Output.of(sourceArn));
        }

        /**
         * @param statementId A unique statement identifier. By default generated by this provider.
         * 
         * @return builder
         * 
         */
        public Builder statementId(@Nullable Output<String> statementId) {
            $.statementId = statementId;
            return this;
        }

        /**
         * @param statementId A unique statement identifier. By default generated by this provider.
         * 
         * @return builder
         * 
         */
        public Builder statementId(String statementId) {
            return statementId(Output.of(statementId));
        }

        /**
         * @param statementIdPrefix A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
         * 
         * @return builder
         * 
         */
        public Builder statementIdPrefix(@Nullable Output<String> statementIdPrefix) {
            $.statementIdPrefix = statementIdPrefix;
            return this;
        }

        /**
         * @param statementIdPrefix A statement identifier prefix. This provider will generate a unique suffix. Conflicts with `statement_id`.
         * 
         * @return builder
         * 
         */
        public Builder statementIdPrefix(String statementIdPrefix) {
            return statementIdPrefix(Output.of(statementIdPrefix));
        }

        public PermissionArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.function = Objects.requireNonNull($.function, "expected parameter 'function' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            return $;
        }
    }

}
