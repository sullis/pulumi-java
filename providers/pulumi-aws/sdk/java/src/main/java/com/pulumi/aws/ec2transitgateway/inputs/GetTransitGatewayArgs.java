// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitGatewayArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayArgs Empty = new GetTransitGatewayArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetTransitGatewayFilterArgs>> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<Output<List<GetTransitGatewayFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Identifier of the EC2 Transit Gateway.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Identifier of the EC2 Transit Gateway.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTransitGatewayArgs() {}

    private GetTransitGatewayArgs(GetTransitGatewayArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayArgs $;

        public Builder() {
            $ = new GetTransitGatewayArgs();
        }

        public Builder(GetTransitGatewayArgs defaults) {
            $ = new GetTransitGatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetTransitGatewayFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetTransitGatewayFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetTransitGatewayFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Identifier of the EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Identifier of the EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetTransitGatewayArgs build() {
            return $;
        }
    }

}
