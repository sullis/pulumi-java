// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleActionArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleRuleConditionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ListenerRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleArgs Empty = new ListenerRuleArgs();

    @InputImport(name="actions", required=true)
    private final Input<List<ListenerRuleActionArgs>> actions;

    public Input<List<ListenerRuleActionArgs>> getActions() {
        return this.actions;
    }

    @InputImport(name="conditions", required=true)
    private final Input<List<ListenerRuleRuleConditionArgs>> conditions;

    public Input<List<ListenerRuleRuleConditionArgs>> getConditions() {
        return this.conditions;
    }

    @InputImport(name="listenerArn", required=true)
    private final Input<String> listenerArn;

    public Input<String> getListenerArn() {
        return this.listenerArn;
    }

    @InputImport(name="priority", required=true)
    private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    public ListenerRuleArgs(
        Input<List<ListenerRuleActionArgs>> actions,
        Input<List<ListenerRuleRuleConditionArgs>> conditions,
        Input<String> listenerArn,
        Input<Integer> priority) {
        this.actions = Objects.requireNonNull(actions, "expected parameter 'actions' to be non-null");
        this.conditions = Objects.requireNonNull(conditions, "expected parameter 'conditions' to be non-null");
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
    }

    private ListenerRuleArgs() {
        this.actions = Input.empty();
        this.conditions = Input.empty();
        this.listenerArn = Input.empty();
        this.priority = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<ListenerRuleActionArgs>> actions;
        private Input<List<ListenerRuleRuleConditionArgs>> conditions;
        private Input<String> listenerArn;
        private Input<Integer> priority;

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

        public Builder setActions(Input<List<ListenerRuleActionArgs>> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setActions(List<ListenerRuleActionArgs> actions) {
            this.actions = Input.of(Objects.requireNonNull(actions));
            return this;
        }

        public Builder setConditions(Input<List<ListenerRuleRuleConditionArgs>> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setConditions(List<ListenerRuleRuleConditionArgs> conditions) {
            this.conditions = Input.of(Objects.requireNonNull(conditions));
            return this;
        }

        public Builder setListenerArn(Input<String> listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }

        public Builder setListenerArn(String listenerArn) {
            this.listenerArn = Input.of(Objects.requireNonNull(listenerArn));
            return this;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public ListenerRuleArgs build() {
            return new ListenerRuleArgs(actions, conditions, listenerArn, priority);
        }
    }
}
