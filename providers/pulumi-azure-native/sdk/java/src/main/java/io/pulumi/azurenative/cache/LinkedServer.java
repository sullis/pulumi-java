// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cache.LinkedServerArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Response to put/get linked server (with properties) for Redis cache.
 * API Version: 2020-06-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:cache:LinkedServer cache2 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Cache/Redis/cache1/linkedServers/cache2 
 * ```
 * 
 */
@ResourceType(type="azure-native:cache:LinkedServer")
public class LinkedServer extends io.pulumi.resources.CustomResource {
    /**
     * Fully qualified resourceId of the linked redis cache.
     * 
     */
    @OutputExport(name="linkedRedisCacheId", type=String.class, parameters={})
    private Output<String> linkedRedisCacheId;

    /**
     * @return Fully qualified resourceId of the linked redis cache.
     * 
     */
    public Output<String> getLinkedRedisCacheId() {
        return this.linkedRedisCacheId;
    }
    /**
     * Location of the linked redis cache.
     * 
     */
    @OutputExport(name="linkedRedisCacheLocation", type=String.class, parameters={})
    private Output<String> linkedRedisCacheLocation;

    /**
     * @return Location of the linked redis cache.
     * 
     */
    public Output<String> getLinkedRedisCacheLocation() {
        return this.linkedRedisCacheLocation;
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
     * Terminal state of the link between primary and secondary redis cache.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Terminal state of the link between primary and secondary redis cache.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Role of the linked server.
     * 
     */
    @OutputExport(name="serverRole", type=String.class, parameters={})
    private Output<String> serverRole;

    /**
     * @return Role of the linked server.
     * 
     */
    public Output<String> getServerRole() {
        return this.serverRole;
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

    public interface BuilderApplicator {
        public void apply(LinkedServerArgs.Builder a);
    }
    private static io.pulumi.azurenative.cache.LinkedServerArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.cache.LinkedServerArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LinkedServer(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServer(String name) {
        this(name, LinkedServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServer(String name, LinkedServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServer(String name, LinkedServerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:LinkedServer", name, args == null ? LinkedServerArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private LinkedServer(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:cache:LinkedServer", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:cache/v20170201:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20171001:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20180301:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20190701:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20200601:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20201201:LinkedServer").build()),
                Input.of(Alias.builder().setType("azure-native:cache/v20210601:LinkedServer").build())
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
    public static LinkedServer get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServer(name, id, options);
    }
}