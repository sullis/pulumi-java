// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcArgs Empty = new GetVpcArgs();

    /**
     * The cidr block of the desired VPC.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return The cidr block of the desired VPC.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Boolean constraint on whether the desired VPC is
     * the default VPC for the region.
     * 
     */
    @Import(name="default")
    private @Nullable Output<Boolean> default_;

    /**
     * @return Boolean constraint on whether the desired VPC is
     * the default VPC for the region.
     * 
     */
    public Optional<Output<Boolean>> default_() {
        return Optional.ofNullable(this.default_);
    }

    /**
     * The DHCP options id of the desired VPC.
     * 
     */
    @Import(name="dhcpOptionsId")
    private @Nullable Output<String> dhcpOptionsId;

    /**
     * @return The DHCP options id of the desired VPC.
     * 
     */
    public Optional<Output<String>> dhcpOptionsId() {
        return Optional.ofNullable(this.dhcpOptionsId);
    }

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetVpcFilterArgs>> filters;

    /**
     * @return Custom filter block as described below.
     * 
     */
    public Optional<Output<List<GetVpcFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The id of the specific VPC to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the specific VPC to retrieve.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The current state of the desired VPC.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the desired VPC.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired VPC.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags, each pair of which must exactly match
     * a pair on the desired VPC.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcArgs() {}

    private GetVpcArgs(GetVpcArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.default_ = $.default_;
        this.dhcpOptionsId = $.dhcpOptionsId;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcArgs $;

        public Builder() {
            $ = new GetVpcArgs();
        }

        public Builder(GetVpcArgs defaults) {
            $ = new GetVpcArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidrBlock The cidr block of the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock The cidr block of the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        /**
         * @param default_ Boolean constraint on whether the desired VPC is
         * the default VPC for the region.
         * 
         * @return builder
         * 
         */
        public Builder default_(@Nullable Output<Boolean> default_) {
            $.default_ = default_;
            return this;
        }

        /**
         * @param default_ Boolean constraint on whether the desired VPC is
         * the default VPC for the region.
         * 
         * @return builder
         * 
         */
        public Builder default_(Boolean default_) {
            return default_(Output.of(default_));
        }

        /**
         * @param dhcpOptionsId The DHCP options id of the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsId(@Nullable Output<String> dhcpOptionsId) {
            $.dhcpOptionsId = dhcpOptionsId;
            return this;
        }

        /**
         * @param dhcpOptionsId The DHCP options id of the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            return dhcpOptionsId(Output.of(dhcpOptionsId));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetVpcFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetVpcFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Custom filter block as described below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetVpcFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The id of the specific VPC to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the specific VPC to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param state The current state of the desired VPC.
         * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the desired VPC.
         * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match
         * a pair on the desired VPC.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetVpcArgs build() {
            return $;
        }
    }

}
