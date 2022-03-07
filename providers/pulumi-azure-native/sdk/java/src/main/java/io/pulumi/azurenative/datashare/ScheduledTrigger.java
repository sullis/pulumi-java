// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ScheduledTriggerArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A type of trigger based on schedule
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ScheduledTrigger Trigger1 /subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/Account1/shareSubscriptions/ShareSubscription1/triggers/Trigger1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ScheduledTrigger")
public class ScheduledTrigger extends io.pulumi.resources.CustomResource {
    /**
     * Time at which the trigger was created.
     * 
     */
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time at which the trigger was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Kind of synchronization on trigger.
     * Expected value is 'ScheduleBased'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of synchronization on trigger.
     * Expected value is 'ScheduleBased'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets the provisioning state
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets the provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recurrence Interval
     * 
     */
    @OutputExport(name="recurrenceInterval", type=String.class, parameters={})
    private Output<String> recurrenceInterval;

    /**
     * @return Recurrence Interval
     * 
     */
    public Output<String> getRecurrenceInterval() {
        return this.recurrenceInterval;
    }
    /**
     * Synchronization mode
     * 
     */
    @OutputExport(name="synchronizationMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> synchronizationMode;

    /**
     * @return Synchronization mode
     * 
     */
    public Output</* @Nullable */ String> getSynchronizationMode() {
        return this.synchronizationMode;
    }
    /**
     * Synchronization time
     * 
     */
    @OutputExport(name="synchronizationTime", type=String.class, parameters={})
    private Output<String> synchronizationTime;

    /**
     * @return Synchronization time
     * 
     */
    public Output<String> getSynchronizationTime() {
        return this.synchronizationTime;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Gets the trigger state
     * 
     */
    @OutputExport(name="triggerStatus", type=String.class, parameters={})
    private Output<String> triggerStatus;

    /**
     * @return Gets the trigger state
     * 
     */
    public Output<String> getTriggerStatus() {
        return this.triggerStatus;
    }
    /**
     * Type of the azure resource
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Name of the user who created the trigger.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Name of the user who created the trigger.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(ScheduledTriggerArgs.Builder a);
    }
    private static io.pulumi.azurenative.datashare.ScheduledTriggerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datashare.ScheduledTriggerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScheduledTrigger(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledTrigger(String name) {
        this(name, ScheduledTriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledTrigger(String name, ScheduledTriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledTrigger(String name, ScheduledTriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledTrigger", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ScheduledTrigger(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledTrigger", name, null, makeResourceOptions(options, id));
    }

    private static ScheduledTriggerArgs makeArgs(ScheduledTriggerArgs args) {
        var builder = args == null ? ScheduledTriggerArgs.builder() : ScheduledTriggerArgs.builder(args);
        return builder
            .setKind("ScheduleBased")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ScheduledTrigger").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:ScheduledTrigger").build())
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
    public static ScheduledTrigger get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledTrigger(name, id, options);
    }
}