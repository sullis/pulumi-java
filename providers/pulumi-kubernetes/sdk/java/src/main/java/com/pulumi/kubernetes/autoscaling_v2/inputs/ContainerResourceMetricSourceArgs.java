// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling_v2.inputs.MetricTargetArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the &#34;pods&#34; source.  Only one &#34;target&#34; type should be set.
 * 
 */
public final class ContainerResourceMetricSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricSourceArgs Empty = new ContainerResourceMetricSourceArgs();

    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    @Import(name="container", required=true)
    private Output<String> container;

    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    public Output<String> container() {
        return this.container;
    }

    /**
     * name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return name is the name of the resource in question.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target", required=true)
    private Output<MetricTargetArgs> target;

    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public Output<MetricTargetArgs> target() {
        return this.target;
    }

    private ContainerResourceMetricSourceArgs() {}

    private ContainerResourceMetricSourceArgs(ContainerResourceMetricSourceArgs $) {
        this.container = $.container;
        this.name = $.name;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerResourceMetricSourceArgs $;

        public Builder() {
            $ = new ContainerResourceMetricSourceArgs();
        }

        public Builder(ContainerResourceMetricSourceArgs defaults) {
            $ = new ContainerResourceMetricSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param container container is the name of the container in the pods of the scaling target
         * 
         * @return builder
         * 
         */
        public Builder container(Output<String> container) {
            $.container = container;
            return this;
        }

        /**
         * @param container container is the name of the container in the pods of the scaling target
         * 
         * @return builder
         * 
         */
        public Builder container(String container) {
            return container(Output.of(container));
        }

        /**
         * @param name name is the name of the resource in question.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name is the name of the resource in question.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(Output<MetricTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target target specifies the target value for the given metric
         * 
         * @return builder
         * 
         */
        public Builder target(MetricTargetArgs target) {
            return target(Output.of(target));
        }

        public ContainerResourceMetricSourceArgs build() {
            $.container = Objects.requireNonNull($.container, "expected parameter 'container' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
