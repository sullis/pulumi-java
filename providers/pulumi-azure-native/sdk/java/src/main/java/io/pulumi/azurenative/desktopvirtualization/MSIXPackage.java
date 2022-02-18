// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.MSIXPackageArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.MsixPackageApplicationsResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.MsixPackageDependenciesResponse;
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
 * Schema for MSIX Package properties.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:desktopvirtualization:MSIXPackage hostpool1/MsixPackageFullName /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourcegroups/resourcegroup1/providers/Microsoft.DesktopVirtualization/hostpools/hostpool1/msixpackages/msixPackageFullName 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:MSIXPackage")
public class MSIXPackage extends io.pulumi.resources.CustomResource {
    /**
     * User friendly Name to be displayed in the portal.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User friendly Name to be displayed in the portal.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * VHD/CIM image path on Network Share.
     * 
     */
    @OutputExport(name="imagePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> imagePath;

    /**
     * @return VHD/CIM image path on Network Share.
     * 
     */
    public Output</* @Nullable */ String> getImagePath() {
        return this.imagePath;
    }
    /**
     * Make this version of the package the active one across the hostpool.
     * 
     */
    @OutputExport(name="isActive", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isActive;

    /**
     * @return Make this version of the package the active one across the hostpool.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsActive() {
        return this.isActive;
    }
    /**
     * Specifies how to register Package in feed.
     * 
     */
    @OutputExport(name="isRegularRegistration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isRegularRegistration;

    /**
     * @return Specifies how to register Package in feed.
     * 
     */
    public Output</* @Nullable */ Boolean> getIsRegularRegistration() {
        return this.isRegularRegistration;
    }
    /**
     * Date Package was last updated, found in the appxmanifest.xml.
     * 
     */
    @OutputExport(name="lastUpdated", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastUpdated;

    /**
     * @return Date Package was last updated, found in the appxmanifest.xml.
     * 
     */
    public Output</* @Nullable */ String> getLastUpdated() {
        return this.lastUpdated;
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
     * List of package applications.
     * 
     */
    @OutputExport(name="packageApplications", type=List.class, parameters={MsixPackageApplicationsResponse.class})
    private Output</* @Nullable */ List<MsixPackageApplicationsResponse>> packageApplications;

    /**
     * @return List of package applications.
     * 
     */
    public Output</* @Nullable */ List<MsixPackageApplicationsResponse>> getPackageApplications() {
        return this.packageApplications;
    }
    /**
     * List of package dependencies.
     * 
     */
    @OutputExport(name="packageDependencies", type=List.class, parameters={MsixPackageDependenciesResponse.class})
    private Output</* @Nullable */ List<MsixPackageDependenciesResponse>> packageDependencies;

    /**
     * @return List of package dependencies.
     * 
     */
    public Output</* @Nullable */ List<MsixPackageDependenciesResponse>> getPackageDependencies() {
        return this.packageDependencies;
    }
    /**
     * Package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     * 
     */
    @OutputExport(name="packageFamilyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> packageFamilyName;

    /**
     * @return Package Family Name from appxmanifest.xml. Contains Package Name and Publisher name.
     * 
     */
    public Output</* @Nullable */ String> getPackageFamilyName() {
        return this.packageFamilyName;
    }
    /**
     * Package Name from appxmanifest.xml.
     * 
     */
    @OutputExport(name="packageName", type=String.class, parameters={})
    private Output</* @Nullable */ String> packageName;

    /**
     * @return Package Name from appxmanifest.xml.
     * 
     */
    public Output</* @Nullable */ String> getPackageName() {
        return this.packageName;
    }
    /**
     * Relative Path to the package inside the image.
     * 
     */
    @OutputExport(name="packageRelativePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> packageRelativePath;

    /**
     * @return Relative Path to the package inside the image.
     * 
     */
    public Output</* @Nullable */ String> getPackageRelativePath() {
        return this.packageRelativePath;
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
     * Package Version found in the appxmanifest.xml.
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output</* @Nullable */ String> version;

    /**
     * @return Package Version found in the appxmanifest.xml.
     * 
     */
    public Output</* @Nullable */ String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MSIXPackage(String name, MSIXPackageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:MSIXPackage", name, args == null ? MSIXPackageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MSIXPackage(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:MSIXPackage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20200921preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201019preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201102preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201110preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210114preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210201preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210309preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210401preview:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210712:MSIXPackage").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210903preview:MSIXPackage").build())
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
    public static MSIXPackage get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MSIXPackage(name, id, options);
    }
}
