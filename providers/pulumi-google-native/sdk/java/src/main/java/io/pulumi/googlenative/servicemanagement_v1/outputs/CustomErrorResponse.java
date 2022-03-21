// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.CustomErrorRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class CustomErrorResponse {
    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    private final List<CustomErrorRuleResponse> rules;
    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
     */
    private final List<String> types;

    @CustomType.Constructor
    private CustomErrorResponse(
        @CustomType.Parameter("rules") List<CustomErrorRuleResponse> rules,
        @CustomType.Parameter("types") List<String> types) {
        this.rules = rules;
        this.types = types;
    }

    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
    */
    public List<CustomErrorRuleResponse> getRules() {
        return this.rules;
    }
    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
    */
    public List<String> getTypes() {
        return this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CustomErrorRuleResponse> rules;
        private List<String> types;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.types = defaults.types;
        }

        public Builder rules(List<CustomErrorRuleResponse> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(CustomErrorRuleResponse... rules) {
            return rules(List.of(rules));
        }
        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }        public CustomErrorResponse build() {
            return new CustomErrorResponse(rules, types);
        }
    }
}
