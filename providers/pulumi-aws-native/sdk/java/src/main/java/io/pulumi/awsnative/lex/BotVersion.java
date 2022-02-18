// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.lex.BotVersionArgs;
import io.pulumi.awsnative.lex.outputs.BotVersionLocaleSpecification;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A version is a numbered snapshot of your work that you can publish for use in different parts of your workflow, such as development, beta deployment, and production.
 * 
 */
@ResourceType(type="aws-native:lex:BotVersion")
public class BotVersion extends io.pulumi.resources.CustomResource {
    @OutputExport(name="botId", type=String.class, parameters={})
    private Output<String> botId;

    public Output<String> getBotId() {
        return this.botId;
    }
    @OutputExport(name="botVersion", type=String.class, parameters={})
    private Output<String> botVersion;

    public Output<String> getBotVersion() {
        return this.botVersion;
    }
    @OutputExport(name="botVersionLocaleSpecification", type=List.class, parameters={BotVersionLocaleSpecification.class})
    private Output<List<BotVersionLocaleSpecification>> botVersionLocaleSpecification;

    public Output<List<BotVersionLocaleSpecification>> getBotVersionLocaleSpecification() {
        return this.botVersionLocaleSpecification;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotVersion(String name, BotVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:BotVersion", name, args == null ? BotVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BotVersion(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:lex:BotVersion", name, null, makeResourceOptions(options, id));
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
    public static BotVersion get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BotVersion(name, id, options);
    }
}
