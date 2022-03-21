// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.MetricValueStatus;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerResourceMetricStatus {
    /**
     * Container is the name of the container in the pods of the scaling target
     * 
     */
    private final String container;
    /**
     * current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * Name is the name of the resource in question.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private ContainerResourceMetricStatus(
        @CustomType.Parameter("container") String container,
        @CustomType.Parameter("current") MetricValueStatus current,
        @CustomType.Parameter("name") String name) {
        this.container = container;
        this.current = current;
        this.name = name;
    }

    /**
     * Container is the name of the container in the pods of the scaling target
     * 
    */
    public String getContainer() {
        return this.container;
    }
    /**
     * current contains the current value for the given metric
     * 
    */
    public MetricValueStatus getCurrent() {
        return this.current;
    }
    /**
     * Name is the name of the resource in question.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private MetricValueStatus current;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder current(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ContainerResourceMetricStatus build() {
            return new ContainerResourceMetricStatus(container, current, name);
        }
    }
}
