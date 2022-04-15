// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RulePredicateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulePredicateGetArgs Empty = new RulePredicateGetArgs();

    @Import(name="dataId", required=true)
      private final Output<String> dataId;

    public Output<String> dataId() {
        return this.dataId;
    }

    @Import(name="negated", required=true)
      private final Output<Boolean> negated;

    public Output<Boolean> negated() {
        return this.negated;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public RulePredicateGetArgs(
        Output<String> dataId,
        Output<Boolean> negated,
        Output<String> type) {
        this.dataId = Objects.requireNonNull(dataId, "expected parameter 'dataId' to be non-null");
        this.negated = Objects.requireNonNull(negated, "expected parameter 'negated' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RulePredicateGetArgs() {
        this.dataId = Codegen.empty();
        this.negated = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulePredicateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataId;
        private Output<Boolean> negated;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RulePredicateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        public Builder dataId(Output<String> dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }
        public Builder dataId(String dataId) {
            this.dataId = Output.of(Objects.requireNonNull(dataId));
            return this;
        }
        public Builder negated(Output<Boolean> negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }
        public Builder negated(Boolean negated) {
            this.negated = Output.of(Objects.requireNonNull(negated));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RulePredicateGetArgs build() {
            return new RulePredicateGetArgs(dataId, negated, type);
        }
    }
}
