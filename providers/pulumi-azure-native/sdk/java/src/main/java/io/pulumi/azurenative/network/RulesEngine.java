// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.RulesEngineArgs;
import io.pulumi.azurenative.network.outputs.RulesEngineRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A rules engine configuration containing a list of rules that will run to modify the runtime behavior of the request and response.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:RulesEngine rulesEngine1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/frontDoors/frontDoor1/rulesEngines/rulesEngine1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:RulesEngine")
public class RulesEngine extends io.pulumi.resources.CustomResource {
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource status.
     * 
     */
    @OutputExport(name="resourceState", type=String.class, parameters={})
    private Output<String> resourceState;

    /**
     * @return Resource status.
     * 
     */
    public Output<String> getResourceState() {
        return this.resourceState;
    }
    /**
     * A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    @OutputExport(name="rules", type=List.class, parameters={RulesEngineRuleResponse.class})
    private Output</* @Nullable */ List<RulesEngineRuleResponse>> rules;

    /**
     * @return A list of rules that define a particular Rules Engine Configuration.
     * 
     */
    public Output</* @Nullable */ List<RulesEngineRuleResponse>> getRules() {
        return this.rules;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(RulesEngineArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.RulesEngineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.RulesEngineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RulesEngine(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RulesEngine(String name) {
        this(name, RulesEngineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RulesEngine(String name, RulesEngineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RulesEngine(String name, RulesEngineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RulesEngine", name, args == null ? RulesEngineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RulesEngine(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:RulesEngine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:network/v20200101:RulesEngine").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200401:RulesEngine").build()),
                Input.of(Alias.builder().setType("azure-native:network/v20200501:RulesEngine").build())
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
    public static RulesEngine get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RulesEngine(name, id, options);
    }
}