// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RulesetColumnSelectorArgs;
import io.pulumi.awsnative.databrew.inputs.RulesetSubstitutionValueArgs;
import io.pulumi.awsnative.databrew.inputs.RulesetThresholdArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data quality rule for a target resource (dataset)
 * 
 */
public final class RulesetRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetRuleArgs Empty = new RulesetRuleArgs();

    @Import(name="checkExpression", required=true)
      private final Output<String> checkExpression;

    public Output<String> checkExpression() {
        return this.checkExpression;
    }

    @Import(name="columnSelectors")
      private final @Nullable Output<List<RulesetColumnSelectorArgs>> columnSelectors;

    public Output<List<RulesetColumnSelectorArgs>> columnSelectors() {
        return this.columnSelectors == null ? Codegen.empty() : this.columnSelectors;
    }

    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Name of the rule
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="substitutionMap")
      private final @Nullable Output<List<RulesetSubstitutionValueArgs>> substitutionMap;

    public Output<List<RulesetSubstitutionValueArgs>> substitutionMap() {
        return this.substitutionMap == null ? Codegen.empty() : this.substitutionMap;
    }

    @Import(name="threshold")
      private final @Nullable Output<RulesetThresholdArgs> threshold;

    public Output<RulesetThresholdArgs> threshold() {
        return this.threshold == null ? Codegen.empty() : this.threshold;
    }

    public RulesetRuleArgs(
        Output<String> checkExpression,
        @Nullable Output<List<RulesetColumnSelectorArgs>> columnSelectors,
        @Nullable Output<Boolean> disabled,
        Output<String> name,
        @Nullable Output<List<RulesetSubstitutionValueArgs>> substitutionMap,
        @Nullable Output<RulesetThresholdArgs> threshold) {
        this.checkExpression = Objects.requireNonNull(checkExpression, "expected parameter 'checkExpression' to be non-null");
        this.columnSelectors = columnSelectors;
        this.disabled = disabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.substitutionMap = substitutionMap;
        this.threshold = threshold;
    }

    private RulesetRuleArgs() {
        this.checkExpression = Codegen.empty();
        this.columnSelectors = Codegen.empty();
        this.disabled = Codegen.empty();
        this.name = Codegen.empty();
        this.substitutionMap = Codegen.empty();
        this.threshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> checkExpression;
        private @Nullable Output<List<RulesetColumnSelectorArgs>> columnSelectors;
        private @Nullable Output<Boolean> disabled;
        private Output<String> name;
        private @Nullable Output<List<RulesetSubstitutionValueArgs>> substitutionMap;
        private @Nullable Output<RulesetThresholdArgs> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkExpression = defaults.checkExpression;
    	      this.columnSelectors = defaults.columnSelectors;
    	      this.disabled = defaults.disabled;
    	      this.name = defaults.name;
    	      this.substitutionMap = defaults.substitutionMap;
    	      this.threshold = defaults.threshold;
        }

        public Builder checkExpression(Output<String> checkExpression) {
            this.checkExpression = Objects.requireNonNull(checkExpression);
            return this;
        }
        public Builder checkExpression(String checkExpression) {
            this.checkExpression = Output.of(Objects.requireNonNull(checkExpression));
            return this;
        }
        public Builder columnSelectors(@Nullable Output<List<RulesetColumnSelectorArgs>> columnSelectors) {
            this.columnSelectors = columnSelectors;
            return this;
        }
        public Builder columnSelectors(@Nullable List<RulesetColumnSelectorArgs> columnSelectors) {
            this.columnSelectors = Codegen.ofNullable(columnSelectors);
            return this;
        }
        public Builder columnSelectors(RulesetColumnSelectorArgs... columnSelectors) {
            return columnSelectors(List.of(columnSelectors));
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder substitutionMap(@Nullable Output<List<RulesetSubstitutionValueArgs>> substitutionMap) {
            this.substitutionMap = substitutionMap;
            return this;
        }
        public Builder substitutionMap(@Nullable List<RulesetSubstitutionValueArgs> substitutionMap) {
            this.substitutionMap = Codegen.ofNullable(substitutionMap);
            return this;
        }
        public Builder substitutionMap(RulesetSubstitutionValueArgs... substitutionMap) {
            return substitutionMap(List.of(substitutionMap));
        }
        public Builder threshold(@Nullable Output<RulesetThresholdArgs> threshold) {
            this.threshold = threshold;
            return this;
        }
        public Builder threshold(@Nullable RulesetThresholdArgs threshold) {
            this.threshold = Codegen.ofNullable(threshold);
            return this;
        }        public RulesetRuleArgs build() {
            return new RulesetRuleArgs(checkExpression, columnSelectors, disabled, name, substitutionMap, threshold);
        }
    }
}
