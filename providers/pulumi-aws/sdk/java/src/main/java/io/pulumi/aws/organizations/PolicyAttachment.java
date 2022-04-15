// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.organizations;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.organizations.PolicyAttachmentArgs;
import io.pulumi.aws.organizations.inputs.PolicyAttachmentState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to attach an AWS Organizations policy to an organization account, root, or unit.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_organizations_policy_attachment` can be imported by using the target ID and policy ID, e.g., with an account target
 * 
 * ```sh
 *  $ pulumi import aws:organizations/policyAttachment:PolicyAttachment account 123456789012:p-12345678
 * ```
 * 
 */
@ResourceType(type="aws:organizations/policyAttachment:PolicyAttachment")
public class PolicyAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The unique identifier (ID) of the policy that you want to attach to the target.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The unique identifier (ID) of the policy that you want to attach to the target.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }
    /**
     * The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     * 
     */
    @Export(name="targetId", type=String.class, parameters={})
    private Output<String> targetId;

    /**
     * @return The unique identifier (ID) of the root, organizational unit, or account number that you want to attach the policy to.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyAttachment(String name) {
        this(name, PolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/policyAttachment:PolicyAttachment", name, args == null ? PolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyAttachment(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:organizations/policyAttachment:PolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static PolicyAttachment get(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAttachment(name, id, state, options);
    }
}
