// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDirectConnectGatewayAttachmentFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetDirectConnectGatewayAttachmentFilter Empty = new GetDirectConnectGatewayAttachmentFilter();

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private GetDirectConnectGatewayAttachmentFilter() {}

    private GetDirectConnectGatewayAttachmentFilter(GetDirectConnectGatewayAttachmentFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDirectConnectGatewayAttachmentFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDirectConnectGatewayAttachmentFilter $;

        public Builder() {
            $ = new GetDirectConnectGatewayAttachmentFilter();
        }

        public Builder(GetDirectConnectGatewayAttachmentFilter defaults) {
            $ = new GetDirectConnectGatewayAttachmentFilter(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the filter field. Valid values can be found in the [EC2 DescribeTransitGatewayAttachments API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayAttachments.html).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetDirectConnectGatewayAttachmentFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
