// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetConnectPeerFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectPeerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectPeerPlainArgs Empty = new GetConnectPeerPlainArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetConnectPeerFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    public Optional<List<GetConnectPeerFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Connect Peer
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway Connect Peer
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Identifier of the EC2 Transit Gateway Connect Peer.
     * 
     */
    @Import(name="transitGatewayConnectPeerId")
    private @Nullable String transitGatewayConnectPeerId;

    /**
     * @return Identifier of the EC2 Transit Gateway Connect Peer.
     * 
     */
    public Optional<String> transitGatewayConnectPeerId() {
        return Optional.ofNullable(this.transitGatewayConnectPeerId);
    }

    private GetConnectPeerPlainArgs() {}

    private GetConnectPeerPlainArgs(GetConnectPeerPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
        this.transitGatewayConnectPeerId = $.transitGatewayConnectPeerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectPeerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectPeerPlainArgs $;

        public Builder() {
            $ = new GetConnectPeerPlainArgs();
        }

        public Builder(GetConnectPeerPlainArgs defaults) {
            $ = new GetConnectPeerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetConnectPeerFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetConnectPeerFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags Key-value tags for the EC2 Transit Gateway Connect Peer
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param transitGatewayConnectPeerId Identifier of the EC2 Transit Gateway Connect Peer.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayConnectPeerId(@Nullable String transitGatewayConnectPeerId) {
            $.transitGatewayConnectPeerId = transitGatewayConnectPeerId;
            return this;
        }

        public GetConnectPeerPlainArgs build() {
            return $;
        }
    }

}
