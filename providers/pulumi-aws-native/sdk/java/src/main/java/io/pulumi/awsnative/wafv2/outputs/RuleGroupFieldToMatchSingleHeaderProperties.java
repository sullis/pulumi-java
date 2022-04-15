// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupFieldToMatchSingleHeaderProperties {
    private final String name;

    @CustomType.Constructor
    private RuleGroupFieldToMatchSingleHeaderProperties(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupFieldToMatchSingleHeaderProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupFieldToMatchSingleHeaderProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public RuleGroupFieldToMatchSingleHeaderProperties build() {
            return new RuleGroupFieldToMatchSingleHeaderProperties(name);
        }
    }
}
