// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.ElasticPoolArgs;
import io.pulumi.azurenative.sql.outputs.ElasticPoolPerDatabaseSettingsResponse;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An elastic pool.
 * API Version: 2020-11-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:ElasticPool sqlcrudtest-8102 /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-2369/providers/Microsoft.Sql/servers/sqlcrudtest-8069/elasticPools/sqlcrudtest-8102 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:ElasticPool")
public class ElasticPool extends io.pulumi.resources.CustomResource {
    /**
     * The creation date of the elastic pool (ISO8601 format).
     * 
     */
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    /**
     * @return The creation date of the elastic pool (ISO8601 format).
     * 
     */
    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    /**
     * Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The license type to apply for this elastic pool.
     * 
     */
    @OutputExport(name="licenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> licenseType;

    /**
     * @return The license type to apply for this elastic pool.
     * 
     */
    public Output</* @Nullable */ String> getLicenseType() {
        return this.licenseType;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    @OutputExport(name="maintenanceConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceConfigurationId;

    /**
     * @return Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }
    /**
     * The storage limit for the database elastic pool in bytes.
     * 
     */
    @OutputExport(name="maxSizeBytes", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> maxSizeBytes;

    /**
     * @return The storage limit for the database elastic pool in bytes.
     * 
     */
    public Output</* @Nullable */ Double> getMaxSizeBytes() {
        return this.maxSizeBytes;
    }
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
     * The per database settings for the elastic pool.
     * 
     */
    @OutputExport(name="perDatabaseSettings", type=ElasticPoolPerDatabaseSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ElasticPoolPerDatabaseSettingsResponse> perDatabaseSettings;

    /**
     * @return The per database settings for the elastic pool.
     * 
     */
    public Output</* @Nullable */ ElasticPoolPerDatabaseSettingsResponse> getPerDatabaseSettings() {
        return this.perDatabaseSettings;
    }
    /**
     * The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output</* @Nullable */ SkuResponse> sku;

    /**
     * @return The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    public Output</* @Nullable */ SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * The state of the elastic pool.
     * 
     */
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the elastic pool.
     * 
     */
    public Output<String> getState() {
        return this.state;
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
    /**
     * Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    @OutputExport(name="zoneRedundant", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneRedundant;

    /**
     * @return Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    public Output</* @Nullable */ Boolean> getZoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ElasticPool(String name, ElasticPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ElasticPool", name, args == null ? ElasticPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ElasticPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:ElasticPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20140401:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20171001preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200202preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20200801preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20201101preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210201preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210501preview:ElasticPool").build()),
                Input.of(Alias.builder().setType("azure-native:sql/v20210801preview:ElasticPool").build())
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
    public static ElasticPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ElasticPool(name, id, options);
    }
}
