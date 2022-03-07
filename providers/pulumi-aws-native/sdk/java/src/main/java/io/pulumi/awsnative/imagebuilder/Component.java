// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.imagebuilder.ComponentArgs;
import io.pulumi.awsnative.imagebuilder.enums.ComponentPlatform;
import io.pulumi.awsnative.imagebuilder.enums.ComponentType;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::ImageBuilder::Component
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:imagebuilder:Component")
public class Component extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the component.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the component.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The change description of the component.
     * 
     */
    @OutputExport(name="changeDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> changeDescription;

    /**
     * @return The change description of the component.
     * 
     */
    public Output</* @Nullable */ String> getChangeDescription() {
        return this.changeDescription;
    }
    /**
     * The data of the component.
     * 
     */
    @OutputExport(name="data", type=String.class, parameters={})
    private Output</* @Nullable */ String> data;

    /**
     * @return The data of the component.
     * 
     */
    public Output</* @Nullable */ String> getData() {
        return this.data;
    }
    /**
     * The description of the component.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the component.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The encryption status of the component.
     * 
     */
    @OutputExport(name="encrypted", type=Boolean.class, parameters={})
    private Output<Boolean> encrypted;

    /**
     * @return The encryption status of the component.
     * 
     */
    public Output<Boolean> getEncrypted() {
        return this.encrypted;
    }
    /**
     * The KMS key identifier used to encrypt the component.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The KMS key identifier used to encrypt the component.
     * 
     */
    public Output</* @Nullable */ String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The name of the component.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the component.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The platform of the component.
     * 
     */
    @OutputExport(name="platform", type=ComponentPlatform.class, parameters={})
    private Output<ComponentPlatform> platform;

    /**
     * @return The platform of the component.
     * 
     */
    public Output<ComponentPlatform> getPlatform() {
        return this.platform;
    }
    /**
     * The operating system (OS) version supported by the component.
     * 
     */
    @OutputExport(name="supportedOsVersions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> supportedOsVersions;

    /**
     * @return The operating system (OS) version supported by the component.
     * 
     */
    public Output</* @Nullable */ List<String>> getSupportedOsVersions() {
        return this.supportedOsVersions;
    }
    /**
     * The tags associated with the component.
     * 
     */
    @OutputExport(name="tags", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> tags;

    /**
     * @return The tags associated with the component.
     * 
     */
    public Output</* @Nullable */ Object> getTags() {
        return this.tags;
    }
    /**
     * The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    @OutputExport(name="type", type=ComponentType.class, parameters={})
    private Output<ComponentType> type;

    /**
     * @return The type of the component denotes whether the component is used to build the image or only to test it.
     * 
     */
    public Output<ComponentType> getType() {
        return this.type;
    }
    /**
     * The uri of the component.
     * 
     */
    @OutputExport(name="uri", type=String.class, parameters={})
    private Output</* @Nullable */ String> uri;

    /**
     * @return The uri of the component.
     * 
     */
    public Output</* @Nullable */ String> getUri() {
        return this.uri;
    }
    /**
     * The version of the component.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the component.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(ComponentArgs.Builder a);
    }
    private static io.pulumi.awsnative.imagebuilder.ComponentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.imagebuilder.ComponentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Component(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Component(String name) {
        this(name, ComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Component(String name, ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, ComponentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Component(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:imagebuilder:Component", name, null, makeResourceOptions(options, id));
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
    public static Component get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}