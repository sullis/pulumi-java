// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupPolicyAttachmentState extends com.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentState Empty = new GroupPolicyAttachmentState();

    /**
     * The group the policy should be applied to
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The group the policy should be applied to
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn")
    private @Nullable Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Optional<Output<String>> policyArn() {
        return Optional.ofNullable(this.policyArn);
    }

    private GroupPolicyAttachmentState() {}

    private GroupPolicyAttachmentState(GroupPolicyAttachmentState $) {
        this.group = $.group;
        this.policyArn = $.policyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupPolicyAttachmentState $;

        public Builder() {
            $ = new GroupPolicyAttachmentState();
        }

        public Builder(GroupPolicyAttachmentState defaults) {
            $ = new GroupPolicyAttachmentState(Objects.requireNonNull(defaults));
        }

        /**
         * @param group The group the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The group the policy should be applied to
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(@Nullable Output<String> policyArn) {
            $.policyArn = policyArn;
            return this;
        }

        /**
         * @param policyArn The ARN of the policy you want to apply
         * 
         * @return builder
         * 
         */
        public Builder policyArn(String policyArn) {
            return policyArn(Output.of(policyArn));
        }

        public GroupPolicyAttachmentState build() {
            return $;
        }
    }

}
