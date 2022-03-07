// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeInputResponse {
    /**
     * The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
     */
    private final String nodeName;

    @OutputCustomType.Constructor({"nodeName"})
    private NodeInputResponse(String nodeName) {
        this.nodeName = Objects.requireNonNull(nodeName);
    }

    /**
     * The name of the upstream node in the pipeline which output is used as input of the current node.
     * 
    */
    public String getNodeName() {
        return this.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeName = defaults.nodeName;
        }

        public Builder setNodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        public NodeInputResponse build() {
            return new NodeInputResponse(nodeName);
        }
    }
}