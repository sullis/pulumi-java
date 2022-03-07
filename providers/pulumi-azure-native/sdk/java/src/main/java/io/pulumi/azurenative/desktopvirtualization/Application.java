// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.ApplicationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Schema for Application properties.
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:desktopvirtualization:Application applicationGroup1/application1 /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/applicationGroups/applicationGroup1/applications/application1 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:Application")
public class Application extends io.pulumi.resources.CustomResource {
    /**
     * Resource Type of Application.
     * 
     */
    @OutputExport(name="applicationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationType;

    /**
     * @return Resource Type of Application.
     * 
     */
    public Output</* @Nullable */ String> getApplicationType() {
        return this.applicationType;
    }
    /**
     * Command Line Arguments for Application.
     * 
     */
    @OutputExport(name="commandLineArguments", type=String.class, parameters={})
    private Output</* @Nullable */ String> commandLineArguments;

    /**
     * @return Command Line Arguments for Application.
     * 
     */
    public Output</* @Nullable */ String> getCommandLineArguments() {
        return this.commandLineArguments;
    }
    /**
     * Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    @OutputExport(name="commandLineSetting", type=String.class, parameters={})
    private Output<String> commandLineSetting;

    /**
     * @return Specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all.
     * 
     */
    public Output<String> getCommandLineSetting() {
        return this.commandLineSetting;
    }
    /**
     * Description of Application.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of Application.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies a path for the executable file for the application.
     * 
     */
    @OutputExport(name="filePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> filePath;

    /**
     * @return Specifies a path for the executable file for the application.
     * 
     */
    public Output</* @Nullable */ String> getFilePath() {
        return this.filePath;
    }
    /**
     * Friendly name of Application.
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly name of Application.
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * the icon a 64 bit string as a byte array.
     * 
     */
    @OutputExport(name="iconContent", type=String.class, parameters={})
    private Output<String> iconContent;

    /**
     * @return the icon a 64 bit string as a byte array.
     * 
     */
    public Output<String> getIconContent() {
        return this.iconContent;
    }
    /**
     * Hash of the icon.
     * 
     */
    @OutputExport(name="iconHash", type=String.class, parameters={})
    private Output<String> iconHash;

    /**
     * @return Hash of the icon.
     * 
     */
    public Output<String> getIconHash() {
        return this.iconHash;
    }
    /**
     * Index of the icon.
     * 
     */
    @OutputExport(name="iconIndex", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> iconIndex;

    /**
     * @return Index of the icon.
     * 
     */
    public Output</* @Nullable */ Integer> getIconIndex() {
        return this.iconIndex;
    }
    /**
     * Path to icon.
     * 
     */
    @OutputExport(name="iconPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> iconPath;

    /**
     * @return Path to icon.
     * 
     */
    public Output</* @Nullable */ String> getIconPath() {
        return this.iconPath;
    }
    /**
     * Specifies the package application Id for MSIX applications
     * 
     */
    @OutputExport(name="msixPackageApplicationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageApplicationId;

    /**
     * @return Specifies the package application Id for MSIX applications
     * 
     */
    public Output</* @Nullable */ String> getMsixPackageApplicationId() {
        return this.msixPackageApplicationId;
    }
    /**
     * Specifies the package family name for MSIX applications
     * 
     */
    @OutputExport(name="msixPackageFamilyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageFamilyName;

    /**
     * @return Specifies the package family name for MSIX applications
     * 
     */
    public Output</* @Nullable */ String> getMsixPackageFamilyName() {
        return this.msixPackageFamilyName;
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
     * ObjectId of Application. (internal use)
     * 
     */
    @OutputExport(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    /**
     * @return ObjectId of Application. (internal use)
     * 
     */
    public Output<String> getObjectId() {
        return this.objectId;
    }
    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    @OutputExport(name="showInPortal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> showInPortal;

    /**
     * @return Specifies whether to show the RemoteApp program in the RD Web Access server.
     * 
     */
    public Output</* @Nullable */ Boolean> getShowInPortal() {
        return this.showInPortal;
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

    public interface BuilderApplicator {
        public void apply(ApplicationArgs.Builder a);
    }
    private static io.pulumi.azurenative.desktopvirtualization.ApplicationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.desktopvirtualization.ApplicationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Application(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Application(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190123preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190924preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20191210preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20200921preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201019preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201102preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201110preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210114preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210201preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210309preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210401preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210712:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210903preview:Application").build())
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
    public static Application get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}