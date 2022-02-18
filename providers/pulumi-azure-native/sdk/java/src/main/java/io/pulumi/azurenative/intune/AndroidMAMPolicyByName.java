// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.intune;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.intune.AndroidMAMPolicyByNameArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Android Policy entity for Intune MAM.
 * API Version: 2015-01-14-preview.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:intune:AndroidMAMPolicyByName myresource1 /providers/Microsoft.Intune/locations/{hostName}/androidPolicies/{policyName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:intune:AndroidMAMPolicyByName")
public class AndroidMAMPolicyByName extends io.pulumi.resources.CustomResource {
    @OutputExport(name="accessRecheckOfflineTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessRecheckOfflineTimeout;

    public Output</* @Nullable */ String> getAccessRecheckOfflineTimeout() {
        return this.accessRecheckOfflineTimeout;
    }
    @OutputExport(name="accessRecheckOnlineTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessRecheckOnlineTimeout;

    public Output</* @Nullable */ String> getAccessRecheckOnlineTimeout() {
        return this.accessRecheckOnlineTimeout;
    }
    @OutputExport(name="appSharingFromLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> appSharingFromLevel;

    public Output</* @Nullable */ String> getAppSharingFromLevel() {
        return this.appSharingFromLevel;
    }
    @OutputExport(name="appSharingToLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> appSharingToLevel;

    public Output</* @Nullable */ String> getAppSharingToLevel() {
        return this.appSharingToLevel;
    }
    @OutputExport(name="authentication", type=String.class, parameters={})
    private Output</* @Nullable */ String> authentication;

    public Output</* @Nullable */ String> getAuthentication() {
        return this.authentication;
    }
    @OutputExport(name="clipboardSharingLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> clipboardSharingLevel;

    public Output</* @Nullable */ String> getClipboardSharingLevel() {
        return this.clipboardSharingLevel;
    }
    @OutputExport(name="dataBackup", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataBackup;

    public Output</* @Nullable */ String> getDataBackup() {
        return this.dataBackup;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="deviceCompliance", type=String.class, parameters={})
    private Output</* @Nullable */ String> deviceCompliance;

    public Output</* @Nullable */ String> getDeviceCompliance() {
        return this.deviceCompliance;
    }
    @OutputExport(name="fileEncryption", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileEncryption;

    public Output</* @Nullable */ String> getFileEncryption() {
        return this.fileEncryption;
    }
    @OutputExport(name="fileSharingSaveAs", type=String.class, parameters={})
    private Output</* @Nullable */ String> fileSharingSaveAs;

    public Output</* @Nullable */ String> getFileSharingSaveAs() {
        return this.fileSharingSaveAs;
    }
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName;
    }
    @OutputExport(name="groupStatus", type=String.class, parameters={})
    private Output<String> groupStatus;

    public Output<String> getGroupStatus() {
        return this.groupStatus;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Resource Location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource Location
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="managedBrowser", type=String.class, parameters={})
    private Output</* @Nullable */ String> managedBrowser;

    public Output</* @Nullable */ String> getManagedBrowser() {
        return this.managedBrowser;
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
    @OutputExport(name="numOfApps", type=Integer.class, parameters={})
    private Output<Integer> numOfApps;

    public Output<Integer> getNumOfApps() {
        return this.numOfApps;
    }
    @OutputExport(name="offlineWipeTimeout", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineWipeTimeout;

    public Output</* @Nullable */ String> getOfflineWipeTimeout() {
        return this.offlineWipeTimeout;
    }
    @OutputExport(name="pin", type=String.class, parameters={})
    private Output</* @Nullable */ String> pin;

    public Output</* @Nullable */ String> getPin() {
        return this.pin;
    }
    @OutputExport(name="pinNumRetry", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> pinNumRetry;

    public Output</* @Nullable */ Integer> getPinNumRetry() {
        return this.pinNumRetry;
    }
    @OutputExport(name="screenCapture", type=String.class, parameters={})
    private Output</* @Nullable */ String> screenCapture;

    public Output</* @Nullable */ String> getScreenCapture() {
        return this.screenCapture;
    }
    /**
     * Resource Tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource Tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public AndroidMAMPolicyByName(String name, AndroidMAMPolicyByNameArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:intune:AndroidMAMPolicyByName", name, args == null ? AndroidMAMPolicyByNameArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AndroidMAMPolicyByName(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:intune:AndroidMAMPolicyByName", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:intune/v20150114preview:AndroidMAMPolicyByName").build()),
                Input.of(Alias.builder().setType("azure-native:intune/v20150114privatepreview:AndroidMAMPolicyByName").build())
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
    public static AndroidMAMPolicyByName get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AndroidMAMPolicyByName(name, id, options);
    }
}
