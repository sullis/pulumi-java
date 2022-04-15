// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codecommit.ApprovalRuleTemplateArgs;
import io.pulumi.aws.codecommit.inputs.ApprovalRuleTemplateState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeCommit Approval Rule Template Resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeCommit approval rule templates can be imported using the `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate imported ExistingApprovalRuleTemplateName
 * ```
 * 
 */
@ResourceType(type="aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate")
public class ApprovalRuleTemplate extends io.pulumi.resources.CustomResource {
    /**
     * The ID of the approval rule template
     * 
     */
    @Export(name="approvalRuleTemplateId", type=String.class, parameters={})
    private Output<String> approvalRuleTemplateId;

    /**
     * @return The ID of the approval rule template
     * 
     */
    public Output<String> approvalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }
    /**
     * The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    @Export(name="content", type=String.class, parameters={})
    private Output<String> content;

    /**
     * @return The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> creationDate() {
        return this.creationDate;
    }
    /**
     * The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @Export(name="lastModifiedDate", type=String.class, parameters={})
    private Output<String> lastModifiedDate;

    /**
     * @return The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    public Output<String> lastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
     */
    @Export(name="lastModifiedUser", type=String.class, parameters={})
    private Output<String> lastModifiedUser;

    /**
     * @return The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
     */
    public Output<String> lastModifiedUser() {
        return this.lastModifiedUser;
    }
    /**
     * The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The SHA-256 hash signature for the content of the approval rule template.
     * 
     */
    @Export(name="ruleContentSha256", type=String.class, parameters={})
    private Output<String> ruleContentSha256;

    /**
     * @return The SHA-256 hash signature for the content of the approval rule template.
     * 
     */
    public Output<String> ruleContentSha256() {
        return this.ruleContentSha256;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApprovalRuleTemplate(String name) {
        this(name, ApprovalRuleTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApprovalRuleTemplate(String name, ApprovalRuleTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApprovalRuleTemplate(String name, ApprovalRuleTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate", name, args == null ? ApprovalRuleTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApprovalRuleTemplate(String name, Output<String> id, @Nullable ApprovalRuleTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codecommit/approvalRuleTemplate:ApprovalRuleTemplate", name, state, makeResourceOptions(options, id));
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
    public static ApprovalRuleTemplate get(String name, Output<String> id, @Nullable ApprovalRuleTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApprovalRuleTemplate(name, id, state, options);
    }
}
