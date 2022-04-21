// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Batch inference settings per deployment.
 * 
 */
public final class BatchDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final BatchDeploymentArgs Empty = new BatchDeploymentArgs();

    /**
     * Description of the endpoint deployment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * ARM resource ID of the environment specification for the endpoint deployment.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * Environment variables configuration for the deployment.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Error threshold, if the error count for the entire input goes above this value,
     * the batch inference will be aborted. Range is [-1, int.MaxValue].
     * For FileDataset, this value is the count of file failures.
     * For TabularDataset, this value is the count of record failures.
     * If set to -1 (the lower bound), all failures during batch inference will be ignored.
     * 
     */
    @Import(name="errorThreshold")
    private @Nullable Output<Integer> errorThreshold;

    public Optional<Output<Integer>> errorThreshold() {
        return Optional.ofNullable(this.errorThreshold);
    }

    /**
     * Size of the mini-batch passed to each batch invocation.
     * For FileDataset, this is the number of files per mini-batch.
     * For TabularDataset, this is the size of the records in bytes, per mini-batch.
     * 
     */
    @Import(name="miniBatchSize")
    private @Nullable Output<Double> miniBatchSize;

    public Optional<Output<Double>> miniBatchSize() {
        return Optional.ofNullable(this.miniBatchSize);
    }

    /**
     * Partition keys list used for Named partitioning.
     * 
     */
    @Import(name="partitionKeys")
    private @Nullable Output<List<String>> partitionKeys;

    public Optional<Output<List<String>>> partitionKeys() {
        return Optional.ofNullable(this.partitionKeys);
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private BatchDeploymentArgs() {}

    private BatchDeploymentArgs(BatchDeploymentArgs $) {
        this.description = $.description;
        this.environmentId = $.environmentId;
        this.environmentVariables = $.environmentVariables;
        this.errorThreshold = $.errorThreshold;
        this.miniBatchSize = $.miniBatchSize;
        this.partitionKeys = $.partitionKeys;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BatchDeploymentArgs $;

        public Builder() {
            $ = new BatchDeploymentArgs();
        }

        public Builder(BatchDeploymentArgs defaults) {
            $ = new BatchDeploymentArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder errorThreshold(@Nullable Output<Integer> errorThreshold) {
            $.errorThreshold = errorThreshold;
            return this;
        }

        public Builder errorThreshold(Integer errorThreshold) {
            return errorThreshold(Output.of(errorThreshold));
        }

        public Builder miniBatchSize(@Nullable Output<Double> miniBatchSize) {
            $.miniBatchSize = miniBatchSize;
            return this;
        }

        public Builder miniBatchSize(Double miniBatchSize) {
            return miniBatchSize(Output.of(miniBatchSize));
        }

        public Builder partitionKeys(@Nullable Output<List<String>> partitionKeys) {
            $.partitionKeys = partitionKeys;
            return this;
        }

        public Builder partitionKeys(List<String> partitionKeys) {
            return partitionKeys(Output.of(partitionKeys));
        }

        public Builder partitionKeys(String... partitionKeys) {
            return partitionKeys(List.of(partitionKeys));
        }

        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        public BatchDeploymentArgs build() {
            return $;
        }
    }

}
