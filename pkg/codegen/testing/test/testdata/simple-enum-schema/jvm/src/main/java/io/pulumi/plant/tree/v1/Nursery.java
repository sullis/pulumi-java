// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree.v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.plant.Utilities;
import io.pulumi.plant.tree.v1.NurseryArgs;
import javax.annotation.Nullable;

@ResourceType(type="plant:tree/v1:Nursery")
public class Nursery extends io.pulumi.resources.CustomResource {
    public Nursery(String name, NurseryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:Nursery", name, args == null ? NurseryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Nursery(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:Nursery", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Nursery get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Nursery(name, id, options);
    }
}
