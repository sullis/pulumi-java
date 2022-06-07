// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLocalGatewayVirtualInterfaceGroupFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLocalGatewayVirtualInterfaceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLocalGatewayVirtualInterfaceGroupArgs Empty = new GetLocalGatewayVirtualInterfaceGroupArgs();

    /**
     * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetLocalGatewayVirtualInterfaceGroupFilterArgs>> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
     * 
     */
    public Optional<Output<List<GetLocalGatewayVirtualInterfaceGroupFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Identifier of EC2 Local Gateway Virtual Interface Group.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier of EC2 Local Gateway Virtual Interface Group.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Identifier of EC2 Local Gateway.
     * 
     */
    @Import(name="localGatewayId")
    private @Nullable Output<String> localGatewayId;

    /**
     * @return Identifier of EC2 Local Gateway.
     * 
     */
    public Optional<Output<String>> localGatewayId() {
        return Optional.ofNullable(this.localGatewayId);
    }

    /**
     * Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLocalGatewayVirtualInterfaceGroupArgs() {}

    private GetLocalGatewayVirtualInterfaceGroupArgs(GetLocalGatewayVirtualInterfaceGroupArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.localGatewayId = $.localGatewayId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLocalGatewayVirtualInterfaceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLocalGatewayVirtualInterfaceGroupArgs $;

        public Builder() {
            $ = new GetLocalGatewayVirtualInterfaceGroupArgs();
        }

        public Builder(GetLocalGatewayVirtualInterfaceGroupArgs defaults) {
            $ = new GetLocalGatewayVirtualInterfaceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetLocalGatewayVirtualInterfaceGroupFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetLocalGatewayVirtualInterfaceGroupFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLocalGatewayVirtualInterfaceGroups.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLocalGatewayVirtualInterfaceGroupFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Identifier of EC2 Local Gateway Virtual Interface Group.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of EC2 Local Gateway Virtual Interface Group.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param localGatewayId Identifier of EC2 Local Gateway.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayId(@Nullable Output<String> localGatewayId) {
            $.localGatewayId = localGatewayId;
            return this;
        }

        /**
         * @param localGatewayId Identifier of EC2 Local Gateway.
         * 
         * @return builder
         * 
         */
        public Builder localGatewayId(String localGatewayId) {
            return localGatewayId(Output.of(localGatewayId));
        }

        /**
         * @param tags Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags, each pair of which must exactly match a pair on the desired local gateway route table.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetLocalGatewayVirtualInterfaceGroupArgs build() {
            return $;
        }
    }

}
