// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleQueryStringKeyValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleQueryStringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleQueryStringConfigArgs Empty = new ListenerRuleQueryStringConfigArgs();

    @InputImport(name="values")
    private final @Nullable Input<List<ListenerRuleQueryStringKeyValueArgs>> values;

    public Input<List<ListenerRuleQueryStringKeyValueArgs>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public ListenerRuleQueryStringConfigArgs(@Nullable Input<List<ListenerRuleQueryStringKeyValueArgs>> values) {
        this.values = values;
    }

    private ListenerRuleQueryStringConfigArgs() {
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleQueryStringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ListenerRuleQueryStringKeyValueArgs>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleQueryStringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder setValues(@Nullable Input<List<ListenerRuleQueryStringKeyValueArgs>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<ListenerRuleQueryStringKeyValueArgs> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public ListenerRuleQueryStringConfigArgs build() {
            return new ListenerRuleQueryStringConfigArgs(values);
        }
    }
}
