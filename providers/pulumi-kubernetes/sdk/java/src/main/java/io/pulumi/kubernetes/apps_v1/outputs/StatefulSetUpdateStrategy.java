// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apps_v1.outputs.RollingUpdateStatefulSetStrategy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StatefulSetUpdateStrategy {
    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    private final @Nullable RollingUpdateStatefulSetStrategy rollingUpdate;
    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet's currentRevision.
     *  - `"RollingUpdate"` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private StatefulSetUpdateStrategy(
        @OutputCustomType.Parameter("rollingUpdate") @Nullable RollingUpdateStatefulSetStrategy rollingUpdate,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
    */
    public Optional<RollingUpdateStatefulSetStrategy> getRollingUpdate() {
        return Optional.ofNullable(this.rollingUpdate);
    }
    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` triggers the legacy behavior. Version tracking and ordered rolling restarts are disabled. Pods are recreated from the StatefulSetSpec when they are manually deleted. When a scale operation is performed with this strategy,specification version indicated by the StatefulSet's currentRevision.
     *  - `"RollingUpdate"` indicates that update will be applied to all Pods in the StatefulSet with respect to the StatefulSet ordering constraints. When a scale operation is performed with this strategy, new Pods will be created from the specification version indicated by the StatefulSet's updateRevision.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RollingUpdateStatefulSetStrategy rollingUpdate;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder setRollingUpdate(@Nullable RollingUpdateStatefulSetStrategy rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public StatefulSetUpdateStrategy build() {
            return new StatefulSetUpdateStrategy(rollingUpdate, type);
        }
    }
}
