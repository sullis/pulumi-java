// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.iotsecurity.SensorArgs;
import io.pulumi.azurenative.iotsecurity.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IoT sensor model
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:iotsecurity:Sensor mySensor /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/myHub/providers/Microsoft.IoTSecurity/sensors/mySensor 
 * ```
 * 
 */
@ResourceType(type="azure-native:iotsecurity:Sensor")
public class Sensor extends io.pulumi.resources.CustomResource {
    /**
     * Last connectivity time of the IoT sensor
     * 
     */
    @OutputExport(name="connectivityTime", type=String.class, parameters={})
    private Output<String> connectivityTime;

    /**
     * @return Last connectivity time of the IoT sensor
     * 
     */
    public Output<String> getConnectivityTime() {
        return this.connectivityTime;
    }
    /**
     * Dynamic mode status of the IoT sensor
     * 
     */
    @OutputExport(name="dynamicLearning", type=Boolean.class, parameters={})
    private Output<Boolean> dynamicLearning;

    /**
     * @return Dynamic mode status of the IoT sensor
     * 
     */
    public Output<Boolean> getDynamicLearning() {
        return this.dynamicLearning;
    }
    /**
     * Learning mode status of the IoT sensor
     * 
     */
    @OutputExport(name="learningMode", type=Boolean.class, parameters={})
    private Output<Boolean> learningMode;

    /**
     * @return Learning mode status of the IoT sensor
     * 
     */
    public Output<Boolean> getLearningMode() {
        return this.learningMode;
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
     * Status of the IoT sensor
     * 
     */
    @OutputExport(name="sensorStatus", type=String.class, parameters={})
    private Output<String> sensorStatus;

    /**
     * @return Status of the IoT sensor
     * 
     */
    public Output<String> getSensorStatus() {
        return this.sensorStatus;
    }
    /**
     * Type of sensor
     * 
     */
    @OutputExport(name="sensorType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sensorType;

    /**
     * @return Type of sensor
     * 
     */
    public Output</* @Nullable */ String> getSensorType() {
        return this.sensorType;
    }
    /**
     * Version of the IoT sensor
     * 
     */
    @OutputExport(name="sensorVersion", type=String.class, parameters={})
    private Output<String> sensorVersion;

    /**
     * @return Version of the IoT sensor
     * 
     */
    public Output<String> getSensorVersion() {
        return this.sensorVersion;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * TI Automatic mode status of the IoT sensor
     * 
     */
    @OutputExport(name="tiAutomaticUpdates", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> tiAutomaticUpdates;

    /**
     * @return TI Automatic mode status of the IoT sensor
     * 
     */
    public Output</* @Nullable */ Boolean> getTiAutomaticUpdates() {
        return this.tiAutomaticUpdates;
    }
    /**
     * TI Status of the IoT sensor
     * 
     */
    @OutputExport(name="tiStatus", type=String.class, parameters={})
    private Output<String> tiStatus;

    /**
     * @return TI Status of the IoT sensor
     * 
     */
    public Output<String> getTiStatus() {
        return this.tiStatus;
    }
    /**
     * TI Version of the IoT sensor
     * 
     */
    @OutputExport(name="tiVersion", type=String.class, parameters={})
    private Output<String> tiVersion;

    /**
     * @return TI Version of the IoT sensor
     * 
     */
    public Output<String> getTiVersion() {
        return this.tiVersion;
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
     * Zone of the IoT sensor
     * 
     */
    @OutputExport(name="zone", type=String.class, parameters={})
    private Output</* @Nullable */ String> zone;

    /**
     * @return Zone of the IoT sensor
     * 
     */
    public Output</* @Nullable */ String> getZone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Sensor(String name, SensorArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:Sensor", name, args == null ? SensorArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Sensor(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:Sensor", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:iotsecurity/v20210201preview:Sensor").build())
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
    public static Sensor get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Sensor(name, id, options);
    }
}
