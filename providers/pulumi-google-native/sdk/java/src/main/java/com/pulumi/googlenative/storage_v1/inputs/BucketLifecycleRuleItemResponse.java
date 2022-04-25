// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemActionResponse;
import com.pulumi.googlenative.storage_v1.inputs.BucketLifecycleRuleItemConditionResponse;
import java.util.Objects;


public final class BucketLifecycleRuleItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleRuleItemResponse Empty = new BucketLifecycleRuleItemResponse();

    /**
     * The action to take.
     * 
     */
    @Import(name="action", required=true)
    private BucketLifecycleRuleItemActionResponse action;

    /**
     * @return The action to take.
     * 
     */
    public BucketLifecycleRuleItemActionResponse action() {
        return this.action;
    }

    /**
     * The condition(s) under which the action will be taken.
     * 
     */
    @Import(name="condition", required=true)
    private BucketLifecycleRuleItemConditionResponse condition;

    /**
     * @return The condition(s) under which the action will be taken.
     * 
     */
    public BucketLifecycleRuleItemConditionResponse condition() {
        return this.condition;
    }

    private BucketLifecycleRuleItemResponse() {}

    private BucketLifecycleRuleItemResponse(BucketLifecycleRuleItemResponse $) {
        this.action = $.action;
        this.condition = $.condition;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleItemResponse $;

        public Builder() {
            $ = new BucketLifecycleRuleItemResponse();
        }

        public Builder(BucketLifecycleRuleItemResponse defaults) {
            $ = new BucketLifecycleRuleItemResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param action The action to take.
         * 
         * @return builder
         * 
         */
        public Builder action(BucketLifecycleRuleItemActionResponse action) {
            $.action = action;
            return this;
        }

        /**
         * @param condition The condition(s) under which the action will be taken.
         * 
         * @return builder
         * 
         */
        public Builder condition(BucketLifecycleRuleItemConditionResponse condition) {
            $.condition = condition;
            return this;
        }

        public BucketLifecycleRuleItemResponse build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            return $;
        }
    }

}
