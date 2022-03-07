// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storage.FileServicePropertiesArgs;
import io.pulumi.azurenative.storage.outputs.CorsRulesResponse;
import io.pulumi.azurenative.storage.outputs.DeleteRetentionPolicyResponse;
import io.pulumi.azurenative.storage.outputs.ProtocolSettingsResponse;
import io.pulumi.azurenative.storage.outputs.SkuResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The properties of File services in storage account.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storage:FileServiceProperties default /subscriptions/{subscription-id}/resourceGroups/res4410/providers/Microsoft.Storage/storageAccounts/sto8607/fileServices/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:storage:FileServiceProperties")
public class FileServiceProperties extends io.pulumi.resources.CustomResource {
    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    @OutputExport(name="cors", type=CorsRulesResponse.class, parameters={})
    private Output</* @Nullable */ CorsRulesResponse> cors;

    /**
     * @return Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    public Output</* @Nullable */ CorsRulesResponse> getCors() {
        return this.cors;
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
     * Protocol settings for file service
     * 
     */
    @OutputExport(name="protocolSettings", type=ProtocolSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ProtocolSettingsResponse> protocolSettings;

    /**
     * @return Protocol settings for file service
     * 
     */
    public Output</* @Nullable */ ProtocolSettingsResponse> getProtocolSettings() {
        return this.protocolSettings;
    }
    /**
     * The file service properties for share soft delete.
     * 
     */
    @OutputExport(name="shareDeleteRetentionPolicy", type=DeleteRetentionPolicyResponse.class, parameters={})
    private Output</* @Nullable */ DeleteRetentionPolicyResponse> shareDeleteRetentionPolicy;

    /**
     * @return The file service properties for share soft delete.
     * 
     */
    public Output</* @Nullable */ DeleteRetentionPolicyResponse> getShareDeleteRetentionPolicy() {
        return this.shareDeleteRetentionPolicy;
    }
    /**
     * Sku name and tier.
     * 
     */
    @OutputExport(name="sku", type=SkuResponse.class, parameters={})
    private Output<SkuResponse> sku;

    /**
     * @return Sku name and tier.
     * 
     */
    public Output<SkuResponse> getSku() {
        return this.sku;
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
        public void apply(FileServicePropertiesArgs.Builder a);
    }
    private static io.pulumi.azurenative.storage.FileServicePropertiesArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storage.FileServicePropertiesArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FileServiceProperties(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileServiceProperties(String name) {
        this(name, FileServicePropertiesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileServiceProperties(String name, FileServicePropertiesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileServiceProperties(String name, FileServicePropertiesArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileServiceProperties", name, args == null ? FileServicePropertiesArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FileServiceProperties(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storage:FileServiceProperties", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storage/v20190401:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20190601:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20200801preview:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210101:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210201:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210401:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210601:FileServiceProperties").build()),
                Input.of(Alias.builder().setType("azure-native:storage/v20210801:FileServiceProperties").build())
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
    public static FileServiceProperties get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FileServiceProperties(name, id, options);
    }
}