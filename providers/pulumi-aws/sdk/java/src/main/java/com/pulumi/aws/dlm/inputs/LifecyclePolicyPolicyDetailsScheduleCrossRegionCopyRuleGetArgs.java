// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dlm.inputs;

import com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs;
import com.pulumi.aws.dlm.inputs.LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs Empty = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs();

    /**
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
     * 
     */
    @Import(name="cmkArn")
    private @Nullable Output<String> cmkArn;

    /**
     * @return The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
     * 
     */
    public Optional<Output<String>> cmkArn() {
        return Optional.ofNullable(this.cmkArn);
    }

    /**
     * Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    @Import(name="copyTags")
    private @Nullable Output<Boolean> copyTags;

    /**
     * @return Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
     * 
     */
    public Optional<Output<Boolean>> copyTags() {
        return Optional.ofNullable(this.copyTags);
    }

    /**
     * The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
     * 
     */
    @Import(name="deprecateRule")
    private @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs> deprecateRule;

    /**
     * @return The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
     * 
     */
    public Optional<Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs>> deprecateRule() {
        return Optional.ofNullable(this.deprecateRule);
    }

    /**
     * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
     * 
     */
    @Import(name="encrypted", required=true)
    private Output<Boolean> encrypted;

    /**
     * @return To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }

    /**
     * The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    @Import(name="retainRule")
    private @Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs> retainRule;

    /**
     * @return The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
     * 
     */
    public Optional<Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs>> retainRule() {
        return Optional.ofNullable(this.retainRule);
    }

    /**
     * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs() {}

    private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs $) {
        this.cmkArn = $.cmkArn;
        this.copyTags = $.copyTags;
        this.deprecateRule = $.deprecateRule;
        this.encrypted = $.encrypted;
        this.retainRule = $.retainRule;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs $;

        public Builder() {
            $ = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs();
        }

        public Builder(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs defaults) {
            $ = new LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
         * 
         * @return builder
         * 
         */
        public Builder cmkArn(@Nullable Output<String> cmkArn) {
            $.cmkArn = cmkArn;
            return this;
        }

        /**
         * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this argument is not specified, the default KMS key for the account is used.
         * 
         * @return builder
         * 
         */
        public Builder cmkArn(String cmkArn) {
            return cmkArn(Output.of(cmkArn));
        }

        /**
         * @param copyTags Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
         * 
         * @return builder
         * 
         */
        public Builder copyTags(@Nullable Output<Boolean> copyTags) {
            $.copyTags = copyTags;
            return this;
        }

        /**
         * @param copyTags Whether to copy all user-defined tags from the source snapshot to the cross-region snapshot copy.
         * 
         * @return builder
         * 
         */
        public Builder copyTags(Boolean copyTags) {
            return copyTags(Output.of(copyTags));
        }

        /**
         * @param deprecateRule The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
         * 
         * @return builder
         * 
         */
        public Builder deprecateRule(@Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs> deprecateRule) {
            $.deprecateRule = deprecateRule;
            return this;
        }

        /**
         * @param deprecateRule The AMI deprecation rule for cross-Region AMI copies created by the rule. See the `deprecate_rule` block.
         * 
         * @return builder
         * 
         */
        public Builder deprecateRule(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleDeprecateRuleGetArgs deprecateRule) {
            return deprecateRule(Output.of(deprecateRule));
        }

        /**
         * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        /**
         * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
         * 
         * @return builder
         * 
         */
        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        /**
         * @param retainRule The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
         * 
         * @return builder
         * 
         */
        public Builder retainRule(@Nullable Output<LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs> retainRule) {
            $.retainRule = retainRule;
            return this;
        }

        /**
         * @param retainRule The retention rule that indicates how long snapshot copies are to be retained in the destination Region. See the `retain_rule` block. Max of 1 per schedule.
         * 
         * @return builder
         * 
         */
        public Builder retainRule(LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleRetainRuleGetArgs retainRule) {
            return retainRule(Output.of(retainRule));
        }

        /**
         * @param target The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public LifecyclePolicyPolicyDetailsScheduleCrossRegionCopyRuleGetArgs build() {
            $.encrypted = Objects.requireNonNull($.encrypted, "expected parameter 'encrypted' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
