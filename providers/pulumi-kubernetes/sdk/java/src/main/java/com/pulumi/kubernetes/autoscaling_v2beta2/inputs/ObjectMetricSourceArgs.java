// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.CrossVersionObjectReferenceArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import com.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectMetricSourceArgs Empty = new ObjectMetricSourceArgs();

    @Import(name="describedObject", required=true)
    private Output<CrossVersionObjectReferenceArgs> describedObject;

    public Output<CrossVersionObjectReferenceArgs> describedObject() {
        return this.describedObject;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
    private Output<MetricIdentifierArgs> metric;

    /**
     * @return metric identifies the target metric by name and selector
     * 
     */
    public Output<MetricIdentifierArgs> metric() {
        return this.metric;
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

    private ObjectMetricSourceArgs() {}

    private ObjectMetricSourceArgs(ObjectMetricSourceArgs $) {
        this.describedObject = $.describedObject;
        this.metric = $.metric;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectMetricSourceArgs $;

        public Builder() {
            $ = new ObjectMetricSourceArgs();
        }

        public Builder(ObjectMetricSourceArgs defaults) {
            $ = new ObjectMetricSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder describedObject(Output<CrossVersionObjectReferenceArgs> describedObject) {
            $.describedObject = describedObject;
            return this;
        }

        public Builder describedObject(CrossVersionObjectReferenceArgs describedObject) {
            return describedObject(Output.of(describedObject));
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(Output<MetricIdentifierArgs> metric) {
            $.metric = metric;
            return this;
        }

        /**
         * @param metric metric identifies the target metric by name and selector
         * 
         * @return builder
         * 
         */
        public Builder metric(MetricIdentifierArgs metric) {
            return metric(Output.of(metric));
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

        public ObjectMetricSourceArgs build() {
            $.describedObject = Objects.requireNonNull($.describedObject, "expected parameter 'describedObject' to be non-null");
            $.metric = Objects.requireNonNull($.metric, "expected parameter 'metric' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
