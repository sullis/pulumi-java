// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The bucket&#39;s lifecycle configuration. See lifecycle management for more information.
 * 
 */
public final class BucketLifecycleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleArgs Empty = new BucketLifecycleArgs();

    /**
     * A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<List<BucketLifecycleRuleItemArgs>> rule;

    /**
     * @return A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
     * 
     */
    public Optional<Output<List<BucketLifecycleRuleItemArgs>>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private BucketLifecycleArgs() {}

    private BucketLifecycleArgs(BucketLifecycleArgs $) {
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleArgs $;

        public Builder() {
            $ = new BucketLifecycleArgs();
        }

        public Builder(BucketLifecycleArgs defaults) {
            $ = new BucketLifecycleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rule A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<List<BucketLifecycleRuleItemArgs>> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
         * 
         * @return builder
         * 
         */
        public Builder rule(List<BucketLifecycleRuleItemArgs> rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param rule A lifecycle management rule, which is made of an action to take and the condition(s) under which the action will be taken.
         * 
         * @return builder
         * 
         */
        public Builder rule(BucketLifecycleRuleItemArgs... rule) {
            return rule(List.of(rule));
        }

        public BucketLifecycleArgs build() {
            return $;
        }
    }

}
