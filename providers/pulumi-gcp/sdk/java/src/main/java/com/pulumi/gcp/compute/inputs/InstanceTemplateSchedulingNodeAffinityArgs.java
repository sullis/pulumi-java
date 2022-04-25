// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceTemplateSchedulingNodeAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateSchedulingNodeAffinityArgs Empty = new InstanceTemplateSchedulingNodeAffinityArgs();

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator. Can be `IN` for node-affinities
     * or `NOT_IN` for anti-affinities.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * Corresponds to the label values of a reservation resource.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Corresponds to the label values of a reservation resource.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private InstanceTemplateSchedulingNodeAffinityArgs() {}

    private InstanceTemplateSchedulingNodeAffinityArgs(InstanceTemplateSchedulingNodeAffinityArgs $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateSchedulingNodeAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateSchedulingNodeAffinityArgs $;

        public Builder() {
            $ = new InstanceTemplateSchedulingNodeAffinityArgs();
        }

        public Builder(InstanceTemplateSchedulingNodeAffinityArgs defaults) {
            $ = new InstanceTemplateSchedulingNodeAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify compute.googleapis.com/reservation-name as the key and specify the name of your reservation as the only value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param operator The operator. Can be `IN` for node-affinities
         * or `NOT_IN` for anti-affinities.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator. Can be `IN` for node-affinities
         * or `NOT_IN` for anti-affinities.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Corresponds to the label values of a reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public InstanceTemplateSchedulingNodeAffinityArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
