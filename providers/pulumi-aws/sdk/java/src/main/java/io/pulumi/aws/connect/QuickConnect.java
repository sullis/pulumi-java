// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.QuickConnectArgs;
import io.pulumi.aws.connect.inputs.QuickConnectState;
import io.pulumi.aws.connect.outputs.QuickConnectQuickConnectConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Quick Connect resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Amazon Connect Quick Connects can be imported using the `instance_id` and `quick_connect_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/quickConnect:QuickConnect example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/quickConnect:QuickConnect")
public class QuickConnect extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Quick Connect.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Quick Connect.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Quick Connect.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Quick Connect.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    @Export(name="quickConnectConfig", type=QuickConnectQuickConnectConfig.class, parameters={})
    private Output<QuickConnectQuickConnectConfig> quickConnectConfig;

    /**
     * @return A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    public Output<QuickConnectQuickConnectConfig> quickConnectConfig() {
        return this.quickConnectConfig;
    }
    /**
     * The identifier for the Quick Connect.
     * 
     */
    @Export(name="quickConnectId", type=String.class, parameters={})
    private Output<String> quickConnectId;

    /**
     * @return The identifier for the Quick Connect.
     * 
     */
    public Output<String> quickConnectId() {
        return this.quickConnectId;
    }
    /**
     * Tags to apply to the Quick Connect. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Quick Connect. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public QuickConnect(String name) {
        this(name, QuickConnectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public QuickConnect(String name, QuickConnectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public QuickConnect(String name, QuickConnectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/quickConnect:QuickConnect", name, args == null ? QuickConnectArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private QuickConnect(String name, Output<String> id, @Nullable QuickConnectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/quickConnect:QuickConnect", name, state, makeResourceOptions(options, id));
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
    public static QuickConnect get(String name, Output<String> id, @Nullable QuickConnectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QuickConnect(name, id, state, options);
    }
}
