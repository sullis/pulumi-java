// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.memorydb.UserArgs;
import io.pulumi.aws.memorydb.inputs.UserState;
import io.pulumi.aws.memorydb.outputs.UserAuthenticationMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Use the `user_name` to import a user. For example
 * 
 * ```sh
 *  $ pulumi import aws:memorydb/user:User example my-user
 * ```
 * 
 *  The `passwords` are not available for imported resources, as this information cannot be read back from the MemoryDB API.
 * 
 */
@ResourceType(type="aws:memorydb/user:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * The access permissions string used for this user.
     * 
     */
    @Export(name="accessString", type=String.class, parameters={})
    private Output<String> accessString;

    /**
     * @return The access permissions string used for this user.
     * 
     */
    public Output<String> accessString() {
        return this.accessString;
    }
    /**
     * The ARN of the user.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the user.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Denotes the user's authentication properties. Detailed below.
     * 
     */
    @Export(name="authenticationMode", type=UserAuthenticationMode.class, parameters={})
    private Output<UserAuthenticationMode> authenticationMode;

    /**
     * @return Denotes the user's authentication properties. Detailed below.
     * 
     */
    public Output<UserAuthenticationMode> authenticationMode() {
        return this.authenticationMode;
    }
    /**
     * The minimum engine version supported for the user.
     * * `authentication_mode` configuration block
     * 
     */
    @Export(name="minimumEngineVersion", type=String.class, parameters={})
    private Output<String> minimumEngineVersion;

    /**
     * @return The minimum engine version supported for the user.
     * * `authentication_mode` configuration block
     * 
     */
    public Output<String> minimumEngineVersion() {
        return this.minimumEngineVersion;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Name of the MemoryDB user. Up to 40 characters.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Name of the MemoryDB user. Up to 40 characters.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:memorydb/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
