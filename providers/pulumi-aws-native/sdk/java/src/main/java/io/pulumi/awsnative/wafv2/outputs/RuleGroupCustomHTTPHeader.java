// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupCustomHTTPHeader {
    private final String name;
    private final String value;

    @CustomType.Constructor
    private RuleGroupCustomHTTPHeader(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.name = name;
        this.value = value;
    }

    public String name() {
        return this.name;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupCustomHTTPHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupCustomHTTPHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public RuleGroupCustomHTTPHeader build() {
            return new RuleGroupCustomHTTPHeader(name, value);
        }
    }
}
