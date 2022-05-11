// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AutoscaleSettingProfileRuleMetricTriggerDimension {
    /**
     * @return The name of the dimension.
     * 
     */
    private final String name;
    /**
     * @return The dimension operator. Possible values are `Equals` and `NotEquals`. `Equals` means being equal to any of the values. `NotEquals` means being not equal to any of the values.
     * 
     */
    private final String operator;
    /**
     * @return A list of dimension values.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private AutoscaleSettingProfileRuleMetricTriggerDimension(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("values") List<String> values) {
        this.name = name;
        this.operator = operator;
        this.values = values;
    }

    /**
     * @return The name of the dimension.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The dimension operator. Possible values are `Equals` and `NotEquals`. `Equals` means being equal to any of the values. `NotEquals` means being not equal to any of the values.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return A list of dimension values.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleSettingProfileRuleMetricTriggerDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String operator;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleSettingProfileRuleMetricTriggerDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public AutoscaleSettingProfileRuleMetricTriggerDimension build() {
            return new AutoscaleSettingProfileRuleMetricTriggerDimension(name, operator, values);
        }
    }
}
