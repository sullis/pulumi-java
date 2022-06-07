// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcDhcpOptionsFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcDhcpOptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcDhcpOptionsArgs Empty = new GetVpcDhcpOptionsArgs();

    /**
     * The EC2 DHCP Options ID.
     * 
     */
    @Import(name="dhcpOptionsId")
    private @Nullable Output<String> dhcpOptionsId;

    /**
     * @return The EC2 DHCP Options ID.
     * 
     */
    public Optional<Output<String>> dhcpOptionsId() {
        return Optional.ofNullable(this.dhcpOptionsId);
    }

    /**
     * List of custom filters as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetVpcDhcpOptionsFilterArgs>> filters;

    /**
     * @return List of custom filters as described below.
     * 
     */
    public Optional<Output<List<GetVpcDhcpOptionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags assigned to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcDhcpOptionsArgs() {}

    private GetVpcDhcpOptionsArgs(GetVpcDhcpOptionsArgs $) {
        this.dhcpOptionsId = $.dhcpOptionsId;
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcDhcpOptionsArgs $;

        public Builder() {
            $ = new GetVpcDhcpOptionsArgs();
        }

        public Builder(GetVpcDhcpOptionsArgs defaults) {
            $ = new GetVpcDhcpOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dhcpOptionsId The EC2 DHCP Options ID.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsId(@Nullable Output<String> dhcpOptionsId) {
            $.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        /**
         * @param dhcpOptionsId The EC2 DHCP Options ID.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            return dhcpOptionsId(Output.of(dhcpOptionsId));
        }

        /**
         * @param filters List of custom filters as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetVpcDhcpOptionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters List of custom filters as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetVpcDhcpOptionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters List of custom filters as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcDhcpOptionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param tags A map of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetVpcDhcpOptionsArgs build() {
            return $;
        }
    }

}
