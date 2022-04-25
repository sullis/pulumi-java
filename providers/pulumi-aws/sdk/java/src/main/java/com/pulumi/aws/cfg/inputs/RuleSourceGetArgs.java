// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.inputs;

import com.pulumi.aws.cfg.inputs.RuleSourceSourceDetailGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleSourceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleSourceGetArgs Empty = new RuleSourceGetArgs();

    /**
     * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
     * 
     */
    @Import(name="owner", required=true)
    private Output<String> owner;

    /**
     * @return Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }

    /**
     * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
     * 
     */
    @Import(name="sourceDetails")
    private @Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails;

    /**
     * @return Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
     * 
     */
    public Optional<Output<List<RuleSourceSourceDetailGetArgs>>> sourceDetails() {
        return Optional.ofNullable(this.sourceDetails);
    }

    /**
     * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    @Import(name="sourceIdentifier", required=true)
    private Output<String> sourceIdentifier;

    /**
     * @return For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
     * 
     */
    public Output<String> sourceIdentifier() {
        return this.sourceIdentifier;
    }

    private RuleSourceGetArgs() {}

    private RuleSourceGetArgs(RuleSourceGetArgs $) {
        this.owner = $.owner;
        this.sourceDetails = $.sourceDetails;
        this.sourceIdentifier = $.sourceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleSourceGetArgs $;

        public Builder() {
            $ = new RuleSourceGetArgs();
        }

        public Builder(RuleSourceGetArgs defaults) {
            $ = new RuleSourceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
         * 
         * @return builder
         * 
         */
        public Builder owner(Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(@Nullable Output<List<RuleSourceSourceDetailGetArgs>> sourceDetails) {
            $.sourceDetails = sourceDetails;
            return this;
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(List<RuleSourceSourceDetailGetArgs> sourceDetails) {
            return sourceDetails(Output.of(sourceDetails));
        }

        /**
         * @param sourceDetails Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
         * 
         * @return builder
         * 
         */
        public Builder sourceDetails(RuleSourceSourceDetailGetArgs... sourceDetails) {
            return sourceDetails(List.of(sourceDetails));
        }

        /**
         * @param sourceIdentifier For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentifier(Output<String> sourceIdentifier) {
            $.sourceIdentifier = sourceIdentifier;
            return this;
        }

        /**
         * @param sourceIdentifier For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
         * 
         * @return builder
         * 
         */
        public Builder sourceIdentifier(String sourceIdentifier) {
            return sourceIdentifier(Output.of(sourceIdentifier));
        }

        public RuleSourceGetArgs build() {
            $.owner = Objects.requireNonNull($.owner, "expected parameter 'owner' to be non-null");
            $.sourceIdentifier = Objects.requireNonNull($.sourceIdentifier, "expected parameter 'sourceIdentifier' to be non-null");
            return $;
        }
    }

}
