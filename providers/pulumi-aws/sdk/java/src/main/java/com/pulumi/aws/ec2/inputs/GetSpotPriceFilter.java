// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetSpotPriceFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetSpotPriceFilter Empty = new GetSpotPriceFilter();

    /**
     * Name of the filter.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the filter.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * List of one or more values for the filter.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return List of one or more values for the filter.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetSpotPriceFilter() {}

    private GetSpotPriceFilter(GetSpotPriceFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSpotPriceFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSpotPriceFilter $;

        public Builder() {
            $ = new GetSpotPriceFilter();
        }

        public Builder(GetSpotPriceFilter defaults) {
            $ = new GetSpotPriceFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the filter.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values List of one or more values for the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values List of one or more values for the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetSpotPriceFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
