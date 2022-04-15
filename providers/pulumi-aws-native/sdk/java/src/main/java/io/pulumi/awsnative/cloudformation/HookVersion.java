// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudformation;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.cloudformation.HookVersionArgs;
import io.pulumi.awsnative.cloudformation.enums.HookVersionVisibility;
import io.pulumi.awsnative.cloudformation.outputs.HookVersionLoggingConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Publishes new or first hook version to AWS CloudFormation Registry.
 * 
 */
@ResourceType(type="aws-native:cloudformation:HookVersion")
public class HookVersion extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type, here the HookVersion. This is used to uniquely identify a HookVersion resource
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * 
     */
    @Export(name="executionRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> executionRoleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the IAM execution role to use to register the type. If your resource type calls AWS APIs in any of its handlers, you must create an IAM execution role that includes the necessary permissions to call those AWS APIs, and provision that execution role in your account. CloudFormation then assumes that execution role to provide your resource type with the appropriate credentials.
     * 
     */
    public Output</* @Nullable */ String> executionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Indicates if this type version is the current default version
     * 
     */
    @Export(name="isDefaultVersion", type=Boolean.class, parameters={})
    private Output<Boolean> isDefaultVersion;

    /**
     * @return Indicates if this type version is the current default version
     * 
     */
    public Output<Boolean> isDefaultVersion() {
        return this.isDefaultVersion;
    }
    /**
     * Specifies logging configuration information for a type.
     * 
     */
    @Export(name="loggingConfig", type=HookVersionLoggingConfig.class, parameters={})
    private Output</* @Nullable */ HookVersionLoggingConfig> loggingConfig;

    /**
     * @return Specifies logging configuration information for a type.
     * 
     */
    public Output</* @Nullable */ HookVersionLoggingConfig> loggingConfig() {
        return this.loggingConfig;
    }
    /**
     * A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register.
     * 
     * For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.
     * 
     */
    @Export(name="schemaHandlerPackage", type=String.class, parameters={})
    private Output<String> schemaHandlerPackage;

    /**
     * @return A url to the S3 bucket containing the schema handler package that contains the schema, event handlers, and associated files for the type you want to register.
     * 
     * For information on generating a schema handler package for the type you want to register, see submit in the CloudFormation CLI User Guide.
     * 
     */
    public Output<String> schemaHandlerPackage() {
        return this.schemaHandlerPackage;
    }
    /**
     * The Amazon Resource Name (ARN) of the type without the versionID.
     * 
     */
    @Export(name="typeArn", type=String.class, parameters={})
    private Output<String> typeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the type without the versionID.
     * 
     */
    public Output<String> typeArn() {
        return this.typeArn;
    }
    /**
     * The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    @Export(name="typeName", type=String.class, parameters={})
    private Output<String> typeName;

    /**
     * @return The name of the type being registered.
     * 
     * We recommend that type names adhere to the following pattern: company_or_organization::service::type.
     * 
     */
    public Output<String> typeName() {
        return this.typeName;
    }
    /**
     * The ID of the version of the type represented by this hook instance.
     * 
     */
    @Export(name="versionId", type=String.class, parameters={})
    private Output<String> versionId;

    /**
     * @return The ID of the version of the type represented by this hook instance.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
     */
    @Export(name="visibility", type=HookVersionVisibility.class, parameters={})
    private Output<HookVersionVisibility> visibility;

    /**
     * @return The scope at which the type is visible and usable in CloudFormation operations.
     * 
     * Valid values include:
     * 
     * PRIVATE: The type is only visible and usable within the account in which it is registered. Currently, AWS CloudFormation marks any types you register as PRIVATE.
     * 
     * PUBLIC: The type is publically visible and usable within any Amazon account.
     * 
     */
    public Output<HookVersionVisibility> visibility() {
        return this.visibility;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HookVersion(String name) {
        this(name, HookVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HookVersion(String name, HookVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HookVersion(String name, HookVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookVersion", name, args == null ? HookVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HookVersion(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:cloudformation:HookVersion", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static HookVersion get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new HookVersion(name, id, options);
    }
}
