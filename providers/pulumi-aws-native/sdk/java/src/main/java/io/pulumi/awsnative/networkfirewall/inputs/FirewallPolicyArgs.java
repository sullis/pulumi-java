// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyCustomActionArgs;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatefulEngineOptionsArgs;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatefulRuleGroupReferenceArgs;
import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyStatelessRuleGroupReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyArgs Empty = new FirewallPolicyArgs();

    @Import(name="statefulDefaultActions")
      private final @Nullable Output<List<String>> statefulDefaultActions;

    public Output<List<String>> statefulDefaultActions() {
        return this.statefulDefaultActions == null ? Codegen.empty() : this.statefulDefaultActions;
    }

    @Import(name="statefulEngineOptions")
      private final @Nullable Output<FirewallPolicyStatefulEngineOptionsArgs> statefulEngineOptions;

    public Output<FirewallPolicyStatefulEngineOptionsArgs> statefulEngineOptions() {
        return this.statefulEngineOptions == null ? Codegen.empty() : this.statefulEngineOptions;
    }

    @Import(name="statefulRuleGroupReferences")
      private final @Nullable Output<List<FirewallPolicyStatefulRuleGroupReferenceArgs>> statefulRuleGroupReferences;

    public Output<List<FirewallPolicyStatefulRuleGroupReferenceArgs>> statefulRuleGroupReferences() {
        return this.statefulRuleGroupReferences == null ? Codegen.empty() : this.statefulRuleGroupReferences;
    }

    @Import(name="statelessCustomActions")
      private final @Nullable Output<List<FirewallPolicyCustomActionArgs>> statelessCustomActions;

    public Output<List<FirewallPolicyCustomActionArgs>> statelessCustomActions() {
        return this.statelessCustomActions == null ? Codegen.empty() : this.statelessCustomActions;
    }

    @Import(name="statelessDefaultActions", required=true)
      private final Output<List<String>> statelessDefaultActions;

    public Output<List<String>> statelessDefaultActions() {
        return this.statelessDefaultActions;
    }

    @Import(name="statelessFragmentDefaultActions", required=true)
      private final Output<List<String>> statelessFragmentDefaultActions;

    public Output<List<String>> statelessFragmentDefaultActions() {
        return this.statelessFragmentDefaultActions;
    }

    @Import(name="statelessRuleGroupReferences")
      private final @Nullable Output<List<FirewallPolicyStatelessRuleGroupReferenceArgs>> statelessRuleGroupReferences;

    public Output<List<FirewallPolicyStatelessRuleGroupReferenceArgs>> statelessRuleGroupReferences() {
        return this.statelessRuleGroupReferences == null ? Codegen.empty() : this.statelessRuleGroupReferences;
    }

    public FirewallPolicyArgs(
        @Nullable Output<List<String>> statefulDefaultActions,
        @Nullable Output<FirewallPolicyStatefulEngineOptionsArgs> statefulEngineOptions,
        @Nullable Output<List<FirewallPolicyStatefulRuleGroupReferenceArgs>> statefulRuleGroupReferences,
        @Nullable Output<List<FirewallPolicyCustomActionArgs>> statelessCustomActions,
        Output<List<String>> statelessDefaultActions,
        Output<List<String>> statelessFragmentDefaultActions,
        @Nullable Output<List<FirewallPolicyStatelessRuleGroupReferenceArgs>> statelessRuleGroupReferences) {
        this.statefulDefaultActions = statefulDefaultActions;
        this.statefulEngineOptions = statefulEngineOptions;
        this.statefulRuleGroupReferences = statefulRuleGroupReferences;
        this.statelessCustomActions = statelessCustomActions;
        this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions, "expected parameter 'statelessDefaultActions' to be non-null");
        this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions, "expected parameter 'statelessFragmentDefaultActions' to be non-null");
        this.statelessRuleGroupReferences = statelessRuleGroupReferences;
    }

    private FirewallPolicyArgs() {
        this.statefulDefaultActions = Codegen.empty();
        this.statefulEngineOptions = Codegen.empty();
        this.statefulRuleGroupReferences = Codegen.empty();
        this.statelessCustomActions = Codegen.empty();
        this.statelessDefaultActions = Codegen.empty();
        this.statelessFragmentDefaultActions = Codegen.empty();
        this.statelessRuleGroupReferences = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> statefulDefaultActions;
        private @Nullable Output<FirewallPolicyStatefulEngineOptionsArgs> statefulEngineOptions;
        private @Nullable Output<List<FirewallPolicyStatefulRuleGroupReferenceArgs>> statefulRuleGroupReferences;
        private @Nullable Output<List<FirewallPolicyCustomActionArgs>> statelessCustomActions;
        private Output<List<String>> statelessDefaultActions;
        private Output<List<String>> statelessFragmentDefaultActions;
        private @Nullable Output<List<FirewallPolicyStatelessRuleGroupReferenceArgs>> statelessRuleGroupReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statefulDefaultActions = defaults.statefulDefaultActions;
    	      this.statefulEngineOptions = defaults.statefulEngineOptions;
    	      this.statefulRuleGroupReferences = defaults.statefulRuleGroupReferences;
    	      this.statelessCustomActions = defaults.statelessCustomActions;
    	      this.statelessDefaultActions = defaults.statelessDefaultActions;
    	      this.statelessFragmentDefaultActions = defaults.statelessFragmentDefaultActions;
    	      this.statelessRuleGroupReferences = defaults.statelessRuleGroupReferences;
        }

        public Builder statefulDefaultActions(@Nullable Output<List<String>> statefulDefaultActions) {
            this.statefulDefaultActions = statefulDefaultActions;
            return this;
        }
        public Builder statefulDefaultActions(@Nullable List<String> statefulDefaultActions) {
            this.statefulDefaultActions = Codegen.ofNullable(statefulDefaultActions);
            return this;
        }
        public Builder statefulDefaultActions(String... statefulDefaultActions) {
            return statefulDefaultActions(List.of(statefulDefaultActions));
        }
        public Builder statefulEngineOptions(@Nullable Output<FirewallPolicyStatefulEngineOptionsArgs> statefulEngineOptions) {
            this.statefulEngineOptions = statefulEngineOptions;
            return this;
        }
        public Builder statefulEngineOptions(@Nullable FirewallPolicyStatefulEngineOptionsArgs statefulEngineOptions) {
            this.statefulEngineOptions = Codegen.ofNullable(statefulEngineOptions);
            return this;
        }
        public Builder statefulRuleGroupReferences(@Nullable Output<List<FirewallPolicyStatefulRuleGroupReferenceArgs>> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = statefulRuleGroupReferences;
            return this;
        }
        public Builder statefulRuleGroupReferences(@Nullable List<FirewallPolicyStatefulRuleGroupReferenceArgs> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = Codegen.ofNullable(statefulRuleGroupReferences);
            return this;
        }
        public Builder statefulRuleGroupReferences(FirewallPolicyStatefulRuleGroupReferenceArgs... statefulRuleGroupReferences) {
            return statefulRuleGroupReferences(List.of(statefulRuleGroupReferences));
        }
        public Builder statelessCustomActions(@Nullable Output<List<FirewallPolicyCustomActionArgs>> statelessCustomActions) {
            this.statelessCustomActions = statelessCustomActions;
            return this;
        }
        public Builder statelessCustomActions(@Nullable List<FirewallPolicyCustomActionArgs> statelessCustomActions) {
            this.statelessCustomActions = Codegen.ofNullable(statelessCustomActions);
            return this;
        }
        public Builder statelessCustomActions(FirewallPolicyCustomActionArgs... statelessCustomActions) {
            return statelessCustomActions(List.of(statelessCustomActions));
        }
        public Builder statelessDefaultActions(Output<List<String>> statelessDefaultActions) {
            this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions);
            return this;
        }
        public Builder statelessDefaultActions(List<String> statelessDefaultActions) {
            this.statelessDefaultActions = Output.of(Objects.requireNonNull(statelessDefaultActions));
            return this;
        }
        public Builder statelessDefaultActions(String... statelessDefaultActions) {
            return statelessDefaultActions(List.of(statelessDefaultActions));
        }
        public Builder statelessFragmentDefaultActions(Output<List<String>> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions);
            return this;
        }
        public Builder statelessFragmentDefaultActions(List<String> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Output.of(Objects.requireNonNull(statelessFragmentDefaultActions));
            return this;
        }
        public Builder statelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
            return statelessFragmentDefaultActions(List.of(statelessFragmentDefaultActions));
        }
        public Builder statelessRuleGroupReferences(@Nullable Output<List<FirewallPolicyStatelessRuleGroupReferenceArgs>> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = statelessRuleGroupReferences;
            return this;
        }
        public Builder statelessRuleGroupReferences(@Nullable List<FirewallPolicyStatelessRuleGroupReferenceArgs> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = Codegen.ofNullable(statelessRuleGroupReferences);
            return this;
        }
        public Builder statelessRuleGroupReferences(FirewallPolicyStatelessRuleGroupReferenceArgs... statelessRuleGroupReferences) {
            return statelessRuleGroupReferences(List.of(statelessRuleGroupReferences));
        }        public FirewallPolicyArgs build() {
            return new FirewallPolicyArgs(statefulDefaultActions, statefulEngineOptions, statefulRuleGroupReferences, statelessCustomActions, statelessDefaultActions, statelessFragmentDefaultActions, statelessRuleGroupReferences);
        }
    }
}
