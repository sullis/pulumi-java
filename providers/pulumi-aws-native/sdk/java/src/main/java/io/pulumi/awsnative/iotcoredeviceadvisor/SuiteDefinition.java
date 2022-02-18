// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iotcoredeviceadvisor.SuiteDefinitionArgs;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionConfigurationProperties;
import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotcoredeviceadvisor:SuiteDefinition")
public class SuiteDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource name for the suite definition.
     * 
     */
    @OutputExport(name="suiteDefinitionArn", type=String.class, parameters={})
    private Output<String> suiteDefinitionArn;

    /**
     * @return The Amazon Resource name for the suite definition.
     * 
     */
    public Output<String> getSuiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }
    @OutputExport(name="suiteDefinitionConfiguration", type=SuiteDefinitionConfigurationProperties.class, parameters={})
    private Output<SuiteDefinitionConfigurationProperties> suiteDefinitionConfiguration;

    public Output<SuiteDefinitionConfigurationProperties> getSuiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }
    /**
     * The unique identifier for the suite definition.
     * 
     */
    @OutputExport(name="suiteDefinitionId", type=String.class, parameters={})
    private Output<String> suiteDefinitionId;

    /**
     * @return The unique identifier for the suite definition.
     * 
     */
    public Output<String> getSuiteDefinitionId() {
        return this.suiteDefinitionId;
    }
    /**
     * The suite definition version of a test suite.
     * 
     */
    @OutputExport(name="suiteDefinitionVersion", type=String.class, parameters={})
    private Output<String> suiteDefinitionVersion;

    /**
     * @return The suite definition version of a test suite.
     * 
     */
    public Output<String> getSuiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={SuiteDefinitionTag.class})
    private Output</* @Nullable */ List<SuiteDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<SuiteDefinitionTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SuiteDefinition(String name, SuiteDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, args == null ? SuiteDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SuiteDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static SuiteDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SuiteDefinition(name, id, options);
    }
}
