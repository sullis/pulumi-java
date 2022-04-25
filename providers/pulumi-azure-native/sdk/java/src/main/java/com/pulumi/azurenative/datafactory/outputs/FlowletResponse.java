// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import com.pulumi.azurenative.datafactory.outputs.DataFlowSinkResponse;
import com.pulumi.azurenative.datafactory.outputs.DataFlowSourceResponse;
import com.pulumi.azurenative.datafactory.outputs.TransformationResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowletResponse {
    /**
     * @return List of tags that can be used for describing the data flow.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * @return The description of the data flow.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    private final @Nullable DataFlowResponseFolder folder;
    /**
     * @return Flowlet script.
     * 
     */
    private final @Nullable String script;
    /**
     * @return Flowlet script lines.
     * 
     */
    private final @Nullable List<String> scriptLines;
    /**
     * @return List of sinks in Flowlet.
     * 
     */
    private final @Nullable List<DataFlowSinkResponse> sinks;
    /**
     * @return List of sources in Flowlet.
     * 
     */
    private final @Nullable List<DataFlowSourceResponse> sources;
    /**
     * @return List of transformations in Flowlet.
     * 
     */
    private final @Nullable List<TransformationResponse> transformations;
    /**
     * @return Type of data flow.
     * Expected value is &#39;Flowlet&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private FlowletResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folder") @Nullable DataFlowResponseFolder folder,
        @CustomType.Parameter("script") @Nullable String script,
        @CustomType.Parameter("scriptLines") @Nullable List<String> scriptLines,
        @CustomType.Parameter("sinks") @Nullable List<DataFlowSinkResponse> sinks,
        @CustomType.Parameter("sources") @Nullable List<DataFlowSourceResponse> sources,
        @CustomType.Parameter("transformations") @Nullable List<TransformationResponse> transformations,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = type;
    }

    /**
     * @return List of tags that can be used for describing the data flow.
     * 
     */
    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * @return The description of the data flow.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    public Optional<DataFlowResponseFolder> folder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * @return Flowlet script.
     * 
     */
    public Optional<String> script() {
        return Optional.ofNullable(this.script);
    }
    /**
     * @return Flowlet script lines.
     * 
     */
    public List<String> scriptLines() {
        return this.scriptLines == null ? List.of() : this.scriptLines;
    }
    /**
     * @return List of sinks in Flowlet.
     * 
     */
    public List<DataFlowSinkResponse> sinks() {
        return this.sinks == null ? List.of() : this.sinks;
    }
    /**
     * @return List of sources in Flowlet.
     * 
     */
    public List<DataFlowSourceResponse> sources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * @return List of transformations in Flowlet.
     * 
     */
    public List<TransformationResponse> transformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }
    /**
     * @return Type of data flow.
     * Expected value is &#39;Flowlet&#39;.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowletResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable DataFlowResponseFolder folder;
        private @Nullable String script;
        private @Nullable List<String> scriptLines;
        private @Nullable List<DataFlowSinkResponse> sinks;
        private @Nullable List<DataFlowSourceResponse> sources;
        private @Nullable List<TransformationResponse> transformations;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowletResponse defaults) {
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

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder folder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }
        public Builder scriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }
        public Builder scriptLines(String... scriptLines) {
            return scriptLines(List.of(scriptLines));
        }
        public Builder sinks(@Nullable List<DataFlowSinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }
        public Builder sinks(DataFlowSinkResponse... sinks) {
            return sinks(List.of(sinks));
        }
        public Builder sources(@Nullable List<DataFlowSourceResponse> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(DataFlowSourceResponse... sources) {
            return sources(List.of(sources));
        }
        public Builder transformations(@Nullable List<TransformationResponse> transformations) {
            this.transformations = transformations;
            return this;
        }
        public Builder transformations(TransformationResponse... transformations) {
            return transformations(List.of(transformations));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public FlowletResponse build() {
            return new FlowletResponse(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
