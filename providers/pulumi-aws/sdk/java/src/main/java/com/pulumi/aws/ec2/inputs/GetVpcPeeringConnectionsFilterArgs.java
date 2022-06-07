// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVpcPeeringConnectionsFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetVpcPeeringConnectionsFilterArgs Empty = new GetVpcPeeringConnectionsFilterArgs();

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the field to filter by, as defined by
     * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given field.
     * A VPC Peering Connection will be selected if any one of the given values matches.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return Set of values that are accepted for the given field.
     * A VPC Peering Connection will be selected if any one of the given values matches.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private GetVpcPeeringConnectionsFilterArgs() {}

    private GetVpcPeeringConnectionsFilterArgs(GetVpcPeeringConnectionsFilterArgs $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcPeeringConnectionsFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcPeeringConnectionsFilterArgs $;

        public Builder() {
            $ = new GetVpcPeeringConnectionsFilterArgs();
        }

        public Builder(GetVpcPeeringConnectionsFilterArgs defaults) {
            $ = new GetVpcPeeringConnectionsFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the field to filter by, as defined by
         * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the field to filter by, as defined by
         * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * A VPC Peering Connection will be selected if any one of the given values matches.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * A VPC Peering Connection will be selected if any one of the given values matches.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Set of values that are accepted for the given field.
         * A VPC Peering Connection will be selected if any one of the given values matches.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetVpcPeeringConnectionsFilterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
