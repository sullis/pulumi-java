// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.DataMaskingPolicyArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Represents a database data masking policy.
 * API Version: 2014-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:sql:DataMaskingPolicy Default /subscriptions/00000000-1111-2222-3333-444444444444/resourceGroups/sqlcrudtest-6852/providers/Microsoft.Sql/servers/sqlcrudtest-2080/databases/sqlcrudtest-331/dataMaskingPolicies/Default 
 * ```
 * 
 */
@ResourceType(type="azure-native:sql:DataMaskingPolicy")
public class DataMaskingPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The list of the application principals. This is a legacy parameter and is no longer used.
     * 
     */
    @OutputExport(name="applicationPrincipals", type=String.class, parameters={})
    private Output<String> applicationPrincipals;

    /**
     * @return The list of the application principals. This is a legacy parameter and is no longer used.
     * 
     */
    public Output<String> getApplicationPrincipals() {
        return this.applicationPrincipals;
    }
    /**
     * The state of the data masking policy.
     * 
     */
    @OutputExport(name="dataMaskingState", type=String.class, parameters={})
    private Output<String> dataMaskingState;

    /**
     * @return The state of the data masking policy.
     * 
     */
    public Output<String> getDataMaskingState() {
        return this.dataMaskingState;
    }
    /**
     * The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    @OutputExport(name="exemptPrincipals", type=String.class, parameters={})
    private Output</* @Nullable */ String> exemptPrincipals;

    /**
     * @return The list of the exempt principals. Specifies the semicolon-separated list of database users for which the data masking policy does not apply. The specified users receive data results without masking for all of the database queries.
     * 
     */
    public Output</* @Nullable */ String> getExemptPrincipals() {
        return this.exemptPrincipals;
    }
    /**
     * The kind of data masking policy. Metadata, used for Azure portal.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of data masking policy. Metadata, used for Azure portal.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The location of the data masking policy.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The location of the data masking policy.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * The masking level. This is a legacy parameter and is no longer used.
     * 
     */
    @OutputExport(name="maskingLevel", type=String.class, parameters={})
    private Output<String> maskingLevel;

    /**
     * @return The masking level. This is a legacy parameter and is no longer used.
     * 
     */
    public Output<String> getMaskingLevel() {
        return this.maskingLevel;
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
    public DataMaskingPolicy(String name, DataMaskingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DataMaskingPolicy", name, args == null ? DataMaskingPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DataMaskingPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:sql:DataMaskingPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:sql/v20140401:DataMaskingPolicy").build())
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
    public static DataMaskingPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataMaskingPolicy(name, id, options);
    }
}
