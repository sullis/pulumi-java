// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurearcdata.SqlManagedInstanceArgs;
import io.pulumi.azurenative.azurearcdata.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.azurearcdata.outputs.SqlManagedInstancePropertiesResponse;
import io.pulumi.azurenative.azurearcdata.outputs.SqlManagedInstanceSkuResponse;
import io.pulumi.azurenative.azurearcdata.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A SqlManagedInstance.
 * API Version: 2021-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azurearcdata:SqlManagedInstance testsqlManagedInstance /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.AzureArcData/sqlManagedInstances/testsqlManagedInstance 
 * ```
 * 
 */
@ResourceType(type="azure-native:azurearcdata:SqlManagedInstance")
public class SqlManagedInstance extends io.pulumi.resources.CustomResource {
    /**
     * The extendedLocation of the resource.
     * 
     */
    @OutputExport(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extendedLocation of the resource.
     * 
     */
    public Output</* @Nullable */ ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
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
     * null
     * 
     */
    @OutputExport(name="properties", type=SqlManagedInstancePropertiesResponse.class, parameters={})
    private Output<SqlManagedInstancePropertiesResponse> properties;

    /**
     * @return null
     * 
     */
    public Output<SqlManagedInstancePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource sku.
     * 
     */
    @OutputExport(name="sku", type=SqlManagedInstanceSkuResponse.class, parameters={})
    private Output</* @Nullable */ SqlManagedInstanceSkuResponse> sku;

    /**
     * @return Resource sku.
     * 
     */
    public Output</* @Nullable */ SqlManagedInstanceSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Read only system data
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Read only system data
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(SqlManagedInstanceArgs.Builder a);
    }
    private static io.pulumi.azurenative.azurearcdata.SqlManagedInstanceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.azurearcdata.SqlManagedInstanceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlManagedInstance(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlManagedInstance(String name) {
        this(name, SqlManagedInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlManagedInstance(String name, SqlManagedInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlManagedInstance(String name, SqlManagedInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:SqlManagedInstance", name, args == null ? SqlManagedInstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlManagedInstance(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurearcdata:SqlManagedInstance", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:azurearcdata/v20210601preview:SqlManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:azurearcdata/v20210701preview:SqlManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:azurearcdata/v20210801:SqlManagedInstance").build()),
                Input.of(Alias.builder().setType("azure-native:azurearcdata/v20211101:SqlManagedInstance").build())
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
    public static SqlManagedInstance get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlManagedInstance(name, id, options);
    }
}