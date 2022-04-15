// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional;

import io.pulumi.aws.wafregional.inputs.RulePredicateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Import(name="metricName", required=true)
      private final Output<String> metricName;

    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Import(name="predicates")
      private final @Nullable Output<List<RulePredicateArgs>> predicates;

    public Output<List<RulePredicateArgs>> predicates() {
        return this.predicates == null ? Codegen.empty() : this.predicates;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public RuleArgs(
        Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<List<RulePredicateArgs>> predicates,
        @Nullable Output<Map<String,String>> tags) {
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.name = name;
        this.predicates = predicates;
        this.tags = tags;
    }

    private RuleArgs() {
        this.metricName = Codegen.empty();
        this.name = Codegen.empty();
        this.predicates = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RulePredicateArgs>> predicates;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
    	      this.tags = defaults.tags;
        }

        public Builder metricName(Output<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }
        public Builder metricName(String metricName) {
            this.metricName = Output.of(Objects.requireNonNull(metricName));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder predicates(@Nullable Output<List<RulePredicateArgs>> predicates) {
            this.predicates = predicates;
            return this;
        }
        public Builder predicates(@Nullable List<RulePredicateArgs> predicates) {
            this.predicates = Codegen.ofNullable(predicates);
            return this;
        }
        public Builder predicates(RulePredicateArgs... predicates) {
            return predicates(List.of(predicates));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public RuleArgs build() {
            return new RuleArgs(metricName, name, predicates, tags);
        }
    }
}
