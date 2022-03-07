// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1;

import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.CustomResourceDefinitionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionSpec;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.CustomResourceDefinitionStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>.
 * 
 */
@ResourceType(type="kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinition")
public class CustomResourceDefinition extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * spec describes how the user wants the resources to appear
     * 
     */
    @OutputExport(name="spec", type=CustomResourceDefinitionSpec.class, parameters={})
    private Output<CustomResourceDefinitionSpec> spec;

    /**
     * @return spec describes how the user wants the resources to appear
     * 
     */
    public Output<CustomResourceDefinitionSpec> getSpec() {
        return this.spec;
    }
    /**
     * status indicates the actual state of the CustomResourceDefinition
     * 
     */
    @OutputExport(name="status", type=CustomResourceDefinitionStatus.class, parameters={})
    private Output</* @Nullable */ CustomResourceDefinitionStatus> status;

    /**
     * @return status indicates the actual state of the CustomResourceDefinition
     * 
     */
    public Output</* @Nullable */ CustomResourceDefinitionStatus> getStatus() {
        return this.status;
    }

    public interface BuilderApplicator {
        public void apply(CustomResourceDefinitionArgs.Builder a);
    }
    private static io.pulumi.kubernetes.apiextensions.k8s.io_v1.CustomResourceDefinitionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.kubernetes.apiextensions.k8s.io_v1.CustomResourceDefinitionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CustomResourceDefinition(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomResourceDefinition(String name) {
        this(name, CustomResourceDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomResourceDefinition(String name, CustomResourceDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomResourceDefinition(String name, CustomResourceDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinition", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private CustomResourceDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:apiextensions.k8s.io/v1:CustomResourceDefinition", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceDefinitionArgs makeArgs(CustomResourceDefinitionArgs args) {
        var builder = args == null ? CustomResourceDefinitionArgs.builder() : CustomResourceDefinitionArgs.builder(args);
        return builder
            .setApiVersion("apiextensions.k8s.io/v1")
            .setKind("CustomResourceDefinition")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("kubernetes:apiextensions.k8s.io/v1beta1:CustomResourceDefinition").build())
            ))
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
    public static CustomResourceDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CustomResourceDefinition(name, id, options);
    }
}