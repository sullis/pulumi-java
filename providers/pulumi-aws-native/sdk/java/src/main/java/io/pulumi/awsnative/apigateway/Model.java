// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.apigateway.ModelArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:apigateway:Model")
public class Model extends io.pulumi.resources.CustomResource {
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    @OutputExport(name="restApiId", type=String.class, parameters={})
    private Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId;
    }
    @OutputExport(name="schema", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> schema;

    public Output</* @Nullable */ Object> getSchema() {
        return this.schema;
    }

    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Model(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:Model", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Model get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, options);
    }
}
