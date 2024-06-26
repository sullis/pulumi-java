// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.ExampleServerArgs;
import com.pulumi.example.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="example:index:ExampleServer")
public class ExampleServer extends com.pulumi.resources.CustomResource {
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExampleServer(String name) {
        this(name, ExampleServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExampleServer(String name, @Nullable ExampleServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExampleServer(String name, @Nullable ExampleServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example:index:ExampleServer", name, args == null ? ExampleServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExampleServer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example:index:ExampleServer", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ExampleServer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExampleServer(name, id, options);
    }
}
