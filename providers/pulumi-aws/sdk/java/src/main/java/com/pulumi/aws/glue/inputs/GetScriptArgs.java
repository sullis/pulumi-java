// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.GetScriptDagEdge;
import com.pulumi.aws.glue.inputs.GetScriptDagNode;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetScriptArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScriptArgs Empty = new GetScriptArgs();

    /**
     * A list of the edges in the DAG. Defined below.
     * 
     */
    @Import(name="dagEdges", required=true)
    private List<GetScriptDagEdge> dagEdges;

    /**
     * @return A list of the edges in the DAG. Defined below.
     * 
     */
    public List<GetScriptDagEdge> dagEdges() {
        return this.dagEdges;
    }

    /**
     * A list of the nodes in the DAG. Defined below.
     * 
     */
    @Import(name="dagNodes", required=true)
    private List<GetScriptDagNode> dagNodes;

    /**
     * @return A list of the nodes in the DAG. Defined below.
     * 
     */
    public List<GetScriptDagNode> dagNodes() {
        return this.dagNodes;
    }

    /**
     * The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
     * 
     */
    @Import(name="language")
    private @Nullable String language;

    /**
     * @return The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
     * 
     */
    public Optional<String> language() {
        return Optional.ofNullable(this.language);
    }

    private GetScriptArgs() {}

    private GetScriptArgs(GetScriptArgs $) {
        this.dagEdges = $.dagEdges;
        this.dagNodes = $.dagNodes;
        this.language = $.language;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptArgs $;

        public Builder() {
            $ = new GetScriptArgs();
        }

        public Builder(GetScriptArgs defaults) {
            $ = new GetScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dagEdges A list of the edges in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagEdges(List<GetScriptDagEdge> dagEdges) {
            $.dagEdges = dagEdges;
            return this;
        }

        /**
         * @param dagEdges A list of the edges in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagEdges(GetScriptDagEdge... dagEdges) {
            return dagEdges(List.of(dagEdges));
        }

        /**
         * @param dagNodes A list of the nodes in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagNodes(List<GetScriptDagNode> dagNodes) {
            $.dagNodes = dagNodes;
            return this;
        }

        /**
         * @param dagNodes A list of the nodes in the DAG. Defined below.
         * 
         * @return builder
         * 
         */
        public Builder dagNodes(GetScriptDagNode... dagNodes) {
            return dagNodes(List.of(dagNodes));
        }

        /**
         * @param language The programming language of the resulting code from the DAG. Defaults to `PYTHON`. Valid values are `PYTHON` and `SCALA`.
         * 
         * @return builder
         * 
         */
        public Builder language(@Nullable String language) {
            $.language = language;
            return this;
        }

        public GetScriptArgs build() {
            $.dagEdges = Objects.requireNonNull($.dagEdges, "expected parameter 'dagEdges' to be non-null");
            $.dagNodes = Objects.requireNonNull($.dagNodes, "expected parameter 'dagNodes' to be non-null");
            return $;
        }
    }

}
