// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.databrew.JobArgs;
import io.pulumi.awsnative.databrew.enums.JobEncryptionMode;
import io.pulumi.awsnative.databrew.enums.JobLogSubscription;
import io.pulumi.awsnative.databrew.enums.JobType;
import io.pulumi.awsnative.databrew.outputs.JobDataCatalogOutput;
import io.pulumi.awsnative.databrew.outputs.JobDatabaseOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutputLocation;
import io.pulumi.awsnative.databrew.outputs.JobProfileConfiguration;
import io.pulumi.awsnative.databrew.outputs.JobRecipe;
import io.pulumi.awsnative.databrew.outputs.JobSample;
import io.pulumi.awsnative.databrew.outputs.JobTag;
import io.pulumi.awsnative.databrew.outputs.JobValidationConfiguration;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:databrew:Job")
public class Job extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dataCatalogOutputs", type=List.class, parameters={JobDataCatalogOutput.class})
    private Output</* @Nullable */ List<JobDataCatalogOutput>> dataCatalogOutputs;

    public Output</* @Nullable */ List<JobDataCatalogOutput>> getDataCatalogOutputs() {
        return this.dataCatalogOutputs;
    }
    @OutputExport(name="databaseOutputs", type=List.class, parameters={JobDatabaseOutput.class})
    private Output</* @Nullable */ List<JobDatabaseOutput>> databaseOutputs;

    public Output</* @Nullable */ List<JobDatabaseOutput>> getDatabaseOutputs() {
        return this.databaseOutputs;
    }
    @OutputExport(name="datasetName", type=String.class, parameters={})
    private Output</* @Nullable */ String> datasetName;

    public Output</* @Nullable */ String> getDatasetName() {
        return this.datasetName;
    }
    @OutputExport(name="encryptionKeyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> encryptionKeyArn;

    public Output</* @Nullable */ String> getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }
    @OutputExport(name="encryptionMode", type=JobEncryptionMode.class, parameters={})
    private Output</* @Nullable */ JobEncryptionMode> encryptionMode;

    public Output</* @Nullable */ JobEncryptionMode> getEncryptionMode() {
        return this.encryptionMode;
    }
    @OutputExport(name="jobSample", type=JobSample.class, parameters={})
    private Output</* @Nullable */ JobSample> jobSample;

    public Output</* @Nullable */ JobSample> getJobSample() {
        return this.jobSample;
    }
    @OutputExport(name="logSubscription", type=JobLogSubscription.class, parameters={})
    private Output</* @Nullable */ JobLogSubscription> logSubscription;

    public Output</* @Nullable */ JobLogSubscription> getLogSubscription() {
        return this.logSubscription;
    }
    @OutputExport(name="maxCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxCapacity;

    public Output</* @Nullable */ Integer> getMaxCapacity() {
        return this.maxCapacity;
    }
    @OutputExport(name="maxRetries", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxRetries;

    public Output</* @Nullable */ Integer> getMaxRetries() {
        return this.maxRetries;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="outputLocation", type=JobOutputLocation.class, parameters={})
    private Output</* @Nullable */ JobOutputLocation> outputLocation;

    public Output</* @Nullable */ JobOutputLocation> getOutputLocation() {
        return this.outputLocation;
    }
    @OutputExport(name="outputs", type=List.class, parameters={JobOutput.class})
    private Output</* @Nullable */ List<JobOutput>> outputs;

    public Output</* @Nullable */ List<JobOutput>> getOutputs() {
        return this.outputs;
    }
    @OutputExport(name="profileConfiguration", type=JobProfileConfiguration.class, parameters={})
    private Output</* @Nullable */ JobProfileConfiguration> profileConfiguration;

    public Output</* @Nullable */ JobProfileConfiguration> getProfileConfiguration() {
        return this.profileConfiguration;
    }
    @OutputExport(name="projectName", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectName;

    public Output</* @Nullable */ String> getProjectName() {
        return this.projectName;
    }
    @OutputExport(name="recipe", type=JobRecipe.class, parameters={})
    private Output</* @Nullable */ JobRecipe> recipe;

    public Output</* @Nullable */ JobRecipe> getRecipe() {
        return this.recipe;
    }
    @OutputExport(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }
    @OutputExport(name="tags", type=List.class, parameters={JobTag.class})
    private Output</* @Nullable */ List<JobTag>> tags;

    public Output</* @Nullable */ List<JobTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="timeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeout;

    public Output</* @Nullable */ Integer> getTimeout() {
        return this.timeout;
    }
    @OutputExport(name="type", type=JobType.class, parameters={})
    private Output<JobType> type;

    public Output<JobType> getType() {
        return this.type;
    }
    @OutputExport(name="validationConfigurations", type=List.class, parameters={JobValidationConfiguration.class})
    private Output</* @Nullable */ List<JobValidationConfiguration>> validationConfigurations;

    public Output</* @Nullable */ List<JobValidationConfiguration>> getValidationConfigurations() {
        return this.validationConfigurations;
    }

    public Job(String name, JobArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Job(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:databrew:Job", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Job get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
