// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetTransitGatewayFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTransitGatewayPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTransitGatewayPlainArgs Empty = new GetTransitGatewayPlainArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetTransitGatewayFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<List<GetTransitGatewayFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Identifier of the EC2 Transit Gateway.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Identifier of the EC2 Transit Gateway.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetTransitGatewayPlainArgs() {}

    private GetTransitGatewayPlainArgs(GetTransitGatewayPlainArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTransitGatewayPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTransitGatewayPlainArgs $;

        public Builder() {
            $ = new GetTransitGatewayPlainArgs();
        }

        public Builder(GetTransitGatewayPlainArgs defaults) {
            $ = new GetTransitGatewayPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetTransitGatewayFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetTransitGatewayFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id Identifier of the EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetTransitGatewayPlainArgs build() {
            return $;
        }
    }

}
