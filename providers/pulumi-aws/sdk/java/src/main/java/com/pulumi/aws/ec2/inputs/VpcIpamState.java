// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.VpcIpamOperatingRegionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcIpamState extends com.pulumi.resources.ResourceArgs {

    public static final VpcIpamState Empty = new VpcIpamState();

    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of IPAM
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * A description for the IPAM.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the IPAM.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    @Import(name="operatingRegions")
    private @Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions;

    /**
     * @return Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    public Optional<Output<List<VpcIpamOperatingRegionGetArgs>>> operatingRegions() {
        return Optional.ofNullable(this.operatingRegions);
    }

    /**
     * The ID of the IPAM&#39;s private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Import(name="privateDefaultScopeId")
    private @Nullable Output<String> privateDefaultScopeId;

    /**
     * @return The ID of the IPAM&#39;s private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    public Optional<Output<String>> privateDefaultScopeId() {
        return Optional.ofNullable(this.privateDefaultScopeId);
    }

    /**
     * The ID of the IPAM&#39;s public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
     * IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Import(name="publicDefaultScopeId")
    private @Nullable Output<String> publicDefaultScopeId;

    /**
     * @return The ID of the IPAM&#39;s public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
     * IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    public Optional<Output<String>> publicDefaultScopeId() {
        return Optional.ofNullable(this.publicDefaultScopeId);
    }

    /**
     * The number of scopes in the IPAM.
     * 
     */
    @Import(name="scopeCount")
    private @Nullable Output<Integer> scopeCount;

    /**
     * @return The number of scopes in the IPAM.
     * 
     */
    public Optional<Output<Integer>> scopeCount() {
        return Optional.ofNullable(this.scopeCount);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    private VpcIpamState() {}

    private VpcIpamState(VpcIpamState $) {
        this.arn = $.arn;
        this.description = $.description;
        this.operatingRegions = $.operatingRegions;
        this.privateDefaultScopeId = $.privateDefaultScopeId;
        this.publicDefaultScopeId = $.publicDefaultScopeId;
        this.scopeCount = $.scopeCount;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcIpamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcIpamState $;

        public Builder() {
            $ = new VpcIpamState();
        }

        public Builder(VpcIpamState defaults) {
            $ = new VpcIpamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn Amazon Resource Name (ARN) of IPAM
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn Amazon Resource Name (ARN) of IPAM
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param description A description for the IPAM.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the IPAM.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param operatingRegions Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(@Nullable Output<List<VpcIpamOperatingRegionGetArgs>> operatingRegions) {
            $.operatingRegions = operatingRegions;
            return this;
        }

        /**
         * @param operatingRegions Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(List<VpcIpamOperatingRegionGetArgs> operatingRegions) {
            return operatingRegions(Output.of(operatingRegions));
        }

        /**
         * @param operatingRegions Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
         * 
         * @return builder
         * 
         */
        public Builder operatingRegions(VpcIpamOperatingRegionGetArgs... operatingRegions) {
            return operatingRegions(List.of(operatingRegions));
        }

        /**
         * @param privateDefaultScopeId The ID of the IPAM&#39;s private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
         * 
         * @return builder
         * 
         */
        public Builder privateDefaultScopeId(@Nullable Output<String> privateDefaultScopeId) {
            $.privateDefaultScopeId = privateDefaultScopeId;
            return this;
        }

        /**
         * @param privateDefaultScopeId The ID of the IPAM&#39;s private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
         * 
         * @return builder
         * 
         */
        public Builder privateDefaultScopeId(String privateDefaultScopeId) {
            return privateDefaultScopeId(Output.of(privateDefaultScopeId));
        }

        /**
         * @param publicDefaultScopeId The ID of the IPAM&#39;s public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
         * IP space. The public scope is intended for all internet-routable IP space.
         * 
         * @return builder
         * 
         */
        public Builder publicDefaultScopeId(@Nullable Output<String> publicDefaultScopeId) {
            $.publicDefaultScopeId = publicDefaultScopeId;
            return this;
        }

        /**
         * @param publicDefaultScopeId The ID of the IPAM&#39;s public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
         * IP space. The public scope is intended for all internet-routable IP space.
         * 
         * @return builder
         * 
         */
        public Builder publicDefaultScopeId(String publicDefaultScopeId) {
            return publicDefaultScopeId(Output.of(publicDefaultScopeId));
        }

        /**
         * @param scopeCount The number of scopes in the IPAM.
         * 
         * @return builder
         * 
         */
        public Builder scopeCount(@Nullable Output<Integer> scopeCount) {
            $.scopeCount = scopeCount;
            return this;
        }

        /**
         * @param scopeCount The number of scopes in the IPAM.
         * 
         * @return builder
         * 
         */
        public Builder scopeCount(Integer scopeCount) {
            return scopeCount(Output.of(scopeCount));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public VpcIpamState build() {
            return $;
        }
    }

}
