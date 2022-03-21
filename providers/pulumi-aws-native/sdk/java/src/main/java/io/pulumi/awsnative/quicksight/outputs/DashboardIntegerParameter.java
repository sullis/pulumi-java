// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DashboardIntegerParameter {
    /**
     * <p>The name of the integer parameter.</p>
     * 
     */
    private final String name;
    /**
     * <p>The values for the integer parameter.</p>
     * 
     */
    private final List<Double> values;

    @CustomType.Constructor
    private DashboardIntegerParameter(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("values") List<Double> values) {
        this.name = name;
        this.values = values;
    }

    /**
     * <p>The name of the integer parameter.</p>
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * <p>The values for the integer parameter.</p>
     * 
    */
    public List<Double> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DashboardIntegerParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<Double> values;

        public Builder() {
    	      // Empty
        }

        public Builder(DashboardIntegerParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<Double> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(Double... values) {
            return values(List.of(values));
        }        public DashboardIntegerParameter build() {
            return new DashboardIntegerParameter(name, values);
        }
    }
}
