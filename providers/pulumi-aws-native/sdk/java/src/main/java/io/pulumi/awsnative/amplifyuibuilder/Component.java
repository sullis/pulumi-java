// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.amplifyuibuilder.ComponentArgs;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentBindingProperties;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentChild;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentCollectionProperties;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentOverrides;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentProperties;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentTags;
import io.pulumi.awsnative.amplifyuibuilder.outputs.ComponentVariant;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Definition of AWS::AmplifyUIBuilder::Component Resource Type
 * 
 */
@ResourceType(type="aws-native:amplifyuibuilder:Component")
public class Component extends io.pulumi.resources.CustomResource {
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }
    @Export(name="bindingProperties", type=ComponentBindingProperties.class, parameters={})
    private Output</* @Nullable */ ComponentBindingProperties> bindingProperties;

    public Output</* @Nullable */ ComponentBindingProperties> bindingProperties() {
        return this.bindingProperties;
    }
    @Export(name="children", type=List.class, parameters={ComponentChild.class})
    private Output</* @Nullable */ List<ComponentChild>> children;

    public Output</* @Nullable */ List<ComponentChild>> children() {
        return this.children;
    }
    @Export(name="collectionProperties", type=ComponentCollectionProperties.class, parameters={})
    private Output</* @Nullable */ ComponentCollectionProperties> collectionProperties;

    public Output</* @Nullable */ ComponentCollectionProperties> collectionProperties() {
        return this.collectionProperties;
    }
    @Export(name="componentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> componentType;

    public Output</* @Nullable */ String> componentType() {
        return this.componentType;
    }
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> createdAt() {
        return this.createdAt;
    }
    @Export(name="environmentName", type=String.class, parameters={})
    private Output<String> environmentName;

    public Output<String> environmentName() {
        return this.environmentName;
    }
    @Export(name="modifiedAt", type=String.class, parameters={})
    private Output<String> modifiedAt;

    public Output<String> modifiedAt() {
        return this.modifiedAt;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> name() {
        return this.name;
    }
    @Export(name="overrides", type=ComponentOverrides.class, parameters={})
    private Output</* @Nullable */ ComponentOverrides> overrides;

    public Output</* @Nullable */ ComponentOverrides> overrides() {
        return this.overrides;
    }
    @Export(name="properties", type=ComponentProperties.class, parameters={})
    private Output</* @Nullable */ ComponentProperties> properties;

    public Output</* @Nullable */ ComponentProperties> properties() {
        return this.properties;
    }
    @Export(name="sourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceId;

    public Output</* @Nullable */ String> sourceId() {
        return this.sourceId;
    }
    @Export(name="tags", type=ComponentTags.class, parameters={})
    private Output</* @Nullable */ ComponentTags> tags;

    public Output</* @Nullable */ ComponentTags> tags() {
        return this.tags;
    }
    @Export(name="variants", type=List.class, parameters={ComponentVariant.class})
    private Output</* @Nullable */ List<ComponentVariant>> variants;

    public Output</* @Nullable */ List<ComponentVariant>> variants() {
        return this.variants;
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
    public Component(String name, @Nullable ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, @Nullable ComponentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Component(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:amplifyuibuilder:Component", name, null, makeResourceOptions(options, id));
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
    public static Component get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}
