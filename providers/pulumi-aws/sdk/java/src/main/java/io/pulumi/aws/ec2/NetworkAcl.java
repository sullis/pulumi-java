// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.NetworkAclArgs;
import io.pulumi.aws.ec2.inputs.NetworkAclState;
import io.pulumi.aws.ec2.outputs.NetworkAclEgress;
import io.pulumi.aws.ec2.outputs.NetworkAclIngress;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an network ACL resource. You might set up network ACLs with rules similar
 * to your security groups in order to add an additional layer of security to your VPC.
 * 
 * > **NOTE on Network ACLs and Network ACL Rules:** This provider currently
 * provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
 * defined in-line. At this time you cannot use a Network ACL with in-line rules
 * in conjunction with any Network ACL Rule resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Network ACLs can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/networkAcl:NetworkAcl main acl-7aaabd18
 * ```
 * 
 */
@ResourceType(type="aws:ec2/networkAcl:NetworkAcl")
public class NetworkAcl extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the network ACL
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the network ACL
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies an egress rule. Parameters defined below.
     * 
     */
    @Export(name="egress", type=List.class, parameters={NetworkAclEgress.class})
    private Output<List<NetworkAclEgress>> egress;

    /**
     * @return Specifies an egress rule. Parameters defined below.
     * 
     */
    public Output<List<NetworkAclEgress>> egress() {
        return this.egress;
    }
    /**
     * Specifies an ingress rule. Parameters defined below.
     * 
     */
    @Export(name="ingress", type=List.class, parameters={NetworkAclIngress.class})
    private Output<List<NetworkAclIngress>> ingress;

    /**
     * @return Specifies an ingress rule. Parameters defined below.
     * 
     */
    public Output<List<NetworkAclIngress>> ingress() {
        return this.ingress;
    }
    /**
     * The ID of the AWS account that owns the network ACL.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the network ACL.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A list of Subnet IDs to apply the ACL to
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return A list of Subnet IDs to apply the ACL to
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The ID of the associated VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the associated VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAcl(String name) {
        this(name, NetworkAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAcl(String name, NetworkAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAcl(String name, NetworkAclArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAcl:NetworkAcl", name, args == null ? NetworkAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAcl(String name, Output<String> id, @Nullable NetworkAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAcl:NetworkAcl", name, state, makeResourceOptions(options, id));
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
    public static NetworkAcl get(String name, Output<String> id, @Nullable NetworkAclState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAcl(name, id, state, options);
    }
}
