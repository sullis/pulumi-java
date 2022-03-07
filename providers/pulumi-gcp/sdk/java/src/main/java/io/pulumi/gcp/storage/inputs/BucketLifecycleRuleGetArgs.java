// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleActionGetArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleConditionGetArgs;
import java.util.Objects;


public final class BucketLifecycleRuleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleGetArgs Empty = new BucketLifecycleRuleGetArgs();

    /**
     * The Lifecycle Rule's action configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @InputImport(name="action", required=true)
      private final Input<BucketLifecycleRuleActionGetArgs> action;

    public Input<BucketLifecycleRuleActionGetArgs> getAction() {
        return this.action;
    }

    /**
     * The Lifecycle Rule's condition configuration. A single block of this type is supported. Structure is documented below.
     * 
     */
    @InputImport(name="condition", required=true)
      private final Input<BucketLifecycleRuleConditionGetArgs> condition;

    public Input<BucketLifecycleRuleConditionGetArgs> getCondition() {
        return this.condition;
    }

    public BucketLifecycleRuleGetArgs(
        Input<BucketLifecycleRuleActionGetArgs> action,
        Input<BucketLifecycleRuleConditionGetArgs> condition) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
    }

    private BucketLifecycleRuleGetArgs() {
        this.action = Input.empty();
        this.condition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BucketLifecycleRuleActionGetArgs> action;
        private Input<BucketLifecycleRuleConditionGetArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.condition = defaults.condition;
        }

        public Builder setAction(Input<BucketLifecycleRuleActionGetArgs> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(BucketLifecycleRuleActionGetArgs action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }

        public Builder setCondition(Input<BucketLifecycleRuleConditionGetArgs> condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setCondition(BucketLifecycleRuleConditionGetArgs condition) {
            this.condition = Input.of(Objects.requireNonNull(condition));
            return this;
        }
        public BucketLifecycleRuleGetArgs build() {
            return new BucketLifecycleRuleGetArgs(action, condition);
        }
    }
}