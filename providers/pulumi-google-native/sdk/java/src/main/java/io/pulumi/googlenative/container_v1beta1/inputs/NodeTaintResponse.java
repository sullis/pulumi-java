// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Kubernetes taint is comprised of three fields: key, value, and effect. Effect can only be one of three types: NoSchedule, PreferNoSchedule or NoExecute. See [here](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration) for more information, including usage and the valid values.
 * 
 */
public final class NodeTaintResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeTaintResponse Empty = new NodeTaintResponse();

    /**
     * Effect for taint.
     * 
     */
    @Import(name="effect", required=true)
      private final String effect;

    public String getEffect() {
        return this.effect;
    }

    /**
     * Key for taint.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * Value for taint.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public NodeTaintResponse(
        String effect,
        String key,
        String value) {
        this.effect = Objects.requireNonNull(effect, "expected parameter 'effect' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private NodeTaintResponse() {
        this.effect = null;
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTaintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTaintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder effect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public NodeTaintResponse build() {
            return new NodeTaintResponse(effect, key, value);
        }
    }
}
