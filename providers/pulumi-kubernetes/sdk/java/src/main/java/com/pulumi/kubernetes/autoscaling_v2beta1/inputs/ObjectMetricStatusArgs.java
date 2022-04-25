// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.autoscaling_v2beta1.inputs.CrossVersionObjectReferenceArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectMetricStatusArgs Empty = new ObjectMetricStatusArgs();

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    @Import(name="averageValue")
    private @Nullable Output<String> averageValue;

    /**
     * @return averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public Optional<Output<String>> averageValue() {
        return Optional.ofNullable(this.averageValue);
    }

    /**
     * currentValue is the current value of the metric (as a quantity).
     * 
     */
    @Import(name="currentValue", required=true)
    private Output<String> currentValue;

    /**
     * @return currentValue is the current value of the metric (as a quantity).
     * 
     */
    public Output<String> currentValue() {
        return this.currentValue;
    }

    /**
     * metricName is the name of the metric in question.
     * 
     */
    @Import(name="metricName", required=true)
    private Output<String> metricName;

    /**
     * @return metricName is the name of the metric in question.
     * 
     */
    public Output<String> metricName() {
        return this.metricName;
    }

    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    @Import(name="selector")
    private @Nullable Output<LabelSelectorArgs> selector;

    /**
     * @return selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<Output<LabelSelectorArgs>> selector() {
        return Optional.ofNullable(this.selector);
    }

    /**
     * target is the described Kubernetes object.
     * 
     */
    @Import(name="target", required=true)
    private Output<CrossVersionObjectReferenceArgs> target;

    /**
     * @return target is the described Kubernetes object.
     * 
     */
    public Output<CrossVersionObjectReferenceArgs> target() {
        return this.target;
    }

    private ObjectMetricStatusArgs() {}

    private ObjectMetricStatusArgs(ObjectMetricStatusArgs $) {
        this.averageValue = $.averageValue;
        this.currentValue = $.currentValue;
        this.metricName = $.metricName;
        this.selector = $.selector;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectMetricStatusArgs $;

        public Builder() {
            $ = new ObjectMetricStatusArgs();
        }

        public Builder(ObjectMetricStatusArgs defaults) {
            $ = new ObjectMetricStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param averageValue averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
         * 
         * @return builder
         * 
         */
        public Builder averageValue(@Nullable Output<String> averageValue) {
            $.averageValue = averageValue;
            return this;
        }

        /**
         * @param averageValue averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
         * 
         * @return builder
         * 
         */
        public Builder averageValue(String averageValue) {
            return averageValue(Output.of(averageValue));
        }

        /**
         * @param currentValue currentValue is the current value of the metric (as a quantity).
         * 
         * @return builder
         * 
         */
        public Builder currentValue(Output<String> currentValue) {
            $.currentValue = currentValue;
            return this;
        }

        /**
         * @param currentValue currentValue is the current value of the metric (as a quantity).
         * 
         * @return builder
         * 
         */
        public Builder currentValue(String currentValue) {
            return currentValue(Output.of(currentValue));
        }

        /**
         * @param metricName metricName is the name of the metric in question.
         * 
         * @return builder
         * 
         */
        public Builder metricName(Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        /**
         * @param metricName metricName is the name of the metric in question.
         * 
         * @return builder
         * 
         */
        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(@Nullable Output<LabelSelectorArgs> selector) {
            $.selector = selector;
            return this;
        }

        /**
         * @param selector selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
         * 
         * @return builder
         * 
         */
        public Builder selector(LabelSelectorArgs selector) {
            return selector(Output.of(selector));
        }

        /**
         * @param target target is the described Kubernetes object.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<CrossVersionObjectReferenceArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target target is the described Kubernetes object.
         * 
         * @return builder
         * 
         */
        public Builder target(CrossVersionObjectReferenceArgs target) {
            return target(Output.of(target));
        }

        public ObjectMetricStatusArgs build() {
            $.currentValue = Objects.requireNonNull($.currentValue, "expected parameter 'currentValue' to be non-null");
            $.metricName = Objects.requireNonNull($.metricName, "expected parameter 'metricName' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
