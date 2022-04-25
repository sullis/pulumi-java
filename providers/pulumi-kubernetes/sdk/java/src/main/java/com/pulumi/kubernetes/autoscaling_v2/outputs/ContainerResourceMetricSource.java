// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.autoscaling_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.autoscaling_v2.outputs.MetricTarget;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerResourceMetricSource {
    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    private final String container;
    /**
     * @return name is the name of the resource in question.
     * 
     */
    private final String name;
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    private final MetricTarget target;

    @CustomType.Constructor
    private ContainerResourceMetricSource(
        @CustomType.Parameter("container") String container,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("target") MetricTarget target) {
        this.container = container;
        this.name = name;
        this.target = target;
    }

    /**
     * @return container is the name of the container in the pods of the scaling target
     * 
     */
    public String container() {
        return this.container;
    }
    /**
     * @return name is the name of the resource in question.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return target specifies the target value for the given metric
     * 
     */
    public MetricTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String container;
        private String name;
        private MetricTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder target(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public ContainerResourceMetricSource build() {
            return new ContainerResourceMetricSource(container, name, target);
        }
    }
}
