// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.timeseriesinsights.Gen2EnvironmentArgs;
import io.pulumi.azurenative.timeseriesinsights.outputs.EnvironmentStatusResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.Gen2StorageConfigurationOutputResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.SkuResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.TimeSeriesIdPropertyResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.WarmStoreConfigurationPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * An environment is a set of time-series data available for query, and is the top level Azure Time Series Insights resource. Gen2 environments do not have set data retention limits.
 * API Version: 2020-05-15.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:timeseriesinsights:Gen2Environment env1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.TimeSeriesInsights/Environments/env1 
 * ```
 * 
 */
@ResourceType(type="azure-native:timeseriesinsights:Gen2Environment")
public class Gen2Environment extends io.pulumi.resources.CustomResource {
    /**
     * The time the resource was created.
     * 
     */
    @OutputExport(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the resource was created.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    @OutputExport(name="dataAccessFqdn", type=String.class, parameters={})
    private Output<String> dataAccessFqdn;

    /**
     * @return The fully qualified domain name used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public Output<String> getDataAccessFqdn() {
        return this.dataAccessFqdn;
    }
    /**
     * An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    @OutputExport(name="dataAccessId", type=String.class, parameters={})
    private Output<String> dataAccessId;

    /**
     * @return An id used to access the environment data, e.g. to query the environment's events or upload reference data for the environment.
     * 
     */
    public Output<String> getDataAccessId() {
        return this.dataAccessId;
    }
    /**
     * The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the environment.
     * Expected value is 'Gen2'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
    }
    /**
     * An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    @OutputExport(name="status", type=EnvironmentStatusResponse.class, parameters={})
    private Output<EnvironmentStatusResponse> status;

    /**
     * @return An object that represents the status of the environment, and its internal state in the Time Series Insights service.
     * 
     */
    public Output<EnvironmentStatusResponse> getStatus() {
        return this.status;
    }
    /**
     * The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    @OutputExport(name="storageConfiguration", type=Gen2StorageConfigurationOutputResponse.class, parameters={})
    private Output<Gen2StorageConfigurationOutputResponse> storageConfiguration;

    /**
     * @return The storage configuration provides the connection details that allows the Time Series Insights service to connect to the customer storage account that is used to store the environment's data.
     * 
     */
    public Output<Gen2StorageConfigurationOutputResponse> getStorageConfiguration() {
        return this.storageConfiguration;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The list of event properties which will be used to define the environment's time series id.
     * 
     */
    @OutputExport(name="timeSeriesIdProperties", type=List.class, parameters={TimeSeriesIdPropertyResponse.class})
    private Output<List<TimeSeriesIdPropertyResponse>> timeSeriesIdProperties;

    /**
     * @return The list of event properties which will be used to define the environment's time series id.
     * 
     */
    public Output<List<TimeSeriesIdPropertyResponse>> getTimeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    @OutputExport(name="warmStoreConfiguration", type=WarmStoreConfigurationPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ WarmStoreConfigurationPropertiesResponse> warmStoreConfiguration;

    /**
     * @return The warm store configuration provides the details to create a warm store cache that will retain a copy of the environment's data available for faster query.
     * 
     */
    public Output</* @Nullable */ WarmStoreConfigurationPropertiesResponse> getWarmStoreConfiguration() {
        return this.warmStoreConfiguration;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gen2Environment(String name, Gen2EnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:Gen2Environment", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private Gen2Environment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:timeseriesinsights:Gen2Environment", name, null, makeResourceOptions(options, id));
    }

    private static Gen2EnvironmentArgs makeArgs(Gen2EnvironmentArgs args) {
        var builder = args == null ? Gen2EnvironmentArgs.builder() : Gen2EnvironmentArgs.builder(args);
        return builder
            .setKind("Gen2")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20170228preview:Gen2Environment").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20171115:Gen2Environment").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20180815preview:Gen2Environment").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20200515:Gen2Environment").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210331preview:Gen2Environment").build()),
                Input.of(Alias.builder().setType("azure-native:timeseriesinsights/v20210630preview:Gen2Environment").build())
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
    public static Gen2Environment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Gen2Environment(name, id, options);
    }
}
