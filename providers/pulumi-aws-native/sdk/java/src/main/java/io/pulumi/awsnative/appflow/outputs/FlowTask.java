// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowTaskType;
import io.pulumi.awsnative.appflow.outputs.FlowConnectorOperator;
import io.pulumi.awsnative.appflow.outputs.FlowTaskPropertiesObject;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowTask {
    /**
     * Operation to be performed on provided source fields
     * 
     */
    private final @Nullable FlowConnectorOperator connectorOperator;
    /**
     * A field value on which source field should be validated
     * 
     */
    private final @Nullable String destinationField;
    /**
     * Source fields on which particular task will be applied
     * 
     */
    private final List<String> sourceFields;
    /**
     * A Map used to store task related info
     * 
     */
    private final @Nullable List<FlowTaskPropertiesObject> taskProperties;
    /**
     * Type of task
     * 
     */
    private final FlowTaskType taskType;

    @CustomType.Constructor
    private FlowTask(
        @CustomType.Parameter("connectorOperator") @Nullable FlowConnectorOperator connectorOperator,
        @CustomType.Parameter("destinationField") @Nullable String destinationField,
        @CustomType.Parameter("sourceFields") List<String> sourceFields,
        @CustomType.Parameter("taskProperties") @Nullable List<FlowTaskPropertiesObject> taskProperties,
        @CustomType.Parameter("taskType") FlowTaskType taskType) {
        this.connectorOperator = connectorOperator;
        this.destinationField = destinationField;
        this.sourceFields = sourceFields;
        this.taskProperties = taskProperties;
        this.taskType = taskType;
    }

    /**
     * Operation to be performed on provided source fields
     * 
    */
    public Optional<FlowConnectorOperator> connectorOperator() {
        return Optional.ofNullable(this.connectorOperator);
    }
    /**
     * A field value on which source field should be validated
     * 
    */
    public Optional<String> destinationField() {
        return Optional.ofNullable(this.destinationField);
    }
    /**
     * Source fields on which particular task will be applied
     * 
    */
    public List<String> sourceFields() {
        return this.sourceFields;
    }
    /**
     * A Map used to store task related info
     * 
    */
    public List<FlowTaskPropertiesObject> taskProperties() {
        return this.taskProperties == null ? List.of() : this.taskProperties;
    }
    /**
     * Type of task
     * 
    */
    public FlowTaskType taskType() {
        return this.taskType;
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

        public Builder connectorOperator(@Nullable FlowConnectorOperator connectorOperator) {
            this.connectorOperator = connectorOperator;
            return this;
        }
        public Builder destinationField(@Nullable String destinationField) {
            this.destinationField = destinationField;
            return this;
        }
        public Builder sourceFields(List<String> sourceFields) {
            this.sourceFields = Objects.requireNonNull(sourceFields);
            return this;
        }
        public Builder sourceFields(String... sourceFields) {
            return sourceFields(List.of(sourceFields));
        }
        public Builder taskProperties(@Nullable List<FlowTaskPropertiesObject> taskProperties) {
            this.taskProperties = taskProperties;
            return this;
        }
        public Builder taskProperties(FlowTaskPropertiesObject... taskProperties) {
            return taskProperties(List.of(taskProperties));
        }
        public Builder taskType(FlowTaskType taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }        public FlowTask build() {
            return new FlowTask(connectorOperator, destinationField, sourceFields, taskProperties, taskType);
        }
    }
}
