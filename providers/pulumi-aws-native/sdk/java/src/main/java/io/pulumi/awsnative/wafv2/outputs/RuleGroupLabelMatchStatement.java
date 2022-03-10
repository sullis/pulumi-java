// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupLabelMatchScope;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupLabelMatchStatement {
    private final String key;
    private final RuleGroupLabelMatchScope scope;

    @OutputCustomType.Constructor
    private RuleGroupLabelMatchStatement(
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("scope") RuleGroupLabelMatchScope scope) {
        this.key = key;
        this.scope = scope;
    }

    public String getKey() {
        return this.key;
    }
    public RuleGroupLabelMatchScope getScope() {
        return this.scope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupLabelMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private RuleGroupLabelMatchScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupLabelMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setScope(RuleGroupLabelMatchScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public RuleGroupLabelMatchStatement build() {
            return new RuleGroupLabelMatchStatement(key, scope);
        }
    }
}
