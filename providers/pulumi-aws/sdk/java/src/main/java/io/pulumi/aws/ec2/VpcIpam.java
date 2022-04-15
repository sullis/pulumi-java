// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamState;
import io.pulumi.aws.ec2.outputs.VpcIpamOperatingRegion;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a IPAM resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `ipam id`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpam:VpcIpam example ipam-0178368ad2146a492
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpam:VpcIpam")
public class VpcIpam extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of IPAM
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of IPAM
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description for the IPAM.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the IPAM.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    @Export(name="operatingRegions", type=List.class, parameters={VpcIpamOperatingRegion.class})
    private Output<List<VpcIpamOperatingRegion>> operatingRegions;

    /**
     * @return Determines which locales can be chosen when you create pools. Locale is the Region where you want to make an IPAM pool available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC's Region. You specify a region using the region_name parameter. You **must** set your provider block region as an operating_region.
     * 
     */
    public Output<List<VpcIpamOperatingRegion>> operatingRegions() {
        return this.operatingRegions;
    }
    /**
     * The ID of the IPAM's private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Export(name="privateDefaultScopeId", type=String.class, parameters={})
    private Output<String> privateDefaultScopeId;

    /**
     * @return The ID of the IPAM's private scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    public Output<String> privateDefaultScopeId() {
        return this.privateDefaultScopeId;
    }
    /**
     * The ID of the IPAM's public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
     * IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    @Export(name="publicDefaultScopeId", type=String.class, parameters={})
    private Output<String> publicDefaultScopeId;

    /**
     * @return The ID of the IPAM's public scope. A scope is a top-level container in IPAM. Each scope represents an IP-independent network. Scopes enable you to represent networks where you have overlapping IP space. When you create an IPAM, IPAM automatically creates two scopes: public and private. The private scope is intended for private
     * IP space. The public scope is intended for all internet-routable IP space.
     * 
     */
    public Output<String> publicDefaultScopeId() {
        return this.publicDefaultScopeId;
    }
    /**
     * The number of scopes in the IPAM.
     * 
     */
    @Export(name="scopeCount", type=Integer.class, parameters={})
    private Output<Integer> scopeCount;

    /**
     * @return The number of scopes in the IPAM.
     * 
     */
    public Output<Integer> scopeCount() {
        return this.scopeCount;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcIpam(String name) {
        this(name, VpcIpamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcIpam(String name, VpcIpamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpam(String name, VpcIpamArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpam:VpcIpam", name, args == null ? VpcIpamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcIpam(String name, Output<String> id, @Nullable VpcIpamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpam:VpcIpam", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpcIpam get(String name, Output<String> id, @Nullable VpcIpamState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpam(name, id, state, options);
    }
}
