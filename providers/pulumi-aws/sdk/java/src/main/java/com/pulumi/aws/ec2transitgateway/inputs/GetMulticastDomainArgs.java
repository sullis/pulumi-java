// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetMulticastDomainFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMulticastDomainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMulticastDomainArgs Empty = new GetMulticastDomainArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetMulticastDomainFilterArgs>> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<Output<List<GetMulticastDomainFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Multicast Domain.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Multicast Domain.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Identifier of the EC2 Transit Gateway Multicast Domain.
     * 
     */
    @Import(name="transitGatewayMulticastDomainId")
    private @Nullable Output<String> transitGatewayMulticastDomainId;

    /**
     * @return Identifier of the EC2 Transit Gateway Multicast Domain.
     * 
     */
    public Optional<Output<String>> transitGatewayMulticastDomainId() {
        return Optional.ofNullable(this.transitGatewayMulticastDomainId);
    }

    private GetMulticastDomainArgs() {}

    private GetMulticastDomainArgs(GetMulticastDomainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
        this.transitGatewayMulticastDomainId = $.transitGatewayMulticastDomainId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMulticastDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMulticastDomainArgs $;

        public Builder() {
            $ = new GetMulticastDomainArgs();
        }

        public Builder(GetMulticastDomainArgs defaults) {
            $ = new GetMulticastDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetMulticastDomainFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetMulticastDomainFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetMulticastDomainFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Multicast Domain.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Multicast Domain.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param transitGatewayMulticastDomainId Identifier of the EC2 Transit Gateway Multicast Domain.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayMulticastDomainId(@Nullable Output<String> transitGatewayMulticastDomainId) {
            $.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId;
            return this;
        }

        /**
         * @param transitGatewayMulticastDomainId Identifier of the EC2 Transit Gateway Multicast Domain.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayMulticastDomainId(String transitGatewayMulticastDomainId) {
            return transitGatewayMulticastDomainId(Output.of(transitGatewayMulticastDomainId));
        }

        public GetMulticastDomainArgs build() {
            return $;
        }
    }

}
