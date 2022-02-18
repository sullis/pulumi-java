// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.enums.DatasetType;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestParametersArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestRegistrationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetCreateRequestTimeSeriesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineLearningDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineLearningDatasetArgs Empty = new MachineLearningDatasetArgs();

    /**
     * The Dataset name.
     * 
     */
    @InputImport(name="datasetName")
    private final @Nullable Input<String> datasetName;

    public Input<String> getDatasetName() {
        return this.datasetName == null ? Input.empty() : this.datasetName;
    }

    /**
     * Specifies dataset type.
     * 
     */
    @InputImport(name="datasetType", required=true)
    private final Input<Either<String,DatasetType>> datasetType;

    public Input<Either<String,DatasetType>> getDatasetType() {
        return this.datasetType;
    }

    @InputImport(name="parameters", required=true)
    private final Input<DatasetCreateRequestParametersArgs> parameters;

    public Input<DatasetCreateRequestParametersArgs> getParameters() {
        return this.parameters;
    }

    @InputImport(name="registration", required=true)
    private final Input<DatasetCreateRequestRegistrationArgs> registration;

    public Input<DatasetCreateRequestRegistrationArgs> getRegistration() {
        return this.registration;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Skip validation that ensures data can be loaded from the dataset before registration.
     * 
     */
    @InputImport(name="skipValidation")
    private final @Nullable Input<Boolean> skipValidation;

    public Input<Boolean> getSkipValidation() {
        return this.skipValidation == null ? Input.empty() : this.skipValidation;
    }

    @InputImport(name="timeSeries")
    private final @Nullable Input<DatasetCreateRequestTimeSeriesArgs> timeSeries;

    public Input<DatasetCreateRequestTimeSeriesArgs> getTimeSeries() {
        return this.timeSeries == null ? Input.empty() : this.timeSeries;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public MachineLearningDatasetArgs(
        @Nullable Input<String> datasetName,
        Input<Either<String,DatasetType>> datasetType,
        Input<DatasetCreateRequestParametersArgs> parameters,
        Input<DatasetCreateRequestRegistrationArgs> registration,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> skipValidation,
        @Nullable Input<DatasetCreateRequestTimeSeriesArgs> timeSeries,
        Input<String> workspaceName) {
        this.datasetName = datasetName;
        this.datasetType = Objects.requireNonNull(datasetType, "expected parameter 'datasetType' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.registration = Objects.requireNonNull(registration, "expected parameter 'registration' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.skipValidation = skipValidation == null ? Input.ofNullable(false) : skipValidation;
        this.timeSeries = timeSeries;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private MachineLearningDatasetArgs() {
        this.datasetName = Input.empty();
        this.datasetType = Input.empty();
        this.parameters = Input.empty();
        this.registration = Input.empty();
        this.resourceGroupName = Input.empty();
        this.skipValidation = Input.empty();
        this.timeSeries = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineLearningDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datasetName;
        private Input<Either<String,DatasetType>> datasetType;
        private Input<DatasetCreateRequestParametersArgs> parameters;
        private Input<DatasetCreateRequestRegistrationArgs> registration;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> skipValidation;
        private @Nullable Input<DatasetCreateRequestTimeSeriesArgs> timeSeries;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineLearningDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
    	      this.datasetType = defaults.datasetType;
    	      this.parameters = defaults.parameters;
    	      this.registration = defaults.registration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.skipValidation = defaults.skipValidation;
    	      this.timeSeries = defaults.timeSeries;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setDatasetName(@Nullable Input<String> datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        public Builder setDatasetName(@Nullable String datasetName) {
            this.datasetName = Input.ofNullable(datasetName);
            return this;
        }

        public Builder setDatasetType(Input<Either<String,DatasetType>> datasetType) {
            this.datasetType = Objects.requireNonNull(datasetType);
            return this;
        }

        public Builder setDatasetType(Either<String,DatasetType> datasetType) {
            this.datasetType = Input.of(Objects.requireNonNull(datasetType));
            return this;
        }

        public Builder setParameters(Input<DatasetCreateRequestParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(DatasetCreateRequestParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder setRegistration(Input<DatasetCreateRequestRegistrationArgs> registration) {
            this.registration = Objects.requireNonNull(registration);
            return this;
        }

        public Builder setRegistration(DatasetCreateRequestRegistrationArgs registration) {
            this.registration = Input.of(Objects.requireNonNull(registration));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSkipValidation(@Nullable Input<Boolean> skipValidation) {
            this.skipValidation = skipValidation;
            return this;
        }

        public Builder setSkipValidation(@Nullable Boolean skipValidation) {
            this.skipValidation = Input.ofNullable(skipValidation);
            return this;
        }

        public Builder setTimeSeries(@Nullable Input<DatasetCreateRequestTimeSeriesArgs> timeSeries) {
            this.timeSeries = timeSeries;
            return this;
        }

        public Builder setTimeSeries(@Nullable DatasetCreateRequestTimeSeriesArgs timeSeries) {
            this.timeSeries = Input.ofNullable(timeSeries);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public MachineLearningDatasetArgs build() {
            return new MachineLearningDatasetArgs(datasetName, datasetType, parameters, registration, resourceGroupName, skipValidation, timeSeries, workspaceName);
        }
    }
}
