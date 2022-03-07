// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Taint {
    /**
     * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    private final String effect;
    /**
     * Required. The taint key to be applied to a node.
     * 
     */
    private final String key;
    /**
     * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
     * 
     */
    private final @Nullable String timeAdded;
    /**
     * The taint value corresponding to the taint key.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"effect","key","timeAdded","value"})
    private Taint(
        String effect,
        String key,
        @Nullable String timeAdded,
        @Nullable String value) {
        this.effect = Objects.requireNonNull(effect);
        this.key = Objects.requireNonNull(key);
        this.timeAdded = timeAdded;
        this.value = value;
    }

    /**
     * Required. The effect of the taint on pods that do not tolerate the taint. Valid effects are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
    */
    public String getEffect() {
        return this.effect;
    }
    /**
     * Required. The taint key to be applied to a node.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * TimeAdded represents the time at which the taint was added. It is only written for NoExecute taints.
     * 
    */
    public Optional<String> getTimeAdded() {
        return Optional.ofNullable(this.timeAdded);
    }
    /**
     * The taint value corresponding to the taint key.
     * 
    */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Taint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private @Nullable String timeAdded;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(Taint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.timeAdded = defaults.timeAdded;
    	      this.value = defaults.value;
        }

        public Builder setEffect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setTimeAdded(@Nullable String timeAdded) {
            this.timeAdded = timeAdded;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }
        public Taint build() {
            return new Taint(effect, key, timeAdded, value);
        }
    }
}