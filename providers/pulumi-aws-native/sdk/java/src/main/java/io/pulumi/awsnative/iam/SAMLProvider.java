// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iam.SAMLProviderArgs;
import io.pulumi.awsnative.iam.outputs.SAMLProviderTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::IAM::SAMLProvider
 * 
 */
@ResourceType(type="aws-native:iam:SAMLProvider")
public class SAMLProvider extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="samlMetadataDocument", type=String.class, parameters={})
    private Output<String> samlMetadataDocument;

    public Output<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument;
    }
    @OutputExport(name="tags", type=List.class, parameters={SAMLProviderTag.class})
    private Output</* @Nullable */ List<SAMLProviderTag>> tags;

    public Output</* @Nullable */ List<SAMLProviderTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(SAMLProviderArgs.Builder a);
    }
    private static io.pulumi.awsnative.iam.SAMLProviderArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.iam.SAMLProviderArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SAMLProvider(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SAMLProvider(String name) {
        this(name, SAMLProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SAMLProvider(String name, SAMLProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SAMLProvider(String name, SAMLProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:SAMLProvider", name, args == null ? SAMLProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SAMLProvider(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iam:SAMLProvider", name, null, makeResourceOptions(options, id));
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
    public static SAMLProvider get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SAMLProvider(name, id, options);
    }
}