// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetAutoscalingGroupsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetAutoscalingGroupsFilterArgs Empty = new GetAutoscalingGroupsFilterArgs();

    /**
     * The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The value of the filter.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The value of the filter.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetAutoscalingGroupsFilterArgs() {}

    private GetAutoscalingGroupsFilterArgs(GetAutoscalingGroupsFilterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoscalingGroupsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoscalingGroupsFilterArgs $;

        public Builder() {
            $ = new GetAutoscalingGroupsFilterArgs();
        }

        public Builder(GetAutoscalingGroupsFilterArgs defaults) {
            $ = new GetAutoscalingGroupsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the DescribeAutoScalingGroup filter. The recommended values are: `tag-key`, `tag-value`, and `tag:&lt;tag name&gt;`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values The value of the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value of the filter.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
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

        public GetAutoscalingGroupsFilterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
