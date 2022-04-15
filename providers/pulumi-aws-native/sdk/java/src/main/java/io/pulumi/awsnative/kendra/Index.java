// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.kendra.IndexArgs;
import io.pulumi.awsnative.kendra.enums.IndexEdition;
import io.pulumi.awsnative.kendra.enums.IndexUserContextPolicy;
import io.pulumi.awsnative.kendra.outputs.IndexCapacityUnitsConfiguration;
import io.pulumi.awsnative.kendra.outputs.IndexDocumentMetadataConfiguration;
import io.pulumi.awsnative.kendra.outputs.IndexServerSideEncryptionConfiguration;
import io.pulumi.awsnative.kendra.outputs.IndexTag;
import io.pulumi.awsnative.kendra.outputs.IndexUserTokenConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Kendra index
 * 
 */
@ResourceType(type="aws-native:kendra:Index")
public class Index extends io.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Capacity units
     * 
     */
    @Export(name="capacityUnits", type=IndexCapacityUnitsConfiguration.class, parameters={})
    private Output</* @Nullable */ IndexCapacityUnitsConfiguration> capacityUnits;

    /**
     * @return Capacity units
     * 
     */
    public Output</* @Nullable */ IndexCapacityUnitsConfiguration> capacityUnits() {
        return this.capacityUnits;
    }
    /**
     * A description for the index
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the index
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Document metadata configurations
     * 
     */
    @Export(name="documentMetadataConfigurations", type=List.class, parameters={IndexDocumentMetadataConfiguration.class})
    private Output</* @Nullable */ List<IndexDocumentMetadataConfiguration>> documentMetadataConfigurations;

    /**
     * @return Document metadata configurations
     * 
     */
    public Output</* @Nullable */ List<IndexDocumentMetadataConfiguration>> documentMetadataConfigurations() {
        return this.documentMetadataConfigurations;
    }
    @Export(name="edition", type=IndexEdition.class, parameters={})
    private Output<IndexEdition> edition;

    public Output<IndexEdition> edition() {
        return this.edition;
    }
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Server side encryption configuration
     * 
     */
    @Export(name="serverSideEncryptionConfiguration", type=IndexServerSideEncryptionConfiguration.class, parameters={})
    private Output</* @Nullable */ IndexServerSideEncryptionConfiguration> serverSideEncryptionConfiguration;

    /**
     * @return Server side encryption configuration
     * 
     */
    public Output</* @Nullable */ IndexServerSideEncryptionConfiguration> serverSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }
    /**
     * Tags for labeling the index
     * 
     */
    @Export(name="tags", type=List.class, parameters={IndexTag.class})
    private Output</* @Nullable */ List<IndexTag>> tags;

    /**
     * @return Tags for labeling the index
     * 
     */
    public Output</* @Nullable */ List<IndexTag>> tags() {
        return this.tags;
    }
    @Export(name="userContextPolicy", type=IndexUserContextPolicy.class, parameters={})
    private Output</* @Nullable */ IndexUserContextPolicy> userContextPolicy;

    public Output</* @Nullable */ IndexUserContextPolicy> userContextPolicy() {
        return this.userContextPolicy;
    }
    @Export(name="userTokenConfigurations", type=List.class, parameters={IndexUserTokenConfiguration.class})
    private Output</* @Nullable */ List<IndexUserTokenConfiguration>> userTokenConfigurations;

    public Output</* @Nullable */ List<IndexUserTokenConfiguration>> userTokenConfigurations() {
        return this.userTokenConfigurations;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Index(String name) {
        this(name, IndexArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Index(String name, IndexArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Index(String name, IndexArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:Index", name, args == null ? IndexArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Index(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:kendra:Index", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Index get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Index(name, id, options);
    }
}
