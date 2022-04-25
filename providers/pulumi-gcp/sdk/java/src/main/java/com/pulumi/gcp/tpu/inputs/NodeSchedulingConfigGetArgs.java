// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tpu.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class NodeSchedulingConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodeSchedulingConfigGetArgs Empty = new NodeSchedulingConfigGetArgs();

    /**
     * Defines whether the TPU instance is preemptible.
     * 
     */
    @Import(name="preemptible", required=true)
    private Output<Boolean> preemptible;

    /**
     * @return Defines whether the TPU instance is preemptible.
     * 
     */
    public Output<Boolean> preemptible() {
        return this.preemptible;
    }

    private NodeSchedulingConfigGetArgs() {}

    private NodeSchedulingConfigGetArgs(NodeSchedulingConfigGetArgs $) {
        this.preemptible = $.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodeSchedulingConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodeSchedulingConfigGetArgs $;

        public Builder() {
            $ = new NodeSchedulingConfigGetArgs();
        }

        public Builder(NodeSchedulingConfigGetArgs defaults) {
            $ = new NodeSchedulingConfigGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preemptible Defines whether the TPU instance is preemptible.
         * 
         * @return builder
         * 
         */
        public Builder preemptible(Output<Boolean> preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        /**
         * @param preemptible Defines whether the TPU instance is preemptible.
         * 
         * @return builder
         * 
         */
        public Builder preemptible(Boolean preemptible) {
            return preemptible(Output.of(preemptible));
        }

        public NodeSchedulingConfigGetArgs build() {
            $.preemptible = Objects.requireNonNull($.preemptible, "expected parameter 'preemptible' to be non-null");
            return $;
        }
    }

}
