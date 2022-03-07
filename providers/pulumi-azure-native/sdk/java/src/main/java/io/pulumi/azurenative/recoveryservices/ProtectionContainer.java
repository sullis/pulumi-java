// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.ProtectionContainerArgs;
import io.pulumi.azurenative.recoveryservices.outputs.AzureBackupServerContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureIaaSClassicComputeVMContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureIaaSComputeVMContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureSQLAGWorkloadContainerProtectionContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureSqlContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureStorageContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureVMAppContainerProtectionContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.AzureWorkloadContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.DpmContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.GenericContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.IaaSVMContainerResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MabContainerResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Base class for container with backup items. Containers with specific workloads are derived from this class.
 * API Version: 2021-02-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:recoveryservices:ProtectionContainer VMAppContainer;Compute;testRG;testSQL /Subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/testRg/providers/Microsoft.RecoveryServices/vaults/testVault/backupFabrics/Azure/protectionContainers/VMAppContainer;Compute;testRG;testSQL 
 * ```
 * 
 */
@ResourceType(type="azure-native:recoveryservices:ProtectionContainer")
public class ProtectionContainer extends io.pulumi.resources.CustomResource {
    /**
     * Optional ETag.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> eTag;

    /**
     * @return Optional ETag.
     * 
     */
    public Output</* @Nullable */ String> getETag() {
        return this.eTag;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name associated with the resource.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name associated with the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * ProtectionContainerResource properties
     * 
     */
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return ProtectionContainerResource properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type represents the complete path of the form Namespace/ResourceType/ResourceType/...
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ProtectionContainerArgs.Builder a);
    }
    private static io.pulumi.azurenative.recoveryservices.ProtectionContainerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.recoveryservices.ProtectionContainerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProtectionContainer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProtectionContainer(String name) {
        this(name, ProtectionContainerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProtectionContainer(String name, ProtectionContainerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProtectionContainer(String name, ProtectionContainerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionContainer", name, args == null ? ProtectionContainerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProtectionContainer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:recoveryservices:ProtectionContainer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20161201:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201001:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20201201:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210101:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210201:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210201preview:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210210:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210301:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210401:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210601:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210701:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20210801:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211001:ProtectionContainer").build()),
                Input.of(Alias.builder().setType("azure-native:recoveryservices/v20211201:ProtectionContainer").build())
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
    public static ProtectionContainer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProtectionContainer(name, id, options);
    }
}