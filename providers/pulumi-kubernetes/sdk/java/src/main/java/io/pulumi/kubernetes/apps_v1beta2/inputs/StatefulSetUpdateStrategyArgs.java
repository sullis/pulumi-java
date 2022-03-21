// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apps_v1beta2.inputs.RollingUpdateStatefulSetStrategyArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * StatefulSetUpdateStrategy indicates the strategy that the StatefulSet controller will use to perform updates. It includes any additional parameters necessary to perform the update for the indicated strategy.
 * 
 */
public final class StatefulSetUpdateStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatefulSetUpdateStrategyArgs Empty = new StatefulSetUpdateStrategyArgs();

    /**
     * RollingUpdate is used to communicate parameters when Type is RollingUpdateStatefulSetStrategyType.
     * 
     */
    @Import(name="rollingUpdate")
      private final @Nullable Output<RollingUpdateStatefulSetStrategyArgs> rollingUpdate;

    public Output<RollingUpdateStatefulSetStrategyArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Output.empty() : this.rollingUpdate;
    }

    /**
     * Type indicates the type of the StatefulSetUpdateStrategy. Default is RollingUpdate.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public StatefulSetUpdateStrategyArgs(
        @Nullable Output<RollingUpdateStatefulSetStrategyArgs> rollingUpdate,
        @Nullable Output<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private StatefulSetUpdateStrategyArgs() {
        this.rollingUpdate = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RollingUpdateStatefulSetStrategyArgs> rollingUpdate;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetUpdateStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable Output<RollingUpdateStatefulSetStrategyArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        public Builder rollingUpdate(@Nullable RollingUpdateStatefulSetStrategyArgs rollingUpdate) {
            this.rollingUpdate = Output.ofNullable(rollingUpdate);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public StatefulSetUpdateStrategyArgs build() {
            return new StatefulSetUpdateStrategyArgs(rollingUpdate, type);
        }
    }
}
