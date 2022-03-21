// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Status of Arc agent for a particular node in HCI Cluster.
 * 
 */
public final class PerNodeStateResponse extends io.pulumi.resources.InvokeArgs {

    public static final PerNodeStateResponse Empty = new PerNodeStateResponse();

    /**
     * Fully qualified resource ID for the Arc agent of this node.
     * 
     */
    @Import(name="arcInstance", required=true)
      private final String arcInstance;

    public String getArcInstance() {
        return this.arcInstance;
    }

    /**
     * Name of the Node in HCI Cluster
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * State of Arc agent in this node.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public PerNodeStateResponse(
        String arcInstance,
        String name,
        String state) {
        this.arcInstance = Objects.requireNonNull(arcInstance, "expected parameter 'arcInstance' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private PerNodeStateResponse() {
        this.arcInstance = null;
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerNodeStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arcInstance;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(PerNodeStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arcInstance = defaults.arcInstance;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder arcInstance(String arcInstance) {
            this.arcInstance = Objects.requireNonNull(arcInstance);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public PerNodeStateResponse build() {
            return new PerNodeStateResponse(arcInstance, name, state);
        }
    }
}
