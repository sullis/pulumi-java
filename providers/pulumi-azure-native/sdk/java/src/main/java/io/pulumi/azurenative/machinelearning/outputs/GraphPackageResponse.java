// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.azurenative.machinelearning.outputs.GraphEdgeResponse;
import io.pulumi.azurenative.machinelearning.outputs.GraphNodeResponse;
import io.pulumi.azurenative.machinelearning.outputs.GraphParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GraphPackageResponse {
    /**
     * The list of edges making up the graph.
     * 
     */
    private final @Nullable List<GraphEdgeResponse> edges;
    /**
     * The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    private final @Nullable Map<String,GraphParameterResponse> graphParameters;
    /**
     * The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    private final @Nullable Map<String,GraphNodeResponse> nodes;

    @OutputCustomType.Constructor({"edges","graphParameters","nodes"})
    private GraphPackageResponse(
        @Nullable List<GraphEdgeResponse> edges,
        @Nullable Map<String,GraphParameterResponse> graphParameters,
        @Nullable Map<String,GraphNodeResponse> nodes) {
        this.edges = edges;
        this.graphParameters = graphParameters;
        this.nodes = nodes;
    }

    /**
     * The list of edges making up the graph.
     * 
     */
    public List<GraphEdgeResponse> getEdges() {
        return this.edges == null ? List.of() : this.edges;
    }
    /**
     * The collection of global parameters for the graph, given as a global parameter name to GraphParameter map. Each parameter here has a 1:1 match with the global parameters values map declared at the WebServiceProperties level.
     * 
     */
    public Map<String,GraphParameterResponse> getGraphParameters() {
        return this.graphParameters == null ? Map.of() : this.graphParameters;
    }
    /**
     * The set of nodes making up the graph, provided as a nodeId to GraphNode map
     * 
     */
    public Map<String,GraphNodeResponse> getNodes() {
        return this.nodes == null ? Map.of() : this.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GraphPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GraphEdgeResponse> edges;
        private @Nullable Map<String,GraphParameterResponse> graphParameters;
        private @Nullable Map<String,GraphNodeResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(GraphPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.edges = defaults.edges;
    	      this.graphParameters = defaults.graphParameters;
    	      this.nodes = defaults.nodes;
        }

        public Builder setEdges(@Nullable List<GraphEdgeResponse> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setGraphParameters(@Nullable Map<String,GraphParameterResponse> graphParameters) {
            this.graphParameters = graphParameters;
            return this;
        }

        public Builder setNodes(@Nullable Map<String,GraphNodeResponse> nodes) {
            this.nodes = nodes;
            return this;
        }

        public GraphPackageResponse build() {
            return new GraphPackageResponse(edges, graphParameters, nodes);
        }
    }
}
