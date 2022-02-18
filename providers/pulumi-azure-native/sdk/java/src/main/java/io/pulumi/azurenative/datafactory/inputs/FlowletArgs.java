// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DataFlowFolderArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowSinkArgs;
import io.pulumi.azurenative.datafactory.inputs.DataFlowSourceArgs;
import io.pulumi.azurenative.datafactory.inputs.TransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data flow flowlet
 * 
 */
public final class FlowletArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowletArgs Empty = new FlowletArgs();

    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    @InputImport(name="annotations")
    private final @Nullable Input<List<Object>> annotations;

    public Input<List<Object>> getAnnotations() {
        return this.annotations == null ? Input.empty() : this.annotations;
    }

    /**
     * The description of the data flow.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    @InputImport(name="folder")
    private final @Nullable Input<DataFlowFolderArgs> folder;

    public Input<DataFlowFolderArgs> getFolder() {
        return this.folder == null ? Input.empty() : this.folder;
    }

    /**
     * Flowlet script.
     * 
     */
    @InputImport(name="script")
    private final @Nullable Input<String> script;

    public Input<String> getScript() {
        return this.script == null ? Input.empty() : this.script;
    }

    /**
     * Flowlet script lines.
     * 
     */
    @InputImport(name="scriptLines")
    private final @Nullable Input<List<String>> scriptLines;

    public Input<List<String>> getScriptLines() {
        return this.scriptLines == null ? Input.empty() : this.scriptLines;
    }

    /**
     * List of sinks in Flowlet.
     * 
     */
    @InputImport(name="sinks")
    private final @Nullable Input<List<DataFlowSinkArgs>> sinks;

    public Input<List<DataFlowSinkArgs>> getSinks() {
        return this.sinks == null ? Input.empty() : this.sinks;
    }

    /**
     * List of sources in Flowlet.
     * 
     */
    @InputImport(name="sources")
    private final @Nullable Input<List<DataFlowSourceArgs>> sources;

    public Input<List<DataFlowSourceArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    /**
     * List of transformations in Flowlet.
     * 
     */
    @InputImport(name="transformations")
    private final @Nullable Input<List<TransformationArgs>> transformations;

    public Input<List<TransformationArgs>> getTransformations() {
        return this.transformations == null ? Input.empty() : this.transformations;
    }

    /**
     * Type of data flow.
     * Expected value is 'Flowlet'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public FlowletArgs(
        @Nullable Input<List<Object>> annotations,
        @Nullable Input<String> description,
        @Nullable Input<DataFlowFolderArgs> folder,
        @Nullable Input<String> script,
        @Nullable Input<List<String>> scriptLines,
        @Nullable Input<List<DataFlowSinkArgs>> sinks,
        @Nullable Input<List<DataFlowSourceArgs>> sources,
        @Nullable Input<List<TransformationArgs>> transformations,
        Input<String> type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FlowletArgs() {
        this.annotations = Input.empty();
        this.description = Input.empty();
        this.folder = Input.empty();
        this.script = Input.empty();
        this.scriptLines = Input.empty();
        this.sinks = Input.empty();
        this.sources = Input.empty();
        this.transformations = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowletArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Object>> annotations;
        private @Nullable Input<String> description;
        private @Nullable Input<DataFlowFolderArgs> folder;
        private @Nullable Input<String> script;
        private @Nullable Input<List<String>> scriptLines;
        private @Nullable Input<List<DataFlowSinkArgs>> sinks;
        private @Nullable Input<List<DataFlowSourceArgs>> sources;
        private @Nullable Input<List<TransformationArgs>> transformations;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowletArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.scriptLines = defaults.scriptLines;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.transformations = defaults.transformations;
    	      this.type = defaults.type;
        }

        public Builder setAnnotations(@Nullable Input<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = Input.ofNullable(annotations);
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

        public Builder setFolder(@Nullable Input<DataFlowFolderArgs> folder) {
            this.folder = folder;
            return this;
        }

        public Builder setFolder(@Nullable DataFlowFolderArgs folder) {
            this.folder = Input.ofNullable(folder);
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

        public Builder setScriptLines(@Nullable Input<List<String>> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }

        public Builder setScriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = Input.ofNullable(scriptLines);
            return this;
        }

        public Builder setSinks(@Nullable Input<List<DataFlowSinkArgs>> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder setSinks(@Nullable List<DataFlowSinkArgs> sinks) {
            this.sinks = Input.ofNullable(sinks);
            return this;
        }

        public Builder setSources(@Nullable Input<List<DataFlowSourceArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<DataFlowSourceArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public Builder setTransformations(@Nullable Input<List<TransformationArgs>> transformations) {
            this.transformations = transformations;
            return this;
        }

        public Builder setTransformations(@Nullable List<TransformationArgs> transformations) {
            this.transformations = Input.ofNullable(transformations);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public FlowletArgs build() {
            return new FlowletArgs(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
