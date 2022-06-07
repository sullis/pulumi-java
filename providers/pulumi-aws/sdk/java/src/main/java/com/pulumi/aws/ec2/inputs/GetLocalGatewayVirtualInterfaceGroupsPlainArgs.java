// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayVirtualInterfaceGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayVirtualInterfaceGroupsPlainArgs Empty = new GetLocalGatewayVirtualInterfaceGroupsPlainArgs();

    /**
     * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * 
     */
    public Optional<List<GetLocalGatewayVirtualInterfaceGroupsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewayVirtualInterfaceGroupsPlainArgs() {}

    private GetLocalGatewayVirtualInterfaceGroupsPlainArgs(GetLocalGatewayVirtualInterfaceGroupsPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayVirtualInterfaceGroupsPlainArgs $;

        public Builder() {
            $ = new GetLocalGatewayVirtualInterfaceGroupsPlainArgs();
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupsPlainArgs defaults) {
            $ = new GetLocalGatewayVirtualInterfaceGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetLocalGatewayVirtualInterfaceGroupsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLocalGatewayVirtualInterfaceGroupsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLocalGatewayVirtualInterfaceGroupsPlainArgs build() {
            return $;
        }
    }

}
