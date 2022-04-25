// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * &lt;p&gt;An integer parameter.&lt;/p&gt;
 * 
 */
public final class DashboardIntegerParameterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardIntegerParameterArgs Empty = new DashboardIntegerParameterArgs();

    /**
     * &lt;p&gt;The name of the integer parameter.&lt;/p&gt;
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return &lt;p&gt;The name of the integer parameter.&lt;/p&gt;
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * &lt;p&gt;The values for the integer parameter.&lt;/p&gt;
     * 
     */
    @Import(name="values", required=true)
    private Output<List<Double>> values;

    /**
     * @return &lt;p&gt;The values for the integer parameter.&lt;/p&gt;
     * 
     */
    public Output<List<Double>> values() {
        return this.values;
    }

    private DashboardIntegerParameterArgs() {}

    private DashboardIntegerParameterArgs(DashboardIntegerParameterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardIntegerParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardIntegerParameterArgs $;

        public Builder() {
            $ = new DashboardIntegerParameterArgs();
        }

        public Builder(DashboardIntegerParameterArgs defaults) {
            $ = new DashboardIntegerParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name &lt;p&gt;The name of the integer parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name &lt;p&gt;The name of the integer parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values &lt;p&gt;The values for the integer parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<Double>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values &lt;p&gt;The values for the integer parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(List<Double> values) {
            return values(Output.of(values));
        }

        /**
         * @param values &lt;p&gt;The values for the integer parameter.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder values(Double... values) {
            return values(List.of(values));
        }

        public DashboardIntegerParameterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
