// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodTemplateSpec;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ReplicaSetSpec {
    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    private final @Nullable Integer minReadySeconds;
    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
     */
    private final @Nullable Integer replicas;
    /**
     * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    private final LabelSelector selector;
    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    private final @Nullable PodTemplateSpec template;

    @OutputCustomType.Constructor
    private ReplicaSetSpec(
        @OutputCustomType.Parameter("minReadySeconds") @Nullable Integer minReadySeconds,
        @OutputCustomType.Parameter("replicas") @Nullable Integer replicas,
        @OutputCustomType.Parameter("selector") LabelSelector selector,
        @OutputCustomType.Parameter("template") @Nullable PodTemplateSpec template) {
        this.minReadySeconds = minReadySeconds;
        this.replicas = replicas;
        this.selector = selector;
        this.template = template;
    }

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
    */
    public Optional<Integer> getMinReadySeconds() {
        return Optional.ofNullable(this.minReadySeconds);
    }
    /**
     * Replicas is the number of desired replicas. This is a pointer to distinguish between explicit zero and unspecified. Defaults to 1. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller/#what-is-a-replicationcontroller
     * 
    */
    public Optional<Integer> getReplicas() {
        return Optional.ofNullable(this.replicas);
    }
    /**
     * Selector is a label query over pods that should match the replica count. Label keys and values that must match in order to be controlled by this replica set. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
    */
    public LabelSelector getSelector() {
        return this.selector;
    }
    /**
     * Template is the object that describes the pod that will be created if insufficient replicas are detected. More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
    */
    public Optional<PodTemplateSpec> getTemplate() {
        return Optional.ofNullable(this.template);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer minReadySeconds;
        private @Nullable Integer replicas;
        private LabelSelector selector;
        private @Nullable PodTemplateSpec template;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.replicas = defaults.replicas;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
        }

        public Builder setMinReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder setReplicas(@Nullable Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder setSelector(LabelSelector selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder setTemplate(@Nullable PodTemplateSpec template) {
            this.template = template;
            return this;
        }
        public ReplicaSetSpec build() {
            return new ReplicaSetSpec(minReadySeconds, replicas, selector, template);
        }
    }
}
