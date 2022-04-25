// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Node Affinity: the configuration of desired nodes onto which this Instance could be scheduled.
 * 
 */
public final class SchedulingNodeAffinityResponse extends com.pulumi.resources.InvokeArgs {

    public static final SchedulingNodeAffinityResponse Empty = new SchedulingNodeAffinityResponse();

    /**
     * Corresponds to the label key of Node resource.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Corresponds to the label key of Node resource.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    @Import(name="operator", required=true)
    private String operator;

    /**
     * @return Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
     * 
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Corresponds to the label values of Node resource.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Corresponds to the label values of Node resource.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private SchedulingNodeAffinityResponse() {}

    private SchedulingNodeAffinityResponse(SchedulingNodeAffinityResponse $) {
        this.key = $.key;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingNodeAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingNodeAffinityResponse $;

        public Builder() {
            $ = new SchedulingNodeAffinityResponse();
        }

        public Builder(SchedulingNodeAffinityResponse defaults) {
            $ = new SchedulingNodeAffinityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param key Corresponds to the label key of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param operator Defines the operation of node selection. Valid operators are IN for affinity and NOT_IN for anti-affinity.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param values Corresponds to the label values of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of Node resource.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SchedulingNodeAffinityResponse build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
