// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ram.ResourceShareAccepterArgs;
import io.pulumi.aws.ram.inputs.ResourceShareAccepterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manage accepting a Resource Access Manager (RAM) Resource Share invitation. From a _receiver_ AWS account, accept an invitation to share resources that were shared by a _sender_ AWS account. To create a resource share in the _sender_, see the `aws.ram.ResourceShare` resource.
 * 
 * > **Note:** If both AWS accounts are in the same Organization and [RAM Sharing with AWS Organizations is enabled](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs), this resource is not necessary as RAM Resource Share invitations are not used.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Resource share accepters can be imported using the resource share ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ram/resourceShareAccepter:ResourceShareAccepter example arn:aws:ram:us-east-1:123456789012:resource-share/c4b56393-e8d9-89d9-6dc9-883752de4767
 * ```
 * 
 */
@ResourceType(type="aws:ram/resourceShareAccepter:ResourceShareAccepter")
public class ResourceShareAccepter extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the resource share invitation.
     * 
     */
    @Export(name="invitationArn", type=String.class, parameters={})
    private Output<String> invitationArn;

    /**
     * @return The ARN of the resource share invitation.
     * 
     */
    public Output<String> invitationArn() {
        return this.invitationArn;
    }
    /**
     * The account ID of the receiver account which accepts the invitation.
     * 
     */
    @Export(name="receiverAccountId", type=String.class, parameters={})
    private Output<String> receiverAccountId;

    /**
     * @return The account ID of the receiver account which accepts the invitation.
     * 
     */
    public Output<String> receiverAccountId() {
        return this.receiverAccountId;
    }
    /**
     * A list of the resource ARNs shared via the resource share.
     * 
     */
    @Export(name="resources", type=List.class, parameters={String.class})
    private Output<List<String>> resources;

    /**
     * @return A list of the resource ARNs shared via the resource share.
     * 
     */
    public Output<List<String>> resources() {
        return this.resources;
    }
    /**
     * The account ID of the sender account which submits the invitation.
     * 
     */
    @Export(name="senderAccountId", type=String.class, parameters={})
    private Output<String> senderAccountId;

    /**
     * @return The account ID of the sender account which submits the invitation.
     * 
     */
    public Output<String> senderAccountId() {
        return this.senderAccountId;
    }
    /**
     * The ARN of the resource share.
     * 
     */
    @Export(name="shareArn", type=String.class, parameters={})
    private Output<String> shareArn;

    /**
     * @return The ARN of the resource share.
     * 
     */
    public Output<String> shareArn() {
        return this.shareArn;
    }
    /**
     * The ID of the resource share as displayed in the console.
     * 
     */
    @Export(name="shareId", type=String.class, parameters={})
    private Output<String> shareId;

    /**
     * @return The ID of the resource share as displayed in the console.
     * 
     */
    public Output<String> shareId() {
        return this.shareId;
    }
    /**
     * The name of the resource share.
     * 
     */
    @Export(name="shareName", type=String.class, parameters={})
    private Output<String> shareName;

    /**
     * @return The name of the resource share.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }
    /**
     * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceShareAccepter(String name) {
        this(name, ResourceShareAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceShareAccepter(String name, ResourceShareAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceShareAccepter(String name, ResourceShareAccepterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShareAccepter:ResourceShareAccepter", name, args == null ? ResourceShareAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceShareAccepter(String name, Output<String> id, @Nullable ResourceShareAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShareAccepter:ResourceShareAccepter", name, state, makeResourceOptions(options, id));
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
    public static ResourceShareAccepter get(String name, Output<String> id, @Nullable ResourceShareAccepterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceShareAccepter(name, id, state, options);
    }
}
