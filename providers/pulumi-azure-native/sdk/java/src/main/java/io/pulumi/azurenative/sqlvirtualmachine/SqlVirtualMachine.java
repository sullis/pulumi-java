// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sqlvirtualmachine.SqlVirtualMachineArgs;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.AutoBackupSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.AutoPatchingSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.KeyVaultCredentialSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.ResourceIdentityResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.ServerConfigurationsManagementSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.StorageConfigurationSettingsResponse;
import io.pulumi.azurenative.sqlvirtualmachine.outputs.WsfcDomainCredentialsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A SQL virtual machine.
 * API Version: 2017-03-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sqlvirtualmachine:SqlVirtualMachine testvm /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/testrg/providers/Microsoft.SqlVirtualMachine/sqlVirtualMachines/testvm 
 * ```
 * 
 */
@ResourceType(type="azure-native:sqlvirtualmachine:SqlVirtualMachine")
public class SqlVirtualMachine extends io.pulumi.resources.CustomResource {
    /**
     * Auto backup settings for SQL Server.
     * 
     */
    @OutputExport(name="autoBackupSettings", type=AutoBackupSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AutoBackupSettingsResponse> autoBackupSettings;

    /**
     * @return Auto backup settings for SQL Server.
     * 
     */
    public Output</* @Nullable */ AutoBackupSettingsResponse> getAutoBackupSettings() {
        return this.autoBackupSettings;
    }
    /**
     * Auto patching settings for applying critical security updates to SQL virtual machine.
     * 
     */
    @OutputExport(name="autoPatchingSettings", type=AutoPatchingSettingsResponse.class, parameters={})
    private Output</* @Nullable */ AutoPatchingSettingsResponse> autoPatchingSettings;

    /**
     * @return Auto patching settings for applying critical security updates to SQL virtual machine.
     * 
     */
    public Output</* @Nullable */ AutoPatchingSettingsResponse> getAutoPatchingSettings() {
        return this.autoPatchingSettings;
    }
    /**
     * Azure Active Directory identity of the server.
     * 
     */
    @OutputExport(name="identity", type=ResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ ResourceIdentityResponse> identity;

    /**
     * @return Azure Active Directory identity of the server.
     * 
     */
    public Output</* @Nullable */ ResourceIdentityResponse> getIdentity() {
        return this.identity;
    }
    /**
     * Key vault credential settings.
     * 
     */
    @OutputExport(name="keyVaultCredentialSettings", type=KeyVaultCredentialSettingsResponse.class, parameters={})
    private Output</* @Nullable */ KeyVaultCredentialSettingsResponse> keyVaultCredentialSettings;

    /**
     * @return Key vault credential settings.
     * 
     */
    public Output</* @Nullable */ KeyVaultCredentialSettingsResponse> getKeyVaultCredentialSettings() {
        return this.keyVaultCredentialSettings;
    }
    /**
     * Resource location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state to track the async operation status.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state to track the async operation status.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * SQL Server configuration management settings.
     * 
     */
    @OutputExport(name="serverConfigurationsManagementSettings", type=ServerConfigurationsManagementSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ServerConfigurationsManagementSettingsResponse> serverConfigurationsManagementSettings;

    /**
     * @return SQL Server configuration management settings.
     * 
     */
    public Output</* @Nullable */ ServerConfigurationsManagementSettingsResponse> getServerConfigurationsManagementSettings() {
        return this.serverConfigurationsManagementSettings;
    }
    /**
     * SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
     */
    @OutputExport(name="sqlImageOffer", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlImageOffer;

    /**
     * @return SQL image offer. Examples include SQL2016-WS2016, SQL2017-WS2016.
     * 
     */
    public Output</* @Nullable */ String> getSqlImageOffer() {
        return this.sqlImageOffer;
    }
    /**
     * SQL Server edition type.
     * 
     */
    @OutputExport(name="sqlImageSku", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlImageSku;

    /**
     * @return SQL Server edition type.
     * 
     */
    public Output</* @Nullable */ String> getSqlImageSku() {
        return this.sqlImageSku;
    }
    /**
     * SQL Server Management type.
     * 
     */
    @OutputExport(name="sqlManagement", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlManagement;

    /**
     * @return SQL Server Management type.
     * 
     */
    public Output</* @Nullable */ String> getSqlManagement() {
        return this.sqlManagement;
    }
    /**
     * SQL Server license type.
     * 
     */
    @OutputExport(name="sqlServerLicenseType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlServerLicenseType;

    /**
     * @return SQL Server license type.
     * 
     */
    public Output</* @Nullable */ String> getSqlServerLicenseType() {
        return this.sqlServerLicenseType;
    }
    /**
     * ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     * 
     */
    @OutputExport(name="sqlVirtualMachineGroupResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqlVirtualMachineGroupResourceId;

    /**
     * @return ARM resource id of the SQL virtual machine group this SQL virtual machine is or will be part of.
     * 
     */
    public Output</* @Nullable */ String> getSqlVirtualMachineGroupResourceId() {
        return this.sqlVirtualMachineGroupResourceId;
    }
    /**
     * Storage Configuration Settings.
     * 
     */
    @OutputExport(name="storageConfigurationSettings", type=StorageConfigurationSettingsResponse.class, parameters={})
    private Output</* @Nullable */ StorageConfigurationSettingsResponse> storageConfigurationSettings;

    /**
     * @return Storage Configuration Settings.
     * 
     */
    public Output</* @Nullable */ StorageConfigurationSettingsResponse> getStorageConfigurationSettings() {
        return this.storageConfigurationSettings;
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
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * ARM Resource id of underlying virtual machine created from SQL marketplace image.
     * 
     */
    @OutputExport(name="virtualMachineResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> virtualMachineResourceId;

    /**
     * @return ARM Resource id of underlying virtual machine created from SQL marketplace image.
     * 
     */
    public Output</* @Nullable */ String> getVirtualMachineResourceId() {
        return this.virtualMachineResourceId;
    }
    /**
     * Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     * 
     */
    @OutputExport(name="wsfcDomainCredentials", type=WsfcDomainCredentialsResponse.class, parameters={})
    private Output</* @Nullable */ WsfcDomainCredentialsResponse> wsfcDomainCredentials;

    /**
     * @return Domain credentials for setting up Windows Server Failover Cluster for SQL availability group.
     * 
     */
    public Output</* @Nullable */ WsfcDomainCredentialsResponse> getWsfcDomainCredentials() {
        return this.wsfcDomainCredentials;
    }

    public interface BuilderApplicator {
        public void apply(SqlVirtualMachineArgs.Builder a);
    }
    private static io.pulumi.azurenative.sqlvirtualmachine.SqlVirtualMachineArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.sqlvirtualmachine.SqlVirtualMachineArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SqlVirtualMachine(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlVirtualMachine(String name) {
        this(name, SqlVirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlVirtualMachine(String name, SqlVirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlVirtualMachine(String name, SqlVirtualMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sqlvirtualmachine:SqlVirtualMachine", name, args == null ? SqlVirtualMachineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SqlVirtualMachine(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sqlvirtualmachine:SqlVirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sqlvirtualmachine/v20170301preview:SqlVirtualMachine").build())
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
    public static SqlVirtualMachine get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SqlVirtualMachine(name, id, options);
    }
}