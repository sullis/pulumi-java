// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class FlexibleAppVersionManualScaling {
    /**
     * @return Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = [&#34;manual_scaling&#34;[0].instances]` to prevent drift detection.
     * 
     */
    private final Integer instances;

    @CustomType.Constructor
    private FlexibleAppVersionManualScaling(@CustomType.Parameter("instances") Integer instances) {
        this.instances = instances;
    }

    /**
     * @return Number of instances to assign to the service at the start.
     * **Note:** When managing the number of instances at runtime through the App Engine Admin API or the (now deprecated) Python 2
     * Modules API set_num_instances() you must use `lifecycle.ignore_changes = [&#34;manual_scaling&#34;[0].instances]` to prevent drift detection.
     * 
     */
    public Integer instances() {
        return this.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionManualScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instances;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionManualScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
        }

        public Builder instances(Integer instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }        public FlexibleAppVersionManualScaling build() {
            return new FlexibleAppVersionManualScaling(instances);
        }
    }
}
