// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricValueStatusArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public final class ContainerResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricStatusArgs Empty = new ContainerResourceMetricStatusArgs();

    /**
     * Container is the name of the container in the pods of the scaling target
     * 
     */
    @Import(name="container", required=true)
      private final Output<String> container;

    public Output<String> getContainer() {
        return this.container;
    }

    /**
     * current contains the current value for the given metric
     * 
     */
    @Import(name="current", required=true)
      private final Output<MetricValueStatusArgs> current;

    public Output<MetricValueStatusArgs> getCurrent() {
        return this.current;
    }

    /**
     * Name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ContainerResourceMetricStatusArgs(
        Output<String> container,
        Output<MetricValueStatusArgs> current,
        Output<String> name) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ContainerResourceMetricStatusArgs() {
        this.container = Output.empty();
        this.current = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> container;
        private Output<MetricValueStatusArgs> current;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder container(Output<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder container(String container) {
            this.container = Output.of(Objects.requireNonNull(container));
            return this;
        }
        public Builder current(Output<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }
        public Builder current(MetricValueStatusArgs current) {
            this.current = Output.of(Objects.requireNonNull(current));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ContainerResourceMetricStatusArgs build() {
            return new ContainerResourceMetricStatusArgs(container, current, name);
        }
    }
}
