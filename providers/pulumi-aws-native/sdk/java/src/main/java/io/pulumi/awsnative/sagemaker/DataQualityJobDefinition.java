// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sagemaker.DataQualityJobDefinitionArgs;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityAppSpecification;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityBaselineConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionDataQualityJobInput;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionMonitoringOutputConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionMonitoringResources;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionNetworkConfig;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionStoppingCondition;
import io.pulumi.awsnative.sagemaker.outputs.DataQualityJobDefinitionTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::SageMaker::DataQualityJobDefinition
 * 
 */
@ResourceType(type="aws-native:sagemaker:DataQualityJobDefinition")
public class DataQualityJobDefinition extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the job definition was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time at which the job definition was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    @Export(name="dataQualityAppSpecification", type=DataQualityJobDefinitionDataQualityAppSpecification.class, parameters={})
    private Output<DataQualityJobDefinitionDataQualityAppSpecification> dataQualityAppSpecification;

    public Output<DataQualityJobDefinitionDataQualityAppSpecification> dataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }
    @Export(name="dataQualityBaselineConfig", type=DataQualityJobDefinitionDataQualityBaselineConfig.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionDataQualityBaselineConfig> dataQualityBaselineConfig;

    public Output</* @Nullable */ DataQualityJobDefinitionDataQualityBaselineConfig> dataQualityBaselineConfig() {
        return this.dataQualityBaselineConfig;
    }
    @Export(name="dataQualityJobInput", type=DataQualityJobDefinitionDataQualityJobInput.class, parameters={})
    private Output<DataQualityJobDefinitionDataQualityJobInput> dataQualityJobInput;

    public Output<DataQualityJobDefinitionDataQualityJobInput> dataQualityJobInput() {
        return this.dataQualityJobInput;
    }
    @Export(name="dataQualityJobOutputConfig", type=DataQualityJobDefinitionMonitoringOutputConfig.class, parameters={})
    private Output<DataQualityJobDefinitionMonitoringOutputConfig> dataQualityJobOutputConfig;

    public Output<DataQualityJobDefinitionMonitoringOutputConfig> dataQualityJobOutputConfig() {
        return this.dataQualityJobOutputConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of job definition.
     * 
     */
    @Export(name="jobDefinitionArn", type=String.class, parameters={})
    private Output<String> jobDefinitionArn;

    /**
     * @return The Amazon Resource Name (ARN) of job definition.
     * 
     */
    public Output<String> jobDefinitionArn() {
        return this.jobDefinitionArn;
    }
    @Export(name="jobDefinitionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> jobDefinitionName;

    public Output</* @Nullable */ String> jobDefinitionName() {
        return this.jobDefinitionName;
    }
    @Export(name="jobResources", type=DataQualityJobDefinitionMonitoringResources.class, parameters={})
    private Output<DataQualityJobDefinitionMonitoringResources> jobResources;

    public Output<DataQualityJobDefinitionMonitoringResources> jobResources() {
        return this.jobResources;
    }
    @Export(name="networkConfig", type=DataQualityJobDefinitionNetworkConfig.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionNetworkConfig> networkConfig;

    public Output</* @Nullable */ DataQualityJobDefinitionNetworkConfig> networkConfig() {
        return this.networkConfig;
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    @Export(name="stoppingCondition", type=DataQualityJobDefinitionStoppingCondition.class, parameters={})
    private Output</* @Nullable */ DataQualityJobDefinitionStoppingCondition> stoppingCondition;

    public Output</* @Nullable */ DataQualityJobDefinitionStoppingCondition> stoppingCondition() {
        return this.stoppingCondition;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataQualityJobDefinitionTag.class})
    private Output</* @Nullable */ List<DataQualityJobDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output</* @Nullable */ List<DataQualityJobDefinitionTag>> tags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataQualityJobDefinition(String name) {
        this(name, DataQualityJobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DataQualityJobDefinition", name, args == null ? DataQualityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataQualityJobDefinition(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sagemaker:DataQualityJobDefinition", name, null, makeResourceOptions(options, id));
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
    public static DataQualityJobDefinition get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataQualityJobDefinition(name, id, options);
    }
}
