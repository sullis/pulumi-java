// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.DatasetReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Power query sink.
 * 
 */
public final class PowerQuerySinkArgs extends io.pulumi.resources.ResourceArgs {

    public static final PowerQuerySinkArgs Empty = new PowerQuerySinkArgs();

    /**
     * Dataset reference.
     * 
     */
    @InputImport(name="dataset")
    private final @Nullable Input<DatasetReferenceArgs> dataset;

    public Input<DatasetReferenceArgs> getDataset() {
        return this.dataset == null ? Input.empty() : this.dataset;
    }

    /**
     * Transformation description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Flowlet Reference
     * 
     */
    @InputImport(name="flowlet")
    private final @Nullable Input<DataFlowReferenceArgs> flowlet;

    public Input<DataFlowReferenceArgs> getFlowlet() {
        return this.flowlet == null ? Input.empty() : this.flowlet;
    }

    /**
     * Linked service reference.
     * 
     */
    @InputImport(name="linkedService")
    private final @Nullable Input<LinkedServiceReferenceArgs> linkedService;

    public Input<LinkedServiceReferenceArgs> getLinkedService() {
        return this.linkedService == null ? Input.empty() : this.linkedService;
    }

    /**
     * Transformation name.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Schema linked service reference.
     * 
     */
    @InputImport(name="schemaLinkedService")
    private final @Nullable Input<LinkedServiceReferenceArgs> schemaLinkedService;

    public Input<LinkedServiceReferenceArgs> getSchemaLinkedService() {
        return this.schemaLinkedService == null ? Input.empty() : this.schemaLinkedService;
    }

    /**
     * sink script.
     * 
     */
    @InputImport(name="script")
    private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    public PowerQuerySinkArgs(
        @Nullable Input<DatasetReferenceArgs> dataset,
        @Nullable Input<String> description,
        @Nullable Input<DataFlowReferenceArgs> flowlet,
        @Nullable Input<LinkedServiceReferenceArgs> linkedService,
        Input<String> name,
        @Nullable Input<LinkedServiceReferenceArgs> schemaLinkedService,
        @Nullable Input<String> script) {
        this.dataset = dataset;
        this.description = description;
        this.flowlet = flowlet;
        this.linkedService = linkedService;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schemaLinkedService = schemaLinkedService;
        this.script = script;
    }

    private PowerQuerySinkArgs() {
        this.dataset = Input.empty();
        this.description = Input.empty();
        this.flowlet = Input.empty();
        this.linkedService = Input.empty();
        this.name = Input.empty();
        this.schemaLinkedService = Input.empty();
        this.script = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PowerQuerySinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DatasetReferenceArgs> dataset;
        private @Nullable Input<String> description;
        private @Nullable Input<DataFlowReferenceArgs> flowlet;
        private @Nullable Input<LinkedServiceReferenceArgs> linkedService;
        private Input<String> name;
        private @Nullable Input<LinkedServiceReferenceArgs> schemaLinkedService;
        private @Nullable Input<String> script;

        public Builder() {
    	      // Empty
        }

        public Builder(PowerQuerySinkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.description = defaults.description;
    	      this.flowlet = defaults.flowlet;
    	      this.linkedService = defaults.linkedService;
    	      this.name = defaults.name;
    	      this.schemaLinkedService = defaults.schemaLinkedService;
    	      this.script = defaults.script;
        }

        public Builder setDataset(@Nullable Input<DatasetReferenceArgs> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder setDataset(@Nullable DatasetReferenceArgs dataset) {
            this.dataset = Input.ofNullable(dataset);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFlowlet(@Nullable Input<DataFlowReferenceArgs> flowlet) {
            this.flowlet = flowlet;
            return this;
        }

        public Builder setFlowlet(@Nullable DataFlowReferenceArgs flowlet) {
            this.flowlet = Input.ofNullable(flowlet);
            return this;
        }

        public Builder setLinkedService(@Nullable Input<LinkedServiceReferenceArgs> linkedService) {
            this.linkedService = linkedService;
            return this;
        }

        public Builder setLinkedService(@Nullable LinkedServiceReferenceArgs linkedService) {
            this.linkedService = Input.ofNullable(linkedService);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSchemaLinkedService(@Nullable Input<LinkedServiceReferenceArgs> schemaLinkedService) {
            this.schemaLinkedService = schemaLinkedService;
            return this;
        }

        public Builder setSchemaLinkedService(@Nullable LinkedServiceReferenceArgs schemaLinkedService) {
            this.schemaLinkedService = Input.ofNullable(schemaLinkedService);
            return this;
        }

        public Builder setScript(@Nullable Input<String> script) {
            this.script = script;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = Input.ofNullable(script);
            return this;
        }

        public PowerQuerySinkArgs build() {
            return new PowerQuerySinkArgs(dataset, description, flowlet, linkedService, name, schemaLinkedService, script);
        }
    }
}
