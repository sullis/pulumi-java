// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowTaskType;
import io.pulumi.awsnative.appflow.inputs.FlowConnectorOperator;
import io.pulumi.awsnative.appflow.inputs.FlowTaskPropertiesObject;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowTask extends io.pulumi.resources.InvokeArgs {

    public static final FlowTask Empty = new FlowTask();

    @InputImport(name="connectorOperator")
    private final @Nullable FlowConnectorOperator connectorOperator;

    public Optional<FlowConnectorOperator> getConnectorOperator() {
        return this.connectorOperator == null ? Optional.empty() : Optional.ofNullable(this.connectorOperator);
    }

    @InputImport(name="destinationField")
    private final @Nullable String destinationField;

    public Optional<String> getDestinationField() {
        return this.destinationField == null ? Optional.empty() : Optional.ofNullable(this.destinationField);
    }

    @InputImport(name="sourceFields", required=true)
    private final List<String> sourceFields;

    public List<String> getSourceFields() {
        return this.sourceFields;
    }

    @InputImport(name="taskProperties")
    private final @Nullable List<FlowTaskPropertiesObject> taskProperties;

    public List<FlowTaskPropertiesObject> getTaskProperties() {
        return this.taskProperties == null ? List.of() : this.taskProperties;
    }

    @InputImport(name="taskType", required=true)
    private final FlowTaskType taskType;

    public FlowTaskType getTaskType() {
        return this.taskType;
    }

    public FlowTask(
        @Nullable FlowConnectorOperator connectorOperator,
        @Nullable String destinationField,
        List<String> sourceFields,
        @Nullable List<FlowTaskPropertiesObject> taskProperties,
        FlowTaskType taskType) {
        this.connectorOperator = connectorOperator;
        this.destinationField = destinationField;
        this.sourceFields = Objects.requireNonNull(sourceFields, "expected parameter 'sourceFields' to be non-null");
        this.taskProperties = taskProperties;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private FlowTask() {
        this.connectorOperator = null;
        this.destinationField = null;
        this.sourceFields = List.of();
        this.taskProperties = List.of();
        this.taskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowConnectorOperator connectorOperator;
        private @Nullable String destinationField;
        private List<String> sourceFields;
        private @Nullable List<FlowTaskPropertiesObject> taskProperties;
        private FlowTaskType taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorOperator = defaults.connectorOperator;
    	      this.destinationField = defaults.destinationField;
    	      this.sourceFields = defaults.sourceFields;
    	      this.taskProperties = defaults.taskProperties;
    	      this.taskType = defaults.taskType;
        }

        public Builder setConnectorOperator(@Nullable FlowConnectorOperator connectorOperator) {
            this.connectorOperator = connectorOperator;
            return this;
        }

        public Builder setDestinationField(@Nullable String destinationField) {
            this.destinationField = destinationField;
            return this;
        }

        public Builder setSourceFields(List<String> sourceFields) {
            this.sourceFields = Objects.requireNonNull(sourceFields);
            return this;
        }

        public Builder setTaskProperties(@Nullable List<FlowTaskPropertiesObject> taskProperties) {
            this.taskProperties = taskProperties;
            return this;
        }

        public Builder setTaskType(FlowTaskType taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public FlowTask build() {
            return new FlowTask(connectorOperator, destinationField, sourceFields, taskProperties, taskType);
        }
    }
}
