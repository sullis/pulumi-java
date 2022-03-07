// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.BackupScheduleArgs;
import io.pulumi.azurenative.storsimple.outputs.ScheduleRecurrenceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The backup schedule.
 * API Version: 2017-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storsimple:BackupSchedule schedule2 /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.StorSimple/managers/ManagerForSDKTest1/devices/Device05ForSDKTest/backupPolicies/BkUpPolicy01ForSDKTest/schedules/schedule2 
 * ```
 * 
 */
@ResourceType(type="azure-native:storsimple:BackupSchedule")
public class BackupSchedule extends io.pulumi.resources.CustomResource {
    /**
     * The type of backup which needs to be taken.
     * 
     */
    @OutputExport(name="backupType", type=String.class, parameters={})
    private Output<String> backupType;

    /**
     * @return The type of backup which needs to be taken.
     * 
     */
    public Output<String> getBackupType() {
        return this.backupType;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The Kind of the object. Currently only Series8000 is supported
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The last successful backup run which was triggered for the schedule.
     * 
     */
    @OutputExport(name="lastSuccessfulRun", type=String.class, parameters={})
    private Output<String> lastSuccessfulRun;

    /**
     * @return The last successful backup run which was triggered for the schedule.
     * 
     */
    public Output<String> getLastSuccessfulRun() {
        return this.lastSuccessfulRun;
    }
    /**
     * The name of the object.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the object.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The number of backups to be retained.
     * 
     */
    @OutputExport(name="retentionCount", type=Double.class, parameters={})
    private Output<Double> retentionCount;

    /**
     * @return The number of backups to be retained.
     * 
     */
    public Output<Double> getRetentionCount() {
        return this.retentionCount;
    }
    /**
     * The schedule recurrence.
     * 
     */
    @OutputExport(name="scheduleRecurrence", type=ScheduleRecurrenceResponse.class, parameters={})
    private Output<ScheduleRecurrenceResponse> scheduleRecurrence;

    /**
     * @return The schedule recurrence.
     * 
     */
    public Output<ScheduleRecurrenceResponse> getScheduleRecurrence() {
        return this.scheduleRecurrence;
    }
    /**
     * The schedule status.
     * 
     */
    @OutputExport(name="scheduleStatus", type=String.class, parameters={})
    private Output<String> scheduleStatus;

    /**
     * @return The schedule status.
     * 
     */
    public Output<String> getScheduleStatus() {
        return this.scheduleStatus;
    }
    /**
     * The start time of the schedule.
     * 
     */
    @OutputExport(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return The start time of the schedule.
     * 
     */
    public Output<String> getStartTime() {
        return this.startTime;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(BackupScheduleArgs.Builder a);
    }
    private static io.pulumi.azurenative.storsimple.BackupScheduleArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storsimple.BackupScheduleArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackupSchedule(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupSchedule(String name) {
        this(name, BackupScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupSchedule(String name, BackupScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupSchedule(String name, BackupScheduleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupSchedule", name, args == null ? BackupScheduleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private BackupSchedule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storsimple:BackupSchedule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storsimple/v20170601:BackupSchedule").build())
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
    public static BackupSchedule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackupSchedule(name, id, options);
    }
}