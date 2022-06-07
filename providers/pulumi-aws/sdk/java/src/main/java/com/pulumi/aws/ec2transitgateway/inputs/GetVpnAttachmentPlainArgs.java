// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.aws.ec2transitgateway.inputs.GetVpnAttachmentFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpnAttachmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpnAttachmentPlainArgs Empty = new GetVpnAttachmentPlainArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpnAttachmentFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetVpnAttachmentFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Identifier of the EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
    private @Nullable String transitGatewayId;

    /**
     * @return Identifier of the EC2 Transit Gateway.
     * 
     */
    public Optional<String> transitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    /**
     * Identifier of the EC2 VPN Connection.
     * 
     */
    @Import(name="vpnConnectionId")
    private @Nullable String vpnConnectionId;

    /**
     * @return Identifier of the EC2 VPN Connection.
     * 
     */
    public Optional<String> vpnConnectionId() {
        return Optional.ofNullable(this.vpnConnectionId);
    }

    private GetVpnAttachmentPlainArgs() {}

    private GetVpnAttachmentPlainArgs(GetVpnAttachmentPlainArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
        this.transitGatewayId = $.transitGatewayId;
        this.vpnConnectionId = $.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpnAttachmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpnAttachmentPlainArgs $;

        public Builder() {
            $ = new GetVpnAttachmentPlainArgs();
        }

        public Builder(GetVpnAttachmentPlainArgs defaults) {
            $ = new GetVpnAttachmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetVpnAttachmentFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpnAttachmentFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match a pair on the desired Transit Gateway VPN Attachment.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param transitGatewayId Identifier of the EC2 Transit Gateway.
         * 
         * @return builder
         * 
         */
        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            $.transitGatewayId = transitGatewayId;
            return this;
        }

        /**
         * @param vpnConnectionId Identifier of the EC2 VPN Connection.
         * 
         * @return builder
         * 
         */
        public Builder vpnConnectionId(@Nullable String vpnConnectionId) {
            $.vpnConnectionId = vpnConnectionId;
            return this;
        }

        public GetVpnAttachmentPlainArgs build() {
            return $;
        }
    }

}
