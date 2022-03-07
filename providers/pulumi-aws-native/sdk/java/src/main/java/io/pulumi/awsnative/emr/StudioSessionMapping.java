// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emr;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.emr.StudioSessionMappingArgs;
import io.pulumi.awsnative.emr.enums.StudioSessionMappingIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:emr:StudioSessionMapping")
public class StudioSessionMapping extends io.pulumi.resources.CustomResource {
    /**
     * The name of the user or group. For more information, see UserName and DisplayName in the AWS SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
     * 
     */
    @OutputExport(name="identityName", type=String.class, parameters={})
    private Output<String> identityName;

    /**
     * @return The name of the user or group. For more information, see UserName and DisplayName in the AWS SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
     * 
     */
    public Output<String> getIdentityName() {
        return this.identityName;
    }
    /**
     * Specifies whether the identity to map to the Studio is a user or a group.
     * 
     */
    @OutputExport(name="identityType", type=StudioSessionMappingIdentityType.class, parameters={})
    private Output<StudioSessionMappingIdentityType> identityType;

    /**
     * @return Specifies whether the identity to map to the Studio is a user or a group.
     * 
     */
    public Output<StudioSessionMappingIdentityType> getIdentityType() {
        return this.identityType;
    }
    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    @OutputExport(name="sessionPolicyArn", type=String.class, parameters={})
    private Output<String> sessionPolicyArn;

    /**
     * @return The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. Session policies refine Studio user permissions without the need to use multiple IAM user roles.
     * 
     */
    public Output<String> getSessionPolicyArn() {
        return this.sessionPolicyArn;
    }
    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @OutputExport(name="studioId", type=String.class, parameters={})
    private Output<String> studioId;

    /**
     * @return The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    public Output<String> getStudioId() {
        return this.studioId;
    }

    public interface BuilderApplicator {
        public void apply(StudioSessionMappingArgs.Builder a);
    }
    private static io.pulumi.awsnative.emr.StudioSessionMappingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.emr.StudioSessionMappingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public StudioSessionMapping(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
        super("aws-native:emr:StudioSessionMapping", name, args == null ? StudioSessionMappingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private StudioSessionMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:emr:StudioSessionMapping", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static StudioSessionMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StudioSessionMapping(name, id, options);
    }
}