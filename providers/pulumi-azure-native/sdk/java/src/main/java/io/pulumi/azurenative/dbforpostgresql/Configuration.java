// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbforpostgresql.ConfigurationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a Configuration.
 * API Version: 2017-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:dbforpostgresql:Configuration array_nulls /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestGroup/providers/Microsoft.DBforPostgreSQL/servers/testserver/configurations/array_nulls 
 * ```
 * 
 */
@ResourceType(type="azure-native:dbforpostgresql:Configuration")
public class Configuration extends io.pulumi.resources.CustomResource {
    /**
     * Allowed values of the configuration.
     * 
     */
    @OutputExport(name="allowedValues", type=String.class, parameters={})
    private Output<String> allowedValues;

    /**
     * @return Allowed values of the configuration.
     * 
     */
    public Output<String> getAllowedValues() {
        return this.allowedValues;
    }
    /**
     * Data type of the configuration.
     * 
     */
    @OutputExport(name="dataType", type=String.class, parameters={})
    private Output<String> dataType;

    /**
     * @return Data type of the configuration.
     * 
     */
    public Output<String> getDataType() {
        return this.dataType;
    }
    /**
     * Default value of the configuration.
     * 
     */
    @OutputExport(name="defaultValue", type=String.class, parameters={})
    private Output<String> defaultValue;

    /**
     * @return Default value of the configuration.
     * 
     */
    public Output<String> getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Description of the configuration.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the configuration.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Source of the configuration.
     * 
     */
    @OutputExport(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Source of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getSource() {
        return this.source;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Value of the configuration.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return Value of the configuration.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(ConfigurationArgs.Builder a);
    }
    private static io.pulumi.azurenative.dbforpostgresql.ConfigurationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.dbforpostgresql.ConfigurationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Configuration(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Configuration(String name) {
        this(name, ConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Configuration(String name, ConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Configuration(String name, ConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Configuration", name, args == null ? ConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Configuration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:dbforpostgresql:Configuration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201:Configuration").build()),
                Input.of(Alias.builder().setType("azure-native:dbforpostgresql/v20171201preview:Configuration").build())
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
    public static Configuration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Configuration(name, id, options);
    }
}