// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetricSourceArgs Empty = new ObjectMetricSourceArgs();

    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    @InputImport(name="describedObject", required=true)
    private final Input<CrossVersionObjectReferenceArgs> describedObject;

    public Input<CrossVersionObjectReferenceArgs> getDescribedObject() {
        return this.describedObject;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @InputImport(name="metric", required=true)
    private final Input<MetricIdentifierArgs> metric;

    public Input<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<MetricTargetArgs> target;

    public Input<MetricTargetArgs> getTarget() {
        return this.target;
    }

    public ObjectMetricSourceArgs(
        Input<CrossVersionObjectReferenceArgs> describedObject,
        Input<MetricIdentifierArgs> metric,
        Input<MetricTargetArgs> target) {
        this.describedObject = Objects.requireNonNull(describedObject, "expected parameter 'describedObject' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ObjectMetricSourceArgs() {
        this.describedObject = Input.empty();
        this.metric = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CrossVersionObjectReferenceArgs> describedObject;
        private Input<MetricIdentifierArgs> metric;
        private Input<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder setDescribedObject(Input<CrossVersionObjectReferenceArgs> describedObject) {
            this.describedObject = Objects.requireNonNull(describedObject);
            return this;
        }

        public Builder setDescribedObject(CrossVersionObjectReferenceArgs describedObject) {
            this.describedObject = Input.of(Objects.requireNonNull(describedObject));
            return this;
        }

        public Builder setMetric(Input<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(MetricIdentifierArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder setTarget(Input<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(MetricTargetArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }

        public ObjectMetricSourceArgs build() {
            return new ObjectMetricSourceArgs(describedObject, metric, target);
        }
    }
}
