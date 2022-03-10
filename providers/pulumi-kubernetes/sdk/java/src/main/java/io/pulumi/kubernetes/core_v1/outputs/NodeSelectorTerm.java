// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeSelectorRequirement;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeSelectorTerm {
    /**
     * A list of node selector requirements by node's labels.
     * 
     */
    private final @Nullable List<NodeSelectorRequirement> matchExpressions;
    /**
     * A list of node selector requirements by node's fields.
     * 
     */
    private final @Nullable List<NodeSelectorRequirement> matchFields;

    @OutputCustomType.Constructor
    private NodeSelectorTerm(
        @OutputCustomType.Parameter("matchExpressions") @Nullable List<NodeSelectorRequirement> matchExpressions,
        @OutputCustomType.Parameter("matchFields") @Nullable List<NodeSelectorRequirement> matchFields) {
        this.matchExpressions = matchExpressions;
        this.matchFields = matchFields;
    }

    /**
     * A list of node selector requirements by node's labels.
     * 
    */
    public List<NodeSelectorRequirement> getMatchExpressions() {
        return this.matchExpressions == null ? List.of() : this.matchExpressions;
    }
    /**
     * A list of node selector requirements by node's fields.
     * 
    */
    public List<NodeSelectorRequirement> getMatchFields() {
        return this.matchFields == null ? List.of() : this.matchFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelectorTerm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NodeSelectorRequirement> matchExpressions;
        private @Nullable List<NodeSelectorRequirement> matchFields;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSelectorTerm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchExpressions = defaults.matchExpressions;
    	      this.matchFields = defaults.matchFields;
        }

        public Builder setMatchExpressions(@Nullable List<NodeSelectorRequirement> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        public Builder setMatchFields(@Nullable List<NodeSelectorRequirement> matchFields) {
            this.matchFields = matchFields;
            return this;
        }
        public NodeSelectorTerm build() {
            return new NodeSelectorTerm(matchExpressions, matchFields);
        }
    }
}
