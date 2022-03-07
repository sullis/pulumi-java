// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.ResourceDefaultVersionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The default version of a resource that has been registered in the CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:ResourceDefaultVersion")
public class ResourceDefaultVersion extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a ResourceDefaultVersion
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a ResourceDefaultVersion
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @OutputExport(name="typeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeName;

    /**
     * @return The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    public Output</* @Nullable */ String> getTypeName() {
        return this.typeName;
    }
    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @OutputExport(name="typeVersionArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeVersionArn;

    /**
     * @return The Amazon Resource Name (ARN) of the type version.
     * 
     */
    public Output</* @Nullable */ String> getTypeVersionArn() {
        return this.typeVersionArn;
    }
    /**
     * The ID of an existing version of the resource to set as the default.
     * 
     */
    @OutputExport(name="versionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> versionId;

    /**
     * @return The ID of an existing version of the resource to set as the default.
     * 
     */
    public Output</* @Nullable */ String> getVersionId() {
        return this.versionId;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResourceDefaultVersionArgs.Builder a);
    }
    private static io.pulumi.awsnative.cloudformation.ResourceDefaultVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.cloudformation.ResourceDefaultVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResourceDefaultVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceDefaultVersion(String name) {
        this(name, ResourceDefaultVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceDefaultVersion(String name, @Nullable ResourceDefaultVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceDefaultVersion(String name, @Nullable ResourceDefaultVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:ResourceDefaultVersion", name, args == null ? ResourceDefaultVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResourceDefaultVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:ResourceDefaultVersion", name, null, makeResourceOptions(options, id));
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
    public static ResourceDefaultVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResourceDefaultVersion(name, id, options);
    }
}