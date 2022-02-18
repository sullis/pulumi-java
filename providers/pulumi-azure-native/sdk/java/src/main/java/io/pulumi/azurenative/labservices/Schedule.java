// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.labservices.ScheduleArgs;
import io.pulumi.azurenative.labservices.outputs.RecurrencePatternResponse;
import io.pulumi.azurenative.labservices.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schedule for automatically turning virtual machines in a lab on and off at specified times.
 * API Version: 2021-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:Schedule schedule1 /subscriptions/34adfa4f-cedf-4dc0-ba29-b6d1a69ab345/resourceGroups/testrg123/providers/Microsoft.LabServices/labs/testlab/schedules/schedule1 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:Schedule")
public class Schedule extends io.pulumi.resources.CustomResource {
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
     * Notes for this schedule.
     * 
     */
    @OutputExport(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Notes for this schedule.
     * 
     */
    public Output</* @Nullable */ String> getNotes() {
        return this.notes;
    }
    /**
     * Current provisioning state of the schedule.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Current provisioning state of the schedule.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The recurrence pattern of the scheduled actions.
     * 
     */
    @OutputExport(name="recurrencePattern", type=RecurrencePatternResponse.class, parameters={})
    private Output</* @Nullable */ RecurrencePatternResponse> recurrencePattern;

    /**
     * @return The recurrence pattern of the scheduled actions.
     * 
     */
    public Output</* @Nullable */ RecurrencePatternResponse> getRecurrencePattern() {
        return this.recurrencePattern;
    }
    /**
     * When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    @OutputExport(name="startAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> startAt;

    /**
     * @return When lab user virtual machines will be started. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    public Output</* @Nullable */ String> getStartAt() {
        return this.startAt;
    }
    /**
     * When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    @OutputExport(name="stopAt", type=String.class, parameters={})
    private Output<String> stopAt;

    /**
     * @return When lab user virtual machines will be stopped. Timestamp offsets will be ignored and timeZoneId is used instead.
     * 
     */
    public Output<String> getStopAt() {
        return this.stopAt;
    }
    /**
     * Metadata pertaining to creation and last modification of the schedule.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the schedule.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The IANA timezone id for the schedule.
     * 
     */
    @OutputExport(name="timeZoneId", type=String.class, parameters={})
    private Output<String> timeZoneId;

    /**
     * @return The IANA timezone id for the schedule.
     * 
     */
    public Output<String> getTimeZoneId() {
        return this.timeZoneId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Schedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Schedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:labservices/v20211001preview:Schedule").build()),
                Input.of(Alias.builder().setType("azure-native:labservices/v20211115preview:Schedule").build())
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
    public static Schedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, options);
    }
}
