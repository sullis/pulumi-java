// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.emr.StudioSessionMappingArgs;
import io.pulumi.aws.emr.inputs.StudioSessionMappingState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic MapReduce Studio Session Mapping.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * EMR studio session mappings can be imported using the `id`, e.g., `studio-id:identity-type:identity-id`
 * 
 * ```sh
 *  $ pulumi import aws:emr/studioSessionMapping:StudioSessionMapping example es-xxxxx:USER:xxxxx-xxx-xxx
 * ```
 * 
 */
@ResourceType(type="aws:emr/studioSessionMapping:StudioSessionMapping")
public class StudioSessionMapping extends io.pulumi.resources.CustomResource {
    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Export(name="identityId", type=String.class, parameters={})
    private Output<String> identityId;

    /**
     * @return The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Output<String> identityId() {
        return this.identityId;
    }
    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Export(name="identityName", type=String.class, parameters={})
    private Output<String> identityName;

    /**
     * @return The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    public Output<String> identityName() {
        return this.identityName;
    }
    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @Export(name="identityType", type=String.class, parameters={})
    private Output<String> identityType;

    /**
     * @return Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    public Output<String> identityType() {
        return this.identityType;
    }
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @Export(name="sessionPolicyArn", type=String.class, parameters={})
    private Output<String> sessionPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    public Output<String> sessionPolicyArn() {
        return this.sessionPolicyArn;
    }
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Export(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    public Output<String> studioId() {
        return this.studioId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StudioSessionMapping(String name) {
        this(name, StudioSessionMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StudioSessionMapping(String name, StudioSessionMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/studioSessionMapping:StudioSessionMapping", name, args == null ? StudioSessionMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StudioSessionMapping(String name, Output<String> id, @Nullable StudioSessionMappingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:emr/studioSessionMapping:StudioSessionMapping", name, state, makeResourceOptions(options, id));
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
    public static StudioSessionMapping get(String name, Output<String> id, @Nullable StudioSessionMappingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StudioSessionMapping(name, id, state, options);
    }
}
