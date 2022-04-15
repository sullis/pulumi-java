// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleActionArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRuleConditionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleArgs Empty = new ListenerRuleArgs();

    @Import(name="actions", required=true)
      private final Output<List<ListenerRuleActionArgs>> actions;

    public Output<List<ListenerRuleActionArgs>> actions() {
        return this.actions;
    }

    @Import(name="conditions", required=true)
      private final Output<List<ListenerRuleRuleConditionArgs>> conditions;

    public Output<List<ListenerRuleRuleConditionArgs>> conditions() {
        return this.conditions;
    }

    @Import(name="listenerArn", required=true)
      private final Output<String> listenerArn;

    public Output<String> listenerArn() {
        return this.listenerArn;
    }

    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    public ListenerRuleArgs(
        Output<List<ListenerRuleActionArgs>> actions,
        Output<List<ListenerRuleRuleConditionArgs>> conditions,
        Output<String> listenerArn,
        Output<Integer> priority) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private ListenerRuleArgs() {
        this.actions = Codegen.empty();
        this.conditions = Codegen.empty();
        this.listenerArn = Codegen.empty();
        this.priority = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ListenerRuleActionArgs>> actions;
        private Output<List<ListenerRuleRuleConditionArgs>> conditions;
        private Output<String> listenerArn;
        private Output<Integer> priority;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.conditions = defaults.conditions;
    	      this.listenerArn = defaults.listenerArn;
    	      this.priority = defaults.priority;
        }

        public Builder actions(Output<List<ListenerRuleActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(List<ListenerRuleActionArgs> actions) {
            this.actions = Output.of(Objects.requireNonNull(actions));
            return this;
        }
        public Builder actions(ListenerRuleActionArgs... actions) {
            return actions(List.of(actions));
        }
        public Builder conditions(Output<List<ListenerRuleRuleConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(List<ListenerRuleRuleConditionArgs> conditions) {
            this.conditions = Output.of(Objects.requireNonNull(conditions));
            return this;
        }
        public Builder conditions(ListenerRuleRuleConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder listenerArn(Output<String> listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }
        public Builder listenerArn(String listenerArn) {
            this.listenerArn = Output.of(Objects.requireNonNull(listenerArn));
            return this;
        }
        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }        public ListenerRuleArgs build() {
            return new ListenerRuleArgs(actions, conditions, listenerArn, priority);
        }
    }
}
