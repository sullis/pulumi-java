// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAutoscalingGroupsFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoscalingGroupsFilter Empty = new GetAutoscalingGroupsFilter();

    /**
     * The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The value of the filter.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return The value of the filter.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetAutoscalingGroupsFilter() {}

    private GetAutoscalingGroupsFilter(GetAutoscalingGroupsFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscalingGroupsFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscalingGroupsFilter $;

        public Builder() {
            $ = new GetAutoscalingGroupsFilter();
        }

        public Builder(GetAutoscalingGroupsFilter defaults) {
            $ = new GetAutoscalingGroupsFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values The value of the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value of the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetAutoscalingGroupsFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
