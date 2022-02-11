// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.frauddetector.OutcomeArgs;
import io.pulumi.awsnative.frauddetector.outputs.OutcomeTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:frauddetector:Outcome")
public class Outcome extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    public Output<String> getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="tags", type=List.class, parameters={OutcomeTag.class})
    private Output</* @Nullable */ List<OutcomeTag>> tags;

    public Output</* @Nullable */ List<OutcomeTag>> getTags() {
        return this.tags;
    }

    public Outcome(String name, @Nullable OutcomeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Outcome", name, args == null ? OutcomeArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Outcome(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:frauddetector:Outcome", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Outcome get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Outcome(name, id, options);
    }
}
