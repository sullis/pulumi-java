// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Toleration {
    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    private final @Nullable String effect;
    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    private final @Nullable String key;
    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * Possible enum values:
     *  - `"Equal"`
     *  - `"Exists"`
     * 
     */
    private final @Nullable String operator;
    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    private final @Nullable Integer tolerationSeconds;
    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"effect","key","operator","tolerationSeconds","value"})
    private Toleration(
        @Nullable String effect,
        @Nullable String key,
        @Nullable String operator,
        @Nullable Integer tolerationSeconds,
        @Nullable String value) {
        this.effect = effect;
        this.key = key;
        this.operator = operator;
        this.tolerationSeconds = tolerationSeconds;
        this.value = value;
    }

    /**
     * Effect indicates the taint effect to match. Empty means match all taint effects. When specified, allowed values are NoSchedule, PreferNoSchedule and NoExecute.
     * 
     * Possible enum values:
     *  - `"NoExecute"` Evict any already-running pods that do not tolerate the taint. Currently enforced by NodeController.
     *  - `"NoSchedule"` Do not allow new pods to schedule onto the node unless they tolerate the taint, but allow all pods submitted to Kubelet without going through the scheduler to start, and allow all already-running pods to continue running. Enforced by the scheduler.
     *  - `"PreferNoSchedule"` Like TaintEffectNoSchedule, but the scheduler tries not to schedule new pods onto the node, rather than prohibiting new pods from scheduling onto the node entirely. Enforced by the scheduler.
     * 
     */
    public Optional<String> getEffect() {
        return Optional.ofNullable(this.effect);
    }
    /**
     * Key is the taint key that the toleration applies to. Empty means match all taint keys. If the key is empty, operator must be Exists; this combination means to match all values and all keys.
     * 
     */
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }
    /**
     * Operator represents a key's relationship to the value. Valid operators are Exists and Equal. Defaults to Equal. Exists is equivalent to wildcard for value, so that a pod can tolerate all taints of a particular category.
     * 
     * Possible enum values:
     *  - `"Equal"`
     *  - `"Exists"`
     * 
     */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * TolerationSeconds represents the period of time the toleration (which must be of effect NoExecute, otherwise this field is ignored) tolerates the taint. By default, it is not set, which means tolerate the taint forever (do not evict). Zero and negative values will be treated as 0 (evict immediately) by the system.
     * 
     */
    public Optional<Integer> getTolerationSeconds() {
        return Optional.ofNullable(this.tolerationSeconds);
    }
    /**
     * Value is the taint value the toleration matches to. If the operator is Exists, the value should be empty, otherwise just a regular string.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Toleration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String effect;
        private @Nullable String key;
        private @Nullable String operator;
        private @Nullable Integer tolerationSeconds;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(Toleration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.tolerationSeconds = defaults.tolerationSeconds;
    	      this.value = defaults.value;
        }

        public Builder setEffect(@Nullable String effect) {
            this.effect = effect;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public Builder setOperator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder setTolerationSeconds(@Nullable Integer tolerationSeconds) {
            this.tolerationSeconds = tolerationSeconds;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public Toleration build() {
            return new Toleration(effect, key, operator, tolerationSeconds, value);
        }
    }
}
