// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.datafactory.LinkedServiceSynapseArgs;
import com.pulumi.azure.datafactory.inputs.LinkedServiceSynapseState;
import com.pulumi.azure.datafactory.outputs.LinkedServiceSynapseKeyVaultPassword;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Linked Service (connection) between Synapse and Azure Data Factory.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleLinkedServiceSynapse = new LinkedServiceSynapse(&#34;exampleLinkedServiceSynapse&#34;, LinkedServiceSynapseArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .connectionString(&#34;Integrated Security=False;Data Source=test;Initial Catalog=test;User ID=test;Password=test&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### With Password In Key Vault
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleKeyVault = new KeyVault(&#34;exampleKeyVault&#34;, KeyVaultArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tenantId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getTenantId()))
 *             .skuName(&#34;standard&#34;)
 *             .build());
 * 
 *         var exampleFactory = new Factory(&#34;exampleFactory&#34;, FactoryArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         var exampleLinkedServiceKeyVault = new LinkedServiceKeyVault(&#34;exampleLinkedServiceKeyVault&#34;, LinkedServiceKeyVaultArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .keyVaultId(exampleKeyVault.getId())
 *             .build());
 * 
 *         var exampleLinkedServiceSynapse = new LinkedServiceSynapse(&#34;exampleLinkedServiceSynapse&#34;, LinkedServiceSynapseArgs.builder()        
 *             .dataFactoryId(exampleFactory.getId())
 *             .connectionString(&#34;Integrated Security=False;Data Source=test;Initial Catalog=test;User ID=test;&#34;)
 *             .keyVaultPassword(LinkedServiceSynapseKeyVaultPassword.builder()
 *                 .linkedServiceName(exampleLinkedServiceKeyVault.getName())
 *                 .secretName(&#34;secret&#34;)
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Data Factory Synapse Linked Service&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:datafactory/linkedServiceSynapse:LinkedServiceSynapse example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/example/providers/Microsoft.DataFactory/factories/example/linkedservices/example
 * ```
 * 
 */
@ResourceType(type="azure:datafactory/linkedServiceSynapse:LinkedServiceSynapse")
public class LinkedServiceSynapse extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Data Factory Linked Service Synapse.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Data Factory Linked Service Synapse.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Data Factory Linked Service Synapse.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Data Factory Linked Service Synapse.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The connection string in which to authenticate with the Synapse.
     * 
     */
    @Export(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    /**
     * @return The connection string in which to authenticate with the Synapse.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    @Export(name="dataFactoryId", type=String.class, parameters={})
    private Output<String> dataFactoryId;

    /**
     * @return The Data Factory ID in which to associate the Linked Service with. Changing this forces a new resource.
     * 
     */
    public Output<String> dataFactoryId() {
        return this.dataFactoryId;
    }
    /**
     * The description for the Data Factory Linked Service Synapse.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Data Factory Linked Service Synapse.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration runtime reference to associate with the Data Factory Linked Service Synapse.
     * 
     */
    @Export(name="integrationRuntimeName", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationRuntimeName;

    /**
     * @return The integration runtime reference to associate with the Data Factory Linked Service Synapse.
     * 
     */
    public Output<Optional<String>> integrationRuntimeName() {
        return Codegen.optional(this.integrationRuntimeName);
    }
    /**
     * A `key_vault_password` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    @Export(name="keyVaultPassword", type=LinkedServiceSynapseKeyVaultPassword.class, parameters={})
    private Output</* @Nullable */ LinkedServiceSynapseKeyVaultPassword> keyVaultPassword;

    /**
     * @return A `key_vault_password` block as defined below. Use this argument to store Synapse password in an existing Key Vault. It needs an existing Key Vault Data Factory Linked Service.
     * 
     */
    public Output<Optional<LinkedServiceSynapseKeyVaultPassword>> keyVaultPassword() {
        return Codegen.optional(this.keyVaultPassword);
    }
    /**
     * Specifies the name of the Data Factory Linked Service Synapse. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Data Factory Linked Service Synapse. Changing this forces a new resource to be created. Must be unique within a data
     * factory. See the [Microsoft documentation](https://docs.microsoft.com/en-us/azure/data-factory/naming-rules) for all restrictions.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Data Factory Linked Service Synapse.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Data Factory Linked Service Synapse.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedServiceSynapse(String name) {
        this(name, LinkedServiceSynapseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedServiceSynapse(String name, LinkedServiceSynapseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedServiceSynapse(String name, LinkedServiceSynapseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceSynapse:LinkedServiceSynapse", name, args == null ? LinkedServiceSynapseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedServiceSynapse(String name, Output<String> id, @Nullable LinkedServiceSynapseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:datafactory/linkedServiceSynapse:LinkedServiceSynapse", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LinkedServiceSynapse get(String name, Output<String> id, @Nullable LinkedServiceSynapseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedServiceSynapse(name, id, state, options);
    }
}
