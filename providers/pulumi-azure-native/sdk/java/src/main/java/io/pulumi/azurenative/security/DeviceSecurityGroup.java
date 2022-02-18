// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.DeviceSecurityGroupArgs;
import io.pulumi.azurenative.security.outputs.AllowlistCustomAlertRuleResponse;
import io.pulumi.azurenative.security.outputs.DenylistCustomAlertRuleResponse;
import io.pulumi.azurenative.security.outputs.ThresholdCustomAlertRuleResponse;
import io.pulumi.azurenative.security.outputs.TimeWindowCustomAlertRuleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The device security group resource
 * API Version: 2019-08-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:DeviceSecurityGroup samplesecuritygroup /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/resourceGroups/SampleRG/providers/Microsoft.Devices/iotHubs/sampleiothub/providers/Microsoft.Security/deviceSecurityGroups/samplesecuritygroup 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:DeviceSecurityGroup")
public class DeviceSecurityGroup extends io.pulumi.resources.CustomResource {
    /**
     * The allow-list custom alert rules.
     * 
     */
    @OutputExport(name="allowlistRules", type=List.class, parameters={AllowlistCustomAlertRuleResponse.class})
    private Output</* @Nullable */ List<AllowlistCustomAlertRuleResponse>> allowlistRules;

    /**
     * @return The allow-list custom alert rules.
     * 
     */
    public Output</* @Nullable */ List<AllowlistCustomAlertRuleResponse>> getAllowlistRules() {
        return this.allowlistRules;
    }
    /**
     * The deny-list custom alert rules.
     * 
     */
    @OutputExport(name="denylistRules", type=List.class, parameters={DenylistCustomAlertRuleResponse.class})
    private Output</* @Nullable */ List<DenylistCustomAlertRuleResponse>> denylistRules;

    /**
     * @return The deny-list custom alert rules.
     * 
     */
    public Output</* @Nullable */ List<DenylistCustomAlertRuleResponse>> getDenylistRules() {
        return this.denylistRules;
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
     * The list of custom alert threshold rules.
     * 
     */
    @OutputExport(name="thresholdRules", type=List.class, parameters={ThresholdCustomAlertRuleResponse.class})
    private Output</* @Nullable */ List<ThresholdCustomAlertRuleResponse>> thresholdRules;

    /**
     * @return The list of custom alert threshold rules.
     * 
     */
    public Output</* @Nullable */ List<ThresholdCustomAlertRuleResponse>> getThresholdRules() {
        return this.thresholdRules;
    }
    /**
     * The list of custom alert time-window rules.
     * 
     */
    @OutputExport(name="timeWindowRules", type=List.class, parameters={TimeWindowCustomAlertRuleResponse.class})
    private Output</* @Nullable */ List<TimeWindowCustomAlertRuleResponse>> timeWindowRules;

    /**
     * @return The list of custom alert time-window rules.
     * 
     */
    public Output</* @Nullable */ List<TimeWindowCustomAlertRuleResponse>> getTimeWindowRules() {
        return this.timeWindowRules;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeviceSecurityGroup(String name, DeviceSecurityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:DeviceSecurityGroup", name, args == null ? DeviceSecurityGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DeviceSecurityGroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:DeviceSecurityGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:security/v20170801preview:DeviceSecurityGroup").build()),
                Input.of(Alias.builder().setType("azure-native:security/v20190801:DeviceSecurityGroup").build())
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
    public static DeviceSecurityGroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DeviceSecurityGroup(name, id, options);
    }
}
