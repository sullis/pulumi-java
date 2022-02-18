// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.TaskArgs;
import io.pulumi.azurenative.datamigration.outputs.ConnectToSourcePostgreSqlSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToSourceSqlServerTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetAzureDbForMySqlTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlDbTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlMISyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlMITaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlSqlDbSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.GetTdeCertificatesSqlTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.GetUserTablesSqlSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.GetUserTablesSqlTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateMySqlAzureDbForMySqlSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlDbSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlDbTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMISyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSqlServerSqlMITaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidateMigrationInputSqlServerSqlMISyncTaskPropertiesResponse;
import io.pulumi.azurenative.datamigration.outputs.ValidateMigrationInputSqlServerSqlMITaskPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A task resource
 * API Version: 2018-04-19.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datamigration:Task DmsSdkTask /subscriptions/fc04246f-04c5-437e-ac5e-206a19e7193f/resourceGroups/DmsSdkRg/providers/Microsoft.DataMigration/services/DmsSdkService/projects/DmsSdkProject/tasks/DmsSdkTask 
 * ```
 * 
 */
@ResourceType(type="azure-native:datamigration:Task")
public class Task extends io.pulumi.resources.CustomResource {
    /**
     * HTTP strong entity tag value. This is ignored if submitted.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return HTTP strong entity tag value. This is ignored if submitted.
     * 
     */
    public Output</* @Nullable */ String> getEtag() {
        return this.etag;
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
     * Custom task properties
     * 
     */
    @OutputExport(name="properties", type=Object.class, parameters={})
    private Output<Object> properties;

    /**
     * @return Custom task properties
     * 
     */
    public Output<Object> getProperties() {
        return this.properties;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Task(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datamigration:Task", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datamigration/v20171115preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20180315preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20180331preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20180419:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20180715preview:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20210630:Task").build()),
                Input.of(Alias.builder().setType("azure-native:datamigration/v20211030preview:Task").build())
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
    public static Task get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, options);
    }
}
